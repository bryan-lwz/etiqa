package com.as.etq.customerproduct.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class CustomerSearchDTO {
    private Integer id;
    private String firstName;
    private String lastName;
    private String officeEmail;
    private String personalEmail;
}
