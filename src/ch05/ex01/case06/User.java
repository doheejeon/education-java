package ch05.ex01.case06;

public class User { 
	   private String name;
	   private int age;
	   
	      //setter 
		   private void setName(String myName) {
		      if(myName.charAt(0) == '최')
		     name = myName;
		  else name = "reject";
		   }
		   
		   public void setAge(int myAge) {
		      if(20 <= myAge && myAge < 30)
		         age = myAge;
		      else age = -1; 					// 현장에서 -1이나 0은 '부정'의 뜻을 담고있다.
		   }
		      // getter 
		   public String getName(int level) {
		      String myName = "";
		  if(level > 5) myName = name;
		  else myName = "비밀";
		      
		      return myName;
		   }
		   
		   public int getAge(int level) {
		      int myAge = 0;
		      if(level > 5) myAge = age;
		      
		      return myAge;
		   }
	}