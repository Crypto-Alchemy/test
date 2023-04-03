package p000;

import java.util.Arrays;
import java.util.List;

/* renamed from: bs1 */
/* compiled from: EthFilter */
public class bs1 extends n12<bs1> {
    private List<String> address;
    private x61 fromBlock;
    private x61 toBlock;

    public bs1() {
    }

    public List<String> getAddress() {
        return this.address;
    }

    public x61 getFromBlock() {
        return this.fromBlock;
    }

    public bs1 getThis() {
        return this;
    }

    public x61 getToBlock() {
        return this.toBlock;
    }

    public bs1(x61 x61, x61 x612, List<String> list) {
        this.fromBlock = x61;
        this.toBlock = x612;
        this.address = list;
    }

    public bs1(x61 x61, x61 x612, String str) {
        this(x61, x612, (List<String>) Arrays.asList(new String[]{str}));
    }
}
