package LLD.Lesson_4_Banking_Card.BetterCode;

import LLD.Lesson_4_Banking_Card.BetterCode.CreditCard;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<InternationalPaymentCompatibleCreditCard> cards = new ArrayList<>();
        for(InternationalPaymentCompatibleCreditCard card : cards) {
            card.internationalPayment();
        }
    }
}
