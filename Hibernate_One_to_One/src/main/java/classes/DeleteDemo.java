package classes;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class DeleteDemo {
    public static void main(String[] args){

        SessionFactory factory = new Configuration()
                                    .configure("hibernate.cfg.xml")
                                    .addAnnotatedClass(Instructor.class)
                                    .addAnnotatedClass(InstructorDetail.class)
                                    .buildSessionFactory();
        Session session = factory.getCurrentSession();


        try{


            session.beginTransaction();


            session.getTransaction().commit();
            System.out.println("Done");

        }

        finally{
            factory.close();
        }
    }

}
