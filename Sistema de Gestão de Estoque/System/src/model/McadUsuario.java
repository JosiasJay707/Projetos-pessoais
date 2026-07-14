package model;

public class McadUsuario {
    private String nome;
    private String login;
    private String senha;
    private String funcao;
    private int id;
    
    public McadUsuario() {
}
    public McadUsuario(int id, String nome, String login, String funcao) {
    this.id = id;
    this.nome = nome;
    this.login = login;
    this.funcao = funcao;
}
    
    public int getId() {
    return id;
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }
    
    public void setId(int id) {
    this.id = id;
    }
    
//public String valSenha(String senhacamp1, String senhacamp2){
//        if(senhacamp1.equals(senhacamp2)){
////            this.nome = this.getNome();
//            this.senha = senhacamp1;
//            return "senha correta";
//        } else {
//            return "Senha e confirmação divergem.";
//            }
//    }
    
    public String camposPreenchidos(String cpNome, String cpLogin, String cpSenha1, String cpSenha2, String slFuncao) {
        if (cpNome == null || cpNome.trim().isEmpty()) {
            return "campo nome vazio";
        }
        if (cpLogin == null || cpLogin.trim().isEmpty()) {
            return "campo login vazio";
        }
        if (cpSenha1 == null || cpSenha1.trim().isEmpty()) {
            return "campo senha vazio";
        }
        if (cpSenha2 == null || cpSenha2.trim().isEmpty() || !cpSenha1.equals(cpSenha2)) {
            return "campo senhas divergentes";
        }
        if (slFuncao.equals("Selecione")) {
            return "função não selecionada";
        }
        
        
        
        this.nome = cpNome;
        this.login = cpLogin;
        this.senha = cpSenha1;
        this.funcao = slFuncao;
        return "usuario cadastrado com sucesso"; // Todos os campos estão preenchidos
    }




//public Boolean valSenha(String senhacamp1, String senhacamp2){
//        if(senhacamp1.equals(senhacamp2)){
//            return true;
//        }
//            else if(senhacamp1.isEmpty() || senhacamp2.isEmpty()){
//                return null;
//            } else {
//                return false;
//            }
//    }
    
}
