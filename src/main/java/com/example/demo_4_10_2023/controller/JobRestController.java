package com.example.demo_4_10_2023.controller;

import com.example.demo_4_10_2023.entity.Job;
import com.example.demo_4_10_2023.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Stepan Anfi
 * 4/10/2023
 */

@RestController
@RequestMapping("/api")
public class JobRestController {
  @Autowired
  private JobService jobService;

  @GetMapping("/jobs/{id}")
  public Job findJobById(@PathVariable String id) {
    return jobService.findJobById(id);
  }
}
