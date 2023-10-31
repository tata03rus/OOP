import java.util.Comparator;
public class AgeComparator implements Comparator<Base> {

    @Override
    public int compare(Base o1, Base o2) {

        return Integer.compare(o1.age, o2.age);


    }
}