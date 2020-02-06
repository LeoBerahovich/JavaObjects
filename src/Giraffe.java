public class Giraffe extends Animal {

    public Giraffe(String name) {
        super(name,"leaves");

    }

    public void sleep() {
        System.out.print(name + " sleeps for 8 hours");
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

