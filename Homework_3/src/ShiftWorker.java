public class ShiftWorker extends Base {
    public ShiftWorker(String surName, String name, int salary, int labour_quantity, int age) {
        super(surName, name, salary, labour_quantity, age);
    }

    @Override
    public int calculateSalary() {
        return salary*labour_quantity;
    }

    @Override
    public String toString() {
        return String.format("%s %s; Посменный рабочий; Ставка за смену: %d; Количество смен: %d; Заработная плата: %d руб. Возраст: %d",
                surName, name, salary, labour_quantity, calculateSalary(), age);
    }

}

