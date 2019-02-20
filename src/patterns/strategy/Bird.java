package patterns.strategy;

public class Bird extends Animal {
    public Bird() {
        super();
        setName("Birdy");

        flyingType = new ItFlys(); // right way
    }

    // public void fly() {
    //     System.out.prinntln("I can fly");
    // } - can be many duplications, should be done as an interface
}