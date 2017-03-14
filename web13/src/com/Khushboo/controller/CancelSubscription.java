package com.Khushboo.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.codehaus.jackson.map.ObjectMapper;

import com.Khushboo.service.CancelService;

import ravi.model.ResponseSuccess;
/**
 * Servlet implementation class CancelSubscription
 */
@WebServlet("/CancelSubscription")
public class CancelSubscription extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CancelSubscription() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("application/json");
	    PrintWriter out = response.getWriter();
	    String eventUrl = request.getParameter("eventUrl");
	    ObjectMapper mapper = new ObjectMapper();
	    response.setStatus(200);
	    
	    System.out.println(eventUrl);
	    
	    CancelService obj3 = new CancelService();
	     obj3.cancel(eventUrl);
	    ResponseSuccess responseObject = new ResponseSuccess(true, "new-account-identifier");
	    String json1 = mapper.writeValueAsString(responseObject);
	    out.print(json1);
	   // System.out.println(json1);
	   
	  }
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
