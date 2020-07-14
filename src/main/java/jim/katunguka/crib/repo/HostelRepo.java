package jim.katunguka.crib.repo;

import jim.katunguka.crib.model.Hostel;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HostelRepo extends MongoRepository<Hostel, Long> {
}
