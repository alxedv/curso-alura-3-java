package br.com.alura.screenmatch.pratica;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Listas {
    public static void main(String[] args) {
        ArrayList<String> listaDeStrings = new ArrayList<>();
        listaDeStrings.add("Texto1");
        listaDeStrings.add("Texto2");
        listaDeStrings.add("Texto3");

        for (String item: listaDeStrings) {
            System.out.println(item);
        }

        //Exercicio1
       List<Integer> listaDeInts = new LinkedList<>();
        listaDeInts.add(3);
        listaDeInts.add(5);
        listaDeInts.add(1);
        Collections.sort(listaDeInts);
        System.out.println(listaDeInts);

        //Exercicio 2
        List<Titulo> listaDeTitulos = new LinkedList<>();
        Titulo titulo1 = new Titulo("A Titulo");
        Titulo titulo2 = new Titulo("B Titulo");
        Titulo titulo3 = new Titulo("C Titulo");

        listaDeTitulos.add(titulo2);
        listaDeTitulos.add(titulo3);
        listaDeTitulos.add(titulo1);

        System.out.println("Lista desordenada: " + listaDeTitulos);

        Collections.sort(listaDeTitulos);

        System.out.println("Lista ordenada: " + listaDeTitulos);

        List<String> listaNomes1 = new ArrayList<>();
        List<String> listaNomes2 = new LinkedList<>();

        listaNomes1.add("Alex");
        listaNomes1.add("Gabriela");

        listaNomes2.add("Nicoly");
        listaNomes2.add("Amanda");

        System.out.println("Lista de nomes 1: " + listaNomes1);
        System.out.println("Lista de nomes 2: " + listaNomes2);

        List<String> listPolimorfica;
        listPolimorfica = new ArrayList<>();
        listPolimorfica.add("ArrayList");

        System.out.println("Com ArrayList: " + listPolimorfica);

        listPolimorfica = new LinkedList<>();
        listPolimorfica.add("LinkedList");

        System.out.println("Com LinkedList: " + listPolimorfica);


    }
}

class Titulo implements Comparable<Titulo> {
    private String nome;

    public Titulo(String nome){
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return this.getNome();
    }

    @Override
    public int compareTo(Titulo outroTitulo) {
        return this.getNome().compareTo(outroTitulo.getNome());
    }

}
