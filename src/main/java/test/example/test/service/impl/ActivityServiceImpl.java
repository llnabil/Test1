package test.example.test.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import test.example.test.dto.ActivityDTO;
import test.example.test.entity.Activity;
import test.example.test.repository.ActivityRepository;
import test.example.test.service.ActivityService;

import java.util.List;
import java.util.stream.Collectors;


@Service
public class ActivityServiceImpl implements ActivityService {
    @Autowired
    private ActivityRepository activityRepository;

    @Override
    public ActivityDTO createActivity(ActivityDTO activityDTO) {
        // Convert DTO to Entity
        Activity activity = new Activity();
        activity.setName(activityDTO.getName());
        activity.setDescription(activityDTO.getDescription());
        activity.setLocation(activityDTO.getLocation());
        activity.setDate(activityDTO.getDate());

        // Save Entity
        Activity savedActivity = activityRepository.save(activity);

        // Convert back to DTO and return
        return mapToDTO(savedActivity);
    }

    @Override
    public ActivityDTO getActivityById(Long id) {
        Activity activity = activityRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Activity not found"));

        return mapToDTO(activity);
    }

    @Override
    public List<ActivityDTO> getAllActivities() {
        List<Activity> activities = activityRepository.findAll();

        return activities.stream()
                .map(this::mapToDTO)
                .collect(Collectors.toList());
    }

    @Override
    public ActivityDTO updateActivity(Long id, ActivityDTO activityDTO) {
        Activity activity = activityRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Activity not found"));

        activity.setName(activityDTO.getName());
        activity.setDescription(activityDTO.getDescription());
        activity.setLocation(activityDTO.getLocation());
        activity.setDate(activityDTO.getDate());

        Activity updatedActivity = activityRepository.save(activity);
        return mapToDTO(updatedActivity);
    }

    @Override
    public void deleteActivity(Long id) {
        activityRepository.deleteById(id);
    }

    private ActivityDTO mapToDTO(Activity activity) {
        ActivityDTO dto = new ActivityDTO();
        dto.setId(activity.getId());
        dto.setName(activity.getName());
        dto.setDescription(activity.getDescription());
        dto.setLocation(activity.getLocation());
        dto.setDate(activity.getDate());
        return dto;
    }

}
