
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.DefaultListModel;
import javax.swing.ListModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Causin
 */
public class SalvarContato implements ActionListener {

    TelaFornece tela;

    public SalvarContato(TelaFornece tela) {
        this.tela = tela;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        DefaultListModel<ContatoFornece> model = (DefaultListModel<ContatoFornece>) tela.getLista().getModel();

        model.addElement(new ContatoFornece(tela.getTfNome().getText(), tela.getTfTelefone().getText(), tela.getTfDescricao().getText()));
        tela.getLista().setModel(model);
        tela.repaint();

    }

}
