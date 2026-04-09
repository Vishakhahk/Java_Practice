package HOME;

public class Employee {

    int empId;
    String eName;
    String eEmail;
    String eAddress;

    // Getter and Setter methods
    public int getEmpId() {
        return empId;
    }
    public void setEmpId(int empId) {
        this.empId = empId;
    }
    public String getEName() {
        return eName;
    }
    public void setEName(String eName) {
        this.eName = eName;
    }
    public String getEEmail() {
        return eEmail;
    }
    public void setEEmail(String eEmail) {
        this.eEmail = eEmail;
    }
    public String getEAddress() {
        return eAddress;
    }
    public void setEAddress(String eAddress) {
        this.eAddress = eAddress;
    }

    public void display() {
    	System.out.println("Good Morning to all the Employees");
        System.out.println("Employee id: " + empId);
        System.out.println("Employee name: " + eName);
        System.out.println("Employee email: " + eEmail);
        System.out.println("Employee address: " + eAddress);
        System.out.println("Have a greate day dear "+eName);
    }
}
