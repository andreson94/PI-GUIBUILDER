package ADOII;

import java.awt.Dimension;
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
public class cadastroUsuarios {
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
        frame.setTitle("Cadastro de Dados dos Usúarios");
        
        JPanel panel = new JPanel();
        frame.getContentPane().add(panel);
        
        JLabel lblNome = new JLabel("Nome: ");
        panel.add(lblNome);
        
        final JTextField txtNome = new JTextField(10);
        panel.add(txtNome);
        
        JLabel lblEndereco = new JLabel("Endereço: ");
        panel.add(lblEndereco);
        
        final JTextField txtEndereco = new JTextField(15);
        panel.add(txtEndereco);
        
        JLabel lblTel = new JLabel("Telefone: ");
        panel.add(lblTel);
        
        final JTextField txtTel = new JTextField(10);
        panel.add(txtTel);
        
        JButton btnSalvar = new JButton("Salvar");
        panel.add(btnSalvar);

        ActionListener listener = new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                JOptionPane.showMessageDialog(panel,"Nome:  "+txtNome.getText()+"\nEnd: "+txtEndereco.getText()+"\nTel: "+txtTel.getText());
            }
        };
            btnSalvar.addActionListener(listener);

        JButton btnMostrar = new JButton("Mostrar");
        panel.add(btnMostrar);
         
        ActionListener listener = new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                JOptionPane.showMessageDialog(panel,"Nome:  "+txtNome.getText()+"\nEnd: "+txtEndereco.getText()+"\nTel: "+txtTel.getText());
            }
        };
            btnMostrar.addActionListener(listener);
        
        
        
        
        frame.pack();
        frame.setVisible(true);
    }
}
