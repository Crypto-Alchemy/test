package p000;

import android.util.Log;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: sm8 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@19.0.0 */
public final class sm8 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f33966a;

    /* renamed from: d */
    public final /* synthetic */ String f33967d;

    /* renamed from: e */
    public final /* synthetic */ Object f33968e;

    /* renamed from: g */
    public final /* synthetic */ Object f33969g;

    /* renamed from: k */
    public final /* synthetic */ Object f33970k;

    /* renamed from: r */
    public final /* synthetic */ bn8 f33971r;

    public sm8(bn8 bn8, int i, String str, Object obj, Object obj2, Object obj3) {
        this.f33971r = bn8;
        this.f33966a = i;
        this.f33967d = str;
        this.f33968e = obj;
        this.f33969g = obj2;
        this.f33970k = obj3;
    }

    public final void run() {
        lp8 z = this.f33971r.f34342a.mo45275z();
        if (z.mo48800h()) {
            if (this.f33971r.f21425c == 0) {
                if (this.f33971r.f34342a.mo45274y().mo45991n()) {
                    bn8 bn8 = this.f33971r;
                    bn8.f34342a.mo45257b();
                    char unused = bn8.f21425c = 'C';
                } else {
                    bn8 bn82 = this.f33971r;
                    bn82.f34342a.mo45257b();
                    char unused2 = bn82.f21425c = 'c';
                }
            }
            if (this.f33971r.f21426d < 0) {
                bn8 bn83 = this.f33971r;
                bn83.f34342a.mo45274y().mo45990m();
                long unused3 = bn83.f21426d = 42004;
            }
            char charAt = "01VDIWEA?".charAt(this.f33966a);
            char C = this.f33971r.f21425c;
            long E = this.f33971r.f21426d;
            String z2 = bn8.m32665z(true, this.f33967d, this.f33968e, this.f33969g, this.f33970k);
            StringBuilder sb = new StringBuilder(String.valueOf(z2).length() + 24);
            sb.append("2");
            sb.append(charAt);
            sb.append(C);
            sb.append(E);
            sb.append(":");
            sb.append(z2);
            String sb2 = sb.toString();
            if (sb2.length() > 1024) {
                sb2 = this.f33967d.substring(0, RecyclerView.C1231a0.FLAG_ADAPTER_FULLUPDATE);
            }
            lo8 lo8 = z.f31355d;
            if (lo8 != null) {
                lo8.mo45474a(sb2, 1);
                return;
            }
            return;
        }
        Log.println(6, this.f33971r.mo29680y(), "Persisted config not initialized. Not logging error/warn");
    }
}
