package oops.inheritance;

import oops.inheritance.Employee;

public class Tester extends Employee {

    String skill;

    @Override
    public String getLocation() {
        return super.getLocation();
    }

    @Override
    public void setLocation(String location) {
        super.setLocation(location);
    }

    public String getSkill() {
        return skill;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }

    public void modifyEmpId(){
        empId = empId + 999;
    }
}
