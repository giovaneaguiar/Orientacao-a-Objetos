/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Causin
 */
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
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRootPane;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;
import javax.swing.event.AncestorListener;

public class Estoque extends Login implements ActionListener{
    public JPasswordField senhadeestoque;
    private JLabel codigo;
    
public JButton getAcessoEstoque() {
        return acessoEstoque;
    }

    //mestre digita o quanto de estoque ele tem
    public void setAcessoEstoque(JButton acessoEstoque) {
        this.acessoEstoque = acessoEstoque;
    }

    public JButton getEstoquechefe() {
        return estoquechefe;
    }

    public void setEstoquechefe(JButton estoquechefe) {
        this.estoquechefe = estoquechefe;
    }
    
    
    

    public Estoque()
    {
        setTitle("Area do chefe");
        setSize(450, 350); //Define o tamanho em pixel, largura e altura
        setLocation(400, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Fecha a tela no roda-pé
        setResizable(false); //Não redimisiona a tela, se for true, redimisiona
        getContentPane().setBackground(Color.WHITE); //Aqui podemos misturar cores
        getContentPane().setLayout(null); //Informa que nao vai usar gerenciador de Layout
        JButton estoquechefe = new JButton("Estoque da loja");
        getContentPane().add(estoquechefe);
        estoquechefe.setBounds(150, 30, 150 , 25);
        JButton contratos = new JButton("Contratos");
        getContentPane().add(contratos);
        contratos.setBounds(150, 80, 150, 25);
        JButton dadosGerais = new JButton("Dados do chefe");
        getContentPane().add(dadosGerais);
        dadosGerais.setBounds(150, 130, 150, 25);
        //posso tentar criar uma senha pra entrar na area de Estoque
        
        //estoquechefe.addAncestorListener((AncestorListener) new ActionListener() {
            //public void actionPerformed(ActionEvent evento){
                //if(evento.getSource() == estoquechefe){
                   // dispose();
                    //switch(JOptionPane.showConfirmDialog( null, "Deseja acessar a area de estoque?", "Estoque Time7", JOptionPane.YES_NO_OPTION))
                   // {
                    // case 0:
                   //             Estoque novo = new Estoque();
                    //            novo.setLocationRelativeTo(null);
                    //            dispose();
                     //           novo.acessoEstoque();
                     //           break;
                   // }
          //  }
            
            
            
            
               
                
                
            
       // });
        
        
        
    }

    public JButton getContratos() {
        return contratos;
    }

    public void setContratos(JButton contratos) {
        this.contratos = contratos;
    }

    public JButton getDadosGerais() {
        return dadosGerais;
    }

    public void setDadosGerais(JButton dadosGerais) {
        this.dadosGerais = dadosGerais;
    }

    
    void CalculaEstoque(){
        new Estoque().setVisible(true);
    }
    
    
    
    
    
    
    
    
    public void actionPerformed(ActionEvent e) {
       
    }

    
    
    
}
//falta ativar na main, lembrar disso
