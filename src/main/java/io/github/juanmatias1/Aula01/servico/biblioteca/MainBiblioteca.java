package io.github.juanmatias1.Aula01.servico.biblioteca;

import io.github.juanmatias1.Aula01.servico.biblioteca.model.ItemCatalogo;
import io.github.juanmatias1.Aula01.servico.biblioteca.model.Livro;
import io.github.juanmatias1.Aula01.servico.biblioteca.repository.BibliotecaRepositorio;
import io.github.juanmatias1.Aula01.servico.biblioteca.repository.BibliotecaRepositorioListImp;
import io.github.juanmatias1.Aula01.servico.biblioteca.service.BibliotecaServiceFisica;
import io.github.juanmatias1.Aula01.servico.biblioteca.service.BibliotecaServiceFisicaImp;
import io.github.juanmatias1.Aula01.servico.biblioteca.service.BibliotecaServiceVirtual;
import io.github.juanmatias1.Aula01.servico.biblioteca.service.BibliotecaServiceVirtualImp;

public class MainBiblioteca {
    public static void main(String[] args) {

        BibliotecaRepositorio repositorio = new BibliotecaRepositorioListImp();
        BibliotecaServiceFisica bibliotecaServiceFisica = new BibliotecaServiceFisicaImp(repositorio);
        BibliotecaServiceVirtual bibliotecaServiceVirtual = new BibliotecaServiceVirtualImp(repositorio);

        ItemCatalogo labc = new Livro("Livro ABC");

        bibliotecaServiceFisica.cadastrar(labc);

        ItemCatalogo r1 = bibliotecaServiceFisica.consultar("Livro ABC");
        System.out.println("Item consultado: " + (r1 != null ? r1.getTitulo() : "não encontrado"));

        String titulo = r1.getTitulo();
        String reserva = bibliotecaServiceFisica.reservar(titulo);
        System.out.println("Reserva gerada: " + reserva);

        bibliotecaServiceFisica.emprestar("Livro ABC");

        bibliotecaServiceFisica.emprestar("Livro ABC");

        bibliotecaServiceFisica.devolver("Livro ABC");

        bibliotecaServiceFisica.devolver("Livro ABC");

        bibliotecaServiceFisica.emprestar("Livro ABC");

        bibliotecaServiceFisica.emprestar("Livro XYZ");
        bibliotecaServiceFisica.devolver("Livro XYZ");
    }
}