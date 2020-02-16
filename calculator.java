/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tryproject;

import java.util.Scanner;

/**
 *
 * @author Rizky Firmansyah
 */
public class calculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner Calculator = new Scanner(System.in);

        System.out.print("Silahkan Pilih Operator : Tambah, Kurang, Kali, Bagi, Modulus, Akar, Phytagoras\nMasukan Operator : ");
        String operator = Calculator.nextLine().toLowerCase();

        if (operator.isEmpty()) {
            System.err.println("anda tidak memasukan apapun, silahkan run lagi (Shift + F6)");
        } else {
            switch (operator) {
                case "tambah":

                    try {
                        System.out.print("Masukan Angka Pertama : ");
                        String angka1 = Calculator.nextLine();
                        int num1 = Integer.parseInt(angka1);

                        System.out.print("Masukan Angka Kedua : ");
                        String angka2 = Calculator.nextLine();
                        int num2 = Integer.parseInt(angka2);

                        int hasil = num1 + num2;
                        System.out.println("Hasil  " + num1 + " + " + num2 + " = " + hasil);
                        break;
                    } catch (Exception e) {
                        System.err.println("Anda tidak memasukan apappun / yang anda masukan bukan angka");
                        break;
                    }

                case "kurang":
                    try {
                        System.out.print("Masukan Angka Pertama : ");
                        String angka3 = Calculator.nextLine();
                        int num3 = Integer.parseInt(angka3);

                        System.out.print("Masukan Angka Kedua : ");
                        String angka4 = Calculator.nextLine();
                        int num4 = Integer.parseInt(angka4);

                        int hasil1 = num3 - num4;
                        System.out.println("Hasil  " + num3 + " - " + num4 + " = " + hasil1);
                        break;
                    } catch (Exception e) {
                        System.err.println("Anda tidak memasukan apappun / yang anda masukan bukan angka");
                        break;
                    }

                case "bagi":
                    try {
                        System.out.print("Masukan Angka Pertama : ");
                        String angka5 = Calculator.nextLine();
                        int num5 = Integer.parseInt(angka5);
                        System.out.print("Masukan Angka Kedua : ");
                        String angka6 = Calculator.nextLine();
                        int num6 = Integer.parseInt(angka6);

                        int hasil2 = num5 / num6;
                        System.out.println("Hasil  " + num5 + " : " + num6 + " = " + hasil2);
                        break;
                    } catch (Exception e) {
                        System.err.println("Anda tidak memasukan apappun / yang anda masukan bukan angka");
                        break;
                    }

                case "kali":
                    try {
                        System.out.print("Masukan Angka Pertama : ");
                        String angka7 = Calculator.nextLine();
                        int num7 = Integer.parseInt(angka7);
                        System.out.print("Masukan Angka Kedua : ");
                        String angka8 = Calculator.nextLine();
                        int num8 = Integer.parseInt(angka8);

                        int hasil3 = num7 * num8;
                        System.out.println("Hasil  " + num7 + " * " + num8 + " = " + hasil3);
                        break;
                    } catch (Exception e) {
                        System.err.println("Anda tidak memasukan apappun / yang anda masukan bukan angka");
                        break;
                    }

                case "modulus":
                    try {
                        System.out.print("Masukan Angka Pertama : ");
                        String angka9 = Calculator.nextLine();
                        int num9 = Integer.parseInt(angka9);
                        System.out.print("Masukan Angka Kedua : ");
                        String angka10 = Calculator.nextLine();
                        int num10 = Integer.parseInt(angka10);

                        int hasil4 = num9 % num10;
                        System.out.println("Hasil  " + num9 + " % " + num10 + " = " + hasil4);
                        break;
                    } catch (Exception e) {
                        System.err.println("Anda tidak memasukan apappun / yang anda masukan bukan angka");
                        break;
                    }

                case "akar":
                    try {
                        System.out.print("Masukan Angka : ");
                        String angka11 = Calculator.nextLine();
                        int num11 = Integer.parseInt(angka11);

                        double hasil5 = Math.sqrt(num11);
                        System.out.println("Hasil Akar " + num11 + " = " + hasil5);
                        break;
                    } catch (Exception e) {
                        System.err.println("Anda tidak memasukan apappun / yang anda masukan bukan angka");
                        break;
                    }

                case "phytagoras":
                    try {
                        System.out.print("Silahkan pilih sisi, Samping/Miring : ");
                        String sisi = Calculator.nextLine().toLowerCase();

                        if (sisi.equals("samping")) {

                            System.out.print("Masukan Angka Pertama : ");
                            String angka12 = Calculator.nextLine();
                            int num12 = Integer.parseInt(angka12);
                            System.out.print("Masukan Angka Kedua : ");
                            String angka13 = Calculator.nextLine();
                            int num13 = Integer.parseInt(angka13);

                            double hasil6 = Math.sqrt(Math.pow(num12, 2) - Math.pow(num13, 2));;
                            System.out.println("Hasil  " + angka12 + " phy " + angka13 + " = " + hasil6);
                            break;
                        } else if (sisi.equals("miring")) {
                            System.out.print("Masukan Angka Pertama : ");
                            String angka14 = Calculator.nextLine();
                            int num14 = Integer.parseInt(angka14);
                            System.out.print("Masukan Angka Kedua : ");
                            String angka15 = Calculator.nextLine();
                            int num15 = Integer.parseInt(angka15);

                            double hasil7 = Math.sqrt(Math.pow(num14, 2) + Math.pow(num15, 2));;
                            System.out.println("Hasil  " + angka14 + " phy " + angka15 + " = " + hasil7);
                            break;

                        } else {
                            System.err.println("Yang anda masukan salah");
                            break;
                        }
                    } catch (Exception e) {
                        System.err.println("Anda tidak memasukan apappun / yang anda masukan bukan angka");
                        break;
                    }

                default:
                    System.err.println("Operator yang anda maksudkan tidak ada, silahkan run lagi (Shift + F6)");

            }

        }

    }

}
