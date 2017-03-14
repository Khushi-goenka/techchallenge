package com.Khushboo.service;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import org.codehaus.jackson.map.ObjectMapper;

import com.Khushboo.beans.JavaBeans;
import com.Khushboo.dao.CreateUser;

import oauth.signpost.OAuthConsumer;
import oauth.signpost.basic.DefaultOAuthConsumer;
import oauth.signpost.exception.OAuthCommunicationException;
import oauth.signpost.exception.OAuthExpectationFailedException;
import oauth.signpost.exception.OAuthMessageSignerException;

public class CreateService {
	public void create(String eventUrl){
	OAuthConsumer consumer = new DefaultOAuthConsumer("demotech-154430", "RXPd2GVtPKu0PdFp");
    try{
    URL url = new URL(eventUrl);
    
    HttpURLConnection requestRe = (HttpURLConnection)url.openConnection();
    requestRe.setRequestProperty("Accept", "application/json");
    try {
      consumer.sign(requestRe);
    }
    catch (OAuthMessageSignerException|OAuthExpectationFailedException|OAuthCommunicationException e) {
      e.printStackTrace();
    }
    System.out.println(url);
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
    
    ObjectMapper mapper = new ObjectMapper();
    String jsonInString = sb.toString();
    System.out.println(jsonInString);
    JavaBeans obj = mapper.readValue(jsonInString, JavaBeans.class);
    
      System.out.println("FLAG STATUS: " +obj.getFlag());
      System.out.println(obj.getApplicationUuid());
      CreateUser cu = new CreateUser();
      cu.userRead(obj);
      
      System.out.println("##############");
      
    }
    catch(Exception e)
    {
    	
    	e.printStackTrace();
    }
	}

	

}
