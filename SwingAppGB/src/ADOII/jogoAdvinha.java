package ADOII;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

/**
 *
 * @author Andreson
 */
public class jogoAdvinha {
    /*Elabore um programa Java Desktop onde o usuário possa tentar adivinhar
 um número com um limite de tentativas. Se o limite for excedido, o programa
 é encerrado (utilize o comando System.exit(0) para finalizar a aplicação).
 O número pode ser fixo ou aleatório;*/
    public static void main(String[] args) {
        Runnable r = new Runnable() {
            public void run() {
                criarGUI();
            }
        };
        SwingUtilities.invokeLater(r);
    }
    public static void criarGUI(){
        JFrame frame = new JFrame();
        Dimension d = new Dimension(400,600);
        frame.setMinimumSize(d);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Advinha o Número");
        
        JPanel panel = new JPanel();
        frame.getContentPane().add(panel);
        
        final JLabel lblNumero = new JLabel("Digite o Número");
        panel.add(lblNumero);
        
        final JTextField txtNumero = new JTextField(5);
        panel.add(txtNumero);
        
        
        JButton btnVerificar = new JButton("Verificar");
        panel.add(btnVerificar);
        
        ActionListener listener = new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
               
                Random aleatorio = new Random();
                int random = aleatorio.nextInt(10);
                int tentativas=5;
                int sair =0;
                
                while(tentativas > 0){
                    
                if (txtNumero.equals(random)){
                JOptionPane.showMessageDialog(frame,"Numero: "+txtNumero.getText()+"\n Acertou");
                }else{
                    tentativas--;
                 JOptionPane.showMessageDialog(frame," ERROOOU!"+"\nTentativas restatntes: "+tentativas);
                }
            }
            System.exit(sair);

            }
        };
        btnVerificar.addActionListener(listener);
        
        frame.pack();
        frame.setVisible(true);
    }
}
