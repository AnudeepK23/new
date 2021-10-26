package net.javaguides.springboot;

import net.javaguides.springboot.model.Employee;
import net.javaguides.springboot.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootBackendApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootBackendApplication.class, args);
	}

	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public void run(String... args) throws Exception {
		Employee employee = new Employee();
		employee.setFirstName("Anudeep");
		employee.setLastName("Reddy");
		employee.setEmailId("anudeep12@gmail.com");
		employeeRepository.save(employee);

		Employee employee1 = new Employee();
		employee1.setFirstName("Rocky");
		employee1.setLastName("Yash");
		employee1.setEmailId("yash34@gmail.com");
		employeeRepository.save(employee);

	}








}



