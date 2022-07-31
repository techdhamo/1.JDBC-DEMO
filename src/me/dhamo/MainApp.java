package me.dhamo;

import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MainApp {

	public static void main(String[] args) throws SQLException {
	Internet net=new BSNLBroadband();
	 
	}

}

interface Internet{
	void subcription();
	void connect();
	void browse();
	void disconnect();
}
class BSNLBroadband implements Internet{
int balance;
boolean subcription=false;
	@Override
	public void connect() {
		 //
	}

	@Override
	public void browse() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void disconnect() {
		// TODO Auto-generated method stub
		
	}
	
	public void recharge() {
		
	}
	
	public void billPay() {
		
	}

	@Override
	public void subcription() {
		// TODO Auto-generated method stub
		
	}
}

class Jio implements Internet{
boolean subscription=false;
	@Override
	public void connect() {
		// TODO Auto-generated method stub
		if (subscription) {
			System.out.println("100 Mbps");
		}else {
			System.out.println("2MBps");
		}
	}

	@Override
	public void browse() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void disconnect() {
		// TODO Auto-generated method stub
		
	}
	
	public void membership(){
		
	}

	@Override
	public void subcription() {
		// TODO Auto-generated method stub
		
	}
	
}

