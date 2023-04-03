package p000;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.StringsKt__StringsKt;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0010\b\b\u0018\u0000 \u00122\u00020\u0001:\u0001\tB\u000f\u0012\u0006\u0010\r\u001a\u00020\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u000f\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\fR\u0011\u0010\u0011\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\fR\u0011\u0010\u0013\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\fR\u0011\u0010\u0014\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\t\u0010\f¨\u0006\u0017"}, mo44877d2 = {"Lqy2;", "", "", "toString", "", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", "e", "()Ljava/lang/String;", "value", "c", "chainId", "d", "chainIdReference", "b", "address", "accountId", "<init>", "(Ljava/lang/String;)V", "sdk_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: qy2 */
/* compiled from: Issuer.kt */
public final class qy2 {

    /* renamed from: b */
    public static final C6428a f33299b = new C6428a((DefaultConstructorMarker) null);

    /* renamed from: a */
    public final String f33300a;

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u0003\u001a\u00020\u00028\u0006XT¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0006XT¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u00058\u0006XT¢\u0006\u0006\n\u0004\b\b\u0010\u0007R\u0014\u0010\t\u001a\u00020\u00058\u0006XT¢\u0006\u0006\n\u0004\b\t\u0010\u0007¨\u0006\f"}, mo44877d2 = {"Lqy2$a;", "", "", "ISS_DELIMITER", "Ljava/lang/String;", "", "ISS_POSITION_OF_ADDRESS", "I", "ISS_POSITION_OF_NAMESPACE", "ISS_POSITION_OF_REFERENCE", "<init>", "()V", "sdk_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: qy2$a */
    /* compiled from: Issuer.kt */
    public static final class C6428a {
        public C6428a() {
        }

        public /* synthetic */ C6428a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public qy2(String str) {
        vx2.m53591g(str, "value");
        this.f33300a = str;
    }

    /* renamed from: a */
    public final String mo47304a() {
        String c = mo47306c();
        String b = mo47305b();
        return c + ":" + b;
    }

    /* renamed from: b */
    public final String mo47305b() {
        return (String) StringsKt__StringsKt.m63061B0(this.f33300a, new String[]{":"}, false, 0, 6, (Object) null).get(4);
    }

    /* renamed from: c */
    public final String mo47306c() {
        Object obj = StringsKt__StringsKt.m63061B0(this.f33300a, new String[]{":"}, false, 0, 6, (Object) null).get(2);
        Object obj2 = StringsKt__StringsKt.m63061B0(this.f33300a, new String[]{":"}, false, 0, 6, (Object) null).get(3);
        return obj + ":" + obj2;
    }

    /* renamed from: d */
    public final String mo47307d() {
        return (String) StringsKt__StringsKt.m63061B0(this.f33300a, new String[]{":"}, false, 0, 6, (Object) null).get(3);
    }

    /* renamed from: e */
    public final String mo47308e() {
        return this.f33300a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qy2) && vx2.m53586b(this.f33300a, ((qy2) obj).f33300a);
    }

    public int hashCode() {
        return this.f33300a.hashCode();
    }

    public String toString() {
        String str = this.f33300a;
        return "Issuer(value=" + str + ")";
    }
}
