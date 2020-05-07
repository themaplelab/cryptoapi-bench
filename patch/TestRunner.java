//import org.cryptoapi.bench.*;
import java.lang.Class;
import java.lang.reflect.Method;
import java.util.concurrent.TimeUnit;
import java.lang.Exception;

public class TestRunner{

	public static void main(String[] args) {
		try{
		String strFullyQualifiedClassName = args[0];

		System.out.println("TESTING FOR: "+ strFullyQualifiedClassName);
		Class<?> cls = Class.forName(strFullyQualifiedClassName);
		Method m = cls.getMethod("main", String[].class);
		String[] params = null; 
		m.invoke(null, (Object) params); 

		for(int i = 0; i < 50200; i++){
			m.invoke(null, (Object) params);
		}
		TimeUnit.SECONDS.sleep(30);
		
		m.invoke(null, (Object) params);
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}


}
