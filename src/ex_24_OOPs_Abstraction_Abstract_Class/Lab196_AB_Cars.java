package ex_24_OOPs_Abstraction_Abstract_Class;

public class Lab196_AB_Cars {

public static void main(String[]args) {
      waganor car = new waganor();
      car.drive();
}
}



























abstract class gearmanagement{
    abstract void gearset();
}

abstract class engine {
    abstract void startengine();
    abstract void stopengine();

  void checkengine (){
      System.out.println("everything is good");
  }
}

class waganor extends engine{

    @Override
    void startengine() {

    }

    @Override
    void stopengine() {

    }

    void drive() {
        checkengine();
        startengine();
        stopengine();
    }
}
