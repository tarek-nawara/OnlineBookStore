package edu.bookstore.storage.entities;

import java.util.Objects;

/**
 * Representation of {@code Category} Database table.
 */
public class Category {
	private final int id;
	private final String type;

    public Category(final int id, final String type) {
        this.id = id;
        this.type = type;
    }

    public int getId() {
		return id;
	}

	public String getType() {
		return type;
	}

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        final Category category = (Category) o;
        return id == category.id &&
                Objects.equals(type, category.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, type);
    }

    @Override
    public String toString() {
        return "Category{" +
                "id=" + id +
                ", type='" + type + '\'' +
                '}';
    }
}
