public class Lion extends BigCat {


    public Lion(int age, char gender, int health) {
        super(age, gender, health);
    }


    @Override
    public void treat() {
        increaseHealth(2);
        if(health > 10){
            health = 10;
        }
        System.out.println("Lion has been stroked");
    }

    @Override
    public void aMonthPasses() {
        decreasedHealth(2);
        eat();
    }

}


