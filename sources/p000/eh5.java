package p000;

import java.util.Arrays;
import java.util.List;

/* renamed from: eh5 */
/* compiled from: RlpList */
public class eh5 implements gh5 {
    private final List<gh5> values;

    public eh5(gh5... gh5Arr) {
        this.values = Arrays.asList(gh5Arr);
    }

    public List<gh5> getValues() {
        return this.values;
    }

    public eh5(List<gh5> list) {
        this.values = list;
    }
}
