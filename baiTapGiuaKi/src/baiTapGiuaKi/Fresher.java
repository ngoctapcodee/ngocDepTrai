package baiTapGiuaKi;

public class Fresher extends Employee {
    private String Graduation_date;
    private String Graduation_rank;
    private String Education;

    public Fresher(String ID, String fullName, String birthDay, String phone, String email, String graduation_date, String graduation_rank, String education) {
        super(ID, fullName, birthDay, phone, email, "Fresher");
        Graduation_date = graduation_date;
        Graduation_rank = graduation_rank;
        Education = education;
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Graduation Date: " + Graduation_date);
        System.out.println("Graduation Rank: " + Graduation_rank);
        System.out.println("Education: " + Education);
    }
}


