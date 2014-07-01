package nl.capaxit.date4jext;

import hirondelle.date4j.DateTime;

/**
 * Represent a range.
 *
 * Created by jcraane on 26-06-14.
 */
public class DateTimeRange {
    private final DateTime begin;
    private final DateTime end;

    public DateTimeRange(final DateTime begin, final DateTime end) {
        this.begin = Preconditions.checkNotNull(begin, "begin is null.");
        this.end = Preconditions.checkNotNull(end, "end is null.");
    }

    public boolean fallsWithinRange(final DateTime dateTime, final RangeOptions rangeOptions) {
        if (dateTime == null) {
            return false;
        }

        switch (rangeOptions) {
            case BEGIN_AND_END_INCLUSIVE:
                return dateTime.gteq(begin) && dateTime.lteq(end);
            case BEGIN_AND_END_EXCLUSIVE:
                return dateTime.gt(begin) && dateTime.lt(end);
            case BEGIN_EXCLUSIVE_END_INCLUSIVE:
                return dateTime.gt(begin) && dateTime.lteq(end);
            case BEGIN_INCLUSIVE_END_EXCLUSIVE:
                return dateTime.gteq(begin) && dateTime.lt(end);
            default:
                throw new IllegalArgumentException("Invalid rangeOption");
        }
    }

    public static enum RangeOptions {
        BEGIN_AND_END_INCLUSIVE,
        BEGIN_AND_END_EXCLUSIVE,
        BEGIN_INCLUSIVE_END_EXCLUSIVE,
        BEGIN_EXCLUSIVE_END_INCLUSIVE;
    }
}
