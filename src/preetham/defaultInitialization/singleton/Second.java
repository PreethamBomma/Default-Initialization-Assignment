package preetham.defaultInitialization.singleton;

public class Second {

    public String stringVariable;
    public static Second print(String param)
    {

        /*
           non-static variable cannot be referenced from static method
        stringVariable=param;
        */
        return new Second();
    }
}
