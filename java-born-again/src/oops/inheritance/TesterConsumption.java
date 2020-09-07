package oops.inheritance;

public class TesterConsumption {

    public static void main(String[] args) {
        Tester john = new Tester();
        john.setEmpId(88998899);
        john.setSkill("Performance Testing in Load runner");

        System.out.println(john.getEmpId());
    }
}
