---
title: "Final Term Exam"
author: "Pramudya Arya Wicaksana"
---

## Double linked list schema

Buatlah Skema Double Linked List untuk Menghapus dan Menyisipkan Simpul/Node dari Tengah? Dengan ketentuan (Head) & (Head + Tail) untuk angkanya mengambil 6 digit NPM (dari belakang) masing-masing Mahasiswa?  

1. Menghapus dari tengah  

![Delete](/home/aya/Downloads/Delete.drawio.png)  

2. Menambah dari tengah  

![Insert](/home/aya/Downloads/Insert.drawio.png)  

## Array and Array list

Jelaskan perbedaan antara Array & Array List kemudian berikan contohnya dalam bentuk bahasa pemrograman Java ?

1. Perbedaan

Size: Array punya _fixed size_, sedangkan Array List mempunyai _dynamic size_  
Syntax: Pengimplementasian syntax juga berbeda, jika Array `type[] arrayName` dan jika Array List `ArrayList<type> arrayListName`  
Memory allocation: Array dialokasikan di lokasi memori yang berdekatan, sementara ArrayList menggunakan struktur data yang lebih kompleks secara internal untuk mengelola elemen-elemennya  
Type safety: ArrayList adalah Type safety, yang berarti hanya satu jenis elemen yang dapat disimpan dalam ArrayList. Array dan dapat menyimpan beberapa jenis elemen  

2. Implementasi

- Array list

```java
import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        // Initialize an ArrayList of integers
        ArrayList<Integer> numbers = new ArrayList<Integer>();

        // Add some elements to the list
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);

        // Print the list
        System.out.println("Original list: " + numbers);

        // Insert an element at the middle of the list
        numbers.add(1, 4);
        System.out.println("List after inserting element at index 1: " + numbers);

        // Remove an element from the list
        numbers.remove(2);
        System.out.println("List after removing element at index 2: " + numbers);

        // Sort the list
        numbers.sort(null);
        System.out.println("Sorted list: " + numbers);

        // Search for an element in the list
        int index = numbers.indexOf(4);
        System.out.println("Index of element 4: " + index);
    }
}
```

- Array

```java
public class ArrayExample {
    public static void main(String[] args) {
        // Initialize an array of integers
        int[] numbers = new int[3];

        // Add some elements to the array
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;

        // Print the array
        System.out.print("Original array: ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();

        // Insert an element at the middle of the array
        int[] newNumbers = new int[numbers.length + 1];
        for (int i = 0; i < numbers.length; i++) {
            if (i < 1) {
                newNumbers[i] = numbers[i];
            } else {
                newNumbers[i + 1] = numbers[i];
            }
        }
        newNumbers[1] = 4;
        numbers = newNumbers;
        System.out.print("Array after inserting element at index 1: ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();

        // Sort the array
        Arrays.sort(numbers);
        System.out.print("Sorted array: ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();

        // Search for an element in the array
        int index = -1;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == 4) {
                index = i;
                break;
            }
        }
        System.out.println("Index of element 4: " + index);
    }
}
```

## Sorting method

### Bubble sort

Contoh bubble sort menggunakan elemen __224280__ 

![Bubble sort](/home/aya/Downloads/Bubble.drawio.png)  

### Selection sort

Contoh selection sort menggunakan elemen __224280__ 

![Selection sort](/home/aya/Downloads/Selection.drawio.png)  

### Insertion sort

Contoh insertion sort menggunakan elemen __224280__ 

![Insertion sort](/home/aya/Downloads/Insertion.drawio.png)  

### Merge sort

Contoh merge sort menggunakan elemen __224280__ 

![Merge sort](/home/aya/Downloads/Merge.drawio.png)  

## Binary Tree

Buatlah pohon binari dengan menggunakan metode PreOrder,InOrder,PostOrder pada ekspresi berikut : - a b + c d + e + f g + h i + j k / * + -

### PreOrder

```
  -
 / \
a   +
   / \
  c   e
 / \   \
d   +   -
   / \   \
  f   g   h
 / \     / \
i   +   j   k
       / \
      *   /
         +
```

### InOrder

```
    +
   / \
  -   a
 /   / \
b   c   e
     / \   \
    d   +   f
       / \   \
      g   h   i
         / \   \
        j   k   *
             / \
            /   +
```

### PostOrder

```
    +
   / \
  a   -
 / \   \
b   +   e
     / \   \
    c   d   -
           / \   \
          f   g   h
         / \     / \
        i   +   j   k
               / \
              *   /
                 +
```


## Hash

Diketaui deret angka (key) : 48, 61, 27, 7, 71, 68, 34, 30, XX (2 digit paling belakang NPM) dengan kapasitas 12 dan faktor blocking=2 maka gambarkan fungsi hashnya

Hash function untuk capacity 12 dan block function 2 adalah `hash(key) = (key % 12) / 2`, maka penyelesaiannya adalah

hash(key) = (key % 12) / 2

`11 2 6 1 5 4 8 7 1 4`
