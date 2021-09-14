package aula07;

import java.util.Random;

public class Luta {
    
    //ATRIBUTOS
    private Lutador desafiado; // uso o nome da outra classe
    private Lutador desafiante;
    private int rounds;
    private boolean aprovado;
    
    // MÉTODOS PÚBLICOS
    public void marcarLuta(Lutador l1, Lutador l2){ // recebeu dois lutadores como parâmentro
        if (l1.getCategoria().equals(l2.getCategoria()) // o equals é a mesma coisa de usar ==
            && l1 != l2){
            this.aprovado = true;
            this.desafiado = l1;
            this.desafiante = l2;
        }else{
            this.aprovado = false;
            this.desafiado = null;
            this.desafiante = null;
        }
    }
    
    public void lutar(){
        if(this.aprovado){ // se a luta for aprovada
           System.out.println("### DESAFIADO ###"); // escreve isso na tela
           this.desafiado.apresentar(); // mostra desafiado 1
            System.out.println("\n### DESAFIANTE ###"); // escreve isso na tela
           this.desafiante.apresentar(); //mostra desafiante 2
           
           Random aleatorio = new Random();
           int vencedor = aleatorio.nextInt(3); // 0 1 2 
            System.out.println("\n===== RESULTADO DA LUTA =====");
           switch (vencedor){
               case 0 -> {
                   // Empate
                   System.out.println("Empatou");
                   this.desafiado.empatarLuta();
                   this.desafiante.empatarLuta();
                }
               case 1 -> {
                   // Desafiado vence
                   System.out.println("Vitória do " + this.desafiado.getNome());
                   this.desafiado.ganharLuta();
                   this.desafiante.perderLuta();
                }
               case 2 -> {
                   //Desafiante vence
                   System.out.println("Vitória do " + this.desafiante.getNome());
                   this.desafiado.perderLuta();
                   this.desafiante.ganharLuta();
                }
           }System.out.println("====================");
        } else {
            System.out.println("A luta não pode acontecer");
        }
    }
    
    //MÉTODOS ESPECIAIS
    public Lutador getDesafiado() { //retorna um parâmento desafiado
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) { // recebe um paramêtro lutador
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean isAprovado() {
        return aprovado;
    }

    public void setAprovado(boolean aprovado) {
        this.aprovado = aprovado;
    }
}
