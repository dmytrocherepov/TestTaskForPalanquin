package org.example;

import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Marking will be based upon producing a readable, well engineered solution rather than factors
 * such as speed of processing or other performance-based optimizations, which are less
 * important.
 * <p>
 * Implement in single class. Don't chane constructor and signature method.
 */
public class DateSorter {

    /**
     * The implementation of this method should sort dates.
     * The output should be in the following order:
     * Dates with an 'r' in the month,
     * sorted ascending (first to last),
     * then dates without an 'r' in the month,
     * sorted descending (last to first).
     * For example, October dates would come before May dates,
     * because October has an 'r' in it.
     * thus: (2004-07-01, 2005-01-02, 2007-01-01, 2032-05-03)
     * would sort to
     * (2005-01-02, 2007-01-01, 2032-05-03, 2004-07-01)
     *
     * @param unsortedDates - an unsorted list of dates
     * @return the collection of dates now sorted as per the spec
     */
    public Collection<LocalDate> sortDates(List<LocalDate> unsortedDates) {

        // Created Predicates for more readability
        Predicate<LocalDate> dateWithR = date -> date.getMonth().getDisplayName(TextStyle.FULL, Locale.ENGLISH).contains("r");

        Predicate<LocalDate> dateWithoutR = date -> !date.getMonth().getDisplayName(TextStyle.FULL, Locale.ENGLISH).contains("r");

        //using Stream.concat to write all elements with r First
        return Stream.concat(
                unsortedDates.stream()
                        .filter(dateWithR)
                        .sorted(),
                unsortedDates.stream()
                        .filter(dateWithoutR)
                        .sorted(Comparator.reverseOrder())
        ).toList();
    }
}