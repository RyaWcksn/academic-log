---
title: "FINAL TERM EXAM"
author: "Pramudya Arya Wicaksana"
---

## Explain code logic

### a

Mencari bilangan terbesar dari 3 variable `x` `y` dan `z`, dengan menggunakan nested if-else statement dengan logika jika x lebih besar dari y jika iya melakukan perbandingan kembali jika x lebih besar dari z jika iya maka x terbesar jika tidak z terbesar, jika x tidak lebih besar dari y masuk ke perbandingan berikutnya jika y lebih besar dari z maka y terbesar jika tidak z terbesar

### b 

Melakukan switch case operation dengan mencari index hari, dijabarkan variable day = 3, melakukan switch case jika case = 3 akan menampilkan hari rabu

### c

Melakukan perbandingan umur dan adalah seorang pelajar, jika umur lebih dari 21 dan bukan pelajar maka boleh voting dan minum, jika umur 18 dan pelajar maka hanya bisa voting, jika diluar itu tidak bisa voting dan minum

### d

Melakukan pengulangan untuk array 2D terdiri dari 4 jajar dan 3 baris, melakukan 2x for loop nested, 3 kali pengulangan baris, 4 kali engulangan jajar, setiap pengulangan jajar menampilkan element element array pada baris 

## Explain logic

Pertama –tama variable interger grade dan age di inisialisasi dengan value grade = 80; dan age = 25__ 
Selanjutnya percabangan if di input dengan kondisi jika grade lebih dari atau sama dengan 60 maka output string akan dimunculkan yakni “Passed the exam” ditambah baris baru ditandai `\n`. Lalu nested if di input sebagai kondisi percabangan selanjutnya yang harus dipenuhi dengan kondisi age harus lebih dari 21, jika kondisi terpenuhi maka output string akan muncul yakni “Eligible for advanced level” ditambah baris baru ditandai `\n`. Masih di dalam percabangan nested loop yang sama tepatnya dibawah printf sebelumnya, ditambahkan lagi variable integer level. Selanjutnya ditambahkan output string “Choose your level (1 – 3): “ dan input atau scanf desimal diisi oleh variable level. Lalu ditambahkan percabangan switch dengan expression diisi variabel level, Jika ada kecocokan, blok kode terkait dijalankan. Lalu diisikan kondisi 1 dengan output string “Advanced level 1” dan baris baru, dibawahnya ditambahkan keyword break untuk menghentikan percabangan jika ada kecocokan pada kondisi yang ada. Jika tidak ada kecocokan pada kondisi yang manapun yang ada pada percabangan switch, maka keywoard default digunakan untuk kondisi yang terakhir jika tidak ada satupun yang terpenuhi.
Diluar percabangan switch ada percabangan else yang dibuat jika kondisi age tidak terpenuhi maka output string akan dimunculkan “You are still too young” ditambahkan baris baru. 
Diluar percabangan IF (Age), yakni percabangan utama IF(grade) tambahkan else untuk kondisi jika grade tidak lebih dari 60, maka output string akan dimunculkan “Failed teh exam”

![Flowchart](/home/aya/Downloads/FLOWCHART.jpg)

## Make "Hello world" loop 5 times

### For loop

```cpp
#include <iostream>

int main() {
    for (int i = 0; i < 5; i++) {
        std::cout << "Hello, World!" << std::endl;
    }
    return 0;
}
```

### While loop

```cpp
#include <iostream>

int main() {
    int i = 0;
    while (i < 5) {
        std::cout << "Hello, World!" << std::endl;
        i++;
    }
    return 0;
}
```

### Do while loop

```cpp
#include <iostream>

int main() {
    int i = 0;
    do {
        std::cout << "Hello, World!" << std::endl;
        i++;
    } while (i < 5);
    return 0;
}
```

### Nested loop

```cpp
#include <iostream>

int main() {
    for (int i = 0; i < 5; i++) {
        for (int j = 0; j < 5; j++) {
            std::cout << "Hello, World!" << std::endl;
        }
    }
    return 0;
}
```

## Make function to search bigest and smallest number

```cpp
#include <iostream>

int main() {
    int n, min, max;
    std::cout << "Enter the number of elements in the array: ";
    std::cin >> n;

    int arr[n];

    std::cout << "Enter the elements of the array: ";
    for (int i = 0; i < n; i++) {
        std::cin >> arr[i];
    }

    min = arr[0];
    max = arr[0];

    for (int i = 1; i < n; i++) {
        if (arr[i] > max) {
            max = arr[i];
        }
        if (arr[i] < min) {
            min = arr[i];
        }
    }

    std::cout << "The minimum value in the array is: " << min << std::endl;
    std::cout << "The maximum value in the array is: " << max << std::endl;
    return 0;
}
```
