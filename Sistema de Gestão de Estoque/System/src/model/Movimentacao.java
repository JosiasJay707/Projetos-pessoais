package model;

import java.util.Date;

public class Movimentacao {

    private int idMovimentacao;
    private byte tipoMovimentacao;
    private Date dataMovimentacao;
    private int codProduto;
    private int qtdMovimentada;
    private Integer idFornecedor;
    private Integer idCliente;
    private String numNFe;
    private int loginUsuario;


    public Movimentacao() {
    }

    public Movimentacao(byte tipoMovimentacao, Date dataMovimentacao, int codProduto, int qtdMovimentada,
                       Integer idFornecedor, Integer idCliente, String numNFe, int loginUsuario) {
        this.tipoMovimentacao = tipoMovimentacao;
        this.dataMovimentacao = dataMovimentacao;
        this.codProduto = codProduto;
        this.qtdMovimentada = qtdMovimentada;
        this.idFornecedor = idFornecedor;
        this.idCliente = idCliente;
        this.numNFe = numNFe;
        this.loginUsuario = loginUsuario;
    }

    

    public int getIdMovimentacao() {
        return idMovimentacao;
    }

    public void setIdMovimentacao(int idMovimentacao) {
        this.idMovimentacao = idMovimentacao;
    }

    public byte getTipoMovimentacao() {
        return tipoMovimentacao;
    }

    public void setTipoMovimentacao(byte tipoMovimentacao) {
        this.tipoMovimentacao = tipoMovimentacao;
    }

    public Date getDataMovimentacao() {
        return dataMovimentacao;
    }

    public void setDataMovimentacao(Date dataMovimentacao) {
        this.dataMovimentacao = dataMovimentacao;
    }

    public int getCodProduto() {
        return codProduto;
    }

    public void setCodProduto(int codProduto) {
        this.codProduto = codProduto;
    }

    public int getQtdMovimentada() {
        return qtdMovimentada;
    }

    public void setQtdMovimentada(int qtdMovimentada) {
        this.qtdMovimentada = qtdMovimentada;
    }

    public Integer getIdFornecedor() {
        return idFornecedor;
    }

    public void setIdFornecedor(Integer idFornecedor) {
        this.idFornecedor = idFornecedor;
    }

    public Integer getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Integer idCliente) {
        this.idCliente = idCliente;
    }

    public String getNumNFe() {
        return numNFe;
    }

    public void setNumNFe(String numNFe) {
        this.numNFe = numNFe;
    }

    public int getLoginUsuario() {
        return loginUsuario;
    }

    public void setLoginUsuario(int loginUsuario) {
        this.loginUsuario = loginUsuario;
    }


}