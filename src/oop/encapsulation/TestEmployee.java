package oop.encapsulation;

public class TestEmployee {

	public static void main(String[] args) {
		Employee emp1 = new Employee();
		emp1.setEmpName("Vallerie");
		emp1.setEmpDOB("12-03-1991");
		emp1.setEmpId(101);
		System.out.println(emp1.getEmpName()+ " "+emp1.getEmpId()+" "+emp1.getEmpDOB());
		
		Employee emp2 = new Employee();
		emp1.setEmpName("Angel");
		emp1.setEmpDOB("02-03-1995");
		emp1.setEmpId(102);
		System.out.println(emp1.getEmpName()+ " "+emp1.getEmpId()+" "+emp1.getEmpDOB());
		
		Employee emp3 = new Employee("Daniel", 103,"03-10-1995"); 
				System.out.println(emp3.getEmpName()+ " "+emp3.getEmpId()+" "+emp3.getEmpDOB());
		Employee emp4 = new Employee();
		
	
	
	}

}
