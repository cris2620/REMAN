package org.harley.reman.interfaz.interfaces;
import java.beans.PropertyVetoException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
/**
 *
 * @author Joel Mendoza
 */
public class VPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form VPincipal
     */
    VTElicitacion velicita = new VTElicitacion();
    VTEduccion veduccion = new VTEduccion();
    VTOrganizacion vorganiza = new VTOrganizacion();
    VTEspecificacion vespecifica = new VTEspecificacion();
    VTNoFuncional vnofuncional = new VTNoFuncional();
    VTInicio vinicio = new VTInicio();
    public VPrincipal() throws PropertyVetoException {

        getContentPane().setBackground(new java.awt.Color(119,148,171));
        initComponents();
        VDocumento nuevo = new VDocumento();
        jDesktopPane1.add(nuevo);
        nuevo.setMaximum(true);
        nuevo.show();
        
        jDesktopPane2.add(vinicio);
        vinicio.show();
        jDesktopPane2.add(velicita);
        jDesktopPane2.add(veduccion);
        jDesktopPane2.add(vorganiza);
        jDesktopPane2.add(vespecifica);
        jDesktopPane2.add(vnofuncional);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ExportarFile = new javax.swing.JFileChooser();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jToolBar1 = new javax.swing.JToolBar();
        btnVPNuevo = new javax.swing.JButton();
        btnVPAbrir = new javax.swing.JButton();
        btnVPGuardar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JToolBar.Separator();
        btnVPVersionar = new javax.swing.JButton();
        btnVPImportar = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JToolBar.Separator();
        btnVPFuente = new javax.swing.JButton();
        btnVPEspecialista = new javax.swing.JButton();
        jSeparator4 = new javax.swing.JToolBar.Separator();
        btnVPOrganizacion = new javax.swing.JButton();
        btnVPEduccion = new javax.swing.JButton();
        btnVPElicitacion = new javax.swing.JButton();
        btnVPEspecificiacion = new javax.swing.JButton();
        btnVPNoFuncional = new javax.swing.JButton();
        jSeparator7 = new javax.swing.JToolBar.Separator();
        btnVPExportar = new javax.swing.JButton();
        jSeparator5 = new javax.swing.JToolBar.Separator();
        btnVPAyuda = new javax.swing.JButton();
        jToolBar5 = new javax.swing.JToolBar();
        btnOrganizacion = new javax.swing.JButton();
        btnEduccion = new javax.swing.JButton();
        btnElicitacion = new javax.swing.JButton();
        btnEspecificacion = new javax.swing.JButton();
        btnNoFuncional = new javax.swing.JButton();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jDesktopPane2 = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnVPArchivo = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        mnVPEditar = new javax.swing.JMenu();
        mnVPVer = new javax.swing.JMenu();
        mnVPHerramienta = new javax.swing.JMenu();
        jMenuItem7 = new javax.swing.JMenuItem();
        mnVPVentana = new javax.swing.JMenu();
        mnVPAyuda = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();

        ExportarFile.setDialogType(javax.swing.JFileChooser.CUSTOM_DIALOG);
        ExportarFile.setDialogTitle("Seleccione");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("REMAN 1.3.0 - Gestor de Requerimientos");
        setBackground(new java.awt.Color(119, 148, 171));

        jToolBar1.setBackground(new java.awt.Color(203, 210, 228));
        jToolBar1.setFloatable(false);
        jToolBar1.setRollover(true);
        jToolBar1.setMaximumSize(new java.awt.Dimension(300, 37));
        jToolBar1.setPreferredSize(new java.awt.Dimension(210, 35));

        btnVPNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/1. iconoNuevo.png"))); // NOI18N
        btnVPNuevo.setFocusable(false);
        btnVPNuevo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnVPNuevo.setMaximumSize(new java.awt.Dimension(33, 33));
        btnVPNuevo.setMinimumSize(new java.awt.Dimension(33, 33));
        btnVPNuevo.setPreferredSize(new java.awt.Dimension(33, 33));
        btnVPNuevo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnVPNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVPNuevoActionPerformed(evt);
            }
        });
        jToolBar1.add(btnVPNuevo);

        btnVPAbrir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/2. iconoAbrir.png"))); // NOI18N
        btnVPAbrir.setFocusable(false);
        btnVPAbrir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnVPAbrir.setMaximumSize(new java.awt.Dimension(33, 33));
        btnVPAbrir.setMinimumSize(new java.awt.Dimension(33, 33));
        btnVPAbrir.setPreferredSize(new java.awt.Dimension(33, 33));
        btnVPAbrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVPAbrirActionPerformed(evt);
            }
        });
        jToolBar1.add(btnVPAbrir);

        btnVPGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/3. iconoGuardar.png"))); // NOI18N
        btnVPGuardar.setFocusable(false);
        btnVPGuardar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnVPGuardar.setMaximumSize(new java.awt.Dimension(33, 33));
        btnVPGuardar.setMinimumSize(new java.awt.Dimension(33, 33));
        btnVPGuardar.setPreferredSize(new java.awt.Dimension(33, 33));
        btnVPGuardar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(btnVPGuardar);
        jToolBar1.add(jSeparator1);

        btnVPVersionar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/4. iconoVersionar.png"))); // NOI18N
        btnVPVersionar.setFocusable(false);
        btnVPVersionar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnVPVersionar.setMaximumSize(new java.awt.Dimension(33, 33));
        btnVPVersionar.setMinimumSize(new java.awt.Dimension(33, 33));
        btnVPVersionar.setPreferredSize(new java.awt.Dimension(33, 33));
        btnVPVersionar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnVPVersionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVPVersionarActionPerformed(evt);
            }
        });
        jToolBar1.add(btnVPVersionar);

        btnVPImportar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/iconoImportarLibro.png"))); // NOI18N
        btnVPImportar.setToolTipText("");
        btnVPImportar.setFocusable(false);
        btnVPImportar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnVPImportar.setMaximumSize(new java.awt.Dimension(33, 33));
        btnVPImportar.setMinimumSize(new java.awt.Dimension(33, 33));
        btnVPImportar.setPreferredSize(new java.awt.Dimension(33, 33));
        btnVPImportar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnVPImportar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVPImportarActionPerformed(evt);
            }
        });
        jToolBar1.add(btnVPImportar);
        jToolBar1.add(jSeparator3);

        btnVPFuente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/6. iconoAgregarFuente.png"))); // NOI18N
        btnVPFuente.setFocusable(false);
        btnVPFuente.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnVPFuente.setMaximumSize(new java.awt.Dimension(33, 33));
        btnVPFuente.setMinimumSize(new java.awt.Dimension(33, 33));
        btnVPFuente.setPreferredSize(new java.awt.Dimension(33, 33));
        btnVPFuente.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnVPFuente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVPFuenteActionPerformed(evt);
            }
        });
        jToolBar1.add(btnVPFuente);

        btnVPEspecialista.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/5. iconoAgregarEspecialista.png"))); // NOI18N
        btnVPEspecialista.setFocusable(false);
        btnVPEspecialista.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnVPEspecialista.setMaximumSize(new java.awt.Dimension(33, 33));
        btnVPEspecialista.setMinimumSize(new java.awt.Dimension(33, 33));
        btnVPEspecialista.setPreferredSize(new java.awt.Dimension(33, 33));
        btnVPEspecialista.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnVPEspecialista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVPEspecialistaActionPerformed(evt);
            }
        });
        jToolBar1.add(btnVPEspecialista);
        jToolBar1.add(jSeparator4);

        btnVPOrganizacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/7. iconoAgregarOrganizacion.png"))); // NOI18N
        btnVPOrganizacion.setFocusable(false);
        btnVPOrganizacion.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnVPOrganizacion.setMaximumSize(new java.awt.Dimension(33, 33));
        btnVPOrganizacion.setMinimumSize(new java.awt.Dimension(33, 33));
        btnVPOrganizacion.setPreferredSize(new java.awt.Dimension(33, 33));
        btnVPOrganizacion.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnVPOrganizacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVPOrganizacionActionPerformed(evt);
            }
        });
        jToolBar1.add(btnVPOrganizacion);

        btnVPEduccion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/8. iconoAgregarEduccion.png"))); // NOI18N
        btnVPEduccion.setFocusable(false);
        btnVPEduccion.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnVPEduccion.setMaximumSize(new java.awt.Dimension(33, 33));
        btnVPEduccion.setMinimumSize(new java.awt.Dimension(33, 33));
        btnVPEduccion.setPreferredSize(new java.awt.Dimension(33, 33));
        btnVPEduccion.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnVPEduccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVPEduccionActionPerformed(evt);
            }
        });
        jToolBar1.add(btnVPEduccion);

        btnVPElicitacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/9. iconoAgregarElicitacion.png"))); // NOI18N
        btnVPElicitacion.setFocusable(false);
        btnVPElicitacion.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnVPElicitacion.setMaximumSize(new java.awt.Dimension(33, 33));
        btnVPElicitacion.setMinimumSize(new java.awt.Dimension(33, 33));
        btnVPElicitacion.setPreferredSize(new java.awt.Dimension(33, 33));
        btnVPElicitacion.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnVPElicitacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVPElicitacionActionPerformed(evt);
            }
        });
        jToolBar1.add(btnVPElicitacion);

        btnVPEspecificiacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/10. iconoAgregarEspecificacion.png"))); // NOI18N
        btnVPEspecificiacion.setFocusable(false);
        btnVPEspecificiacion.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnVPEspecificiacion.setMaximumSize(new java.awt.Dimension(33, 33));
        btnVPEspecificiacion.setMinimumSize(new java.awt.Dimension(33, 33));
        btnVPEspecificiacion.setPreferredSize(new java.awt.Dimension(33, 33));
        btnVPEspecificiacion.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnVPEspecificiacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVPEspecificiacionActionPerformed(evt);
            }
        });
        jToolBar1.add(btnVPEspecificiacion);

        btnVPNoFuncional.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/iconoAgregarRequisitoNoFuncional.png"))); // NOI18N
        btnVPNoFuncional.setFocusable(false);
        btnVPNoFuncional.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnVPNoFuncional.setMaximumSize(new java.awt.Dimension(33, 33));
        btnVPNoFuncional.setMinimumSize(new java.awt.Dimension(33, 33));
        btnVPNoFuncional.setPreferredSize(new java.awt.Dimension(33, 33));
        btnVPNoFuncional.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnVPNoFuncional.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVPNoFuncionalActionPerformed(evt);
            }
        });
        jToolBar1.add(btnVPNoFuncional);
        jToolBar1.add(jSeparator7);

        btnVPExportar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/11. iconoExportarDocumento.png"))); // NOI18N
        btnVPExportar.setFocusable(false);
        btnVPExportar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnVPExportar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnVPExportar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVPExportarActionPerformed(evt);
            }
        });
        jToolBar1.add(btnVPExportar);
        jToolBar1.add(jSeparator5);

        btnVPAyuda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/13. iconoAyuda.png"))); // NOI18N
        btnVPAyuda.setFocusable(false);
        btnVPAyuda.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnVPAyuda.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(btnVPAyuda);

        jToolBar5.setBackground(new java.awt.Color(203, 210, 228));
        jToolBar5.setFloatable(false);
        jToolBar5.setRollover(true);
        jToolBar5.setMaximumSize(new java.awt.Dimension(210, 53));
        jToolBar5.setMinimumSize(new java.awt.Dimension(210, 53));
        jToolBar5.setPreferredSize(new java.awt.Dimension(210, 53));

        btnOrganizacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/libroOrganizacion.png"))); // NOI18N
        btnOrganizacion.setMaximumSize(new java.awt.Dimension(50, 50));
        btnOrganizacion.setMinimumSize(new java.awt.Dimension(5, 5));
        btnOrganizacion.setPreferredSize(new java.awt.Dimension(50, 50));
        btnOrganizacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrganizacionActionPerformed(evt);
            }
        });
        jToolBar5.add(btnOrganizacion);

        btnEduccion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/libroEduccion.png"))); // NOI18N
        btnEduccion.setMaximumSize(new java.awt.Dimension(50, 50));
        btnEduccion.setMinimumSize(new java.awt.Dimension(50, 50));
        btnEduccion.setPreferredSize(new java.awt.Dimension(50, 50));
        btnEduccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEduccionActionPerformed(evt);
            }
        });
        jToolBar5.add(btnEduccion);

        btnElicitacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/libroElicitacion.png"))); // NOI18N
        btnElicitacion.setMaximumSize(new java.awt.Dimension(50, 50));
        btnElicitacion.setMinimumSize(new java.awt.Dimension(50, 50));
        btnElicitacion.setPreferredSize(new java.awt.Dimension(50, 50));
        btnElicitacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnElicitacionActionPerformed(evt);
            }
        });
        jToolBar5.add(btnElicitacion);

        btnEspecificacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/libroEspecificacion.png"))); // NOI18N
        btnEspecificacion.setMaximumSize(new java.awt.Dimension(50, 50));
        btnEspecificacion.setMinimumSize(new java.awt.Dimension(50, 50));
        btnEspecificacion.setPreferredSize(new java.awt.Dimension(50, 50));
        btnEspecificacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEspecificacionActionPerformed(evt);
            }
        });
        jToolBar5.add(btnEspecificacion);

        btnNoFuncional.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/libroRequisitosNoFuncionales.png"))); // NOI18N
        btnNoFuncional.setFocusable(false);
        btnNoFuncional.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnNoFuncional.setMaximumSize(new java.awt.Dimension(50, 50));
        btnNoFuncional.setMinimumSize(new java.awt.Dimension(50, 50));
        btnNoFuncional.setPreferredSize(new java.awt.Dimension(50, 50));
        btnNoFuncional.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnNoFuncional.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNoFuncionalActionPerformed(evt);
            }
        });
        jToolBar5.add(btnNoFuncional);

        jDesktopPane1.setBackground(new java.awt.Color(119, 148, 171));

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 493, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jDesktopPane2.setBackground(new java.awt.Color(119, 148, 171));

        javax.swing.GroupLayout jDesktopPane2Layout = new javax.swing.GroupLayout(jDesktopPane2);
        jDesktopPane2.setLayout(jDesktopPane2Layout);
        jDesktopPane2Layout.setHorizontalGroup(
            jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 254, Short.MAX_VALUE)
        );
        jDesktopPane2Layout.setVerticalGroup(
            jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 436, Short.MAX_VALUE)
        );

        mnVPArchivo.setText("Archivo");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setText("Nuevo");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        mnVPArchivo.add(jMenuItem1);

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem2.setText("Abrir");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        mnVPArchivo.add(jMenuItem2);

        jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_G, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem3.setText("Guardar");
        mnVPArchivo.add(jMenuItem3);

        jMenuItem4.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_MASK));
        jMenuItem4.setText("Salir");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        mnVPArchivo.add(jMenuItem4);

        jMenuBar1.add(mnVPArchivo);

        mnVPEditar.setText("Editar");
        jMenuBar1.add(mnVPEditar);

        mnVPVer.setText("Ver");
        jMenuBar1.add(mnVPVer);

        mnVPHerramienta.setText("Herramientas");

        jMenuItem7.setText("Versionar");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        mnVPHerramienta.add(jMenuItem7);

        jMenuBar1.add(mnVPHerramienta);

        mnVPVentana.setText("Ventana");
        jMenuBar1.add(mnVPVentana);

        mnVPAyuda.setText("Ayuda");

        jMenuItem5.setText("Manual Usuario");
        mnVPAyuda.add(jMenuItem5);

        jMenuItem6.setText("Acerca de ...");
        mnVPAyuda.add(jMenuItem6);

        jMenuBar1.add(mnVPAyuda);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jDesktopPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jToolBar5, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jDesktopPane1)))
                .addGap(6, 6, 6))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jToolBar5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jDesktopPane2))
                    .addComponent(jDesktopPane1))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVPNuevoActionPerformed(java.awt.event.ActionEvent evt) {
        VProyecto ventanaProyecto = new VProyecto();
        ventanaProyecto.setVisible(true);
    }

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {
        VProyecto ventanaProyecto = new VProyecto();
        ventanaProyecto.setVisible(true);
    }

    private void btnVPVersionarActionPerformed(java.awt.event.ActionEvent evt) {
        VVersionar ventanaVersionar = new VVersionar();
        ventanaVersionar.setVisible(true);
    }

    private void btnVPEspecialistaActionPerformed(java.awt.event.ActionEvent evt) {
        VActor ventanaActor = new VActor();
        ventanaActor.setVisible(true);
    }

    private void btnVPOrganizacionActionPerformed(java.awt.event.ActionEvent evt) {
        VOrganizacion ventanaO = new VOrganizacion();
        ventanaO.setVisible(true);
    }

    private void btnVPFuenteActionPerformed(java.awt.event.ActionEvent evt) {
        VFuente ventanaF = new VFuente();
        ventanaF.setVisible(true);
    }

    private void btnVPEduccionActionPerformed(java.awt.event.ActionEvent evt) {
        VEduccion ventanaEd = new VEduccion();
        ventanaEd.setVisible(true);
    }

    private void btnVPElicitacionActionPerformed(java.awt.event.ActionEvent evt) {
        VElicitacion ventanaEl = new VElicitacion();
        ventanaEl.setVisible(true);
    }

    private void btnVPEspecificiacionActionPerformed(java.awt.event.ActionEvent evt) {
        VEspecificacion ventanaEs = new VEspecificacion();
        ventanaEs.setVisible(true);
    }

    private void btnOrganizacionActionPerformed(java.awt.event.ActionEvent evt) {
        vorganiza.show();
        veduccion.hide();
        vespecifica.hide();
        velicita.hide();
        vnofuncional.hide();
    }

    private void btnEduccionActionPerformed(java.awt.event.ActionEvent evt) {
        veduccion.show();
        vorganiza.hide();
        vespecifica.hide();
        velicita.hide();
        vnofuncional.hide();
    }

    private void btnElicitacionActionPerformed(java.awt.event.ActionEvent evt) {
        velicita.show();
        vorganiza.hide();
        veduccion.hide();
        vespecifica.hide();
        vnofuncional.hide();
    }

    private void btnEspecificacionActionPerformed(java.awt.event.ActionEvent evt) {
        vnofuncional.hide();
        vespecifica.show();
        vorganiza.hide();
        veduccion.hide();
        velicita.hide();
    }

    private void btnVPAbrirActionPerformed(java.awt.event.ActionEvent evt) {
        FileNameExtensionFilter filtro=new FileNameExtensionFilter("Archivos Reman","rem");
        ExportarFile.setFileFilter(filtro);
        int opt = ExportarFile.showOpenDialog(this);
        if(opt==JFileChooser.APPROVE_OPTION){
            String direccion = ExportarFile.getSelectedFile().getAbsolutePath();
        }
    }

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {
        this.btnVPAbrirActionPerformed(evt);
    }

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {
        System.exit(0);
    }

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {
        this.btnVPVersionarActionPerformed(evt);
    }

    private void btnNoFuncionalActionPerformed(java.awt.event.ActionEvent evt) {
        vnofuncional.show();
        velicita.hide();
        vorganiza.hide();
        veduccion.hide();
        vespecifica.hide();
        vinicio.hide();
    }

    private void btnVPNoFuncionalActionPerformed(java.awt.event.ActionEvent evt) {
        VNoFuncional ventanaNF = new VNoFuncional();
        ventanaNF.setVisible(true);
    }

    private void btnVPImportarActionPerformed(java.awt.event.ActionEvent evt) {
        VRestaura vrestaura = new VRestaura();
        vrestaura.setVisible(true);
    }

    private void btnVPExportarActionPerformed(java.awt.event.ActionEvent evt) {
        VExportar vexporta = new VExportar();
        vexporta.setVisible(true);
    }

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Metal".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new VPrincipal().setVisible(true);
                } catch (PropertyVetoException ex) {
                    Logger.getLogger(VPrincipal.class.getName()).log(Level.SEVERE, null, ex);
                }

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFileChooser ExportarFile;
    private javax.swing.JButton btnEduccion;
    private javax.swing.JButton btnElicitacion;
    private javax.swing.JButton btnEspecificacion;
    private javax.swing.JButton btnNoFuncional;
    private javax.swing.JButton btnOrganizacion;
    private javax.swing.JButton btnVPAbrir;
    private javax.swing.JButton btnVPAyuda;
    private javax.swing.JButton btnVPEduccion;
    private javax.swing.JButton btnVPElicitacion;
    private javax.swing.JButton btnVPEspecialista;
    private javax.swing.JButton btnVPEspecificiacion;
    private javax.swing.JButton btnVPExportar;
    private javax.swing.JButton btnVPFuente;
    private javax.swing.JButton btnVPGuardar;
    private javax.swing.JButton btnVPImportar;
    private javax.swing.JButton btnVPNoFuncional;
    private javax.swing.JButton btnVPNuevo;
    private javax.swing.JButton btnVPOrganizacion;
    private javax.swing.JButton btnVPVersionar;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JDesktopPane jDesktopPane2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JToolBar.Separator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JToolBar.Separator jSeparator3;
    private javax.swing.JToolBar.Separator jSeparator4;
    private javax.swing.JToolBar.Separator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JToolBar.Separator jSeparator7;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JToolBar jToolBar5;
    private javax.swing.JMenu mnVPArchivo;
    private javax.swing.JMenu mnVPAyuda;
    private javax.swing.JMenu mnVPEditar;
    private javax.swing.JMenu mnVPHerramienta;
    private javax.swing.JMenu mnVPVentana;
    private javax.swing.JMenu mnVPVer;
    // End of variables declaration//GEN-END:variables
}