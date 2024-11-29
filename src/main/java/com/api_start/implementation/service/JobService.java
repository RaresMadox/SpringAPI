package com.api_start.implementation.service;

import com.api_start.implementation.model.Job;
import com.api_start.implementation.repository.JobRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class JobService {

    @Autowired
    private JobRepository jobRepository;

    public List<Job> getAllJobs() {
        return jobRepository.findAll();
    }

    public Optional<Job> getJobById(Long id) {
        return jobRepository.findById(id);
    }

    public Job saveJob(Job job) {
        return jobRepository.save(job);
    }

    public void deleteJob(Long id) {
        jobRepository.deleteById(id);
    }

    public Job updateJob(Long id, Job jobDetails) {
        Job job = jobRepository.findById(id).orElseThrow();
        job.setName(jobDetails.getName());
        job.setType(jobDetails.getType());
        return jobRepository.save(job);
    }

    public Job addEmplyeJob(Long id) {
        Job job = jobRepository.findById(id).orElseThrow();
        job.addEmploye();
        return jobRepository.save(job);
    }

}
