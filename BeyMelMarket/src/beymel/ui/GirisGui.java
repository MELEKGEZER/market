
package beymel.ui;

import java.awt.GridBagLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class GirisGui extends JDialog {
    public GirisGui(){
        initDialog();   
    }
    private void initDialog(){
    add(initPanel());
    setTitle("Giriş");
    pack();
    setLocationRelativeTo(null);
    setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
    setResizable(false);
    setVisible(true);
    }
    private JPanel initPanel(){
        JPanel anaPanel=new JPanel(new GridLayout(3, 2, 5, 5));
        
        JLabel kullaniciAdiLabel= new JLabel("Kullanıcı Adı");
        JTextField kullaniciAdiField= new JTextField(10);
        JLabel parolaLabel= new JLabel("Parola");
        JTextField parolaField= new JTextField(10);
        JButton girisButton= new JButton("Giriş");
        JButton iptalButton= new JButton("İptal");
        
        anaPanel.add(kullaniciAdiLabel);
        anaPanel.add(kullaniciAdiField);
        anaPanel.add(parolaLabel);
        anaPanel.add(parolaField);
        anaPanel.add(girisButton);
        anaPanel.add(iptalButton);
        

        return anaPanel;
        
    }
    
}
