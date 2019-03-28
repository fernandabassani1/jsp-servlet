package br.com.sisvenda.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.sisvenda.model.Cliente;
import br.com.sisvenda.repository.ClienteRepository;
import br.com.sisvenda.service.ClienteService;
import br.com.sisvenda.service.FuncionarioService;

@WebServlet("/cadastraCliente") 
public class CadastraClienteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String nome = request.getParameter("nome");
		String documento = request.getParameter("documento");
		
		/* Cliente cliente = new ClienteService(new ClienteRepository()).criarCliente(nome, documento);
		 System.out.println(cliente+" Salvo");
		*/
		ClienteService service = new ClienteService();
	    service.criarCliente(nome, documento);
	    	    
	    response.sendRedirect("listaCliente"); 
		
	}

}
