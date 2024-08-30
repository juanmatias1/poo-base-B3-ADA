package io.github.juanmatias1.Aula01.servico.biblioteca.service;

import io.github.juanmatias1.Aula01.servico.biblioteca.model.ItemCatalogo;
import io.github.juanmatias1.Aula01.servico.biblioteca.repository.BibliotecaRepositorio;

public abstract class BibliotecaServiceImp implements BibliotecaService{

    protected BibliotecaRepositorio repositorio;

    public void setRepositorio(BibliotecaRepositorio repositorio) {
        this.repositorio = repositorio;
    }

    @Override
    public ItemCatalogo consultar(String titulo) {
        return repositorio.consultar(titulo);
    }

    @Override
    public String reservar(String titulo) {
        ItemCatalogo item = repositorio.consultar(titulo);

        String hash = String.valueOf(titulo.hashCode());
        item.setReserva(hash);

        repositorio.atualizar(item);

        return hash;
    }
}
