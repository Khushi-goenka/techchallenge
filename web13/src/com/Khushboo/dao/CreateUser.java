package com.Khushboo.dao;
import java.io.IOException;
import java.sql.SQLException;
import java.util.Random;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.Khushboo.beans.*;
import com.Khushboo.util.DBConnectionManager;

public class CreateUser {
	Connection con = (Connection) DBConnectionManager.getConnection();
public void userRead(JavaBeans bean) throws IOException, SQLException{
	
		
		try{
			
		PreparedStatement pst = (PreparedStatement) con.prepareStatement("insert into MarketPlace (partner,baseUrl) values(?,?)");		
		pst.setString(1,bean.getMarketplace().getPartner());
		pst.setString(2,bean.getMarketplace().getBaseUrl());
		
		pst.executeUpdate();
		
		

		PreparedStatement pst1 = (PreparedStatement) con.prepareStatement("insert into Company (comp_uid,comp_name,comp_email,comp_phn,comp_website) values(?,?,?,?,?)");		
		pst1.setString(1,bean.getPayload().getCompany().getUuid());
		pst1.setString(2,bean.getPayload().getCompany().getName());
		pst1.setString(3,bean.getPayload().getCompany().getEmail());
		pst1.setString(4,bean.getPayload().getCompany().getPhoneNumber());
		pst1.setString(5,bean.getPayload().getCompany().getWebsite());
		pst1.executeUpdate();
		
		
		PreparedStatement pst12 = (PreparedStatement) con.prepareStatement("insert into Account (account_id,status,comp_uuid) values(?,?,?)");		
       
		int n = 0;
		if(bean.getPayload().getAccount()==null)	
       {
    	   Random rand = new Random();

    	   n = rand.nextInt(50) + 1;
       }
		pst12.setString(1,(""+n));
		pst12.setString(2,"ACTIVE");
		pst12.setString(3,"");
		pst12.executeUpdate();
		
		PreparedStatement pst13 = (PreparedStatement) con.prepareStatement("insert into Creator (uUid,ufirstName,uEmail,uOpenId) values(?,?,?,?)");		
		pst13.setString(1,bean.getCreator().getUuid());
		pst13.setString(2,bean.getCreator().getFirstName());
		pst13.setString(3,bean.getCreator().getEmail());
		pst13.setString(4,bean.getCreator().getOpenId());
		pst13.executeUpdate();
		
		PreparedStatement pst14 = (PreparedStatement) con.prepareStatement("insert into Orders (editionCode,pricingDuration) values(?,?)");		
		pst14.setString(1,bean.getPayload().getOrder().getEditionCode());
		pst14.setString(2,bean.getPayload().getOrder().getPricingDuration());
		pst14.executeUpdate();
		
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	
	
	}

}