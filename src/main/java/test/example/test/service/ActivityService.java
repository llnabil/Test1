package test.example.test.service;

import test.example.test.dto.ActivityDTO;

import java.util.List;

public interface ActivityService {
    ActivityDTO createActivity(ActivityDTO activityDTO);
    ActivityDTO getActivityById(Long id);
    List<ActivityDTO> getAllActivities();
    ActivityDTO updateActivity(Long id, ActivityDTO activityDTO);
    void deleteActivity(Long id);

}
