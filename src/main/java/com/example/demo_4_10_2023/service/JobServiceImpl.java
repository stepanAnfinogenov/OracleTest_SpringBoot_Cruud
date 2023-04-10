package com.example.demo_4_10_2023.service;

import com.example.demo_4_10_2023.repository.JobRepository;
import com.example.demo_4_10_2023.entity.Job;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

/**
 * @author Stepan Anfi
 * 4/10/2023
 */
@Service
public class JobServiceImpl implements JobService {
  @Autowired
  private JobRepository jobRepository;

  @Override
  public Job findJobById(String id) {
    Optional<Job> job = jobRepository.findById(id);

    return job.get();
  }
}
