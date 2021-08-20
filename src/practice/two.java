package practice;

public class two extends one {
    private String department;

    public two(String name, String department) {
        super(name);
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }
}

