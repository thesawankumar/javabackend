package OOPS;

public class Main {
    public static void main(String[] args) {
        Student st = new Student();
        System.out.println(st.age);
        System.out.println(st.name);
        System.out.println(st.roll_no);

    }
}

class Student {
    int age;
    String name;
    int roll_no;


    Student() {
        this.age = 12;
        this.name = "Sawan";
        this.roll_no = 34;
    }
}


