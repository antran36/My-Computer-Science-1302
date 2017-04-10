import java.util.Comparator;

/**
 * Created by antran on 11/23/16.
 */
public class percentageGradeComparator implements Comparator<Student> {
        public int compare(Student s1, Student s2)
        {
            if (s1.getPercentGrade()-s2.getPercentGrade() ==0)
            {
                return s1.getLastName().compareTo(s2.getLastName());
            }
            else {
                return (int) (s1.getPercentGrade() - s2.getPercentGrade());
            }
        }
    }

