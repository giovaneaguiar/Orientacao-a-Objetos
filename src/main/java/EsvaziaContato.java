
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Causin
 */
public class EsvaziaContato implements ActionListener{

    public EsvaziaContato(TelaFornece tela) {
        this.tela = tela;
    }
    
    TelaFornece tela;

    @Override
    public void actionPerformed(ActionEvent e) {
        tela.getTfDescricao().setText("");
        tela.getTfNome().setText("");
        tela.getTfTelefone().setText(""); 
    }
}
