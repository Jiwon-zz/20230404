package untitled.domain;

import java.util.*;
import lombok.*;
import untitled.domain.*;
import untitled.infra.AbstractEvent;

@Data
@ToString
public class MenuPicked extends AbstractEvent {

    private Long id;

    public MenuPicked() {
        super();
    }
}
