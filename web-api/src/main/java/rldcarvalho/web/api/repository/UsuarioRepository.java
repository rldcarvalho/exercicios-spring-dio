package rldcarvalho.web.api.repository;

import org.springframework.stereotype.Repository;
import rldcarvalho.web.api.handler.BusinessException;
import rldcarvalho.web.api.handler.CampoObrigatorioException;
import rldcarvalho.web.api.model.Usuario;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UsuarioRepository {

    public void save(Usuario usuario){
        if(usuario.getLogin()==null){
            throw new CampoObrigatorioException("login");
        }

        if(usuario.getPassword()==null){
            throw new CampoObrigatorioException("password");
        }

        System.out.println("SAVE - Recebendo o usuário na camada de repositório");
        System.out.println(usuario);
    }
    public void update(Usuario usuario){
        System.out.println("UPDATE - Recebendo o usuário na camada de repositório");
        System.out.println(usuario);
    }
    public void remove(Integer id){
        System.out.println(String.format("DELETE/id - Recebendo o id: %d para excluir um usuário", id));
        System.out.println(id);
    }
    public List<Usuario> listAll(){
        List<Usuario> usuarios = new ArrayList<>();
        usuarios.add(new Usuario("maria","password"));
        usuarios.add(new Usuario("joao","masterpass"));
        return usuarios;
    }
    public Usuario finById(Integer id){
        System.out.println(String.format("GET/id - Recebendo o id: %d para localizar um usuário", id));
        return new Usuario("maria","password");
    }

}
