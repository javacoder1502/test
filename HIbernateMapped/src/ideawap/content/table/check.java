package ideawap.content.table;

import ideawap.content.utility.HibernateUtil;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.jboss.jandex.Main;

public class check {

	
	public static void main(String[] args) {
		
		Session session  = HibernateUtil.getSessionFactory().openSession();

		Content c  =  new Game();
		Criteria cr = session.createCriteria(Content.class);


		session.createCriteria(Content.class).list();
	}

}
