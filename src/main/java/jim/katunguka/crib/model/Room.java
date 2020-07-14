package jim.katunguka.crib.model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Rooms")
public class Room {
    private long roomId;
    private RoomType roomType;
    private String description;

    public Room(long roomId, RoomType roomType, String description) {
        this.roomId = roomId;
        this.roomType = roomType;
        this.description = description;
    }

    public Room() {
    }

    public long getRoomId() {
        return roomId;
    }

    public void setRoomId(long roomId) {
        this.roomId = roomId;
    }

    public RoomType getRoomType() {
        return roomType;
    }

    public void setRoomType(RoomType roomType) {
        this.roomType = roomType;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
