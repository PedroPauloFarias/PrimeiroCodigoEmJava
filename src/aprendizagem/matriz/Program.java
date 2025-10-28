package aprendizagem.matriz;


import java.util.Scanner;

    public class Program {
        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            int n = sc.nextInt();
            int[][] mat = new int[n][n];// Criação de uma matriz bidimensional

            for (int i=0; i<mat.length; i++) {
                for (int j=0; j<mat[i].length; j++) {
                    mat[i][j] = sc.nextInt();
                }
            }
            System.out.println("Main diagonal: ");
            for (int i=0; i<mat.length; i++) {
                System.out.print(mat[i][i] + " ");
            }
            sc.close();
        }
    }
/*
Tamanho fixo
 */