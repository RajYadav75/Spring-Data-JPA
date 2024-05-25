package in.raj.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDate;

@Entity
@Table(name = "emp_tbl")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {
    @Id
    private Integer empID;
    private String empName;
    private Double empSalary;
    private String empGender;
    private String dept;

    private LocalDate dateCreated;
    private LocalDate lastUpdated;



}
