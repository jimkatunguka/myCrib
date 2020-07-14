package jim.katunguka.crib.service.impl;

import jim.katunguka.crib.model.Hostel;
import jim.katunguka.crib.repo.HostelRepo;
import jim.katunguka.crib.service.HostelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class HostelServiceImpl implements HostelService {
    @Autowired
    HostelRepo repo;

    @Override
    public Hostel addHostel(Hostel h) {
        return repo.save(h);
    }

    @Override
    public List<Hostel> getAll() {
        return repo.findAll();
    }

    @Override
    public Optional<Hostel> findById(Long hostelId) {
        return repo.findById(hostelId);
    }
}
