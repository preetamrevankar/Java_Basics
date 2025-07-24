package ex_020_oops_polymorphism;

public class Lab188_REAL_MOverloading {
    public static void main(String[] args) {
        home h1 = new home();
        h1.task(3);
        h1.task(true);

    }
}

class home {
    void task (){
        System.out.println("task1");
    }
    int task(int a){
        System.out.println("task1");
        return a;
    }
    boolean task(boolean a){
       return false;
    }
}
