package edu.bookstore.storage.entities;

/**
 * Representation of {@code Publisher} Database table.
 */
public class Publisher {
	private final String publisherName;
	private final String address;
	private final String phone;

    public Publisher(final String publisherName,
                     final String address,
                     final String phone) {
        this.publisherName = publisherName;
        this.address = address;
        this.phone = phone;
    }

    public String getPublisherName() {
		return publisherName;
	}

	public String getAddress() {
		return address;
	}

	public String getPhone() {
		return phone;
	}

    @Override
    public String toString() {
        return "Publisher{" +
                "publisherName='" + publisherName + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}
