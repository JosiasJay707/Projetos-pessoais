package conexao;

import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.MCadProduto;
import model.Movimentacao;

public class MovimentacaoDAO {
    
    public void create(Movimentacao mov) {
        Connection con = DBconexao.getConnection();
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement(
                "INSERT INTO Movimentacao (tipoMovimentacao, dataMovimentacao, codProduto, qtdMovimentada, idFornecedor, idCliente, numNFe) " +
                "VALUES (?, ?, ?, ?, ?, ?, ?)");

            stmt.setByte(1, mov.getTipoMovimentacao());
            stmt.setDate(2, new java.sql.Date(mov.getDataMovimentacao().getTime()));
            stmt.setInt(3, mov.getCodProduto());
            stmt.setInt(4, mov.getQtdMovimentada());

            if (mov.getIdFornecedor() != null) {
                stmt.setInt(5, mov.getIdFornecedor());
            } else {
                stmt.setNull(5, java.sql.Types.INTEGER);
            }

            if (mov.getIdCliente() != null) {
                stmt.setInt(6, mov.getIdCliente());
            } else {
                stmt.setNull(6, java.sql.Types.INTEGER);
            }

            stmt.setString(7, mov.getNumNFe());

            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Item lançado no estoque com sucesso!");


        } catch (SQLException ex) {
            Logger.getLogger(MovimentacaoDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            DBconexao.closeConnection(con, stmt);
        }
    }

    
    public List<Movimentacao> listarMovimentacoes() {
        List<Movimentacao> lista = new ArrayList<>();

        String sql = "SELECT * FROM movimentacao";

        try (Connection con = DBconexao.getConnection();
             PreparedStatement stmt = con.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                Movimentacao mov = new Movimentacao();
                mov.setIdMovimentacao(rs.getInt("idMovimentacao"));
                mov.setTipoMovimentacao(rs.getByte("tipoMovimentacao"));
                mov.setDataMovimentacao(rs.getDate("dataMovimentacao"));
                mov.setCodProduto(rs.getInt("codProduto"));
                mov.setQtdMovimentada(rs.getInt("qtdMovimentada"));
                mov.setIdFornecedor(rs.getObject("idFornecedor") != null ? rs.getInt("idFornecedor") : null);
                mov.setIdCliente(rs.getObject("idCliente") != null ? rs.getInt("idCliente") : null);
                mov.setNumNFe(rs.getString("numNFe"));
                mov.setLoginUsuario(rs.getInt("loginUsuario"));

                lista.add(mov);
            }

        } catch (Exception e) {

        }
        return lista;
    }
    
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
        
         public DefaultTableModel carregarTabelaMovimentacoes() {
        String sql = "SELECT " +
                "CASE WHEN MOV.tipoMovimentacao = 1 THEN 'Entrada' " +
                "WHEN MOV.tipoMovimentacao = 2 THEN 'Saída' END AS tipoMov, " +
                "MOV.dataMovimentacao, " +
                "PROD.descricao, " +
                "MOV.qtdMovimentada, " +
                "FORN.razaoSocial AS fornecedorRazaoSocial, " +
                "CLI.razaoSocial AS clienteRazaoSocial, " +
                "MOV.numNFe " +
                "FROM movimentacao AS MOV " +
                "LEFT JOIN produtos AS PROD ON MOV.codProduto = PROD.id_codproduto " +
                "LEFT JOIN clientes AS CLI ON MOV.idCliente = CLI.idCliente " +
                "LEFT JOIN fornecedores AS FORN ON MOV.idFornecedor = FORN.idFornecedor";

        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("Tipo");
        modelo.addColumn("Data");
        modelo.addColumn("Descrição");
        modelo.addColumn("Qtd.mov");
        modelo.addColumn("Fornecedor");
        modelo.addColumn("Cliente");
        modelo.addColumn("NFe");
        

        try (Connection con = DBconexao.getConnection();
             PreparedStatement stmt = con.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {

            
            while (rs.next()) {
                modelo.addRow(new Object[]{
                        rs.getString("tipoMov"),
                        rs.getDate("dataMovimentacao"),
                        rs.getString("descricao"),
                        rs.getInt("qtdMovimentada"),
                        rs.getString("fornecedorRazaoSocial"),
                        rs.getString("clienteRazaoSocial"),
                        rs.getString("numNFe")
                });
            }

        } catch (SQLException ex) {
            
        }

        return modelo;
    }
}


    

