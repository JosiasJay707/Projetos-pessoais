package controle;

import conexao.UsuarioDAO;
import model.McadUsuario;
import java.util.List;

public class UsuarioController {
    private final UsuarioDAO dao = new UsuarioDAO();

    // Método para buscar usuários bloqueados
    public List<McadUsuario> buscarUsuariosBloqueados() {
        return dao.listarUsuariosBloqueados();
    }

    // Método para desbloquear usuário
    public void desbloquearUsuario(int idUsuario) {
        dao.desbloquearUsuario(idUsuario);  // Corrigido para chamar o método correto do DAO
    }
}