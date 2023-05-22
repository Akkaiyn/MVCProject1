package mvcProject.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "agencies")
@Getter
@Setter
@NoArgsConstructor

public class Agency {
    @Id
    @GeneratedValue(generator = "agency_gen", strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "agency_gen",
    sequenceName = "agency_seq",
    allocationSize = 1)

    private Long id;
    private String agencyName;
    private String country;
    private String image;

    private String phoneNumber;
    @Column(unique = true)
    private String email;
    @OneToMany(cascade = {CascadeType.DETACH, CascadeType.MERGE, CascadeType.REFRESH}, mappedBy = "agency")
    private List<House> houses;
    @ManyToMany(cascade = {CascadeType.DETACH, CascadeType.MERGE, CascadeType.REFRESH})
    private List<Customer> customers;

}
