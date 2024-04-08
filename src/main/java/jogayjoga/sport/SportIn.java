package jogayjoga.sport;

import lombok.Builder;
import lombok.experimental.Accessors;

@Builder
@Accessors(fluent = true, chain = true)
public record SportIn(
    String name
) {
}
