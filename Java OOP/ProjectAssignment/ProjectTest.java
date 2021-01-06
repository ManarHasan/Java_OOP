public class ProjectTest{
    public static void main(String[] args){
        Project test1 = new Project();
        Project test2 = new Project("Schneider");
        Project test3 = new Project("LG", "The best elevator");
        test1.setName("Manar");
        test1.setDesc("Your favorite elevator");
        test1.setCost(10);
        System.out.println(test1.elevatorPitch());
        System.out.println(test2.elevatorPitch());
        System.out.println(test3.elevatorPitch());
        Portfolio portfolio = new Portfolio();
        portfolio.setProject(test1);
        portfolio.setProject(test2);
        portfolio.setProject(test3);
        System.out.println(portfolio.getPortfolioCost());
        System.out.println(portfolio.showPortfolio());

    }
}