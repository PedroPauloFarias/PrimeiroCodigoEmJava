package aprendizagem.file.application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Program02 {
    public static void main(String[] args) {
        String path = "D:\\in.txt";
        FileReader fr = null;
        BufferedReader br = null;

        try {
            fr = new FileReader(path);
            br = new BufferedReader(fr);
            // ou pode se fazer assim br = new BufferedRead(new FileReader(path))

            String line = br.readLine(); // readLine() - lê a linha a linha inteira

            while (line != null) {
                System.out.println(line);
                line = br.readLine();
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            try {
                if (br != null) {
                    br.close();
                }
                if (fr != null) {
                    fr.close();
                }
            } catch(IOException e){
              e.printStackTrace();
            }
        }
    }
}
/*

FileReader - Ler caractere por caractere - Arquivos pequenos
BufferedRead - Ler texto de forma mais efeciente, usando um buffer (memoria temporaria) - Arquivos grandes


 */