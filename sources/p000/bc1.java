package p000;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0002¢\u0006\u0004\b\u0012\u0010\u0010J\u0011\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\t\u0010\u0007\u001a\u00020\u0006HÖ\u0001J\t\u0010\b\u001a\u00020\u0002HÖ\u0001J\u0013\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\"\u0010\u0011\u001a\u00020\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\f\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, mo44877d2 = {"Lbc1;", "", "", "that", "Lr37;", "b", "", "toString", "hashCode", "other", "", "equals", "a", "I", "()I", "c", "(I)V", "count", "<init>", "runtime_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: bc1 */
/* compiled from: MutableCounter.kt */
public final class bc1 {

    /* renamed from: a */
    public int f8042a;

    public bc1() {
        this(0, 1, (DefaultConstructorMarker) null);
    }

    public bc1(int i) {
        this.f8042a = i;
    }

    /* renamed from: a */
    public final int mo11475a() {
        return this.f8042a;
    }

    /* renamed from: b */
    public final void mo11476b(int i) {
        this.f8042a += i;
    }

    /* renamed from: c */
    public final void mo11477c(int i) {
        this.f8042a = i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bc1) && this.f8042a == ((bc1) obj).f8042a;
    }

    public int hashCode() {
        return this.f8042a;
    }

    public String toString() {
        return "DeltaCounter(count=" + this.f8042a + ')';
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bc1(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i);
    }
}
