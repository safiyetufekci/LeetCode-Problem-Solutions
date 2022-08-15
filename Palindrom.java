public class Palindrom {
    public boolean isPalindrome(int x) {
    	String stringNum = Integer.toString(x);
    	String newStringNum ="";
    	for(int i=stringNum.length()-1;i>=0;i--) {
    		newStringNum += "" + stringNum.charAt(i);
    	}
    	
    	if(!stringNum.equals(newStringNum))
    		return false;
    
    return true;}
}