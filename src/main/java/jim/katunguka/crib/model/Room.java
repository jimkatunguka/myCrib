package jim.katunguka.crib.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.ManyToOne;

@Document(collection = "rooms")
public class Room {
    @Id
    private long roomId;

    @ManyToOne
    private Hostel hostel;
    private RoomType roomType;
    private String description;

    public Room(long roomId, Hostel hostel, RoomType roomType, String description) {
        this.roomId = roomId;
        this.hostel = hostel;
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

    public Hostel getHostel() {
        return hostel;
    }

    public void setHostel(Hostel hostel) {
        this.hostel = hostel;
    }
}
