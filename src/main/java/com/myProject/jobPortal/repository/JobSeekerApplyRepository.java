package com.myProject.jobPortal.repository;


import com.myProject.jobPortal.entity.JobPostActivity;
import com.myProject.jobPortal.entity.JobSeekerApply;
import com.myProject.jobPortal.entity.JobSeekerProfile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface JobSeekerApplyRepository extends JpaRepository<JobSeekerApply, Integer> {

    List<JobSeekerApply> findByUserId(JobSeekerProfile userId);

    List<JobSeekerApply> findByJob(JobPostActivity job);
}