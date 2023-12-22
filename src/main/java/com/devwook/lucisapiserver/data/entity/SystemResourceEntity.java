package com.devwook.lucisapiserver.data.entity;

import lombok.*;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "vms_resource")
public class SystemResourceEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @CreationTimestamp
    LocalDateTime timestamp;

    @Column
    String server_host_name;

    @Column
    Double cpu_usage_ratio;

    @Column
    String memory_usage;

    @Column
    LocalDateTime collect_start_time;

    @OneToMany(mappedBy = "systemResourceEntity")
    private List<DriveInfoEntity> driveInfo;

    @OneToMany(mappedBy = "systemResourceEntity")
    private List<ProcessStatusEntity> processStatus;

    @OneToMany(mappedBy = "systemResourceEntity")
    private List<ServiceStatusEntity> serviceStatus;

}
