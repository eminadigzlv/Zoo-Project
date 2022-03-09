public class Gorilla extends Ape {


    public Gorilla(int age, char gender, String[] eats, int health, int lifeExpectancy) {
        super(age, gender, eats, health, lifeExpectancy);
    }

    @Override
    public void aMonthPasses() {
        eat();
        decreasedHealth(2);
        age++;
    }

    @Override
    public void treat() {
        increaseHealth(4);
        if(health > 10){
            health = 10;
        }
        System.out.println("Gorilla is painting");
    }
}
