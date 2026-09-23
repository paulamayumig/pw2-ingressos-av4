package br.com.etechoracio.ingressos.repository;

import br.com.etechoracio.ingressos.entity.Filme;

import java.util.List;

public interface FilmeRepository {
    List<Filme> findAll();

    Object findById(Long id);
}
