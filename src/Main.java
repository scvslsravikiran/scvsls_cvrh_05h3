import java.text.SimpleDateFormat;

public class Main {

	public static void main(String[] args) throws java.text.ParseException {
		
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
		
		Student Ravi = new Student(145, "Ravi Kiran", formatter.parse("1997-03-25"), 8.2);
		Student Rama = new Student(132, "Rama Chandra", formatter.parse("2005-05-05"), 5.8);
		Student Naik = new Student(113, "Naik Praveen", formatter.parse("2012-10-17"), 2.7);
		Student Nag = new Student(184, "Nag Raju", formatter.parse("2007-02-10"), 4.5);
		Student Sai = new Student(102, "Sai Teja", formatter.parse("2014-01-05"), 1.2);
		Student Krishna = new Student(105, "Krishna Rama", formatter.parse("2017-10-10"), 8.9);
		StudentGroup Group = new StudentGroup(5);
		Group.setStudent(Rama,0);
		Group.setStudent(Naik,1);
		Group.setStudent(Nag,2);
		Group.setStudent(Sai,3);
		Group.setStudent(Krishna,4);
		Group.add(Ravi,3);
		
		Student a = Group.getNextStudent(Krishna);
	
		System.out.println(Group.getStudent(4));
		System.out.println(Group.getCurrentAgeByDate(1));
		
   }

}

