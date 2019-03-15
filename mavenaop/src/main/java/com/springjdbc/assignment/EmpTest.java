package com.springjdbc.assignment;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmpTest {

	public static void main(String[] args) {
	
		ApplicationContext c=new ClassPathXmlApplicationContext("employee.xml");
		Employee e=new Employee();
        e.setEmpno(1114);
        e.setEname("koormisha");
        e.setJob("Manager");
        e.setMgr(0);
        e.setSal(40000);
        e.setComm(0);
        e.setDeptno(21);
        
        EmployeeDao d=(EmployeeDao)c.getBean("edao");
        //d.insert(e);
        //d.delete(e);
     // System.out.println("orderby" + d.OrderBy(e));
      //  System.out.println("groupby" + d.GroupBy(e));
        
    EmployeeServicesImpl ser=new EmployeeServicesImpl();
     // ser.updateEmpSal(e);
      
      ser.getMaxSal();
      
    //  ser.getWithoutComm();
//         List<Employee> list= d.getAll();
//       
//        for(Employee e1:list)
//      {
//        	 System.out.println(e1);
//         }
//        List<Employee> list1=d.OrderBy();
//        for(Employee e1:list1)
//        {
//        	System.out.println(e1);
//        }
//        List<Employee> list2=d.OrderBy();
//        for(Employee e1:list2)
//        {
//        	System.out.println(e1);
//        }
	}

	}


