package hei.school.soratra.repository;

import hei.school.soratra.repository.model.Soratra;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DummySoratraRepository extends JpaRepository<Soratra,String> {
}
