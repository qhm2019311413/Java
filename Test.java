
public class Test {
	public static void main(String[] args) {
		Student student =new Student(1,"ming","male");
		Lesson lesson = new Lesson(1,"Wang","101","11��1��15ʱ","�ߵ���ѧ");
		Teachers setlesson = new Teachers(1,"Wang","female","�ߵ���ѧ");
		student.chooseLesson(lesson);
		setlesson.setLesson(lesson);
		
	}
}
