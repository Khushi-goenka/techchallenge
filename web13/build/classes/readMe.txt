TechChallenge

Contributor: Khushboo Goenka, Intern Engineer, AppDirect.

Supported Functionality : Create and Cancel Subscription.

Product Name : demo_tech

This project named TechChallenge ties the AppDirect APIs with the web application 'web13',
running on sql6.freemysqlhosting.net, which is an online server and hosted by ngrok.
 This project has implemented APIs to interact with the endpoint URLs to perform the create and cancel subscription.

This project contains 6 packages, described as follows:

1-  com.Khushboo.controller : this package contains 2 servlets, CreateSubscription and CancelSubscription which is responsible for 
					         making the connection using endpoint-urls(eventUrl) by calling to Service package defined in this project
					          and also receiving and sending responses by using model package.
							  
2- com.Khushboo.beans : this package contains 14 classes that helps in parsing the json string after and also used 
						in updating the values from the table in database.
						
3- com.Khushboo.dao : 	this package contains 2 classes and also the connection to the sql server and all the sql queries of database
                        which are used to insert the values and delete the values from database.

4- com.Khushboo.domain : this package contains the get and set method resides which is required for retrieving,
				         inserting and deleting data in table.
				  
5- com.Khushboo.util :  this package is used for OAuth signature and gets data from bean package and sets it
				 in domain package. 
				 
6- com.Khushboo.service : this package is used for connection with dao and util packages, and all the computations 
							required for create and cancel subscription are done here. 