package ex_020_oops_polymorphism;

public class WebAutomation {
    public static void main(String[] args) {
        browser p1 = new browser();
       p1.StartBrowser("chrome");
    }
}

class browser{
    void StartBrowser(){
        System.out.println("staring the default browser");
    }
   String StartBrowser (String browser){
       System.out.println("starting  browser"+browser);
       return browser;
   }
        }
