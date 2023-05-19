package com.store.car.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "owner_post")
@Data
@NoArgsConstructor
public class OwnerPostEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    @Column(name = "owner_type")
    private String type;
    @Column(name = "owner_contact")
    private String contactNumber;

//    @OneToMany(mappedBy = "ownerPostEntity")
//    private List<CarPostEntity> carPostEntityList = new ArrayList<>();
}
