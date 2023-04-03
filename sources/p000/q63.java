package p000;

import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0012\b\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u000e\u001a\u00020\t\u0012\u0006\u0010\u0013\u001a\u00020\u0002\u0012\u0006\u0010\u0015\u001a\u00020\u0002\u0012\u0006\u0010\u0016\u001a\u00020\u0002\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u000e\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0013\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0015\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0010\u001a\u0004\b\u000f\u0010\u0012R\u0017\u0010\u0016\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0010\u001a\u0004\b\n\u0010\u0012R\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0010\u001a\u0004\b\u0014\u0010\u0012¨\u0006\u001b"}, mo44877d2 = {"Lq63;", "", "", "toString", "", "hashCode", "other", "", "equals", "", "a", "J", "getId", "()J", "id", "b", "Ljava/lang/String;", "d", "()Ljava/lang/String;", "topic", "c", "method", "body", "e", "response", "<init>", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "sdk_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: q63 */
/* compiled from: JsonRpcHistoryRecord.kt */
public final class q63 {

    /* renamed from: a */
    public final long f32948a;

    /* renamed from: b */
    public final String f32949b;

    /* renamed from: c */
    public final String f32950c;

    /* renamed from: d */
    public final String f32951d;

    /* renamed from: e */
    public final String f32952e;

    public q63(long j, String str, String str2, String str3, String str4) {
        vx2.m53591g(str, "topic");
        vx2.m53591g(str2, "method");
        vx2.m53591g(str3, "body");
        this.f32948a = j;
        this.f32949b = str;
        this.f32950c = str2;
        this.f32951d = str3;
        this.f32952e = str4;
    }

    /* renamed from: a */
    public final String mo46978a() {
        return this.f32951d;
    }

    /* renamed from: b */
    public final String mo46979b() {
        return this.f32950c;
    }

    /* renamed from: c */
    public final String mo46980c() {
        return this.f32952e;
    }

    /* renamed from: d */
    public final String mo46981d() {
        return this.f32949b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q63)) {
            return false;
        }
        q63 q63 = (q63) obj;
        return this.f32948a == q63.f32948a && vx2.m53586b(this.f32949b, q63.f32949b) && vx2.m53586b(this.f32950c, q63.f32950c) && vx2.m53586b(this.f32951d, q63.f32951d) && vx2.m53586b(this.f32952e, q63.f32952e);
    }

    public int hashCode() {
        int a = ((((((au0.m10781a(this.f32948a) * 31) + this.f32949b.hashCode()) * 31) + this.f32950c.hashCode()) * 31) + this.f32951d.hashCode()) * 31;
        String str = this.f32952e;
        return a + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        long j = this.f32948a;
        String str = this.f32949b;
        String str2 = this.f32950c;
        String str3 = this.f32951d;
        String str4 = this.f32952e;
        return "JsonRpcHistoryRecord(id=" + j + ", topic=" + str + ", method=" + str2 + ", body=" + str3 + ", response=" + str4 + ")";
    }
}
