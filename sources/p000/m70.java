package p000;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0014\b\b\u0018\u00002\u00020\u0001B1\u0012\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0014\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\r\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0014\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0012\u001a\u0004\b\t\u0010\u0013R\u0017\u0010\u0018\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017¨\u0006\u001b"}, mo44877d2 = {"Lm70;", "", "", "toString", "", "hashCode", "other", "", "equals", "a", "Ljava/lang/Integer;", "b", "()Ljava/lang/Integer;", "itemResource", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "itemTxt", "I", "()I", "actionId", "d", "Z", "()Z", "isClickAble", "<init>", "(Ljava/lang/Integer;Ljava/lang/String;IZ)V", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: m70 */
/* compiled from: CustomConfirmation.kt */
public final class m70 {

    /* renamed from: a */
    public final Integer f40797a;

    /* renamed from: b */
    public final String f40798b;

    /* renamed from: c */
    public final int f40799c;

    /* renamed from: d */
    public final boolean f40800d;

    public m70(Integer num, String str, int i, boolean z) {
        this.f40797a = num;
        this.f40798b = str;
        this.f40799c = i;
        this.f40800d = z;
    }

    /* renamed from: a */
    public final int mo56148a() {
        return this.f40799c;
    }

    /* renamed from: b */
    public final Integer mo56149b() {
        return this.f40797a;
    }

    /* renamed from: c */
    public final String mo56150c() {
        return this.f40798b;
    }

    /* renamed from: d */
    public final boolean mo56151d() {
        return this.f40800d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m70)) {
            return false;
        }
        m70 m70 = (m70) obj;
        return vx2.m53586b(this.f40797a, m70.f40797a) && vx2.m53586b(this.f40798b, m70.f40798b) && this.f40799c == m70.f40799c && this.f40800d == m70.f40800d;
    }

    public int hashCode() {
        Integer num = this.f40797a;
        int i = 0;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.f40798b;
        if (str != null) {
            i = str.hashCode();
        }
        int i2 = (((hashCode + i) * 31) + this.f40799c) * 31;
        boolean z = this.f40800d;
        if (z) {
            z = true;
        }
        return i2 + (z ? 1 : 0);
    }

    public String toString() {
        Integer num = this.f40797a;
        String str = this.f40798b;
        int i = this.f40799c;
        boolean z = this.f40800d;
        return "CCButton(itemResource=" + num + ", itemTxt=" + str + ", actionId=" + i + ", isClickAble=" + z + ")";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m70(Integer num, String str, int i, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : num, (i2 & 2) != 0 ? null : str, i, (i2 & 8) != 0 ? false : z);
    }
}
