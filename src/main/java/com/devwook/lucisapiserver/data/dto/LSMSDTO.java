package com.devwook.lucisapiserver.data.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.*;

import java.time.LocalDateTime;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class LSMSDTO {

    private SystemResource systemResource;
    private List<ProcessStatus> processStatus;
    private List<ServiceStatus> serviceStatus;


    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    @ToString
    @Builder
    public static class SystemResource {
        private String serverName;
        private List<DriveInfo> driveInfo;
        private Double CPUInfo;
        private Long memoryInfo;
        @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss.SSS")
        private LocalDateTime collectStartTime;
        @Data
        @NoArgsConstructor
        @AllArgsConstructor
        @ToString
        @Builder
        public static class DriveInfo {
            private String Name;
            private Long TotalSize;
            private Long CurrentUsage;
            private Double UsageRatio;
        }
    }

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    @ToString
    @Builder
    public static class ProcessStatus {
        private String Name;
        private String Status;
    }

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    @ToString
    @Builder
    public static class ServiceStatus {
        private String Name;
        private String Status;
    }
}
