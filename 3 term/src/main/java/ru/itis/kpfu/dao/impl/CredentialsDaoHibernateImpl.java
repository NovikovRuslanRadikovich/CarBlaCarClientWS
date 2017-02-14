package ru.itis.kpfu.dao.impl;

import org.hibernate.Session;
import ru.itis.kpfu.dao.CredentialsDao;
import ru.itis.kpfu.dao.factory.HibernateConnectionFactory;
import ru.itis.kpfu.model.Credentials;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class CredentialsDaoHibernateImpl implements CredentialsDao {

    public void add(Credentials credentials) {
        Session session = null;
        try {
            session = HibernateConnectionFactory.getSessionFactory().openSession();
            session.beginTransaction();
            session.save(credentials);
            session.getTransaction().commit();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Ошибка при вставке", JOptionPane.OK_OPTION);
        } finally {
            if (session != null && session.isOpen()) {
                session.close();
            }
        }
    }

    public void update(Credentials credentials) {
        Session session = null;
        try {
            session = HibernateConnectionFactory.getSessionFactory().openSession();
            session.beginTransaction();
            session.update(credentials);
            session.getTransaction().commit();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Ошибка при вставке", JOptionPane.OK_OPTION);
        } finally {
            if (session != null && session.isOpen()) {
                session.close();
            }
        }
    }

    public void delete(Long id) {
        Session session = null;
        try {
            session = HibernateConnectionFactory.getSessionFactory().openSession();
            session.beginTransaction();

            Credentials credentials = new Credentials();
            credentials.setId(id);
            session.delete(credentials);
            /*
            2. Credentials credentials = session.load(Credentials.class, id);
                if(credentials != null){
                    session.delete(credentials);
                }
            3. Query query = session.createQuery("delete Credentials where id > :id");
                query.setParameter("id", id);
                query.executeUpdate();
            */
            session.getTransaction().commit();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Ошибка при удалении", JOptionPane.OK_OPTION);
        } finally {
            if (session != null && session.isOpen()) {
                session.close();
            }
        }
    }

    public List findAll() {
        Session session = null;
        List credentials = new ArrayList();
        try {
            session = HibernateConnectionFactory.getSessionFactory().openSession();
            credentials = session.createCriteria(Credentials.class).list();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Ошибка 'findAll'", JOptionPane.OK_OPTION);
        } finally {
            if (session != null && session.isOpen()) {
                session.close();
            }
        }
        return credentials;
    }

    public Credentials findByPrimaryKey(Long id) {
        Session session = null;
        Credentials credentials = null;
        try {
            session = HibernateConnectionFactory.getSessionFactory().openSession();
            credentials = session.get(Credentials.class,id);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Ошибка 'findByPrimaryKey'", JOptionPane.OK_OPTION);
        } finally {
            if (session != null && session.isOpen()) {
                session.close();
            }
        }
        return credentials;
    }
}
