package test;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.junit.Test;

import pojo.Student;
import utils.HibernateUtils;

public class HibernateTest {

	@Test
	public void testselect() {
		Session session = HibernateUtils.getCurrentSession();
		Transaction transaction = session.beginTransaction();
		Student student = session.get(Student.class, 1);
		System.out.println(student);
		transaction.commit();
	}
	@Test
	public void testDelete() {
		Session session = HibernateUtils.getCurrentSession();
		Transaction transaction = session.beginTransaction();
		Student student = session.get(Student.class, 1);
		System.out.println(student);
		if (student!=null) {
			session.delete(student);
		}
		transaction.commit();
	}
}
