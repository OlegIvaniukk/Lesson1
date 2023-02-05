package HW5;

public class Animal {
    int eyes;

    void eat() {
        System.out.println("Animal eats");
    }

    void drink() {
        System.out.println("Animal drinks");
    }

    Animal() {
        System.out.println("I am animal");
    }

    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.eat();
        animal.drink();
    }
}

class Pet extends Animal {
    int tail = 1;
    int paw = 4;

    void run() {
        System.out.println("Pet runs");
    }

    void jump() {
        System.out.println("Pet jumps");
    }

    Pet() {
        eyes = 2;
        System.out.println("I am pet");
    }

    public static void main(String[] args) {
        Pet pet = new Pet();
        pet.run();
        pet.jump();
    }
}

class Cat extends Pet {
    String name;

    void sleep() {
        System.out.println("Cat sleeps");
    }

    Cat(String name) {
        this.name = name;
        System.out.println("I am cat and my name is " + name);
    }

    Cat() {

    }

    public static void main(String[] args) {
        Cat cat = new Cat("Kitty");
        cat.sleep();
    }
}

class Dog extends Pet {
    String name;

    void play() {
        System.out.println("Dog plays");
    }

    public Dog(String name) {
        this.name = name;
        System.out.println("I am dog and my name is " + name);
    }

    Dog() {
        System.out.println("Dog has " + paw + " paws and " + tail + " tail");
    }

    public static void main(String[] args) {
        Dog dog = new Dog("Bob");
        dog.play();
    }
}

class Test {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        cat.sleep();
    }
}
