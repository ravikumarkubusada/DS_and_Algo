package fast.slow.pointers.middle.node.linkedlist;

public class MiddleNode {
    public static void main(String[] args) {
        LinkedList<Integer> node = new LinkedList<>();
        node.createLinkedList(new int[]{1,2,3,4,5,6});

        LinkedListNode fast = node.head;
        LinkedListNode slow = node.head;


        while (fast !=null && fast.next !=null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        System.out.println(slow.data);
    }
}
