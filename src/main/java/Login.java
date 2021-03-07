
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.SwingConstants;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author giova
 */
public class Login extends JFrame {

    private JTextField usuariologin, login;
    private JButton entrar, limpa;
    private JPasswordField usuariosenha;
    private JLabel usuario, senha;

    /*JPanel representa um tipo básico de container para inserção de componentes.
    JLabel representa um rótulo de texto.
    JTextField representa um campo de texto onde o usuário pode informar um texto em uma linha.
    JPasswordField representa um campo de texto protegido, subclasse de JTextField.
    JButton representa um botão destinado a executar uma ação.
     */
    public Login() {
        super("Time7");
        setLayout(new FlowLayout());
        JPanel r = new JPanel();
        r.setLayout(new GridLayout(12, 12));

        this.setResizable(false); //bloquear redimensionamento da janela
        usuario = new JLabel("Usuário");
        r.add(usuario);
        usuariologin = new JTextField(14);
        r.add(usuariologin);

        senha = new JLabel("Senha");
        r.add(senha);
        usuariosenha = new JPasswordField(14);
        r.add(usuariosenha);
        add(r);

        entrar = new JButton("Entrar");

        entrar.addActionListener(new ActionListener() {
            //acao
            public void actionPerformed(ActionEvent evento) {
                if (evento.getSource() == entrar) {
                    if (usuariologin.getText().equals("usuario") && usuariosenha.getText().equals("senha")) {
                        //se o usuario for "usuario" e a senha for "senha", está correto.
                        JOptionPane.showMessageDialog(null, "Bem vindo ao Time 7! ");
                    } else {
                        // se nao, incorreto.
                        JOptionPane.showMessageDialog(null, "Usuário ou senha incorretos! ");
                    }
                }
            }
        }
        );
        add(entrar);

        limpa = new JButton("Limpar");
        //acao
        limpa.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evento) {
                if (evento.getSource() == limpa) {
                    usuariologin.setText("");
                    usuariosenha.setText("");
                }
            }
        }
        );
        add(limpa);
    }

}
