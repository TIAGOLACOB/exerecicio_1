import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int[] x = new int[10];
        int[] y = new int[10];
        int[] z = new int[20];
        int coutx = 0 ;
        int couty = 0 ;

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe 10 numeros");

        for (int i = 0; i  < 10 ; i ++) {
            x[i] = sc.nextInt();
        }
        System.out.println("Informe 10 numeros");

        for (int i = 0; i  < 10 ; i ++) {
            y[i] = sc.nextInt();
        }

        sc.close();

        for (int i = 0; i  < 20 ; i ++) {      
            if (i % 2==0){
                z [i] = x [coutx];
                coutx ++;
            } else { 
                z [i] = y [couty];
                couty ++;
            }
        }

        for (int i = 0; i < z.length; i++) {
            System.out.print(z[i]+"  ");   
        }        
    } 
}


