package jim.katunguka.crib.service;

import jim.katunguka.crib.model.Hostel;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

public interface HostelService {
    public Hostel addHostel(Hostel h);
    public List<Hostel> getAll();
    public Optional<Hostel> findById(Long hostelId);
}
