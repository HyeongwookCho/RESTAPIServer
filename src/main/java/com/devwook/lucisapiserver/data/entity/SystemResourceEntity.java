package com.devwook.lucisapiserver.data.entity;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "VMS_RESOURCE")
public class SystemResourceEntity {

    @Column
    @Id
    String id;

    @Column
    LocalDateTime timestamp;

    String server_host_name;

    String drive_name;

    Long total_disk_size;

    Long current_disk_usage;

    Double usage_ratio;

    Double cpu_usage_ratio;

    Long memory_usage;

    LocalDateTime collect_start_time;


}
