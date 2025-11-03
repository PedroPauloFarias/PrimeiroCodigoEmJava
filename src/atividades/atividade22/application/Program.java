package atividades.atividade22.application;

import atividades.atividade22.model.entities.Client;
import atividades.atividade22.model.entities.Order;
import atividades.atividade22.model.entities.OrderItem;
import atividades.atividade22.model.entities.Product;
import atividades.atividade22.model.entitiesenum.OrderStatus;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.util.Locale;
import java.util.Date;

public class Program {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        System.out.println("Enter cliente data: ");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Email: ");
        String email = sc.nextLine();
        System.out.print("Birth Date (DD/MM/YYYY): ");
        Date birthDate = sdf.parse(sc.next()); // Aqui é para a leitura do tempo

        Client client = new Client(name, email, birthDate);

        System.out.println("Enter order data");
        System.out.print("Status: ");
        OrderStatus status = OrderStatus.valueOf(sc.next());

      Order order = new Order(new Date(), status, client);

        System.out.print("How many items to this order: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Enter#" + (i + 1) + "item data:");
            System.out.print("Product name: ");
            sc.nextLine();
            String productName = sc.nextLine();
            System.out.print("Product price: ");
            double productPrice = sc.nextDouble();

            Product product = new Product(productName, productPrice); // Aqui é para mandar para a class product

            System.out.print("Quantity: ");
            int quantity = sc.nextInt();

            OrderItem orderItem = new OrderItem(quantity, productPrice, product);// Aqui irar mandar para a class OrderItem
            order.addItem(orderItem);
        }

        System.out.println("ORDER SUMMARY:");
        System.out.println(order);

        sc.close();
    }
}
