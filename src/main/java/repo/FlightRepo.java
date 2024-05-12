package repo;


import entity.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FlightRepo extends JpaRepository<Flight, Long> {
    List<Flight> findAllByStatus(FlightStatus status);

    List<Flight> findByStatusIn(List<FlightStatus> statuses);
}