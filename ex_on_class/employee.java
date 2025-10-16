class employee {

    int ID;
    String name;
    int age;
    double salary;
    double rate;

    // employee(int id, String Name, int Age, double Salary, double Rate) {
    // this.ID = id;
    // this.name = Name;
    // this.age = Age;
    // this.salary = Salary;
    // this.rate = Rate;
    // 
    // }
    public void setId(int id) {
        this.ID = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    public void setRate(double rate) {
        this.rate = rate;
    }
    
    public int getId() {
        return this.ID;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public double getSalary() {
        return this.salary;
    }

    public double getRate() {
        return this.rate;
    }

    double rate_salary() {
        return this.getRate() * 185000;
    }

    public static void main(String[] args) {
        employee employer = new employee();
        employer.setName("test");
        employer.setSalary(3000);
        employer.setRate(2.3);
        System.out.println(employer.rate_salary());
    }

}
