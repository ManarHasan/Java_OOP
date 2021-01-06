import java.util.ArrayList;
public class Exceptions{
    public ArrayList<Object> list(){
        ArrayList<Object> myList = new ArrayList<Object>();
        myList.add("13");
        myList.add("hello world");
        myList.add(48);
        myList.add("Goodbye World");
        return myList;
    }
    public void errorMessage(){
        ArrayList<Object> myList = list();
        for(int i = 0; i<myList.size(); i++){
            Integer castedValue = (Integer) myList.get(i);
        }
    }
}