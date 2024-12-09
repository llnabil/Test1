package test.example.test.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import test.example.test.entity.Activity;

public interface ActivityRepository extends JpaRepository<Activity, Long> {
}
