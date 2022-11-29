---
title: Input output algorithm in C
type: Assignment
---

## Susunlah program untuk mencetak empat buah bilangan bulat kemudian mencetak total keempat buah bilangan tersebut!

```c
#include <stdio.h>
void addition(int number, int times) {
  for (int i = 0; i < times; i++) {
    printf("Number %d\n", number);
    number++;
  }
  printf("Total %d\n", number);
}

int main(int argc, char *argv[]) {
  addition(10, 4);
  return 0;
}
```

```bash
~> gcc assignment-5.c
~> ./a.out
Number 10
Number 11
Number 12
Number 13
Total 14

[Process exited 0]
```

## Jika diketahui nilai X=7, Y=5, Z=3. Berapa isi X, Y, dan Z jika dikenai instruksi sebagai berikut: a. Z = Y b. Z=Z+X c. Z=Z-X*Y d. Z=X%Y

1. 5
2. 10
3. -32
4. 2
