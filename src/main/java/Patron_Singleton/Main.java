
package Patron_Singleton;

public class Main {
    public static void main(String [] args){
        Singleton BD1 = Singleton.getInstance("getBD1", "Ejemplo1");
        System.out.println(BD1.getBD());
        System.out.println(BD1.getUrl());

        Singleton BD2 = Singleton.getInstance("getBD2", "Ejemplo2");
        System.out.println(BD2.getBD());
        System.out.println(BD2.getUrl());
    }
}
