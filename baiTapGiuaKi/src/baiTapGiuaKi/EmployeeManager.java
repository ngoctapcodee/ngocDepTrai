package baiTapGiuaKi;
import java.io.*;
import java.util.*;

import java.io.*;
import java.util.List;

public class EmployeeManager {
    private static  String FILE_NAME = "employees.txt";

    public static void writeEmployeesToFile(List<Employee> employees) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_NAME))) {
            oos.writeObject(employees);
            System.out.println("Employees have been written to file.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<Employee> readEmployeesFromFile() {
        List<Employee> employees = null;
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE_NAME))) {
            employees = (List<Employee>) ois.readObject();
            System.out.println("Employees have been read from file.");
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return employees;
    }
}

