---
title: "Statement, Arithmetic expression and Operator"
author: "Pramudya Arya Wicaksana"
---

# 1. Explain compiled program

## First codeblock

```c++
#include <iostream>

using namespace std;
int main (int argc, char *argv[])
{
    int a = 5;
    std::cout << a+2 << std::endl;
    std::cout << a << std::endl;
    return 0;
}
```
```bash
~ > g++ main.cpp
~ > ./a.out
7
5
~ >
```

> Code diatas menjelaskan sebuah deklarasi variable `a` yang diberi value `5`
> lalu di print dengan a yang bervalue 5 ditambah dengan 2 sehingga memunculkan 7
> di line berikutnya variable a langsung di print sehingga langsung memunculkan 5 si value dari a

## Second codeblock

```c++
#include <iostream>

using namespace std;
int main (int argc, char *argv[])
{
    int a, b;
    a = 5;
    b = 2;
    a = b;
    std::cout << a << std::endl;
    std::cout << b << std::endl;
    return 0;
}
```
```bash
~ > g++ main.cpp
~ > ./a.out
2
2
~ >
```

> Code diatas menjelaskan deklarasi 2 variable `a` dan `b`
> lalu masing masing diberi value `5` dan `2`
> setelah itu value variable `a` ditukar dengan value variable `b`
> sehingga kini value dari variable `a` adalah `2`

## Third codeblock

```c++
#include <iostream>

using namespace std;
int main (int argc, char *argv[])
{
    int a, b, c;
    a = 7;
    b = (a / 2) * 2;
    c = a - b;
    std::cout << c << std::endl;
    return 0;
}
```
```bash
~ > g++ main.cpp
~ > ./a.out
1
~ >
```

> Code diatas menjelaskan deklarasi 3 variable `a`, `b`, dan `c`
> variable a dimasukin value bernilai `7`
> variable b melakukan operasi `(7 / 2) * 2` yang hasilnya `6`
> variable c melakukan operasi `7 - 6` yang hasilnya 1
> print value dari variable `c`

## Fourth codeblock

```c++
#include <iostream>

using namespace std;
int main (int argc, char *argv[])
{
    int a = 5, b = 2, c;
    c = a;
    a = b;
    b = c;
    std::cout << a << std::endl;
    std::cout << b << std::endl;
    return 0;
}
```
```bash
~ > g++ main.cpp
~ > ./a.out
2
5
~ >
```

> Code diatas menjelaskan deklarasi 3 variable `a`, `b`, dan `c`
> variable `a` berisi value `5`, dan `b` berisi `2`
> swap value dari `a` ke `c`, kini `c` memiliki value `5`
> swap value dari `b` ke `a`, kini `a` memiliki value `2`
> swap value dari `c` ke `b`, kini `b` memiliki value `5`
> print value a dan b

# 2. Arithmetic operations

## First operation

$$
    A^2 + B^2 + C^3
$$

### Code solution

```c++
#include <iostream>
#include <math.h>

using namespace std;

int main(int argc, char *argv[]) {
  int a = 10, b = 20, c = 30;
  a = pow(a, 2);
  b = pow(b, 2);
  c = pow(c, 3);
  int d = a + b + c;
  std::cout << d << std::endl;
}
```
```bash
~ > g++ main.cpp
~ > ./a.out
27000
~ >
```

## Second operation

```c++
#include <iostream>
#include <math.h>

using namespace std;

int main(int argc, char *argv[]) {
  int a = 10, b = 20, c;

  c = (a/2)+pow(b, 2);
  std::cout << c << std::endl;
}
```
```bash
~ > g++ main.cpp
~ > ./a.out
405
~ >
```
