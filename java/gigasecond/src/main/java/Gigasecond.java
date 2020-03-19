import java.time.LocalDate;
import java.time.LocalDateTime;

class Gigasecond {

    private LocalDateTime dateTime;

    Gigasecond(LocalDate moment) {
        dateTime = moment.atStartOfDay().plusSeconds(1000000000);
    }

    Gigasecond(LocalDateTime moment) {
        dateTime = moment.plusSeconds(1000000000);
    }

    LocalDateTime getDateTime() {
        return dateTime;
    }
}
