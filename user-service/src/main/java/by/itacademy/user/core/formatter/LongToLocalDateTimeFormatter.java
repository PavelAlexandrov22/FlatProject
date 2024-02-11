package by.itacademy.user.core.formatter;


import org.springframework.format.Formatter;

import java.text.ParseException;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Locale;
import java.util.TimeZone;


public class LongToLocalDateTimeFormatter implements Formatter<LocalDateTime> {
    private Style style;

    public LongToLocalDateTimeFormatter(Style style) {
        this.style = style;
    }

    @Override
    public LocalDateTime parse(String text, Locale locale) throws ParseException {
        return LocalDateTime.ofInstant(Instant.ofEpochMilli(Long.parseLong(text)),
                TimeZone.getDefault().toZoneId()) ;
    }

    @Override
    public String print(LocalDateTime ldt, Locale locale) {
        return String.valueOf(ldt.atZone(ZoneId.systemDefault()).toEpochSecond());
    }

}
