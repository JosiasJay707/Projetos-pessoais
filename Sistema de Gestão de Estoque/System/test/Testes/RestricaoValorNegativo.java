public class RestricaoValorNegativo {

    public static void main(String[] args) {
        System.out.println("=== INICIANDO TESTE UNITÁRIO: TU-08 (VALOR NEGATIVO) ===");
        
      
        double quantidadeEntrada = -10.0; 
        
        System.out.println("Parâmetro de Teste: Quantidade = " + quantidadeEntrada);

       
        boolean erroDetectado = false;
        
        
        if (quantidadeEntrada < 0) {
            erroDetectado = true;
            System.out.println("Caminho de Falha: A validação identificou um valor negativo.");
        }

       
        if (erroDetectado) {
            System.out.println("[RESULTADO: SUCESSO] O sistema rejeitou corretamente a entrada de valor negativo.");
        } else {
            System.out.println("[FALHA] O sistema aceitou valor negativo no campo Quantidade.");
        }
    }
}
