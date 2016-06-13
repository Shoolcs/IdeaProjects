import javax.swing.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Мне java!");
        sb.insert(3, " нравится");
        System.out.println(sb);;
        Scanner scan = new Scanner(System.in);
        Computers comp[] = new Computers[100];
        comp[1] = new Computers(101010, "Asus p8h61-MLX3R 2.0", "built-in", "Intel Celeron G540 ", "Realtek", 500, 2, 400, true, "no");
        comp[2] = new Computers(10000,"NF61S Micro AM2SE", "built-in", "AMD", "built-in", 80,2.5 ,300,false , "no");
        comp[3]= new Computers (10100, "P5GC-MX/1333", "built-in", "Intel Pentium 2.6 , 2 Core", "external", 160, 2.5 ,350 , false , "no" );
        comp[4] = new Computers(11111, "Intel...", "Nvidia MX440 AGP8X 64MB", "Intel Celeron D310 2.130 ", "Realtek",160,2.5, 335,false,"no");
        comp[5] = new Computers(15672, "P8H61-ML3R 2.0", "built-in", "Intel Celeron 2.7", "Realtek", 500, 2,400,true,"no");
        comp[6] = new Computers(15673, "H61M-P21", "built-in", "Intel Celeron 1.6 , 1 Core", "built-in",250,2,400,false , "no");
        comp[7] = new Computers(25832, "Asus P5L02", "MSI", "Intel 2.1 ","built-in", 80, 2, 400, true, "no");
        comp[8] = new Computers(35531, "MSi H81MP33","built-in", "Intel 2.8", "built-in",0,2,400,false,"no" );
        comp[9] = new Computers(35532, "P5GC-MX-1333", "built-in", "Intel Pentium 2.6", "built-in", 160,2,400,false,"no");
        comp[10] = new Computers(35533, "P5GC-MX/1333", "built-in", "Intel Pentium 2.5", "built-in",160,2, 400, false,"no" );
        comp[11] = new Computers(35534, "P8H61-MLX3R 2.0", "built-in", "Intel 2.6", "external", 160,4,350,false,"no");
        comp[12] = new Computers(35535, "H61M-K", "built-in", "Intel 2.7", "built-in", 500,2,400,false,"no");
        comp[13] = new Computers(35536, "P5GC-MX/1333", "built-in" , "Intel Pentium 2.6", "external", 160,2,400,false,"no");
        comp[14]  = new Computers(35537, "H61M-K", "built-in", "null", "built-in", 0, 2 , 400, false,"no");
        comp[15] = new Computers(35538, "M5A78L-MLX","built-in", "AMD 2.8", "built-in", 0,2, 400, false,"no");
        comp[16] = new Computers(35539, "P8H61-MLX3 Plus", "built-in", "Intel 2.5", "built-in", 0,4,0,false,"no");
        comp[17] = new Computers(35540, "GAH61M-DS2", "built-in", "Intel 2.7", "buiil_in", 0,2,0,false,"no");
        comp[18]= new Computers(35541, "H61M-K", "built.in", "Intel 2.7", "built-in", 0,2,400,false,"no");
        comp[19] = new Computers(35542, "H61M-K", "built-in", "null", "built-in", 0,2,400,false,"no");
        comp[20] = new Computers(35543, "H61M-K", "built- in", "Intel 2.7", "built-in", 500,2,400,false, "no");
        comp[21] = new Computers(35544, "P5GC-MX/1333", "built-in", "Intel 2.6" , "built-in", 160,2,400,true,"no");
        comp[22] = new Computers(35545, "P8H61-MLX3 R 2.0", "built-in", "null", "built-in", 0,4,450,false,"no");
        comp[23] = new Computers(35546, "H61M-K" , "built-in", " Intel 2.7" , "built-in", 500,2,400,false, "no");
        comp[24] = new Computers(35547, "P8H61-MLX3 Plus", "built-in", "Intel Celeron 1.6 ", "built- in", 0,2,400,false, "no");
        comp[25] = new Computers(55557, "MSI H61M-P31/W8", "built-in", "Intel Celeron 2.7", "built-in", 500,2,300,false,"no");
        comp[26] = new Computers(55558, "GA-H61M-DS.2" , "built-in", "Intel Celeron 2.7 " , "built-in" , 0,2,300,false, "no");
        comp[27]  = new Computers(55555, "Asus M5A78L MLX" , "built-in", "AMD 2.8", "built-in", 0,2,400,true,"no");
        comp[28] = new Computers(55556, "Asus P5GC-MX/1333", "built-in", "Intel Pentium 2.7", "built-in", 160,2,235,false,"no");
        comp[29] = new Computers(55562 , "H81M-P33", "built-in", "Intel Celeron 2.8","built-in",500,2,400,false,"no");
        comp[30] = new Computers(55561, "Asus H61M-K", "built-in","Intel Celeron 2.7", "built-in", 500,2,400,false, "no");
        comp[31] = new Computers(55559, "H81M-B33", "built-in", "Intel Celeron 2.8", "built-in", 500,2,400,false,"no");
        comp[32]= new Computers(55560, "Asus P5GC-MX/1333", "built-in", " Intel Pentium Dual Core 2.7", "external", 160,2,300,false,"no");
        comp[33] = new Computers(55563, "P8H61-MLX", "built-in", "Intel Pentium", "built-in", 0,2,400,false,"no");
        comp[34] = new Computers(55564, "H61M-K", "built-in", "Intel Celeron 2.7", "built-in", 500,2,400, false , "no");


               for(int w=0;w<100;){

            System.out.println("Выберите действие :(Найти/Добавить)");
            String b = scan.next();
            String Seach = "Найти";
            String Add  = "Добавить";
            if(Seach.equals(b)){
            System.out.println("Введите id компьютера.");
                int a = scan.nextInt();


                for (int i = 1; i <= 100;i++ ) {

                    if (comp[i].idq==a ) {
                        System.out.println(comp[i]);
                        w++;
                        break;
                    }
                }}


        if(Add.equals(b)){
            System.out.println("Введите id:");
            int idf=scan.nextInt();
            System.out.println("Введите Motherboard:");
            String Motherboard3 = scan.next();
            System.out.println("Введите Videoadapter:");
            String videoq = scan.next();
            System.out.println("Введите Processor:");
            String Procc = scan.next();
            System.out.println("Введите Network adapter:");
            String nnnetwork = scan.next();
            System.out.println("Введите обьем HDD:");
            int HDD = scan.nextInt();
            System.out.println("Введите обьем RAM:");
            double Ram  = scan.nextInt();
            System.out.println("Введите мощьность блока питания:");
            int Powert = scan.nextInt();
            System.out.println("Введите наличие DVD:");
            boolean cde = scan.nextBoolean();
            System.out.println("Введите проблемы с ПК:");
            String problemsd = scan.next();

                comp[50]=new Computers(idf,Motherboard3,videoq,Procc,nnnetwork,HDD,Ram,Powert,cde,problemsd);






                }










                }








        }
        }



