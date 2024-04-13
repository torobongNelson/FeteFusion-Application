package com.fetefusion.FeteFusion.Repository;

import com.fetefusion.FeteFusion.Model.Event;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventRepository extends JpaRepository<Event,Long> {
}
