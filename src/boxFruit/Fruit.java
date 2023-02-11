package boxFruit;

public class Fruit {

    private final float weight;

    public Fruit(float weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "{" + weight + " g}";
    }

    public float getWeight() {
        return weight;
    }
}


