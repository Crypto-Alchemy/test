package p000;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: nc3 */
/* compiled from: KotlinClassFinder.kt */
public interface nc3 extends wc3 {

    /* renamed from: nc3$a */
    /* compiled from: KotlinClassFinder.kt */
    public static abstract class C7933a {

        /* renamed from: nc3$a$a */
        /* compiled from: KotlinClassFinder.kt */
        public static final class C7934a extends C7933a {

            /* renamed from: a */
            public final byte[] f41150a;

            /* renamed from: b */
            public final byte[] mo56451b() {
                return this.f41150a;
            }
        }

        /* renamed from: nc3$a$b */
        /* compiled from: KotlinClassFinder.kt */
        public static final class C7935b extends C7933a {

            /* renamed from: a */
            public final tc3 f41151a;

            /* renamed from: b */
            public final byte[] f41152b;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C7935b(tc3 tc3, byte[] bArr) {
                super((DefaultConstructorMarker) null);
                vx2.m53591g(tc3, "kotlinJvmBinaryClass");
                this.f41151a = tc3;
                this.f41152b = bArr;
            }

            /* renamed from: b */
            public final tc3 mo56452b() {
                return this.f41151a;
            }

            /* JADX INFO: this call moved to the top of the method (can break code semantics) */
            public /* synthetic */ C7935b(tc3 tc3, byte[] bArr, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this(tc3, (i & 2) != 0 ? null : bArr);
            }
        }

        public C7933a() {
        }

        public /* synthetic */ C7933a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final tc3 mo56450a() {
            C7935b bVar;
            if (this instanceof C7935b) {
                bVar = (C7935b) this;
            } else {
                bVar = null;
            }
            if (bVar != null) {
                return bVar.mo56452b();
            }
            return null;
        }
    }

    /* renamed from: a */
    C7933a mo56448a(p03 p03);

    /* renamed from: c */
    C7933a mo56449c(nf0 nf0);
}
