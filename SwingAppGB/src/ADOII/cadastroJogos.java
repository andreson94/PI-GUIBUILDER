package ADOII;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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
public class cadastroJogos {
    public static void main(String[] args) {
        Runnable t= new Runnable() {
            public void run() {
                criarGUI();
            }
        };
        SwingUtilities.invokeLater(t);
    }
    
    public static void criarGUI(){
        JFrame frame = new JFrame();
        Dimension d = new Dimension(400,600);
        frame.setMinimumSize(d);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Cadastro de jogos");
        
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout(FlowLayout.RIGHT));
        frame.getContentPane().add(panel);
        
        JLabel lblNome = new JLabel("Nome: ");
        panel.add(lblNome);
        
        final JTextField txtNome = new JTextField(10);
        panel.add(txtNome);
        
        
        JButton btnSalvar = new JButton("Salvar");
        panel.add(btnSalvar);

        ActionListener listenerSalvar = new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                JOptionPane.showMessageDialog(panel,"Salvo");
            }
        };
            btnSalvar.addActionListener(listenerSalvar);

        JButton btnMostrar = new JButton("Mostrar");
        panel.add(btnMostrar);
         
        ActionListener listenerMostrar = new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                JOptionPane.showMessageDialog(panel,"Nome:  "+txtNome.getText());
            }
        };
            btnMostrar.addActionListener(listenerMostrar);
        
        
        
        
        frame.pack();
        frame.setVisible(true);
    }
}
