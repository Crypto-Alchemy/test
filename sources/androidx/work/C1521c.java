package androidx.work;

import androidx.work.C1523d;

/* renamed from: androidx.work.c */
/* compiled from: OneTimeWorkRequest */
public final class C1521c extends C1523d {

    /* renamed from: androidx.work.c$a */
    /* compiled from: OneTimeWorkRequest */
    public static final class C1522a extends C1523d.C1524a<C1522a, C1521c> {
        public C1522a(Class<? extends ListenableWorker> cls) {
            super(cls);
            this.f7536c.f207d = OverwritingInputMerger.class.getName();
        }

        /* renamed from: h */
        public C1521c mo10938c() {
            if (!this.f7534a || !this.f7536c.f213j.mo23766h()) {
                return new C1521c(this);
            }
            throw new IllegalArgumentException("Cannot set backoff criteria on an idle mode job");
        }

        /* renamed from: i */
        public C1522a mo10939d() {
            return this;
        }
    }

    public C1521c(C1522a aVar) {
        super(aVar.f7535b, aVar.f7536c, aVar.f7537d);
    }

    /* renamed from: d */
    public static C1521c m10487d(Class<? extends ListenableWorker> cls) {
        return (C1521c) new C1522a(cls).mo10946b();
    }
}
