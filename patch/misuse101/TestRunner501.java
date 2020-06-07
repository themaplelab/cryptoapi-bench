import java.util.concurrent.TimeUnit;
import java.lang.Exception;
import org.cryptoapi.bench.brokencrypto.BrokenCryptoABICase501;

//a test for if this will falsely cause a redef

public class TestRunner501{

	public static void main(String[] args) {
		work1();
		try{
		TimeUnit.SECONDS.sleep(175);
		}catch(Exception e){
            e.printStackTrace();
        }
		for(int i = 0; i < 50200; i++){
			work(i);
		}
	}

	public static void work1(){
		try{
		System.out.println("REDEFINITION PASSED");
		BrokenCryptoABICase501 bc = new BrokenCryptoABICase501();
		bc.go("AES/CBC/PKCS5Padding");		
		
		for(int i = 0; i < 50200; i++){
			bc.go("AES/CBC/PKCS5Padding");
		}

		}catch(Exception e){
            e.printStackTrace();
        }
	}
	public static void work(int i){
		try{
			BrokenCryptoABICase501 bc = new BrokenCryptoABICase501();
		bc.go("AES/CBC/PKCS5Padding");
		
		System.out.println("loop : "+ i+ "done in testrunner");


		bc.go("AES/CBC/PKCS5Padding");
		bc.go("AES/CBC/PKCS5Padding");
		bc.go("AES/CBC/PKCS5Padding");
		bc.go("AES/CBC/PKCS5Padding");
		bc.go("AES/CBC/PKCS5Padding");
		bc.go("AES/CBC/PKCS5Padding");
		bc.go("AES/CBC/PKCS5Padding");
		bc.go("AES/CBC/PKCS5Padding");
		bc.go("AES/CBC/PKCS5Padding");
		bc.go("AES/CBC/PKCS5Padding");
		bc.go("AES/CBC/PKCS5Padding");
		bc.go("AES/CBC/PKCS5Padding");
		bc.go("AES/CBC/PKCS5Padding");
		bc.go("AES/CBC/PKCS5Padding");
		bc.go("AES/CBC/PKCS5Padding");
		bc.go("AES/CBC/PKCS5Padding");
		bc.go("AES/CBC/PKCS5Padding");

	   
		}catch(Exception e){
			e.printStackTrace();
		}
	}


}
