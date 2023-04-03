package p000;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000 \u00032\u00020\u0001:\u0001\u000bB\u0011\b\u0000\u0012\u0006\u0010\u000e\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\u0010B\u0011\b\u0016\u0012\u0006\u0010\u0011\u001a\u00020\u0002¢\u0006\u0004\b\u000f\u0010\u0012J\u0006\u0010\u0003\u001a\u00020\u0002J\u0013\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001H\u0002J\b\u0010\b\u001a\u00020\u0007H\u0016J\b\u0010\t\u001a\u00020\u0002H\u0016R\u001a\u0010\u000e\u001a\u00020\n8\u0000X\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\r¨\u0006\u0013"}, mo44877d2 = {"Lqj3;", "", "", "b", "other", "", "equals", "", "hashCode", "toString", "Ljp4;", "a", "Ljp4;", "()Ljp4;", "platformLocale", "<init>", "(Ljp4;)V", "languageTag", "(Ljava/lang/String;)V", "ui-text_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: qj3 */
/* compiled from: Locale.kt */
public final class qj3 {

    /* renamed from: b */
    public static final C3149a f16953b = new C3149a((DefaultConstructorMarker) null);

    /* renamed from: a */
    public final jp4 f16954a;

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0005\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\b"}, mo44877d2 = {"Lqj3$a;", "", "Lqj3;", "a", "()Lqj3;", "current", "<init>", "()V", "ui-text_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: qj3$a */
    /* compiled from: Locale.kt */
    public static final class C3149a {
        public C3149a() {
        }

        public /* synthetic */ C3149a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final qj3 mo25124a() {
            return new qj3(lp4.m21697a().mo22471a().get(0));
        }
    }

    public qj3(jp4 jp4) {
        vx2.m53591g(jp4, "platformLocale");
        this.f16954a = jp4;
    }

    /* renamed from: a */
    public final jp4 mo25119a() {
        return this.f16954a;
    }

    /* renamed from: b */
    public final String mo25120b() {
        return this.f16954a.mo22030a();
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof qj3)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return vx2.m53586b(mo25120b(), ((qj3) obj).mo25120b());
    }

    public int hashCode() {
        return mo25120b().hashCode();
    }

    public String toString() {
        return mo25120b();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public qj3(String str) {
        this(lp4.m21697a().mo22472b(str));
        vx2.m53591g(str, "languageTag");
    }
}
