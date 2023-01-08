package top.alumopper.mcfpp.tokens;

/**
 * 一个原始命令语句
 */
public class CommandToken extends Token{
    /**
     * 从一个字符串中解析一个语句
     *
     * @param code 需要解析的字符串
     */
    public CommandToken(String code) {
        super(code);
    }
}
