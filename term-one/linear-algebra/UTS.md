---
title: Ujian Tengah Semester
type: UTS
---

__PENGERJAAN UJIAN LINEAR ALGEBRA UNTUK MEMENUHI KEWAJIBAN SEMESTER 1 JURUSAN TEKNIK INFORMATIKA__  
__PENGERJAAN MENGGUNAKAN LATEX DAN TEXT EDITOR__

# Pertanyaan pertama

## Soal

![pertama](/home/aya/Pictures/Screenshots/Screenshot_Wed-02_Nov_22_22.00.png)  

## Jawab

1. $\mathbf{BA}$ = $B_{4x5} A_{4x5}$, Tidak dapat dilakukan
2. $\mathbf{AB}^\intercal$ = $A_{4x5} B^\intercal_{5x4} AB^\intercal{4x4}$, Terdefinisikan dengan ordo $\mathbf{4x4}$
3. $\mathbf{AC+D}$ = $(A_{4x5}C_{5x2}) + D_{4x2} = AC_{4x2} + D_{4x2} = AC+D_{4x2}$, Terdefinisikan dengan ordo $\mathbf{4x2}$
4. $\mathbf{E(AC)}$ = $E_{5x4}(A_{4x5}B_{4x5}) = E_{5x4}AB_{4x5} = E(AC)_{5x2}$, Terdefinisikan dengan ordo $\mathbf{5x2}$
5. $\mathbf{A-3E^\intercal}$ = $A_{4x5} - 3(E^intercal_{5x4}) = A_{4x5} - 3E^\intercal_{5x4} = A-3E^\intercal_{4x5}$, Terdefinisikan dengan ordo $\mathbf{4x5}$

# Pertanyaan kedua

## Soal

![kedua](/home/aya/Pictures/Screenshots/Screenshot_Wed-02_Nov_22_22.40.png)  

## Jawab

1. $D=\begin{bmatrix}
1 & 5 & 2 \\
-1 & 0 & 1 \\
3 & 2 & 4
\end{bmatrix}$ + $E=\begin{bmatrix}
6 & 1 & 3 \\
-1 & 1 & 2 \\
4 & 1 & 3
\end{bmatrix}$ = $\begin{bmatrix}
7 & 6 & 5 \\
-2 & 1 & 3 \\
7 & 3 & 7
\end{bmatrix}$

2. $2\begin{bmatrix}
4 & -1 \\
0 & 2
\end{bmatrix}
-\begin{bmatrix}
1 & 4 & 2 \\
3 & 1 & 5
\end{bmatrix}$  
$2\begin{bmatrix}
8 & -2 \\
2 & 4
\end{bmatrix}
-\begin{bmatrix}
1 & 4 & 2 \\
3 & 1 & 5
\end{bmatrix}$ Matrix 2B dan C tidak bisa dikurangkan karena elementnya berbeda _2x2_ & _3x2_

3. $2E=\begin{bmatrix}
6 & 1 & 3 \\
-1 & 1 & 2 \\
4 & 1 & 3
\end{bmatrix} = 
E=\begin{bmatrix}
12 & 2 & 6 \\
-2 & 2 & 4 \\
8 & 2 & 6
\end{bmatrix}$  
$-3\begin{pmatrix}
\begin{bmatrix}
1 & 5 & 2 \\
-1 & 0 & 1 \\
3 & 2 & 4
\end{bmatrix}
+\begin{bmatrix}
12 & 2 & 6 \\
-2 & 2 & 4 \\
8 & 2 & 6
\end{bmatrix}
\end{pmatrix}
=\begin{bmatrix}
-39 & -21 & -24 \\
9 & -6 & -15 \\
-33 & -12 & -30
\end{bmatrix}$

4. $2\begin{bmatrix}
3 & -1 & 1 \\
0 & 2 & 1
\end{bmatrix}
+\begin{bmatrix}
1 & 4 & 2 \\
3 & 1 & 5
\end{bmatrix}$  
$\begin{bmatrix}
6 & -2 & 2 \\
0 & 4 & 2
\end{bmatrix}
+\begin{bmatrix}
1 & 4 & 2 \\
3 & 1 & 5
\end{bmatrix}$  
$\begin{bmatrix}
7 & 2 & 4 \\
3 & 5 & 7
\end{bmatrix}$

5. $D^\intercal-E^\intercal$  
$\begin{bmatrix}
1 & -1 & 3 \\
5 & 0 & 2 \\
2 & 1 & 4
\end{bmatrix}
-\begin{bmatrix}
6 & -1 & 4 \\
1 & 1 & 2 \\
3 & 1 & 3
\end{bmatrix}
=\begin{bmatrix}
-5 & 0 & -1 \\
4 & -1 & 0 \\
-1 & 2 & 1
\end{bmatrix}$

