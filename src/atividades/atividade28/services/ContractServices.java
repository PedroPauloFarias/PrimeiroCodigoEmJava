package atividades.atividade28.services;

import atividades.atividade28.entities.Contract;
import atividades.atividade28.entities.Installment;

import java.time.LocalDate;

public class ContractServices {
    private OnlinePaymentService onlinePaymentService;

    public ContractServices(OnlinePaymentService onlinePaymentService) {
        this.onlinePaymentService = onlinePaymentService;
    }

    public void processContract(Contract contract, int months) {

        double basicQuota = contract.getTotalValue() / months;

        for (int i = 1; i <= months; i++) {
            LocalDate dueDate = contract.getDate().plusMonths(i);

            double interset = onlinePaymentService.interest(basicQuota, i);
            double fee = onlinePaymentService.paymentFee(basicQuota + interset);
            double quota = basicQuota + interset + fee;

            contract.getInstalments().add(new Installment(dueDate, quota));
        }

    }
}
