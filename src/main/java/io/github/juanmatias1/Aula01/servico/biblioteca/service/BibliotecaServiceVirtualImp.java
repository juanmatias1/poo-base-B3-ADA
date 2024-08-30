package io.github.juanmatias1.Aula01.servico.biblioteca.service;

import io.github.juanmatias1.Aula01.servico.biblioteca.repository.BibliotecaRepositorio;

public class BibliotecaServiceVirtualImp extends BibliotecaServiceImp implements BibliotecaServiceVirtual{

    public BibliotecaServiceVirtualImp(BibliotecaRepositorio repositorio) {
        super.setRepositorio(repositorio);
    }
}
