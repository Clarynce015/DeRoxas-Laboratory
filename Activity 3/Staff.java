//package Activity3;

class Staff extends Person {
    private String department;
 
    public Staff(String name, int id, String department) {
        super(name, id);
        this.department = department;
    }
 
    public String getDepartment() {
        return department;
    }
 
    @Override
    public void display() {
        super.display();
        System.out.println("Department: " + department);
    }
   
}