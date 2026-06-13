package aprendizagem.praticas.Udemy.generics.services;

import java.util.ArrayList;
import java.util.List;

public class PrintService <T> {

    private List<T> list = new ArrayList<>();

    public void addValue(T value) {
        list.add(value);
    }
    public T first(){ // Aqui da op primeiro elemento que esta armazenado no print services
        if(list.isEmpty()){ // Aqui estamos vendo se a lista está vazia
            throw new IllegalArgumentException("list is empty"); // Se ela estiver vazia, irar mostrar o erro
        }
        return list.get(0); // Irar retornar o primeiro elemento da lista 0
    }
    public void print(){ // impresão da lista
        System.out.print("[");
        if (!list.isEmpty()){
            System.out.print(list.get(0));
        }
        for (int i = 1; i < list.size(); i++){
            System.out.print(", " + list.get(i));
        }
        System.out.println("]");
    }
}
