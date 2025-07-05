package LLD.Lesson_4_Banking_Card.ProblematicCode;

public abstract class CreditCard {

    private String ccNumber;

    private String ownerName;

    private int cvv;

    public void setCcNumber(String ccNumber) {
        this.ccNumber = ccNumber;
    }
    public void setCVV(int cvv) {
        this.cvv = cvv;
    }
    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public abstract void tapAndPay();

    public abstract void onlineTransfer();

    public abstract void swipeAndPay();

    public abstract void mandatePayments();

    public abstract void upiPayment();

    public abstract void intlPayment();

    public void displayCreditCardDetails() {
        System.out.println("CC Number: " + this.ccNumber + " , With Owner Name: " +this.ownerName);
    }
}
