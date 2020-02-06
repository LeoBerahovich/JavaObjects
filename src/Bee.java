public class Bee extends Animal {

    public Bee(String name) {
        super(name,"pollen");

    }

    public void sleep() {
        System.out.print(name + " never sleeps");
    }

    public void eat(String food) {
        System.out.print(name + " eats " + food);
        if (food.equals(favoriteFood)){
            System.out.print("Yum!!! " + name + " wants more " + food);
            sleep();
        }else{
            System.out.print("YUCK!!! " + name + " will not eat " + food);
        }
    }
}
