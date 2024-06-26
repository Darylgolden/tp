package seedu.address.testutil;

import static seedu.address.logic.commands.CommandTestUtil.VALID_ADDRESS_AMY;
import static seedu.address.logic.commands.CommandTestUtil.VALID_ADDRESS_BOB;
import static seedu.address.logic.commands.CommandTestUtil.VALID_ADDRESS_CELINE;
import static seedu.address.logic.commands.CommandTestUtil.VALID_APPOINTMENT_FRIDAY;
import static seedu.address.logic.commands.CommandTestUtil.VALID_APPOINTMENT_SUNDAY;
import static seedu.address.logic.commands.CommandTestUtil.VALID_EMAIL_AMY;
import static seedu.address.logic.commands.CommandTestUtil.VALID_EMAIL_BOB;
import static seedu.address.logic.commands.CommandTestUtil.VALID_EMAIL_CELINE;
import static seedu.address.logic.commands.CommandTestUtil.VALID_LEVEL_BOB;
import static seedu.address.logic.commands.CommandTestUtil.VALID_LEVEL_CELINE;
import static seedu.address.logic.commands.CommandTestUtil.VALID_NAME_AMY;
import static seedu.address.logic.commands.CommandTestUtil.VALID_NAME_BOB;
import static seedu.address.logic.commands.CommandTestUtil.VALID_NAME_CELINE;
import static seedu.address.logic.commands.CommandTestUtil.VALID_NOTE_AMY;
import static seedu.address.logic.commands.CommandTestUtil.VALID_NOTE_BOB;
import static seedu.address.logic.commands.CommandTestUtil.VALID_NOTE_CELINE;
import static seedu.address.logic.commands.CommandTestUtil.VALID_PHONE_AMY;
import static seedu.address.logic.commands.CommandTestUtil.VALID_PHONE_BOB;
import static seedu.address.logic.commands.CommandTestUtil.VALID_PHONE_CELINE;
import static seedu.address.logic.commands.CommandTestUtil.VALID_SUBJECT_BOB;
import static seedu.address.logic.commands.CommandTestUtil.VALID_SUBJECT_CELINE;
import static seedu.address.logic.commands.CommandTestUtil.VALID_TAG_FRIEND;
import static seedu.address.logic.commands.CommandTestUtil.VALID_TAG_HUSBAND;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import seedu.address.model.AddressBook;
import seedu.address.model.person.Person;

/**
 * A utility class containing a list of {@code Person} objects to be used in tests.
 */
public class TypicalPersons {

    public static final Person ALICE = new PersonBuilder().withName("Alice Pauline")
            .withAddress("123, Jurong West Ave 6, #08-111").withEmail("alice@example.com")
            .withPhone("94351253")
            .withTags("friends").withNote("She likes aardvarks.").build();
    public static final Person BENSON = new PersonBuilder().withName("Benson Meier")
            .withAddress("311, Clementi Ave 2, #02-25")
            .withEmail("johnd@example.com").withPhone("98765432")
            .withTags("owesMoney", "friends").withNote("He can't take beer!")
            .withAppointments("12:00-13:00 SUN")
            .withSubjects("MATH").build();
    public static final Person BENSON_NO_ADDRESS = new PersonBuilder(BENSON).removeAddress().build();
    public static final Person BENSON_NO_PHONE = new PersonBuilder(BENSON).removePhone().build();
    public static final Person BENSON_NO_EMAIL = new PersonBuilder(BENSON).removeEmail().build();
    public static final Person BENSON_NO_NOTE = new PersonBuilder(BENSON).removeNote().build();

    public static final Person CARL = new PersonBuilder().withName("Carl Kurz").withPhone("95352563")
            .withEmail("heinz@example.com").withAddress("wall street").build();
    public static final Person DANIEL = new PersonBuilder().withName("Daniel Meier").withPhone("87652533")
            .withEmail("cornelia@example.com").withAddress("10th street").withTags("friends").build();
    public static final Person ELLE = new PersonBuilder().withName("Elle Meyer").withPhone("9482224")
            .withEmail("werner@example.com").withAddress("michegan ave").build();
    public static final Person FIONA = new PersonBuilder().withName("Fiona Kunz").withPhone("9482427")
            .withEmail("lydia@example.com").withAddress("little tokyo").build();
    public static final Person GEORGE = new PersonBuilder().withName("George Best").withPhone("9482442")
            .withEmail("anna@example.com").withAddress("4th street").build();

