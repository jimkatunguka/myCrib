package jim.katunguka.crib.service.impl;

import jim.katunguka.crib.model.Hostel;
import jim.katunguka.crib.repo.HostelRepo;
import jim.katunguka.crib.service.HostelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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
}
