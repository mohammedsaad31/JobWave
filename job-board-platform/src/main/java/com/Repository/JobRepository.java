package com.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jobboard.model.JobProfile;

@Repository
public interface JobRepository extends JpaRepository<JobProfile, Long>{
}
