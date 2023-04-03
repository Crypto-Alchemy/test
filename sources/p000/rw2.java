package p000;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u000b\u0018\u0000 \u00152\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0012\u0004\u0012\u00020\u00030\u0004:\u0001\u0016B\u0017\u0012\u0006\u0010\u0010\u001a\u00020\u0003\u0012\u0006\u0010\u0012\u001a\u00020\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0011\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0003H\u0002J\b\u0010\b\u001a\u00020\u0006H\u0016J\u0013\u0010\n\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\u0004H\u0002J\b\u0010\u000b\u001a\u00020\u0003H\u0016J\b\u0010\r\u001a\u00020\fH\u0016R\u0014\u0010\u0010\u001a\u00020\u00038VX\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\u00038VX\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u000f¨\u0006\u0017"}, mo44877d2 = {"Lrw2;", "Lpw2;", "Lvh0;", "", "", "value", "", "u", "isEmpty", "other", "equals", "hashCode", "", "toString", "A", "()Ljava/lang/Integer;", "start", "w", "endInclusive", "<init>", "(II)V", "k", "a", "kotlin-stdlib"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: rw2 */
/* compiled from: PrimitiveRanges.kt */
public final class rw2 extends pw2 implements vh0<Integer> {

    /* renamed from: k */
    public static final C6459a f33621k = new C6459a((DefaultConstructorMarker) null);

    /* renamed from: r */
    public static final rw2 f33622r = new rw2(1, 0);

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, mo44877d2 = {"Lrw2$a;", "", "Lrw2;", "EMPTY", "Lrw2;", "a", "()Lrw2;", "<init>", "()V", "kotlin-stdlib"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: rw2$a */
    /* compiled from: PrimitiveRanges.kt */
    public static final class C6459a {
        public C6459a() {
        }

        public /* synthetic */ C6459a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final rw2 mo47516a() {
            return rw2.f33622r;
        }
    }

    public rw2(int i, int i2) {
        super(i, i2, 1);
    }

    /* renamed from: A */
    public Integer mo47512e() {
        return Integer.valueOf(mo46910n());
    }

    public boolean equals(Object obj) {
        if (obj instanceof rw2) {
            if (!isEmpty() || !((rw2) obj).isEmpty()) {
                rw2 rw2 = (rw2) obj;
                if (!(mo46910n() == rw2.mo46910n() && mo46911q() == rw2.mo46911q())) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (mo46910n() * 31) + mo46911q();
    }

    public boolean isEmpty() {
        if (mo46910n() > mo46911q()) {
            return true;
        }
        return false;
    }

    public String toString() {
        return mo46910n() + ".." + mo46911q();
    }

    /* renamed from: u */
    public boolean mo47514u(int i) {
        if (mo46910n() > i || i > mo46911q()) {
            return false;
        }
        return true;
    }

    /* renamed from: w */
    public Integer mo47513k() {
        return Integer.valueOf(mo46911q());
    }
}
