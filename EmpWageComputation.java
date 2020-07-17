 public class EmpWageComputation {
	final static int WAGE_PER_HOUR=20;
	static int dailyWage=0;
	static int workHours=0;
	public static int ComputeDailyWage(int hours) {
		return hours*WAGE_PER_HOUR;
	}
	public static void main(String[] args) {
		int attendence=(int)(Math.random()*3);
		if(attendence==1)
			System.out.println("Employee is Present full time");
			workHours=8;
			dailyWage=ComputeDailyWage(workHours);;
	}
		else if(attendence==1) {
			System.out.println("Employee is Present for Part Time");
			workHours=4;
			dailyWage=ComputeDailyWage(workHours);;
		}
		else
			System.out.println("Employee is Absent");
		System.out.println("Daily Wage of an Employee "+dailyWage);

	}

}



