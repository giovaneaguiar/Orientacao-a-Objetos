

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author giova
 */
import javax.swing.JFrame;
import javax.swing.JTextArea;

public class Main {

    /*
    
     Thomás Sousa Causin Alves - 201835040
     Giovane Machado Aguiar - 201876019

     */
    public static void main(String[] args) {
        Login l = new Login();
        JTextArea j = new JTextArea();
        // abre a interface no meio da tela
        l.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // fechar programa no x
        l.setSize(250, 250);
        l.setLocationRelativeTo(null);
        l.setVisible(true); //chamar a interface
        j.setLineWrap(true);//pesquisei e achei esse comando para alinhar texto

    }

}
