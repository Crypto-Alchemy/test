package p000;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\f\b\b\u0018\u0000 \f2\u00020\u0001:\u0001\u0003B\u0017\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u0012\u001a\u00020\u0004¢\u0006\u0004\b\u0013\u0010\u0014J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0004HÖ\u0001J\t\u0010\u0007\u001a\u00020\u0002HÖ\u0001J\u0013\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u000e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0012\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, mo44877d2 = {"Ly06;", "", "", "a", "", "b", "toString", "hashCode", "other", "", "equals", "I", "c", "()I", "code", "Ljava/lang/String;", "d", "()Ljava/lang/String;", "reason", "<init>", "(ILjava/lang/String;)V", "scarlet-core"}, mo44878k = 1, mo44879mv = {1, 5, 1})
/* renamed from: y06 */
/* compiled from: ShutdownReason.kt */
public final class y06 {

    /* renamed from: c */
    public static final C6713a f35742c = new C6713a((DefaultConstructorMarker) null);

    /* renamed from: d */
    public static final int f35743d = 1000;

    /* renamed from: e */
    public static final String f35744e = "Normal closure";

    /* renamed from: f */
    public static final y06 f35745f = new y06(1000, "Normal closure");

    /* renamed from: a */
    public final int f35746a;

    /* renamed from: b */
    public final String f35747b;

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002XD¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\t\u001a\u00020\b8\u0002XD¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\r"}, mo44877d2 = {"Ly06$a;", "", "Ly06;", "GRACEFUL", "Ly06;", "", "NORMAL_CLOSURE_REASON", "Ljava/lang/String;", "", "NORMAL_CLOSURE_STATUS_CODE", "I", "<init>", "()V", "scarlet-core"}, mo44878k = 1, mo44879mv = {1, 5, 1})
    /* renamed from: y06$a */
    /* compiled from: ShutdownReason.kt */
    public static final class C6713a {
        public C6713a() {
        }

        public /* synthetic */ C6713a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public y06(int i, String str) {
        vx2.m53591g(str, "reason");
        this.f35746a = i;
        this.f35747b = str;
    }

    /* renamed from: a */
    public final int mo49578a() {
        return this.f35746a;
    }

    /* renamed from: b */
    public final String mo49579b() {
        return this.f35747b;
    }

    /* renamed from: c */
    public final int mo49580c() {
        return this.f35746a;
    }

    /* renamed from: d */
    public final String mo49581d() {
        return this.f35747b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y06)) {
            return false;
        }
        y06 y06 = (y06) obj;
        return this.f35746a == y06.f35746a && vx2.m53586b(this.f35747b, y06.f35747b);
    }

    public int hashCode() {
        return (this.f35746a * 31) + this.f35747b.hashCode();
    }

    public String toString() {
        return "ShutdownReason(code=" + this.f35746a + ", reason=" + this.f35747b + ')';
    }
}
