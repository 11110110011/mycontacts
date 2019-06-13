package com.az.mycontacts.model.entity;

import lombok.*;
import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Collection;

@Entity
@Table(name = "PHONE_NUMBERS")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class PhoneNumbers extends BaseEntityIdentifier{

    @CreatedDate
    @Column(name = "CREATED_DATE", updatable = false)
    private LocalDateTime createdDate;

    @Column(name = "PHONE_NO")
    private String phoneNumber;

    @OneToMany(mappedBy = "phone", fetch = FetchType.EAGER)
    private Collection<Users> phones;

}
