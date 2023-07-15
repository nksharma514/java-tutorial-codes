package javaTutorialCodes;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class File_Handling {

	public static void main(String[] args) throws Exception {
		
//		file created and write something in that file
		
		File f = new File("New File .txt");
		FileOutputStream fos = new FileOutputStream(f);
		DataOutputStream dos = new DataOutputStream(fos);
		dos.writeUTF("file Created");
		
//		Retrieve file and written content showing in output
		
		FileInputStream fis = new FileInputStream(f);
		DataInputStream dis = new DataInputStream(fis);
		String str = dis.readUTF();
		System.out.println(str);

	}

}
