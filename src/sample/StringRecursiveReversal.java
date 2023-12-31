package sample;

public class StringRecursiveReversal {
	String reverse = "";
	public String reverseString(String str){
		if(str.length() == 1){
			return str;
		} else {
			reverse =reverse+ str.charAt(str.length()-1)+reverseString(str.substring(0,str.length()-1));
			return reverse;
		}
	}

	public static void main(String a[]){
		StringRecursiveReversal srr = new StringRecursiveReversal();
		System.out.println("Result: "+srr.reverseString("SeleniumWebdriver"));
	}
}