public class EmpWageComputation {
	final static int WAGE_PER_HOUR=20;
	static int dailyWage=0;
	static int workHours=0;
	public static void main(String[] args) {
		int attendence=(int)(Math.random()*2);
		if(attendence==1)
			System.out.println("Employee is Present");
			workHours=8;
			dailyWage=workHours*WAGE_PER_HOUR;
		else
			System.out.println("Employee is Absent");
		System.out.println("Daily Wage of an Employee "+dailyWage);

	}

}



