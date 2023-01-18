package rldcarvalho.web.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import rldcarvalho.web.api.model.Usuario;
import rldcarvalho.web.api.repository.UsuarioRepository;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UsuarioController {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @GetMapping
    public List<Usuario> getUsers(){
        return usuarioRepository.listAll();
    }

    @GetMapping("/{id}")
    public Usuario getOne(@PathVariable Integer id){
        return usuarioRepository.finById(id);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id){
        usuarioRepository.remove(id);
    }

    @PostMapping
    public void postUser(@RequestBody Usuario usuario){
        usuarioRepository.save(usuario);
    }
}
