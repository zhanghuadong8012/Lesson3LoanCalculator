package sample;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class Controller {
    @FXML
    private TextField tfAnnualInterestRate;

    @FXML
    private TextField tfNumberOfYears;

    @FXML
    private TextField tfLoanAmount;

    @FXML
    private TextField tfMonthlyPayment;

    @FXML
    private TextField tfTotalPayment;



    @FXML
    void calculateLoadPayment() {
        if(tfAnnualInterestRate.getText().matches("^[0-9.]+$") && tfNumberOfYears.getText().matches("^[0-9]+$")&&tfLoanAmount.getText().matches("^[0-9.]+$")){
            double annualInterestRate = Double.parseDouble(tfAnnualInterestRate.getText());
            int numberOfYears = Integer.parseInt(tfNumberOfYears.getText());
            double loanAmount = Double.parseDouble(tfLoanAmount.getText());
            Loan loan = new Loan(annualInterestRate,numberOfYears,loanAmount);
            tfMonthlyPayment.setText(String.format("$%.2f",loan.getMonthlyPayment()));
            tfTotalPayment.setText(String.format("$%.2f",loan.getTotalPayment()));
        }
    }

    public void clear(){
        tfAnnualInterestRate.clear();
        tfNumberOfYears.clear();
        tfLoanAmount.clear();
        tfMonthlyPayment.clear();
        tfTotalPayment.clear();
    }
}
