package polymorphism;

public class Cat extends Creature {
    private String name;
    private int weight;
    private int age;

    @Override
    public String getName() { return name; };

    @Override
    public void setName(String creatureName) {
        name = creatureName;
    };
    

    @Override
    public int getWeight() { return weight; };

    @Override
    public void setWeight(int creatureWeight) {
        weight = creatureWeight;
    };
    

    @Override
    public int getAge() { return age; };

    @Override
    public void setAge(int creatureAge) {
        age = creatureAge;
    };
}