    // Manually added
    public static final Person HOON = new PersonBuilder().withName("Hoon Meier").withPhone("8482424")
            .withEmail("stefan@example.com").withAddress("little india").build();
    public static final Person IDA = new PersonBuilder().withName("Ida Mueller").withPhone("8482131")
            .withEmail("hans@example.com").withAddress("chicago ave").build();

    // More persons; these are missing one or more fields for testing purposes
    public static final Person JAGEN = new PersonBuilder().withName("Jagen Arch")
            .withEmail("jagen@example.com").withAddress("japan").withNote("Has Red Paint").build();
    public static final Person KLEIN = new PersonBuilder().withName("Klein Elibe").withPhone("77617761")
            .withAddress("america").withNote("Has Sister").build();
    public static final Person LYON = new PersonBuilder().withName("Lyon Mag").withPhone("77617761")
            .withEmail("lyon@example.com").withNote("Careful around stones").build();
    public static final Person MANFROY = new PersonBuilder().withName("Manfroy Jug").withPhone("77617761")
            .withAddress("manfroy@example.com").withAddress("big map").build();
    public static final Person NASIR = new PersonBuilder().withName("Nasir Tell").build();

    // Manually added - Person's details found in {@code CommandTestUtil}
    public static final Person AMY = new PersonBuilder().withName(VALID_NAME_AMY).withPhone(VALID_PHONE_AMY)
            .withEmail(VALID_EMAIL_AMY).withAddress(VALID_ADDRESS_AMY).withNote(VALID_NOTE_AMY)
            .withTags(VALID_TAG_FRIEND).build();
    public static final Person BOB = new PersonBuilder().withName(VALID_NAME_BOB).withPhone(VALID_PHONE_BOB)
            .withEmail(VALID_EMAIL_BOB).withAddress(VALID_ADDRESS_BOB).withNote(VALID_NOTE_BOB)
            .withTags(VALID_TAG_HUSBAND, VALID_TAG_FRIEND)
            .withSubjects(VALID_SUBJECT_BOB).withLevel(VALID_LEVEL_BOB).build();
    public static final Person CELINE = new PersonBuilder().withName(VALID_NAME_CELINE).withPhone(VALID_PHONE_CELINE)
            .withEmail(VALID_EMAIL_CELINE).withAddress(VALID_ADDRESS_CELINE).withNote(VALID_NOTE_CELINE)
            .withAppointments(VALID_APPOINTMENT_FRIDAY, VALID_APPOINTMENT_SUNDAY)
            .withSubjects(VALID_SUBJECT_CELINE).withLevel(VALID_LEVEL_CELINE)
            .build();
    public static final Person NO_ADDRESS_AMY = new PersonBuilder().withName(VALID_NAME_AMY).withPhone(VALID_PHONE_AMY)
            .withEmail(VALID_EMAIL_AMY).withNote(VALID_NOTE_AMY).withTags(VALID_TAG_FRIEND).removeAddress().build();
    public static final Person NO_PHONE_AMY = new PersonBuilder().withName(VALID_NAME_AMY)
            .withEmail(VALID_EMAIL_AMY).withNote(VALID_NOTE_AMY).withAddress(VALID_ADDRESS_AMY)
            .withTags(VALID_TAG_FRIEND).removePhone().build();
    public static final Person NO_EMAIL_AMY = new PersonBuilder().withName(VALID_NAME_AMY).withPhone(VALID_PHONE_AMY)
            .withAddress(VALID_ADDRESS_AMY).withNote(VALID_NOTE_AMY).withTags(VALID_TAG_FRIEND).removeEmail().build();
    public static final Person NO_NOTE_AMY = new PersonBuilder().withName(VALID_NAME_AMY).withPhone(VALID_PHONE_AMY)
            .withEmail(VALID_EMAIL_AMY).withAddress(VALID_ADDRESS_AMY).withTags(VALID_TAG_FRIEND).removeNote().build();
    public static final Person NAME_ONLY_CELINE = new PersonBuilder().withName(VALID_NAME_CELINE)
            .removeEmail().removeNote().removeAddress().removePhone().removeLevel().build();

    public static final String KEYWORD_MATCHING_MEIER = "Meier"; // A keyword that matches MEIER

    private TypicalPersons() {} // prevents instantiation

    /**
     * Returns an {@code AddressBook} with all the typical persons.
     */
    public static AddressBook getTypicalAddressBook() {
        AddressBook ab = new AddressBook();
        for (Person person : getTypicalPersons()) {
            ab.addPerson(person);
        }
        return ab;
    }

    public static List<Person> getTypicalPersons() {
        return new ArrayList<>(Arrays.asList(ALICE, BENSON, CARL, DANIEL, ELLE, FIONA, GEORGE));
    }
}
