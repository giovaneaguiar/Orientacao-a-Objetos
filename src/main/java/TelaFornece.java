
import java.awt.BorderLayout;
import java.awt.Dimension;
import javax.swing.BorderFactory;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Causin
 */
//erro é nessa e na de salvar
public class TelaFornece extends JFrame {
    JPanel telaPrin;
    private JList<ContatoFornece> lista;
    private JTextField tfNome;
    private JTextField tfTelefone;
    private JTextField tfDescricao;
    private int lastIndex;

    TelaFornece(String text, String text0, String text1) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public JList<ContatoFornece> getLista() {
        return lista;
    }

    public void setLista(JList<ContatoFornece> lista) {
        this.lista = lista;
    }

    
    public TelaFornece(){
        this.lastIndex = 0;
        
    }

    public int getLastIndex() {
        return lastIndex;
    }

    public void setLastIndex(int lastIndex) {
        this.lastIndex = lastIndex;
    }

    public JPanel getTelaPrin() {
        return telaPrin;
    }

    public void setTelaPrin(JPanel telaPrin) {
        this.telaPrin = telaPrin;
    }

    public JTextField getTfNome() {
        return tfNome;
    }

    public void setTfNome(JTextField tfNome) {
        this.tfNome = tfNome;
    }

    public JTextField getTfTelefone() {
        return tfTelefone;
    }

    public void setTfTelefone(JTextField tfTelefone) {
        this.tfTelefone = tfTelefone;
    }

    public JTextField getTfDescricao() {
        return tfDescricao;
    }

    public void setTfDescricao(JTextField tfDescricao) {
        this.tfDescricao = tfDescricao;
    }
    
    
    private void configJan(){
         this.setSize(400,300 );
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.telaPrin = new JPanel();
        this.telaPrin.setLayout(new BorderLayout());
        
        
    }
    private void configuraContatos() {
        JPanel jpContatos = new JPanel();
        jpContatos.setBorder(BorderFactory.createTitledBorder("Fornecedores"));
        jpContatos.setLayout(new BorderLayout());
        jpContatos.setPreferredSize(new Dimension (200,200));  

        DefaultListModel<ContatoFornece> model = new DefaultListModel<>();

        lista = new JList<>(model);
        lista.setVisible(true);
        lista.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        lista.addListSelectionListener(new ConfigLista(this));
        jpContatos.add(new JScrollPane(lista), BorderLayout.CENTER);


        telaPrin.add(jpContatos, BorderLayout.WEST);
    }
    private void configuraFormulario() {
        //definindo tamanho padrao
        int size = 15;
        JPanel jpFormulario = new JPanel();
        jpFormulario.setBorder(BorderFactory.createTitledBorder("Dados de Fornecedores"));
        //definiu um painel / uma borda com titulo
        
        jpFormulario.add(new JLabel("Nome:"));
        tfNome = new JTextField(size);
        jpFormulario.add(tfNome);

        jpFormulario.add(new JLabel("Telefone:"));
        tfTelefone = new JTextField(size);
        jpFormulario.add(tfTelefone);

        jpFormulario.add(new JLabel("Descrição:"));
        tfDescricao = new JTextField(size);
        jpFormulario.add(tfDescricao);

                
        //agora é a parte em que sao criadas as classes de açoes
        JButton btnAdicionar = new JButton("Adicionar");
        btnAdicionar.addActionListener(new SalvarContato(this) );
        jpFormulario.add(btnAdicionar);

        JButton btnRemover = new JButton("Remover");
        btnRemover.addActionListener(new DeleteContato(this));
        jpFormulario.add(btnRemover);
        
        JButton btnLimpar = new JButton("Limpar");
        btnLimpar.addActionListener(new EsvaziaContato(this));
        jpFormulario.add(btnLimpar);
        
        JButton btnEditar = new JButton("Editar");
        btnEditar.addActionListener(new AjusteContato(this));
        jpFormulario.add(btnEditar);
        
        telaPrin.add(jpFormulario, BorderLayout.CENTER);

    }
     public void mostraTela() {
        this.add(telaPrin);
        this.setVisible(true);
    }

    public void montaTela() {
        configJan();
        configuraContatos();
        configuraFormulario();
        mostraTela();
    }

    //public static void main(String[] args) {
     //   TelaFornece tela = new TelaFornece();
     //   tela.montaTela();
    //}
}
