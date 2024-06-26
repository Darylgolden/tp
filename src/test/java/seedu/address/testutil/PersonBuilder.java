package seedu.address.testutil;

import java.util.HashSet;
import java.util.Set;

import seedu.address.model.appointment.AppointmentList;
import seedu.address.model.person.Address;
import seedu.address.model.person.Email;
import seedu.address.model.person.EmptyAddress;
import seedu.address.model.person.EmptyEmail;
import seedu.address.model.person.EmptyLevel;
import seedu.address.model.person.EmptyNote;
import seedu.address.model.person.EmptyPhone;
import seedu.address.model.person.Level;
import seedu.address.model.person.Name;
import seedu.address.model.person.Note;
import seedu.address.model.person.Person;
import seedu.address.model.person.Phone;
import seedu.address.model.person.Subject;
import seedu.address.model.tag.Tag;
import seedu.address.model.util.SampleDataUtil;

/**
 * A utility class to help with building Person objects.
 */
public class PersonBuilder {

    public static final String DEFAULT_NAME = "Amy Bee";
    public static final String DEFAULT_PHONE = "85355255";
    public static final String DEFAULT_EMAIL = "amy@gmail.com";
    public static final String DEFAULT_ADDRESS = "123, Jurong West Ave 6, #08-111";
    public static final String DEFAULT_NOTE = "She likes aardvarks.";
    public static final String DEFAULT_LEVEL = "P1";

    private Name name;
    private Phone phone;
    private Email email;
    private Address address;
    private Note note;
    private Set<Tag> tags;
    private AppointmentList appointments;
    private Set<Subject> subjects;
    private Level level;

    /**
     * Creates a {@code PersonBuilder} with the default details.
     */
    public PersonBuilder() {
        name = new Name(DEFAULT_NAME);
        phone = new Phone(DEFAULT_PHONE);
        email = new Email(DEFAULT_EMAIL);
        address = new Address(DEFAULT_ADDRESS);
        note = new Note(DEFAULT_NOTE);
        tags = new HashSet<>();
        appointments = new AppointmentList();
        subjects = new HashSet<>();
        level = new Level(DEFAULT_LEVEL);
    }

    /**
     * Initializes the PersonBuilder with the data of {@code personToCopy}.
     */
    public PersonBuilder(Person personToCopy) {
        name = personToCopy.getName();
        phone = personToCopy.getPhone();
        email = personToCopy.getEmail();
        address = personToCopy.getAddress();
        note = personToCopy.getNote();
        tags = new HashSet<>(personToCopy.getTags());
        appointments = personToCopy.getAppointments();
        subjects = new HashSet<>(personToCopy.getSubjects());
        level = personToCopy.getLevel();
    }

    /**
     * Sets the {@code Name} of the {@code Person} that we are building.
     */
    public PersonBuilder withName(String name) {
        this.name = new Name(name);
        return this;
    }

    /**
     * Parses the {@code tags} into a {@code Set<Tag>} and set it to the {@code Person} that we are building.
     */
    public PersonBuilder withTags(String ... tags) {
        this.tags = SampleDataUtil.getTagSet(tags);
        return this;
    }

    /**
     * Parses the {@code appointments} into a {@code AppointmentList}
     * and set it to the {@code Person} that we are building.
     */
    public PersonBuilder withAppointments(String ... appointments) {
        this.appointments = SampleDataUtil.getAppointmentList(appointments);
        return this;
    }

    /**
     * Parses the {@code subjects} into a {@code Set<Subject>}
     * and set it to the {@code Person} that we are building.
     */
    public PersonBuilder withSubjects(String ... subjects) {
        this.subjects = SampleDataUtil.getSubjectSet(subjects);
        return this;
    }

    /**
     * Sets the {@code Address} of the {@code Person} that we are building.
     */
    public PersonBuilder withAddress(String address) {
        this.address = new Address(address);
        return this;
    }

    /**
     * Sets the {@code Phone} of the {@code Person} that we are building.
     */
    public PersonBuilder withPhone(String phone) {
        this.phone = new Phone(phone);
        return this;
    }

    /**
     * Sets the {@code Email} of the {@code Person} that we are building.
     */
    public PersonBuilder withEmail(String email) {
        this.email = new Email(email);
        return this;
    }

    /**
     * Sets the {@code Note} of the {@code Person} that we are building.
     */
    public PersonBuilder withNote(String note) {
        this.note = new Note(note);
        return this;
    }

    /**
     * Sets the {@code Level} of the {@code Person} that we are building.
     */
    public PersonBuilder withLevel(String level) {
        this.level = new Level(level);
        return this;
    }

    /**
     * Removes the {@code Phone} of the {@code Person} and replaces it with a {@code EmptyPhone}
     */
    public PersonBuilder removePhone() {
        this.phone = new EmptyPhone();
        return this;
    }

    /**
     * Removes the {@code Email} of the {@code Person} and replaces it with a {@code EmptyEmail}
     */
    public PersonBuilder removeEmail() {
        this.email = new EmptyEmail();
        return this;
    }

    /**
     * Removes the {@code Address} of the {@code Person} and replaces it with a {@code EmptyAddress}
     */
    public PersonBuilder removeAddress() {
        this.address = new EmptyAddress();
        return this;
    }

    /**
     * Removes the {@code Note} of the {@code Person} and replaces it with a {@code EmptyNote}
     */
    public PersonBuilder removeNote() {
        this.note = new EmptyNote();
        return this;
    }

    /**
     * Removes the {@code Level} of the {@code Person} and replaces it with a {@code EmptyLevel}
     */
    public PersonBuilder removeLevel() {
        this.level = new EmptyLevel();
        return this;
    }

    public Person build() {
        return new Person(name, phone, email, address, note, tags, appointments, subjects, level);
    }

}
