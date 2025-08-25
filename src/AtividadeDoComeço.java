import java.util.Locale;

public class AtividadeDoComeço {
    public static void main(String[] args){
            String product1 = "Computer";
            String product2 = "Office desk";

            int age = 30;
            int code = 5290;
            char gender = 'F';

            double price1 = 2100.00;
            double price2 = 650.50;
            double price3 = 53.234567;

            System.out.println("Products: ");
            System.out.printf("%s, which price is $%.2f", product1, price1);
            System.out.println();
            System.out.printf("Record: %d years old, code %d and gender %s: ", age, code, gender);
            System.out.println();
            System.out.printf("Measue with eight decimal places: %f", price3);
            System.out.println();
            System.out.printf("Rouded (three decimal places): %f.3", price3);
            System.out.println();
            Locale.setDefault(Locale.US);
            System.out.printf("US decimal point: %.3f%n", price3);
    }
}
