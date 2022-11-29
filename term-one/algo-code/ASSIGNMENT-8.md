---
title: "For and While loop"
type: "Assignment"
---

## For

```c++
#include <iostream>
#include <stdio.h>

using namespace std;

int main(int argc, char *argv[]) {
  std::cout << "Genap ";
  for (int i = 0; i < 40; i++) {
    if (i % 2 == 0) {
      std::cout << i << " ";
      continue;
    }
  }
  std::cout << "" << std::endl;
  std::cout << "Ganjil ";
  for (int i = 0; i < 40; i++) {
    if (i % 2 == 1) {
      std::cout << i << " ";
      continue;
    }
  }
  return 0;
}
```

## While

```c++
#include <iostream>
#include <stdio.h>

using namespace std;

int main(int argc, char *argv[]) {
  std::cout << "Genap ";
  int i = 1;
  while (i <= 40) {
    if (i % 2 == 0) {
      std::cout << i << " ";
    }
    i++;
  }
  std::cout << "" << std::endl;
  std::cout << "Ganjil ";
  int j = 1;
  while (j <= 40) {
    if (i % 2 == 1) {
      std::cout << j << " ";
    }
    j++;
  }
  return 0;
}
```
