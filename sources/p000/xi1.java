package p000;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p000.vi1;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u0005\b@\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u0014\b\u0000\u0012\u0006\u0010\f\u001a\u00020\u000bø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eR#\u0010\u0007\u001a\u00020\u00028FX\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\u0012\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0003\u0010\u0004R#\u0010\n\u001a\u00020\u00028FX\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\u0012\u0004\b\t\u0010\u0006\u001a\u0004\b\b\u0010\u0004\u0001\f\u0001\u00020\u000bø\u0001\u0000\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0010"}, mo44877d2 = {"Lxi1;", "", "Lvi1;", "e", "(J)F", "getWidth-D9Ej5fM$annotations", "()V", "width", "d", "getHeight-D9Ej5fM$annotations", "height", "", "packedValue", "c", "(J)J", "a", "ui-unit_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: xi1 */
/* compiled from: Dp.kt */
public final class xi1 {

    /* renamed from: a */
    public static final C3602a f19843a = new C3602a((DefaultConstructorMarker) null);

    /* renamed from: b */
    public static final long f19844b;

    /* renamed from: c */
    public static final long f19845c;

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nR \u0010\u0003\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R \u0010\u0007\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0007\u0010\u0004\u001a\u0004\b\b\u0010\u0006\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u000b"}, mo44877d2 = {"Lxi1$a;", "", "Lxi1;", "Zero", "J", "b", "()J", "Unspecified", "a", "<init>", "()V", "ui-unit_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: xi1$a */
    /* compiled from: Dp.kt */
    public static final class C3602a {
        public C3602a() {
        }

        public /* synthetic */ C3602a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final long mo27746a() {
            return xi1.f19845c;
        }

        /* renamed from: b */
        public final long mo27747b() {
            return xi1.f19844b;
        }
    }

    static {
        float f = (float) 0;
        f19844b = wi1.m29599a(vi1.m28816d(f), vi1.m28816d(f));
        vi1.C3489a aVar = vi1.f18795a;
        f19845c = wi1.m29599a(aVar.mo27151a(), aVar.mo27151a());
    }

    /* renamed from: c */
    public static long m30114c(long j) {
        return j;
    }

    /* renamed from: d */
    public static final float m30115d(long j) {
        boolean z;
        if (j != f19845c) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            q42 q42 = q42.f32916a;
            return vi1.m28816d(Float.intBitsToFloat((int) (j & 4294967295L)));
        }
        throw new IllegalStateException("DpSize is unspecified".toString());
    }

    /* renamed from: e */
    public static final float m30116e(long j) {
        boolean z;
        if (j != f19845c) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            q42 q42 = q42.f32916a;
            return vi1.m28816d(Float.intBitsToFloat((int) (j >> 32)));
        }
        throw new IllegalStateException("DpSize is unspecified".toString());
    }
}
