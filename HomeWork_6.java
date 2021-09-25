/** Home work 6
 * author Nadezdha Dekhand
 * version: 25.09.2021
 */
public class HomeWork_6 {
    public static void main(String[] args) {
        Cat cat = new Cat("Barsik", 0, 2);

        Dog dog = new Dog("Bobik", 200, 4);

        IAnimal[] animals = {cat, dog};
        for (IAnimal animal : animals) {
            animal.swim();
            animal.run();
            System.out.println();
        }
    }
}

class Cat extends Animal {
    static int runMax = 200;
    static int swimMax = 0;

    Cat(String name, int run, int swim) {
        super(name, run, swim);
    }

    public void swim() {
        System.out.println(name + " не умеет плавать");
    }

    public void run() {
        if (run < runMax && run >= 0) {
            System.out.println(name + " пробежал " + run + " м");
        } else {
            System.out.println(name + " не смог пробежать " + run + " т.к дистанция имеет " + runMax + " метров ");
        }
    }
}

class Dog extends Animal {
    static int runMax = 500;
    static int swimMax = 10;

    Dog(String name, int run, int swim) {
        super(name, run, swim);
    }

    public void swim() {
        if (swim < swimMax && swim >= 0) {
            System.out.println(name + " проплыл " + swim + " м");
        } else {
            System.out.println(name + " не смог проплыть " + swim + "  т.к дистанция имеет " + swimMax + " метров");
        }
    }

    public void run() {
        if (run < runMax && run >= 0) {
            System.out.println(name + " пробежал " + run + " м");
        } else {
            System.out.println(name + " не смог пробежать " + run + " т.к дистанция имеет " + runMax + " метров  ");
        }
    }
}

abstract class Animal implements IAnimal {
    protected String name;
    protected int run;
    protected int swim;

    Animal(String name, int run, int swim) {
        this.name = name;
        this.run = run;
        this.swim = swim;
    }

    public String toString() {
        return name + " ," + run + " ," + swim;
    }
}

interface IAnimal {
    void swim();
    void run();
}
