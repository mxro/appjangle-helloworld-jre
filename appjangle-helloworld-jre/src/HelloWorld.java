import io.nextweb.Query;
import io.nextweb.Session;

import com.appjangle.jre.AppjangleJre;


public class HelloWorld {

	public static void main(String[] args) {
		Session session = AppjangleJre.createSession();
		
		Query hello = session.seed().setValue("Hello, World!");
		
		System.out.println("Here: "+hello.get());
		
		
		session.close().get();
		
		System.out.println("And I'm done!");
		
	}

}
