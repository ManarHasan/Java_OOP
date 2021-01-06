public class Bat extends Mammal{
    public Bat(){
        this.energyLevel = 300;
    }
    public void fly(){
        System.out.println("Whoosh!");
        this.energyLevel -= 50;
    }
    public void eatHumans(){
        System.out.println("Aghhhh!");
        this.energyLevel += 25;
    }
    public void attackTown(){
        System.out.println("Rustling, crackling, snapping popping, crinkling of town");
        this.energyLevel -= 100;
    }
}