package polymorphism;

public class Main {

    public static void main(String[] args) {
    
        Cat tom = new Cat();
        tom.setName("Tom");
        tom.setWeight(10);
        tom.setAge(3);

        System.out.println(tom.getName());
    }
}
