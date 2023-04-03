package p000;

import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000e\b\b\u0018\u00002\u00020\u0001B'\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0013\u0010\u0014J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u000f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\n\u001a\u0004\b\u000e\u0010\fR\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0010\u001a\u0004\b\t\u0010\u0011¨\u0006\u0015"}, mo44877d2 = {"Lzh0;", "", "", "toString", "", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "url", "b", "symbol", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "imgResId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: zh0 */
/* compiled from: CMC.kt */
public final class zh0 {

    /* renamed from: a */
    public final String f46382a;

    /* renamed from: b */
    public final String f46383b;

    /* renamed from: c */
    public final Integer f46384c;

    public zh0(String str, String str2, Integer num) {
        vx2.m53591g(str2, "symbol");
        this.f46382a = str;
        this.f46383b = str2;
        this.f46384c = num;
    }

    /* renamed from: a */
    public final Integer mo67300a() {
        return this.f46384c;
    }

    /* renamed from: b */
    public final String mo67301b() {
        return this.f46383b;
    }

    /* renamed from: c */
    public final String mo67302c() {
        return this.f46382a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zh0)) {
            return false;
        }
        zh0 zh0 = (zh0) obj;
        return vx2.m53586b(this.f46382a, zh0.f46382a) && vx2.m53586b(this.f46383b, zh0.f46383b) && vx2.m53586b(this.f46384c, zh0.f46384c);
    }

    public int hashCode() {
        String str = this.f46382a;
        int i = 0;
        int hashCode = (((str == null ? 0 : str.hashCode()) * 31) + this.f46383b.hashCode()) * 31;
        Integer num = this.f46384c;
        if (num != null) {
            i = num.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        String str = this.f46382a;
        String str2 = this.f46383b;
        Integer num = this.f46384c;
        return "CoinIconParams(url=" + str + ", symbol=" + str2 + ", imgResId=" + num + ")";
    }
}
