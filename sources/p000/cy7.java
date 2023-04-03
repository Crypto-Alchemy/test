package p000;

import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: cy7 */
/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
public final class cy7 {

    /* renamed from: a */
    public final Map f27993a = Collections.synchronizedMap(new WeakHashMap());

    /* renamed from: b */
    public final Map f27994b = Collections.synchronizedMap(new WeakHashMap());

    /* renamed from: c */
    public final void mo41774c(BasePendingResult basePendingResult, boolean z) {
        this.f27993a.put(basePendingResult, Boolean.valueOf(z));
        basePendingResult.mo30574a(new yx7(this, basePendingResult));
    }

    /* renamed from: d */
    public final void mo41775d(xl6 xl6, boolean z) {
        this.f27994b.put(xl6, Boolean.valueOf(z));
        xl6.mo49503a().mo48131b(new ay7(this, xl6));
    }

    /* renamed from: e */
    public final void mo41776e(int i, String str) {
        StringBuilder sb = new StringBuilder("The connection to Google Play services was lost");
        if (i == 1) {
            sb.append(" due to service disconnection.");
        } else if (i == 3) {
            sb.append(" due to dead object exception.");
        }
        if (str != null) {
            sb.append(" Last reason for disconnect: ");
            sb.append(str);
        }
        mo41779h(true, new Status(20, sb.toString()));
    }

    /* renamed from: f */
    public final void mo41777f() {
        mo41779h(false, bi2.f21324Q);
    }

    /* renamed from: g */
    public final boolean mo41778g() {
        if (!this.f27993a.isEmpty() || !this.f27994b.isEmpty()) {
            return true;
        }
        return false;
    }

    /* renamed from: h */
    public final void mo41779h(boolean z, Status status) {
        HashMap hashMap;
        HashMap hashMap2;
        synchronized (this.f27993a) {
            hashMap = new HashMap(this.f27993a);
        }
        synchronized (this.f27994b) {
            hashMap2 = new HashMap(this.f27994b);
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            if (z || ((Boolean) entry.getValue()).booleanValue()) {
                ((BasePendingResult) entry.getKey()).mo30577d(status);
            }
        }
        for (Map.Entry entry2 : hashMap2.entrySet()) {
            if (z || ((Boolean) entry2.getValue()).booleanValue()) {
                ((xl6) entry2.getKey()).mo49506d(new ApiException(status));
            }
        }
    }
}
