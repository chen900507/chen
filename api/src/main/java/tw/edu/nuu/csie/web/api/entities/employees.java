package tw.edu.nuu.csie.web.api.entities;


import lombok.Data;

import javax.persistence.*;

@Table(name = "employees")
@Entity
@Data
public class employees {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "employees_id")
    private Long username;

    @Column(name = "username")
    private String userName;

    @Column(name = "password")
    private String password;

    @Column(name = "department")
    private String department;

    @Column(name = "job_title")
    private String jobTitle;

    @Column(name = "nid")
    private String nid;

}
