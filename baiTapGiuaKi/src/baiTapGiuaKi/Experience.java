package baiTapGiuaKi;

public class Experience extends Employee {
    private int ExpInYear;
    private String ProSkill;

    public Experience(String ID, String fullName, String birthDay, String phone, String email, int expInYear, String proSkill) {
        super(ID, fullName, birthDay, phone, email, "Experience");
        ExpInYear = expInYear;
        ProSkill = proSkill;
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Experience In Year: " + ExpInYear);
        System.out.println("Professional Skill: " + ProSkill);
    }
}

