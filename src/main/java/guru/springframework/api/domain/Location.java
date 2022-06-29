package guru.springframework.api.domain;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class Location implements Serializable {
    private final static long serialVersionUID = 1L;

    private String street;
    private String city;
    private String state;
    private String postcode;
}
