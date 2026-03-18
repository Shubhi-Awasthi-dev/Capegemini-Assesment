package com.cg;

import com.cg.entity.Employee;
import com.cg.repo.IEmployeeRepo;
import com.cg.service.EmployeeService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.time.LocalDate;

@SpringBootApplication
public class SpringDataApp2Application {

	public static void main(String[] args) {

		ApplicationContext ctx=SpringApplication.run(SpringDataApp2Application.class, args);
//		IEmployeeRepo erepo = ctx.getBean(IEmployeeRepo.class);
//		erepo.save(new Employee("John Doe", LocalDate.of(1990, 1, 1), 50000));
//		System.out.println("Employee saved successfully!");
		EmployeeService es=ctx.getBean(EmployeeService.class);

		//System.out.println(es.createEmployee(new Employee("Shubhi", LocalDate.of(1998, 10, 10), 60000)));
	    es.getAllEmployees().forEach(employee -> System.out.println(employee));

		System.out.println(es.getEmployeeById(1));

		//Employee emp = new Employee("Shubhi Updated", LocalDate.of(1998,10,10),70000);
//		System.out.println(es.updateEmployee(emp));

		System.out.println(es.removeEmployeeById(1));

		Employee e=es.getEmployeeById(1);
		if(e!=null){
			e.setDob(LocalDate.of(1998,10,10));
			System.out.println(es.updateEmployee(e));
		}else{
			System.out.println("Employee not found ");
		}

	}



}
