package ejAdicionales;

import java.util.function.Consumer;
import java.util.function.Predicate;

import static org.apache.commons.lang3.math.NumberUtils.isNumber;

public class Version {
    public boolean isLegacyVersion(String version) {
        return isValido(version, (numVersion)-> numVersion >= 0 && numVersion <= 100);
    }
    public boolean isPresentDayVersion(String version) {
        return isValido(version, (n)->n >= 101 && n <= 200);
    }
    public boolean isValido(String version, Predicate<Long> predicate) {
        if (version == null || version.isEmpty())
            throw new IllegalArgumentException("Not valid version");
        if (!isNumber(version))
            throw new IllegalArgumentException("Not valid version");
        long numVersion = Long.parseLong(version);
        if (numVersion < 0) {
            throw new IllegalArgumentException("Not valid version");
        }
        return predicate.test(numVersion);
    }
}