package testOnly;

import java.sql.Struct;

import com.fasterxml.jackson.databind.ObjectMapper;

public class MainAllTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try{
		String JsonString = "{\"name\" : \"Sibaji\",\"roll\" : 33}";
		
		ObjectMapper mapper = new ObjectMapper();
		
		Student ss = mapper.readValue(JsonString, Student.class);
		System.out.println("Name : "+ss.getName() +" and Roll no is : "+ss.getRoll());
		}
		catch(Exception exx)
		{
			exx.printStackTrace();
		}
	}

}
