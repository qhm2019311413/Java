
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
		System.out.println("��ѡ�γ�"+ lesson.lessonname+"ѡ�γɹ�"+lesson.lessonname);
	}
	void cancelLesson(Lesson lesson) {
		this.lesson="";
		lesson.map.remove(this.name);
		System.out.println("��ѡ�γ�"+ lesson.lessonname+"�˿γɹ�"+lesson.lessonname);
	}
}
