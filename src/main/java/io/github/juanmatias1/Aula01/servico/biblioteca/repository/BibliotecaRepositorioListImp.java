package io.github.juanmatias1.Aula01.servico.biblioteca.repository;

import io.github.juanmatias1.Aula01.servico.biblioteca.model.ItemCatalogo;

import java.util.ArrayList;
import java.util.List;

public class BibliotecaRepositorioListImp implements BibliotecaRepositorio {

    static int CODIGO = 1;
    private List<ItemCatalogo> itens = new ArrayList<ItemCatalogo>();

    @Override
    public ItemCatalogo cadastrar(ItemCatalogo item) {
        item.setCodigo(CODIGO++);
        itens.add(item);
        return item;
    }

    @Override
    public ItemCatalogo consultar(String titulo) {
        if (this.itens == null || itens.isEmpty()) return null;
        for (ItemCatalogo item: this.itens) {
            if (item.getTitulo().equals(titulo))
                return item;
        }
        return null;
    }

    @Override
    public ItemCatalogo atualizar(ItemCatalogo item) {
        return item;
    }
}
