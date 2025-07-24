package ex_24_OOPs_Abstraction_Abstract_Class;

public class Lab195_Abstraction {
    public static void main(String[] args) {
        car c1 = new car();
//    Father v2 = new Father();  abstarct in nature

        Child Child = new Child();
        Father F2 = new Child();
        Child.loan50k();
    }


}

class car {
     void done (){

     }
}

abstract class Father {
    //This is abstruct function
    abstract  void loan50k();

//    complete function
    void loan25k(){
        System.out.println("give 25k loan");
    }
}

class Child extends Father{

    @Override
     void loan50k() {
        System.out.println("Son has to give the 50k loan");

    }
}