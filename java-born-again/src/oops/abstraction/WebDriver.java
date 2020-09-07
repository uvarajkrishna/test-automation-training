package oops.abstraction;

public abstract class WebDriver {

    abstract void get(String url) ;

    public void close(){
        System.out.println("CLosing the browser");
    }
}
