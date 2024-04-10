package baiTapGiuaKi;

public class Intern extends Employee {
    private String Majors;
    private String Semester;
    private String University_name;

    public Intern(String ID, String fullName, String birthDay, String phone, String email, String majors, String semester, String university_name) {
        super(ID, fullName, birthDay, phone, email, "Intern");
        Majors = majors;
        Semester = semester;
        University_name = university_name;
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Majors: " + Majors);
        System.out.println("Semester: " + Semester);
        System.out.println("University Name: " + University_name);
    }
}


