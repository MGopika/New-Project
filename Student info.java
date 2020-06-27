//package ProgrammingKnowledge;

import java.util.Scanner;

public class Cons {
	static int rollno;
	static int hgt;
	static int wgt;
	private static int marks;
	static String name;

	Cons(int rollno,String name,int hgt,int wgt,int marks)
	{
		this.rollno=rollno;
		this.name=name;
		this.hgt=hgt;
		this.wgt=wgt;
		this.setMarks(marks);
	}
	void result()
	{
		System.out.println(rollno+" "+name+" "+hgt+" "+wgt+ 
			" "+getMarks());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cons ob[]=new Cons[4];
		Scanner sc=new Scanner(System.in);
		System.out.println("enter rollno: ");
		rollno=sc.nextInt();
		System.out.println("enter name: ");
		name=sc.nextLine();
		System.out.println("enter hgt: ");
		hgt=sc.nextInt();
		System.out.println("enter wgt: ");
		wgt=sc.nextInt();
		System.out.println("enter marks: ");
		setMarks(sc.nextInt());
		
		System.out.println("ROLLNO  NAME HEIGHT  WEIGHT  MARLKS ");
		for(int i=0;i<4;i++)
		{
			ob[i].result();
		}
		System.out.println();
		System.out.println("stdents who got more than 400 marks");
		for(int i=0;i<4;i++)
		{
			if(ob[i].getMarks()>400)
			{
				ob[i].result();
			}
		}
	}
	public static int getMarks() {
		return marks;
	}
	public static void setMarks(int marks) {
		Cons.marks = marks;
	}

}
