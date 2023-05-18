package com.store.car.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "car_post")
@Data
@NoArgsConstructor
public class CarPostEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "car-model")
    private String model;
    @Column(name = "car-brand")
    private String brand;
    @Column(name = "car-price")
    private String price;
    @Column(name = "car-description")
    private String description;
    @Column(name = "car-engine")
    private String engineVersion;
    @Column(name = "car-city")
    private String city;
    @Column(name = "car-created")
    private String createDate;
    @Column(name = "car-post-contact")
    private String contact;

    @ManyToOne
    @JoinColumn(name = "owner_post_id", nullable = false, referencedColumnName = "id")
    private OwnerPostEntity ownerPost;

}
