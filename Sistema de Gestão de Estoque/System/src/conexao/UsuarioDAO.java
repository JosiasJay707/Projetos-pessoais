package conexao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.McadUsuario;

public class UsuarioDAO {

    
    public void cadastrarUsuario(McadUsuario usuario) {
        String sql = "INSERT INTO usuarios (nome, funcao, login, senha, tentativas, bloqueado) VALUES (?, ?, ?, ?, 0, FALSE)";

        try (Connection conn = DBconexao.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, usuario.getNome());
            stmt.setString(2, usuario.getFuncao());
            stmt.setString(3, usuario.getLogin());
            stmt.setString(4, usuario.getSenha());

            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Usuário cadastrado com sucesso!");

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar usuário: " + e.getMessage());
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, e);
        }
    }

    
    public List<McadUsuario> buscarUsuario() {
        List<McadUsuario> usuarios = new ArrayList<>();
        String sql = "SELECT id, nome, login, funcao, senha, tentativas, bloqueado FROM usuarios";

        try (Connection conn = DBconexao.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                McadUsuario usuario = new McadUsuario();
                usuario.setId(rs.getInt("id"));
                usuario.setNome(rs.getString("nome"));
                usuario.setLogin(rs.getString("login"));
                usuario.setFuncao(rs.getString("funcao"));
                usuario.setSenha(rs.getString("senha"));
                
                usuarios.add(usuario);
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao buscar usuários: " + e.getMessage());
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, e);
        }

        return usuarios;
    }

    
    public void alterarUsuario(McadUsuario usuario) {
        String sql = "UPDATE usuarios SET nome = ?, funcao = ?, login = ?, senha = ? WHERE id = ?";

        try (Connection conn = DBconexao.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, usuario.getNome());
            stmt.setString(2, usuario.getFuncao());
            stmt.setString(3, usuario.getLogin());
            stmt.setString(4, usuario.getSenha());
            stmt.setInt(5, usuario.getId());

            int rowsAffected = stmt.executeUpdate();
            if (rowsAffected > 0) {
                JOptionPane.showMessageDialog(null, "Usuário alterado com sucesso!");
            } else {
                JOptionPane.showMessageDialog(null, "Usuário não encontrado ou não foi possível alterar.", "Erro", JOptionPane.ERROR_MESSAGE);
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao alterar usuário: " + e.getMessage());
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, e);
        }
    }

    
    public void excluirUsuario(int id) {
        String sql = "DELETE FROM usuarios WHERE id = ?";

        try (Connection conn = DBconexao.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, id);

            int rowsAffected = stmt.executeUpdate();
            if (rowsAffected > 0) {
                JOptionPane.showMessageDialog(null, "Usuário excluído com sucesso!");
            } else {
                JOptionPane.showMessageDialog(null, "Usuário não encontrado ou não foi possível excluir.", "Erro", JOptionPane.ERROR_MESSAGE);
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir usuário: " + e.getMessage());
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, e);
        }
    }

    
    public McadUsuario autenticar(String login, String senha) {
        String sqlSelect = "SELECT * FROM usuarios WHERE login = ?";
        String sqlIncrementaTentativas = "UPDATE usuarios SET tentativas = tentativas + 1 WHERE login = ?";
        String sqlBloquearUsuario = "UPDATE usuarios SET bloqueado = TRUE WHERE login = ?";
        String sqlZerarTentativas = "UPDATE usuarios SET tentativas = 0 WHERE id = ?";

        try (Connection conn = DBconexao.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sqlSelect)) {

            stmt.setString(1, login);
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                boolean bloqueado = rs.getBoolean("bloqueado");
                int tentativas = rs.getInt("tentativas");
                String senhaBanco = rs.getString("senha");
                String funcao = rs.getString("funcao");

                if (bloqueado) {
                    JOptionPane.showMessageDialog(null, "Usuário bloqueado. Contate o administrador.");
                    return null;
                }
                
                if ("administrador".equalsIgnoreCase(funcao)) {
                    if (senha.equals(senhaBanco)) {
                        return new McadUsuario(
                                rs.getInt("id"),
                                rs.getString("nome"),
                                rs.getString("login"),
                                funcao
                        );
                    } else {
                        JOptionPane.showMessageDialog(null, "Senha incorreta para o administrador.");
                        return null;
                    }       } else {
                }

                if (senha.equals(senhaBanco)) {
                    
                    try (PreparedStatement stmtZerar = conn.prepareStatement(sqlZerarTentativas)) {
                        stmtZerar.setInt(1, rs.getInt("id"));
                        stmtZerar.executeUpdate();
                    }

                    return new McadUsuario(
                        rs.getInt("id"),
                        rs.getString("nome"),
                        rs.getString("login"),
                        funcao
                    );
                } else {
                    
                    try (PreparedStatement stmtInc = conn.prepareStatement(sqlIncrementaTentativas)) {
                        stmtInc.setString(1, login);
                        stmtInc.executeUpdate();
                    }

                    if (tentativas + 1 >= 5) {
                        try (PreparedStatement stmtBloq = conn.prepareStatement(sqlBloquearUsuario)) {
                            stmtBloq.setString(1, login);
                            stmtBloq.executeUpdate();
                        }
                        JOptionPane.showMessageDialog(null, "Usuário bloqueado após 5 tentativas inválidas.");
                    } else {
                        JOptionPane.showMessageDialog(null, "Senha incorreta. Tentativas: " + (tentativas + 1) + "/5");
                    }
                    return null;
                }
            } else {
                JOptionPane.showMessageDialog(null, "Usuário não encontrado.");
                return null;
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro na autenticação: " + e.getMessage());
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, e);
            return null;
        }
    }

    
    public List<McadUsuario> listarUsuariosBloqueados() {
        List<McadUsuario> lista = new ArrayList<>();
        String sql = "SELECT * FROM usuarios WHERE bloqueado = TRUE";

        try (Connection conn = DBconexao.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                McadUsuario u = new McadUsuario(
                    rs.getInt("id"),
                    rs.getString("nome"),
                    rs.getString("login"),
                    rs.getString("funcao")
                );
                lista.add(u);
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao listar usuários bloqueados: " + e.getMessage());
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, e);
        }

        return lista;
    }

    
    public void desbloquearUsuario(int id) {
        String sql = "UPDATE usuarios SET bloqueado = FALSE, tentativas = 0 WHERE id = ?";

        try (Connection conn = DBconexao.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, id);
            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Usuário desbloqueado com sucesso.");

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao desbloquear usuário: " + e.getMessage());
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, e);
        }
    }
    
    
}