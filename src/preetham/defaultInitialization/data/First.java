package preetham.defaultInitialization.data;

public class First {
    int integerVariable;
    char characterVariable;
    public void print()
    {
        /* Variables are assigned default values and those values are printed below */
        System.out.println("Integer Variable:  "+ integerVariable);
        System.out.println("Character Variable:  "+characterVariable);
    }
    public void printLocal()
    {
        int localVariable;
        char charVariable;
        /*
           variable localVariable might not have been initialized
        System.out.println("Printing localvariables"+ localVariable+"   "+charVariable);
        */
    }

}
