import java.util.List;

import javax.persistence.EntityManager;

import com.cg.bean.Address;
import com.cg.bean.Student;
import com.cg.dao.StudentDAOImpl;
import com.cg.util.JPAUtil;

public class TestStuOneToOneClient 
{
	
	static EntityManager em = null;
	public static void main(String[] args) 
	{
		StudentDAOImpl stuDao = new StudentDAOImpl();
		em=JPAUtil.getEntityManager();
		
		Address address1=new Address();
		address1.setCity("Kolkata");
		address1.setState("WB");
		address1.setStreet("abc");
		address1.setZipCode("498022");
		
		
		Address address2=new Address();
		address2.setCity("Chennai");
		address2.setState("TN");
		address2.setStreet("pqr");
		address2.setZipCode("200874");
		
		Student st1 = new Student();
		st1.setStudName("Mehvash");
		st1.setStuAdd(address1);
		
		Student st2 = new Student();
		st2.setStudName("Swastika");
		st2.setStuAdd(address2);
		
		stuDao.addStudent(st1);
		stuDao.addStudent(st2);
		System.out.println("Both students are added!!");
		System.out.println("---------------------------");
		List stList = stuDao.getAllStudents();
		System.out.println(stList);
	}

}
