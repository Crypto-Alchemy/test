package p000;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: tm8 */
public final class tm8 extends qm8 {
    public tm8(int i) {
        super(i, (tm8) null);
    }

    /* renamed from: r */
    public final void mo47149r() {
        if (!mo47132a()) {
            for (int i = 0; i < mo47143l(); i++) {
                Map.Entry g = mo47139g(i);
                if (((af8) g.getKey()).mo28959b0()) {
                    g.setValue(Collections.unmodifiableList((List) g.getValue()));
                }
            }
            for (Map.Entry entry : mo47144m()) {
                if (((af8) entry.getKey()).mo28959b0()) {
                    entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                }
            }
        }
        super.mo47149r();
    }
}
