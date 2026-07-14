package conexao;

import conexao.DBconexao;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.SQLIntegrityConstraintViolationException;
import model.MCadProduto;
import javax.swing.JOptionPane;
import model.MCadCliente;


public class ProdutoDAO {
	
	public void create(MCadProduto CadPro){
		
                Connection con = DBconexao.getConnection();
                PreparedStatement stmt = null;
            try {
                stmt = con.prepareStatement(
                    "INSERT INTO produtos (descricao, refFab, observacoes, categoria, unidade, qtdMin, qtdMax, desativado) "
                  + "VALUES (?, ?, ?, ?, ?, ?, ?, ?)");

                stmt.setString(1, CadPro.getDescricao());
                stmt.setString(2, CadPro.getRefFab());
                stmt.setString(3, CadPro.getObservacoes());
                stmt.setString(4, CadPro.getCategoria());
                stmt.setString(5, CadPro.getUnidade());
                stmt.setInt(6, CadPro.getQtdMin());
                stmt.setInt(7, CadPro.getQtdMax());
                stmt.setBoolean(8, CadPro.getDesativado());
                    
                    stmt.execute();
                JOptionPane.showMessageDialog(null, "Produto cadastrado com sucesso!!!");
            } catch (SQLException ex) {
                Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
            }finally{
                DBconexao.closeConnection(con, stmt);
            }
        }
        
        public List<MCadProduto> buscarProduto(){
                Connection con = DBconexao.getConnection();
                PreparedStatement stmt = null;
                ResultSet rs = null;
                
                List<MCadProduto> produtos = new ArrayList<>();
               
            try {
                stmt = con.prepareStatement(
                        "SELECT id_codproduto, descricao, refFab, observacoes, categoria, unidade, qtdMin, qtdMax, qtdEstoque, desativado FROM produtos"
                );
                rs = stmt.executeQuery();
                
                while(rs.next()){
                    MCadProduto ConsulPro = new MCadProduto();
                    
                    ConsulPro.setCodProduto(rs.getInt("id_codproduto"));
                    ConsulPro.setDescricao(rs.getString("descricao"));
                    ConsulPro.setRefFab(rs.getString("refFab"));
                    ConsulPro.setObservacoes(rs.getString("observacoes"));
                    ConsulPro.setCategoria(rs.getString("categoria"));
                    ConsulPro.setUnidade(rs.getString("unidade"));
                    ConsulPro.setQtdMin(rs.getString("qtdMin"));
                    ConsulPro.setQtdMax(rs.getString("qtdMax"));
                    ConsulPro.setQtdEstoque(rs.getInt("qtdEstoque"));
                    ConsulPro.setDesativado(rs.getBoolean("desativado"));
                    produtos.add(ConsulPro);
                }
                
            } catch (SQLException ex) {
        Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
    } finally {
        DBconexao.closeConnection(con, stmt, rs);
    }
            return produtos;
        }
public void atualizar(MCadProduto CadPro) throws SQLException {
    Connection con = null;
    PreparedStatement stmt = null;

    try {
        con = DBconexao.getConnection();
        stmt = con.prepareStatement(
            "UPDATE produtos SET descricao = ?, refFab = ?, observacoes = ?, categoria = ?, unidade = ?, qtdMin = ?, qtdMax = ?, qtdEstoque = ?, desativado = ? WHERE id_codproduto = ?");

        stmt.setString(1, CadPro.getDescricao());
        stmt.setString(2, CadPro.getRefFab());
        stmt.setString(3, CadPro.getObservacoes());
        stmt.setString(4, CadPro.getCategoria());
        stmt.setString(5, CadPro.getUnidade());
        stmt.setInt(6, CadPro.getQtdMin());
        stmt.setInt(7, CadPro.getQtdMax());
        stmt.setInt(8, CadPro.getQtdEstoque());
        stmt.setBoolean(9, CadPro.getDesativado());
        stmt.setInt(10, CadPro.getCodProduto());

        int rowsUpdated = stmt.executeUpdate();

        if (rowsUpdated == 0) {
            JOptionPane.showMessageDialog(null, "Nenhum produto encontrado com o ID informado.");
        } else {
            JOptionPane.showMessageDialog(null, "Produto atualizado com sucesso!!!");
        }
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Erro ao atualizar: " + ex.getMessage());
        throw ex; // opcional, para propagar a exceção
    } finally {
        DBconexao.closeConnection(con, stmt);
    }
}
     
