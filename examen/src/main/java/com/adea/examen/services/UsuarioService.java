package com.adea.examen.services;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.adea.examen.models.UsuarioModel;
import com.adea.examen.repositories.UsuarioRepository;

/**
 * UsuarioService
 */
@Service
public class UsuarioService {
    
    @Autowired
    UsuarioRepository usuarioRepository;

    public ArrayList<UsuarioModel> obtenerUsuarios(){
        return (ArrayList<UsuarioModel>) usuarioRepository.findAll();
    }
    
    public UsuarioModel guardarUsuario(UsuarioModel usuario) {
        return usuarioRepository.save(usuario);
    }

    public ArrayList<UsuarioModel> obtenerPorLogin(String login){
        return usuarioRepository.findByLogin(login);
    }

    // public Optional<UsuarioModel> obtenerPorNombre(String nombre){
    //     return usuarioRepository.findByNombre(nombre);
    // }

    
    public boolean eliminarUsuario(String login){
        try {
            usuarioRepository.deleteById(login);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}