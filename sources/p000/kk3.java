package p000;

import java.io.IOException;
import java.math.BigInteger;
import java.util.List;
import org.web3j.protocol.core.filters.FilterException;
import p000.ps1;

/* renamed from: kk3 */
/* compiled from: LogFilter */
public class kk3 extends o12<hk3> {
    public final bs1 ethFilter;

    public kk3(vj7 vj7, o90<hk3> o90, bs1 bs1) {
        super(vj7, o90);
        this.ethFilter = bs1;
    }

    public qi4<zd5<?, ps1>> getFilterLogs(BigInteger bigInteger) {
        return qi4.m50602d(this.web3j.ethGetFilterLogs(bigInteger));
    }

    public void process(List<ps1.C9191c> list) {
        for (ps1.C9191c next : list) {
            if (next instanceof ps1.C9190b) {
                this.callback.onEvent(((ps1.C9190b) next).get());
            } else {
                throw new FilterException("Unexpected result type: " + next.get() + " required LogObject");
            }
        }
    }

    public as1 sendRequest() throws IOException {
        return this.web3j.ethNewFilter(this.ethFilter).send();
    }
}
