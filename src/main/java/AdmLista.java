
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Causin
 */
public class AdmLista implements ListSelectionListener{
    TelaFornece tela;
    public AdmLista(TelaFornece tela){
        this.tela = tela;
    }

   public void valueChanged(ListSelectionEvent e) {
        int firstIndex = tela.getLista().getSelectedIndex();

        if (firstIndex != -1) {

            
            ContatoFornece elementAt = tela.getLista().getModel().getElementAt(firstIndex);
            tela.getTfNome().setText(elementAt.getNome());
            tela.getTfTelefone().setText(elementAt.getTelefone());
            tela.getTfDescricao().setText(elementAt.getAnotacoes());
            
            tela.setLastIndex(firstIndex);
        }
    }

    
}
