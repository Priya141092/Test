package Utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

    public class PropertyReader {
    	
	public static String getValue = "";
	
	public static String getData(String val) {

    File file=new File("/Demosession/src/main/resources/data.properties");
	FileInputStream fis=null;
	Properties prop=null;
	{
	try 
	{
	fis = new FileInputStream(file);
	 prop= new Properties();
	 prop.load(fis);
	} 
	 catch (FileNotFoundException e) 
	{
	e.printStackTrace();
	}
	 catch (IOException e) 
	{
	 e.printStackTrace();
	}
	getValue=prop.getProperty(val);
	}
	return getValue;
     }
    }
   
