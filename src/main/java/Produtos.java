
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import javax.accessibility.AccessibleContext;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRootPane;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author giova
 */
public class Produtos extends Login implements ActionListener {

    private Object bt_nova_jan;

    public JButton getCamisa1() {
        return camisa1;
    }

    public void setCamisa1(JButton camisa1) {
        this.camisa1 = camisa1;
    }

    public JButton getCamisa2() {
        return camisa2;
    }

    public void setCamisa2(JButton camisa2) {
        this.camisa2 = camisa2;
    }

    public JButton getCamisa3() {
        return camisa3;
    }

    public void setCamisa3(JButton camisa3) {
        this.camisa3 = camisa3;
    }

    public JButton getCamisa4() {
        return camisa4;
    }

    public void setCamisa4(JButton camisa4) {
        this.camisa4 = camisa4;
    }

    public Produtos() {
       setTitle("Produtos" );
        setSize(450, 350); //Define o tamanho em pixel, largura e altura
        setLocation(400, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Fecha a tela no roda-pé
        setResizable(false); //Não redimisiona a tela, se for true, redimisiona
        getContentPane().setBackground(Color.WHITE); //Aqui podemos misturar cores
        getContentPane().setLayout(null); //Informa que nao vai usar gerenciador de Layout
        JButton camisa1 = new JButton("Time7 Classic");
        getContentPane().add(camisa1);
        camisa1.setBounds(150, 30, 120, 25);
        JButton camisa2 = new JButton("Time7 Elegant");
        getContentPane().add(camisa2);
        camisa2.setBounds(150, 80, 120, 25);
        JButton camisa3 = new JButton("Time7 Black");
        getContentPane().add(camisa3);
        camisa3.setBounds(150, 130, 120, 25);
        JButton camisa4 = new JButton("Time7 Tie-Dye");
        getContentPane().add(camisa4);
        camisa4.setBounds(150, 180, 120, 25);
    }

    void mostraProdutos() {
         new Produtos().setVisible(true);
         //mostra nova janela com as caracteristicas do construtor
    
       
    }

    @Override
    public void actionPerformed(ActionEvent e) {
     
    }

    
   
    
}