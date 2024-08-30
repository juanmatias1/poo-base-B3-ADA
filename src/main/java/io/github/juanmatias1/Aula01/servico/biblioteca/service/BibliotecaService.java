package io.github.juanmatias1.Aula01.servico.biblioteca.service;

import io.github.juanmatias1.Aula01.servico.biblioteca.model.ItemCatalogo;

public interface BibliotecaService {

    String reservar(String titulo);
    ItemCatalogo consultar(String titulo);
}
