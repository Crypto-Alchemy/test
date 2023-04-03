package p000;

import java.util.concurrent.Executor;

/* renamed from: ix */
/* compiled from: com.google.android.gms:play-services-mlkit-barcode-scanning@@18.1.0 */
public class C6011ix {

    /* renamed from: a */
    public final int f30146a;

    /* renamed from: b */
    public final Executor f30147b;

    /* renamed from: ix$a */
    /* compiled from: com.google.android.gms:play-services-mlkit-barcode-scanning@@18.1.0 */
    public static class C6012a {

        /* renamed from: a */
        public int f30148a = 0;

        /* renamed from: b */
        public Executor f30149b;

        /* renamed from: a */
        public C6011ix mo43962a() {
            return new C6011ix(this.f30148a, this.f30149b, (x48) null);
        }
    }

    public /* synthetic */ C6011ix(int i, Executor executor, x48 x48) {
        this.f30146a = i;
        this.f30147b = executor;
    }

    /* renamed from: a */
    public final int mo43959a() {
        return this.f30146a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C6011ix)) {
            return false;
        }
        C6011ix ixVar = (C6011ix) obj;
        if (this.f30146a != ixVar.f30146a || !if4.m45709a(this.f30147b, ixVar.f30147b)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return if4.m45710b(Integer.valueOf(this.f30146a), this.f30147b);
    }
}
