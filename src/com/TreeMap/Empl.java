package com.TreeMap;

public class Empl {
	 private String name;
	    private int salary;
	     
	    public Empl(String n, int s){
	        this.name = n;
	        this.salary = s;
	    }
	     
	    public String getName() {
	        return name;
	    }
	    public void setName(String name) {
	        this.name = name;
	    }
	    public int getSalary() {
	        return salary;
	    }
	    public void setSalary(int salary) {
	        this.salary = salary;
	    }

		@Override
		public String toString() {
			return "Empl [name=" + name + ", salary=" + salary + "]";
		}
		
		public void sanjitEditMethod(){
			System.out.println("Edit by Sanjit");
		}
	    
}
