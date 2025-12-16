package model;

public class MCadProduto{
    private int codProduto;
    private String descricao;
    private String refFab;
    private String observacoes;
    private String categoria;
    private String unidade;
    private String localizacao;
    private int qtdMin;// (Deixa)?
    private int qtdMax;// (Deixa)?
    private int qtdEstoque;// (Deixa)?
    private Boolean desativado;//ativo?

    public int getCodProduto() {
        return codProduto;
    }

    public void setCodProduto(int codProduto) {
        this.codProduto = codProduto;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getRefFab() {
        return refFab;
    }

    public void setRefFab(String refFab) {
        this.refFab = refFab;
    }

    public String getObservacoes() {
        return observacoes;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getUnidade() {
        return unidade;
    }

    public void setUnidade(String unidade) {
        this.unidade = unidade;
    }

    public int getQtdMin() {
        return qtdMin;
    }

    public void setQtdMin(String qtdMinString) {
    }

    public int getQtdMax() {
        return qtdMax;
    }

    public void setQtdMax(String qtdMaxSring) {
        int qtdMaxInt;
        if(qtdMaxSring == null || qtdMaxSring.isEmpty() || qtdMaxSring.equals("")){
             this.qtdMax = 0;
        }else{
            qtdMaxInt = Integer.parseInt(qtdMaxSring);
            this.qtdMax = qtdMaxInt;
        }
    }

    public int getQtdEstoque() {
        return qtdEstoque;
    }

    public void setQtdEstoque(int qtdEstoque) {
        this.qtdEstoque = qtdEstoque;
    }

    public Boolean getDesativado() {
        return desativado;
    }

    public void setDesativado(Boolean Status) {
        this.desativado = Status;
    }
    
    public String getlocalizacao(){
        return localizacao;        
    }
    
    public void setlocalizacao(String localizacao){
        this.localizacao = localizacao;
    }

    @Override
    public String toString() {
        return codProduto+" | " + descricao + " | " + refFab;
    }
    
    
}