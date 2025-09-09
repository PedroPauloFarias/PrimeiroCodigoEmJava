package atividades.atividade08.entities;

public class Product {
    public String name;
    public double a1;
    public double a2;
    public double a3;

   public double media(){
       return  a1 + a2 + a3;
   }
   public double pontos(){
       if (media() < 60.0){
           return 60.0 - media();
       }else{
           return 0.0;
       }
   }
}
 /*  public double media(){
       return  (a1 + a2) / 2;
   }
   public double pontos(){
if(media() < 60.0){

}
*/