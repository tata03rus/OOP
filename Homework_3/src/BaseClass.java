import java.util.Random;

public class BaseClass {

    private static Random random = new Random();

    public static Worker generateWorker() {
        String[] names = new String[] { "Семен", "Сергей", "Иван", "Лука", "Николай", "Станислав", "Порфирий", "Марк",
                "Руслан", "Даниил" };
        String[] surnames = new String[] { "Пупкин", "Мамкин", "Кошкин", "Плошкин", "Шишкин", "Снежкин", "Крысин",
                "Мосин", "Ляжкин", "Соскин" };

        int salary = random.nextInt(60000, 120001);
        int labour_quantity = 1;
        int age = random.nextInt(18, 65);
        return new Worker(
                surnames[random.nextInt(surnames.length)],
                names[random.nextInt(names.length)],
                salary, labour_quantity, age);
    }

    public static Freelancer generateFreelancer() {
        String[] names = new String[] { "Антон", "Федор", "Крис", "Матвей", "Петр", "Влад", "Кирилл", "Панк", "Рустам",
                "Георгий" };
        String[] surnames = new String[] { "Апполонов", "Фомин", "Шестапалов", "Холодков", "Шушкин", "Битюков",
                "Косынов", "Горбунков", "Лыскин", "Соколюк" };

        int salary = random.nextInt(100, 400);
        int age = random.nextInt(18, 65);
        int labour_quantity = random.nextInt(4, 1600);
        return new Freelancer(
                surnames[random.nextInt(surnames.length)],
                names[random.nextInt(names.length)],
                salary, labour_quantity, age);
    }

    public static ShiftWorker generateShiftWorker() {
        String[] names = new String[] { "Семен", "Сергей", "Иван", "Лука", "Николай", "Станислав", "Порфирий", "Марк",
                "Руслан", "Даниил" };
        String[] surnames = new String[] { "Пупкин", "Мамкин", "Кошкин", "Плошкин", "Шишкин", "Снежкин", "Крысин",
                "Мосин", "Ляжкин", "Соскин" };

        int salary = random.nextInt(3000, 5000);
        int age = random.nextInt(18, 65);
        int labour_quantity = random.nextInt(1, 25);
        return new ShiftWorker(
                surnames[random.nextInt(surnames.length)],
                names[random.nextInt(names.length)],
                salary, labour_quantity, age);
    }


    public static Base[] generateEmployees(int count) {
        Base[] workers = new Base[count];
        int type;
        for (int i = 0; i < count; i++) {
            type = random.nextInt(0, 3);
            switch (type) {
                case 0:
                    workers[i] = generateWorker();
                    break;
                case 1:
                    workers[i] = generateFreelancer();
                    break;
                case 2:
                    workers[i] = generateShiftWorker();
                    break;

            }

        }
        return workers;
    }

}
