package aufgaben.aufgabe7_nochmal;

public class Testklasse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 final int NR_OF_STUDENTS = 5;
	        Slack slack = new Slack();

	        Student[] students = new Student[NR_OF_STUDENTS];
	        Character c = 'A';
	        for(int index=0; index < students.length; index++)
	        {
	            students[index] = new Student(c.toString());
	            c++;
	            students[index].setPublisher(slack);
	        }
	        slack.publishNews();

	        System.out.println();
	        students[1].removePublisher(slack);
	        students[3].removePublisher(slack);
	        System.out.println();
	        slack.publishNews();

	        System.out.println();
	        students[1].setPublisher(slack);
	        students[2].removePublisher(slack);
	        students[4].removePublisher(slack); 
	        System.out.println();
	        slack.publishNews();

	        System.out.println();
	        students[0].removePublisher(slack);
	        students[1].removePublisher(slack);
	        students[3].setPublisher(slack);
	        System.out.println();
	        slack.publishNews();
	}

}
