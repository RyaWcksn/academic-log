---
title: "UTS - Algorithm & Programming"
author: "Pramudya Arya Wicaksana"
toi: true
type: UTS
lof: true
---

## 1. 

A. ![First](/home/aya/Downloads/UTS-1.png)   

B. ![Two](/home/aya/Downloads/UTS-2.png)  

## 2

```cpp
#include <iostream>

using namespace std;

bool isZero(int a, int b, int c) {
  if (a == 0) {
    return false;
  }
  if (b == 0) {
    return false;
  }
  if (c == 0) {
    return false;
  }
  return true;
}

string isTriangle(int a, int b, int c) {
  if (!isZero(a, b, c)) { // direct return if something is zero
    return "Bukan segitiga";
  }

  if (a != b && b != c) {
    return "Segitiga sembarang";
  }

  if (a == b && b == c) {
    return "Segitiga sama sisi";
  }

  if (b == c) {
    return "Segitiga sama kaki";
  }

  return "Invalid";
}

int main(int argc, char *argv[]) {
  int a, b, c;
  cout << "Assign A" << std::endl;
  cin >> a;
  cout << "Assign B" << std::endl;
  cin >> b;
  cout << "Assign C" << std::endl;
  cin >> c;
  std::cout << isTriangle(a, b, c) << std::endl;

  return 0;
}
```

## 3 

1. 
```cpp
#include <iostream>
using namespace std;

int validate(int n) {
  if (n > 50) {
    return n + 10;
  }
  return n + 25;
}

int main(int argc, char *argv[]) { 
    int n;
    std::cout << "Input N" << std::endl;
    std::cin >> n;
    std::cout << validate(n) << std::endl;
    return 0; 
}
```
```bash
~> g++ UTS-2.cpp
~> ./a.out
Input N
10
35

[Process exited 0]

~> g++ UTS-2.cpp
~> ./a.out
Input N
60
70

[Process exited 0]

```

2. 
```cpp
#include <iostream>
using namespace std;

int validate(int n) {
  if (n > 50) {
    n = n + 10;
  }
  return n + 10;
}

int main(int argc, char *argv[]) { 
    int n;
    std::cout << "Input N" << std::endl;
    std::cin >> n;
    std::cout << validate(n) << std::endl;
    return 0; 
}
```
```bash
~> g++ UTS-2.cpp
~> ./a.out
Input N
10
20

[Process exited 0]

~> g++ UTS-2.cpp
~> ./a.out
Input N
60
80

[Process exited 0]

```

## 4

1.
  - Nilai akan menjadi 35 karena N(25)<50
  - Nilai akan menjadi 75 karena N(50)=50 tidak lebih
  - Nilai akan menjadi 85 karena N(75)>50

2.
  - Nilai akan menjadi 35 karena N(25)<50
  - Nilai akan menjadi 60 karena N(50)=50 tidak lebih
  - Nilai akan menjadi 95 karena N(75)>50 dan setelah masuk IF dia ditambah 10
