
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int controle, numeros, out = 0, in = 0;
        
        controle = leia.nextInt();
        
        for (int i = 0; i < controle; i++) {
            numeros = leia.nextInt();
            if (numeros >= 10 && numeros <= 20) {
                in++;
            }else{
              out++;  
            }
        }
        System.out.println(in + " in");
        System.out.println(out + " out");
    }
}
    