package com.Khushboo.controller;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.codehaus.jackson.map.ObjectMapper;

import com.Khushboo.service.CreateService;

import ravi.model.ResponseSuccess;



@WebServlet("/CreateSubscription")
public class CreateSubscription extends HttpServlet
{
  private static final long serialVersionUID = 1L;
  
  public CreateSubscription() {
	  super();
  }
  
  protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException
  {
    response.setContentType("application/json");
    PrintWriter out = response.getWriter();
    String eventUrl = request.getParameter("eventUrl");
    ObjectMapper mapper = new ObjectMapper();
    response.setStatus(200);
    
    System.out.println(eventUrl);
    
    
     CreateService obj2 = new CreateService();
     obj2.create(eventUrl);
    ResponseSuccess responseObject = new ResponseSuccess(true, "new-account-identifier");
    String json = mapper.writeValueAsString(responseObject);
    out.print(json);
    
     
//    
//    System.out.println("hii " + bean.getApplicationUuid());

  }
}
