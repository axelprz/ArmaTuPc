package controllers.login;

import java.awt.Color;
import java.io.IOException;
import java.net.URISyntaxException;
import javax.swing.JOptionPane;
import views.panels.login.PanelLogin;
import views.panels.login.PanelLoginChangePassword;

public class FunctionsLoginControllers {

    public void exit() {
        int pregunta = JOptionPane.showConfirmDialog(null, "Esta seguro que desea salir", "Pregunta", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (pregunta == 0) {
            System.exit(0);
        }
    }

    public void urlManager(String url) {
        if (java.awt.Desktop.isDesktopSupported()) {
            java.awt.Desktop desktop = java.awt.Desktop.getDesktop();
            if (desktop.isSupported(java.awt.Desktop.Action.BROWSE)) {
                try {
                    java.net.URI uri = new java.net.URI(url);
                    desktop.browse(uri);
                } catch (IOException | URISyntaxException ex) {
                }
            }
        }
    }

    public void placeHolderEmail(PanelLogin views) {
        if (views.txtEmail.getText().equals("Correo Electrónico")) {
            views.txtEmail.setText("");
            views.txtEmail.setForeground(new Color(255, 255, 255));
        }
        if (String.valueOf(views.txtPassword.getPassword()).equals("")) {
            views.txtPassword.setText("**********");
            views.txtPassword.setForeground(new Color(153, 153, 153));
        }
    }
    
    public void placeHolderEmail(PanelLoginChangePassword views) {
        if (views.txtEmail.getText().equals("Correo Electrónico")) {
            views.txtEmail.setText("");
            views.txtEmail.setForeground(new Color(255, 255, 255));
        }
        if (String.valueOf(views.txtPassword.getPassword()).equals("")) {
            views.txtPassword.setText("**********");
            views.txtPassword.setForeground(new Color(153, 153, 153));
        }
    }

    public void placeHolderPassword(PanelLogin views) {
        if (String.valueOf(views.txtPassword.getPassword()).equals("**********")) {
            views.txtPassword.setText("");
            views.txtPassword.setForeground(new Color(255, 255, 255));
        }
        if (views.txtEmail.getText().equals("")) {
            views.txtEmail.setText("Correo Electrónico");
            views.txtEmail.setForeground(new Color(153, 153, 153));
        }
    }
    
    public void placeHolderPassword(PanelLoginChangePassword views) {
        if (String.valueOf(views.txtPassword.getPassword()).equals("**********")) {
            views.txtPassword.setText("");
            views.txtPassword.setForeground(new Color(255, 255, 255));
        }
        if (views.txtEmail.getText().equals("")) {
            views.txtEmail.setText("Correo Electrónico");
            views.txtEmail.setForeground(new Color(153, 153, 153));
        }
    }
}
