package com.devwook.lucisapiserver.data.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Setter
@Getter
public class MemberDTO {
    private String name;
    private String email;
    private String organization;
}
