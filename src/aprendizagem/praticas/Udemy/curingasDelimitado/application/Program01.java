package aprendizagem.praticas.Udemy.curingasDelimitado.application;

import java.util.ArrayList;
import java.util.List;

public class Program01 {
    public static void main(String[] args) {

        List<Object> myObjs = new ArrayList<Object>();
        myObjs.add("Maria");
        myObjs.add("Alex");

        List<? super Number> myNums = myObjs;
        myNums.add(10);
        myNums.add(3.14);
        
        Numberx = myNums.get(0); // erro de complição


    }
}
