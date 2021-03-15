
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.DefaultListModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Causin
 */
public class DeleteContato implements ActionListener {
     private TelaFornece tela;

    public DeleteContato(TelaFornece tela) {
        this.tela = tela;
    }

    
    public void actionPerformed(ActionEvent e) {
        //identificar selecao de item pra remover ele da lista e atualizar
        int selectedIndex = tela.getLista().getSelectedIndex();
        if (selectedIndex != -1) {
            DefaultListModel<ContatoFornece> model = (DefaultListModel<ContatoFornece>) tela.getLista().getModel();
            model.removeElementAt(selectedIndex);
            tela.getLista().setModel(model);
            
        }
    }
}
