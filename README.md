# Biblioteca de Serviços

Este projeto implementa um sistema de gerenciamento de biblioteca, com suporte para operações de cadastro, consulta, reserva, empréstimo e devolução de itens do catálogo, como livros e revistas.

## Funcionalidades Principais

- **Cadastro de Itens**: Adiciona novos itens ao catálogo da biblioteca.
- **Consulta de Itens**: Permite buscar itens pelo título.
- **Reserva de Itens**: Gera uma reserva para um item disponível.
- **Empréstimo de Itens (Biblioteca Física)**: Permite o empréstimo de itens da biblioteca física.
- **Devolução de Itens (Biblioteca Física)**: Gerencia a devolução de itens emprestados da biblioteca física.

## Estrutura do Projeto

- **Model**: Define as classes de itens do catálogo (`Livro`, `Manuscrito`, `Revista`).
- **Repository**: Interface para operações de CRUD no catálogo e uma implementação baseada em listas (`BibliotecaRepositorio`, `BibliotecaRepositorioListImp`).
- **Service**: Interfaces e implementações para serviços de biblioteca física e virtual (`BibliotecaService`, `BibliotecaServiceFisica`, `BibliotecaServiceVirtual`, etc.).
- **Main**: Classe principal para testar as funcionalidades (`MainBiblioteca`).

## Tecnologias Utilizadas

- Java
- Programação Orientada a Objetos

## Como Executar

1. **Clone o Repositório**

   ```bash
   git clone https://github.com/seu-usuario/seu-repositorio.git
