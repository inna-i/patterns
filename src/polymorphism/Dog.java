package polymorphism;

public class Dog implements Living {
    protected String meal;
    protected int speed;
    protected boolean likePlaying;

    @Override
    public void setFavFood(String newMeal) {
        meal = newMeal;
    };
    @Override
    public String getFavFood() { return favMeal; };
    
    @Override
    public void setSpeed(int newSpeed) {
        speed = newSpeed;
    };
    @Override
    public int getSpeed() { return speed; };
    
    @Override
    public void setLikePlaying(Boolean newLikePlaying) {
        likePlaying = newLikePlaying;
    };
    @Override
    public boolean getLikePlaying() { return likePlaying; };

}