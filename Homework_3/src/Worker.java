// Рабочий на окладе, время работы с 9 до 18
public class Worker extends Base {


    public Worker(String surName, String name, int salary, int labour_quantity, int age) {
        super(surName, name, salary, labour_quantity, age);
    }

    @Override
    public int calculateSalary() {
        return salary*labour_quantity;
    }

    @Override
    public String toString() {
        return String.format("%s %s; Рабочий; Среднемесячная заработная плата: %d руб. Возраст: %d",
                surName, name, calculateSalary(), age);
    }
}
