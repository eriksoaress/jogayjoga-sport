package jogayjoga.sport;
import lombok.Builder;
import java.io.Serializable;

@Builder
public record SportOut(
    String id,
    String name
) implements Serializable
{
    private static final long serialVersionUID = 1L;
    
}
