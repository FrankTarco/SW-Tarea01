package com.example.demo.socket.mensaje;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

	private final Integer PORT = 15;
	
	public Server() {
		
		Socket clientSocket;
		
		try {
			ServerSocket serverSocket = new ServerSocket(PORT);
			
			while(true) {
				
				System.out.println("-----1 Iniciando server socket >> Tarco << ---------");
				System.out.println("-----2 A la espera del ClientSocket -------");
				clientSocket = serverSocket.accept();
				
				System.out.println("----3 Llego el cliente");
				
				BufferedReader entrada = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
				
				PrintWriter salida = new PrintWriter(clientSocket.getOutputStream(),true);
				
				String opcion = entrada.readLine();
				System.out.println("--------4 Llego la opcion " + opcion + "----------");
				
				switch (opcion) {
				case "Platea": salida.println("PEN 50"); break;
				case "Vip": salida.println("PEN 100"); break;
				case "Platinium": salida.println("PEN 150"); break;
				}
				
				
				System.out.println("------5 Finaliza la atencion del cliente");
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
