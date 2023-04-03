package p000;

import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p000.f36;

/* renamed from: d87 */
/* compiled from: ValueClassRepresentation.kt */
public abstract class d87<Type extends f36> {
    public d87() {
    }

    public /* synthetic */ d87(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* renamed from: a */
    public abstract List<Pair<r24, Type>> mo51152a();

    /* renamed from: b */
    public final <Other extends f36> d87<Other> mo51153b(rc2<? super Type, ? extends Other> rc2) {
        vx2.m53591g(rc2, "transform");
        if (this instanceof mu2) {
            mu2 mu2 = (mu2) this;
            return new mu2(mu2.mo56329c(), (f36) rc2.invoke(mu2.mo56330d()));
        } else if (this instanceof oz3) {
            List<Pair> a = mo51152a();
            ArrayList arrayList = new ArrayList(dk0.m43495u(a, 10));
            for (Pair pair : a) {
                arrayList.add(wy6.m54142a((r24) pair.component1(), rc2.invoke((f36) pair.component2())));
            }
            return new oz3(arrayList);
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }
}
