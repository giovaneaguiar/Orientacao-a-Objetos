
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
public class ConfigLista implements ListSelectionListener{

    TelaFornece tela;
    public ConfigLista(TelaFornece tela){
        this.tela = tela;
    }

    @Override
    public void valueChanged(ListSelectionEvent e) {
        int firstIndex = tela.getLista().getSelectedIndex();
        //se tem algum item selecionado volta menos 1, mas como 
        //vamo selecionar, ele vai voltar algo
        if (firstIndex != -1) {
        //se for diferente, chama contato na posicao (indice) 
        //e altera os textfields e muda a tela atualizando  
            
            ContatoFornece elementAt = tela.getLista().getModel().getElementAt(firstIndex);
            tela.getTfNome().setText(elementAt.getNome());
            tela.getTfTelefone().setText(elementAt.getTelefone());
            tela.getTfDescricao().setText(elementAt.getAnotacoes());
            
            tela.setLastIndex(firstIndex);
        }
    }
    }
    

