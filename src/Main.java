import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("3. Ciklai!");
        System.out.println("Lengvesni.");
        System.out.println("------1 uzd.-------");
        for (int i = 0; i < 10; i++) {
            System.out.println("Labas");
        }
        System.out.println("------2 uzd.-------");
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
        System.out.println("------3 uzd.-------");
        String[] plants = {"Rožė", "Ažuolas", "Klevas", "Pienė", "Tulpė", "Eglė", "Pušis", "Drebulė", "Gladijolė", "Raktažolė"};
        System.out.println(" ");
        System.out.println("------4 uzd.-------");
        for (int i = 0; i < plants.length; i++) {
            System.out.println(plants[i]);
        }
        System.out.println("------5 uzd.-------");
        for (int i = plants.length - 1; i >= 0; i--) {
            System.out.println(plants[i]);
        }
        System.out.println("------6 uzd.-------");
        for (int i = 10; i <= 50; i += 2) {
            System.out.println(i);

        }
        System.out.println("------7 uzd.-------");
        for (int i = 10; i <= 50; i += 2) {
            if (i % 10 == 0) {
                continue;
            }
            System.out.println(i);
        }
        System.out.println("------8 uzd.-------");
        int k = 0;
        for (int i = 0; i <= 20; i += 2) {
            k++;
            System.out.println(i);
        }
        System.out.println(k);
        System.out.println("------9 uzd.-------");
        int t5 = 0;
        int i7 = 0;
        for (int i = 0; i < plants.length; i++) {
            if (plants[i].length() < 5) {
                t5++;
            }
            if (plants[i].length() > 7) {
                i7++;
            }

        }
        System.out.println("Trumpesni už 5 = " + t5 + " , o ilgensi už 7 = " + i7);
        System.out.println("------10 uzd.-------");
        int t57 = 0;
        for (int i = 0; i < plants.length; i++) {
            if (plants[i].length() > 5 && plants[i].length() < 10) {
                t57++;
            }
        }
        System.out.println("Tarp 5 ir 10 = " + t57);
        System.out.println("Sunkesni.");
        System.out.println("1 uzd.");
        int[] randInt = new int[300];
        int d150 = 0;
        for (int i = 0; i < 300; i++) {
            randInt[i] = (int) Math.round(Math.random() * 300);
            if (randInt[i] > 275) {
                System.out.print("[" + randInt[i] + "] ");
            } else {
                System.out.print(randInt[i] + " ");
            }
            if (randInt[i] > 150) {
                d150++;
            }
        }
        System.out.println();
        System.out.println("Daugiau už 150 yra " + d150);
        System.out.println("2 uzd.");
        int d77 = 0;
        int p = 0;
        int[] skaiciai2 = new int[2999];
        for (int i = 1; i <= 3000; i++) {
            if (i % 77 == 0) {
                p++;
                if (p == 1) {
                    System.out.print(i);
                } else {
                    System.out.print(", " + i);
                }
            }

        }
        System.out.println();
        System.out.println("3 uzd.");
        int sizeSq = 25;
        System.out.println();
        for (int i = 0; i < sizeSq; i++) {
            for (int j = 0; j < sizeSq; j++) {
                System.out.print("* ");
            }
            System.out.println();

        }
        System.out.println("4 uzd.");
        for (int i = 1; i <= sizeSq; i++) {
            for (int j = 1; j <= sizeSq; j++) {
                if (i == j || 26 - i == j) {
                    System.out.print("- ");
                } else {
                    System.out.print("* ");
                }
            }
            System.out.println();

        }
        System.out.println("5 uzd.");

        int c;
        System.out.println("a)");
        while (true) {
            c = (int) Math.round(Math.random());
            ;
            if (c == 1) {
                System.out.println(" S ");
            } else {
                System.out.println(" H ");
                break;
            }
        }
        System.out.println("b)");
        int ch = 0;
        while (true) {
            c = (int) Math.round(Math.random());
            ;
            if (c == 1) {
                System.out.println(" S ");
            } else {
                System.out.println(" H ");
                ch++;
                if (ch == 3) {
                    break;
                }
            }
        }
        System.out.println("c)");
        int chr = 0;
        while (true) {
            c = (int) Math.round(Math.random());
            ;
            if (c == 1) {
                System.out.println(" S ");
                chr = 0;
            } else {
                System.out.println(" H ");
                chr++;
                if (chr == 3) {
                    break;
                }
            }
        }
        System.out.println("6 uzd.");
        int ptk = 0;
        int ptp = 0;
        int pk = 0;
        int pp = 0;
        int minp = 10;
        int maxp = 20;
        int mink = 5;
        int maxk = 25;
        while (ptk < 222 && ptp < 222) {
            pk = mink + (int) Math.round(Math.random() * (maxk - mink));
            pp = mink + (int) Math.round(Math.random() * (maxk - mink));
            ptk += pk;
            ptp += pp;
            System.out.print("Šioje partijoje Kazys surinko " + pk + " taškų, o Petras surinko " + pp);
            if (pp > pk) {
                System.out.print(", Partiją laimėjo: Petras");
            } else if (pk > pp) {
                System.out.print(", Partiją laimėjo: Kazys");
            } else {
                System.out.print(", Partiją laimėjo: Petras ir Kazys - lygiosios");
            }
            System.out.println();
        }
        System.out.println("Žaidimas pasibaigė");
        System.out.print(" Kazys surinko " + ptk + " taškų, o Petras surinko " + ptp);
        if (ptp > ptk) {
            System.out.print(", Žaidimą laimėjo: Petras");
        } else if (ptk > ptp) {
            System.out.print(", Žaidimą laimėjo: Kazys");
        } else {
            System.out.print(", Partiją laimėjo: Petras ir Kazys - lygiosios");
        }
        System.out.println();
        System.out.println("7 uzd.");
        int krastine = 21;
        System.out.println((int) Math.round(krastine / 2.0));
        for (int i = 1; i <= krastine; i++) {
            for (int j = 1; j <= krastine; j++) {
                if ((((int) Math.round(krastine / 2.0) - (i - 1) > j)
                        && (i < (int) Math.round(krastine / 2.0)))
                        ||
                        (((int) Math.round(krastine / 2.0) + (i - 1) < j)
                                && (i < (int) Math.round(krastine / 2.0)))
                        ||
                        (
                                (i > (int) Math.round(krastine / 2.0))
                                        &&
                                        (j < i - (int) Math.round(krastine / 2))
                        )
                        ||
                        ((i > (int) Math.round(krastine / 2.0))
                                &&
                                (j > krastine - (i - (int) Math.round(krastine / 2.0)))
                        )
                ) {
                    System.out.print("- ");
                } else {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
        System.out.println("8 uzd.");
        int vinisL = 85;
        int vinisCL = vinisL;
        System.out.println("a)");
        int reikiaV = 5;
        int likoV = reikiaV;
        int kiekK = 0;
        int progL;
        int minsf = 5;
        int maxsf = 20;
        while (likoV != 0) {
            vinisCL = vinisL;
            //System.out.println("Liko "+likoV+" vinių");
            while (vinisCL > 0) {
                //System.out.println("Vinies dabartinis ilgis "+vinisCL+" kalimo skaicus "+kiekK );
                progL = minsf + (int) Math.round(Math.random() * (maxsf - minsf));
                vinisCL -= progL;
                kiekK++;

            }


            likoV--;
        }
        System.out.println("Prireikė " + kiekK + " smūgių.");
        System.out.println("b)");
        reikiaV = 5;
        likoV = reikiaV;
        kiekK = 0;

        int minhf = 20;
        int maxhf = 30;
        int misch;
        while (likoV != 0) {
            vinisCL = vinisL;
            //System.out.println("Liko "+likoV+" vinių");

            while (vinisCL > 0) {
                // System.out.println("Vinies dabartinis ilgis "+vinisCL+" kalimo skaicus "+kiekK );
                misch = (int) Math.round(Math.random());
                if (misch == 1) {
                    progL = minhf + (int) Math.round(Math.random() * (maxhf - minhf));
                    vinisCL -= progL;
                    kiekK++;
                } else {
                    kiekK++;
                }
            }

            likoV--;
        }
        System.out.println("Prireikė " + kiekK + " smūgių.");
        System.out.println("9 uzd.");

        int min9 = 1;
        int max9 = 200;
        int filled = 0;
        int req = 50;
        int[] array9 = new int[req];
        int cnr;
        boolean rep = false;
        while (filled < req) {
            cnr = min9 + (int) Math.round(Math.random() * (max9 - min9));
            System.out.println(filled + " " + cnr);
            for (int i = 0; i < filled; i++) {
                if (array9[i] == cnr) {
                    rep = true;
                    break;
                } else {
                    rep = false;
                }
            }
            if (rep == true) {
                continue;
            } else {
                array9[filled] = cnr;
                filled++;
            }
        }
        String rez9 = "";
        Arrays.sort(array9);
        for (int i = 0; i < array9.length; i++) {
            rez9 += Integer.toString(array9[i]) + " ";
            ;
        }
        System.out.println("String: ");
        System.out.println(rez9);

        String primerez = "";
        int dk = 0;
        for (int i = 0; i < array9.length; i++) {
            dk = 0;
            for (int j = 1; j <= array9[i]; j++) {
                if (array9[i] % j == 0) {
                    dk++;
                }
            }
            if (dk <= 2) {
                primerez += Integer.toString(array9[i]) + " ";
            }
        }
        System.out.println("Pirminiai skaiciai:");
        System.out.println(primerez);

        System.out.println("4. Masyvai.");
        System.out.println("1 uzd.");
        int sizeArr = 30;
        Integer[] array1 = new Integer[sizeArr];
        int min = 5;
        int max = 25;
        int nr = 0;
        for (int i = 0; i < sizeArr; i++) {
            nr = min + (int) Math.round(Math.random() * (max - min));
            array1[i] = nr;

        }
        System.out.println(Arrays.toString(array1));
        System.out.println("2 uzd.");
        System.out.println("a)");
        int d10 = 0;
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] > 10) {
                d10++;
            }
        }
        System.out.println(d10 + " reikšmių, didensių už 10");
        System.out.println("b)");
        int amax = 0;
        int imaxsk = 0;
        ArrayList<Integer> indmax = new ArrayList<Integer>();
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] > amax) {
                amax = array1[i];
                indmax = new ArrayList<Integer>();
                indmax.add(i);
                imaxsk = 1;

            } else if (array1[i] == amax) {
                indmax.add(i);
                imaxsk++;
                amax = array1[i];
            }
        }


        System.out.println("Didžiausia reikšmė: " + amax + " , jos indeksų masyvas: " + indmax);
        System.out.println("c)");
        int sum = 0;
        for (int i = 0; i < array1.length; i += 2) {
            sum += array1[i];

        }
        System.out.println("Porinių indeksų reikšmių suma = " + sum);
        System.out.println("d)");
        int[] arrayDiff = new int[array1.length];
        for (int i = 0; i < array1.length; i++) {
            arrayDiff[i] = array1[i] - i;
        }
        System.out.println(Arrays.toString(arrayDiff));
        System.out.println("e)");

        ArrayList<Integer> newArray1e = new ArrayList<Integer>();
        newArray1e.addAll(Arrays.asList(array1));
        System.out.println(newArray1e);
        for (int i = 0; i < 10; i++) {
            nr = min + (int) Math.round(Math.random() * (max - min));
            newArray1e.add(nr);
        }
        System.out.println(newArray1e);
        System.out.println("f)");
        ArrayList<Integer> oddArray = new ArrayList<Integer>();
        ArrayList<Integer> evenArray = new ArrayList<Integer>();
        System.out.println(newArray1e.size());
        for (int i = 0; i < newArray1e.size(); i++) {
            if (i % 2 == 0) {
                evenArray.add(newArray1e.get(i));
            } else {
                oddArray.add(newArray1e.get(i));
            }
        }

        System.out.println("Porinių indeksų reiksmės: " + evenArray);
        System.out.println("Neporinių indeksų reikšmės: " + oddArray);
        System.out.println("g)");
        for (int i = 0; i < array1.length; i += 2) {
            if (array1[i] > 15) {
                array1[i] = 0;
            }
        }
        System.out.println(Arrays.toString(array1));
        System.out.println("h) ");
        int indp10 = 0;
        boolean found = false;
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] > 10) {
                found = true;
                indp10 = i;
                break;
            }
        }
        if (found == false) {
            System.out.println("Nerasta masyve reikšmė didesnė už 10");
        } else {
            System.out.println("Pirmas mažiausias indeksas: " + indp10 + " kurio reikšmė yra didesnė nei 10: " + array1[indp10]);
        }
        System.out.println("3)");
        min = 1;
        max = 4;
        ArrayList<String> chars = new ArrayList<String>();
        int sumA = 0;
        int sumB = 0;
        int sumC = 0;
        int sumD = 0;
        int tarpsk = 0;
        for (int i = 0; i < 200; i++) {
            tarpsk = min + (int) Math.round(Math.random() * (max - min));
            if (tarpsk == 1) {
                chars.add("A");
                sumA++;
            }
            if (tarpsk == 2) {
                chars.add("B");
                sumB++;
            }
            if (tarpsk == 3) {
                chars.add("C");
                sumC++;
            }
            if (tarpsk == 4) {
                chars.add("D");
                sumD++;
            }
        }
        System.out.println(chars);
        System.out.println("A - " + sumA + "; B - " + sumB + " ; C - " + sumC + " ; D - " + sumD);
        System.out.println("4)");
        Collections.sort(chars);
        System.out.println(chars);
        System.out.println("5)");
        ArrayList<String> chars1 = new ArrayList<String>();
        ArrayList<String> chars2 = new ArrayList<String>();
        ArrayList<String> chars3 = new ArrayList<String>();
        for (int i = 0; i < 200; i++) {
            tarpsk = min + (int) Math.round(Math.random() * (max - min));
            if (tarpsk == 1) {
                chars1.add("A");
            }
            if (tarpsk == 2) {
                chars1.add("B");
            }
            if (tarpsk == 3) {
                chars1.add("C");
            }
            if (tarpsk == 4) {
                chars1.add("D");
            }
        }
        for (int i = 0; i < 200; i++) {
            tarpsk = min + (int) Math.round(Math.random() * (max - min));
            if (tarpsk == 1) {
                chars2.add("A");
            }
            if (tarpsk == 2) {
                chars2.add("B");
            }
            if (tarpsk == 3) {
                chars2.add("C");
            }
            if (tarpsk == 4) {
                chars2.add("D");
            }
        }
        for (int i = 0; i < 200; i++) {
            tarpsk = min + (int) Math.round(Math.random() * (max - min));
            if (tarpsk == 1) {
                chars3.add("A");
            }
            if (tarpsk == 2) {
                chars3.add("B");
            }
            if (tarpsk == 3) {
                chars3.add("C");
            }
            if (tarpsk == 4) {
                chars3.add("D");
            }
        }
        ArrayList<String> charsComb = new ArrayList<String>();
        String tc = "";
        for (int i = 0; i < chars1.size(); i++) {
            tc = "" + chars1.get(i) + chars2.get(i) + chars3.get(i);
            charsComb.add(tc);
        }
        System.out.println(charsComb);
        ArrayList<Integer> repC = new ArrayList<>();
        Integer tarp = 0;
        String tarpC;
        int unikalios = charsComb.size();
        System.out.println(unikalios);
        for (int i = 0; i < charsComb.size(); i++) {
            tarp = 0;
            tarpC = charsComb.get(i);
            // System.out.println(tarpC);
            for (int j = 0; j < charsComb.size(); j++) {
                // System.out.println(charsComb.get(j));
                //System.out.println("i = "+i+" j ="+j);
                if (tarpC.equals(charsComb.get(j))) {
                    tarp++;
                    //System.out.println(charsComb.get(i));
//                    System.out.println("Duplikatas " + tarp + " " + j);
                    //System.out.println(charsComb.get(j));

                }
            }
            if (tarp > 1) {
                unikalios--;
                //   break;
            }
            System.out.println();
            repC.add(tarp);
        }
        for (int i = 0; i < charsComb.size(); i++) {
            System.out.println(charsComb.get(i) + " - " + repC.get(i));
        }
        System.out.println("Unikalios: " + unikalios);
        Set<String> combos = new LinkedHashSet<>(charsComb);
        System.out.println(combos);
        System.out.println("Kombinacijos: " + combos.size());
        System.out.println("6)");

        int min6 = 100;
        int max6 = 999;


        int cnr6;
        int filled6 = 0;
        int req6 = 100;
        boolean rep6 = false;
        int[] array6 = new int[req6];
        while (filled6 < req6) {
            cnr6 = min6 + (int) Math.round(Math.random() * (max6 - min6));
            //System.out.println(filled6 + " " + cnr6);
            for (int i = 0; i < filled6; i++) {
                if (array6[i] == cnr6) {
                    rep6 = true;
                    break;
                } else {
                    rep6 = false;
                }
            }
            if (rep6 == true) {
                continue;
            } else {
                array6[filled6] = cnr6;
                filled6++;
            }
        }
        System.out.println("Array 1: " + Arrays.toString(array6));
        int filled62 = 0;
        int req62 = 100;
        boolean rep62 = false;
        int[] array62 = new int[req62];
        while (filled62 < req62) {
            cnr6 = min6 + (int) Math.round(Math.random() * (max6 - min6));
            //System.out.println(filled62 + " " + cnr6);
            for (int i = 0; i < filled62; i++) {
                if (array62[i] == cnr6) {
                    rep62 = true;
                    break;
                } else {
                    rep62 = false;
                }
            }
            if (rep62 == true) {
                continue;
            } else {
                array62[filled62] = cnr6;
                filled62++;
            }
        }
        System.out.println("Array 2: " + Arrays.toString(array62));
        System.out.println("7)");
        ArrayList<Integer> uniq1 = new ArrayList<>();
        Boolean uniq = true;
        for (int i = 0; i < array6.length; i++) {
            uniq = true;
            for (int j = 0; j < array62.length; j++) {
                if (array6[i] == array62[j]) {
                    uniq = false;
                }
            }
            if (uniq == true) {
                uniq1.add(array6[i]);
            }

        }
        System.out.println("Unikalios reiksmes lyginant su antru masyvu: " + uniq1);
        System.out.println("8)");
        ArrayList<Integer> similar = new ArrayList<>();
        for (int i = 0; i < array6.length; i++) {
            uniq = true;
            for (int j = 0; j < array62.length; j++) {
                if (array6[i] == array62[j]) {
                    uniq = false;
                }
            }
            if (uniq == false) {
                similar.add(array6[i]);
            }

        }
        System.out.println("Bendros reikšmės: " + similar);
        System.out.println("9)");
        min9 = 5;
        max9 = 25;
        int size = 10;
        int cs=0;
        int[] sequence=new int[size];
        for (int i = 0; i < size; i++) {
            if(i==0){
                cs= min9 + (int) Math.round(Math.random() * (max9 - min9));
            }
            if(i==1){
                cs= min9 + (int) Math.round(Math.random() * (max9 - min9));
            }
            if(i>=2){
                cs=sequence[i-1]+sequence[i-2];
            }
            sequence[i]=cs;
        }
        System.out.println(Arrays.toString(sequence));
        System.out.println("10)");



    }
}