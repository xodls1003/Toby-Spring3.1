package springbook.user.dao;

import java.sql.SQLException;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class UserDaoConnectionCountingTest {
	public static void main(String[] args) throws ClassNotFoundException,
	SQLException{
	AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext (CountingDaoFactory.class);
	UserDao dao = context.getBean("userdao", UserDao.class);
	
	//DAO 사용 코드
	
	CountingConnectionMaker ccm = context.getBean("connectionMaker", CountingConnectionMaker.class);
	
	System.out.println("Connectioncounter: "+ccm.getCounter()) ;
	
	}
		
}

