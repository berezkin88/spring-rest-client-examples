package guru.springframework.api.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.TimeZone;

/**
 * @author Aleksandr Beryozkin
 */

@Setter
@Getter
@NoArgsConstructor
public class ExpirationDate implements Serializable {
    private String date;
    private Integer timezoneType;
    private String timezone;
}
