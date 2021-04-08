package assignments.assignments_3;

public class Question_5 {

	public static void main(String[] args) {
		int inputSecond = 3695;
		int hours, minutes, seconds;
		hours = inputSecond/(60*60);
		minutes = (inputSecond%(60*60))/60;
		seconds = inputSecond%60;

		System.out.println("inputSecond is " + inputSecond);
		System.out.println(hours + " hours, " + minutes + " minutes, " + seconds + " seconds");
	}

}
