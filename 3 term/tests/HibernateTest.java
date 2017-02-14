import ru.itis.kpfu.dao.CredentialsDao;
import ru.itis.kpfu.dao.EmployeeDao;
import ru.itis.kpfu.dao.impl.EmployeeDaoImpl;
import ru.itis.kpfu.model.Credentials;
import ru.itis.kpfu.model.Employee;
import ru.itis.kpfu.model.Project;

import java.util.List;
import java.util.Map;

public class HibernateTest {
    public static void main(String[] args) {
//        CredentialsDao credentialsDao = new CredentialsDaoHibernateImpl();
//
//        testCredentialsFindAll(credentialsDao);
//        testCredentialsUpdateById(credentialsDao, 3l);

        EmployeeDao employeeDao = new EmployeeDaoImpl();
        for (int i=1; i<=5; i++){
            employeeDao.add(testEmployee(i));
        }
        for (Employee e : employeeDao.findByProject(4l)) {

            System.out.println(e);
        };
    }

    private static void testCredentialsUpdateById(CredentialsDao credentialsDao, long id) {
        Credentials credentials = credentialsDao.findByPrimaryKey(id);
        credentials.setLogin("3tset");
        credentialsDao.update(credentials);
        System.out.println("Updated credentials");
        System.out.println(credentials.getId() + " " + credentials.getLogin()
                + " " + credentials.getPassword());

    }
    private static Credentials testCredentials(int i){
        Credentials credentials = new Credentials();
        credentials.setLogin("test" + i);
        credentials.setPassword("test" + i*2);

        return credentials;
    }
    private static void testCredentialsFindAll(CredentialsDao credentialsDao){
        for (int i = 0; i < 5; i++) {
            credentialsDao.add(testCredentials(i));
        }
        List<Credentials> all = credentialsDao.findAll();
        for (Credentials credentials : all) {
            System.out.println("get all credentials");
            System.out.println(credentials.getId() + " " + credentials.getLogin());
        }
    }

    private static Employee testEmployee(int i){
        Employee employee = new Employee();
        employee.setName("Anonymous" + i);

        Project project1 = new Project();
        project1.setName("Facebook");

        Project project2 = new Project();
        project2.setName("Yandex");

        if(i%2 == 0){
            employee.addProject(project1);
        }else {
            employee.addProject(project2);
        }


        return employee;
    }
}
