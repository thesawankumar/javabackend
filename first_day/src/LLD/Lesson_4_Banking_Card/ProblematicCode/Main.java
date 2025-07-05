package LLD.Lesson_4_Banking_Card.ProblematicCode;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<CreditCard> cards = new ArrayList<>();
        for(CreditCard card : cards) {
            if(card instanceof RuPayCard) {
                card.upiPayment();
            }
        }
    }
}
