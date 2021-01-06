import java.util.ArrayList;
public class Portfolio{
    ArrayList<Project> projects;
    public Portfolio(){
        this.projects = new ArrayList<Project>();
    }
    public void setProject(Project proj){
        this.projects.add(proj);
    }
    public ArrayList<Project> getProjects(){
        return this.projects;
    }
    public double getPortfolioCost(){
        double sum = 0;
        for(Project proj : projects){
            sum += proj.cost;
        }
        return sum;
    }
    public String showPortfolio(){
        String all = "";
        for(Project proj : projects){
            all += proj.name+" "+proj.description+" "+proj.cost+" ";
        }
        return all;
    }
}