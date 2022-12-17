
package beymel.ui;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class YetkiliKullaniciGui extends JDialog {
    public YetkiliKullaniciGui(){
        initDialog();   
    }
    private void initDialog(){
    add(initPanel());
    setTitle("Yetkili Kullanıcı Oluştur");
    pack();
    setLocationRelativeTo(null);
    setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
    setResizable(false);
    setVisible(true);
    }
    private JPanel initPanel(){
        JPanel anaPanel=new JPanel(new GridLayout(6, 2, 5, 5));
        
        JLabel adiLabel=new JLabel("Adı");
        JTextField adiField=new JTextField(10);
        JLabel soyadiLabel=new JLabel("Soyadı");
        JTextField soyadiField=new JTextField(10);
        JLabel kullaniciLabel=new JLabel("Kullanıcı Adı");
        JTextField kullaniciField=new JTextField(10);
        JLabel parolaLabel=new JLabel("Parola");
        JTextField parolaField=new JTextField(10);
        JLabel parolaYenidenLabel=new JLabel("Parola tekrar");
        JTextField parolaYenidenField=new JTextField(10);
        
        JButton olusturButton=new JButton("Oluştur");
        JButton iptalButton=new JButton("İptal");
        
        iptalButton.addActionListener(new ActionListener(){
            
        public void actionPerformerd(ActionEvent e){
            
        }

            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
    });

    anaPanel.add(adiLabel);
    anaPanel.add(adiField);
    anaPanel.add(soyadiLabel);
    anaPanel.add(soyadiField);
    anaPanel.add(kullaniciLabel);
    anaPanel.add(kullaniciField);
    anaPanel.add(parolaLabel);
    anaPanel.add(parolaField);
    anaPanel.add(parolaYenidenLabel);
    anaPanel.add( parolaYenidenField);
    anaPanel.add(olusturButton);
    anaPanel.add(iptalButton);

        return anaPanel;
        
    }
    
    
}
