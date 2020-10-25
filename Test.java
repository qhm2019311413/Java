
public class Test {
	public static void main(String[] args) {
		Student student =new Student(1,"ming","male");
		Lesson lesson = new Lesson(1,"Wang","101","11月1日15时","高等数学");
		Teachers setlesson = new Teachers(1,"Wang","female","高等数学");
		student.chooseLesson(lesson);
		setlesson.setLesson(lesson);
		
	}
}
