public class Elephant extends Animal {

    public Elephant(int age, char gender, int health) {
        super(age, gender, new String[]{"hay", "fruit"}, health, 36);
    }

    @Override
    public void aMonthPasses() {

        eat();
        decreasedHealth(2);
        age++;

    }

    @Override
    public void treat() {
        increaseHealth(5);
        if(health>10){
            health = 10;
        }
        System.out.println("Tiger has been stroked");
    }
}
