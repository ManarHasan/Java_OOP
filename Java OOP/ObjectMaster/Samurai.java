public class Samurai extends Human{
    static int counter = 0;
    public Samurai(){
        this.health = 200;
        counter += 1;
    }
    public void deathBlow(Human human){
        human.health = 0;
        this.health *= 0.5;
    }
    public void meditate(){
        this.health += (this.health*0.5);
    }
    public void howMany(){
        System.out.println(counter);
    }
}