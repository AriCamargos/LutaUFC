package aula07;
/**
*@author AriCamargos
*@version 8.0 (July 23, 2021)
* Objetivo é realizar uma luta e apresentar os lutadores igual UFC -- Conta-se com 7 lutadores cada um com suas respectivas características.
* Regras: só lutadores com a mesma categoria de peso podem lutar.
* Estudo de arrays, switch, get e set, operadores lógicos
**/
public class Aula07 {
    public static void main(String[] args) {
        Lutador l[];
        l = new Lutador [7];
                 
        l[0] = new Lutador ("Pretty Boy", "França", "Masculino", 31, 1.75f, 68.90f, 11, 2, 1);
        l[1] = new Lutador ("Snapshadow", "EUA", "Masculino", 35, 1.65f, 80.9f, 12, 2, 1);
        l[2] = new Lutador ("Dead Code", "Austrália", "Masculino", 28, 1.93f, 81.6f, 13, 0, 2);
        l[3] = new Lutador ("UFOCobol", "Brasil","Masculino", 37, 1.70f, 119.3f, 5, 4, 3);
        l[4] = new Lutador ("Putscript", "Brasil","Masculino", 29, 1.68f, 57.8f, 4, 2, 3);
        l[5] = new Lutador ("Nerdaart", "EUA","Masculino", 30, 1.81f, 105.7f, 12, 2, 4);
        l[6] = new Lutador ("Nadinaart", "Austrália", "Masculino",30, 1.81f, 105.7f, 12, 2, 4);
        
        Luta UEC01 = new Luta();
        UEC01.marcarLuta(l[1], l[2]);
        UEC01.lutar();
        
    }
}
