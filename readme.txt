Soal No. 5:
Jelaskan mengapa bubble-sort memiliki kompleksitas algoritma O(n2) !

Jawaban:

Kompleksitas Algoritma Bubble-Sort adalah O(n²) karena:
- Waktu yang dibutuhkan algoritma untuk menyelesaikan tugasnya bertambah selaras dengan dengan kuadrat dari jumlah elemen (n) dalam input.
- Misalnya jika memiliki 10 elemen, waktu prosesnya mumbutuhkan sekitar 100 operasi (10² = 100). Jika 100 elemen, memerlukan sekitar 10000 operasi (100² = 10000) dan seterusnya. Algoritma ini bisa berjalan sangat lambat untuk input/elemen banyak karena waktu berjalan bertambah secara eksponensial
- Terdapat 2 loop. Loop pertama, berjalan sesuai jumlah elemen array. Loop kedua, berjalan hingga n-1 untuk membandingkan dan menukar elemen-elemen sesuai urutan yang benar
