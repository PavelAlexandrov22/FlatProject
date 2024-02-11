package by.itacademy.user.core.formatter;

import org.springframework.format.Parser;

import java.text.ParseException;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Locale;

public class LongToLocalDateTimeParser implements Parser<LocalDateTime> {

    private final Style style;

    public LongToLocalDateTimeParser(Style style) {
        this.style = style;
    }
    @Override
    public LocalDateTime parse(String text, Locale locale) throws ParseException {
        long timestampInMillis=Long.parseLong(text);

        Instant instant = Instant.ofEpochMilli(timestampInMillis);
        LocalDateTime localDateTime =
                LocalDateTime.ofInstant(instant, ZoneId.of("UTC"));

        return localDateTime;
    }
}
