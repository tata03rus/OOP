import java.util.Comparator;

public class SalaryComparator implements Comparator<Base> {

    @Override
    public int compare(Base o1, Base o2) {
        return Integer.compare(o2.calculateSalary(), o1.calculateSalary());
//        if (o1.calculateSalary() > o2.calculateSalary()) {
//            return 1;
//        }
//        else if (o1.calculateSalary() == o2.calculateSalary()) {
//            return 0;
//        }
//        else {
//            return -1;
//        }
    }
}
