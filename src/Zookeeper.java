public class Zookeeper {
    String name = "";

    public Zookeeper(String name) {
        this.name = name;
    }

    public void feedAnimals(String[] animals, String food){
        System.out.print(name + " is feeding " + food + " to " + animals.length + " animals of " + population + " total animals");
        for (int i = 0; i < animals.length; i++){
            animals[i].eat(food);
        }
    }
}
