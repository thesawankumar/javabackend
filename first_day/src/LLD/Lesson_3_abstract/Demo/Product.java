package LLD.Lesson_3_abstract.Demo;

public abstract class Product {

    // An abstract method
    public abstract double calculateDiscount();

    // concrete method
    public void termsAndCondition() {
        System.out.println("Some terms");
    }

}
