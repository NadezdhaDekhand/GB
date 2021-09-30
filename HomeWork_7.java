/** Home work 7
 * author Nadezhda Dekhand
 * version: 30.09.2021
 */
public class HomeWork_7 {
    public static void main(String[] args) {
        Cat[] cats = {
                new Cat("Сарделька", 10),
                new Cat("Василий", 20),
                new Cat("Пушок", 40)};

        Plate plate = new Plate(80, 60);
        for (Cat cat : cats) {
            System.out.println(cat);
        }
        System.out.println(plate);
        for (Cat cat : cats) {
            cat.eat(plate);
            System.out.println(cat);
        }

        System.out.println(plate);
        plate.addFood(40);
        System.out.println("Добавлен корм ...");
        System.out.println(plate);

        for (Cat cat : cats) {
            cat.setFullness(false);
            cat.eat(plate);
            System.out.println(cat);
        }
        System.out.println(plate);
    }
}

class Cat {
    protected String name;
    protected int appetite;
    protected boolean satuery;

    Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        satuery = false;
    }

    boolean setFullness(boolean status) {
        satuery = status;
        return status;
    }

    void eat(Plate plate) {
        if (!satuery)
            satuery = plate.decreaseFood(appetite);
        if (satuery)
            satuery = plate.decreaseFood(appetite = 0);
    }

    @Override
    public String toString() {
        return name + ", " + "аппетит: " + appetite +
                ", сытость: " + satuery;
    }
}

class Plate {
    protected int volume;
    protected int food;

    Plate(int volume, int food) {
        this.volume = volume;
        this.food = food;
    }

    boolean decreaseFood(int portion) {
        if (food < portion) return false;
        food -= portion;
        return true;
    }

    void addFood(int food) {
        if (this.food + food <= volume)
            this.food += food;
    }

    @Override
    public String toString() {
        return "Корм " + food;
    }
}
