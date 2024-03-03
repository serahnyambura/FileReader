// Custom exception for an empty file
class EmptyFileException extends Exception {
    public EmptyFileException(String message) {
        super(message);
    }
}