package testes;

import conexao.UsuarioDAO; 
import model.McadUsuario;

public class TesteBloqueio {

    public static void main(String[] args) {
        System.out.println("=== INICIANDO TESTE UNITÁRIO: TU-01 (LÓGICA DE BLOQUEIO) ===");
        
        
        UsuarioDAO dao = new UsuarioDAO();
        String loginTeste = "usuario_teste"; 
        String senhaErrada = "senha_errada_123";
        
      
        System.out.println("Cenário: Tentativa de força bruta no usuário: " + loginTeste);

        
        for (int i = 1; i <= 5; i++) {
            System.out.println("Tentativa " + i + " com senha incorreta...");
            
            
            McadUsuario resultado = dao.autenticar(loginTeste, senhaErrada);
            
            if (resultado == null) {
                System.out.println(" -> Acesso negado pelo sistema.");
            }
        }

       
        System.out.println("\nVerificando status final...");
        McadUsuario validacao = dao.autenticar(loginTeste, senhaErrada);
        
        
        System.out.println("[SUCESSO] Se a mensagem 'Usuário bloqueado' apareceu na tela, a lógica do RNF02 funcionou.");
    }
}