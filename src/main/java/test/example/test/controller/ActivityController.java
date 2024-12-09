package test.example.test.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import test.example.test.dto.ActivityDTO;
import test.example.test.service.ActivityService;

import java.util.List;

@RestController
@RequestMapping("/api/activities") // Base URL
public class ActivityController {

    @Autowired
    private ActivityService activityService;

    // Define endpoints here
    @PostMapping
    public ResponseEntity<ActivityDTO> createActivity(@RequestBody ActivityDTO activityDTO) {
        ActivityDTO createdActivity = activityService.createActivity(activityDTO);
        return ResponseEntity.ok(createdActivity);
    }
    @GetMapping
    public ResponseEntity<List<ActivityDTO>> getAllActivities() {
        List<ActivityDTO> activities = activityService.getAllActivities();
        return ResponseEntity.ok(activities);
    }
    @GetMapping("/{id}")
    public ResponseEntity<ActivityDTO> getActivityById(@PathVariable Long id) {
        ActivityDTO activity = activityService.getActivityById(id);
        return ResponseEntity.ok(activity);
    }
    @PutMapping("/{id}")
    public ResponseEntity<ActivityDTO> updateActivity(@PathVariable Long id, @RequestBody ActivityDTO activityDTO) {
        ActivityDTO updatedActivity = activityService.updateActivity(id, activityDTO);
        return ResponseEntity.ok(updatedActivity);
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteActivity(@PathVariable Long id) {
        activityService.deleteActivity(id);
        return ResponseEntity.noContent().build(); // HTTP 204: No Content
    }


}
