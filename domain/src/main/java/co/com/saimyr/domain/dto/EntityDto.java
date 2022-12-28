package co.com.saimyr.domain.dto;

import lombok.Data;

@Data
public class EntityDto {
    private int entityId;
    private String nit;
    private String name;
    private String address;
    private String motto;
    private String phone;
    private String email;
    private String web;
}
