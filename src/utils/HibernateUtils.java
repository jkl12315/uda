package utils;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtils {
	//由于是静态常量配置类，所以我们设置static final
	public static final Configuration cfg;
	public static final SessionFactory sf;
	public int a=0;
	static {
		cfg=new Configuration().configure();
		sf=cfg.buildSessionFactory();
	}
	
	public static Session openSession() {
		return sf.openSession();
	}
	
	public static Session getCurrentSession() {
		return sf.getCurrentSession();
	}
}
