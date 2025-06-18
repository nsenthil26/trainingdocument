import java.util.*;
class Main{
public static void main(String args[]){
	List <String> languages =new ArrayList<String>();
	languages.add("Java");
	languages.add("Python");
	languages.add("Kotlin");
	System.out.println("ArrayList: " + languages);
	Iterator itr= languages.iterator();
	while(itr.hasNext()){
		System.out.println(itr.next());
	}  
    }  
} 
