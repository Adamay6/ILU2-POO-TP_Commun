/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package presentation;

import com.github.lgooddatepicker.optionalusertools.DateChangeListener;
import com.github.lgooddatepicker.zinternaltools.DateChangeEvent;
import dialog.DialogReservation;

@SuppressWarnings("serial")
public class FrameReservation extends javax.swing.JFrame {

    private DialogReservation dialog;

    public FrameReservation() {
    }

    public void initFrame() {
        initComponents();
    }

    public void setDialog(DialogReservation dialog) {
        this.dialog = dialog;
    }

    // /!\ /!\ /!\ ATTENTION /!\ /!\ /!\
    // ce code est auto généré et ne doit PAS être modifié
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        reservezTableLabel = new javax.swing.JLabel();
        dateTimePanel = new javax.swing.JPanel();
        datePicker = new com.github.lgooddatepicker.components.DatePicker();
        datePicker.addDateChangeListener(new DateChangeListener(){
            public void dateChanged(DateChangeEvent dateEvent) {
                datePickerDateChanged(dateEvent);
            }
        });
        dateTexte = new javax.swing.JLabel();
        heureTexte = new javax.swing.JLabel();
        heureChoix = new javax.swing.JComboBox<>();
        nbPersonsPanel = new javax.swing.JPanel();
        nb_PersonnesTexte = new javax.swing.JLabel();
        nb_PersonnesChoix = new javax.swing.JComboBox<>();
        pickTablePanel = new javax.swing.JPanel();
        tablePlan = new javax.swing.JLabel();
        tableTexte = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableChoix = new javax.swing.JList<>();
        valider = new javax.swing.JButton();
        annuler = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        reservezTableLabel.setText("Réservez une table");

        dateTimePanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        dateTexte.setText("1. Choisissez une date");

        heureTexte.setText("2. Choisissez une heure");
        heureTexte.setEnabled(false);

