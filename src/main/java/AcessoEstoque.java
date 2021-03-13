
import java.awt.Color;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Causin
 */
public class AcessoEstoque extends Estoque implements ActionListener{
        public AcessoEstoque(){
        setTitle("Estoque");
        setSize(450, 350); //Define o tamanho em pixel, largura e altura
        setLocation(400, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Fecha a tela no roda-pé
        setResizable(false); //Não redimisiona a tela, se for true, redimisiona
        getContentPane().setBackground(Color.BLACK); //Aqui podemos misturar cores
        getContentPane().setLayout(null); //Informa que nao vai usar gerenciador de Layout
        //JButton estoquechefe = new JButton("Estoque da loja");
        //getContentPane().add(estoquechefe);
        //estoquechefe.setBounds(150, 30, 120 , 25);
}
}
