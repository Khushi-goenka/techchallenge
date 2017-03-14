package com.Khushboo.dao;

import java.io.IOException;
import java.sql.SQLException;

import com.Khushboo.beans.JavaBeans;
import com.Khushboo.util.DBConnectionManager;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

public class CancelUser {
	Connection con = (Connection) DBConnectionManager.getConnection();
	public void userCancel(JavaBeans bean) throws IOException, SQLException{
		//boolean recordAdded=false;

		try{
			
		
			PreparedStatement pst5 = (PreparedStatement) con.prepareStatement("Delete from MarketPlace where partner=?");
			pst5.setString(1,bean.getMarketplace().getPartner());
			pst5.executeUpdate();
			
			
			PreparedStatement pst15 = (PreparedStatement) con.prepareStatement("Delete from Account where status=?");
			pst15.setString(1,"ACTIVE");
			pst15.executeUpdate();
			
			PreparedStatement pst16 = (PreparedStatement) con.prepareStatement("Delete from Creator where uUid =?");
			pst16.setString(1,bean.getCreator().getUuid());
			pst16.executeUpdate();
			
	
		
	}
		 catch(Exception e){
			 e.printStackTrace();
		 }

}
	
}
