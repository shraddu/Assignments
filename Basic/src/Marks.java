import java.util.Scanner;
public class Marks {
	
	public static void main(String[] args)   
	{  
	Scanner sc=new Scanner(System.in);
	int stu1[]=new int[3];
	int stu2[]=new int[3];
	int stu3[]=new int[3];
	stu1[0]=60;
	stu1[1]=53;
	stu1[2]=64;
	stu2[0]=87;
	stu2[1]=97;
	stu2[2]=67;
	stu3[0]=67;
	stu3[1]=57;
	stu3[2]=87;
	int stu1_total=stu1[0]+stu1[1]+stu1[2]; 
	int stu2_total=stu2[0]+stu2[1]+stu2[2]; 
	int stu3_total=stu3[0]+stu3[1]+stu3[2];
	int stu1_avg=stu1_total/3;
	int stu2_avg=stu2_total/3;
	int stu3_avg=stu3_total/3;
	int all_stu_total_sub1=stu1[0]+stu2[0]+stu3[0];
	int all_stu_total_sub2=stu1[1]+stu2[1]+stu3[1];
	int all_stu_total_sub3=stu1[2]+stu2[2]+stu3[2];
	int all_stu_avg_sub1=all_stu_total_sub1/3;
	int all_stu_avg_sub2=all_stu_total_sub2/3;
	int all_stu_avg_sub3=all_stu_total_sub3/3;
	System.out.println(stu1_total);
	System.out.println(stu2_total);
	System.out.println(stu3_total);
	System.out.println(stu1_avg);
	System.out.println(stu2_avg);
	System.out.println(stu3_avg);
	System.out.println(all_stu_total_sub1);
	System.out.println(all_stu_total_sub2);
	System.out.println(all_stu_total_sub3);
	System.out.println(all_stu_avg_sub1);
	System.out.println(all_stu_avg_sub2);
	System.out.println(all_stu_avg_sub3);
	}
	}