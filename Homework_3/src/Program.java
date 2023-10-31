import java.util.Arrays;

public class Program {

    public static void main(String[] args) {
        System.out.println("Наша славная команда:");
        Base[] workers = BaseClass.generateEmployees(15);
        for (Base worker : workers) {
            System.out.println(worker);
        }

        System.out.println();
        System.out.println("***");
        System.out.println();
        System.out.println("Отсортированы по заработной плате:");
        System.out.println();

        Arrays.sort(workers, new SalaryComparator());

        for (Base worker : workers) {
            System.out.println(worker);
        }
        System.out.println();
        System.out.println("***");
        System.out.println();
        System.out.println("Отсортированы по возрасту:");
        System.out.println();

        Arrays.sort(workers, new AgeComparator());

        for (Base worker : workers) {
            System.out.println(worker);
        }

    }

}

