package collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import oops.inheritance.Employee;

public class CollectionsExample {

    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("pankaj");
        names.add("rajkumar");
        names.add("amritha");
        names.add("amritha");
        names.set(0, "shalini");
        /*for (int i = 0; i < names.size(); i++) {
            String currentValue = names.get(i);
            System.out.println(currentValue);
        }*/

        for (String currentValue : names) {
            System.out.println(currentValue);
        }

        Map<Integer, String> employeesMinimumDetails = new HashMap<>();
        employeesMinimumDetails.put(3123123, "nivetha");
        employeesMinimumDetails.put(3123143, "nivetha");
        employeesMinimumDetails.entrySet().forEach(entry -> System.out.println(entry.getKey()));

        System.out.println("------- more columns");
        List<Employee> employees = new ArrayList<>();
        Employee kalai = new Employee();
        kalai.setEmpId("23123");
        kalai.setCompany("CTS");
        employees.add(kalai);

        for (Employee employee : employees) {
            System.out.println(employee.getCompany());
        }
        System.out.println("-----------------------");
        Properties props = new Properties();
        props.setProperty("3123123", "nivetha");
        props.setProperty("444423", "nivetha");
        Properties systemProperties = System.getProperties();
        for (String propertyName : systemProperties.stringPropertyNames()) {
            if (propertyName.startsWith("user")) {
//                System.out.println(propertyName);
            }
        }
        System.out.println(System.getProperty("user.dir"));
    }
}
