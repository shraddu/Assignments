import java.lang.annotation.Target;
import java.lang.annotation.*;
import java.lang.reflect.*;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)

@interface Execute{
	int Sequence();
}
class demo{
	@Execute(Sequence=2)
	public void MyMethod1() {
		System.out.println("In Method1 giving priority to Sequence 2");
	}
	@Execute(Sequence=1)
	public void MyMethod2() {
		System.out.println("In Method2 giving priority to Sequence 1");
	}
	@Execute(Sequence=3)
	public void MyMethod3() {
		System.out.println("In Method3 giving priority to Sequence 3");
	}
}
public class AnnotationExecute {

	public static void main(String[] args) throws Exception  {
		demo d = new demo();
		
		Method m = d.getClass().getMethod("MyMethod1");
		Annotation an = m.getAnnotation(Execute.class);
		Execute e = (Execute)an;
		System.out.println(e.Sequence());

	}

}