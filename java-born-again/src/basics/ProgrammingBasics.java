package basics;

public class ProgrammingBasics {


    public static void main(String args[]) {
        String name_1 = "asdf";

        int a = 1;
        int b = 0;
        int sum = a + b;
        int sumReturnedFromMethod = add(a, b);
        // Conditionals using logical operator
        if (a != b && a > 1) {
            System.out.println("A and B are not equal, and A great than 1");
        } else if (a == b) {
            System.out.println("A and B are equal");
        } else {

        }
        //Conditionals using string methods
        String name = "Brian";
        String name_2 = "Brian";
        System.out.println(name.isEmpty());
        if (name.isEmpty()) {
            System.out.println("name was empty");
        }

        // while loop
        int ntimes = 1;
        while (ntimes <= 10) {
            System.out.println("BRIAN");
            ntimes++;
//            ntimes = ntimes + 1; same as above
        }

        //for loop
        for (int counter = 1; counter <= 10; counter++) {
            System.out.println("BRIAN");
        }
        int employees[] = new int[5];
        employees[0] = 410581;
        employees[1] = 410582;
        employees[2] = 410583;
        employees[3] = 410584;
        employees[4] = 410585;

        String anem = "asd";
        anem.length();

        System.out.println(employees[4]);
        for (int i = 0; i < employees.length; i++) {
//           System.out.println(employees[i]);
//           i ams saying this to understand
        }
    }

    public static int add(int a, int b) {
        int sum = a + b;

        return sum;
    }
}
