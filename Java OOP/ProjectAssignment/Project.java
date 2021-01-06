import java.util.ArrayList;
public class Project{
    String name = "";
    String description = "";
    double cost = 0;
    public Project(){}
    public Project(String name){
        this.name = name;
    }
    public Project(String name, String description){
        this.name = name;
        this.description = description;
    }
    public String elevatorPitch(){
        return this.name+ "(" +this.cost+ ")" + " : " +this.description;
    }
    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getDesc(){
        return this.description;
    }
    public void setDesc(String description){
        this.description = description;
    }
    public double getCost(){
        return this.cost;
    }
    public void setCost(double cost){
        this.cost = cost;
    }
}