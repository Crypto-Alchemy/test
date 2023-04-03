package p000;

import com.google.android.gms.common.api.C4013a;
import com.google.android.gms.common.api.C4013a.C4017d;

/* renamed from: nm */
/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
public final class C6286nm<O extends C4013a.C4017d> {

    /* renamed from: a */
    public final int f32143a;

    /* renamed from: b */
    public final C4013a f32144b;

    /* renamed from: c */
    public final C4013a.C4017d f32145c;

    /* renamed from: d */
    public final String f32146d;

    public C6286nm(C4013a aVar, C4013a.C4017d dVar, String str) {
        this.f32144b = aVar;
        this.f32145c = dVar;
        this.f32146d = str;
        this.f32143a = if4.m45710b(aVar, dVar, str);
    }

    /* renamed from: a */
    public static <O extends C4013a.C4017d> C6286nm<O> m48824a(C4013a<O> aVar, O o, String str) {
        return new C6286nm<>(aVar, o, str);
    }

    /* renamed from: b */
    public final String mo46101b() {
        return this.f32144b.mo30536d();
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C6286nm)) {
            return false;
        }
        C6286nm nmVar = (C6286nm) obj;
        if (!if4.m45709a(this.f32144b, nmVar.f32144b) || !if4.m45709a(this.f32145c, nmVar.f32145c) || !if4.m45709a(this.f32146d, nmVar.f32146d)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f32143a;
    }
}
