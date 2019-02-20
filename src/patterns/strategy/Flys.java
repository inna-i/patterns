package patterns.strategy;

public interface Flys {

    String fly();

}

public class ItFlys implements Flys {

    public String fly() {
        return "Can fly high";
    }
}

public class CantFly implements Flys {

    public String fly() {
        return "I can't fly";
    }
}