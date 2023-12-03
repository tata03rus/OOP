import Company.Company;
import Employment_agency.JobAgency;
import Worker.Master;
import Worker.Student;

public class Main {
    public static void main(String[] args) {

        JobAgency jobAgency = new JobAgency();
        Company geekBrains = new Company("GeekBrains", 70000, jobAgency);
        Company google = new Company("Google", 100000, jobAgency);
        Company yandex = new Company("Yandex", 120000, jobAgency);

        Master Ivanov = new Master("Иванов");
        Master Petrov = new Master("Петров");
        Student Sidorov = new Student("Сидоров");

        jobAgency.registerObserver(Ivanov);
        jobAgency.registerObserver(Petrov);
        jobAgency.registerObserver(Sidorov);

        for (int i = 0; i < 2; i++){
            geekBrains.needEmployee();
            google.needEmployee();
            yandex.needEmployee();
            System.out.println();
        }
    }
}