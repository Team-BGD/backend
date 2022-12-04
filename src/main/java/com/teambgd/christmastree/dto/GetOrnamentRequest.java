package com.teambgd.christmastree.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class GetOrnamentRequest {
    @JsonProperty("ornamentNum")
    private Long ornamentNum;
}
