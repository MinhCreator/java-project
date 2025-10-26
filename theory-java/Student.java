import java.util.*;

public class Student {

	//consists of two parts: attributes - methods
	
	String Name;
	Calendar Birthday;
	double Math;
	double Phys;
	double IT;
	// double Aver;
	
    //methods- actions to do for managing students in terms of study
    
    public void Student() {
        this.Name = "";
        // this.Birthday = Calendar().toString();
        this.Math = 0.0;
        this.Phys = 0.0;
        this.IT = 0.0;
    }

    
    public void Student(String name, Calendar birthday, double math, double phys, double it) {
        this.Name = name;
        this.Birthday = birthday;
        this.Math = math;
        this.Phys = phys;
        this.IT = it;
    }

    public void Init_Input() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Input name: ");
		this.Name = sc.next();

		System.out.print("Input Maths score: ");
		this.Math = sc.nextDouble();
		System.out.print("Input Physics score: ");
		this.Phys = sc.nextDouble();
		System.out.print("Input IT score: ");
		this.IT = sc.nextDouble();

	}
	
	
	public void EditName(String newName)
	{
		this.Name = newName;
	}
	public void EditIT(double newIT)
	{
		this.IT = newIT;
	}
	public void Delete()
    {
        Name = "";
        Math = Phys = IT = 0;
    }
	
    public double GetAver()
    {
        return (Math + Phys + IT) / 3;
    }
	
    public int Ranking()
    {
        double avg = GetAver();
        if (avg >= 8.5)
            return 4;
        if (avg >= 7)
            return 3;
        if (avg >= 5.5)
            return 2;
        return 1;
    }
    
    public void display()
	{
		System.out.println(String.format("Student[name = %s,math = %.2f,phys = %.2f,IT = %.2f,average = %.2f,ranking = %d]", Name, Math, Phys, IT, GetAver(), Ranking()));
	}
	
	public static void main(String[] args) {
		Student Dat = new Student();
		Dat.Init_Input();
		Student Khiem = new Student();
		Khiem.Init_Input();

		Dat.display();
		Khiem.display();

		double dat_avg = Dat.GetAver();
		double khiem_avg = Khiem.GetAver();
		if(dat_avg > khiem_avg) System.out.println("Dat's average score is higher");
		else if(dat_avg < khiem_avg) System.out.println("Khiem's average score is higher");
		else System.out.println("Dat and Khiem have equal average score");
	}

    Calendar sd = new Calendar().set(2012, 02, 15);

}