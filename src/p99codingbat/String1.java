package p99codingbat;

public class String1 {
	public boolean endsLy(String str) {
		  
		  return java.util.regex.Pattern.matches(".*ly", str);
		  
		  /*
		  if (str.length() >= 2) {
		    String end = str.substring(str.length() - 2);
		    return end.equals("ly");
		  }
		  
		  return false;
		  */
	}

}
