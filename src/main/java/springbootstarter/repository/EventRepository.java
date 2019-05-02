package springbootstarter.repository;

import org.springframework.data.repository.CrudRepository;
import springbootstarter.model.Event;

public interface EventRepository extends CrudRepository<Event, String> {
}
