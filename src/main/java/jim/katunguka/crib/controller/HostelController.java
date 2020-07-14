package jim.katunguka.crib.controller;

import jim.katunguka.crib.model.Hostel;
import jim.katunguka.crib.service.HostelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/hostels")
public class HostelController {
    @Autowired
    HostelService hservice;

    @PostMapping
    public Hostel addHostel(@RequestBody Hostel h){
        return hservice.addHostel(h);
    }

    @GetMapping
    public List<Hostel> getHostels(){
        return hservice.getAll();
    }
}
