package aprendizagem.file.application;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Program04 {
    public static void main(String[] args) {
        String[] lines = new String[]{"Good morning", " Good afternoon", "Good night"};

        String path = "D:\\in.txt";
      //  D:\

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path))) {
            for (String line : lines) {
                bw.write(line);
                bw.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}

// FileWriter - Stream de escrita de caracteres  em arquivos