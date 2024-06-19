package Generics;

import ExamPractice.EmployeeRecord;

public class PracticeExam {
	public class Trio<A,B,C> {
		private A one;
		private B two;
		private C three;
	}
	
	public Trio( A one, B two, C three) {
		this.one = one;
		this.two = two;
		this.three = three;
	}
	
	public A getOne() {
		return one;
	}
	
	
	
	//------------------------------------ Person and EmployeeRecord class
	//-----Shallow return fixed
	public Person getEmployee() {
		return new Person(employee.getFirstName(), employee.getLastName());
	}
	//-----Copy constructor
	public EmployeeRecord( EmployeeRecord er) {
		this.employee = er.getEmployee();	// getEmployee() now does a deep return so we can use this is copy constructor
		this.id = er.getId();
	}

	
	}
	
	
	
	
	//-------- #5a / 5b
	public static void main(String[] args) {
		Package packages[] = new Package[3];
		packages[0] = new Box(5,10,8);
		packages[1] = new Tube(1,2);
		packages[2] = new Box(3,4,5);
		
		double totalArea = 0;
		double totalVolume = 0;
		double totalDiameter = 0;
		int numTubes = 0;
		
		for(int i = 0; i < packages.length; i++) {
			totalArea += packages[i].area();
			totalVolume += packages[i].volume();
			
			if(packages[i] instanceof Tube) {
				Tube t = (Tube)packages[i];
				totalDiameter += t.getDiameter();
				numTubes++;
			}
		}
		double avgDiameter = totalDiameter/numTubes;
	}
	
	//------ #7
	public static double m(int n) {
		if(n == 0) { return 0; } // base case
		return m(n-1) + 1. / n;	 //recursive case	
	}
	
	//---#8a
	ArrayBag<Polynomial> bag1 = new ArrayBag<>(12);
	
	// 8b
	Polynomial p1 = new Polynomial(2);
	Polynomial p2 = new Polynomial(3);
	bag1.addMany(p1,p2);
	// OR
	bag1.addMany(new Polynomial(2), new Polynomial(3));
	
	// 8c
	int count = bag1.countOccurrences( new Polynomial(10));
	
	// 8d
	int free = bag1.getCapacity() - bag1.size();
	
	
	// 9
	public void add(E element) {
		growAsNeeded();
		data[manyItems++] = element;
	}
	
	private void growAsNeeded() {
		if(manyItems == data.length) {
			Object[] obj = new Object[data.length * 2];
			for(int i = 0; i < manyItems; i++) {
				obj[i] = data[i];
			}
			data = obj;
		}
	}
	
	// -- 10 --------------
	public class Stack<E> {
		E[] data;
		int manyItems;
		
		public void push(E value) {
			growAsNeeded(); //Assuming also exists from arrayBag
			data[manyItems++] = value;
		}
		
		public E pop() {
			if(manyItems == 0) {
				throw new InvalidStateException("Stack is empty");
			}
			E temp = data[--manyItems];
			return temp;
		}
	}
	
}
