
import java.awt.event.ActionEvent;
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
public class AjusteContato implements java.awt.event.ActionListener{
     TelaFornece tela;

    public AjusteContato(TelaFornece tela) {
        this.tela = tela;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        ListModel<ContatoFornece> model = this.tela.getLista().getModel();
        ContatoFornece fornece = model.getElementAt(tela.getLastIndex());
        fornece.setNome(tela.getTfNome().getText());
        fornece.setTelefone(tela.getTfTelefone().getText());
        fornece.setAnotacoes(tela.getTfDescricao().getText());
        
        
        tela.repaint();

        
    }
}
