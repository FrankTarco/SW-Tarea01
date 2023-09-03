package com.example.demo.socket;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

	private final Integer PORT = 15;
	
	public Server() {
		
		Socket clientSocket;
		
		try {
			ServerSocket serverSocket = new ServerSocket(PORT);
			
			while(true) {
				
				System.out.println("-----1 Iniciando server socket ---------");
				System.out.println("-----2 A la espera del ClientSocket -------");
				clientSocket = serverSocket.accept();
				
				System.out.println("----3 Llego el cliente");
				
				Thread.sleep(3000); // 3 segundos
				
				System.out.println("------4 Finaliza la atencion del cliente");
				clientSocket.close();
				
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
	}
	
	public static void main(String[] args) {
		new Server();
	}
}
