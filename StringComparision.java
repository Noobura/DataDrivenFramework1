package assignmentClass;

import org.apache.log4j.net.SyslogAppender;

public class StringComparision {

	public static void main(String[] args) {
		//   == and .equals()
		
		String a = "abc";
		String b = "abc";
		String c = a;
	    System.out.println(a==b);
	    System.out.println(a.equals(b));
	       
	    String name1 = new String("Noobura");
	    String name2 = new String("Noobura");
	    String name3 = name2;
	    System.out.println(name1==name2);
	    System.out.println(name1.equals(name2));
	    System.out.println(name3.equals(name2));
	}

}
