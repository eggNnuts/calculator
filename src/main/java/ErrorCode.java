public enum ErrorCode {
    INVALID_OPERATOR("유효하지 않은 연산자입니다");
    private final String errorMessage;

    ErrorCode(String errorMessage) {
        this.errorMessage=errorMessage;
    }

    public String getErrorMessage() {
        return errorMessage;
    }
}
