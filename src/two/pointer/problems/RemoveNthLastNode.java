package two.pointer.problems;

import java.util.LinkedList;

public class RemoveNthLastNode {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);
        linkedList.add(5);

        removeNthLastNode(linkedList, 2);

        linkedList.stream().forEach(e -> System.out.println(e));

    }

    public static LinkedList removeNthLastNode(LinkedList head, int n) {
        for (int i = 0; i < head.size(); i++) {
            if(i+1 == n) {
                head.remove(i);
            }
        }

        return head;
    }
}
