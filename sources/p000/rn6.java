package p000;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u0000 \u00122\u00020\u0001:\u0001\nB\u001e\u0012\b\b\u0002\u0010\r\u001a\u00020\t\u0012\b\b\u0002\u0010\u000f\u001a\u00020\tø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u0013\u0010\u0004\u001a\u00020\u00032\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0002J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016R \u0010\r\u001a\u00020\t8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\fR \u0010\u000f\u001a\u00020\t8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000b\u001a\u0004\b\u000e\u0010\f\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0013"}, mo44877d2 = {"Lrn6;", "", "other", "", "equals", "", "hashCode", "", "toString", "Lgo6;", "a", "J", "()J", "firstLine", "b", "restLine", "<init>", "(JJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "c", "ui-text_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: rn6 */
/* compiled from: TextIndent.kt */
public final class rn6 {

    /* renamed from: c */
    public static final C3211a f17304c = new C3211a((DefaultConstructorMarker) null);

    /* renamed from: d */
    public static final rn6 f17305d = new rn6(0, 0, 3, (DefaultConstructorMarker) null);

    /* renamed from: a */
    public final long f17306a;

    /* renamed from: b */
    public final long f17307b;

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo44877d2 = {"Lrn6$a;", "", "<init>", "()V", "ui-text_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: rn6$a */
    /* compiled from: TextIndent.kt */
    public static final class C3211a {
        public C3211a() {
        }

        public /* synthetic */ C3211a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public rn6(long j, long j2) {
        this.f17306a = j;
        this.f17307b = j2;
    }

    public /* synthetic */ rn6(long j, long j2, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2);
    }

    /* renamed from: a */
    public final long mo25466a() {
        return this.f17306a;
    }

    /* renamed from: b */
    public final long mo25467b() {
        return this.f17307b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rn6)) {
            return false;
        }
        rn6 rn6 = (rn6) obj;
        if (go6.m18275e(this.f17306a, rn6.f17306a) && go6.m18275e(this.f17307b, rn6.f17307b)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (go6.m18279i(this.f17306a) * 31) + go6.m18279i(this.f17307b);
    }

    public String toString() {
        return "TextIndent(firstLine=" + go6.m18280j(this.f17306a) + ", restLine=" + go6.m18280j(this.f17307b) + ')';
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ rn6(long j, long j2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? ho6.m19131b(0) : j, (i & 2) != 0 ? ho6.m19131b(0) : j2, (DefaultConstructorMarker) null);
    }
}
