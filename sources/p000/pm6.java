package p000;

import android.os.Bundle;
import com.google.android.gms.common.api.C4013a;
import com.google.errorprone.annotations.CanIgnoreReturnValue;

/* renamed from: pm6 */
/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
public class pm6 implements C4013a.C4017d {

    /* renamed from: d */
    public static final pm6 f32744d = m50008a().mo46785a();

    /* renamed from: a */
    public final String f32745a;

    /* renamed from: pm6$a */
    /* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
    public static class C6365a {

        /* renamed from: a */
        public String f32746a;

        public /* synthetic */ C6365a(zx7 zx7) {
        }

        /* renamed from: a */
        public pm6 mo46785a() {
            return new pm6(this.f32746a, (by7) null);
        }

        @CanIgnoreReturnValue
        /* renamed from: b */
        public C6365a mo46786b(String str) {
            this.f32746a = str;
            return this;
        }
    }

    public /* synthetic */ pm6(String str, by7 by7) {
        this.f32745a = str;
    }

    /* renamed from: a */
    public static C6365a m50008a() {
        return new C6365a((zx7) null);
    }

    /* renamed from: b */
    public final Bundle mo46782b() {
        Bundle bundle = new Bundle();
        String str = this.f32745a;
        if (str != null) {
            bundle.putString("api", str);
        }
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof pm6)) {
            return false;
        }
        return if4.m45709a(this.f32745a, ((pm6) obj).f32745a);
    }

    public final int hashCode() {
        return if4.m45710b(this.f32745a);
    }
}
