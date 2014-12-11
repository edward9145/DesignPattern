package interpreter;

/**
 * 処理対象を表すインタフェース
 * @author apl02
 *
 */
public interface Operand {

    /**
     * 処理対象を表す文字列を返すメソッドです。
     * @return operandString
     */
    public String getOperandString();

}
