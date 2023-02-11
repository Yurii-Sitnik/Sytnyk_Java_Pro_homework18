package boxFruit;

public class Main {
    public static void main(String[] args) {
        Box<Apple> appleBox1 = new Box<>();
        Box<Apple> appleBox2 = new Box<>();

        Apple apple = new Apple(1.0f);
        appleBox1.addOneFruit(apple);
        appleBox1.addManyFruit(8,apple);
        appleBox2.addManyFruit(6,apple);
        System.out.println(appleBox1.getWeight());

        Box<Orange>orangeBox = new Box<>();
        Orange orange = new Orange(1.5f);
        orangeBox.addOneFruit(orange);
        orangeBox.addManyFruit(3,orange);
        System.out.println(orangeBox.getWeight());

        System.out.println(appleBox1.compare(appleBox2));
        System.out.println(appleBox2.compare(orangeBox));

        Box<Apple> appleBox3 = new Box<>();
        appleBox2.merge(appleBox3);

    }
}
