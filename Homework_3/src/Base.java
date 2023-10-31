public abstract class Base implements Comparable<Base>{

    @Override
    public int compareTo(Base o) {
        int surNameRes = surName.compareTo(o.surName);
        if (surNameRes == 0){
            return name.compareTo(o.name);
        }
        return surNameRes;
    }

    public Base(String surName, String name, int salary, int labour_quantity, int age) {
        this.name = name;
        this.surName = surName;
        this.salary = salary;
        this.labour_quantity = labour_quantity;
        this.age = age;
    }

    /**
     * Имя
     */
    protected String name;

    /**
     * Фамилия
     */
    protected String surName;

    /**
     * Ставка заработной платы
     */
    protected int salary;

    protected int labour_quantity;

    protected int age;

    /**
     * Расчет среднемесячной заработной платы
     * @return заработная плата в месяц
     */
    public abstract int calculateSalary();

    @Override
    public String toString() {
        return String.format("%s %s; ставка: %.2d руб.; заработная плата: %.2d руб.",
                surName, name, salary, calculateSalary());
    }
}