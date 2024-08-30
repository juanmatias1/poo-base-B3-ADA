package io.github.juanmatias1.Aula01.servico.biblioteca.repository;

import io.github.juanmatias1.Aula01.servico.biblioteca.model.ItemCatalogo;

public interface BibliotecaRepositorio {

    ItemCatalogo cadastrar(ItemCatalogo item);

    ItemCatalogo consultar(String titulo);

    ItemCatalogo atualizar(ItemCatalogo itm);
}
