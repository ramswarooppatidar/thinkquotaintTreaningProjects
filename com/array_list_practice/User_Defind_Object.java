package com.array_list_practice;
import java.util.ArrayList;
import java.util.*;

class User{
	   String name;
	   int age;
	   public User(String s,int b) {
		   name =s;
		   age = b;
		   
	   }
	   public String getName() {
		   return name;
	   }
	   public int getAge() {
		   return age;
	   }
	   public void setName(String s) {
		   name=s;
	   }
	   public void setAge(int b) {
		   age = b;
	   }

}
class iteratorrr{
	
	public void iteration() {
		ArrayList<String> name = new ArrayList<>();
		//Iterator<String> itr = name.iterator();
		name.add("ajay");
		name.add("jatin");
		name.add("shrishti");
		name.add("vijay");
		name.add("shyam");
		name.addAll(name);
		System.out.println(name);
		for(Iterator<String> itr = name.iterator();itr.hasNext();) {
			String o = itr.next();
			if(o.equals("vijay")) {
				itr.remove();
			}
		}
		System.out.println(name);
		
}


public class User_Defind_Object {

	public void main(String[] arg) {
		// TODO Auto-generated method stub
	/*	List<User> userss = new ArrayList<>();
		userss.add(new User("rajeev",25));
		userss.add(new User("rajesh",16));
		userss.add(new User("raghav",35));
		
		userss.forEach(user->{
			System.out.println("name: "+ user.getName()+", age :"+ user.getAge());
		});*/
		
		iteratorrr obj = new iteratorrr();
		obj.iteration();
	
	}

}}
