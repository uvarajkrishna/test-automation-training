package oops.abstraction;

public class ChromeDriver extends WebDriver {

    public void get(String url) {
        System.out.println("Opening chrome browser");
        System.out.println("Hit the url - " + url);
    }
}
