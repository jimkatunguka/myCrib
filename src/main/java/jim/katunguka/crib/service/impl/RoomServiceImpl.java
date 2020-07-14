package jim.katunguka.crib.service.impl;

import jim.katunguka.crib.model.Room;
import jim.katunguka.crib.repo.RoomRepo;
import jim.katunguka.crib.service.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoomServiceImpl implements RoomService {
    @Autowired
    RoomRepo repo;

    @Override
    public Room addRoom(Room r) {
        return repo.save(r);
    }

    @Override
    public List<Room> getAll() {
        return repo.findAll();
    }
}
