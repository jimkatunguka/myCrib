package jim.katunguka.crib.model;

import org.hibernate.annotations.Generated;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Embedded;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Document(collection = "Hostels")
public class Hostel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long hostelId;
    private String name;
    private String institution;

    private Address address;

    public Hostel(String name, String institution, Address address) {
        super();
        this.name = name;
        this.institution = institution;
        this.address = address;
    }

    public Hostel() {
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public long getHostelId() {
        return hostelId;
    }

    public void setHostelId(long hostelId) {
        this.hostelId = hostelId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getInstitution() {
        return institution;
    }

    public void setInstitution(String institution) {
        this.institution = institution;
    }
}