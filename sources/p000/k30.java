package p000;

import java.io.IOException;
import java.math.BigInteger;
import java.util.List;
import org.web3j.protocol.core.filters.FilterException;
import p000.ps1;

/* renamed from: k30 */
/* compiled from: BlockFilter */
public class k30 extends o12<String> {
    public k30(vj7 vj7, o90<String> o90) {
        super(vj7, o90);
    }

    public qi4<zd5<?, ps1>> getFilterLogs(BigInteger bigInteger) {
        return qi4.m50601a();
    }

    public void process(List<ps1.C9191c> list) {
        for (ps1.C9191c next : list) {
            if (next instanceof ps1.C9189a) {
                this.callback.onEvent(((ps1.C9189a) next).get());
            } else {
                throw new FilterException("Unexpected result type: " + next.get() + ", required Hash");
            }
        }
    }

    public as1 sendRequest() throws IOException {
        return this.web3j.ethNewBlockFilter().send();
    }
}
