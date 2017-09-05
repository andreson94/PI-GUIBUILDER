package ADOII;

import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

/**
 *
 * @author Andreson
 */
public class cadastroUsuarios {
    public static void main(String[] args) {
        Runnable t= new Runnable() {
            public void run() {
                
            }
        };
        SwingUtilities.invokeLater(t);
    }
    
    public static void criarGUI(){
        JFrame frame = new JFrame();
        Dimension d = new Dimension(400,600);
        frame.setMinimumSize(d);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Cadastro de Dados dos Usúarios");
        
        JPanel panel = new JPanel();
        frame.getContentPane().add(panel);
        
        JLabel lblnome = new JLabel("Nome: ");
        panel.add(lblnome);
        
        JTextField txtnome = new JTextField(10);
        panel.add(txtnome);
        
        
        
        frame.pack();
        frame.setVisible(true);
    }
}
