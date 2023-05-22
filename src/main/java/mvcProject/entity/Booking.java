package mvcProject.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table
@Getter
@Setter
@NoArgsConstructor

public class Booking {
    @Id
    @GeneratedValue(generator = "booking_gen", strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "booking_gen",
            sequenceName = "booking_seq",
            allocationSize = 1)
    private Long id;
    @OneToOne( cascade = {CascadeType.DETACH, CascadeType.MERGE, CascadeType.REFRESH})
 private House house;
    @ManyToOne(cascade = {CascadeType.DETACH, CascadeType.MERGE, CascadeType.REFRESH})
    private Customer customer;

}
