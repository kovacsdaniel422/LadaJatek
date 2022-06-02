package frame;

import java.awt.Image;
import java.awt.Graphics;
import javax.swing.ImageIcon;

public class LadaGUI extends javax.swing.JFrame {

    public LadaGUI() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        hatterPanel = new javax.swing.JPanel(){
            public void foHatterBeallit(Graphics g){
                ImageIcon im = new ImageIcon("Hatter.jpg");
                Image i =im.getImage();

                g.drawImage(i, 0, 0, this.getSize().width,this.getSize().height,this);

            }

        };
        gombokPanel = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("jButton1");
        gombokPanel.add(jButton1);

        jButton2.setText("jButton1");
        gombokPanel.add(jButton2);

        jButton3.setText("jButton1");
        gombokPanel.add(jButton3);

        javax.swing.GroupLayout hatterPanelLayout = new javax.swing.GroupLayout(hatterPanel);
        hatterPanel.setLayout(hatterPanelLayout);
        hatterPanelLayout.setHorizontalGroup(
            hatterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(gombokPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        hatterPanelLayout.setVerticalGroup(
            hatterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, hatterPanelLayout.createSequentialGroup()
                .addGap(0, 219, Short.MAX_VALUE)
                .addComponent(gombokPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(hatterPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(hatterPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LadaGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel gombokPanel;
    private javax.swing.JPanel hatterPanel;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    // End of variables declaration//GEN-END:variables
}
