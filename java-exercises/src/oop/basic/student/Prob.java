package oop.basic.student;

public class Prob {
    public static void main(String[] args) {
        Student stu = new Student("차은우", "jspprogram", 500000);
        stu.calcReturnFee();
        stu.print();
    }
}
