import java.time.LocalDateTime;

public class CrazyLogger {
    StringBuilder sb = new StringBuilder();
    public StringBuilder doLog(String message) {
        LocalDateTime ldt = LocalDateTime.now();
        sb.append(new Log(ldt, message));
        return sb;
    }

    @Override
    public String toString() {
        return "" + sb +' ';
    }
}

