package untitled.domain;

import java.util.*;
import lombok.*;
import untitled.domain.*;
import untitled.infra.AbstractEvent;

@Data
@ToString
public class MenuBilled extends AbstractEvent {

    private Long id;

    public MenuBilled() {
        super();
    }
}
