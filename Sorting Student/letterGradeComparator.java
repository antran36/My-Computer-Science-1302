import java.util.Comparator;

/**
 * Created by antran on 11/23/16.
 */
public class letterGradeComparator implements Comparator<Student> {
    public int compare(Student s1, Student s2)
    {
    	   if (s1.getLetterGrade()-s2.getLetterGrade() ==0)
            {
                return s1.getLastName().compareTo(s2.getLastName());
            }
        return s1.getLetterGrade()-s2.getLetterGrade();
    }

}
