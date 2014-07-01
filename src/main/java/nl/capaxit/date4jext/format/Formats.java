package nl.capaxit.date4jext.format;

/**
 * Defines some commonly used date/time patterns.
 * Created by jamiecraane on 01/07/14.
 */
public enum Formats {
    YEAR_MONTH_DAY("YYYY-MM-DD"),
    DAY_MONTH_YEAR("DD-MM-YYYY"),
    HOUR_MINUTE("hh_mm"),
    HOUR_MINUTE_SECOND("hh:mm:ss"),
    DATE_TIME_SHORT("YYYY-MM-DD hh:mm:ss"),
    DATE_TIME_LONG("YYYY MMMM DD hh:mm:ss");

    private final String format;

    Formats(final String format) {
        this.format = format;
    }

    public String getFormat() {
        return format;
    }
}
