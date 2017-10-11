package edu.bookstore.storage.entities;

import java.util.Objects;

/**
 * Representation of author db table
 */
public class Author {
	private String name;
	private int ISBN;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getISBN() {
		return ISBN;
	}

	public void setISBN(int iSBN) {
		ISBN = iSBN;
	}

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        final Author author = (Author) o;
        return ISBN == author.ISBN &&
                Objects.equals(name, author.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, ISBN);
    }

    @Override
    public String toString() {
        return "Author{" +
                "name='" + name + '\'' +
                ", ISBN=" + ISBN +
                '}';
    }
}
