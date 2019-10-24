package redimensionador;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import redimensionador.engine.ImageResizer;

class Principal extends javax.swing.JFrame {

    private ImageResizer redimenzionador;
    private Boolean click_previo;
    private int x;
    private int y;
    private int x2;
    private int y2;

    public Principal() {
        initComponents();
        redimenzionador = new ImageResizer();
        click_previo = false;
        x = 0;
        y = 0;
        x2 = 0;
        y2 = 0;

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        MensajeCorrecto = new javax.swing.JLabel();
        BotonSeleccionar = new javax.swing.JButton();
        labelPathImagen = new javax.swing.JLabel();
        botonRedimenzionar = new javax.swing.JButton();
        FolderSalida = new javax.swing.JButton();
        labelFolderSalida = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        cropBoton = new javax.swing.JButton();
        imagenMostrar = new javax.swing.JLabel();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();

        jDialog1.setTitle("Mensaje");
        jDialog1.setResizable(false);
        jDialog1.setSize(new java.awt.Dimension(450, 200));

        MensajeCorrecto.setFont(new java.awt.Font("Dialog", 1, 22)); // NOI18N
        MensajeCorrecto.setText("Imagen redimensionada correctamente");

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(MensajeCorrecto)
                .addContainerGap(49, Short.MAX_VALUE))
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(MensajeCorrecto, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(221, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 51, 51));

        BotonSeleccionar.setText("Seleccionar Imagen");
        BotonSeleccionar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotonSeleccionarMouseClicked(evt);
            }
        });

        botonRedimenzionar.setText("Redimenzionar");
        botonRedimenzionar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonRedimenzionarMouseClicked(evt);
            }
        });

        FolderSalida.setText("Folder Saida");
        FolderSalida.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                FolderSalidaMouseClicked(evt);
            }
        });

        jRadioButton1.setText("Banner");

        jRadioButton2.setText("Categoria");

        cropBoton.setText("Recortar");
        cropBoton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cropBotonMouseClicked(evt);
            }
        });

        imagenMostrar.setBackground(new java.awt.Color(255, 255, 255));
        imagenMostrar.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                imagenMostrarMouseDragged(evt);
            }
        });
        imagenMostrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imagenMostrarMouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                imagenMostrarMouseReleased(evt);
            }
        });

        jRadioButton3.setText("Producto");

        jRadioButton4.setText("Negocio");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jRadioButton1)
                                        .addGap(18, 18, 18)
                                        .addComponent(jRadioButton2)
                                        .addGap(28, 28, 28)
                                        .addComponent(jRadioButton3)
                                        .addGap(38, 38, 38)
                                        .addComponent(jRadioButton4)
                                        .addGap(0, 22, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(imagenMostrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(108, 108, 108))))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(BotonSeleccionar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(FolderSalida, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelFolderSalida, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(labelPathImagen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(botonRedimenzionar, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(96, 96, 96)
                        .addComponent(cropBoton, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(28, 100, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(BotonSeleccionar)
                    .addComponent(labelPathImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(FolderSalida)
                    .addComponent(labelFolderSalida, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton1)
                    .addComponent(jRadioButton2)
                    .addComponent(jRadioButton3)
                    .addComponent(jRadioButton4))
                .addGap(18, 18, 18)
                .addComponent(imagenMostrar, javax.swing.GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonRedimenzionar)
                    .addComponent(cropBoton))
                .addGap(25, 25, 25))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotonSeleccionarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonSeleccionarMouseClicked
        final JFileChooser chooser = new JFileChooser();
        chooser.setFileSelectionMode(JFileChooser.FILES_ONLY);

        int returnVal = chooser.showOpenDialog(this);
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            String filePath = (chooser.getSelectedFile().toString());
            redimenzionador.set_image_path(filePath);
            labelPathImagen.setText(filePath);
            ImageIcon imagenPintar = new ImageIcon(filePath);
            int anchura = imagenPintar.getIconWidth();
            int altura = imagenPintar.getIconHeight();
            System.out.println("anchura" + anchura);
            System.out.println("Altura" + altura);
            imagenMostrar.setSize(anchura, altura);
            imagenMostrar.setIcon(imagenPintar);
        }
    }//GEN-LAST:event_BotonSeleccionarMouseClicked

    private void FolderSalidaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FolderSalidaMouseClicked
        final JFileChooser chooser_dos = new JFileChooser();

        chooser_dos.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        chooser_dos.setApproveButtonText("Seleccionar");
        int returnVal = chooser_dos.showOpenDialog(this);
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            String folderPath = (chooser_dos.getSelectedFile().toString());
            redimenzionador.set_folder_salida(folderPath);
            labelFolderSalida.setText(folderPath);
        }

    }//GEN-LAST:event_FolderSalidaMouseClicked

    private void botonRedimenzionarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonRedimenzionarMouseClicked
        try {
            redimenzionador.redimenzionar();
            Dimension altura_p = this.getSize();
            System.out.println(altura_p);
            int pos_x = this.getX();
            int pos_y = this.getY();
            jDialog1.setBounds(pos_x, pos_y, 500, 250);
            jDialog1.show();
            MensajeCorrecto.show();
        } catch (IOException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_botonRedimenzionarMouseClicked

    private void cropBotonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cropBotonMouseClicked
        try {

            redimenzionador.crop(x, y, x2, y2);
        } catch (IOException ex) {
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_cropBotonMouseClicked

    private void imagenMostrarMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imagenMostrarMouseReleased
        Graphics g = imagenMostrar.getGraphics();
        g.setColor(Color.red);
        g.drawRect(x, y, x2, y2);
    }//GEN-LAST:event_imagenMostrarMouseReleased

    private void imagenMostrarMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imagenMostrarMouseDragged
        repaint();
        Graphics g = imagenMostrar.getGraphics();
        g.setColor(Color.CYAN);
        x2 = evt.getX() - x;
        y2 = evt.getY() - y;
        g.drawRect(x, y, x2, y2);

    }//GEN-LAST:event_imagenMostrarMouseDragged

    private void imagenMostrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imagenMostrarMouseClicked
        x = evt.getX();
        y = evt.getY();
    }//GEN-LAST:event_imagenMostrarMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    System.out.println("info______lookandfeel");
                    System.out.println(info);
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonSeleccionar;
    private javax.swing.JButton FolderSalida;
    private javax.swing.JLabel MensajeCorrecto;
    private javax.swing.JButton botonRedimenzionar;
    private javax.swing.JButton cropBoton;
    private javax.swing.JLabel imagenMostrar;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JLabel labelFolderSalida;
    private javax.swing.JLabel labelPathImagen;
    // End of variables declaration//GEN-END:variables
}
