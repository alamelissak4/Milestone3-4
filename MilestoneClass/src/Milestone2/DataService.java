package Milestone2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class DataService implements Serializable{
	
	public static List<AllContact> read(){
		
		List<AllContact> items = new ArrayList<>();
		

		try {
			FileInputStream fis = new FileInputStream("contacts.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);
			items =(ArrayList<AllContact>) ois.readObject();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return items;
		
	}

	public static void write(List<AllContact> items) {
		
		try {
			FileOutputStream fos = new FileOutputStream("contacts.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(items);
			oos.close();
			fos.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
