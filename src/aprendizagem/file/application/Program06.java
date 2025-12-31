package aprendizagem.file.application;

import java.io.File;
import java.util.Scanner;

public class Program06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a file path: ");
        String strPath = sc.nextLine();

        File path = new File(strPath);

        System.out.println("getName: " + path.getName()); // Mostra o nome do arquivo
        System.out.println("getParent: " + path.getParent()); // Mostra só o caminho do arquivo
        sc.close();
    }
}
