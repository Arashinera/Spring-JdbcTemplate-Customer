package app.domain.customer;

import java.util.HashMap;
import java.util.Map;

public class CustomerValidator {

    private final static String PHONE_RGX = "^[0-9]{10}$";

    public Map<String, String> validateData(Customer customer) {
        Map<String, String> errors = new HashMap<>();
        if (customer.getFirstName() == null)
            errors.put("First name", "has no data.");
        if (customer.getLastName() == null)
            errors.put("Last name", "has no data.");
        if (customer.getPhoneNumber() == null || !customer.getPhoneNumber().matches(PHONE_RGX))
            errors.put("Phone number", "has no data or is wrong format.");
        if (customer.getAddress() == null)
            errors.put("Address", "has no data.");
        return errors;
    }
}
