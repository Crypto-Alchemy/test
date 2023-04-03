package p000;

import com.google.errorprone.annotations.Immutable;
import java.security.GeneralSecurityException;
import java.util.Objects;

/* renamed from: pd */
/* compiled from: AesCmacParameters */
public final class C6345pd extends om3 {

    /* renamed from: a */
    public final int f32655a;

    /* renamed from: b */
    public final C6346a f32656b;

    @Immutable
    /* renamed from: pd$a */
    /* compiled from: AesCmacParameters */
    public static final class C6346a {

        /* renamed from: b */
        public static final C6346a f32657b = new C6346a("TINK");

        /* renamed from: c */
        public static final C6346a f32658c = new C6346a("CRUNCHY");

        /* renamed from: d */
        public static final C6346a f32659d = new C6346a("LEGACY");

        /* renamed from: e */
        public static final C6346a f32660e = new C6346a("NO_PREFIX");

        /* renamed from: a */
        public final String f32661a;

        public C6346a(String str) {
            this.f32661a = str;
        }

        public String toString() {
            return this.f32661a;
        }
    }

    public C6345pd(int i, C6346a aVar) {
        this.f32655a = i;
        this.f32656b = aVar;
    }

    /* renamed from: a */
    public static C6345pd m49860a(int i, C6346a aVar) throws GeneralSecurityException {
        if (i >= 10 && 16 >= i) {
            return new C6345pd(i, aVar);
        }
        throw new GeneralSecurityException("Invalid tag size for AesCmacParameters: " + i);
    }

    /* renamed from: b */
    public int mo46695b() {
        return this.f32655a;
    }

    /* renamed from: c */
    public int mo46696c() {
        int b;
        C6346a aVar = this.f32656b;
        if (aVar == C6346a.f32660e) {
            return mo46695b();
        }
        if (aVar == C6346a.f32657b) {
            b = mo46695b();
        } else if (aVar == C6346a.f32658c) {
            b = mo46695b();
        } else if (aVar == C6346a.f32659d) {
            b = mo46695b();
        } else {
            throw new IllegalStateException("Unknown variant");
        }
        return b + 5;
    }

    /* renamed from: d */
    public C6346a mo46697d() {
        return this.f32656b;
    }

    /* renamed from: e */
    public boolean mo46698e() {
        if (this.f32656b != C6346a.f32660e) {
            return true;
        }
        return false;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C6345pd)) {
            return false;
        }
        C6345pd pdVar = (C6345pd) obj;
        if (pdVar.mo46696c() == mo46696c() && pdVar.mo46697d() == mo46697d()) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return Objects.hash(new Object[]{Integer.valueOf(this.f32655a), this.f32656b});
    }

    public String toString() {
        return "AES-CMAC Parameters (variant: " + this.f32656b + ", " + this.f32655a + "-byte tags)";
    }
}
