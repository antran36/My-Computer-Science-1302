import java.util.Comparator;

/**
 * Created by antran on 11/23/16.
 */
public class lastNameComparator implements Comparator<Student> {
    public int compare(Student s1, Student s2)
    {
        return s1.getLastName().compareTo(s2.getLastName());
    }
}

