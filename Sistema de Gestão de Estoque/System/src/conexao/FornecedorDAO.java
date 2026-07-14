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
import model.MCadFornecedor;

public class FornecedorDAO {

    public void cadastrarFornecedor(MCadFornecedor fornecedor) {
        String sql = "INSERT INTO fornecedores (razaoSocial, apelido, cpfCnpj, telefone, email, cep, endereco, bairro, numero, cidade, pais, uf, desativado) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

        try (Connection conn = DBconexao.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, fornecedor.getRazaoSocial());
            stmt.setString(2, fornecedor.getApelido());
            stmt.setString(3, fornecedor.getCpfCnpj());
            stmt.setString(4, fornecedor.getTelefone());
            stmt.setString(5, fornecedor.getEmail());
            stmt.setString(6, fornecedor.getCep());
            stmt.setString(7, fornecedor.getEndereco());
            stmt.setString(8, fornecedor.getBairro());
            stmt.setString(9, fornecedor.getNumero());
            stmt.setString(10, fornecedor.getCidade());
            stmt.setString(11, fornecedor.getPais());
            stmt.setString(12, fornecedor.getUf());
            stmt.setBoolean(13, fornecedor.getDesativado());

            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Fornecedor cadastrado com sucesso!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar fornecedor: " + e.getMessage());
        }
    }

    public List<MCadFornecedor> buscarFornecedor() {
        Connection con = DBconexao.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<MCadFornecedor> fornecedores = new ArrayList<>();

        try {
            stmt = con.prepareStatement(
                "SELECT idFornecedor, razaoSocial, apelido, cpfCnpj, telefone, email, cep, endereco, bairro, numero, pais, uf, cidade, desativado FROM fornecedores"
            );
            rs = stmt.executeQuery();

            while (rs.next()) {
                MCadFornecedor fornecedor = new MCadFornecedor();

                fornecedor.setIdFornecedor(rs.getInt("idFornecedor"));
                fornecedor.setRazaoSocial(rs.getString("razaoSocial"));
                fornecedor.setApelido(rs.getString("apelido"));
                fornecedor.setCpfCnpj(rs.getString("cpfCnpj"));
                fornecedor.setTelefone(rs.getString("telefone"));
                fornecedor.setEmail(rs.getString("email"));
                fornecedor.setCep(rs.getString("cep"));
                fornecedor.setEndereco(rs.getString("endereco"));
                fornecedor.setBairro(rs.getString("bairro"));
                fornecedor.setNumero(rs.getString("numero"));
                fornecedor.setPais(rs.getString("pais"));
                fornecedor.setUf(rs.getString("uf"));
                fornecedor.setCidade(rs.getString("cidade"));
                fornecedor.setDesativado(rs.getBoolean("desativado"));

                fornecedores.add(fornecedor);
            }

        } catch (SQLException ex) {
            Logger.getLogger(FornecedorDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            DBconexao.closeConnection(con, stmt, rs);
        }

        return fornecedores;
    }

    // Método para carregar os fornecedores para serem usados em movimentação
    public List<MCadFornecedor> buscarFornecedorMov() {
        Connection con = DBconexao.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<MCadFornecedor> fornecedores = new ArrayList<>();

        try {
            stmt = con.prepareStatement(
                "SELECT idFornecedor, razaoSocial, apelido FROM fornecedores"
            );
            rs = stmt.executeQuery();

            while (rs.next()) {
                MCadFornecedor fornecedor = new MCadFornecedor();

                fornecedor.setIdFornecedor(rs.getInt("idFornecedor"));
                fornecedor.setRazaoSocial(rs.getString("razaoSocial"));
                fornecedor.setApelido(rs.getString("apelido"));
                fornecedores.add(fornecedor);
            }
        } catch (SQLException ex) {
            Logger.getLogger(FornecedorDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            DBconexao.closeConnection(con, stmt, rs);
        }
        return fornecedores;
    }

    public void excluirFornecedor(int idFornecedor) {
        String sql = "DELETE FROM fornecedores WHERE idFornecedor = ?";

        Connection con = null;
        PreparedStatement stmt = null;

        try {
            con = DBconexao.getConnection();
            stmt = con.prepareStatement(sql);

            stmt.setInt(1, idFornecedor);

            int rowsAffected = stmt.executeUpdate();

            if (rowsAffected > 0) {
                JOptionPane.showMessageDialog(null, "Fornecedor excluído com sucesso!");
            } else {
                JOptionPane.showMessageDialog(null, "Fornecedor não encontrado ou não foi possível excluir.", "Erro", JOptionPane.ERROR_MESSAGE);
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir fornecedor: " + ex.getMessage());

        } finally {
            DBconexao.closeConnection(con, stmt);
        }
    }

    public void alterarFornecedor(MCadFornecedor fornecedor) {
        String sql = "UPDATE fornecedores SET "
                   + "razaoSocial = ?, apelido = ?, cpfCnpj = ?, telefone = ?, email = ?, "
                   + "cep = ?, endereco = ?, bairro = ?, numero = ?, cidade = ?, pais = ?, uf = ?, desativado = ? "
                   + "WHERE idFornecedor = ?";

        Connection con = null;
        PreparedStatement stmt = null;

        try {
            con = DBconexao.getConnection();
            stmt = con.prepareStatement(sql);

            stmt.setString(1, fornecedor.getRazaoSocial());
            stmt.setString(2, fornecedor.getApelido());
            stmt.setString(3, fornecedor.getCpfCnpj());
            stmt.setString(4, fornecedor.getTelefone());
            stmt.setString(5, fornecedor.getEmail());
            stmt.setString(6, fornecedor.getCep());
            stmt.setString(7, fornecedor.getEndereco());
            stmt.setString(8, fornecedor.getBairro());
            stmt.setString(9, fornecedor.getNumero());
            stmt.setString(10, fornecedor.getCidade());
            stmt.setString(11, fornecedor.getPais());
            stmt.setString(12, fornecedor.getUf());
            stmt.setBoolean(13, fornecedor.getDesativado());
            stmt.setInt(14, fornecedor.getIdFornecedor());

            int rowsAffected = stmt.executeUpdate();

            if (rowsAffected > 0) {
                JOptionPane.showMessageDialog(null, "Fornecedor alterado com sucesso!");
            } else {
                JOptionPane.showMessageDialog(null, "Fornecedor não encontrado ou não foi possível alterar.", "Erro", JOptionPane.ERROR_MESSAGE);
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao alterar fornecedor: " + ex.getMessage());
            Logger.getLogger(FornecedorDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            DBconexao.closeConnection(con, stmt);
        }
    }
}