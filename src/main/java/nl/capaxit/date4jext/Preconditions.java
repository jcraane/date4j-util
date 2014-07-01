package nl.capaxit.date4jext;

/**
 * Created by jcraane on 26-06-14.
 */
public final class Preconditions {
    public static <T> T checkNotNull(T reference, String errorMessage) {
        if (reference == null) {
            throw new NullPointerException(errorMessage);
        }
        return reference;
    }
}