        heureChoix.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "11h30", "12h00", "12h30", "13h00", "13h30", " " }));
        heureChoix.setEnabled(false);
        heureChoix.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                heureChoixActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout dateTimePanelLayout = new javax.swing.GroupLayout(dateTimePanel);
        dateTimePanel.setLayout(dateTimePanelLayout);
        dateTimePanelLayout.setHorizontalGroup(
            dateTimePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dateTimePanelLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(dateTimePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dateTexte)
                    .addComponent(datePicker, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 159, Short.MAX_VALUE)
                .addGroup(dateTimePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(heureChoix, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(heureTexte))
                .addGap(20, 20, 20))
        );
        dateTimePanelLayout.setVerticalGroup(
            dateTimePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dateTimePanelLayout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(dateTimePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dateTexte)
                    .addComponent(heureTexte))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(dateTimePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(datePicker, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(heureChoix, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(65, Short.MAX_VALUE))
        );

        datePicker.getAccessibleContext().setAccessibleName("");
        datePicker.getAccessibleContext().setAccessibleDescription("");

        nbPersonsPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        nb_PersonnesTexte.setText("3. Indiquez le nombre de personnes");
        nb_PersonnesTexte.setEnabled(false);

        nb_PersonnesChoix.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "2", "3", "4", "5", "6", "7", "8" }));
        nb_PersonnesChoix.setEnabled(false);
        nb_PersonnesChoix.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nb_PersonnesChoixActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout nbPersonsPanelLayout = new javax.swing.GroupLayout(nbPersonsPanel);
        nbPersonsPanel.setLayout(nbPersonsPanelLayout);
        nbPersonsPanelLayout.setHorizontalGroup(
            nbPersonsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(nbPersonsPanelLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(nbPersonsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nb_PersonnesTexte)
                    .addComponent(nb_PersonnesChoix, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        nbPersonsPanelLayout.setVerticalGroup(
            nbPersonsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(nbPersonsPanelLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(nb_PersonnesTexte)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(nb_PersonnesChoix, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(39, Short.MAX_VALUE))
        );

        pickTablePanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        tablePlan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Plan_tables.jpg"))); // NOI18N
        tablePlan.setEnabled(false);

        tableTexte.setText("4. Choisissez une table");
        tableTexte.setEnabled(false);

        jScrollPane1.setEnabled(false);

        tableChoix.setEnabled(false);
        tableChoix.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                tableChoixValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(tableChoix);

        javax.swing.GroupLayout pickTablePanelLayout = new javax.swing.GroupLayout(pickTablePanel);
        pickTablePanel.setLayout(pickTablePanelLayout);
        pickTablePanelLayout.setHorizontalGroup(
            pickTablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pickTablePanelLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(pickTablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pickTablePanelLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(tableTexte)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(pickTablePanelLayout.createSequentialGroup()
                        .addComponent(tablePlan, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1)
                        .addContainerGap())))
        );
        pickTablePanelLayout.setVerticalGroup(
            pickTablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pickTablePanelLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(tableTexte)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pickTablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tablePlan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pickTablePanelLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        valider.setText("Valider");
        valider.setEnabled(false);
        valider.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                onValiderClicked(evt);
            }
        });

        annuler.setText("Annuler");
        annuler.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                onAnnulerClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(valider)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(annuler)
                .addGap(14, 14, 14))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dateTimePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(nbPersonsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pickTablePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(reservezTableLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(reservezTableLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dateTimePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(nbPersonsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pickTablePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(valider)
                    .addComponent(annuler))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void enableTime(){
        heureTexte.setEnabled(true);
        heureChoix.setEnabled(true);
    }
    
    public void enableNb_personne(){
        nb_PersonnesTexte.setEnabled(true);
        nb_PersonnesChoix.setEnabled(true);
    }
    
    public void enableTable(){
        tableTexte.setEnabled(true);
        tablePlan.setEnabled(true);
        jScrollPane1.setEnabled(true);
        tableChoix.setEnabled(true);
    }
    
    public void updateTableList(int nbPersons) {
        javax.swing.DefaultListModel<String> model = new javax.swing.DefaultListModel<>();

        if (nbPersons == 2) {
            model.addElement("Table 1");
            model.addElement("Table 2");
            model.addElement("Table 3");
            model.addElement("Table 4");
            model.addElement("Table 5");

        } else if (nbPersons == 3 || nbPersons == 4) {
            model.addElement("Table 2");
            model.addElement("Table 3");
            model.addElement("Table 4");
            model.addElement("Table 5");

        } else {
            model.addElement("Table 6");
        }

        tableChoix.setModel(model);
}
    
    public void enableValider(){
        valider.setEnabled(true);
    }
    
    public void annulerPressed(){
        datePicker.clear();

        heureChoix.setSelectedIndex(-1);
        nb_PersonnesChoix.setSelectedIndex(-1);

        tableChoix.clearSelection();
        tableChoix.setModel(new javax.swing.DefaultListModel<>());

        valider.setEnabled(false);

        heureTexte.setEnabled(false);
        heureChoix.setEnabled(false);

        nb_PersonnesTexte.setEnabled(false);
        nb_PersonnesChoix.setEnabled(false);

        tableTexte.setEnabled(false);
        jScrollPane1.setEnabled(false);
        tableChoix.setEnabled(false);
        tablePlan.setEnabled(false);
    }
    
    public void validerPressed(){
        String date = datePicker.getText();
        String heure = (String) heureChoix.getSelectedItem();
        String nbPersonnes = (String) nb_PersonnesChoix.getSelectedItem();
        String table = tableChoix.getSelectedValue();

        String message = "Réservation validée pour le " + date +
                         " à " + heure +
                         " pour " + nbPersonnes +
                         " personnes à la " + table + ".";

        javax.swing.JOptionPane.showMessageDialog(this, message, "Confirmation de réservation", javax.swing.JOptionPane.INFORMATION_MESSAGE);

        annulerPressed();
    }
    
    private void heureChoixActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_heureChoixActionPerformed
        String selectedTime = (String) heureChoix.getSelectedItem();

        if (heureChoix.isEnabled() && selectedTime != null && !selectedTime.isBlank()) {
            dialog.handleTimeSelectedEvent(selectedTime);
        }
    }//GEN-LAST:event_heureChoixActionPerformed

    private void nb_PersonnesChoixActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nb_PersonnesChoixActionPerformed
        String selectedValue = (String) nb_PersonnesChoix.getSelectedItem();

        if (nb_PersonnesChoix.isEnabled() && selectedValue != null && !selectedValue.isBlank()) {
            dialog.handleNumOfPersonsSelectedEvent(Integer.parseInt(selectedValue));
        }
    }//GEN-LAST:event_nb_PersonnesChoixActionPerformed

    private void tableChoixValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_tableChoixValueChanged
        if (!evt.getValueIsAdjusting() && tableChoix.getSelectedIndex() != -1) {
            dialog.handleTableSelectedEvent(tableChoix.getSelectedIndex());
        }
    }//GEN-LAST:event_tableChoixValueChanged

    private void validerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ValiderActionPerformed
        dialog.handleValidationEvent();
    }//GEN-LAST:event_ValiderActionPerformed

    private void annulerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_valider1ActionPerformed
        dialog.handleCancelEvent();
    }//GEN-LAST:event_valider1ActionPerformed

    private void onValiderClicked(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_onValiderClicked
        dialog.handleValidationEvent();
    }//GEN-LAST:event_onValiderClicked

    private void onAnnulerClicked(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_onAnnulerClicked
        dialog.handleCancelEvent();
    }//GEN-LAST:event_onAnnulerClicked

    public void datePickerDateChanged(DateChangeEvent dateEvent) {
        dialog.handleDateSelectedEvent(datePicker.getDate());
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton annuler;
    private com.github.lgooddatepicker.components.DatePicker datePicker;
    private javax.swing.JLabel dateTexte;
    private javax.swing.JPanel dateTimePanel;
    private javax.swing.JComboBox<String> heureChoix;
    private javax.swing.JLabel heureTexte;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel nbPersonsPanel;
    private javax.swing.JComboBox<String> nb_PersonnesChoix;
    private javax.swing.JLabel nb_PersonnesTexte;
    private javax.swing.JPanel pickTablePanel;
    private javax.swing.JLabel reservezTableLabel;
    private javax.swing.JList<String> tableChoix;
    private javax.swing.JLabel tablePlan;
    private javax.swing.JLabel tableTexte;
    private javax.swing.JButton valider;
    // End of variables declaration//GEN-END:variables

}
