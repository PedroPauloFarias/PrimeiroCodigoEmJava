package aprendizagem.praticas.CursoEmVideo.ClasseObjeto;

public class Aula02 {
    public static void main(String[] args) {
        Caneta c1 = new Caneta();
 /*1*/  c1.cor = "Azul";
        c1.ponta = 0.5f;
        c1.tampar();

/*2*/   c1.status();
        c1.rabiscar();

        Caneta c2 = new Caneta();
        c2.modelo =" Bic";
        c2.cor =" Preta";
        c2.destampar();
        c2.rabiscar();
    }
}
 /*
 um e referencia a atributo e outro é referencia a metodo
 1- Referencia a atributo
 2- Referencia a metodo, e ele tem parentese ()
  */