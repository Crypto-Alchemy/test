package p000;

import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.C6177b;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p000.f36;

/* renamed from: oz3 */
/* compiled from: MultiFieldValueClassRepresentation.kt */
public final class oz3<Type extends f36> extends d87<Type> {

    /* renamed from: a */
    public final List<Pair<r24, Type>> f43963a;

    /* renamed from: b */
    public final Map<r24, Type> f43964b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public oz3(List<? extends Pair<r24, ? extends Type>> list) {
        super((DefaultConstructorMarker) null);
        boolean z;
        vx2.m53591g(list, "underlyingPropertyNamesToTypes");
        this.f43963a = list;
        Map<r24, Type> q = C6177b.m47369q(mo51152a());
        if (q.size() == mo51152a().size()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            this.f43964b = q;
            return;
        }
        throw new IllegalArgumentException("Some properties have the same names".toString());
    }

    /* renamed from: a */
    public List<Pair<r24, Type>> mo51152a() {
        return this.f43963a;
    }
}
