package entity;

public class FifthGrader extends Student {

    private String grade1;

    private String school;

    public FifthGrader() {
    }

    @Override
    public void display() {
        super.display();
        System.out.println(grade1);
        System.out.println(school);
    }

    public FifthGrader(String grade1, String school) {
        this.grade1 = grade1;
        this.school = school;
    }

    public FifthGrader(int id, String name, double grade, String grade1, String school) {
        super(id, name, grade);
        this.grade1 = grade1;
        this.school = school;
    }


    public String getGrade1() {
        return grade1;
    }

    public void setGrade1(String grade1) {
        this.grade1 = grade1;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    @Override
    public String toString() {
        return "FifthGrader{" +
                "grade1='" + grade1 + '\'' +
                ", school='" + school + '\'' +
                ", id=" + getId() +
                ", name='" + getName() + '\'' +
                ", grade=" + getGrade() +
                '}';
    }
}
