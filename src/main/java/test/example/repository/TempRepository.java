package test.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RestController;
import test.example.domain.Temp;


public interface TempRepository extends JpaRepository<Temp, Long> {
}
