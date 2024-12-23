public class findLength {
    private ListNode head;
    private static class ListNode {
        private int  data;
        private ListNode next;

        public ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public static void findLength(ListNode head) {
        ListNode current = head;

        int count = 0;
        while (current != null) {
            count++;
            current = current.next;
        }
        System.out.println(count);
    }

    public static void main(String[] args) {
        findLength sll = new findLength();
         sll.head = new ListNode(1);
        ListNode second = new ListNode(2);
        ListNode sired = new ListNode(3);
        ListNode forth = new ListNode(4);
// we connect them together
        sll.head.next = second;
        second.next = sired;
        sired.next = forth;

        //length finder

        findLength(sll.head );

    }
}
