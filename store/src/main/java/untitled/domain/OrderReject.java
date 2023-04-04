package untitled.domain;

import java.util.*;
import lombok.*;
import untitled.domain.*;
import untitled.infra.AbstractEvent;

@Data
@ToString
public class OrderReject extends AbstractEvent {

    private Long id;

    public OrderReject() {
        super();
    }
}
