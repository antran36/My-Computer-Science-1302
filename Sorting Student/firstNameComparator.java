import java.lang.*;
import java.util.Comparator;

/**
 * Created by antran on 11/23/16.
 */
public class firstNameComparator implements Comparator<Student> {
    public int compare(Student s1, Student s2)
    {
        return s1.getFirstName().compareTo(s2.getFirstName());
    }
}
