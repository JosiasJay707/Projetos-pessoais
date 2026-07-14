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
import model.MCadCliente;

public class ClienteDAO {

    public void cadastrarCliente(MCadCliente cliente) {
         String sql = "INSERT INTO clientes (razaoSocial, apelido, cpfCnpj, telefone, email, cep, endereco, bairro, numero, cidade, desativado) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

        try (Connection conn = DBconexao.getConnection();
              PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, cliente.getRazaoSocial());
            stmt.setString(2, cliente.getApelido());
            stmt.setString(3, cliente.getCpfCnpj());
            stmt.setString(4, cliente.getTelefone());
            stmt.setString(5, cliente.getEmail());
            stmt.setString(6, cliente.getCep()); 
            stmt.setString(7, cliente.getEndereco());
            stmt.setString(8, cliente.getBairro());
            stmt.setString(9, cliente.getNumero()); 
            stmt.setString(10, cliente.getCidade());
            stmt.setBoolean(11, cliente.getDesativado());
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Cliente cadastrado com sucesso!");
        } catch ( Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar cliente: " + e.getMessage());
        }
    }

public List<MCadCliente> buscarCliente() {
    Connection con = DBconexao.getConnection();
    PreparedStatement stmt = null;
    ResultSet rs = null;

    List<MCadCliente> clientes = new ArrayList<>();

    try {
        stmt = con.prepareStatement(
            "SELECT idCliente, razaoSocial, apelido, cpfCnpj, telefone, email, cep, endereco, bairro, numero, pais, uf, cidade, desativado FROM Clientes"
        );
        rs = stmt.executeQuery();

        while (rs.next()) {
            MCadCliente cliente = new MCadCliente();

            cliente.setIdCliente(rs.getInt("idCliente"));
            cliente.setRazaoSocial(rs.getString("razaoSocial"));
            cliente.setApelido(rs.getString("apelido"));
            cliente.setCpfCnpj(rs.getString("cpfCnpj"));
            cliente.setTelefone(rs.getString("telefone"));
            cliente.setEmail(rs.getString("email"));
            cliente.setCep(rs.getString("cep"));
            cliente.setEndereco(rs.getString("endereco"));
            cliente.setBairro(rs.getString("bairro"));
            cliente.setNumero(rs.getString("numero"));
            cliente.setPais(rs.getString("pais"));
            cliente.setUf(rs.getString("uf"));
            cliente.setCidade(rs.getString("cidade"));
            cliente.setDesativado(rs.getBoolean("desativado"));

            clientes.add(cliente);
        }

    } catch (SQLException ex) {
        Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
    } finally {
        DBconexao.closeConnection(con, stmt, rs);
    }

    return clientes;
}

//Metodo para carregar os clientes para serem usados na movimentação de estoque
        public List<MCadCliente> buscarClienteMov(){
                Connection con = DBconexao.getConnection();
                PreparedStatement stmt = null;
                ResultSet rs = null;
                
                List<MCadCliente> Clientes = new ArrayList<>();
               
            try {
                stmt = con.prepareStatement(
                        "SELECT idCliente, razaoSocial, apelido FROM clientes"
                );
                rs = stmt.executeQuery();
                
                while(rs.next()){
                    MCadCliente ConsulCli = new MCadCliente();
                    
                    ConsulCli.setIdCliente(rs.getInt("idCliente"));
                    ConsulCli.setRazaoSocial(rs.getString("razaoSocial"));
                    ConsulCli.setApelido(rs.getString("apelido"));
                    Clientes.add(ConsulCli);
                }
            } catch (SQLException ex) {
        Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
    } finally {
        DBconexao.closeConnection(con, stmt, rs);
    }
            return Clientes;
        }

         public void excluirCliente(int idCliente) {
        String sql = "DELETE FROM clientes WHERE idCliente = ?";

        Connection con = null;
        PreparedStatement stmt = null;

        try {
            con = DBconexao.getConnection();
            stmt = con.prepareStatement(sql);

            stmt.setInt(1, idCliente); 

            int rowsAffected = stmt.executeUpdate(); 

            if (rowsAffected > 0) {
                JOptionPane.showMessageDialog(null, "Cliente excluído com sucesso!");
            } else {
                JOptionPane.showMessageDialog(null, "Cliente não encontrado ou não foi possível excluir.", "Erro", JOptionPane.ERROR_MESSAGE);
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir cliente: " + ex.getMessage());
            
        } finally {
            DBconexao.closeConnection(con, stmt);
        }
    }
         
         public void alterarCliente(MCadCliente cliente) {
        String sql = "UPDATE clientes SET "
                   + "razaoSocial = ?, apelido = ?, cpfCnpj = ?, telefone = ?, email = ?, "
                   + "cep = ?, endereco = ?, bairro = ?, numero = ?, cidade = ? "
                   + "WHERE idCliente = ?";

        Connection con = null;
        PreparedStatement stmt = null;

        try {
            con = DBconexao.getConnection();
            stmt = con.prepareStatement(sql);

            stmt.setString(1, cliente.getRazaoSocial());
            stmt.setString(2, cliente.getApelido());
            stmt.setString(3, cliente.getCpfCnpj());
            stmt.setString(4, cliente.getTelefone());
            stmt.setString(5, cliente.getEmail());
            stmt.setString(6, cliente.getCep());
            stmt.setString(7, cliente.getEndereco());
            stmt.setString(8, cliente.getBairro());
            stmt.setString(9, cliente.getNumero());
            stmt.setString(10, cliente.getCidade());
            stmt.setInt(11, cliente.getIdCliente()); 

            int rowsAffected = stmt.executeUpdate();

            if (rowsAffected > 0) {
                JOptionPane.showMessageDialog(null, "Cliente alterado com sucesso!");
            } else {
                JOptionPane.showMessageDialog(null, "Cliente não encontrado ou não foi possível alterar.", "Erro", JOptionPane.ERROR_MESSAGE);
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao alterar cliente: " + ex.getMessage());
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            DBconexao.closeConnection(con, stmt);
        }
    }
        
}