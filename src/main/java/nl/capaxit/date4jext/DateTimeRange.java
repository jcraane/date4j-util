package nl.capaxit.date4jext;

import hirondelle.date4j.DateTime;

/**
 * Created by jcraane on 26-06-14.
 */
public class DateTimeRange {
    private final DateTime begin;
    private final DateTime end;

    public DateTimeRange(final DateTime begin, final DateTime end) {
        this.begin = Preconditions.checkNotNull(begin, "begin is null.");
        this.end = Preconditions.checkNotNull(end, "end is null.");
    }

    public boolean isBetweenBeginAndEndInclusive(final DateTime dateTime) {
        if (dateTime == null) {
            return false;
        }

        return dateTime.gteq(begin) && dateTime.lteq(end);
    }
}
