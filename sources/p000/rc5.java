package p000;

import java.util.List;
import java.util.concurrent.Callable;
import org.web3j.abi.FunctionReturnDecoder;

/* renamed from: rc5 */
/* compiled from: RemoteFunctionCall */
public class rc5<T> extends pc5<T> {
    private final gd2 function;

    public rc5(gd2 gd2, Callable<T> callable) {
        super(callable);
        this.function = gd2;
    }

    public List<fz6> decodeFunctionResponse(String str) {
        return FunctionReturnDecoder.decode(str, this.function.getOutputParameters());
    }

    public String encodeFunctionCall() {
        return xd2.encode(this.function);
    }
}
