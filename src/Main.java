


import View.Choice;
import View.SplashScreen;
import java.util.concurrent.TimeUnit;


public class Main {


    public static void main(String[] args) throws InterruptedException 
    {
        SplashScreen spl = new SplashScreen();
        spl.show();
        TimeUnit.SECONDS.sleep(3);
        new Choice().show();
        spl.dispose();
        
      
    }
    
}
