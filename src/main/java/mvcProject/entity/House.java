package mvcProject.entity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import mvcProject.ENUM.HouseType;

import java.time.LocalDate;

@Entity
@Table(name = "houses")
@Getter
@Setter
@NoArgsConstructor

public class House {
    @Id
    @GeneratedValue(generator = "house_gen", strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "house_gen",
            sequenceName = "house_seq",
            allocationSize = 1)
    private Long id;
   private HouseType houseType;
   private String address;
   private int price;
   private int room;
   private String  country;
   private String description;
   private boolean isBooked;
    private String image;
   @ManyToOne(cascade = {CascadeType.DETACH, CascadeType.MERGE, CascadeType.REFRESH})
   private Agency agency;
   @OneToOne(cascade = { CascadeType.DETACH, CascadeType.MERGE, CascadeType.REFRESH}, mappedBy = "house")
    private Booking booking;

    public House(HouseType houseType, String address, int price, int room, String country, String description, boolean isBooked) {
        this.houseType = houseType;
        this.address = address;
        this.price = price;
        this.room = room;
        this.country = country;
        this.description = description;
        this.isBooked = isBooked;
    }
}
