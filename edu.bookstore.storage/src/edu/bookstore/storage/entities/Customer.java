package edu.bookstore.storage.entities;

import java.util.Objects;

/**
 * Representation of {@code Customer} Database table.
 */
public class Customer {
	private final int id;
    private final boolean isManager;
	private final String username;
	private final String password;
	private final String firstname;
	private final String lastname;
	private final String email;
	private final String phone;
	private final String shippingAddress;

    public Customer(final int id,
                    final boolean isManager,
                    final String username,
                    final String password,
                    final String firstname,
                    final String lastname,
                    final String email,
                    final String phone,
                    final String shippingAddress)
    {
        this.id = id;
        this.isManager = isManager;
        this.username = username;
        this.password = password;
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
        this.phone = phone;
        this.shippingAddress = shippingAddress;
    }

    public int getId() {
		return id;
	}

	public String getUsername() {
		return username;
	}

	public String getPassword() {
		return password;
	}

	public String getFirstname() {
		return firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public String getEmail() {
		return email;
	}

	public String getPhone() {
		return phone;
	}

	public String getShippingAddress() {
		return shippingAddress;
	}

	public boolean isManager() {
		return isManager;
	}

	private static class CustomerBuilder {
        private int id;
        private boolean isManager;
        private String username;
        private String password;
        private String firstname;
        private String lastname;
        private String email;
        private String phone;
        private String shippingAddress;

        public CustomerBuilder id(final int id) {
            this.id = id;
            return this;
        }

        public CustomerBuilder isManager(final boolean isManager) {
            this.isManager = isManager;
            return this;
        }

        public CustomerBuilder username(final String username) {
            this.username = username;
            return this;
        }

        public CustomerBuilder password(final String password) {
            this.password = password;
            return this;
        }

        public CustomerBuilder firstname(final String firstname) {
            this.firstname = firstname;
            return this;
        }

        public CustomerBuilder lastname(final String lastname) {
            this.lastname = lastname;
            return this;
        }

        public CustomerBuilder email(final String email) {
            this.email = email;
            return this;
        }

        public CustomerBuilder phone(final String phone) {
            this.phone = phone;
            return this;
        }

        public CustomerBuilder shippingAddress(final String shippingAddress) {
            this.shippingAddress = shippingAddress;
            return this;
        }

        public Customer build() {
            return new Customer(
                    id,
                    isManager,
                    username,
                    password,
                    firstname,
                    lastname,
                    email,
                    phone,
                    shippingAddress);
        }
    }

    public static CustomerBuilder builder() {
        return new CustomerBuilder();
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        final Customer customer = (Customer) o;
        return id == customer.id &&
                isManager == customer.isManager &&
                Objects.equals(username, customer.username) &&
                Objects.equals(password, customer.password) &&
                Objects.equals(firstname, customer.firstname) &&
                Objects.equals(lastname, customer.lastname) &&
                Objects.equals(email, customer.email) &&
                Objects.equals(phone, customer.phone) &&
                Objects.equals(shippingAddress, customer.shippingAddress);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                id,
                isManager,
                username,
                password,
                firstname,
                lastname,
                email,
                phone,
                shippingAddress);
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", isManager=" + isManager +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", shippingAddress='" + shippingAddress + '\'' +
                '}';
    }
}
