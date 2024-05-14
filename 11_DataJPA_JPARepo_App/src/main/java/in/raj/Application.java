package in.raj;

import in.raj.entity.Employee;
import in.raj.repo.EmployeeRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;

import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
        EmployeeRepository repository = context.getBean(EmployeeRepository.class);
//        System.out.println(repository.getClass().getName());

       /* Employee employee1 = new Employee(1,"Raj",5000.00,"Male","Sales");
        Employee employee2 = new Employee(2,"Rani",15000.00,"Female","Admin");
        Employee employee3 = new Employee(3,"Deepak",25000.00,"Male","Marketing");
        Employee employee4 = new Employee(4,"Yash",53000.00,"Male","Account");
        Employee employee5 = new Employee(5,"Baba",45000.00,"Male","HR");
        Employee employee6 = new Employee(6,"Yaga",55000.00,"Male","Manager");*/
//        repository.save(employee1);
//        repository.saveAll(Arrays.asList(employee1,employee2,employee3,employee4,employee5,employee6));
//        Sort ascending = Sort.by("empName").ascending();
//        Sort descending = Sort.by("empSalary").descending();
//        Sort orders = Sort.by("empName","empSalary").descending();
//        List<Employee> employeeList = repository.findAll();
//        List<Employee> employeeList = repository.findAll(ascending);
//        List<Employee> employeeList = repository.findAll(descending);
//        List<Employee> employeeList = repository.findAll(orders);
//        System.out.println(employeeList);
//        employeeList.forEach(System.out::println);
//        System.out.println("---------->>Record Saved>>-------------");
//        System.out.println("---------->>Pagination>>-------------");
//        int pageNo = 1;
//        PageRequest page = PageRequest.of(pageNo-1,3);
//
//        Page<Employee> findall = repository.findAll(page);
//        List<Employee> emps = findall.getContent();
//
//        emps.forEach(System.out::println);

        Employee emp = new Employee();
        emp.setEmpGender("Male");
        emp.setDept("Sales");

        Example<Employee> of = Example.of(emp);
        List<Employee> emps = repository.findAll(of);

        emps.forEach(System.out::println);


    }

}
