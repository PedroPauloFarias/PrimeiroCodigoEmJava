package aprendizagem.file.application;

import java.io.File;
import java.util.Scanner;

public class Program05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a folder path: ");
        String strPath = sc.nextLine();
// O Caminho que tem que digitar é D:\ para poder ver os diretorios

        File path = new File(strPath);

        File[] folders = path.listFiles(File::isDirectory);

        // mostra quantas pastas tem no caminho indicado
        System.out.println("FOLDERS:");
        for (File folder : folders) {
            System.out.println(folder);
        }

        // mostra quantos arquivos tem no caminho indicado
        File[] files = path.listFiles(File::isFile);
        System.out.println("FILES:");
        for (File file : files) {
            System.out.println(file);
        }

        // Criação de um pasta
        boolean sucess = new File(strPath + "\\subdir").mkdir();
        System.out.println("Directory created sucessfully: " + sucess);

        sc.close();
    }
}

/*
 Aqui ele lista as pastas e arquivos
 e no final ele criar uma pasta
 */