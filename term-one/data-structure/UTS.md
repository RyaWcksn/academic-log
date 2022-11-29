---
title: |
    Ujian Tengah Semester
    ![](Sekolah Tinggi Manajemen Informatika dan Komputer AMIK Bandung.png){width=5in}  
subtitle: STMIK AMIK Bandung
author: |
    Pramudya Arya Wicaksana </br>
    2242805
toc: true
numbersections: true
---

\newpage{}

# Pertanyaan pertama

## Soal
Jelaskan mengenai Struktur Data, Manfaat, Jenis, berikut contoh Struktur Data ?

## Jawab
Struktur data merupakan sebuah format untuk mengorganisasi data, mengolah data, menerima dan menyimpan data, manfaatnya kita bisa mengelola data lebih baik sehingga bisa mencapai time complexity $O(N^2)$, jenis dari data struktur dikategorikan menjadi beberapa jenis, beberapa tipe data yang wajib diketahui oleh Software Engineer adalah 

1. Heap
2. Linkedlist
3. Stack
4. Queue
5. Binary tree
6. Array

# Pertanyaan kedua

## Soal
Bagaimana hubungan antara struktur data dengan algoritma dalam pembuatan program, jelaskan?

## Jawab
Korelasi hubungan antara struktur data dengan algoritma adalah setiap algoritma pasti memiliki struktur data agar membuat sebuah algoritma tersebut menjadi efektif dan efisien, serta dapat memempercepat development sebuah aplikasi, seperti contoh jika ingin membuat algoritma Fibonacci, jika menggunakan binary tree akan menjadi mudah

# Pertanyaan ketiga

## Soal
Jelaskan mengenai struktur data array, Single Linked List, Double Linked List, Stack, Queue, deQueue serta gambarkan ilustrasi berikut contohnya ?

## Jawab

### Array
Array merupakan kumpulan data dari suatu tipe data  

![Array](https://docs.oracle.com/javase/tutorial/figures/java/objects-tenElementArray.gif)

Contoh penggunaan array adalah saat kita ingin mengelompokan suatu data

### Single linked list
Single linked list merupakan sekumpulan data atau _Node_ yang saling terhubung dengan node lain menggunakan pointer, single linked list hanya memiliki 1 arah, dari head ke tail (kiri ke kanan)

![Single linked list](https://unydevelopernetwork.com/wp-content/uploads/2020/04/image-21.png)

Contoh penggunaan single linked list adalah saat kita ingin implementasi Stack dan Queue

### Double linked list
Double Linked List adalah suatu linked list yang mempunyai 2 penunjuk yaitu penunjuk ke simpul sebelumnya dan ke simpul berikutnya

![Double linked list](https://socs.binus.ac.id/files/2017/03/rini-8.jpg)

Contoh penggunaan double linked list adalah saat kita ingin implementasi Music player

### Stack
Stack merupakan data struktur yang memiliki sifat __LIFO__ atau Last In First Out, data pertama dari Stack akan masuk paling bawah lalu dilanjutkan dengan data berikutnya diatas data yang sudah dimasukan, jika ingin mengeluarkan data maka data yang terakhir dimasukan atau paling atas akan keluar pertama

![Stack](https://static.studytonight.com/data-structures/images/stack-data-structure.png)

Contoh penggunaan stack adalah saat kita menyusun sebuah Undo History

### Queue
Stack merupakan data struktur yang memiliki sifat __FIFO__ atau First In First Out, data pertama dari Stack akan masuk paling depan lalu dilanjutkan dengan data berikutnya dibelakang data yang sudah dimasukan, jika ingin mengeluarkan data maka data yang pertama dimasukan atau paling depan akan keluar pertama

![Queue](https://media.geeksforgeeks.org/wp-content/uploads/20220805131014/fifo.png)

Contoh penggunakan queue adalah saat kita akan pub sub ke message broker

### Dequeue
Dequeue merupakan data struktur linear yang memiliki 2 ujung, bedanya dengan Queue adalah jika queue hanya bisa memasukan dari satu arah maka dequeue bisa memasukan dan mengeluarkan data dari arah manapun depan maupun belakang

![Dequeue](https://media.geeksforgeeks.org/wp-content/uploads/anod.png)


# Pertanyaan keempat

## Soal
Diketahui ekspresi infix seperti berikut : (05*((10-5)(2-1)(2+5))/2) Ubahlah ke dalam bentuk postfix dan hitunglah nilainya?

## Jawab
Postfix := 05 10 5 - 2 1 - 2 5 + * 2 /
Nilai := (((2-1)*(2+5))/2) = 3.5

# Pertanyaan kelima

## Soal
Diketahui deret angka : 05 , 90, 67, 80, 101 Susun angka tersebut menjadi Priority Queue Ascending dan Lakukan operasi berikut : poll(), add(102), poll(), add(82)

## Jawab
```java
import java.util.*;
 
class QueuePriority {
 
    public static void main(String args[])
    {
        PriorityQueue<Integer> queue = new PriorityQueue<Integer>();
 
        queue.add(05);
        queue.add(90);
        queue.add(67);
        queue.add(80);
        queue.add(101);
 
        Integer val = null;
        while( (val = queue.poll()) != null) {
            System.out.println(val);
        }
        queue.poll();
        queue.add(102);
        queue.poll();
        queue.add(82);
        while( (val = queue.poll()) != null) {
            System.out.println(val);
        }
    }
}
```

```bash
~ > cd "/home/aya/Sandbox/Java-Projects/" && javac QueuePriority.java && java QueuePriority
5
67
80
90
101
82
~ >
```
