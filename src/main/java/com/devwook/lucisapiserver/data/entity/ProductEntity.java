package com.devwook.lucisapiserver.data.entity;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "product")
public class ProductEntity {

    @Id
    String productId;

    String productName;

    Integer productPrice;

    Integer productStock;

    // 추가 가능
    /*@Column
    String sellerId;

    @Column
    String sellerPhoneNumber;*/



}
