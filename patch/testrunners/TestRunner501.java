import java.util.concurrent.TimeUnit;
import java.lang.Exception;
import org.cryptoapi.bench.predictablekeystorepassword.PredictableKeyStorePasswordABHCase2;

//a test for if this will falsely cause a redef

public class TestRunner501{

	public static void main(String[] args) {
		work1();
		try{
		TimeUnit.SECONDS.sleep(250);
		}catch(Exception e){
            e.printStackTrace();
        }
		for(int i = 0; i < 50200; i++){
			work(i);
		}
	}

	public static void work1(){
		try{
		System.out.println("TESTING FOR:PredictableKeyStorePasswordABHCase2");
		PredictableKeyStorePasswordABHCase2 bc = new PredictableKeyStorePasswordABHCase2();
		//bc.go("AES/CBC/PKCS5Padding");		
		bc.go();
			  
		for(int i = 0; i < 50200; i++){
			//bc.go("AES/CBC/PKCS5Padding");
			bc.go();
		}

		}catch(Exception e){
            e.printStackTrace();
        }
	}
	public static void work(int i){
		try{
			PredictableKeyStorePasswordABHCase2 bc = new PredictableKeyStorePasswordABHCase2();
			//bc.go("AES/CBC/PKCS5Padding");
			bc.go();
			  
		System.out.println("loop : "+ i+ "done in testrunner");


		bc.go();
		bc.go();
		bc.go();
		bc.go();
		bc.go();
		bc.go();
		bc.go();
		bc.go();
		bc.go();
		
		}catch(Exception e){
			e.printStackTrace();
		}
	}


}
