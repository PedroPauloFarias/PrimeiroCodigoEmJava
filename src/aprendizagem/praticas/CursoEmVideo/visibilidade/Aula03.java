package aprendizagem.praticas.CursoEmVideo.visibilidade;

public class Aula03 {
    public static void main(String[] args) {
        Caneta1 c1 = new Caneta1();
        c1.cor = "Azul";
//        c1.ponta = 0.5f;
        c1.tampar();

        c1.status();
        c1.rabiscar();

        Caneta1 c2 = new Caneta1();
        c2.modelo = " Bic";
        c2.cor = " Preta";
        c2.destampar();
        c2.rabiscar();
    }
}

