
import java.awt.Dimension;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import static java.awt.GridBagConstraints.FIRST_LINE_START;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.SwingConstants;
import static javax.swing.SwingConstants.CENTER;
import javax.swing.text.StyledEditorKit.AlignmentAction;


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

    public JTextField usuariologin, login;
    private JButton entrar;
    public JButton acessoEstoque, acessoestoque2;
    public JPasswordField usuariosenha;
    private JLabel usuario, senha;
    public JButton camisa1, camisa2, camisa3, camisa4;
    public JButton estoquechefe, contratos, dadosGerais;

    /**
     *
     */
    /*JPanel representa um tipo básico de container para inserção de componentes.
    JLabel representa um rótulo de texto.
    JTextField representa um campo de texto onde o usuário pode informar um texto em uma linha.
    JPasswordField representa um campo de texto protegido, subclasse de JTextField.
    JButton representa um botão destinado a executar uma ação.
     */
    public Login() {
        super("Time7");
        setLayout(new FlowLayout());
        /* que é o gerenciador utilizado
        por padrão pela classe JPanel */
        JPanel r = new JPanel();
        r.setLayout(new GridLayout(5, 5));
        this.setResizable(false); //bloquear redimensionamento da janela
        usuario = new JLabel("Usuário");
        r.add(usuario);
        usuariologin = new JTextField(15);
        r.add(usuariologin);

        senha = new JLabel("Senha");
        r.add(senha);
        usuariosenha = new JPasswordField(15);
        r.add(usuariosenha);
        add(r);

        entrar = new JButton("Entrar");

        entrar.addActionListener(new ActionListener() {
            //acao
            public void actionPerformed(ActionEvent evento) {
                if (evento.getSource() == entrar) {
                    if (usuariologin.getText().equals("usuario") && usuariosenha.getText().equals("senha")) {
                        //se o usuario for "usuario" e a senha for "senha", está correto.
                        dispose();
                        switch (JOptionPane.showConfirmDialog(
                                null, "Você entrou no Time7!\n Bora conferir os produtos? ", "Time7", JOptionPane.YES_NO_OPTION)) {
                            case 0:
                                Produtos pro = new Produtos();
                                pro.setLocationRelativeTo(null); // abre a interface no meio da tela;
                                dispose();
                                pro.mostraProdutos();
                                //chama o metodo para mostrar os Produtos
                                break;

                            case 1:
                                JOptionPane.showMessageDialog(null, "Bom rolé!", "Aviso", JOptionPane.INFORMATION_MESSAGE);
                                break;
                        }
                    } else if (usuariologin.getText().equals("mestre") && usuariosenha.getText().equals("mestre")) {
                        //se o usuario for "usuario" e a senha for "senha", está correto.
                        dispose();
                        switch (JOptionPane.showConfirmDialog(null, "Bem vindo ao trabalho Mestre \n Deseja entrar?", "Time7", JOptionPane.YES_NO_OPTION)) {
                            case 0:
                                Estoque est = new Estoque();
                                est.setLocationRelativeTo(null);
                                dispose();
                                est.CalculaEstoque();
                                break;
                            case 1:
                                JOptionPane.showMessageDialog(null, "Até mais chefe", "Aviso", JOptionPane.INFORMATION_MESSAGE);
                        }

                    } else {
                        // se nao, incorreto.
                        JOptionPane.showMessageDialog(null, "Usuário ou senha incorretos! ");
                    }
                }
            }
        }
        );
        add(entrar);

    }

}
