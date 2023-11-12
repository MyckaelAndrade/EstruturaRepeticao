package estruturarepeticao;

import java.util.Scanner;

/**
 * @since 12/11/2023
 * @author myckazs
 */
public class EstruturaRepeticao {
    public static void main(String[] args) {
        //Estruturas de Repetição
        //(while, do while, for)
        
        //Contador
        int c = 1;
   
//        while(c <= 10){ //repita //teste lógico no inicio
//            System.out.println(c);
//            c++; // Ou c += 1
//        }
        
//        do{ //para
//            System.out.println(c);
//            c++;
//        }while(c <= 10); //teste lógico embaixo
        
//        for(int n = 0 ; n <= 10 ; n++){ //enquanto //Variavel de controle
//            System.out.println(n);
//            c++;
//        }

        //Números
        int n, s=0;
        String r;
        Scanner t = new Scanner(System.in);
        do{
            System.out.println("Digite um numero: ");
            n = t.nextInt();
            s += n; // Ou s = s + n;
            System.out.println("Quer continuar digite [S/N] || [s/n]: ");
            r = t.next();
        }while(r.equals("s"));
        System.out.println("A soma dos numeros eh:  " + s);
    }
    
}
