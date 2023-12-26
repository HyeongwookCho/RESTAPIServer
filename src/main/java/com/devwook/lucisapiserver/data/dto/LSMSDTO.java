package com.devwook.lucisapiserver.data.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.*;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class LSMSDTO {

    private SystemResource systemResource;
    private List<ProcessStatus> processStatus;
    private List<ServiceStatus> serviceStatus;


    @Getter
    @Setter
    @NoArgsConstructor
    @AllArgsConstructor
    @ToString
    @Builder
    public static class SystemResource {
        private String server_host_name;
        private List<DriveInfo> driveInfo;
        private Double cpu_usage_ratio;
        private String memory_usage;
        @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH.mm.ss.SSS")
        private LocalDateTime collect_start_time;
        @Getter
        @Setter
        @NoArgsConstructor
        @AllArgsConstructor
        @ToString
        @Builder
        public static class DriveInfo {
            private String drive_name;
            private Long total_disk_size;
            private Long current_disk_usage;
            private Double usage_ratio;
        }
    }

    @Getter
    @Setter
    @NoArgsConstructor
    @AllArgsConstructor
    @ToString
    @Builder
    public static class ProcessStatus {
        private String name;
        private Integer status;
    }

    @Getter
    @Setter
    @NoArgsConstructor
    @AllArgsConstructor
    @ToString
    @Builder
    public static class ServiceStatus {
        private String name;
        private Integer status;
    }
}
