package aprendizagem.lista;

import java.util.ArrayList; // Temos que importa
import java.util.List; // Temos que importa
import java.util.stream.Collectors;// Temos que importa

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(); // Aqui temos uma criação de uma lista
        // Para adicionar obj na lista
        list.add("Maria");
        list.add("Bob");
        list.add("Alex");
        list.add("Anna");

        //Inserir algum obj na lista
        list.add(2,"Marcos"); // Aqui estamos inserindo o obj na posição 2

        // Tamanho da lista
        System.out.println("Tamanho: " + list.size());

        for(String x: list){
            System.out.println(x);
        }
        System.out.println("----------------------");
       //Remoção da lista
        list.remove("Anna");
        list.remove(1); // removendo por posição
        list.removeIf(x -> x.charAt(0) == 'M');// remoção por predicado
        for(String x: list){
            System.out.println(x);
        }
        System.out.println("-----------------");
        // Encontrar posição
        System.out.println("Index of Bob: " + list.indexOf("Bob"));
        System.out.println("---------------");
        // Filtra a lista com base
        List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
        for(String x: result){
            System.out.println(x);
        }
        System.out.println("---------------");
         String name = list.stream().filter(x -> x.charAt(0) == 'J').findFirst().orElse(null);
        System.out.println(name);
    }
}
/*
O que ela é, o tipo, nome, instanciação,

leitura do removeIf (remover todo String x  tal que x.charAt(0) seja igual a M
 */