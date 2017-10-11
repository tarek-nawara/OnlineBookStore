package edu.bookstore.storage.entities;

import java.util.Objects;

/**
 * Representation of {@code TopCustomer} Database table.
 */
public class TopCustomer {
    private final int id;
    private final String firstname;
    private final String lastname;
    private final double totalCash;

    public TopCustomer(final int id,
                       final String firstname,
                       final String lastname,
                       final double totalCash)
    {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.totalCash = totalCash;
    }

    public String getFirstname() {
        return firstname;
    }

    public int getId() {
        return id;
    }

    public String getLastname() {
        return lastname;
    }

    public double getTotalCash() {
        return totalCash;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        final TopCustomer that = (TopCustomer) o;
        return id == that.id &&
                Double.compare(that.totalCash, totalCash) == 0 &&
                Objects.equals(firstname, that.firstname) &&
                Objects.equals(lastname, that.lastname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, firstname, lastname, totalCash);
    }

    @Override
    public String toString() {
        return "TopCustomer{" +
                "id=" + id +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", totalCash=" + totalCash +
                '}';
    }
}
