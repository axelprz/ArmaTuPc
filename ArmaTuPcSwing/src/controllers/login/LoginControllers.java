package controllers.login;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JOptionPane;
import models.login.User;
import models.login.UserDao;
import views.panels.PanelCreaTuPc;
import views.panels.PanelAdministrador;
import views.panels.login.PanelLogin;
import views.panels.login.PanelLoginChangePassword;
import views.panels.login.PanelLoginRegistrarse;

public class LoginControllers implements ActionListener, MouseListener {

    private User us;
    private final UserDao usDao;
    private final PanelLogin views;
    FunctionsLoginControllers functions = new FunctionsLoginControllers();

    public LoginControllers(User us, UserDao usDao, PanelLogin views) {
        this.us = us;
        this.usDao = usDao;
        this.views = views;
        this.views.btnChangePassword.addActionListener(this);
        this.views.btnGithub.addActionListener(this);
        this.views.btnInstagram.addActionListener(this);
        this.views.btnLogin.addActionListener(this);
        this.views.btnRegister.addActionListener(this);
        this.views.btnTwitter.addActionListener(this);
        this.views.txtEmail.addMouseListener(this);
        this.views.txtPassword.addMouseListener(this);
        this.views.btnSalir.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == views.btnLogin) {
            if (views.txtEmail.getText().equals("") || String.valueOf(views.txtPassword.getPassword()).equals("")) {
                JOptionPane.showMessageDialog(null, "Hay campos vacíos");
            } else {
                String email = views.txtEmail.getText();
                String password = String.valueOf(views.txtPassword.getPassword());
                us = usDao.login(email, password);
                if (us.getEmail() != null) {
                    if (us.isAdmin() == true) {
                        PanelAdministrador admin = new PanelAdministrador();
                        admin.setVisible(true);
                        this.views.dispose();
                    } else {
                        PanelCreaTuPc buys = new PanelCreaTuPc();
                        buys.setVisible(true);
                        this.views.dispose();
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Correo o contraseña incorrecta");
                }
            }
        } else if (e.getSource() == views.btnSalir) {
            functions.exit();
        } else if (e.getSource() == views.btnChangePassword) {
            PanelLoginChangePassword changePassword = new PanelLoginChangePassword();
            changePassword.setVisible(true);
        } else if (e.getSource() == views.btnRegister) {
            PanelLoginRegistrarse register = new PanelLoginRegistrarse();
            register.setVisible(true);
        } else if (e.getSource() == views.btnGithub) {
            functions.urlManager("https://github.com/axelprz");
        } else if (e.getSource() == views.btnInstagram) {
            functions.urlManager("https://www.instagram.com");
        } else if (e.getSource() == views.btnTwitter) {
            functions.urlManager("https://www.twitter.com");
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
