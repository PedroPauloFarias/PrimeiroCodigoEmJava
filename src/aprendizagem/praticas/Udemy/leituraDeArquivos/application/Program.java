package aprendizagem.praticas.Udemy.leituraDeArquivos.application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        String path = "C:\\temp\\in.txt";
        try(BufferedReader br = new BufferedReader(new FileReader(path))){
            String name = br.readLine();
            while (name != null){
                list.add(name);
                name = br.readLine();
            }
            Collections.sort(list);
            for (String s : list){
                System.out.println(s);
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

/*
Defenimos uma lista, passando um arraylist para onde vamos armazenar as informações
depois definimos uma variavel path,caminho, indicando onde está o nosso texto
Com isso usamos  o try e catch que são usados para verificar se de dá certo ou errado
dentro do try tem BufferedReader que é usado para ler texto em arquivos
readLine significa cada linha
Collections ordenar uma coleção


 */