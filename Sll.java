public class Sll {

    class Node{
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }


    public Node head = null;
    public Node tail = null;


    public void addNode(int data) {

        Node newNode = new Node(data);


        if(head == null) {

            head = newNode;
            tail = newNode;
        }
        else {

            tail.next = newNode;

            tail = newNode;
        }
    }


    public void displayList() {

        Node current = head;

        if(head == null) {
            System.out.println("List is empty");
            return;
        }
        System.out.println("Nodes of singly linked list: ");
        while(current != null) {

            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {

        Sll sList = new Sll();


        sList.addNode(11);
        sList.addNode(22);
        sList.addNode(33);
        sList.addNode(44);


        sList.displayList();
    }
}

