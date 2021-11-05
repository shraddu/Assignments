import java.lang.annotation.Target;
import java.lang.annotation.*;
import java.lang.reflect.*;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface Info{
	int AuthorId() default 23;
	String Author();
	String Supervisor();
	String Date() default "03/11/2021";
	String Time() default "09:18";
	int Version() default 11;
	String Description();
}
@Info(Author = "", Description = "", Supervisor = "")
class MyClass{
	
}
public class AnnotationInfo{
	public static void main(String[] args) {
		MyClass m = new MyClass();
		
		Class c = m.getClass();
		Annotation an = c.getAnnotation(Info.class);
		Info i = (Info)an;
		System.out.println("AuthorId: "+i.AuthorId());
		System.out.println("Date: "+i.Date());
		System.out.println("Time: "+i.Time());
		System.out.println("Version: "+i.Version());
	}
}