
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.net.URL;
import javax.accessibility.AccessibleContext;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
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
public class Produtos extends Login {

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

        setTitle("Produtos");
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

        camisa1.addActionListener(new ActionListener() {
            //acao
            public void actionPerformed(ActionEvent evento) {
                if (evento.getSource() == camisa1) {

                    JFrame frame = new JFrame(
                            "Classic");
                    setLocationRelativeTo(null);
                    setResizable(false);
                    frame.setVisible(true);
                    frame.setSize(500, 500);

                }
            }
        }
        );
        camisa2.addActionListener(new ActionListener() {
            //acao
            public void actionPerformed(ActionEvent evento) {
                if (evento.getSource() == camisa2) {

                    JFrame frame = new JFrame(
                            "Elegant");
                    setLocationRelativeTo(null);
                    setResizable(false);
                    frame.setVisible(true);
                    frame.setSize(500, 500);

                }
            }
        }
        );
        camisa3.addActionListener(new ActionListener() {
            //acao
            public void actionPerformed(ActionEvent evento) {
                if (evento.getSource() == camisa3) {

                    JFrame frame = new JFrame(
                            "Black");
                    setLocationRelativeTo(null);
                    setResizable(false);
                    frame.setVisible(true);
                    frame.setSize(500, 500);

                }
            }
        }
        );
        camisa4.addActionListener(new ActionListener() {
            //acao
            public void actionPerformed(ActionEvent evento) {
                if (evento.getSource() == camisa4) {

                    JFrame frame = new JFrame(
                            "Tie-Dye");
                    setLocationRelativeTo(null);
                    setResizable(false);
                    frame.setVisible(true);
                    frame.setSize(500, 500);

                }
            }
        }
        );

        /* ImageIcon c1 = new ImageIcon(getClass().getResource("Images/classic.jpg"));
        JLabel l1 = new JLabel(c1);

        
         ImageIcon c1 = new ImageIcon(getClass().getResource("elegant.jpg"));
        JLabel l1 = new JLabel(c1);
        ImageIcon c2 = new ImageIcon(getClass().getResource("elegant.jpg"));
        JLabel l2 = new JLabel(c2);
        ImageIcon c3 = new ImageIcon(getClass().getResource("black.jpg"));
        JLabel l3 = new JLabel(c3);
        ImageIcon c4 = new ImageIcon(getClass().getResource("tie-dye.jpg"));
        JLabel l4 = new JLabel(c4); 
        
 

        camisa1.addActionListener(new ActionListener() {
            //acao
            public void actionPerformed(ActionEvent evento) {
                if (evento.getSource() == camisa1) {
                    add(l1);
                    setSize(800, 800);
                    
                    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    setResizable(false);
                    getContentPane().setBackground(Color.WHITE);
                    setVisible(true);

                }
            }
        }
        );
       

        camisa2.addActionListener(new ActionListener() {
            //acao
            public void actionPerformed(ActionEvent evento) {
                if (evento.getSource() == camisa2) {
                    add(l2);
                    setSize(800, 800);
                    //setLocation(400, 150);
                    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    setResizable(false);
                    getContentPane().setBackground(Color.WHITE);
                    setVisible(true);
                }
            }
        }
        );
        

        camisa3.addActionListener(new ActionListener() {
            //acao
            public void actionPerformed(ActionEvent evento) {
                if (evento.getSource() == camisa3) {
                    add(l3);
                    setSize(800, 800);
                    //setLocation(400, 150);
                    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    setResizable(false);
                    getContentPane().setBackground(Color.WHITE);
                    setVisible(true);

                }
            }
        }
        );
        

        camisa4.addActionListener(new ActionListener() {
            //acao
            public void actionPerformed(ActionEvent evento) {
                if (evento.getSource() == camisa4) {
                    add(l4);
                    setSize(800, 800);
                    //setLocation(400, 150);
                    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    setResizable(false);
                    getContentPane().setBackground(Color.WHITE);
                    setVisible(true);

                }
            }
        }
        );
        
     
        
        add(camisa1);
         */
    }

    void mostraProdutos() {
        new Produtos().setVisible(true);

        //mostra nova janela com as caracteristicas do construtor
    }

}
