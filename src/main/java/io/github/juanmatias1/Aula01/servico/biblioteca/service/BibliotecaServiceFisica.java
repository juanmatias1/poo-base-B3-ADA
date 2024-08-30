package io.github.juanmatias1.Aula01.servico.biblioteca.service;

import io.github.juanmatias1.Aula01.servico.biblioteca.model.ItemCatalogo;

public interface BibliotecaServiceFisica extends BibliotecaService{

    void emprestar(String titulo);
    void devolver(String titulo);
    void cadastrar(ItemCatalogo item);
}
