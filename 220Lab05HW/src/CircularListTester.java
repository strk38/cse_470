//import java.util.*; 
public class CircularListTester{
    public static void printList(Node h){
        //TO DO
        System.out.println(h.element);
        for(Node i = h.next;i!=h;i=i.next){
            System.out.println(i.element);
        }
    }
    public static void main(String [] args){
        System.out.println("\n/////  Test 01  /////");
        int [] a1 = {10,20,30,40};
        CircularList h1 = new CircularList(); // Creates a linked list using the values from the array
        // head will refer to the Node that contains the element from a[0]
        h1.buildFromArray(a1,1,4);
        printList(h1.head);

        System.out.println("\n/////  Test 02  /////");
        CircularList h2 = new CircularList();

        h2.buildFromList(h1.head);
        printList(h2.head);

        System.out.println("\n/////  Test 03  /////");
        h2.buildReverse();
        printList(h2.head);

        System.out.println("\n/////  Test 04  /////");
        h2.addElement(60,2);
        printList(h2.head);
        h2.addElement(70,8);
        printList(h2.head);
        h2.addElement(70,-3);
        printList(h2.head);

        System.out.println("\n/////  Test 05  /////");
        h2.deleteElement(2);
        printList(h2.head);
        h2.deleteElement(8);
        printList(h2.head);
        h2.deleteElement(-3);
        printList(h2.head);
    }
}