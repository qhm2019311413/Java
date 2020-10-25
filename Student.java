
public class Student extends Personnel{
	int number;
	String name;
	String sex;
	String lesson;
	Student(int number,String name,String sex){
		super(number,name,sex);
	}
	void chooseLesson(Lesson lesson) {
		this.lesson=lesson.lessonname;
		lesson.map.put(this.name, true);
		System.out.println("所选课程"+ lesson.lessonname+"选课成功"+lesson.lessonname);
	}
	void cancelLesson(Lesson lesson) {
		this.lesson="";
		lesson.map.remove(this.name);
		System.out.println("所选课程"+ lesson.lessonname+"退课成功"+lesson.lessonname);
	}
}
