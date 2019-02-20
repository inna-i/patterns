package patterns.strategy;

public class Dog extends Animal {

    public Dog() {
        super();

        setName("Rex");

        flyingType = new CantFly(); // right way
    }

    public void digHole() {
        System.out.println("Dag a hole");
    }
}