package com.telusko.OnetoOne1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public class App 
{
    public static void main( String[] args )
    {
        License license = new License();
        license.setLid(1001);
        license.setLstate("AP");
        
        Employee emp = new Employee();
        emp.setName("Vomesh");
        emp.setEmpid(1);
        emp.setLicense(license);
        
        Configuration config = new Configuration().configure().addAnnotatedClass(Employee.class).addAnnotatedClass(License.class);
        ServiceRegistry reg = new ServiceRegistryBuilder().applySettings(config.getProperties()).buildServiceRegistry();
        SessionFactory sf = config.buildSessionFactory(reg);
        Session session = sf.openSession(); 
        
        session.beginTransaction();
        
        session.save(license);
        session.save(emp);
        
        session.getTransaction().commit();    
        
    }
}
