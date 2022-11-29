---
title: If statement
type: Assignment
---

## Buatlah flowchart program untuk mencetak Bilangan Positif jika di inputkan angka lebih besar dari 0, mencetak bilangan negative jika di inputkan bilangan lebih kecil dari 0

![Diagram](/home/aya/Downloads/assignment-5.drawio.png){width=55%}

Menerapkan sistem Fail Fast atau Guard Clause, direct print value yang diinginkan jika memenuhi kriteria

sebagai penerapan : 

```c
if (value < 0) {
    printf("Bilangan negatif")
}
printf("Bilangan positif")
```
Tanpa perlu operasi berikut 
```c
if (value < 0) {
    printf("Bilangan negatif")
} else if (value > 0) {
    printf("Bilangan positif")
}
```
Dampaknya waktu eksekusi aplikasi menjadi lebih cepat serta kemudahan baca kodingan menjadi lebih mudah  
Selengkapnya bisa dibaca disini [URL](https://blog.yuuriya.tech/engineering/2022/09/18/guard-clauses/)

## Buatlah program dan flowchart denganb C++ untuk menampilkan bilangan genap dan ganjil.

![Diagram](/home/aya/Downloads/assignment-6.drawio.png){height=55%}

Usecase: Print bilangan ganjil genap dari 0 sampai 99
```c++
#include <iostream>
using namespace std;

int main(int argc, char *argv[]) {
  int value = 100;
  for (int i = 0; i < value; i++) {
    if (i % 2 == 0) {
      cout << i << " Is even" << std::endl;
      continue;
    }
    cout << i << " Is odd" << std::endl;
  }
  return 0;
}
```
