package kafka_springboot.repository;

import kafka_springboot.entity.WikimediaData;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WikiMediaDataRepo extends JpaRepository<WikimediaData, Long> {
}
