package com.az.mycontacts.model.entity;

import com.az.mycontacts.model.dto.Address;
import lombok.*;
import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Collection;
import java.util.List;

@Entity
@Table(name = "ADDRESSES")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class Addresses extends BaseEntityIdentifier{

    @CreatedDate
    @Column(name = "CREATED_DATE", updatable = false)
    private LocalDateTime createdDate;

    @Column(name = "COUNTRY", length = 50)
    private String country;

    @Column(name = "CITY", length = 20)
    private String city;

    @Column(name = "STREET", length = 25)
    private String street;

    @Column(name = "HOUSE_NUMBER", length = 5)
    private String houseNumber;

    @Column(name = "APARTMENT", length = 5)
    private String apartment;

    @OneToMany(mappedBy = "address", fetch = FetchType.EAGER)
    private Collection<Users> user;
}
