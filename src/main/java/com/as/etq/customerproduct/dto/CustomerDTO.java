package com.as.etq.customerproduct.dto;

import com.as.etq.customerproduct.entity.FamilyMember;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Getter
@Setter
@Builder
@ToString
public class CustomerDTO {
    private Integer id;
    private String firstName;
    private String lastName;
    private String officeEmail;
    private String personalEmail;
    private String mobilePhone;
    private List<FamilyMember> familyMemberList;
}
