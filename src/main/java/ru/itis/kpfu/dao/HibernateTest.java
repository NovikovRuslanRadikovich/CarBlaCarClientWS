package ru.itis.kpfu.dao;

import ru.itis.kpfu.dao.impl.CredentialsDaoHibernateImpl;
import ru.itis.kpfu.model.Credentials;

import java.util.List;

public class HibernateTest {
    public static void main(String[] args) {
        CredentialsDao credentialsDao = new CredentialsDaoHibernateImpl();
        for (int i = 0; i < 5; i++) {
            credentialsDao.add(testCredentials(i));
        }
        List<Credentials> all = credentialsDao.findAll();
        for (Credentials credentials : all) {
            System.out.println("get all credentials");
            System.out.println(credentials.getId() + " " + credentials.getLogin());
        }

        Credentials credentials = credentialsDao.findByPrimaryKey(3l);
        credentials.setLogin("3tset");
        credentialsDao.update(credentials);
        System.out.println("Updated credentials");
        System.out.println(credentials.getId() + " " + credentials.getLogin()
                + " " + credentials.getPassword());

        credentialsDao.delete(credentials.getId());

        List<Credentials> credentials1 = credentialsDao.findAll();
        for (Credentials credential : credentials1) {
            System.out.println(credentials.getId() + " " + credentials.getLogin());
        }

    }

    private static Credentials testCredentials(int i){
        Credentials credentials = new Credentials();
        credentials.setLogin("test" + i);
        credentials.setPassword("test" + i*2);

        return credentials;
    }
}
