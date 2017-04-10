import java.util.Comparator;

/**
 * Created by antran on 11/23/16.
 */
public class Student implements Comparable<Student> {
    private String firstName;
    private String lastName;
    private String IDNumber;
    private double percentGrade;
    private char letterGrade;

    public Student(String firstName, String lastName, String IDNumber, double pGrade, char letterGrade) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.IDNumber = IDNumber;
        this.percentGrade = pGrade;
        this.letterGrade = letterGrade;
    }

    public  int compareTo(Student other)
    {
        int otherid = Integer.parseInt(other.getIDNumber());
        int thisid = Integer.parseInt(this.getIDNumber());
        return (thisid - otherid);



    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setIDNumber(String IDNumber) {
        this.IDNumber = IDNumber;
    }

    public void setPercentGrade(double percentGrade) {
        this.percentGrade = percentGrade;
    }

    public void setLetterGrade(char letterGrade) {
        this.letterGrade = letterGrade;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getIDNumber() {
        return IDNumber;
    }

    public double getPercentGrade() {
        return percentGrade;
    }

    public char getLetterGrade() {
        return letterGrade;
    }
    public void printStudent()
    {
        System.out.printf("%-13s %-13s %-13s %-13.1f %-13c \n",firstName,lastName,IDNumber,percentGrade,letterGrade);
    }
}
