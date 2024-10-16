package principal;

import java.util.Scanner;


public class DesafioDIO {


    public static void main(String[] args) {
        int xp;
        String nome;
        
        do{
            Scanner sc = new Scanner(System.in);
            System.out.print("Digite o nome do Heroi: ");
            nome = sc.next();
            System.out.print("Digite o XP do Heroi: ");
            xp = sc.nextInt();
            
            if(xp <= 1000){                
                   mensagem(nome, "Ferro");
            } else if(xp >= 1001 && xp <= 2000){
                   mensagem(nome, "Bronze");
            } else if(xp >= 2001 && xp <= 5000){
                   mensagem(nome, "Prata");
            } else if(xp >= 5001 && xp <= 7000){
                   mensagem(nome, "Ouro");
            } else if(xp >= 7001 && xp <= 8000){
                   mensagem(nome, "Platina");
            } else if(xp >= 8001 && xp <= 9000){
                   mensagem(nome, "Ascendente");
            } else if(xp >= 9001 && xp <= 10000){
                   mensagem(nome, "Imortal");
            } else if(xp >= 10001){
                   mensagem(nome, "Radiante");
            }
            
        } while(true);        
    }
    
    public static void mensagem(String nome, String nivel){
        System.out.println("O herói de nome " + nome + " está no nível de " + nivel + "\n");
    }
    
}
