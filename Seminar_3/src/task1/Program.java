package task1;

public class Program {
    public static void main(String[] args){

        Animal[] animals = {
                new Cat("Барсик", 1000, 0),
                new Dog("Шарик", 200, 300),
                new Cat("Персик", 3000, 0),
                new Dog("Тузик", 200,100),
                new Dog("Дружок", 400, 4000)
        };


        for (Animal a : animals){
            a.run(200);
            a.swim(10);
            a.run(1200);
            a.swim(210);
            a.run(3200);
            a.swim(210);
            a.run(2200);
            a.swim(150);
        }

        System.out.printf("Было создано %s животных\n", Animal.getCounter());
        System.out.printf("Было создано %s кошек\n", Cat.getCounter());
        System.out.printf("Было создано %s собак\n", Dog.getCounter());
    }
}
