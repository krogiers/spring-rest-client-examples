package guru.springframework.api.domain;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class Card implements Serializable {
    private final static long serialVersionUID = 1L;

    private CardType type;
    private String number;
    private ExpDate expiration_date;
}
