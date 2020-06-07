package randoopTest;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.BeforeClass;
import java.util.concurrent.TimeUnit;
import java.lang.Class;
import java.lang.reflect.Method;
import java.lang.Exception;

@RunWith(Suite.class)
@Suite.SuiteClasses({ RegressionTest0.class })
public class RegressionTest {

 @BeforeClass
    public static void setUpClass() throws Throwable {
	 System.out.println("Testsuite setup: ");
	 System.out.println("########################");	
	 try{
		 String strFullyQualifiedClassName = System.getProperty("arg1");
		 
		 System.out.println("TESTING FOR: "+ strFullyQualifiedClassName);
		 Class<?> cls = Class.forName(strFullyQualifiedClassName);
		 Method m = cls.getMethod("main", String[].class);
		 String[] params = new String[] {"A","B","C"};
		 m.invoke(null, (Object) params);

		 for(int i = 0; i < 50200; i++){
            m.invoke(null, (Object) params);
		 }
		 TimeUnit.SECONDS.sleep(100);
		 
		 m.invoke(null, (Object) params);
	 }catch(Exception e){
		 e.printStackTrace();
	 }
	 System.out.println("########################");
 }
}

