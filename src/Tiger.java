public class Tiger extends BigCat {


    public Tiger(int age, char gender, String[] eats, int health, int lifeExpectancy) {
        super(age, gender, health);
    }

    @Override
    public void aMonthPasses() {
        eat();
        decreasedHealth(2);
        age++;
    }


    @Override
    public void treat() {

        increaseHealth(3);
    }


}
