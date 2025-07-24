package ex_020_oops_polymorphism;

public class Calculator {
    public static void main(String[] args) {
        Calc C1 = new Calc();
        C1.add(3, 4);
        C1.add(3.14, 5.84);
        System.out.println(C1.add(3,4));
        System.out.println(C1.add(3.156,6883.4));
    }
}

    class Calc {
       public int add (int a, int b){
           return a+b;
       }

       public double add (double a, double b ){
           return a+b;
       }
    }


