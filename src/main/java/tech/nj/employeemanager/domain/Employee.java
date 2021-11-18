package tech.nj.employeemanager.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Employee implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "employee_id", updatable = false, nullable = false)
    private Long id;
    private String name;
    private String email;
    private String jobTitle;
    private String phoneNumber;
    private String imageUrl;

    @Column(name = "employee_code", updatable = false, nullable = false)
    private String employeeCode;
}
