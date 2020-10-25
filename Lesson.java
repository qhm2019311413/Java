import java.util.HashMap;
import java.util.Map;

public class Lesson {
	int number;
	String teachername;
	String lessonplace;
	String date;
	String lessonname;
	Map<String,Boolean> map= new HashMap<String,Boolean>();
	Lesson(int number,String teachername,String lessonplace,String date,String lessonname){
		this.number = number;
		this.lessonplace = lessonplace;
		this.date = date;
		this.lessonname = lessonname;
	}
	
}
