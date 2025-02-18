package br.com.alura.screenmatch.pratica;

import java.util.ArrayList;

public class Pessoa {
    private String nome;
    private int idade;

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return this.getNome() + " - " + this.getIdade() + " anos";
    }
}


class Principal {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Alex");
        pessoa.setIdade(23);

        System.out.println(pessoa);

        ArrayList<Pessoa> listaDePessoas = new ArrayList<>();

        Pessoa pessoa2 = new Pessoa();
        pessoa2.setNome("Julia");
        pessoa2.setIdade(22);

        Pessoa pessoa3 = new Pessoa();
        pessoa3.setNome("Gabriela");
        pessoa3.setIdade(25);

        listaDePessoas.add(pessoa);
        listaDePessoas.add(pessoa2);
        listaDePessoas.add(pessoa3);

        System.out.println("O tamanho da lista: " + listaDePessoas.size());

        System.out.println(listaDePessoas.getFirst());
        System.out.println("Lista completa: " + listaDePessoas);

    }
}
