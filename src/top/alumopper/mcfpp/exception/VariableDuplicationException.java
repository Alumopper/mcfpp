package top.alumopper.mcfpp.exception;

/**
 * 变量重复声明
 */
public class VariableDuplicationException extends RuntimeException{

    public VariableDuplicationException() {
        super();
    }
    public VariableDuplicationException(String message) {
        super(message);
    }
}
