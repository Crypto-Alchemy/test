package p000;

import android.annotation.SuppressLint;

/* renamed from: mi4 */
/* compiled from: Operation */
public interface mi4 {
    @SuppressLint({"SyntheticAccessor"})

    /* renamed from: a */
    public static final C2835b.C2838c f14990a = new C2835b.C2838c();
    @SuppressLint({"SyntheticAccessor"})

    /* renamed from: b */
    public static final C2835b.C2837b f14991b = new C2835b.C2837b();

    /* renamed from: mi4$b */
    /* compiled from: Operation */
    public static abstract class C2835b {

        /* renamed from: mi4$b$a */
        /* compiled from: Operation */
        public static final class C2836a extends C2835b {

            /* renamed from: a */
            public final Throwable f14992a;

            public C2836a(Throwable th) {
                this.f14992a = th;
            }

            /* renamed from: a */
            public Throwable mo23200a() {
                return this.f14992a;
            }

            public String toString() {
                return String.format("FAILURE (%s)", new Object[]{this.f14992a.getMessage()});
            }
        }

        /* renamed from: mi4$b$b */
        /* compiled from: Operation */
        public static final class C2837b extends C2835b {
            public String toString() {
                return "IN_PROGRESS";
            }

            public C2837b() {
            }
        }

        /* renamed from: mi4$b$c */
        /* compiled from: Operation */
        public static final class C2838c extends C2835b {
            public String toString() {
                return "SUCCESS";
            }

            public C2838c() {
            }
        }
    }
}
