2.![diagram](https://github.com/d4rdan/SI_2023_lab2_216060/assets/109043990/ffbbd55d-a011-4771-a04b-315c321902cc)

3.Цикломатска комплексност за овој код е 11. Ги броиме регионите на графот, вклучувајќи ги и надворешниот.

4.Според every branch method имаме 5 тест случаи:

-user null -> exception - ќе влезе во првиот if и после ќе даде exception и ќе излезе од функцијата.
-Username = new User(null, "DS@990", "DardanSelmani") -> за да влезе во вториот услов. Вториот username да е null, passwordot да има специјален карактер, и обичен емаил за да не влези во условите во првото итерирање, туку во второто.
-User user = new User ("modric", "MOdric", "LukaMOdric") -> password и username да ги имаат истите карактери.
-User user = new User ("Dardan", "D999 53", "dardan.selmani@gmail.com") -> password да има празно место.
-User user = new User ("Dardan", "D99953", "dardan.selmani@gmail.com") -> да нема празно место и да нема специјален.
