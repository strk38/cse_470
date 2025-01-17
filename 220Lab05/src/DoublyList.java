public class DoublyList{
    public Node head;


    /* First Constructor:
     * Creates a linked list using the values from the given array. head will refer
     * to the Node that contains the element from a[0]
     */
    public DoublyList(Object [] a){
        head=new Node(null,null,null); // dummy head
        Node tail=head;
        for(int i=0;i<a.length;i++){
            Node n=new Node(a[i],null,null);
            tail.next=n;
            n.prev=tail;
            tail=n;                    //<---
        }
        tail.next=head;
        head.prev=tail;
    }

    /* Second Constructor:
     * Sets the value of head. head will refer
     * to the given LinkedList
     */
    public DoublyList(Node h){
        head = h;
    }

    /* Counts the number of Nodes in the list */
    public int countNode(){
       int count=0;
       for(Node n=head.next;n!=head;n=n.next){
           count++;
       }
        return count; // please remove this line!
    }

    /* prints the elements in the list */
    public void forwardprint(){
        // TO DO
        for(Node n=head.next;n!=head;n=n.next){
            System.out.print(n.element+" ");
        }
        System.out.println();
    }

    public void backwardprint(){
        // TO DO
        for(Node n=head.prev;n!=head;n=n.prev){
            System.out.print(n.element+" ");
        }
        System.out.println();
    }


    // returns the reference of the Node at the given index. For invalid index return null.
    public Node nodeAt(int idx){
        // TO DO

        if(idx>=0 && idx<countNode()){
            int c=0;
            for(Node n=head.next;n!=head;n=n.next){
                if(c==idx)
                    return n;
                c++;
            }
        }
        return null; // please remove this line!
    }



    /* returns the index of the Node containing the given element.
     if the element does not exist in the List, return -1.
     */
    public int indexOf(Object elem){
        // TO DO
        int idx=0;
    for(Node n=head.next;n!=head;n=n.next){
        if(n.element==elem)
            return idx;
        idx++;
    }
        return -1;
    }





    /* inserts Node containing the given element at the given index
     * Check validity of index.
     */
    public void insert(Object elem, int idx){
        // TO DO
        if(idx>=0 && idx<=countNode()){
            Node m=new Node(elem,null,null);
            Node p;
            Node s;
            if(idx==countNode()){
                s=head;
            }
            else{
                s=nodeAt(idx);
            }

            p=s.prev;
            m.prev=p;
            m.next=s;
            p.next=m;
            s.prev=m;
        }

    }




    /* removes Node at the given index. returns element of the removed node.
     * Check validity of index. return null if index is invalid.
     */
    public Object remove(int idx){
        // TO DO
        if(idx>=0 && idx<countNode()){
            Node rem=nodeAt(idx);
            Node prev=rem.prev;
            Node nxt=rem.next;
            prev.next=nxt;
            nxt.prev=prev;

            rem.next=null;
            rem.prev=null;
            return rem.element;
        }
        return null; // please remove this line!
    }



}