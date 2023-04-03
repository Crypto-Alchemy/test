package p000;

import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\b\b@\u0018\u00002\u00020\u0001B\u0012\u0012\u0006\u0010\u0011\u001a\u00020\fø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\u0011\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\u0001\u0011\u0001\u00020\fø\u0001\u0000\u0002\u0004\n\u0002\b\u0019¨\u0006\u0014"}, mo44877d2 = {"Lmr4;", "", "", "f", "(J)Ljava/lang/String;", "", "e", "(J)I", "other", "", "c", "(JLjava/lang/Object;)Z", "", "a", "J", "getValue", "()J", "value", "b", "(J)J", "ui_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: mr4 */
/* compiled from: PointerEvent.kt */
public final class mr4 {

    /* renamed from: a */
    public final long f15240a;

    public /* synthetic */ mr4(long j) {
        this.f15240a = j;
    }

    /* renamed from: a */
    public static final /* synthetic */ mr4 m22620a(long j) {
        return new mr4(j);
    }

    /* renamed from: b */
    public static long m22621b(long j) {
        return j;
    }

    /* renamed from: c */
    public static boolean m22622c(long j, Object obj) {
        return (obj instanceof mr4) && j == ((mr4) obj).mo23380g();
    }

    /* renamed from: d */
    public static final boolean m22623d(long j, long j2) {
        return j == j2;
    }

    /* renamed from: e */
    public static int m22624e(long j) {
        return au0.m10781a(j);
    }

    /* renamed from: f */
    public static String m22625f(long j) {
        return "PointerId(value=" + j + ')';
    }

    public boolean equals(Object obj) {
        return m22622c(this.f15240a, obj);
    }

    /* renamed from: g */
    public final /* synthetic */ long mo23380g() {
        return this.f15240a;
    }

    public int hashCode() {
        return m22624e(this.f15240a);
    }

    public String toString() {
        return m22625f(this.f15240a);
    }
}
