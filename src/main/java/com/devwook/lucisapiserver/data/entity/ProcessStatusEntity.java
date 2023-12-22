package com.devwook.lucisapiserver.data.entity;

import lombok.*;

import javax.persistence.*;
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "PROCESS_STATUS")
public class ProcessStatusEntity {

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