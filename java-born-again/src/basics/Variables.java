package basics;

public class Variables {

    public static int amAtClassLevel = 0;

    public static void someMethod() {
        int amInSomeMethod = 1;
//        amInMain
        amAtClassLevel = amAtClassLevel + 5;
    }

    public static void main(String[] args) {
        int amInMain = 0;
//        amInSomeMethod = 2;

    }


}