    public void deletar(MCadProduto CadPro) { //deleta produto com base no id do produto
        Connection con = DBconexao.getConnection();
        PreparedStatement stmt = null;
        try {
            stmt = con.prepareStatement(
                "DELETE FROM produtos WHERE id_codproduto = ?");
            stmt.setInt(1, CadPro.getCodProduto());
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Produto excluido com sucesso!!!");
        } catch (SQLIntegrityConstraintViolationException e) {
            JOptionPane.showMessageDialog(null, "Não é possível excluir o produto porque ele possui movimentação: \n" + e.getMessage());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir " + ex);
        } finally {
            DBconexao.closeConnection(con, stmt);
        }
    }
    
        public List<MCadProduto> consulEstoque(){
                Connection con = DBconexao.getConnection();
                PreparedStatement stmt = null;
                ResultSet rs = null;
                
                List<MCadProduto> produtos = new ArrayList<>();
               
            try {
                stmt = con.prepareStatement(
                        "SELECT id_codproduto, descricao, refFab, qtdEstoque, observacoes, categoria, unidade, qtdMin, qtdMax,localizacao,desativado FROM produtos"
                );
                rs = stmt.executeQuery();
                
                while(rs.next()){
                    MCadProduto ConsulPro = new MCadProduto();
                    
                    ConsulPro.setCodProduto(rs.getInt("id_codproduto"));
                    ConsulPro.setDescricao(rs.getString("descricao"));
                    ConsulPro.setRefFab(rs.getString("refFab"));
                    ConsulPro.setQtdEstoque(rs.getInt("qtdEstoque"));
                    ConsulPro.setObservacoes(rs.getString("observacoes"));
                    ConsulPro.setCategoria(rs.getString("categoria"));
                    ConsulPro.setUnidade(rs.getString("unidade"));
                    ConsulPro.setQtdMin(rs.getString("qtdMin"));
                    ConsulPro.setQtdMax(rs.getString("qtdMax"));
                    ConsulPro.setlocalizacao(rs.getString("localizacao"));
                    ConsulPro.setDesativado(rs.getBoolean("desativado"));
                    produtos.add(ConsulPro);
                }
                
            } catch (SQLException ex) {
        Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
    } finally {
        DBconexao.closeConnection(con, stmt, rs);
    }
            return produtos;
        }
//Metodo para buscar produto para lancar no estoque
public List<MCadProduto> buscarProdutoLancar() {
    Connection con = DBconexao.getConnection();
    PreparedStatement stmt = null;
    ResultSet rs = null;

    List<MCadProduto> produtos = new ArrayList<>();

    try {
        // Seleciona apenas as colunas necessárias e filtra desativados
        stmt = con.prepareStatement(
            "SELECT id_codproduto, descricao, categoria, refFab, qtdMin, qtdMax, qtdEstoque, desativado " +
            "FROM produtos WHERE desativado = false"
        );
        rs = stmt.executeQuery();

        while (rs.next()) {
            MCadProduto produto = new MCadProduto();

            produto.setCodProduto(rs.getInt("id_codproduto"));
            produto.setDescricao(rs.getString("descricao"));
            produto.setCategoria(rs.getString("categoria"));
            produto.setRefFab(rs.getString("refFab"));
            produto.setQtdMin(rs.getString("qtdMin"));
            produto.setQtdMax(rs.getString("qtdMax"));
            produto.setQtdEstoque(rs.getInt("qtdEstoque"));
            produto.setDesativado(rs.getBoolean("desativado"));

            produtos.add(produto);
        }

    } catch (SQLException ex) {
        Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
    } finally {
        DBconexao.closeConnection(con, stmt, rs);
    }

    return produtos;
}

//Metodo para dar movimentar estoque
    public void lancaEstoque(MCadProduto CadPro) {
        Connection con = DBconexao.getConnection();
        PreparedStatement stmt = null;
        try {
            stmt = con.prepareStatement(
                "UPDATE produtos SET qtdEstoque = ? WHERE id_codproduto = ?");

            // Parâmetros corrigidos:
            stmt.setInt(1, CadPro.getQtdEstoque());  // quantidade no estoque
            stmt.setInt(2, CadPro.getCodProduto());  // código do produto

            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Estoque atualizado com sucesso!!!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar: " + ex);
        } finally {
            DBconexao.closeConnection(con, stmt);
        }
    }
   
        
        
}