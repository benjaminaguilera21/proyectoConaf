package com.mycompany.views;

import com.mycompany.ilib.DAOEquipo_implem;
import com.mycompany.interfaces.DAOequipo;
import java.awt.Color;

public class UpEquipo extends javax.swing.JPanel {

    boolean isEdition = false;
    com.mycompany.models.Equipo bookEdition;

    public UpEquipo() {
        initComponents();
        InitStyles();
    }

    public UpEquipo(com.mycompany.models.Equipo ficha) {
        initComponents();
        isEdition = true;
        bookEdition = ficha;
        InitStyles();
    }

    private void InitStyles() {
        title.putClientProperty("FlatLaf.styleClass", "h1");
        title.setForeground(Color.black);
        titleTxt.putClientProperty("JTextField.placeholderText", "");
        dateTxt.putClientProperty("JTextField.placeholderText", "");
        authorTxt.putClientProperty("JTextField.placeholderText", "");
        catTxt.putClientProperty("JTextField.placeholderText", "");
        edTxt.putClientProperty("JTextField.placeholderText", "");
        pagsTxt.putClientProperty("JTextField.placeholderText", "");
        descTxt.putClientProperty("JTextField.placeholderText", "");
        stockTxt.putClientProperty("JTextField.placeholderText", "");
        dispTxt.putClientProperty("JTextField.placeholderText", "");
        idequipolabel.putClientProperty("JTextField.placeholderText", "");

        if (isEdition) {
            title.setText("Editar ficha");
            button.setText("Guardar");

            if (bookEdition != null) {
                titleTxt.setText(String.valueOf(bookEdition.getNumero_equipo()));
                dateTxt.setText(bookEdition.getSerie_equipo());
                authorTxt.setText(bookEdition.getNombre_modelo_id());
                catTxt.setText(bookEdition.getUbicacion_equipo());
                edTxt.setText(bookEdition.getResponsable_equipo());
                pagsTxt.setText(bookEdition.getUsuario_final());
                descTxt.setText(bookEdition.getOrden_compra());
                dispTxt.setText(bookEdition.getLicitacion());
                stockTxt.setText(bookEdition.getEstado_equipo());
                patenteLabel.setText(bookEdition.getPatente_equipo());
                idequipolabel.setText(bookEdition.getId_radio());
                proviLabel.setText(bookEdition.getProvincia_equipo());
                
            }   
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        title = new javax.swing.JLabel();
        titleLbl = new javax.swing.JLabel();
        titleTxt = new javax.swing.JTextField();
        dateLbl = new javax.swing.JLabel();
        dateTxt = new javax.swing.JTextField();
        authorLbl = new javax.swing.JLabel();
        authorTxt = new javax.swing.JTextField();
        catLbl = new javax.swing.JLabel();
        catTxt = new javax.swing.JTextField();
        edLbl = new javax.swing.JLabel();
        edTxt = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        pagsLbl = new javax.swing.JLabel();
        pagsTxt = new javax.swing.JTextField();
        descLbl = new javax.swing.JLabel();
        descTxt = new javax.swing.JTextField();
        stockTxt = new javax.swing.JTextField();
        dispTxt = new javax.swing.JTextField();
        dispLbl = new javax.swing.JLabel();
        ejemLbl = new javax.swing.JLabel();
        idequipolabel = new javax.swing.JTextField();
        button = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        patenteLabel = new javax.swing.JTextField();
        proviLabel = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        bg.setBackground(new java.awt.Color(255, 255, 255));

        title.setText("Ficha Equipo");

        titleLbl.setText("numero_equipo");

        titleTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                titleTxtActionPerformed(evt);
            }
        });

        dateLbl.setText("serie equipo");

        dateTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dateTxtActionPerformed(evt);
            }
        });

        authorLbl.setText("modelo_equipo");

        authorTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                authorTxtActionPerformed(evt);
            }
        });

        catLbl.setText("ubicacion");

        catTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                catTxtActionPerformed(evt);
            }
        });

        edLbl.setText("responsable");

        edTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edTxtActionPerformed(evt);
            }
        });

        jSeparator1.setForeground(new java.awt.Color(204, 204, 204));
        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator1.setPreferredSize(new java.awt.Dimension(200, 10));

        pagsLbl.setText("usuario final");

        pagsTxt.setToolTipText("");
        pagsTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pagsTxtActionPerformed(evt);
            }
        });

        descLbl.setText("orden de compra");

        descTxt.setToolTipText("");
        descTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                descTxtActionPerformed(evt);
            }
        });

        stockTxt.setToolTipText("");
        stockTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stockTxtActionPerformed(evt);
            }
        });

        dispTxt.setToolTipText("");
        dispTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dispTxtActionPerformed(evt);
            }
        });

        dispLbl.setText("estado");

        ejemLbl.setText("id equipo");

        idequipolabel.setToolTipText("");
        idequipolabel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idequipolabelActionPerformed(evt);
            }
        });

        button.setBackground(new java.awt.Color(0, 153, 51));
        button.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        button.setForeground(new java.awt.Color(255, 255, 255));
        button.setText("Actualizar Ficha");
        button.setBorderPainted(false);
        button.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonActionPerformed(evt);
            }
        });

        jLabel1.setText("patente");

        jLabel2.setText("licitacion");

        patenteLabel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                patenteLabelActionPerformed(evt);
            }
        });

        proviLabel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                proviLabelActionPerformed(evt);
            }
        });

        jLabel3.setText("provincia");

        javax.swing.GroupLayout bgLayout = new javax.swing.GroupLayout(bg);
        bg.setLayout(bgLayout);
        bgLayout.setHorizontalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bgLayout.createSequentialGroup()
                        .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(catTxt)
                            .addComponent(authorTxt)
                            .addGroup(bgLayout.createSequentialGroup()
                                .addComponent(authorLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(233, 233, 233))
                            .addGroup(bgLayout.createSequentialGroup()
                                .addComponent(catLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(213, 213, 213))
                            .addGroup(bgLayout.createSequentialGroup()
                                .addComponent(titleLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(234, 234, 234))
                            .addComponent(titleTxt)
                            .addGroup(bgLayout.createSequentialGroup()
                                .addComponent(dateLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(161, 161, 161))
                            .addComponent(dateTxt)
                            .addComponent(edTxt, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(bgLayout.createSequentialGroup()
                                .addComponent(edLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(227, 227, 227)))
                        .addGap(68, 68, 68)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(70, 70, 70)
                        .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(bgLayout.createSequentialGroup()
                                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(pagsTxt)
                                    .addGroup(bgLayout.createSequentialGroup()
                                        .addComponent(pagsLbl, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                                        .addGap(223, 223, 223))
                                    .addComponent(button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(bgLayout.createSequentialGroup()
                                        .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(descLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(descTxt))
                                        .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(bgLayout.createSequentialGroup()
                                                .addGap(60, 60, 60)
                                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGap(19, 19, 19))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bgLayout.createSequentialGroup()
                                                .addGap(18, 18, 18)
                                                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(dispTxt))
                                                .addGap(21, 21, 21))))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bgLayout.createSequentialGroup()
                                        .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, bgLayout.createSequentialGroup()
                                                .addComponent(idequipolabel)
                                                .addGap(18, 18, 18)
                                                .addComponent(proviLabel))
                                            .addGroup(bgLayout.createSequentialGroup()
                                                .addComponent(ejemLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGap(36, 36, 36)
                                                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                            .addGroup(bgLayout.createSequentialGroup()
                                                .addComponent(stockTxt)
                                                .addGap(18, 18, 18)
                                                .addComponent(patenteLabel)))
                                        .addGap(20, 20, 20)))
                                .addGap(72, 72, 72))
                            .addGroup(bgLayout.createSequentialGroup()
                                .addComponent(dispLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(bgLayout.createSequentialGroup()
                        .addComponent(title, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(553, 553, 553))))
        );
        bgLayout.setVerticalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(title, javax.swing.GroupLayout.PREFERRED_SIZE, 13, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(bgLayout.createSequentialGroup()
                        .addComponent(titleLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(titleTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dateLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dateTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(authorLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(5, 5, 5)
                        .addComponent(authorTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(catLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(catTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(edLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(edTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28))
                    .addGroup(bgLayout.createSequentialGroup()
                        .addComponent(pagsLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pagsTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(descLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(descTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dispTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(dispLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(patenteLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                            .addComponent(stockTxt))
                        .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(bgLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(ejemLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(bgLayout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(idequipolabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(proviLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(75, 75, 75)
                        .addComponent(button, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonActionPerformed
         // Obtener el número de equipo como una cadena desde el campo de texto

    

    // Obtener el resto de los valores
    String serie_equipoL = dateTxt.getText();
    String modelo_equipoL = authorTxt.getText();
    String ubicacion_equipoL = catTxt.getText();
    String responsable_equipoL = edTxt.getText();
    String usu_finalL = pagsTxt.getText();
    String orden_compraL = descTxt.getText();
    String licitacionL = dispTxt.getText();
    String estadoL = stockTxt.getText();
    String patenteL = patenteLabel.getText();
    String idL = idequipolabel.getText();
    String proviL = proviLabel.getText();

    // Validaciones para los campos
    if (serie_equipoL.isEmpty() || modelo_equipoL.isEmpty() || ubicacion_equipoL.isEmpty() || responsable_equipoL.isEmpty() || usu_finalL.isEmpty() || orden_compraL.isEmpty() || licitacionL.isEmpty() || estadoL.isEmpty() || patenteL.isEmpty() || idL.isEmpty()
            || proviL.isEmpty() ) {
        javax.swing.JOptionPane.showMessageDialog(this, "Debe llenar todos los campos. \n", "AVISO", javax.swing.JOptionPane.ERROR_MESSAGE);
        titleTxt.requestFocus();
        return;
    }

    // Crear un objeto Ficha_equipo con los datos obtenidos
    com.mycompany.models.Equipo ficha = isEdition ? bookEdition : new com.mycompany.models.Equipo();
    ficha.setSerie_equipo(serie_equipoL);
    ficha.setNombre_modelo_id(modelo_equipoL);
    ficha.setUbicacion_equipo(ubicacion_equipoL);
    ficha.setResponsable_equipo(responsable_equipoL);
    ficha.setUsuario_final(usu_finalL);
    ficha.setOrden_compra(orden_compraL);
    ficha.setLicitacion(licitacionL);
    ficha.setEstado_equipo(estadoL);
    ficha.setPatente_equipo(patenteL);
    ficha.setId_radio(idL);
    ficha.setProvincia_equipo(proviL);

    // Insertar en la base de datos
    try {
        DAOequipo dao = new DAOEquipo_implem();

        if (!isEdition) {
            dao.registrar(ficha);
        } else {
            dao.modificar(ficha);
        }

        String successMsg = isEdition ? "modificada" : "registrada";

        javax.swing.JOptionPane.showMessageDialog(this, "Ficha " + successMsg + " exitosamente.\n", "AVISO", javax.swing.JOptionPane.INFORMATION_MESSAGE);

        if (!isEdition) {
            // Limpiar campos después de la inserción
            titleTxt.setText("");
            dateTxt.setText("");
            authorTxt.setText("");
            catTxt.setText("");
            edTxt.setText("");
            pagsTxt.setText("");
            descTxt.setText("");
            stockTxt.setText("");
            dispTxt.setText("");
            idequipolabel.setText("");
        }
    } catch (Exception e) {
        String errorMsg = isEdition ? "modificar" : "registrar";
        javax.swing.JOptionPane.showMessageDialog(this, "Ocurrió un error al " + errorMsg + " la ficha de equipo. \n", "AVISO", javax.swing.JOptionPane.ERROR_MESSAGE);
        System.out.println(e.getMessage());
    }
    }//GEN-LAST:event_buttonActionPerformed

    private void pagsTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pagsTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pagsTxtActionPerformed

    private void authorTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_authorTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_authorTxtActionPerformed

    private void descTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_descTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_descTxtActionPerformed

    private void patenteLabelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_patenteLabelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_patenteLabelActionPerformed

    private void idequipolabelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idequipolabelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idequipolabelActionPerformed

    private void proviLabelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_proviLabelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_proviLabelActionPerformed

    private void stockTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stockTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_stockTxtActionPerformed

    private void titleTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_titleTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_titleTxtActionPerformed

    private void dateTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dateTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dateTxtActionPerformed

    private void catTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_catTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_catTxtActionPerformed

    private void edTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edTxtActionPerformed

    private void dispTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dispTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dispTxtActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel authorLbl;
    private javax.swing.JTextField authorTxt;
    private javax.swing.JPanel bg;
    private javax.swing.JButton button;
    private javax.swing.JLabel catLbl;
    private javax.swing.JTextField catTxt;
    private javax.swing.JLabel dateLbl;
    private javax.swing.JTextField dateTxt;
    private javax.swing.JLabel descLbl;
    private javax.swing.JTextField descTxt;
    private javax.swing.JLabel dispLbl;
    private javax.swing.JTextField dispTxt;
    private javax.swing.JLabel edLbl;
    private javax.swing.JTextField edTxt;
    private javax.swing.JLabel ejemLbl;
    private javax.swing.JTextField idequipolabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel pagsLbl;
    private javax.swing.JTextField pagsTxt;
    private javax.swing.JTextField patenteLabel;
    private javax.swing.JTextField proviLabel;
    private javax.swing.JTextField stockTxt;
    private javax.swing.JLabel title;
    private javax.swing.JLabel titleLbl;
    private javax.swing.JTextField titleTxt;
    // End of variables declaration//GEN-END:variables
}