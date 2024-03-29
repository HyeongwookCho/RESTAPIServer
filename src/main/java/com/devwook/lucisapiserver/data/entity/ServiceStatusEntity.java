package com.devwook.lucisapiserver.data.entity;

import javax.persistence.*;
import lombok.*;
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "SERVICE_STATUS")
public class ServiceStatusEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "system_resource_id")
    private SystemResourceEntity systemResourceEntity;

    @Column(name = "name")
    private String name;

    @Column(name = "status")
    private Integer status;
}
