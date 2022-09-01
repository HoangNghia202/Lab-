package Handing_fractions_program;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Random;

import javax.swing.plaf.synth.SynthGraphicsUtils;

public class List_fraction {
    ArrayList<Fraction> ls = new ArrayList<>();

    public void add(int size) {
        Random rand = new Random();
        for (int i = 0; i < size; i++) {
            int tu = rand.nextInt(9);
            int mau;
            do {
                mau = rand.nextInt(9);
            } while (mau == 0);

            if (tu < mau) {
                for (int j = tu; j >= 2; j--) {
                    if (tu % j == 0 && mau % j == 0) {
                        tu = tu / j;
                        mau = mau / j;
                    }
                }
            } else {
                for (int j = mau; j >= 2; j--) {
                    if (mau % j == 0 && tu % j == 0) {
                        tu = tu / j;
                        mau = mau / j;
                    }
                }
            }

            Double kQua = (double) tu / mau;

            ls.add(new Fraction(tu, mau, kQua));
        }
    }

    public void printList() {
        Collections.sort(ls, new Comparator<Fraction>() {

            @Override
            public int compare(Fraction o1, Fraction o2) {

                return (int) (o1.getkQua() - o2.getkQua());
            }

        });
        System.out.println("Sorted fraction list:");
        System.out.println(ls.toString());

    }

    public Fraction sumFraction(Fraction f1, Fraction f2) {
        int ts = f1.getTu() * f2.getMau() + f2.getTu() * f1.getMau();
        int ms = f1.getMau() * f2.getMau();
        double kQua = 0;
        return new Fraction(ts, ms, kQua);
    }

    public void printSumFraction() {
        Fraction sum = null;
        if (ls.size() == 1) {
            System.out.println("Sum of fraction: Null");
        } else {
            if (ls.size() == 2) {
                sum = sumFraction(ls.get(0), ls.get(1));
                if (sum.tu < sum.mau) {
                    for (int j = sum.tu; j >= 2; j--) {
                        if (sum.tu % j == 0 && sum.mau % j == 0) {
                            sum.tu = sum.tu / j;
                            sum.mau = sum.mau / j;
                        }
                    }
                } else {
                    for (int j = sum.mau; j >= 2; j--) {
                        if (sum.mau % j == 0 && sum.tu % j == 0) {
                            sum.tu = sum.tu / j;
                            sum.mau = sum.mau / j;
                        }
                    }
                }
                System.out.println("sum of fraction: " + sum);

            } else {
                if (ls.size() > 2) {
                    sum = sumFraction(ls.get(0), ls.get(1));
                    for (int i = 1; i < ls.size()-1; i++) {
                        sum = sumFraction(sum, ls.get(i + 1));
                    }

                    // ham toi gian phan so
                    if (sum.tu < sum.mau) {
                        for (int j = sum.tu; j >= 2; j--) {
                            if (sum.tu % j == 0 && sum.mau % j == 0) {
                                sum.tu = sum.tu / j;
                                sum.mau = sum.mau / j;
                            }
                        }
                    } else {
                        for (int j = sum.mau; j >= 2; j--) {
                            if (sum.mau % j == 0 && sum.tu % j == 0) {
                                sum.tu = sum.tu / j;
                                sum.mau = sum.mau / j;
                            }
                        }
                    }

                    System.out.println("Sum of fraction: " + sum);
                }
            }
        }

    }

}
