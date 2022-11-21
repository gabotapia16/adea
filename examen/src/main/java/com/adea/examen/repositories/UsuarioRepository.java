package com.adea.examen.repositories;

import java.util.ArrayList;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.adea.examen.models.UsuarioModel;

/**
 * UsuarioRepository
 */

@Repository
public interface UsuarioRepository extends CrudRepository<UsuarioModel, String> {

    public abstract ArrayList<UsuarioModel> findByLogin(String login);

}