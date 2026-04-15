package exercise.enumeration;

public enum HttpStatus {
    OK(200, "OK"),
    BAD_REQUEST(400, "BAD Request"),
    NOT_FOUND(404, "Not Found"),
    INTERNAL_SERVER_ERROR(500, "Internal Server Error");

    private final int code;
    private final String message;

    HttpStatus(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    public static HttpStatus findByCode(int code) {
        return switch (code) {
            case 200 -> OK;
            case 400 -> BAD_REQUEST;
            case 404 -> NOT_FOUND;
            case 500 -> INTERNAL_SERVER_ERROR;
            default -> null;
        };
    }

    public boolean isSuccess() {
//        if (code == 200) {
//            return true;
//        } else {
//            return false;
//        }
        return 200 <= code && code <= 299;
    }
}
