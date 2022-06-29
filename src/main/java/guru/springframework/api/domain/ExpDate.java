package guru.springframework.api.domain;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.time.LocalDateTime;

@Getter
@Setter
public class ExpDate implements Serializable {
    private final static long serialVersionUID = 1L;

    private String date;
    private int timezoneType;
    private String timezone;
}
