package aprendizagem.file.application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Program03 {
    public static void main(String[] args) {
        String path = "D:\\in.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(path))) { // path - é o caminho
            String line = br.readLine();

            while (line != null) {
                System.out.println(line);
                line = br.readLine();
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
