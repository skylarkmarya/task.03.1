import java.time.LocalDateTime;

public class Log {
    private LocalDateTime localDateTime;
    private String message;

    Log(LocalDateTime localDateTime, String message) {
        this.localDateTime = localDateTime;
        this.message = message;
    }

    @Override
    public String toString() {
        return "Log: " +
                "[" + localDateTime +
                "] - " + message + '.'+"\n";
    }
}
