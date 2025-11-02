package org.example;
//weandining casting
public class typeCasting {
    static double value1=45.56;
    static int value2=40;
    public static void main(String[] args) {
        System.out.println("weadining casting");
        double value3=value2;
        System.out.println("double value is:"+value3);
        //narrowCasting

        System.out.println("narrow casting");
int value4= (int) value1;
        System.out.println("intvalue is : "+value4);
        float value5= value4;
        System.out.println("float value is: "+value5);
    }
}
