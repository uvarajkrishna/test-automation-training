package basics;

public class Debugging {

    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int output = division(a, b);

    }

    private static int division(int a, int b) {
        System.out.println(a);
        System.out.println(b);
        int output = a / b;
        return output;
    }
}
