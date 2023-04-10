package com.example.demo_4_10_2023.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Stepan Anfi
 * 4/10/2023
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "jobs")
@Entity
public class Job {
  @Id
  @Column(name = "job_id")
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private String jobId;

  @Column(name = "job_title")
  private String jobTitle;

  @OneToMany(mappedBy = "job", fetch = FetchType.LAZY)
  private List<Employee> employees;
}
