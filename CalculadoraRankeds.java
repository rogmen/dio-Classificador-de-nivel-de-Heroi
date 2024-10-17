package principal;

import java.util.Scanner;

/**
 *
 * @author rogmen
 */
public class  CalculadoraRankeds {
    public static void main(String[] args) {
        int derrotas;
        int vitorias;
        int resultado;
        String elo = "";
        
        do{
            Scanner sc = new Scanner(System.in);
            System.out.print("Digite a quantidade de vitórias: ");
            vitorias = sc.nextInt();
            System.out.print("Digite a quantidade de derrotas: ");
            derrotas = sc.nextInt();
            resultado = calculaRank(vitorias, derrotas);
            
            
            if(resultado <= 10){                
                   elo = "Ferro";
            } else if(resultado >= 11 && resultado <= 20){
                   elo = "Bronze";
            } else if(resultado >= 21 && resultado <= 50){
                   elo = "Prata";
            } else if(resultado >= 51 && resultado <= 80){
                   elo = "Ouro";
            } else if(resultado >= 81 && resultado <= 90){
                   elo = "Diamante";
            } else if(resultado >= 91 && resultado <= 100){
                   elo = "Lendário";
            } else if(resultado >= 101){
                   elo = "Imortal";
            }
            
            System.out.println("O herói tem saldo de " + resultado + " e está no nível de " + elo + "\n");
            
        } while(true);        
    }
    
    public static int calculaRank(int vitorias, int derrotas){
        return vitorias - derrotas;
    }

}
