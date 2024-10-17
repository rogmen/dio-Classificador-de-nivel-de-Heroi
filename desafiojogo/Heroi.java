package principal.desafiojogo;

public class Heroi {
    private String nome;
    private int idade;
    private String tipo;
    
    public Heroi(String nome, int idade, String tipo){
        this.nome = nome;
        this.idade = idade;
        this.tipo = tipo;
        atacar();
    }
    
    public void atacar(){
        String poder;
        switch (getTipo()) {
            case "mago" : poder = "magia"; break;
            case "guerreiro" : poder = "usou espada"; break;
            case "monge" : poder = "usou artes marciais"; break;
            case "ninja" : poder = "usou shuriken"; break;
            default : poder = "nada";
        }
        System.out.println("O " + getTipo() + " atacou usando " + poder + "\n");      
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getTipo() {
        return tipo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    
}
