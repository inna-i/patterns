package patterns;

public class Main {

    public static void main(String[] args) {
        /* USE Strategy:
        - When you wan to define a class that will have one behavior that 
            is similar to other behaviors in the list
        - When you need to use one of several behaviors dinamically  
        */
        /* Strategy means: 
        - reduce long list of conditions
        - avoids duplicate code
        - keep class changes from forcing other class changes
        - can hide compliceted/secret code from users
        Negative: Increased Number of Objects/Classes 
        */  
        System.out.println("Test strategy");

        Animal rex = new Dog();
        Animal tweety = new Bird();

        System.out.println("Dog: " + rex.tryTofly());
        System.out.println("Bird: " + tweety.tryTofly());
        
        rex.setFlyingAbility(new ItFlys()); // chnaged in runtime

        System.out.println("Dog with wings: " + rex.tryTofly());

    }
}
