package controllers.login;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JOptionPane;
import models.login.User;
import models.login.UserDao;
import views.panels.login.PanelLoginChangePassword;

public class LoginChangePasswordControllers implements ActionListener, MouseListener {

    private User us;
    private final UserDao usDao;
    private final PanelLoginChangePassword views;
    FunctionsLoginControllers functions = new FunctionsLoginControllers();

    public LoginChangePasswordControllers(User us, UserDao usDao, PanelLoginChangePassword views) {
        this.us = us;
        this.usDao = usDao;
        this.views = views;
        this.views.btnEmailConfirm.addActionListener(this);
        this.views.btnGithub.addActionListener(this);
        this.views.btnInstagram.addActionListener(this);
        this.views.btnNewPassword.addActionListener(this);
        this.views.btnSalir.addActionListener(this);
        this.views.btnTwitter.addActionListener(this);
        this.views.txtEmail.addMouseListener(this);
        this.views.txtPassword.addMouseListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == views.btnGithub) {
            functions.urlManager("https://github.com/axelprz");
        } else if (e.getSource() == views.btnInstagram) {
            functions.urlManager("https://www.instagram.com");
        } else if (e.getSource() == views.btnTwitter) {
            functions.urlManager("https://www.twitter.com");
        } else if (e.getSource() == views.btnSalir) {
            functions.exit();
        } else if (e.getSource() == views.btnEmailConfirm) {
            if (views.txtEmail.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Ingrese su correo");
            } else {
                String email = views.txtEmail.getText();
                us = usDao.login(email);
                if (us.getEmail() != null) {
                    views.txtPassword.setVisible(true);
                    views.btnNewPassword.setVisible(true);
                    JOptionPane.showMessageDialog(null, "Ahora ingresa la contraseña nueva");
                } else {
                    JOptionPane.showMessageDialog(null, "No se encontró el correo ingresado");
                }
            }
        } else if (e.getSource() == views.btnNewPassword) {
            if (!(String.valueOf(views.txtPassword.getPassword()).equals("**********"))
                    && !(String.valueOf(views.txtPassword.getPassword()).equals(""))) {
                us.setPassword(String.valueOf(views.txtPassword.getPassword()));
                if (usDao.changePassword(us)) {
                    JOptionPane.showMessageDialog(null, "Contraseña modificada");
                    views.dispose();
                } else {
                    JOptionPane.showMessageDialog(null, "No se pudo modificar la contraseña");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Ingrese la nueva contraseña");
            }
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {
        if (e.getSource() == views.txtEmail) {
            functions.placeHolderEmail(views);
        } else if (e.getSource() == views.txtPassword) {
            functions.placeHolderPassword(views);
        }
    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

}
