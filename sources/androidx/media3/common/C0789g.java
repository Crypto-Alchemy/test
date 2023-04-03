package androidx.media3.common;

import android.util.SparseBooleanArray;

/* renamed from: androidx.media3.common.g */
/* compiled from: FlagSet */
public final class C0789g {

    /* renamed from: a */
    public final SparseBooleanArray f4168a;

    /* renamed from: androidx.media3.common.g$b */
    /* compiled from: FlagSet */
    public static final class C0791b {

        /* renamed from: a */
        public final SparseBooleanArray f4169a = new SparseBooleanArray();

        /* renamed from: b */
        public boolean f4170b;

        /* renamed from: a */
        public C0791b mo6631a(int i) {
            C2725kr.m20987g(!this.f4170b);
            this.f4169a.append(i, true);
            return this;
        }

        /* renamed from: b */
        public C0791b mo6632b(C0789g gVar) {
            for (int i = 0; i < gVar.mo6628d(); i++) {
                mo6631a(gVar.mo6627c(i));
            }
            return this;
        }

        /* renamed from: c */
        public C0791b mo6633c(int... iArr) {
            for (int a : iArr) {
                mo6631a(a);
            }
            return this;
        }

        /* renamed from: d */
        public C0791b mo6634d(int i, boolean z) {
            if (z) {
                return mo6631a(i);
            }
            return this;
        }

        /* renamed from: e */
        public C0789g mo6635e() {
            C2725kr.m20987g(!this.f4170b);
            this.f4170b = true;
            return new C0789g(this.f4169a);
        }
    }

    /* renamed from: a */
    public boolean mo6625a(int i) {
        return this.f4168a.get(i);
    }

    /* renamed from: b */
    public boolean mo6626b(int... iArr) {
        for (int a : iArr) {
            if (mo6625a(a)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: c */
    public int mo6627c(int i) {
        C2725kr.m20983c(i, 0, mo6628d());
        return this.f4168a.keyAt(i);
    }

    /* renamed from: d */
    public int mo6628d() {
        return this.f4168a.size();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0789g)) {
            return false;
        }
        C0789g gVar = (C0789g) obj;
        if (w67.f19021a >= 24) {
            return this.f4168a.equals(gVar.f4168a);
        }
        if (mo6628d() != gVar.mo6628d()) {
            return false;
        }
        for (int i = 0; i < mo6628d(); i++) {
            if (mo6627c(i) != gVar.mo6627c(i)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        if (w67.f19021a >= 24) {
            return this.f4168a.hashCode();
        }
        int d = mo6628d();
        for (int i = 0; i < mo6628d(); i++) {
            d = (d * 31) + mo6627c(i);
        }
        return d;
    }

    public C0789g(SparseBooleanArray sparseBooleanArray) {
        this.f4168a = sparseBooleanArray;
    }
}
