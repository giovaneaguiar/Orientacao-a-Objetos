
import java.awt.Component;
import java.awt.Container;
import java.awt.Font;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;

import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Imagem {

    // Declara componentes
    JLabel rotulo;
    JLabel figura;
    BufferedImage imagem;
    URL url;

    public Container criaPainel() {
        // Cria painel
        JPanel painel = new JPanel();

        // Cria layout
        painel.setLayout(new BoxLayout(painel, BoxLayout.PAGE_AXIS));
        painel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        // Cria componentes
        rotulo = new JLabel("Classic");
        //escolhe fonte
        Font f = new Font("SansSerif", Font.BOLD, 20);
        rotulo.setFont(f);

        /* Tenta abrir uma imagem de uma url, ou seja, link da web, tentei fugir
        fato de colocar imagens do computador. 
        
        Bloco try/catch serve para tratamento de exceções, tratamento de códigos que 
        podem não ser totalmente atendidos e gerarem alguma exceção/erro.
        
       O try consegue recuperar erros que possam ocorrer no código 
       fornecido em seu bloco.
       O catch por sua vez faz o tratamento dos erros que aconteceram.
         */
        try {
            url = new URL("https://i.pinimg.com/564x/02/dd/2b/02dd2bc7c4ab1311d6ede07ba08e6e19.jpg");
            imagem = ImageIO.read(url);
        } catch (IOException e) {
            //se der errado, esse comando retorna o erro mais detalhado
            //IOException é a exception padrão para erros de leitura e gravação.
            JOptionPane.showMessageDialog(null, "Erro com o endereço URL", "Aviso", JOptionPane.INFORMATION_MESSAGE);
        }

        // Cria uma figura e a exibe em um JLabel
        ImageIcon fig = new ImageIcon(imagem);
        figura = new JLabel(fig);

        // Alinha componentes
        rotulo.setAlignmentX(Component.CENTER_ALIGNMENT);
        figura.setAlignmentX(Component.CENTER_ALIGNMENT);

        // Adiciona componentes ao painel
        painel.add(rotulo);
        painel.add(Box.createVerticalStrut(10));
        painel.add(figura);

        return painel;
    }

    // Cria GUI 
    public static void criaGUI() {
        // Cria formulario
        JFrame formulario = new JFrame("Time7");

        // cria nova instancia da classe
        Imagem pic = new Imagem();

        // Adiciona painel ao formulario
        formulario.setContentPane(pic.criaPainel());

        // Adiciona tamanho do formulario
        formulario.setSize(800, 600);

        // Exibe formulario
        formulario.setVisible(true);

    }

    public static void main(String[] args) {

        // Thread do swing
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            /* O que o método SwingUtilities.invokeLater() faz é receber um evento de interface 
            (encapsulado numa implementação de Runnable; para que seja despachado pela thread de 
            eventos de interface assim que houver oportunidade. */
            public void run() {
                // Mostra Gui
                criaGUI();
            }
        });
    }
}
