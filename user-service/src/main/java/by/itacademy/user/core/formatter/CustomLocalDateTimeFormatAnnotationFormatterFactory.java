package by.itacademy.user.core.formatter;

import org.springframework.format.AnnotationFormatterFactory;
import org.springframework.format.Formatter;
import org.springframework.format.Parser;
import org.springframework.format.Printer;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Component
public class CustomLocalDateTimeFormatAnnotationFormatterFactory implements AnnotationFormatterFactory<LongFormat> {
    @Override
    public Set<Class<?>> getFieldTypes() {
        return new HashSet<>(List.of(LocalDateTime.class));
    }

    @Override
    public Printer<?> getPrinter(LongFormat annotation, Class<?> fieldType) {
        return getFormatter(annotation, fieldType);
    }

    @Override
    public Parser<?> getParser(LongFormat annotation, Class<?> fieldType) {
        return getDateParser(annotation,fieldType);
    }

    private Formatter<?> getFormatter(LongFormat annotation, Class<?> fieldType) {
        return new LongToLocalDateTimeFormatter(annotation.style());
    }

    private Parser<?> getDateParser(LongFormat annotation, Class<?> fieldType) {
        return new LongToLocalDateTimeParser(annotation.style());
    }
}
