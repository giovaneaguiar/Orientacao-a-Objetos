
import java.awt.BorderLayout;
import java.awt.GridLayout;
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

    }

    void mostraProdutos() {
        GridLayout grid = new GridLayout(3, 2);
        BorderLayout border = new BorderLayout();
        JPanel painelLogin = new JPanel(grid);
        JPanel painelPrincipal = new JPanel(border);
        TitledBorder bordaLogin = new TitledBorder(BorderFactory.createLoweredBevelBorder(), "Informações do usuário", 1, 1);

    }

}
