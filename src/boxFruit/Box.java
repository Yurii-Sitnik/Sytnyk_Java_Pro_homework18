package boxFruit;

import java.util.ArrayList;
import java.util.List;

public class Box<T extends Fruit> {
    List<T> boxOfFruits = new ArrayList<>();

    public void addOneFruit(T fruit) {
        boxOfFruits.add(fruit);
    }

    public void addManyFruit(int quantity, T fruit) {
        for (int i = 0; i < quantity; i++) {
            boxOfFruits.add(fruit);
        }
        System.out.println("In box "+ + boxOfFruits.size()+" "+fruit.toString());
    }

    public String getWeight() {
        Double sum = 0.0;
        for (T fruit : boxOfFruits) {
            sum += fruit.getWeight();
        }
        return sum + " total weight";
    }

    public boolean compare(Box box) {
        return this.getWeight().equals(box.getWeight());
    }

    public void merge(Box<T> box) {
        this.boxOfFruits.addAll(box.boxOfFruits);
        System.out.println(boxOfFruits);
    }
}







