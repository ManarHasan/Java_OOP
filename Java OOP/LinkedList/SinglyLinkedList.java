public class SinglyLinkedList {
    public Node head;
    public SinglyLinkedList() {
        this.head = null;
    }
    public void add(int value) {
        Node newNode = new Node(value);
        if(head == null) {
            head = newNode;
        } else {
            Node runner = head;
            while(runner.next != null) {
                runner = runner.next;
            }
            runner.next = newNode;
        }
    }
    public void remove(){
        if(head != null) {
            Node runner = head;
            while(runner.next.next != null) {
                runner = runner.next;
            }
            runner.next = null;
        }
    }
    public String printValues(){
        if(head != null){
            Node runner = head;
            String s = "";
            while(runner != null) {
                s += runner.value+", ";
                runner = runner.next;
            }
            return s;
        }
        return "Head is null";
    }
    public Node find(int val){
        Node runner = head;
        while(runner.next != null) {
            if(runner.value == val){
                return runner;
            }
            runner = runner.next;
        }
        return null;
    }
    public void removeAt(int n){
        if(this.head != null){
            if(n == 0){
                this.head = this.head.next;
            }
            int counter = 1;
            Node runner = head;
            while(runner.next != null) {
                if(n == counter){
                    runner.next = runner.next.next;
                    return;
                }
                counter ++;
                runner = runner.next;
            }
        return;
        }
    }
}
