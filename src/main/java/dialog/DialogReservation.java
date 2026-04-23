/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dialog;

import interface_noyau_fonctionnel.InterfaceNoyauFonctionnel;
import java.awt.EventQueue;
import java.time.LocalDate;
import presentation.FrameReservation;

public class DialogReservation {

    private FrameReservation frameReservation;
    private InterfaceNoyauFonctionnel inf;
    private int numClient;

    public DialogReservation(InterfaceNoyauFonctionnel inf) {
        this.inf = inf;
    }

    public void initDialog() {
        frameReservation = new FrameReservation();
        frameReservation.initFrame();
        frameReservation.setDialog(this);
        frameReservation.setVisible(true);
    }

    public void handleDateSelectedEvent(LocalDate date) {
        if (date != null) {
            frameReservation.enableTime();
        }
    }

    public void handleTimeSelectedEvent(String time) {
        if (time != null && !time.isBlank()) {
            frameReservation.enableNb_personne();
        }
    }

    public void handleNumOfPersonsSelectedEvent(int nbPersons) {
        frameReservation.enableTable();
        frameReservation.updateTableList(nbPersons);
    }

    public void handleTableSelectedEvent(int numTable) {
        frameReservation.enableValider();
    }

    public void handleCancelEvent() {
        frameReservation.annulerPressed();
    }

    public void handleValidationEvent() {
        frameReservation.validerPressed();
    }
    
    public void handleUserConnected(int numClient) {
    	this.numClient = numClient;
    	frameReservation.setVisible(true);
    }
    
    public static void main(String[] args) {
        DialogReservation dialog = new DialogReservation(new InterfaceNoyauFonctionnel());
        EventQueue.invokeLater(() -> {
            dialog.initDialog();
        });
    }

}
