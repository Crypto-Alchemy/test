package p000;

import android.content.Context;
import com.google.android.gms.internal.measurement.zzhz;

/* renamed from: ou8 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@19.0.0 */
public final class ou8 extends jx8 {

    /* renamed from: a */
    public final Context f32453a;

    /* renamed from: b */
    public final qy8<zzhz<jw8>> f32454b;

    public ou8(Context context, qy8<zzhz<jw8>> qy8) {
        if (context != null) {
            this.f32453a = context;
            this.f32454b = qy8;
            return;
        }
        throw new NullPointerException("Null context");
    }

    /* renamed from: a */
    public final Context mo44627a() {
        return this.f32453a;
    }

    /* renamed from: b */
    public final qy8<zzhz<jw8>> mo44628b() {
        return this.f32454b;
    }

    public final boolean equals(Object obj) {
        qy8<zzhz<jw8>> qy8;
        if (obj == this) {
            return true;
        }
        if (obj instanceof jx8) {
            jx8 jx8 = (jx8) obj;
            if (!this.f32453a.equals(jx8.mo44627a()) || ((qy8 = this.f32454b) != null ? !qy8.equals(jx8.mo44628b()) : jx8.mo44628b() != null)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int hashCode = (this.f32453a.hashCode() ^ 1000003) * 1000003;
        qy8<zzhz<jw8>> qy8 = this.f32454b;
        if (qy8 == null) {
            i = 0;
        } else {
            i = qy8.hashCode();
        }
        return hashCode ^ i;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f32453a);
        String valueOf2 = String.valueOf(this.f32454b);
        StringBuilder sb = new StringBuilder(valueOf.length() + 46 + valueOf2.length());
        sb.append("FlagsContext{context=");
        sb.append(valueOf);
        sb.append(", hermeticFileOverrides=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }
}
