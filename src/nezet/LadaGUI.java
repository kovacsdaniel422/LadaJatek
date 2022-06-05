package nezet;

import lada.Lada;

public class LadaGUI extends javax.swing.JFrame {

    private Lada L1;

    public LadaGUI() {
        initComponents();
        setTitle("Kincs Kereső játék");
        L1 = new Lada();
        lblLeir.setText("<html><p>"+ L1.getLeiras() +"</p></html>");

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        hatterPanel = new javax.swing.JPanel();
        gombokPanel = new javax.swing.JPanel();
        jbArany = new javax.swing.JButton();
        jbEzust = new javax.swing.JButton();
        jbBronz = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        lblFejlec = new javax.swing.JLabel();
        pnlLeir = new javax.swing.JPanel();
        lblLeir = new javax.swing.JLabel();
        restart = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        stat = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jbArany.setBackground(new java.awt.Color(255, 255, 255));
        jbArany.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nezet/AranyLada.jpeg"))); // NOI18N
        jbArany.setActionCommand("Arany");
        jbArany.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbArany.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                hoverEffect(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                hoverVege(evt);
            }
        });
        jbArany.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                valaszEllenoriz(evt);
            }
        });
        gombokPanel.add(jbArany);

        jbEzust.setBackground(new java.awt.Color(255, 255, 255));
        jbEzust.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nezet/EzustLada.jpeg"))); // NOI18N
        jbEzust.setActionCommand("Ezüst");
        jbEzust.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbEzust.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                hoverEffect(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                hoverVege(evt);
            }
        });
        jbEzust.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                valaszEllenoriz(evt);
            }
        });
        gombokPanel.add(jbEzust);

        jbBronz.setBackground(new java.awt.Color(255, 255, 255));
        jbBronz.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nezet/BronzLada.jpeg"))); // NOI18N
        jbBronz.setActionCommand("Bronz");
        jbBronz.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbBronz.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                hoverEffect(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                hoverVege(evt);
            }
        });
        jbBronz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                valaszEllenoriz(evt);
            }
        });
        gombokPanel.add(jbBronz);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblFejlec.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblFejlec.setText("Üdvözöllek a Kincskereső játékunkban. ");

        javax.swing.GroupLayout pnlLeirLayout = new javax.swing.GroupLayout(pnlLeir);
        pnlLeir.setLayout(pnlLeirLayout);
        pnlLeirLayout.setHorizontalGroup(
            pnlLeirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblLeir, javax.swing.GroupLayout.DEFAULT_SIZE, 382, Short.MAX_VALUE)
        );
        pnlLeirLayout.setVerticalGroup(
            pnlLeirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblLeir, javax.swing.GroupLayout.DEFAULT_SIZE, 93, Short.MAX_VALUE)
        );

        restart.setText("Újrapróbálom!");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblFejlec, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(pnlLeir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(20, 20, 20))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(102, 102, 102)
                .addComponent(restart, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(lblFejlec, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlLeir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(restart)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setText("Arany");

        jLabel2.setText("Ezüst");

        jLabel3.setText("Bronz");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jLabel1)
                .addGap(113, 113, 113)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 120, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(45, 45, 45))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3))
                .addContainerGap())
        );

        javax.swing.GroupLayout hatterPanelLayout = new javax.swing.GroupLayout(hatterPanel);
        hatterPanel.setLayout(hatterPanelLayout);
        hatterPanelLayout.setHorizontalGroup(
            hatterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(hatterPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(hatterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(hatterPanelLayout.createSequentialGroup()
                        .addGroup(hatterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(gombokPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 439, Short.MAX_VALUE))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, hatterPanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(hatterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(stat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(28, 28, 28))))
        );
        hatterPanelLayout.setVerticalGroup(
            hatterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, hatterPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(gombokPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(stat, javax.swing.GroupLayout.DEFAULT_SIZE, 19, Short.MAX_VALUE)
                .addContainerGap())
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
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void valaszEllenoriz(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_valaszEllenoriz
        String felirat = evt.getActionCommand();
        vizsgal(felirat);
    }//GEN-LAST:event_valaszEllenoriz

    private void hoverEffect(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hoverEffect
        stat.setText("Rávitted az egered");
    }//GEN-LAST:event_hoverEffect

    private void hoverVege(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hoverVege
       stat.setText("");
    }//GEN-LAST:event_hoverVege

    private void vizsgal(String Tipp) {
        if (Tipp.equals(L1.getHelyesLada())) {
            lblLeir.setText("nyertél");
        } else {
            lblLeir.setText("vesztettél");
        }
        
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel gombokPanel;
    private javax.swing.JPanel hatterPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton jbArany;
    private javax.swing.JButton jbBronz;
    private javax.swing.JButton jbEzust;
    private javax.swing.JLabel lblFejlec;
    private javax.swing.JLabel lblLeir;
    private javax.swing.JPanel pnlLeir;
    private javax.swing.JButton restart;
    private javax.swing.JLabel stat;
    // End of variables declaration//GEN-END:variables
}
