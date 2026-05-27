package atividades.atividade28.application;

import atividades.atividade28.entities.Contract;
import atividades.atividade28.entities.Installment;
import atividades.atividade28.services.ContractServices;
import atividades.atividade28.services.PaypalService;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("(dd/MM/yyyy)");

        System.out.println("Entre os dados do contrato:");
        System.out.print("Numero: ");
        int number = sc.nextInt();
        System.out.print("Data (dd/MM/yyyy): ");
        LocalDate date = LocalDate.parse(sc.next(), fmt);
        System.out.print("Valor do contrato: ");
        double totalValue = sc.nextDouble();

        Contract obj = new Contract(number, date, totalValue);

        System.out.print("Entre com os numeros de parcelas: ");
        int n = sc.nextInt();

        ContractServices contractService = new ContractServices(new PaypalService());

        contractService.processContract(obj, n);

        System.out.println("Parcelas:");
        for(Installment installment : obj.getInstalments()){
            System.out.println(installment);
        }
        sc.close();
    }
}
