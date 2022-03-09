import java.util.Random;
import java.util.Set;

public abstract class Animal {


    protected int age;
    protected char gender;
    protected String[] eats;
    protected int health;
    protected int lifeExpectancy;
    protected Enclosure enclosure;

    public Animal(int age, char gender, String[] eats, int health, int lifeExpectancy) {

        if(age < 0 || age >= lifeExpectancy){
            this.age = 0;
        }
        if(gender != 'm' || gender != 'f'){
            this.gender = 'm';
        }

        this.eats = eats;
        this.health = health;
        this.lifeExpectancy = lifeExpectancy;
        this.enclosure = new Enclosure();
    }



    public int getAge() {
        return age;
    }

    public char getGender() {
        return gender;
    }

    public int getLifeExpectancy() {
        return lifeExpectancy;
    }

    public void treat() {

    }

    public void eat() {

        String food = getRandomFoodName( enclosure.getFoodstore().getFoodAmount().keySet() );

        if ( canEat(food) ) {
            enclosure.getFoodstore().takeFood(food);
            increaseHealth( enclosure.getFoodstore().getHealthMap().get(food) );
            enclosure.addWaste( enclosure.getFoodstore().getWasteMap().get(food) );
        }

    }

    public boolean canEat(String foodName) {
        for (String menu : this.eats) {
            if (menu.equals(foodName)) {
                return true;
            }
        }
        return false;
    }


    public void decreasedHealth(int decreasedHealthAmount) {
        health -= decreasedHealthAmount;
    }

    public void increaseHealth(int amount) {
        health += amount;
    }

    public abstract void aMonthPasses();

    public void SetEnclosure(Enclosure enclosure){
        this.enclosure = enclosure;
    }

    private String getRandomFoodName(Set<String> foodNameSet){
        int size = foodNameSet.size();
        int item = new Random().nextInt(size);
        int i = 0;
        for(String food : foodNameSet) {
            if (i == item)
                return food;
            i++;
        }
        return "";
    }

}