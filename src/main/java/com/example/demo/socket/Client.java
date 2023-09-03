package com.example.demo.socket;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {
	
	private final Integer PORT = 15;
	private final String IP = "localhost";

	public Client() {
		
		try {
			Socket clientServer = new Socket(IP,PORT);
			System.out.println("---------1 Iniciando comunicación ----------");
			
			System.out.println("---------2 Finalizando comunicación --------");
			
			clientServer.close();
			
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public static void main(String[] args) {
		
		new Client();
		
	}
	
	
}
