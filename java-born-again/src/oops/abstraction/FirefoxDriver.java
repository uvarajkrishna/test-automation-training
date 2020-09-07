package oops.abstraction;

public class FirefoxDriver extends WebDriver {

    public void get(String url) {
        System.out.println("Opening firefox browser");
        System.out.println("Hit the url - " + url);
    }

}
