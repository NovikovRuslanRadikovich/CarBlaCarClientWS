package ru.itis.kpfu.dao.impl;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import ru.itis.kpfu.dao.EmployeeDao;
import ru.itis.kpfu.dao.factory.HibernateConnectionFactory;
import ru.itis.kpfu.model.Employee;

import java.util.ArrayList;
import java.util.List;

public class EmployeeDaoImpl implements EmployeeDao {
    public void add(Employee employee) {
        Session session = null;
        try {
            session = HibernateConnectionFactory.getSessionFactory().openSession();
            session.beginTransaction();
            session.save(employee);
            session.getTransaction().commit();
        } catch (Exception e) {
            System.out.println("Произошла ошибка при сохранении employee с id = " + employee.getId());
        } finally {
            if (session != null && session.isOpen()) {
                session.close();
            }
        }
    }

    public List<Employee> findByProject(Long projectId) {
        List<Employee> employees = new ArrayList<Employee>();
        Session session = null;
        try {
            session = HibernateConnectionFactory.getSessionFactory().openSession();

            //HQL
//            String hql = "select e from Employee e join e.projects p where p.id = :projectId";
//            Query query = session.createQuery(hql);
//            query.setParameter("projectId", projectId);
//            employees = query.list();

            Criteria criteria = session.createCriteria(Employee.class, "employee")
                    .createAlias("projects", "projects")
                    .add(Restrictions.eq("projects.id", projectId));
            employees = criteria.list();
        } catch (Exception e) {
            System.out.println("Произошла ошибка при выполнении метода findByProject");
        } finally {
            if (session != null && session.isOpen()) {
                session.close();
            }
        }
        return employees;
    }
}
