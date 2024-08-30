package io.github.juanmatias1.Aula01.servico.biblioteca.service;

import io.github.juanmatias1.Aula01.servico.biblioteca.model.ItemCatalogo;
import io.github.juanmatias1.Aula01.servico.biblioteca.repository.BibliotecaRepositorio;

public class BibliotecaServiceFisicaImp extends BibliotecaServiceImp implements BibliotecaServiceFisica{

    public BibliotecaServiceFisicaImp(BibliotecaRepositorio repositorio) {
        super.setRepositorio(repositorio);
    }

    @Override
    public void emprestar(String titulo) {
        ItemCatalogo item = super.consultar(titulo);

        if (item == null) {
            System.out.println("Item não encontrado.");
        } else if (item.isEmprestado()) {
            System.out.println("Item já está emprestado.");
        } else {
            item.setEmprestado(true);
            super.repositorio.atualizar(item);
            System.out.println("Item " + titulo + " emprestado com sucesso.");
        }
    }

    @Override
    public void devolver(String titulo) {
        ItemCatalogo item = super.consultar(titulo);

        if (item == null) {
            System.out.println("Item não encontrado.");
        } else if (!item.isEmprestado()) {
            System.out.println("Item não está emprestado.");
        } else {
            item.setEmprestado(false);
            super.repositorio.atualizar(item);
            System.out.println("Item " + titulo + " devolvido com sucesso.");
        }
    }

    @Override
    public void cadastrar(ItemCatalogo item) {
        super.repositorio.cadastrar(item);
        System.out.println("Item " + item + " cadastrado!");
    }
}
