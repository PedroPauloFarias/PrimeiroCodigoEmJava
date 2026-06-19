package aprendizagem.praticas.Udemy.wikdCardTypes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Program {
    public static void main(String[] args) {
//        List<?> myObjs = new ArrayList<>();
//        List<Integer> myNumbers = new ArrayList<Integer>();
//        myObjs = myNumbers;
//
//        Object obj;
//        Integer x = 10;
//        obj = x;

        List<Integer> myInts = Arrays.asList(5, 2, 10);
        printList(myInts);

        List<String> myStrs = Arrays.asList("Maria", "Alex", "Bob");
        printList(myStrs);
    }

    public static void printList(List<?> list) {
        for (Object obj : list) {
            System.out.println(obj);
        }
    }
}
//o ? é o super tipo de qualquer tipo de lista, nao apresentando problemas assim