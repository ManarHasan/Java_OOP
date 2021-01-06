public class PhoneTester{
    public static void main(String[] args){
        Galaxy s9 = new Galaxy("s9", 100, "Verison", "Ring Ring Ring");
        IPhone sevenPlus = new IPhone("7+",99,"AT&T","RINNNNNNNNG");
        s9.displayInfo();
        sevenPlus.displayInfo();
        System.out.println(s9.ring());
    }
}