6. $\begin{pmatrix}
\begin{bmatrix}
1 & 5 & 2 \\
-1 & 0 & 1 \\
3 & 2 & 4
\end{bmatrix}
\begin{bmatrix}
6 & 1 & 3 \\
-1 & 1 & 2 \\
4 & 1 & 3
\end{bmatrix}
\end{pmatrix}^\intercal
=\begin{pmatrix}
\begin{bmatrix}
-5 & 4 & -1 \\
0 & -1 & -1 \\
-1 & 1 & 1
\end{bmatrix}
\end{pmatrix}^\intercal$  
$\begin{bmatrix}
-5 & 0 & -1 \\
4 & -1 & 1 \\
-1 & -1 & 1
\end{bmatrix}$

7. $\begin{bmatrix}
4 & -1 \\
0 & 2
\end{bmatrix}
\begin{bmatrix}
3 & 0 \\
-1 & 2 \\
1 & 1
\end{bmatrix}$  

Element ada matrices A dan B berbeda, jadi tidak bisa dikalikan

8. $\begin{bmatrix}
3 & 0 \\
-1 & 2 \\
1 & 1
\end{bmatrix}
\begin{pmatrix}
\begin{bmatrix}
4 & -1 \\
0 & 2
\end{bmatrix}
\begin{bmatrix}
1 & 4 & 2 \\
3 & 1 & 5
\end{bmatrix}
\end{pmatrix}$  
$\begin{bmatrix}
1 & 15 & 3 \\
6 & 2 & 10
\end{bmatrix}
=\begin{bmatrix}
3 & 45 & 9 \\
11 & -11 & 19 \\
7 & 17 & 13
\end{bmatrix}$

9. $\begin{bmatrix}
1 & 4 & 2 \\
3 & 1 & 5
\end{bmatrix}
\begin{bmatrix}
3 & 0 \\
-1 & 2 \\
1 & 1
\end{bmatrix}
=\begin{bmatrix}
1 & 7 \\
13 & 7
\end{bmatrix}$  

10. $\begin{pmatrix}
\begin{bmatrix}
1 & 5 & 2 \\
-1 & 0 & 1 \\
3 & 2 & 4 \\
\end{bmatrix}
\begin{bmatrix}
3 & 0 \\
-1 & 2 \\
1 & 1
\end{bmatrix}
\end{pmatrix}^\intercal$  
$\begin{bmatrix}
0 & 12\\
-2 & 1 \\
11 & 8
\end{bmatrix}
\begin{bmatrix}
0 & -2 & 11\\
12 & 1 & 8
\end{bmatrix}$

11. $\begin{pmatrix}
\begin{bmatrix}
3 & 0 \\
-1 & 2 \\
1 & 1
\end{bmatrix}
\begin{bmatrix}
4 & -1 \\
0 & 2
\end{bmatrix}
\end{pmatrix}
\begin{bmatrix}
1 & 4 & 2 \\
3 & 1 & 5
\end{bmatrix}$  
$\begin{pmatrix}
\begin{bmatrix}
12 & -3 \\
-4 & 5 \\
4 & 1 \\
\end{bmatrix}
\end{pmatrix}
\begin{bmatrix}
1 & 4 & 2 \\
3 & 1 & 5
\end{bmatrix}$  
$\begin{bmatrix}
3 & 11 & 7 \\
45 & -11 & 17 \\
9 & 17 & 13
\end{bmatrix}$

# Pertanyaan ketiga

## Soal

![kedua](/home/aya/Pictures/Screenshots/Screenshot_Wed-02_Nov_22_23.51.png)

## Jawab

1. $5x1+6x2-7x3 = 2$  
$-x1-2x2+3x3 = 0$  
$4x2-x3 = 3$  
$5x1+6x2-7x3=2$

2. $5x-3y-6z = -9$  
$2x+3y = 2$  
$3x-6z = -11$

3. $2x+3y = 2$  
$2x = 2 - 3y$  
$x = 1 - \frac{3}{2y}$

4. $x+y+z = 2$  
$1-\frac{3}{2y}+y+z = 2$  
$1-\frac{1}{2y}+z = 2$  
$\frac{1}{2y}+z = 1$

5. $5x-3y-6z = -9$  
$5(1-\frac{3}{2y})-3y-6z = -9$  
$5(\frac{15}{2y})-3y-6z = -9$  
$\frac{21}{2y}-6z = -14$  
