package com.hibernatepractica1.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.hibernatepractica1.model.Producto;

@WebServlet("/CreateProductServlet")
public class CreateProductServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html charset='utf-8'");
		PrintWriter salida = response.getWriter();
		
		Producto miP = new Producto();
		miP.setNombreProducto(request.getParameter("txtNombre"));
		miP.setPrecioProducto(Double.parseDouble(request.getParameter("txtPrecio")));
		miP.setExistenciasProducto(Integer.parseInt(request.getParameter("txtExistencias")));
		
		salida.print("Se agrego: "+miP.getNombreProducto());
		
		// Creamos el objeto Configuration
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		
		// Se crea el sessionFactory
		SessionFactory factory = cfg.buildSessionFactory();
		
		// Se inicia el objeto session
		Session sesion = factory.openSession();
		
		// Se inicia la transacción
		Transaction transac = sesion.beginTransaction();
		
		// Se crea el objeto no persistído (miP, el de arriba)
		
		// Persistimos el objeto
		sesion.persist(miP);
		
		// Hacemos el commit
		transac.commit();
		
		
		salida.close();
	}

}
