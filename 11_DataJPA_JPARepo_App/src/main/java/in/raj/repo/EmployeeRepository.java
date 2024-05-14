package in.raj.repo;

import in.raj.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee,Integer> {
    @Query(value = "select * from emp_tbl", nativeQuery = true)
    public List<Employee> getEmps();
}
