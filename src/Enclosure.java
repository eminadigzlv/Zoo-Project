import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Enclosure {
    protected Foodstore foodstore;
    protected int wasteAmount;

    protected Map<String, Integer> foodAmount;
    protected List<Animal> animalList = new ArrayList<>();

    public Enclosure() {

    }

    public void addAnimal(Animal animal){
        if(animalList.size()<20){
            this.animalList.add(animal);
    }
        else{
            System.out.println("Out of limit");
        }
    }

    public void removeAnimal(Animal animal){

        if(this.animalList.contains(animal)){
            this.animalList.remove(animal);
        }else{
            System.out.println("Animal isn`t found");
        }
    }

    public int getWasteAmount() {
        return wasteAmount;
    }

    public void addWaste(int wasteAmount){
        this.wasteAmount += wasteAmount;
    }

    public void removeWaste(int wasteAmount){
        this.wasteAmount -= wasteAmount;
    }


    public int getWasteSize(){
        return this.wasteAmount;
    }


    public int size(){
        return animalList.size();
    }

    public void aMonthPasses(){
        for (Animal animal: animalList)
            animal.aMonthPasses();
    }

    public Foodstore getFoodstore() {
        return foodstore;
    }


    public Enclosure(Foodstore foodstore, Map<String, Integer> foodAmount) {
        this.foodstore = foodstore;
        this.foodAmount = foodAmount;
    }

    public void addFood(String foodName, int amount){
        foodAmount.put(foodName, amount);
    }

    public void takeFood(String foodName){
        int newAmount = foodAmount.get(foodName)-1;
        foodAmount.put(foodName, newAmount);
    }

}