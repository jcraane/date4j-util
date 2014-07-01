package nl.capaxit.date4jext.calendar;

import hirondelle.date4j.DateTime;

import java.util.Calendar;
import java.util.TimeZone;

/**
 * Created by jamiecraane on 01/07/14.
 */
public final class DateTimeFactory {
    private DateTimeFactory() {
        throw new UnsupportedOperationException();
    }

    public static DateTime fromCalendar(final Calendar calendar) {
        return DateTime.forInstant(calendar.getTimeInMillis(), TimeZone.getDefault());
    }
}
