package com.example.demo_4_10_2023.service;

import com.example.demo_4_10_2023.entity.Job;

/**
 * @author Stepan Anfi
 * 4/10/2023
 */

public interface JobService {
  Job findJobById(String id);
}
