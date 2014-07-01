package nl.capaxit.date4jext.calendar;

import hirondelle.date4j.DateTime;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.TimeZone;

/**
 * Created by jamiecraane on 01/07/14.
 */
public final class CalendarFactory {
    private CalendarFactory() {
        throw new UnsupportedOperationException();
    }

    public static Calendar toCalendar(final DateTime dateTime) {
        final GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.setTimeInMillis(dateTime.getMilliseconds(TimeZone.getDefault()));
        return gregorianCalendar;
    }
}
