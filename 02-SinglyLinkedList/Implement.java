public class Implement {
    private ListNode Head;

    private static class ListNode{
        private int data;
        private ListNode next;

        public ListNode(int data){
            this.data = data;
            this.next = null;
        }
    }
    public void display(){
        ListNode current = Head;
        while (current != null) {
            System.out.print(current.data + "--->");
            current = current.next;
        }
        System.out.print("null");
    }
    public static void main(String[] args) {
        Implement sll = new Implement();
        sll.Head = new ListNode(1);
         ListNode second = new ListNode(2);
         ListNode sired = new ListNode(3);
         ListNode forth = new ListNode(4);
// we connect them together
         sll.Head.next = second;
         second.next = sired;
         sired.next = forth;
         //print

        sll.display();
    }
}
