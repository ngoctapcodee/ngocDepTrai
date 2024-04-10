package baiTapGiuaKi;

import java.io.Serializable;

public class Employee implements IEmployee, Serializable {
    private static final long serialVersionUID = 1L;

    protected String ID;
    protected String FullName;
    protected String BirthDay;
    protected String Phone;
    protected String Email;
    protected String Employee_type;
    protected static int Employee_count = 0;

    public Employee(String ID, String fullName, String birthDay, String phone, String email, String employee_type) {
        this.ID = ID;
        FullName = fullName;
        BirthDay = birthDay;
        Phone = phone;
        Email = email;
        Employee_type = employee_type;
        Employee_count++;
    }

    @Override
    public void showInfo() {
        System.out.println("ID: " + ID);
        System.out.println("Full Name: " + FullName);
        System.out.println("Birth Day: " + BirthDay);
        System.out.println("Phone: " + Phone);
        System.out.println("Email: " + Email);
        System.out.println("Employee Type: " + Employee_type);
    }
}

