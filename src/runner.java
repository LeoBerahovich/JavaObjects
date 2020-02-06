//sorry for the errors. I was unable to figure out how it was wrong.

public class runner {
    String[] animals;
    Tiger tigger = new Tiger("Tigger");
    animals.append(tigger);
    Bear pooh = new Bear("Pooh");
    animals.append(pooh);
    Unicorn rarity = new Unicorn("Rarity");
    animals.append(rarity);
    Giraffe gemma = new Giraffe("Gemma");
    animals.append(gemma);
    Bee stinger = new Bee("Stinger");
    animals.append(stinger);

    Zookeeper Zoebot = new Zookeeper("Zoebot");
    Zoebot.feedAnimals(animals);

}
