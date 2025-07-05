package LLD.Lesson_4_Banking_Card.ProblematicCode;

public class VisaCard extends CreditCard {
    @Override
    public void tapAndPay() {
        System.out.println("Tap and Pay impl of VISA");
    }

    @Override
    public void onlineTransfer() {
        System.out.println("Online Transfer impl of VISA");
    }

    @Override
    public void swipeAndPay() {
        System.out.println("Swipe and Pay impl of VISA");
    }

    @Override
    public void mandatePayments() {
        System.out.println("Mandate payment impl of VISA");
    }

    @Override
    public void upiPayment() {
//        throw new NoSuchMethodException();
    }

    @Override
    public void intlPayment() {
        System.out.println("Intl payment impl of VISA");
    }
}
