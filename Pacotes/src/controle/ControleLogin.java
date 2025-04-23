package controle;

import dao.UsuarioDao;

public class ControleLogin {

    private UsuarioDao usuarioDao;

    // Construtor cria o dao
    public ControleLogin() {

        usuarioDao = new UsuarioDao();

    }

    // Método que será chamado pela interface (view)
    public boolean autenticar(String login, String senha) {
        return usuarioDao.autenticar(login, senha);
    }

}
