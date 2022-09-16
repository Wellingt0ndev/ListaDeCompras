package listadecompras;

import java.util.Arrays;
import java.util.Scanner;
/**
 *
 * @author Wellington F.
 */
public class ListaDeCompras {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.print("Insira a sua lista de compras o item: ");
        String [] lista = new String[5];
        for(int i = 0; i < 5; i++){
            lista[i] = leitor.nextLine();
        }
        System.out.println("As frutas no seu carrinho são: ");   
        System.out.println(Arrays.toString(lista));
    }
    
}
