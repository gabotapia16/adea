package com.adea.examen.controllers;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.adea.examen.models.UsuarioModel;
import com.adea.examen.services.UsuarioService;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {
    @Autowired
    UsuarioService usuarioService;

    @GetMapping()
    public ArrayList<UsuarioModel> obtenerUsuarios(){
        return usuarioService.obtenerUsuarios();
    }

    @PostMapping()
    public UsuarioModel guardarUsuario(@RequestBody UsuarioModel usuario){
        return this.usuarioService.guardarUsuario(usuario);
    }

    @GetMapping( path = "/{login}")
    public ArrayList<UsuarioModel> obtenerUsuarioPorLogin(@PathVariable("login") String login) {
        return this.usuarioService.obtenerPorLogin(login);
    }

    // @GetMapping("/query")
    // public Optional<UsuarioModel> obtenerUsuarioPorNombre(@RequestParam("nombre") String nombre){
    //     return this.usuarioService.obtenerPorNombre(nombre);
    // }

    @DeleteMapping( path = "/{login}")
    public String eliminarPorLogin(@PathVariable("login") String login){
        boolean ok = this.usuarioService.eliminarUsuario(login);
        if (ok){
            return "Se eliminó el usuario con login " + login;
        }else{
            return "No pudo eliminar el usuario con login" + login;
        }
    }

}