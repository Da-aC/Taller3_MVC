/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.unicauca.clientes.vista;

import co.unicauca.clientes.modelo.ClientesDB;
import java.awt.Color;

import java.awt.Graphics;
import java.text.DecimalFormat;
import java.util.Observable;


/**
 *
 * @author DAAC
 */
public class GUISexoGrafica extends javax.swing.JFrame implements java.util.Observer{

    /**
     * Creates new form GUISexoGrafica
     */

    public GUISexoGrafica(int x, int y) {
        initComponents();
        setSize(200, 230);
        setLocation(x, y);
        setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblHombres = new javax.swing.JLabel();
        lblMujeres = new javax.swing.JLabel();
        pnlHombres = new javax.swing.JPanel();
        pnlMujeres = new javax.swing.JPanel();
        lblHombresPorcentaje = new javax.swing.JLabel();
        lblMujeresPorcentaje = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblHombres.setText("Hombres");

        lblMujeres.setText("Mujeres");

        pnlHombres.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout pnlHombresLayout = new javax.swing.GroupLayout(pnlHombres);
        pnlHombres.setLayout(pnlHombresLayout);
        pnlHombresLayout.setHorizontalGroup(
            pnlHombresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        pnlHombresLayout.setVerticalGroup(
            pnlHombresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        pnlMujeres.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout pnlMujeresLayout = new javax.swing.GroupLayout(pnlMujeres);
        pnlMujeres.setLayout(pnlMujeresLayout);
        pnlMujeresLayout.setHorizontalGroup(
            pnlMujeresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        pnlMujeresLayout.setVerticalGroup(
            pnlMujeresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pnlHombres, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblHombres, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
                    .addComponent(lblHombresPorcentaje, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pnlMujeres, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblMujeres, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
                    .addComponent(lblMujeresPorcentaje, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(40, 40, 40))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(54, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlHombres, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnlMujeres, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblMujeresPorcentaje, javax.swing.GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE)
                    .addComponent(lblHombresPorcentaje, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblHombres)
                    .addComponent(lblMujeres))
                .addGap(33, 33, 33))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GUISexoGrafica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUISexoGrafica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUISexoGrafica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUISexoGrafica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new GUISexoGrafica(200,200).setVisible(true);
        });
    }

    @Override
     public void update(Observable obs, Object arg) {
    ClientesDB cliDB = (ClientesDB)obs;
    setTitle("Grafica" + cliDB.getProfesion());
    graficar(cliDB.getTotalHombres(), cliDB.getTotalMujeres());
  }

    public void graficar(int hombres, int mujeres) {
    
    float total = (hombres + mujeres);
    float prmHombres = hombres / total;
    float prmMujeres = mujeres /total;
    DecimalFormat f = new DecimalFormat("#.00");
    //grafica mujeres
    Graphics gM = this.pnlMujeres.getGraphics();
    gM.setColor(pnlMujeres.getBackground());
    gM.fillRect(1, 1, pnlMujeres.getWidth()-2, pnlMujeres.getHeight()-2);
    gM.setColor(Color.red);
    lblMujeresPorcentaje.setText(f.format(prmMujeres * 100.0F)+"%");
    gM.fillRect(1, 1, pnlMujeres.getWidth()-2, pnlMujeres.getHeight()-2);
    gM.setColor(pnlMujeres.getBackground());
    gM.fillRect(1, 1, pnlMujeres.getWidth()-2, (int) (pnlMujeres.getHeight() - (pnlMujeres.getHeight()*prmMujeres)));
    
    //grafica hombres
    Graphics gH = this.pnlHombres.getGraphics();
    gH.setColor(pnlHombres.getBackground());
    gH.fillRect(1, 1, pnlHombres.getWidth()-2, pnlHombres.getHeight()-2);
    gH.setColor(Color.red);
    lblHombresPorcentaje.setText(f.format(prmHombres * 100.0F)+"%");
    gH.fillRect(1, 1, pnlHombres.getWidth()-2, pnlHombres.getHeight()-2);
    gH.setColor(pnlHombres.getBackground());
    gH.fillRect(1, 1, pnlHombres.getWidth()-2, (int) (pnlHombres.getHeight() - (pnlHombres.getHeight()*prmHombres)));
 
    //gH.fillRect(0, 0, pnlHombres.getWidth(), (int) (pnlHombres.getHeight() - (pnlHombres.getHeight()*prmHombres)));
  }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lblHombres;
    private javax.swing.JLabel lblHombresPorcentaje;
    private javax.swing.JLabel lblMujeres;
    private javax.swing.JLabel lblMujeresPorcentaje;
    private javax.swing.JPanel pnlHombres;
    private javax.swing.JPanel pnlMujeres;
    // End of variables declaration//GEN-END:variables
}
