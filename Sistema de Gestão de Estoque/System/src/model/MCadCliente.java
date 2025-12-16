package model;

public class MCadCliente {
    private int idCliente;
    private String razaoSocial;
    private String apelido;
    private String cpfCnpj;
    private String telefone;
    private String email;
    private String cep;
    private String endereco;
    private String bairro;
    private String numero;
    private String pais;
    private String uf;
    private String cidade;
    private Boolean desativado;//ativo?
    
     public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getApelido() {
        return apelido;
    }

    public void setApelido(String apelido) {
        if (apelido == null || "null".equals(apelido)) {
            this.apelido = "";
        } else {
            this.apelido = apelido;
        }
    }

    public String getCpfCnpj() {
        return cpfCnpj;
    }

    public void setCpfCnpj(String cpfCnpj) {
        this.cpfCnpj = cpfCnpj;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public Boolean getDesativado() {
        return desativado;
    }

    public void setDesativado(Boolean desativado) {
        this.desativado = desativado;
    }
    
}