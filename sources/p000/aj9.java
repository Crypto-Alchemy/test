package p000;

import com.google.android.gms.internal.firebase_messaging.zzy;
import java.lang.annotation.Annotation;

/* renamed from: aj9 */
/* compiled from: com.google.firebase:firebase-messaging@@22.0.0 */
public final class aj9 implements ok9 {

    /* renamed from: a */
    public final int f20963a;

    /* renamed from: b */
    public final zzy f20964b;

    public aj9(int i, zzy zzy) {
        this.f20963a = i;
        this.f20964b = zzy;
    }

    public final Class<? extends Annotation> annotationType() {
        return ok9.class;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ok9)) {
            return false;
        }
        ok9 ok9 = (ok9) obj;
        if (this.f20963a != ok9.zza() || !this.f20964b.equals(ok9.zzb())) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (this.f20963a ^ 14552422) + (this.f20964b.hashCode() ^ 2041407134);
    }

    public final String toString() {
        return "@com.google.firebase.encoders.proto.Protobuf" + "(tag=" + this.f20963a + "intEncoding=" + this.f20964b + ')';
    }

    public final int zza() {
        return this.f20963a;
    }

    public final zzy zzb() {
        return this.f20964b;
    }
}
