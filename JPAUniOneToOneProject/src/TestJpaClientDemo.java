import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import com.cg.bean.Student;
import com.cg.dao.StudentDAOImpl;


public class TestJpaClientDemo 
{

	public static void main(String[] args) 
	{
		StudentDAOImpl stoDao=new StudentDAOImpl();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Name: ");
		String nm=sc.next();
		Student st = new Student();
		st.setStudName(nm);
		Student stu = stoDao.addStudent(st);
		System.out.println("Data Inserted in the table" +stu);
		System.out.println("Retrive Student based on roll no: ");
		Student student = stoDao.getStudByRollNo(450);
		System.out.println(student);
		System.out.println("Retrive all data and display");
		List<Student> stList=stoDao.getAllStudents();
		Iterator<Student> it = stList.iterator();
		System.out.println("RollNo\t\t STUNAME");
		while(it.hasNext()){
			Student tempStu = it.next();
			System.out.println(tempStu.getRollNo()+"\t\t"+
			tempStu.getStudName());
		}
		System.out.println("........Delete.........");
		System.out.println("Deleter 4 rollno ");
		System.out.println("RecordDeleted for : "+
		stoDao.deleteStudent(3));
		
		System.out.println("........Update Name.........");
		Student st2 = stoDao.updateStudentName(450, "dinesh");
		System.out.println(" Updated :"+st2);
		
	}

}
