package Transport;

public class Validate {
    public static String validationString(String value) {
        return value == null || value.isBlank() || value.isEmpty() ? " данные не введены" : value;
    }
    public static Integer validateNumber(Integer value) {
        return value == null || value < 0 || value > 500 ? 0 : value;
    }

}
