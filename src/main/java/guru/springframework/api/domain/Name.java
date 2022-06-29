package guru.springframework.api.domain;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class Name implements Serializable {
    private final static long serialVersionUID = 1L;

    private String title;
    private String first;
    private String last;
}
