//node structure
class Node {
    int data;
    Node next;
};

class LinkedList {
  Node head;
  //constructor to create an empty LinkedList
  LinkedList(){
    head = null;
  }
void PrintList() {

  //1. create a temp node pointing to head
  Node temp = new Node();
  temp = this.head;

  //2. if the temp node is not null continue 
  //   displaying the content and move to the 
  //   next node till the temp becomes null
  if(temp != null) {
    System.out.print("The list contains: ");
    while(temp != null) {
      System.out.print(temp.data + " ");
      temp = temp.next;
    }
    System.out.println();
  } else {
    
    //3. If the temp node is null at the start, 
    //   the list is empty
    System.out.println("The list is empty.");
  }
}
//Add new element at the end of the list
void push_back(int newElement) {
  
  //1. allocate node
  Node newNode = new Node();
  
  //2. assign data element
  newNode.data = newElement;
  
  //3. assign null to the next of new node
  newNode.next = null; 
  
  //4. Check the Linked List is empty or not,
  //   if empty make the new node as head 
  if(head == null) {
    head = newNode;
  } else {
    
    //5. Else, traverse to the last node
    Node temp = new Node();
    temp = head;
    while(temp.next != null)
      temp = temp.next;
    
    //6. Change the next of last node to new node
    temp.next = newNode;
  }    
}

public int get(int index) {
        if (head == null) {
            throw new IndexOutOfBoundsException("List is empty");
        }
        if (index < 0) {
            throw new IndexOutOfBoundsException("Index cannot be negative");
        }
        Node current = head;
        int currentIndex = 0;
        while (current != null) {
            if (currentIndex == index) {
                return current.data;
            }
            current = current.next;
            currentIndex++;
        }
        throw new IndexOutOfBoundsException("Index is out of bounds");
    }

};

// test the code 
public class Implementation { 
  public static void main(String[] args) {
     LinkedList MyList = new LinkedList();
     System.out.println(MyList.head);
  //Add five elements in the list.
    MyList.push_back(100);
    MyList.push_back(10);
    MyList.push_back(20);
    MyList.push_back(3);
    MyList.push_back(40);
    MyList.push_back(50);
    //Display the content of the list.
    MyList.PrintList();
    System.out.println(MyList.get(4));
  }
}