package atividades.atividade18.application;

import atividades.atividade18.entites.Product;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        String name;
        int age;
        System.out.println("Quantas pessoas voce vai digitar: ");
        int n = sc.nextInt();
        Product[] array = new Product[n]; // criacao do array
        for(int i = 0; i < array.length; i ++){
            System.out.println("Dados da "+ (i+1) + "a pessoa:");
            System.out.print("Name: ");
            name = sc.nextLine();
            System.out.print("Age: ");
            age = sc.nextInt();
            array[i] = new Product(name, age); // armazenando no construtor
        }
        sc.close();
    }
}
