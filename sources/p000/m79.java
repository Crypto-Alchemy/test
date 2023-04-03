package p000;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: m79 */
/* compiled from: com.google.android.gms:play-services-vision-common@@19.1.3 */
public final class m79 extends o79 {
    public m79(int i) {
        super(i, (m79) null);
    }

    /* renamed from: e */
    public final void mo45694e() {
        if (!mo46333i()) {
            for (int i = 0; i < mo46334j(); i++) {
                Map.Entry h = mo46331h(i);
                if (((n09) h.getKey()).mo31194b()) {
                    h.setValue(Collections.unmodifiableList((List) h.getValue()));
                }
            }
            for (Map.Entry entry : mo46336m()) {
                if (((n09) entry.getKey()).mo31194b()) {
                    entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                }
            }
        }
        super.mo45694e();
    }
}
