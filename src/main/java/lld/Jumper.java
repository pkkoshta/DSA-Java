package lld;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode
public class Jumper {

    private int start;
    private int end;

    public Jumper(int start, int end) {
        this.start = start;
        this.end = end;
    }
}
