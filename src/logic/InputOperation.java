package logic;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.logging.Logger;

public class InputOperation {
	
	public InputOperation(){}
	
	private static void main(String[] args) {
		try {
			byte[] arr = System.in.readAllBytes();
			//Apro il canale di input dove attendo in ingresso
			//Uno stream di bytes con cui poter fare operazioni
			ByteArrayInputStream io = new ByteArrayInputStream(System.in.readAllBytes());
			int data = 0;
			for(int i=0;i<arr.length;i++) {
				//Faccio una semplice somma dell'input
				data += io.read();
			}
			
			io.close();
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}	
	
}
