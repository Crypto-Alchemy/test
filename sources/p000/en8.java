package p000;

import android.os.Bundle;
import com.google.android.gms.measurement.internal.zzaq;
import com.google.android.gms.measurement.internal.zzas;

/* renamed from: en8 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@19.0.0 */
public final class en8 {

    /* renamed from: a */
    public final String f28638a;

    /* renamed from: b */
    public final String f28639b;

    /* renamed from: c */
    public final long f28640c;

    /* renamed from: d */
    public final Bundle f28641d;

    public en8(String str, String str2, Bundle bundle, long j) {
        this.f28638a = str;
        this.f28639b = str2;
        this.f28641d = bundle;
        this.f28640c = j;
    }

    /* renamed from: a */
    public static en8 m43994a(zzas zzas) {
        return new en8(zzas.f23074a, zzas.f23076e, zzas.f23075d.mo31419w1(), zzas.f23077g);
    }

    /* renamed from: b */
    public final zzas mo42331b() {
        return new zzas(this.f28638a, new zzaq(new Bundle(this.f28641d)), this.f28639b, this.f28640c);
    }

    public final String toString() {
        String str = this.f28639b;
        String str2 = this.f28638a;
        String valueOf = String.valueOf(this.f28641d);
        int length = String.valueOf(str).length();
        StringBuilder sb = new StringBuilder(length + 21 + String.valueOf(str2).length() + valueOf.length());
        sb.append("origin=");
        sb.append(str);
        sb.append(",name=");
        sb.append(str2);
        sb.append(",params=");
        sb.append(valueOf);
        return sb.toString();
    }
}
