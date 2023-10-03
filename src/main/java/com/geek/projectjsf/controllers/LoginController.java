/**
 * 
 */
package com.geek.projectjsf.controllers;

import java.io.IOException;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;

/**
 * Alberto Clase que permite controlar el funcionamiento con la pantalla de
 * login.xhtml
 */

@ManagedBean
public class LoginController {

	/*
	 * Usuario que ingresa el login
	 */
	private String usuario;

	// Contraseña ingresada en el login
	private String password;

	// Metodo que permite ingresa a la pantalla principal del proyecto
	public void ingresar() {
		System.out.println("Usuario: " + usuario);
		
		if (usuario.equals("Alberto") && password.equals("12345")) {
			
			try {
				this.redireccionar("principal.xhtml");
			} catch (IOException e) {
				FacesContext.getCurrentInstance().addMessage("formLogin:txtUsuario",
						new FacesMessage(FacesMessage.SEVERITY_FATAL, "La pagina no existe", ""));
				e.printStackTrace();
			}
			
		} else {
			
		}
	}
	
	private void redireccionar(String pagina) throws IOException {
		ExternalContext ec = FacesContext.getCurrentInstance().getExternalContext();
		ec.redirect(pagina);
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
