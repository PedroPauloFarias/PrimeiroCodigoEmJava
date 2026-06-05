package atividades.brincadeira;


public class KaraokeCompleto {

    // Códigos ANSI para cores e formatação
    public static final String RESET = "\u001B[0m";
    public static final String YELLOW = "\u001B[33m";
    public static final String WHITE = "\u001B[37m";
    public static final String BOLD = "\u001B[1m";

    public static void main(String[] args) {
        try {
            sing();
        } catch (InterruptedException e) {
            System.err.println("O karaokê foi interrompido!");
        }
    }

    public static void sing() throws InterruptedException {
        clearScreen();

        write("Se lembre que eu há muito tempo te amo", 70, WHITE);
        Thread.sleep(400);
        write("Te amo, te amo", 70, YELLOW);

        System.out.println();
        Thread.sleep(1100);

        write("Quero fazer você feliz", 100, WHITE);
        Thread.sleep(1600);
        write("Vamos pegar o primeiro avião", 100, YELLOW);

        System.out.println();
        Thread.sleep(500);

        write("Com destino à felicidade", 90, WHITE);
        Thread.sleep(600);
        write("A felicidade pra mim é você", 110, YELLOW);

        System.out.println();
        Thread.sleep(1700);

        write("Pense em mim, chore por mim", 100, WHITE);
        write("Liga pra mim, não, não liga pra ele", 90, YELLOW);

        Thread.sleep(500);

        write("Pense em mim, chore por mim", 90, WHITE);
        write("Liga pra mim, não, não liga pra ele", 90, YELLOW);

        Thread.sleep(500);
        write("Pra ele! Não chore por ele", 110, WHITE);

        Thread.sleep(2000);
        clearScreen();
    }

    // Método que imprime letra por letra com efeito de digitação
    public static void write(String text, int speed, String color) throws InterruptedException {
        System.out.print(color + BOLD);
        for (char c : text.toCharArray()) {
            System.out.print(c);
            Thread.sleep(speed);
        }
        System.out.println(RESET); // Reseta a cor após a frase
    }

    // Método para limpar o terminal (funciona na maioria dos consoles modernos)
    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}