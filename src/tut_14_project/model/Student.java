package tut_14_project.model;

public class Student {
    //필드(멤버변수)
    private int stdID;
    private String stdName;
    private String stdGrade;
    private String stdMajor;
    private int stdScore;

    //생성자
    public Student() {}

    public Student(int stdID, String stdName) {
        this();
        this.stdID = stdID;
        this.stdName = stdName;
    }
    public Student(int stdID, String stdName, String stdGrade) {
        this(stdID, stdName);
        this.stdGrade = stdGrade;
    }

    public Student(String stdName, String stdGrade, String stdMajor, int stdScore) {
        this.stdName = stdName;
        this.stdGrade = stdGrade;
        this.stdMajor = stdMajor;
        this.stdScore = stdScore;
    }

    //getter, setter
    public int getStdID() {
        return stdID;
    }

    public void setStdID(int stdID) {
        this.stdID = stdID;
    }

    public String getStdName() {
        return stdName;
    }

    public void setStdName(String stdName) {
        this.stdName = stdName;
    }

    public String getStdGrade() {
        return stdGrade;
    }

    public void setStdGrade(String stdGrade) {
        this.stdGrade = stdGrade;
    }

    public String getStdMajor() {
        return stdMajor;
    }

    public void setStdMajor(String stdMajor) {
        this.stdMajor = stdMajor;
    }

    public int getStdScore() {
        return stdScore;
    }

    public void setStdScore(int stdScore) {
        this.stdScore = stdScore;
    }


    //toString();
    @Override
    public String toString() {
        return "Student{" +
                "stdID=" + stdID +
                ", stdName='" + stdName + '\'' +
                ", stdGrade='" + stdGrade + '\'' +
                ", stdMajor='" + stdMajor + '\'' +
                ", stdScore=" + stdScore +
                '}';
    }
}
