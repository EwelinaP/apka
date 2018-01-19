package pl.apka.data;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.apka.model.Person;

import java.util.List;

@Repository
public interface PersonRepository extends JpaRepository<Person,Long> {
    List<Person> findAllByImie(String imie);

}
