public class Student extends Person
{
    private int grade;

    public Student(String first, String last, String number, int sGrade)
    {
        super (first, last, number);
        grade = sGrade;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public String toString()
    {
        return super.toString() + grade;
    }
}
