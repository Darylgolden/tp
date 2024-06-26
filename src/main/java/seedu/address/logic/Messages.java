package seedu.address.logic;

import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import seedu.address.logic.parser.Prefix;
import seedu.address.model.person.Person;

/**
 * Container for user visible messages.
 */
public class Messages {

    public static final String MESSAGE_UNKNOWN_COMMAND = "Unknown command";
    public static final String MESSAGE_INVALID_COMMAND_FORMAT = "Invalid command format! \n%1$s";
    public static final String MESSAGE_INVALID_PERSON_DISPLAYED_INDEX = "The person index provided is invalid";
    public static final String MESSAGE_PERSONS_LISTED_OVERVIEW = "%1$d persons listed!";
    public static final String MESSAGE_DUPLICATE_FIELDS =
                "Multiple values specified for the following single-valued field(s): ";

    /**
     * Returns an error message indicating the duplicate prefixes.
     */
    public static String getErrorMessageForDuplicatePrefixes(Prefix... duplicatePrefixes) {
        assert duplicatePrefixes.length > 0;

        Set<String> duplicateFields =
                Stream.of(duplicatePrefixes).map(Prefix::toString).collect(Collectors.toSet());

        return MESSAGE_DUPLICATE_FIELDS + String.join(" ", duplicateFields);
    }

    /**
     * Formats the {@code person} for display to the user.
     */
    public static String format(Person person) {
        final StringBuilder builder = new StringBuilder();
        builder.append(person.getName());
        if (!person.getPhone().isEmpty()) {
            builder.append("; Phone: ").append(person.getPhone());
        }
        if (!person.getEmail().isEmpty()) {
            builder.append("; Email: ").append(person.getEmail());
        }
        if (!person.getAddress().isEmpty()) {
            builder.append("; Address: ").append(person.getAddress());
        }
        if (!person.getNote().isEmpty()) {
            builder.append("; Note: ").append(person.getNote());
        }
        builder.append("; Tags: ");
        person.getTags().forEach(builder::append);

        builder.append("; Appointments: ");
        builder.append(person.getAppointments());

        builder.append("; Subjects: ");
        person.getSubjects().forEach(builder::append);

        if (!person.getLevel().isEmpty()) {
            builder.append("; Level: ").append(person.getLevel());
        }

        return builder.toString();
    }

}
