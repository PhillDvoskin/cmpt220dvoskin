package lab10dvoskin;

public interface Problem3 {
	// implement the printable interface
		interface Printable {
		public void print();
		}
		class Rectangle implements Printable {
			// set private variables length and width
			private int length,width;
			// make a type rectangle with parameters length and width
			public Rectangle(int length,int width) {
				this.length = length;
				this.width = width;
			}
			// initiate the toString with the interface print method
			public void print() {
				System.out.println("Rectangle : length : " + length + " width : " + width + " Area : " + length * width);
			}
		}

		class SportCar implements Printable {
			// make a private string for the car name and a private long for the license plate number
			private String name;
			private long number;
			// make a type SportsCar with parameters length and width
			public SportCar(String name,long number) {
				this.name = name;
				this.number = number;
			}
			// initiate the toString with the interface print method
			public void print() {
				System.out.println("Sports Car : Name : " + name + " Number : " + number);
			}
		}

		class Manager implements Printable {
			// make private variable String for the name of the manager and long for the department number
			private String name;
			private long deptNumber;
			// make a type Manager with the parameters name and deptNumber
			public Manager(String name,long deptNumber) {
				this.name = name;
				this.deptNumber = deptNumber;
			}
			// initiate the toString with the interface print method
			public void print() {
				System.out.println("Manager : Name :" + name + " Department Number : " + deptNumber);
			}
		}
		class PrintableDemo {
			public void main (String[] args) {
				Printable vec[] = {
					new Rectangle(200,100),
					new SportCar("Fiat",7892321),
					new Rectangle(34,32),
					new Manager("Claire",32),
					new Rectangle(54,10),
					new SportCar("Audi",4322344),
					new SportCar("Mazda",4322343),
					new Manager("John",2344322)
			  };
			   
			   for(int index = 0;index < vec.length;index++)
			   vec[index].print();
			   
			}
		}
	}
