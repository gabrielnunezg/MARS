import java.util.Scanner;

public class Main {
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
		try{
            System.out.println("MARS Encryption  and Decryption Algorithm");
            System.out.println("Enter a message for encryption");
            String cipherText = keyboard.nextLine();
            System.out.println("Enter a key for encryption");
            String key = keyboard.nextLine();
            
			System.out.println("Original Message: "+cipherText);
			System.out.println("Key: "+key);
			System.out.println("Original Message Bytes: "+cipherText.getBytes());
			System.out.println("Key Bytes: "+key.getBytes());
			byte[] enc = MARS.encrypt(cipherText.getBytes(), key.getBytes());
			System.out.println("Cyphered MARS Message: "+new String(enc));

			byte[] dec = MARS.decrypt(enc, key.getBytes());
			System.out.println("Decyphered MARS Message: "+new String(dec));
			
		}catch(Exception e){
			e.printStackTrace();
		}
	}

}
