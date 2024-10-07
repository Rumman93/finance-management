package com.easybank.account.domain.entity;

import jakarta.persistence.*;
import lombok.*;

/**
 * Author :  Ahmmed Jubayer Rumman
 * Created at : 07 Oct 2024
 */
@Entity
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Customer extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "customer_id")
    private Long customerId;

    private String name;

    private String email;

    @Column(name = "mobile_number")
    private String mobileNumber;

}
