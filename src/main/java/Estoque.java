/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Causin
 */
import java.util.Scanner;
//import java.io.PrintStream;

public class Estoque extends Login{

    //pensei em utilizar um switch para escolher qual tipo de camisa
    //em sequencia, quantas camisas ele gostaria
    //a logica é, o usuario digita qual o tamanho, no programa vamos 
    //imprimir uma tabela explicando qual numero digitar para o seu tamanho
    Estoque estoque = new Estoque();
    public int tamGeral;
    public int contP = 0;
    public int contM = 0;
    public int contG = 0;
    public int contGG = 0;
    public int pedidosCliente = 0;
    public int estoqueFinal = 0;
    Scanner teclado = new Scanner(System.in);
    
    public void CalculaEstoque(){
    int flag = 0;
    tamGeral = teclado.nextInt();
    while (flag != 13) {
            estoque.showMenu();
            flag = teclado.nextInt();
            if (flag >= 1 || flag <=3) {
                estoque.contaP();
            } else if (flag >= 4 || flag <=6) {
                estoque.contaM();
            } else if (flag >= 7 || flag <=9) {
                estoque.contaG();
            } else if (flag >= 10 || flag <=12) {
                estoque.contaGG();
            }
        pedidosCliente = contP + contM + contG + contGG;
        }
    estoqueFinal = tamGeral - pedidosCliente;
   
    
    
           
    
   
    
}
    public void showMenu(){
    System.out.println("Para [P], digite de 1 a 3");
    System.out.println("Para [M], digite de 4 a 6");
    System.out.println("Para [G], digite de 7 a 9");
    System.out.println("Para [GG], digite de 10 a 12");
    System.out.println("Para [sair] digite 13");
    }
    public void contaP(){
        System.out.println("Digite o numero de peças ");
        int aux1 = this.contP;
        this.contP = teclado.nextInt();
        this.contP = this.contP + aux1;
        
        
}
    public void contaM(){
    System.out.println("Digite o numero de peças ");
        int aux1 = this.contM;
        this.contM = teclado.nextInt();
        this.contM = this.contM + aux1;
}
    public void contaG(){
    System.out.println("Digite o numero de peças ");
        int aux1 = this.contG;
        this.contG = teclado.nextInt();   
        this.contG = this.contG + aux1;
    }
    public void contaGG(){
    System.out.println("Digite o numero de peças ");
        int aux1 = this.contGG;
        this.contGG = teclado.nextInt();
        this.contGG =  this.contGG + aux1;
    }
    
}
   //falta ativar na main, lembrar disso