/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.harley.reman.interfaz.interfaces;

import java.awt.event.*;
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
public class VTOrganizacion extends javax.swing.JInternalFrame {

    Sistema sysReman;
    TreePath dirTree;
    JFrame padre;
    MouseListener ml = new MouseAdapter() {
        @Override
        public void mouseClicked(MouseEvent e) {
            // Se obtiene el path para esa fila. Con el path podemos obtener
            // los nodos.
            if (e.getButton() == MouseEvent.BUTTON3) {
                dirTree = treeOrgMain.getPathForLocation(e.getX(), e.getY());
                treeOrgMain.setSelectionPath(dirTree);
                if (dirTree != null) {
                    switch (dirTree.getLastPathComponent().toString()) {
                        case "Documentos de la Organización":
                            break;
                        case "Organización":
                            menuDocOrg.show(e.getComponent(), e.getX(), e.getY() + 10);
                            break;
                        case "Actores":
                            break;
                        case "Especialista":
                            menuDocPyt.show(e.getComponent(), e.getX(), e.getY() + 10);
                            break;
                        case "Fuente":
                            menuDocSth.show(e.getComponent(), e.getX(), e.getY() + 10);
                            break;
                    }
                    if (ToolsInterface.checkExpReg("ORG[0-9][0-9][0-9][0-9]", dirTree.getLastPathComponent().toString())) {
                        menuOrg.show(e.getComponent(), e.getX(), e.getY() + 10);
                    }
                    if (ToolsInterface.checkExpReg("PYT[0-9][0-9][0-9][0-9]", dirTree.getLastPathComponent().toString())) {
                        menuPyt.show(e.getComponent(), e.getX(), e.getY() + 10);
                    }
                    if (ToolsInterface.checkExpReg("STH[0-9][0-9][0-9][0-9]", dirTree.getLastPathComponent().toString())) {
                        menuSth.show(e.getComponent(), e.getX(), e.getY() + 10);
                    }
                }
            }
        }
    };

    public VTOrganizacion(JFrame padre, Sistema sysReman, JTree tree) {
        initComponents();
        this.padre = padre;
        this.sysReman = sysReman;
        treeOrgMain.setModel(tree.getModel());
        treeOrgMain.addMouseListener(ml);
    }
    
