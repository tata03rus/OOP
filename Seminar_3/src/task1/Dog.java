package task1;

public class Dog extends Animal{

    private static int counter;

    public static int getCounter(){
        return counter;
    }
    public Dog(String name, int maxRun, int maxSwim) {
        super(name, maxRun, maxSwim);
        counter++;
    }


}
