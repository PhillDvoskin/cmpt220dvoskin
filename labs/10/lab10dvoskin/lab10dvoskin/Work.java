package lab10dvoskin;

public class Work {
	public abstract class Employee {
		 String name;
		 double age;
		 double hourRate;
		 public abstract double salary(double hours);
		 public String toString() {
		 return "name= " + name + " age=" + age + " hourRate="
		 + hourRate;
		 }
		}

	public class Manager extends Employee {
		// make a getName for the Manager's name
		 public String getName() {
			return name;
			}
		 // make a setName for the Manager's name using the parameter
		public void setName(String name) {
			this.name = name;
		}
		// make a getAge for the Manager's age
		public double getAge() {
			return age;
		}
		// make a setAge for the Manager's age using the parameter
		public void setAge(double age) {
			this.age = age;
		}
		// make a getHourRate for the hour rate the Manager gets payed
		public double getHourRate() {
			return hourRate;
		}
		// make a setHourRate for the hour rate the Manager gets payed
		public void setHourRate(double hourRate) {
		this.hourRate = hourRate;
		}
		// override the Manager's age to set hours as a parameter that is multiplied by hourRate in main method
		@Override
		public double salary(double hours) {
			return 0;
		}
		// make a toString that prints out all of the Manager's variables
		public String toString() {
			return "name= " + name + " age= " + age + " hourRate= " + hourRate;
		}
	}
	
	public abstract class Clerk extends Employee {
		// make a getName for the Clerk's name
		 public String getName() {
			return name;
			}
		 // make a setName for the Clerk's name using the parameter
		public void setName(String name) {
			this.name = name;
		}
		// make a getAge for the Clerk's age
		public double getAge() {
			return age;
		}
		// make a setAge for the Clerk's age using the parameter
		public void setAge(double age) {
			this.age = age;
		}
		// make a getHourRate for the Clerk's hour rate of pay
		public double getHourRate() {
			return hourRate;
		}
		// make a setHourRate for the Clerk's hour rate of pay using the parameter
		public void setHourRate(double hourRate) {
		this.hourRate = hourRate;
		}
		// override the salary to make it double the hours and use the hours times hourRate in the main method
		@Override
		public double salary(double hours) {
			return 0;
		}
		// return a toString with the Clerk's variables
		public String toString() {
			return "name= " + name + " age= " + age + " hourRate= " + hourRate;
		}
	}
}
