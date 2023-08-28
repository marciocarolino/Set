package org.example;

public class Main {
    public static void main(String[] args) {

//        ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();
//
//        System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " convidados dentro do Set de Convidados");
//
//        conjuntoConvidados.adicionarConvidado("Convidado 1 ", 1234);
//        conjuntoConvidados.adicionarConvidado("Convidado 2 ", 1235);
//        conjuntoConvidados.adicionarConvidado("Convidado 3 ", 1235);
//        conjuntoConvidados.adicionarConvidado("Convidado 4 ", 1236);
//
//        System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " convidado(s) dentro do Set de Convidados");
//
//        conjuntoConvidados.removerConvidadoPorCodigoConvit(1234);
//
//        System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " dentro do Set de Convidados");
//        conjuntoConvidados.exibirConvidados();

//        AgendaContatos agendaContatos = new AgendaContatos();
//
//        agendaContatos.exibirContato();
//
//        agendaContatos.adicionarContato("Marcio", 123456);
//        agendaContatos.adicionarContato("Marcio", 0);
//        agendaContatos.adicionarContato("Marcio Carolino", 111111);
//        agendaContatos.adicionarContato("Marcio DIO", 6549874);
//        agendaContatos.adicionarContato("Marcio Brito", 123456);
//
//
//        agendaContatos.exibirContato();

//        System.out.println(agendaContatos.pesquisarPorNome("Marcio"));
//
//        System.out.println("Contato Atualizado: " + agendaContatos.atualizarNumeroContato("Marcio", 9879));

        CadastroProdutos cadastroProdutos = new CadastroProdutos();
        cadastroProdutos.adicionarProduto(1L, "Produdo 5", 15d, 5);
        cadastroProdutos.adicionarProduto(2L, "Produdo 0", 20d, 5);
        cadastroProdutos.adicionarProduto(1L, "Produdo 3", 10d, 5);
        cadastroProdutos.adicionarProduto(9L, "Produdo 9", 2d, 5);


        System.out.println(cadastroProdutos.produtoSet);

        System.out.println(cadastroProdutos.exibirProdutosPorNome());
        System.out.println(cadastroProdutos.exibirPorPreco());


    }
}