package com.ge.ds.sample_ds;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.StringUtils;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        List<DataAttributes> dataAttributes=new ArrayList<>();
        
        
        dataAttributes.removeIf(dataAttribute -> StringUtils.isEmpty(dataAttribute.getKey()));

        dataAttributes.forEach(attr ->
        System.out.println("dataattributes " + attr) );
        
    }
    
    
    class DataAttributes{
    	
    	String key;

		public String getKey() {
			return key;
		}

		public void setKey(String key) {
			this.key = key;
		}
    	
    	
    	
    }
    
}
