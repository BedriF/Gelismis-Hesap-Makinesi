import java.util.Scanner;
public class Main {

            static void plus() {
                Scanner scan = new Scanner(System.in);
                int numbera,numberb, result = 0;
                    System.out.print("1. Sayıyı Giriniz:");
                    numbera = scan.nextInt();
                System.out.print("2. Sayıyı Giriniz:");
                    numberb = scan.nextInt();
                    result = numbera+numberb;
                System.out.println("Sonuç : " + result);
            }

            static void minus() {
                Scanner scan = new Scanner(System.in);
                int numbera,numberb, result = 0;
                System.out.print("1. Sayıyı Giriniz:");
                numbera = scan.nextInt();
                System.out.print("2. Sayıyı Giriniz:");
                numberb = scan.nextInt();
                result = numbera-numberb;
                System.out.println("Sonuç : " + result);
            }

            static void times() {
                Scanner scan = new Scanner(System.in);
                int numbera,numberb, result = 0;
                System.out.print("1. Sayıyı Giriniz:");
                numbera = scan.nextInt();
                System.out.print("2. Sayıyı Giriniz:");
                numberb = scan.nextInt();
                result = numbera*numberb;
                System.out.println("Sonuç : " + result);

            }

            static void divided() {
                Scanner scan = new Scanner(System.in);
                double number, result = 0.0;
                for (int i = 1; i <= 2; i++) {
                    System.out.print(i + ". sayı :");
                    number = scan.nextDouble();
                    if (i != 1 && number == 0) {
                        System.out.println("Böleni 0 giremezsiniz.");
                        continue;
                    }
                    if (i == 1) {
                       ;
                        continue;
                    }
                    result /= number;
                }

                System.out.println("Sonuç : " + result);
            }

            static void power() {
                Scanner scan = new Scanner(System.in);
                System.out.print("Taban değeri giriniz :");
                int base = scan.nextInt();
                System.out.print("Üs değeri giriniz :");
                int exponent = scan.nextInt();
                int result = 1;

                for (int i = 1; i <= exponent; i++) {
                    result *= base;
                }

                System.out.println("Sonuç : " + result);
            }

            static void factorial() {
                Scanner scan = new Scanner(System.in);
                System.out.print("Sayı giriniz :");
                int n = scan.nextInt();
                int result = 1;

                for (int i = 1; i <= n; i++) {
                    result *= i;
                }

                System.out.println("Sonuç : " + result);
            }
            static void mod() {
                int result;
             Scanner scan = new Scanner(System.in);
             System.out.print("Modu alınacak sayıyı giriniz :");
             int n = scan.nextInt();
             System.out.print("Modu giriniz :");
                int m = scan.nextInt();
                result=n%m;
                System.out.println("Sonuç : " + result);
            }
    static void alcev() {
        int resulta=0,k=0;
        Scanner scan = new Scanner(System.in);
        System.out.print("Uzun kenerı giriniz :");
        int n = scan.nextInt();
        System.out.print("Kısa kenarı giriniz :");
        int m = scan.nextInt();
        resulta=n*m;
        k=(n+m)*2;
        System.out.println("Sonuç Alan : " +resulta+ "\nSonuç Çevre : "+k);
    }

            public static void main(String[] args) {
                Scanner scan = new Scanner(System.in);
                int select;
                String menu = "1- Toplama İşlemi\n"
                        + "2- Çıkarma İşlemi\n"
                        + "3- Çarpma İşlemi\n"
                        + "4- Bölme işlemi\n"
                        + "5- Üslü Sayı Hesaplama\n"
                        + "6- Faktoriyel Hesaplama\n"
                        + "7- Mod Alma\n"
                        + "8- Dikdörtgen Alan ve Çevre Hesabı\n"
                        + "0- Çıkış Yap";

                do {
                    System.out.println(menu);
                    System.out.print("Lütfen bir işlem seçiniz :");
                    select = scan.nextInt();
                    switch (select) {
                        case 1:
                            plus();
                            break;
                        case 2:
                            minus();
                            break;
                        case 3:
                            times();
                            break;
                        case 4:
                            divided();
                            break;
                        case 5:
                            power();
                            break;
                        case 6:
                            factorial();
                            break;
                        case 7:
                            mod();
                            break;
                        case 8:
                            alcev();
                            break;
                        case 0:
                            break;
                        default:
                            System.out.println("Yanlış bir değer girdiniz, tekrar deneyiniz.");
                    }
                } while (select != 0);


            }
        }

