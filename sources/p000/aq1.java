package p000;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0001\u0001\u0005¨\u0006\u0006"}, mo44877d2 = {"Laq1;", "", "<init>", "()V", "a", "Laq1$a;", "sdk_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: aq1 */
/* compiled from: EngineDO.kt */
public abstract class aq1 {

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\u0017\u0010\u000e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u000f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\u000b\u001a\u0004\b\n\u0010\r¨\u0006\u0012"}, mo44877d2 = {"Laq1$a;", "Laq1;", "", "toString", "", "hashCode", "", "other", "", "equals", "a", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "topic", "reason", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "sdk_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: aq1$a */
    /* compiled from: EngineDO.kt */
    public static final class C3819a extends aq1 {

        /* renamed from: a */
        public final String f20979a;

        /* renamed from: b */
        public final String f20980b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3819a(String str, String str2) {
            super((DefaultConstructorMarker) null);
            vx2.m53591g(str, "topic");
            vx2.m53591g(str2, "reason");
            this.f20979a = str;
            this.f20980b = str2;
        }

        /* renamed from: a */
        public final String mo29033a() {
            return this.f20980b;
        }

        /* renamed from: b */
        public final String mo29034b() {
            return this.f20979a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C3819a)) {
                return false;
            }
            C3819a aVar = (C3819a) obj;
            return vx2.m53586b(this.f20979a, aVar.f20979a) && vx2.m53586b(this.f20980b, aVar.f20980b);
        }

        public int hashCode() {
            return (this.f20979a.hashCode() * 31) + this.f20980b.hashCode();
        }

        public String toString() {
            String str = this.f20979a;
            String str2 = this.f20980b;
            return "PairingDelete(topic=" + str + ", reason=" + str2 + ")";
        }
    }

    public aq1() {
    }

    public /* synthetic */ aq1(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
