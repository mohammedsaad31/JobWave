package com.Controller;

import java.util.List;

import org.springframework.boot.autoconfigure.batch.BatchProperties.Job;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.Service.JobService;
import com.jobboard.model.JobProfile;
@RestController
@RequestMapping("/jobs")

public class JobContoller {
    //Get all Jobs
@GetMapping
public List<JobProfile> getAllJobs(){
    return JobService.getAllJobs();
}
@PostMapping
public String CreateJob(@RequestBody Job job){
    JobService.saveJob(job);
    return" job created successfully";

}
@PutMapping("/{id}")
public String updateJob(@PathVariable int id,@RequestBody Job job){
    Jobservice.updateJob(id,job);
    return "job updaated successfully!";
}

//GETTING A PARTICULAR JOB BY ID
  /*  @GetMapping("/{id}")
    public String getJob(@PathVariable int id){
        return JobServiceById(id);
    }

    @DeleteMapping("/{id}")
    public String deleteJob(@PathVariable int id){
        JobService.deleteJob(id,Job);
        return "job deleted succesfully"; 
        */
    }
