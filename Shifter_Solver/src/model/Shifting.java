package model;

public class Shifting {

    public static Dictionary dict = new Dictionary();
     
    //Prints out all the possible shifts
    public int shifter(String s){ 
        s = s.toLowerCase();
        for(int i = 0; i< 25; i++){
           if(dict.isAWord(nextShift(s)))           
        	  return i;
            s = nextShift(s);
        }
        return -1;
    }
    
    //Returns the string where each character is shifted by 1, ie abb -> bcc
    private String nextShift(String s){
        String temp = "";
        for(char c: s.toCharArray()){
        	
        	if((c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z') )	
            temp += (c =='z') ? (c ='a'):(c == 'Z') ? (c = 'A'):(c+=1);  
        	//temp += (char) (c+=1)%26 + 96;
            else temp += c;
        }
        return temp;
    }
    
    public String shiftByN(String s, int n) {
    	for(int i = 0; i< n; i++)
    		s = nextShift(s);
    	return s;
    }
      
}
