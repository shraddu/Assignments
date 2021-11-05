import java.lang.annotation.Target;
import java.lang.annotation.*;
import java.lang.reflect.*;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@interface Test{
	String testcase();
}


class Test1{
	@Test(testcase="Just an Annotation")
	public void Hello(){
		System.out.println("Hello Annotation");
	}
}
public class AnnotationTest {

	public static void main(String[] args) throws Exception{
		Test1 t = new Test1();
		Method m = t.getClass().getMethod("Hello");
		Annotation an = m.getAnnotation(Test.class);
		Test t1 = (Test)an;
		System.out.println(t1.testcase());
		

	}

}