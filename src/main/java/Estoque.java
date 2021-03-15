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
import java.awt.FlowLayout;
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

public class Estoque extends Login implements ActionListener {
    //public JPasswordField senhadeestoque;
    //private JLabel codigo;
    //private JButton acess;
    
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
        JButton fornecedores = new JButton("Fornecedores");
        getContentPane().add(fornecedores);
        fornecedores.setBounds(150, 130, 150, 25);
        //posso tentar criar uma senha pra entrar na area de Estoque
        
        estoquechefe.addActionListener(new ActionListener() {
            
            //acao
            
            public void actionPerformed(ActionEvent evento) {
                if (evento.getSource() == estoquechefe) {

                    JFrame frame = new JFrame("Area de estoque");
                    setLocationRelativeTo(null);
                    setResizable(false);
                    frame.setVisible(true);
                    frame.setSize(500, 500);

                }
            }
        }
        );
        contratos.addActionListener(new ActionListener() {
            //acao
            public void actionPerformed(ActionEvent evento) {
                if (evento.getSource() == contratos) {

                    JFrame frame = new JFrame("Area de contratos");
                    setLocationRelativeTo(null);
                    setResizable(false);
                    frame.setVisible(true);
                    frame.setSize(500, 500);

                }
            }
        }
        );
        fornecedores.addActionListener(new ActionListener() {
            //acao
            public void actionPerformed(ActionEvent evento) {
                if (evento.getSource() == fornecedores) {
                    //dando erro na hora de carregar a area de fornecedores
                    TelaFornece tela = new TelaFornece();
                    tela.montaTela();
                    //JFrame frame = new JFrame("Fornecedores");
                    //setLocationRelativeTo(null);
                    //setResizable(false);
                    //frame.setVisible(true);
                    //frame.setSize(500, 500);

                }
            }
        }
        );
            
          
        
    }

    public JButton getContratos() {
        return contratos;
    }

    public void setContratos(JButton contratos) {
        this.contratos = contratos;
    }

    public JButton getFornecedores() {
        return fornecedores;
    }

    public void setFornecedores(JButton fornecedores) {
        this.fornecedores = fornecedores;
    }

    

    
    void CalculaEstoque(){
        new Estoque().setVisible(true);
    }
    
    
    
    
    
    
    
    
    public void actionPerformed(ActionEvent e) {
       
    }

    
    
    
}
//falta ativar na main, lembrar disso
