import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;

/*Operations are saved to a file named operationHistory.ser */

public class Operation implements Serializable{

	private static final long serialVersionUID = 1L;
	private final int type;	//1 is for the "buying" operation, 2 for the "selling" operation.
	private Asset asset;
	private Date date;
	private int amount;
	
	public Operation(int type, Asset asset, Date date, int amount){
		setType(type);
		setAsset(asset);
		setDate(date);
		setAmount(amount);
	}

	public void setType(int type) {
		this.type = type;
	}
	
	public void setAsset(Asset asset) {
		this.asset = asset;
	}
	
	public void setDate(Date date) {
		this.date = date;
	}
	
	public void setAmount(int amount) {
		this.amount = amount;
	}
	
	public int getType() {
		return type;
	}
	
	public int getAmount() {
		return amount;
	}
	
	public Asset getAsset() {
		return asset;
	}
	
	public Date getDate() {
		return date;
	}
	
	public void UpdatePorfolio() {
		// creo que este metodo deberia ir en Portfolio
	}
	
	public void Operate(Operation op){
		
	}
	
	void WriteOperationInHistoryFile(Operation operation){	//o es un método static, o es de instancia y no recibe parametros
		
		String fileName = "operationHistory.ser";
		
		try {
			
			FileOutputStream fos = new FileOutputStream(fileName);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(operation);
			oos.close();
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
			
		} catch(IOException e) {
			
			e.printStackTrace();
			
		}		
		
	}
	/*Hay lo que decia santi
	 *  de manejar el flujo con 
	 *  try-catch pero es la unica
	 *   manera que encontre
	*/
	public Collection<Operation> readFromFile() {  
		List<Operation> operationList = new ArrayList<Operation>();
		String fileName = "operationHistory.bin";
				
	      try {
	    	  
	    	  FileInputStream fis = new FileInputStream(fileName);
	    	  ObjectInputStream ois = new ObjectInputStream(fis);
	    	  
	    	  	while(true) {
	
	    	  		Operation operation = (Operation) ois.readObject();
	    	  		operationList.add(operation);
	    	  		
	    	  	}
	      } catch (EOFException expectedException) {
	    	  //continue to finally block
	      } catch (ClassNotFoundException cnf) {
	    	  cnf.printStackTrace();
	      } catch (IOException io) {
	    	  io.printStackTrace();
	      } finally {
	         try{
				if( ois != null )
	        		 ois.close();
	         } catch (IOException e){
	        	 e.printStackTrace();
	         }
	      return operationList;
	      }	
	}
	
}
