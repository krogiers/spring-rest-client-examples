package guru.springframework.api.domain;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class Billing implements Serializable {
    private final static long serialVersionUID = 1L;

    private Card card;
    private String language;
    private String currency;
 }
