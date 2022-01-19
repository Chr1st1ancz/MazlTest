import javax.print.attribute.standard.PrinterURI;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Co chceš nakoupit?");
        Nakup();

    }
    public static void Nakup(){
        boolean isRunning = true;
        Produkty a = new Produkty("Rohlik",5,0);
        Produkty b = new Produkty("Brambory",30,0);
        Produkty c = new Produkty("Kuře",80,0);
        Produkty d = new Produkty("Mléko",50,0);

        int celkovaCena = 0;
        while(isRunning == true) {

            int choice = new Scanner(System.in).nextInt();
            System.out.println("0- Upravit");
            System.out.println("1 - Rohlik");
            System.out.println("2 - Brambory");
            System.out.println("3 - Kuře");
            System.out.println("4 - Mléko");
            System.out.println("5 - Zaplatit");

            switch (choice) {
                case 0:{
                    System.out.println("Co chceš upravit?");
                    switch(choice){
                        case 1:{
                            System.out.println("Kolik chceš odebrat položek rohliku?");
                            int promenna =new Scanner(System.in).nextInt();
                            a.setPocet(a.getPocet()-promenna);

                        }
                        case 2:{
                            System.out.println("Kolik chceš odebrat položek Brambor?");
                            int promenna =new Scanner(System.in).nextInt();
                            a.setPocet(a.getPocet()-promenna);

                        }
                        case 3:{
                            System.out.println("Kolik chceš odebrat položek Kuřat?");
                            int promenna =new Scanner(System.in).nextInt();
                            a.setPocet(a.getPocet()-promenna);

                        }
                        case 4:{
                            System.out.println("Kolik chceš odebrat položek Mléka?");
                            int promenna =new Scanner(System.in).nextInt();
                            a.setPocet(a.getPocet()-promenna);

                        }
                        case 5:{
                            isRunning = false;
                        }

                    }
                }
                case 1: {
                    a.setPocet(a.getPocet() + 1);
                    break;
                }
                case 2: {
                    b.setPocet(b.getPocet() + 1);
                    break;
                }
                case 3: {
                    c.setPocet(b.getPocet() + 1);
                    break;
                }
                case 4: {
                    d.setPocet(b.getPocet() + 1);
                    break;
                }



            }
            System.out.println(a.getPocet());
            System.out.println(b.getPocet());
            System.out.println(c.getPocet());
            System.out.println(d.getPocet());
        }



    }

}
