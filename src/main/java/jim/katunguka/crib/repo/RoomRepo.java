package jim.katunguka.crib.repo;

import jim.katunguka.crib.model.Room;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoomRepo extends MongoRepository<Room, Long> {
}
