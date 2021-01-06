public class Gorilla extends Mammal{
    public void throwSomething(){
        System.out.println("Gorilla threw something!");
        this.energyLevel -= 5;
    }
    public void eatBananas(){
        System.out.println("Gorilla is very satisfied with the meal");
        this.energyLevel += 10;
    }
    public void climb(){
        System.out.println("Gorilla climbed something!");
        this.energyLevel -= 10;
    }
}