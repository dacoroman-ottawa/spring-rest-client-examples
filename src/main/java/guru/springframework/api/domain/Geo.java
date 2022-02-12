package guru.springframework.api.domain;

import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Geo implements Serializable {

    private String lat;
    private String lng;

    private static final long serialVersionUID = -5537574288146496215L;
    
}
