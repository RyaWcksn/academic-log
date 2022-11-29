# Assigment 2

**Pramudya Arya Wicaksana**
**2242805**

## 1. 

```java
public class main {
// For more understanding how linked list works by make it from scratch
// Second assignment Data Structure, Java Linked List (Single)
// Author : Pramudya Arya Wicaksana
// NPM : 22420805

// Creating class of Nodes
    class Node {
        int data;
        Node next; 

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

// Initialize node Tail, Head, and points, null by default before add some data
    public Node head;
    public Node tail;
    public int points;

// Creating method add() for adding new data to Node with integer parameter without return anything (void)
    public void add(int data) {
// Creating new node
        Node newNode = new Node(data);

// Check head if nill, using Guard Clause method for reducing if else statement and code smell
// https://en.wikipedia.org/wiki/Fail-fast
// and also reduce Cognitive Complexity on code
// https://blog.yuuriya.tech/engineering/2022/09/18/cognitive-complexity.html
        if (head == null) {
            //If list is empty, both head and tail will point to new node    
            head = newNode;    
            tail = newNode; 
        }
        tail.next = newNode;
        tail = newNode;

    }

// TODO : Implementing method for Insert from index, Pop, Pop from index

// Creating method show() will display all the nodes present in the list
// without accepting any parameter or returning any value   
    public void show() {    
//Node current will point to head    
        Node current = head;    
            
        if(head == null) {    
            System.out.println("List is empty");    
            return;    
        }    
        System.out.println("Nodes: ");    
        while(current != null) {    
//Prints each node by incrementing pointer  
            System.out.print(current.data + " ");    
            current = current.next;    
        }    
        System.out.println();    
    }    

    
    public static void main(String[] args) {

// Initialize object
        main ll = new main();

// Using for loop to shorten the code
        for (int i = 0; i < 10; i++) {
            ll.add(i);
        }
        ll.show();
        
    }
}
```

## 2.
```java
import java.util.LinkedList;

public class main {
    // Second assignment Data Structure, Java Linked List (Single)
    // Author : Pramudya Arya Wicaksana
    // NPM : 22420805
    
    public static void main(String[] args) {
        LinkedList<String> lowLevel = new LinkedList<String>();

        lowLevel.add("Machine language");
        lowLevel.add("Assembly");

        System.out.println("Programming language low level : ");
        System.out.println(lowLevel);

        LinkedList<String> highLevel = new LinkedList<String>();

        highLevel.add("Python");
        highLevel.add("Java");
        highLevel.add("C");
        highLevel.add("C++");
        highLevel.addFirst("Golang");
        highLevel.addLast("Javascript");
        highLevel.add(2, "Typecsript");
        highLevel.add("Rust");

        System.out.println("Programming language high level : ");
        System.out.println(highLevel);

        lowLevel.addAll(highLevel);
        System.out.println("All programming language : ");
        System.out.println(lowLevel);

    }
}

```
