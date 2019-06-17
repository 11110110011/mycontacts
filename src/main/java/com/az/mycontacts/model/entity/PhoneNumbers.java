package com.az.mycontacts.model.entity;

import lombok.*;
import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Collection;

@Entity
@Table(name = "PHONE_NUMBERS")
//@AllArgsConstructor
//@NoArgsConstructor
//@Getter
//@Setter
@Data
@Builder
public class PhoneNumbers extends BaseEntityIdentifier{

    @Column(name = "PHONE_NO")
    private String phoneNumber;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "USER_ID")
    Users user;

}
