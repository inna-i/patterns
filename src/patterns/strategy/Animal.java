public class Animal {
    public String name;
    public String favMeal; 

    public Flys flyingType; // instance variable


    public void setName(String animalName) {
        name = animalName;
    };
    public String getName() { return name; };
    

    public void setFavFood(String meal) {
        favMeal = meal;
    };
    public String getFavFood() {
        return favMeal;
    };

    // public void fly() {
    //     System.out.prinntln("I can fly")
    // } - should not be in superclass, as it's not common and used only in Bird oriented class
    //
    // right way =>

    public String tryToFly() {
        return flyingType.fly();
    }

    public void setFlyingAbility(Flys newFlyType) {
        flyingType = newFlyType;
    }

}