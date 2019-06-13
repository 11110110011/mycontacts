package com.az.mycontacts.model.entity;

import lombok.*;
import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "USERS")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class Users extends BaseEntityIdentifier {

    @CreatedDate
    @Column(name = "CREATED_DATE", updatable = false)
    private LocalDateTime createdDate;

    @Column(name = "FULL_NAME", length = 50)
    private String fullName;

    @Column(name = "EMAIL", length = 30)
    private String email;

    @ManyToOne(optional = false, cascade = CascadeType.ALL)
//    @OneToMany(mappedBy = "user", fetch = FetchType.EAGER)
    @JoinColumn(name = "USER_PHONE")
    private PhoneNumbers phone;

    @OneToMany(mappedBy = "user", fetch = FetchType.EAGER)
//    @JoinColumn(name = "USER_ADDRESS")
    private Addresses address;

}
