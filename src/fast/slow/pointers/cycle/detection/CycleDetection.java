package fast.slow.pointers.cycle.detection;

public class CycleDetection {
    public static void main(String[] args) {
        LinkedList node = new LinkedList();
        node.createLinkedList(new int[]{1,2,3,4,5,6,23,4,5,5});
        node.head.next.next.next = node.head;

//        PrintList.printListWithForwardArrow(node.head);

        LinkedListNode slow = node.head;
        LinkedListNode fast = node.head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                System.out.println("Loop found");
                return;
            }
        }
        System.out.println("Loop not found");

    }
}
