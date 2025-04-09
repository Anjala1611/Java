class Animal {
    private String species;
    int age;
    float weight;
    protected String color;

    public Animal(String species, int age, float weight, String color) {
        this.species = species;
        this.age = age;
        this.weight = weight;
        this.color = color;
    }

    public void display() {
        System.out.println("Animal belongs to " + species + " species, of age " + age + ", weighted " + weight + " and " + color + " in color.");
    }
}

class Dog extends Animal {
    private String name;
    private String owner;

    public Dog(String species, int age, float weight, String color, String name, String owner) {
        super(species, age, weight, color);
        this.name = name;
        this.owner = owner;
    }

    public void display() {
        super.display();
        System.out.println(name + " owned by " + owner);
    }
}

class Cat extends Animal {
    private String name;
    private int tail;
    private String eye;

    public Cat(String species, int age, float weight, String color, String name, int tail, String eye) {
        super(species, age, weight, color);
        this.name = name;
        this.tail = tail;
        this.eye = eye;
    }

    public void display() {
        super.display();
        System.out.println("The Cat " + name + " has a tail length of " + tail + " cm and " + eye + " eyes.");
    }
}

public class AnimalDemo {
    public static void main(String[] arg) {
        Cat c = new Cat("Persian", 3, 20, "White", "Bella", 6, "Blue");
        c.display();
        Dog d = new Dog("Labrador", 5, 30, "Black", "Max", "John");
        d.display();
    }
}