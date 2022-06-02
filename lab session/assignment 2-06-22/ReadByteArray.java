package corejava;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
public class ReadByteArray {
	public static void main(String a[]){
		//Take file location in string variable
        String file_name = "D:\\myFile.txt";
        //creat object  of Inputstream
        InputStream fins = null;
        try {
        	//give location to FileInputStream
            fins = new FileInputStream(file_name);
            //Declaration byte array
            byte file_content[] = new byte[2*10];
            //initialize and declare the read count
            int read_count = 0;
            //interate array to print array using loop
            while((read_count = fins.read(file_content)) > 0){
                System.out.println(new String(file_content, 0, read_count-1));
            }
        
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try{
                if(fins != null) fins.close();
            } catch(Exception ex){
                 
            }
        }
    }

		
	}


