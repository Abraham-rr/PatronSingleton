
package Patron_Singleton;

public class Singleton {
      private String url;
    private String BD;
    private static  Singleton uniqueInstance;

    private Singleton(String url,String BD){
        this.url = url;
        this.BD = BD;
    }

    public static Singleton getInstance(String url, String BD){

        if(uniqueInstance == null){
            System.out.println("La instancia esta vacia");
            uniqueInstance = new Singleton(url, BD);
        }
        System.out.println("Esta abierta una instancia,\n esta se va a cerrar y se abrira una nueva");
        System.out.println("creado nueva instancia");
        uniqueInstance = new Singleton(url, BD);
        return uniqueInstance;
    }

    public String getBD(){
        return BD;
    }

    public String getUrl(){
        return url;
    }
}
