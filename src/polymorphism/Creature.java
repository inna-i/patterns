package polymorphism;

abstract class Creature {
    protected String name;
    protected int weight;
    protected byte age;

    abstract String getName();
    abstract void setName(String creatureName);

    abstract int getWeight();
    abstract void setWeight(int creatureWeight);
    
    abstract int getAge();
    abstract void setAge(int creatureAge);
}
