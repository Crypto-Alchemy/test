package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import java.util.ArrayList;
import java.util.Collection;
import kotlin.jvm.internal.Lambda;

/* compiled from: DeserializedPackageFragmentImpl.kt */
public final class DeserializedPackageFragmentImpl$initialize$1 extends Lambda implements pc2<Collection<? extends r24>> {
    public final /* synthetic */ DeserializedPackageFragmentImpl this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DeserializedPackageFragmentImpl$initialize$1(DeserializedPackageFragmentImpl deserializedPackageFragmentImpl) {
        super(0);
        this.this$0 = deserializedPackageFragmentImpl;
    }

    public final Collection<r24> invoke() {
        Collection<nf0> b = this.this$0.mo55125A0().mo66366b();
        ArrayList<nf0> arrayList = new ArrayList<>();
        for (T next : b) {
            nf0 nf0 = (nf0) next;
            if (!nf0.mo62683l() && !ClassDeserializer.f40134c.mo55121a().contains(nf0)) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList(dk0.m43495u(arrayList, 10));
        for (nf0 j : arrayList) {
            arrayList2.add(j.mo62681j());
        }
        return arrayList2;
    }
}
