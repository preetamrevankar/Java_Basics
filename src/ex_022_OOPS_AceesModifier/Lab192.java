package ex_022_OOPS_AceesModifier;

public class Lab192 {


}

class Father {
    private int gold =10;
    int car =1;
    public int bhk =3;

}

class Son extends Father {
void canuse(){
//    System.out.println(gold);
    System.out.println(car);
    System.out.println(bhk);
}

}