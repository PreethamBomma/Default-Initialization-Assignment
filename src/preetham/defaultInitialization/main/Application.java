package preetham.defaultInitialization.main;

import preetham.defaultInitialization.data.First;
import preetham.defaultInitialization.singleton.Second;

public class Application {
    public static void main(String[] ar) {

        First firstObj = new First();
        firstObj.print();
        firstObj.printLocal();

        Second secondObj=new Second();
        secondObj.print("value");
    }


}
