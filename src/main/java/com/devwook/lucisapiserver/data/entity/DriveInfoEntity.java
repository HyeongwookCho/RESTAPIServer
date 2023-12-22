package com.devwook.lucisapiserver.data.entity;

import javax.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "drive_info")
public class DriveInfoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @ManyToOne
    @JoinColumn(name="system_resource_id")
    private SystemResourceEntity systemResourceEntity;

    @Column
    String drive_name;

    @Column
    Long total_disk_size;

    @Column
    Long current_disk_usage;

    @Column
    Double usage_ratio;
}
