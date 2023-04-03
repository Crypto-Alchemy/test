package p000;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import org.web3j.ens.contracts.generated.PublicResolver;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\u0006\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0003H\u0002J\u001b\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0002R\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00020\u000b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u0011"}, mo44877d2 = {"Li87;", "Lhw5;", "Lh87;", "", "iterator", "", "name", "", "value", "Lr37;", "b", "", "a", "Ljava/util/List;", "elements", "<init>", "()V", "ui_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: i87 */
/* compiled from: InspectableValue.kt */
public final class i87 implements hw5<h87> {

    /* renamed from: a */
    public final List<h87> f13207a = new ArrayList();

    /* renamed from: b */
    public final void mo21502b(String str, Object obj) {
        vx2.m53591g(str, PublicResolver.FUNC_NAME);
        this.f13207a.add(new h87(str, obj));
    }

    public Iterator<h87> iterator() {
        return this.f13207a.iterator();
    }
}