    public VTOrganizacion(JFrame padre, Sistema sysReman) {
        initComponents();
        this.padre = padre;
        this.sysReman = sysReman;
        treeOrgMain.addMouseListener(ml);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menuDocOrg = new javax.swing.JPopupMenu();
        menuDocOrgItem1 = new javax.swing.JMenuItem();
        menuOrg = new javax.swing.JPopupMenu();
        menuOrgItem1 = new javax.swing.JMenuItem();
        menuOrgItem2 = new javax.swing.JMenuItem();
        menuOrgItem3 = new javax.swing.JMenuItem();
        menuDocPyt = new javax.swing.JPopupMenu();
        menuDocPytItem1 = new javax.swing.JMenuItem();
        menuDocSth = new javax.swing.JPopupMenu();
        menuDocSthItem1 = new javax.swing.JMenuItem();
        menuPyt = new javax.swing.JPopupMenu();
        menuPytItem1 = new javax.swing.JMenuItem();
        menuPytItem2 = new javax.swing.JMenuItem();
        menuPytItem3 = new javax.swing.JMenuItem();
        menuSth = new javax.swing.JPopupMenu();
        menuSthItem1 = new javax.swing.JMenuItem();
        menuSthItem2 = new javax.swing.JMenuItem();
        menuSthItem3 = new javax.swing.JMenuItem();
        scrollTree = new javax.swing.JScrollPane();
        treeOrgMain = new javax.swing.JTree();

        menuDocOrgItem1.setText("Crear Organizacion");
        menuDocOrgItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuDocOrgItem1ActionPerformed(evt);
            }
        });
        menuDocOrg.add(menuDocOrgItem1);

        menuOrgItem1.setText("Modificar");
        menuOrgItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuOrgItem1ActionPerformed(evt);
            }
        });
        menuOrg.add(menuOrgItem1);

        menuOrgItem2.setText("Eliminar");
        menuOrgItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuOrgItem2ActionPerformed(evt);
            }
        });
        menuOrg.add(menuOrgItem2);

        menuOrgItem3.setText("Restaurar");
        menuOrgItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuOrgItem3ActionPerformed(evt);
            }
        });
        menuOrg.add(menuOrgItem3);

        menuDocPytItem1.setText("Crear Especialista");
        menuDocPytItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuDocPytItem1ActionPerformed(evt);
            }
        });
        menuDocPyt.add(menuDocPytItem1);

        menuDocSthItem1.setText("Crear Fuente");
        menuDocSth.add(menuDocSthItem1);

        menuPytItem1.setText("Modificar");
        menuPyt.add(menuPytItem1);

        menuPytItem2.setText("Eliminar");
        menuPyt.add(menuPytItem2);

        menuPytItem3.setText("Restaura");
        menuPyt.add(menuPytItem3);

        menuSthItem1.setText("Modificar");
        menuSth.add(menuSthItem1);

        menuSthItem2.setText("Eliminar");
        menuSth.add(menuSthItem2);

        menuSthItem3.setText("Restaurar");
        menuSth.add(menuSthItem3);

        setMaximizable(true);
        setResizable(true);
        setPreferredSize(new java.awt.Dimension(250, 322));

        treeOrgMain.setBackground(new java.awt.Color(217, 221, 255));
        javax.swing.tree.DefaultMutableTreeNode treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("Documento de la Educción");
        javax.swing.tree.DefaultMutableTreeNode treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Educción");
        javax.swing.tree.DefaultMutableTreeNode treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("EDU 0001");
        treeNode2.add(treeNode3);
        treeNode1.add(treeNode2);
        treeOrgMain.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        scrollTree.setViewportView(treeOrgMain);

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

    private void menuDocOrgItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuDocOrgItem1ActionPerformed
        //NUEVA ORGANIZACION
        VOrganizacion VOrg = new VOrganizacion(padre, sysReman);
        VOrg.setVisible(true);
        if(VOrg.createSuccessful()){
            actualizar(ToolsInterface.generateJTreeOrg(sysReman.getDirPrincipal() + "\\src\\org"));
        }
    }//GEN-LAST:event_menuDocOrgItem1ActionPerformed

    private void menuOrgItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuOrgItem1ActionPerformed
        //MODIFICAR EDUCCION
    }//GEN-LAST:event_menuOrgItem1ActionPerformed

    private void menuOrgItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuOrgItem2ActionPerformed
        //ELIMINAR
        int resp = JOptionPane.showConfirmDialog(null, "Eliminar Educción", "Alerta!", JOptionPane.YES_NO_OPTION);
    }//GEN-LAST:event_menuOrgItem2ActionPerformed

    private void menuOrgItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuOrgItem3ActionPerformed
        //RESTAURAR
    }//GEN-LAST:event_menuOrgItem3ActionPerformed

    private void menuDocPytItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuDocPytItem1ActionPerformed
        //CREAR ESPECIALISTA
        VEspecialista VEsp = new VEspecialista(padre, sysReman);
        if(VEsp.getIsCorrect()){
            VEsp.setVisible(true);
        }else{
            ToolsInterface.msjError("Error al cargar las Organizaciones!");
        }
        if(VEsp.createSuccessful()){
            actualizar(ToolsInterface.generateJTreeOrg(sysReman.getDirPrincipal() + "\\src\\org"));
        }
    }//GEN-LAST:event_menuDocPytItem1ActionPerformed

    public void actualizar(JTree tree){
        treeOrgMain.setModel(tree.getModel());
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPopupMenu menuDocOrg;
    private javax.swing.JMenuItem menuDocOrgItem1;
    private javax.swing.JPopupMenu menuDocPyt;
    private javax.swing.JMenuItem menuDocPytItem1;
    private javax.swing.JPopupMenu menuDocSth;
    private javax.swing.JMenuItem menuDocSthItem1;
    private javax.swing.JPopupMenu menuOrg;
    private javax.swing.JMenuItem menuOrgItem1;
    private javax.swing.JMenuItem menuOrgItem2;
    private javax.swing.JMenuItem menuOrgItem3;
    private javax.swing.JPopupMenu menuPyt;
    private javax.swing.JMenuItem menuPytItem1;
    private javax.swing.JMenuItem menuPytItem2;
    private javax.swing.JMenuItem menuPytItem3;
    private javax.swing.JPopupMenu menuSth;
    private javax.swing.JMenuItem menuSthItem1;
    private javax.swing.JMenuItem menuSthItem2;
    private javax.swing.JMenuItem menuSthItem3;
    private javax.swing.JScrollPane scrollTree;
    private javax.swing.JTree treeOrgMain;
    // End of variables declaration//GEN-END:variables
}
