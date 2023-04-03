package p000;

import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p000.f36;

/* renamed from: mu2 */
/* compiled from: InlineClassRepresentation.kt */
public final class mu2<Type extends f36> extends d87<Type> {

    /* renamed from: a */
    public final r24 f41012a;

    /* renamed from: b */
    public final Type f41013b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public mu2(r24 r24, Type type) {
        super((DefaultConstructorMarker) null);
        vx2.m53591g(r24, "underlyingPropertyName");
        vx2.m53591g(type, "underlyingType");
        this.f41012a = r24;
        this.f41013b = type;
    }

    /* renamed from: a */
    public List<Pair<r24, Type>> mo51152a() {
        return bk0.m32598e(wy6.m54142a(this.f41012a, this.f41013b));
    }

    /* renamed from: c */
    public final r24 mo56329c() {
        return this.f41012a;
    }

    /* renamed from: d */
    public final Type mo56330d() {
        return this.f41013b;
    }
}
