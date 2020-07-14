package jim.katunguka.crib.service;

import jim.katunguka.crib.model.Room;

import java.util.List;

public interface RoomService {
    public Room addRoom(Room r);
    public List<Room> getAll();
}
