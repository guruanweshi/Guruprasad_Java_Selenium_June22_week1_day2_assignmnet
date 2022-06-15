package week1.day2.assignments;

public class EmployeeDetails {

	public static void main(String[] args) {
		EmployeeDetails empobj = new EmployeeDetails();
		empobj.printEmployeeName("Guru", 1234);
		empobj.getEmployeeAddress("Bangalore");
		empobj.printEmployeeSalary(150000.475);
		empobj.printEmployeeMobileNumber(9845324512L);

	}
	
	public void printEmployeeName(String empName, int empId) {
		System.out.println("Employee Name: "+ empName +"&"+"Employee ID : "+ empId);
	}
	
	public void getEmployeeAddress(String empAddress) {
		System.out.println("Address: "+empAddress);
	}
	
	private void printEmployeeSalary(double empSalary) {
		System.out.println("Salary: " + empSalary);
	}
	
	private void printEmployeeMobileNumber(long mobNum) {
		System.out.println("Mobile: " + mobNum);
	}
}
