package oops.inheritance;

public class Employee {

    private static boolean employed;
    protected int empId;
    private String location;
    private String company;

    public Employee(){

    }

    public Employee(int empId){
      this.empId = empId;
    }

    public Employee(int empId, String location) {
        this.empId = empId;
        this.location = location;
    }

    public Employee(int empId, String location, String company) {
        this.empId = empId;
        this.location = location;
        this.company = company;
    }

    public int getEmpId(){
        return empId;
    }

    protected void setEmpId(int paramEmpId){
        empId = paramEmpId;
    }

    public void setEmpId(String paramEmpId){
        empId = Integer.parseInt(paramEmpId);
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public static boolean isEmployed() {
        return employed;
    }

    public static void setEmployed(boolean employed) {
        Employee.employed = employed;
    }
}
