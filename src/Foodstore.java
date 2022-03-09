import java.util.HashMap;
import java.util.Map;

public class Foodstore {

    private Map<String, Integer> foodAmount = new HashMap<>();
    private Map<String, Integer> healthMap = new HashMap<>();
    private Map<String, Integer> wasteMap = new HashMap<>();

    public Foodstore( Map<String, Integer> foodAmount ) {
        this.foodAmount = foodAmount;

        healthMap.put("steak", 3);
        healthMap.put("hay", 1);
        healthMap.put("fruit", 2 );
        healthMap.put("celery", 0);
        healthMap.put("fish", 3);
        healthMap.put("ice cream", 1);

        wasteMap.put("hay", 4);
        wasteMap.put("steak", 4);
        wasteMap.put("fruit", 3);
        wasteMap.put("celery", 1);
        wasteMap.put("fish", 2);
        wasteMap.put("ice cream", 3);

    }

    public void addFood(String foodName, Integer amount) {
        if (foodAmount.containsKey(foodName)) {
            if (amount > 0) {
                foodAmount.put(foodName, foodAmount.get(foodName) + amount);
            } else {
                System.out.println("amount must be greater than zero");
            }
        } else {

            System.out.println("There is no food in this type...");

        }
    }

    public void takeFood (String foodName){
        if (foodAmount.containsKey(foodName)) {
            if (foodAmount.get(foodName) > 0) {
                foodAmount.put(foodName, foodAmount.get(foodName) - 1);
            }
            else{
                System.out.println(foodName + " not enough food at store");
            }
        }
        else {
            System.out.println("There is no food in this type...");
        }
    }


    public Map<String, Integer> getFoodAmount() {
        return foodAmount;
    }

    public void setFoodAmount(Map<String, Integer> foodAmount) {
        this.foodAmount = foodAmount;
    }

    public Map<String, Integer> getHealthMap() {
        return healthMap;
    }

    public void setHealthMap(Map<String, Integer> healthMap) {
        this.healthMap = healthMap;
    }

    public Map<String, Integer> getWasteMap() {
        return wasteMap;
    }

    public void setWasteMap(Map<String, Integer> wasteMap) {
        this.wasteMap = wasteMap;
    }
}
