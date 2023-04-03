package p000;

import java.util.List;

/* renamed from: ns1 */
/* compiled from: EthGetWork */
public class ns1 extends ag5<List<String>> {
    public String getBoundaryCondition() {
        return (String) ((List) getResult()).get(2);
    }

    public String getCurrentBlockHeaderPowHash() {
        return (String) ((List) getResult()).get(0);
    }

    public String getSeedHashForDag() {
        return (String) ((List) getResult()).get(1);
    }
}
