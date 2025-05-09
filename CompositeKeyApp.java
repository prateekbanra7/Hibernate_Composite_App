package in.abc.main;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import in.abc.Model.ProgrammerProjectinfo;
import in.abc.Model.ProjectInfo;
import in.abc.util.HibernateUtil;

public class CompositeKeyApp {
	public static void main(String[] args) {

		Session session = null;
		Transaction transaction = null;
		boolean flag = false;

		try {
			session = HibernateUtil.getSession();

			if (session != null)
				transaction = session.beginTransaction();

			if (transaction != null) {
				ProjectInfo info = new ProjectInfo(101, 903);
				ProgrammerProjectinfo projectDetails = new ProgrammerProjectinfo(info, "dhoni", 7, "jee");
				ProjectInfo id = (ProjectInfo) session.save(projectDetails);
				System.out.println("The generated value is :: " + id);
				flag = true;
			}
		} catch (HibernateException e) {
			e.printStackTrace();
		} finally {
			if (flag == true)
				transaction.commit();
			else
				transaction.rollback();

			HibernateUtil.closeSession(session);

		}

	}
}
