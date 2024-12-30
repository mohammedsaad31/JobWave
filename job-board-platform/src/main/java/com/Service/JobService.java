package com.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.batch.BatchProperties.Job;
import org.springframework.stereotype.Service;

import com.Repository.JobRepository;
import com.jobboard.model.JobProfile;


import java.util.List;
import java.util.Optional;

@Service
public class JobService {

    @Autowired
    private static JobRepository jobRepository;
    
        // Create a new job
        public JobProfile createJob(JobProfile jobProfile) {
            return jobRepository.save(jobProfile);
        }
    
        // Get all jobs
        public static List<JobProfile> getAllJobs() {
            return jobRepository.findAll();
    }


    // Get a job by ID
    public Optional<JobProfile> getJobById(Long id) {
        return 
        jobRepository.findById(id);
    }

    // Update a job
    public JobProfile updateJob(Long id, JobProfile updatedJob) {
        return jobRepository.findById(id).map(job -> {
            job.setTitle(updatedJob.getTitle());
            job.setDescription(updatedJob.getDescription());
            job.setCompany(updatedJob.getCompany());
            job.setLocation(updatedJob.getLocation());
            job.setSalary(updatedJob.getSalary());
            return jobRepository.save(job);
        }).orElseThrow(() -> new RuntimeException("Job not found with ID: " + id));
    }

    public JobProfile
        saveJob(JobProfile jobProfile) {
            return
                jobRepository.save(jobProfile);
}

    public static void saveJob(Job job) {
        throw new UnsupportedOperationException("Unimplemented method 'saveJob'");
    }


}



    