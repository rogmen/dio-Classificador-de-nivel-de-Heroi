package principal.desafiojogo;

import java.util.Scanner;


public class Runner {
    public static void main(String[] args) {
        String nome;
        int idade;
        String tipo;
        do{
            Scanner sc = new Scanner(System.in);
            System.out.print("Digite o nome: ");
            nome = sc.next();
            System.out.print("Digite a idade: ");
            idade = sc.nextInt();
            System.out.print("Digite o tpo: ");
            tipo = sc.next();
            
            new Heroi(nome, idade, tipo).atacar();            
        }while(true);
    }
}
