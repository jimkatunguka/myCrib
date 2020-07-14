package jim.katunguka.crib.controller;

import jim.katunguka.crib.model.Hostel;
import jim.katunguka.crib.model.Room;
import jim.katunguka.crib.service.HostelService;
import jim.katunguka.crib.service.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

@RestController
@RequestMapping("/rooms")
public class RoomController {
    @Autowired
    RoomService rservice;

    @Autowired
    HostelService hservice;

    @PostMapping("/{hostelId}")
    public Room addRoom(@RequestBody Room r, @PathVariable Long hostelId){
        Optional<Hostel> h = hservice.findById(hostelId);
        h.orElseThrow(() -> new NoSuchElementException("hostel not found"));
        r.setHostel(h);
        return rservice.addRoom(r);
    }

    @GetMapping
    public List<Room> getRooms(){
        return rservice.getAll();
    }
}
