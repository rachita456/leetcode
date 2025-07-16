public class RL {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node findNthNode(Node temp, int k) {
        int count = 1;
        while (temp != null) {
            if (count == k) {
                return temp;
            }
            count++;
            temp = temp.next;
        }
        return null; // if k is out of bounds
    }

    public Node RotateList(Node head, int k) {
        if (head == null || head.next == null || k == 0) {
            return head;
        }

        Node tail = head;
        int len = 1;
        while (tail.next != null) {
            tail = tail.next;
            len++;
        }

        k = k % len;
        if (k == 0) {
            return head;
        }

        // Connect tail to head to make it circular
        tail.next = head;

        // Find the new last node
        Node newLastNode = findNthNode(head, len - k);
        Node newHead = newLastNode.next;

        // Break the circle
        newLastNode.next = null;

        return newHead;
    }

    public static void main(String[] args) {
        RL rl = new RL();

        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        Node rotated = rl.RotateList(head, 2);

        while (rotated != null) {
            System.out.print(rotated.data + " ");
            rotated = rotated.next;
        }
    }
}
