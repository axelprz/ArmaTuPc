package controllers.login;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JOptionPane;
import models.login.User;
import models.login.UserDao;
import views.panels.login.PanelLogin;
import views.panels.login.PanelLoginRegistrarse;

public class LoginRegisterControllers implements ActionListener, MouseListener {

    private User us;
    private UserDao usDao;
    private PanelLoginRegistrarse views;
    FunctionsLoginControllers functions = new FunctionsLoginControllers();

    public LoginRegisterControllers(User us, UserDao usDao, PanelLoginRegistrarse views) {
        this.us = us;
        this.usDao = usDao;
        this.views = views;
        this.views.btnGithub.addActionListener(this);
        this.views.btnInstagram.addActionListener(this);
        this.views.btnLogin.addActionListener(this);
        this.views.btnRegister.addActionListener(this);
        this.views.btnSalir.addActionListener(this);
        this.views.btnTwitter.addActionListener(this);
        this.views.txtEmail.addMouseListener(this);
        this.views.txtPassword.addMouseListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == views.btnSalir) {
            functions.exit();
        } else if (e.getSource() == views.btnGithub) {
            functions.urlManager("https://github.com/axelprz");
        } else if (e.getSource() == views.btnInstagram) {
            functions.urlManager("https://www.instagram.com");
        } else if (e.getSource() == views.btnTwitter) {
            functions.urlManager("https://www.twitter.com");
        } else if (e.getSource() == views.btnLogin) {
            PanelLogin login = new PanelLogin();
            login.setVisible(true);
            views.dispose();
        } else if (e.getSource() == views.btnRegister) {
            if (views.txtEmail.getText().equals("") || String.valueOf(views.txtPassword.getPassword()).equals("")
                    || views.txtEmail.getText().equals("Correo Electrónico") || String.valueOf(views.txtPassword.getPassword()).equals("**********")) {
                JOptionPane.showMessageDialog(null, "Hay campos vacíos");
            } else {
                if (Validator.isValidEmail(views.txtEmail.getText())) {
                    if (Validator.isValidPassword(String.valueOf(views.txtPassword.getPassword()))) {
                        us.setEmail(views.txtEmail.getText());
                        us.setPassword(String.valueOf(views.txtPassword.getPassword()));
                        us.setAdmin(false);
                        if (usDao.register(us)) {
                            JOptionPane.showMessageDialog(null, "Usuario registrado con éxito");
                            views.dispose();
                        } else {
                            JOptionPane.showMessageDialog(null, "Error al registra el usuario");
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "La contraseña debe contener: \n 8 caracteres como minimo \n 1 número \n 1 caracter especial");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Introduce un email válido");
                }
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
