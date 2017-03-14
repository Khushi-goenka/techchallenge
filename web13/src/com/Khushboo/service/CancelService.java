package com.Khushboo.service;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import org.codehaus.jackson.map.ObjectMapper;

import com.Khushboo.beans.JavaBeans;
import com.Khushboo.dao.CancelUser;

import oauth.signpost.OAuthConsumer;
import oauth.signpost.basic.DefaultOAuthConsumer;
import oauth.signpost.exception.OAuthCommunicationException;
import oauth.signpost.exception.OAuthExpectationFailedException;
import oauth.signpost.exception.OAuthMessageSignerException;

public class CancelService {
	public void cancel(String eventUrl1){
		OAuthConsumer consumer = new DefaultOAuthConsumer("demotech-154430", "RXPd2GVtPKu0PdFp");
	    try{
	    URL url1 = new URL(eventUrl1);
	    
	    HttpURLConnection requestRe = (HttpURLConnection)url1.openConnection();
	    requestRe.setRequestProperty("Accept", "application/json");
	    try {
	      consumer.sign(requestRe);
	    }
	    catch (OAuthMessageSignerException|OAuthExpectationFailedException|OAuthCommunicationException e) {
	      e.printStackTrace();
	    }
	    System.out.println(url1);
	   
	    requestRe.connect();
	    String l = "";
	    BufferedReader br = new BufferedReader(new InputStreamReader(requestRe.getInputStream()));
	    StringBuilder sb = new StringBuilder();
	    //l = br.readLine();
	    while ((l = br.readLine()) != null) {
	    	sb.append(l);
	    	System.out.println(l);
	    }
	   
	     //String jsonInString = l.toString();
	   // JavaBeans bean = new ObjectMapper().readValue(jsonInString, JavaBeans.class);
	    
	    ObjectMapper mapper2 = new ObjectMapper();
	    String jsonInString1 = sb.toString();
	    
	    System.out.println(jsonInString1);
	    JavaBeans obj12 = mapper2.readValue(jsonInString1, JavaBeans.class);
	    System.out.println("hiiiiiiii********");
	      System.out.println("FLAG STATUS of cancel: " +obj12.getFlag());
	      System.out.println(obj12.getApplicationUuid());
	      CancelUser cu = new CancelUser();
	      cu.userCancel(obj12);
	      
	      
	    }
	    catch(Exception e)
	    {
	    	
	    	e.printStackTrace();
	    }
		}

}
