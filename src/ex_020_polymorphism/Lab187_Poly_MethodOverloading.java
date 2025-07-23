package ex_020_polymorphism;

public class Lab187_Poly_MethodOverloading {
    public static void main(String[] args) {
         MathOperations m1 = new MathOperations();
        int r1 =m1.add(3,4);
        int r2=m1.add(3,4,7);
        String r3=m1.add("sbb","sdsb");
        double r4 =m1.add(1.33,444,444);
        System.out.println(m1.add(1,3,4));

    }
}


class MathOperations{
    int add ( int a, int b){
        return a+b ;
    }

    int add(int a, int b , int c){
        return a+b+c;
    }
    double add (double a, double b,double c){
        return a+b;
    }
    String add (String a,String b){
        return a+b;
    }

        }
