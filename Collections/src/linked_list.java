import java.time.LocalDate;
import java.util.*;
public class linked_list {
	public static void main(String args[]) {
		LinkedList<LocalDate>l1=new LinkedList<LocalDate>();
		LinkedList<Integer>l2=new LinkedList<Integer>();
		LocalDate l11 = LocalDate.of(2010, 12, 13);
		if(l11.isLeapYear()) {
			l2.add(1);
		}
		else
			l2.add(0);
		LocalDate l12 = LocalDate.of(2004, 12, 13);
		if(l12.isLeapYear()) {
			l2.add(1);
		}
		else
			l2.add(0);
		LocalDate l13 = LocalDate.of(2013, 12, 13);
		if(l13.isLeapYear()) {
			l2.add(1);
		}
		else
			l2.add(0);
		LocalDate l14 = LocalDate.of(2014, 12, 13);
		if(l14.isLeapYear()) {
			l2.add(1);
		}
		else
			l2.add(0);
		LocalDate l15 = LocalDate.of(2016, 12, 13);
		if(l15.isLeapYear()) {
			l2.add(1);
		}
		else
			l2.add(0);
		l1.add(l11);
		l1.add(l12);
		l1.add(l13);
		l1.add(l14);
		l1.add(l15);
		for(int i=0;i<l2.size();i++) {
			int j=l2.get(i);
			if(j==1)
				System.out.println("\nyour date of birth :"+l1.get(i)+" \ncongratulations!!! buddy its leap year.....");
			else
				if(j==0)
				System.out.println("\nyour date of birth :"+l1.get(i)+"\nnot a leap year");
	}

}
}
