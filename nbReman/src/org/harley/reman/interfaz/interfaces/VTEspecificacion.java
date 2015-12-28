/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.harley.reman.interfaz.interfaces;

import java.awt.event.*;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTree;
import javax.swing.tree.TreePath;
import org.harley.reman.interfaz.utilitario.ToolsInterface;
import org.harley.reman.sistema.Sistema;

/**
 *
 * @author User
 */
public class VTEspecificacion extends javax.swing.JInternalFrame {

    Sistema sysReman;
    TreePath dirTree;
    JFrame padre;
    MouseListener ml = new MouseAdapter() {
        @Override
        public void mouseClicked(MouseEvent e) {
            // Se obtiene el path para esa fila. Con el path podemos obtener
            // los nodos.
            if (e.getButton() == MouseEvent.BUTTON3) {
                dirTree = treeEsp.getPathForLocation(e.getX(), e.getY());
                treeEsp.setSelectionPath(dirTree);
                if (dirTree != null) {
                    switch (dirTree.getLastPathComponent().toString()) {
                        case "Documento de Especificación":
                            break;
                        case "Espesificación":
                            menuDocEsp.show(e.getComponent(), e.getX(), e.getY() + 10);
                            break;
                        default:
                            menuEsp.show(e.getComponent(), e.getX(), e.getY() + 10);
                            break;
                    }
                }
            }
        }
    };

    public VTEspecificacion(JFrame padre, Sistema sysReman, JTree tree) {
        initComponents();
        this.padre = padre;
        this.sysReman = sysReman;
        treeEsp.setModel(tree.getModel());
        treeEsp.addMouseListener(ml);
    }
    
    public VTEspecificacion(JFrame padre, Sistema sysReman) {
        initComponents();
        this.padre = padre;
        this.sysReman = sysReman;
        treeEsp.addMouseListener(ml);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menuDocEsp = new javax.swing.JPopupMenu();
        menuDocEspItem1 = new javax.swing.JMenuItem();
        menuDocEspItem2 = new javax.swing.JMenuItem();
        menuEsp = new javax.swing.JPopupMenu();
        menuEspItem1 = new javax.swing.JMenuItem();
        menuEspItem2 = new javax.swing.JMenuItem();
        menuEspItem3 = new javax.swing.JMenuItem();
        ExportarFile = new javax.swing.JFileChooser();
        scrollTree = new javax.swing.JScrollPane();
        treeEsp = new javax.swing.JTree();

        menuDocEspItem1.setText("Crear Especificación");
        menuDocEspItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuDocEspItem1ActionPerformed(evt);
            }
        });
        menuDocEsp.add(menuDocEspItem1);

        menuDocEspItem2.setText("Exportar a pdf");
        menuDocEspItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuDocEspItem2ActionPerformed(evt);
            }
        });
        menuDocEsp.add(menuDocEspItem2);

        menuEspItem1.setText("Modificar");
        menuEspItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuEspItem1ActionPerformed(evt);
            }
        });
        menuEsp.add(menuEspItem1);

        menuEspItem2.setText("Eliminar");
        menuEspItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuEspItem2ActionPerformed(evt);
            }
        });
        menuEsp.add(menuEspItem2);

        menuEspItem3.setText("Restaurar");
        menuEspItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuEspItem3ActionPerformed(evt);
            }
        });
        menuEsp.add(menuEspItem3);

        ExportarFile.setDialogType(javax.swing.JFileChooser.CUSTOM_DIALOG);
        ExportarFile.setDialogTitle("Seleccione");

        setMaximizable(true);
        setResizable(true);
        setPreferredSize(new java.awt.Dimension(250, 322));

        treeEsp.setBackground(new java.awt.Color(217, 221, 255));
        javax.swing.tree.DefaultMutableTreeNode treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("Documento de la Educción");
        javax.swing.tree.DefaultMutableTreeNode treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Educción");
        javax.swing.tree.DefaultMutableTreeNode treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("EDU 0001");
        treeNode2.add(treeNode3);
        treeNode1.add(treeNode2);
        treeEsp.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        scrollTree.setViewportView(treeEsp);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scrollTree, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scrollTree, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 292, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuDocEspItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuDocEspItem1ActionPerformed
        //NUEVA EDUCCION
    }//GEN-LAST:event_menuDocEspItem1ActionPerformed

    private void menuEspItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuEspItem1ActionPerformed
        //MODIFICAR EDUCCION
    }//GEN-LAST:event_menuEspItem1ActionPerformed

    private void menuEspItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuEspItem2ActionPerformed
        //ELIMINAR
        int resp = JOptionPane.showConfirmDialog(null, "Eliminar Educción", "Alerta!", JOptionPane.YES_NO_OPTION);
    }//GEN-LAST:event_menuEspItem2ActionPerformed

    private void menuEspItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuEspItem3ActionPerformed
        //RESTAURAR
    }//GEN-LAST:event_menuEspItem3ActionPerformed

    private void menuDocEspItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuDocEspItem2ActionPerformed
        //EXPORTAR ESPECIFICACION
        int opt = ExportarFile.showSaveDialog(this);
        String direccion;
        String nombre;
        if (opt == JFileChooser.APPROVE_OPTION) {
            direccion = ExportarFile.getSelectedFile().getParent();
            nombre = ExportarFile.getSelectedFile().getName();
            nombre = ToolsInterface.addExtensionPdf(nombre);
            if(!nombre.equals("error")){
                if(!sysReman.exportarLibro(Sistema.LIB_ESP,direccion, nombre)){
                    ToolsInterface.msjError(padre, "Error al cargar los datos, reviselos antes de continuar la operacion!");
                }
            }else{
                ToolsInterface.msjError(padre, "Error con el nombre del archivo, intentelo nuevamente!");
            }   
        }
    }//GEN-LAST:event_menuDocEspItem2ActionPerformed

    public void actualizarJTree(){
        JTree model = ToolsInterface.generateJTreeBook("Documento de Espesificación", "Espesificación", sysReman.getDirPrincipal() + "\\src\\esp");
        treeEsp.setModel(model.getModel());
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFileChooser ExportarFile;
    private javax.swing.JPopupMenu menuDocEsp;
    private javax.swing.JMenuItem menuDocEspItem1;
    private javax.swing.JMenuItem menuDocEspItem2;
    private javax.swing.JPopupMenu menuEsp;
    private javax.swing.JMenuItem menuEspItem1;
    private javax.swing.JMenuItem menuEspItem2;
    private javax.swing.JMenuItem menuEspItem3;
    private javax.swing.JScrollPane scrollTree;
    private javax.swing.JTree treeEsp;
    // End of variables declaration//GEN-END:variables
}
