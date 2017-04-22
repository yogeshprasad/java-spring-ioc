package beans;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Test {
	
	private List fruits;
	private Set cricketrs;
	private Map  cc;
	
	
	public Test(){
		System.out.println("Inside car");
	}


	public List getFruits() {
		return fruits;
	}


	public void setFruits(List fruits) {
		this.fruits = fruits;
	}


	public Set getCricketrs() {
		return cricketrs;
	}


	public void setCricketrs(Set cricketrs) {
		this.cricketrs = cricketrs;
	}


	public Map getCc() {
		return cc;
	}


	public void setCc(Map cc) {
		this.cc = cc;
	}

	public void printData(){
		
		System.out.println("List of fruits......");
		
		for(Object fruit: fruits){
			System.out.println(fruit);
		}
		
		System.out.println("List of cricketrs......");
		
		for(Object cricketr: cricketrs){
			System.out.println(cricketr);
		}
		
		System.out.println("List of country and capital......");
		
		Set keys = cc.keySet();
		
		for(Object key: keys){
			System.out.println(key);
			System.out.println(cc.get(key));
		}
		
	}
	

}
