package p000;

import kotlin.reflect.jvm.internal.impl.descriptors.C7420a;

/* renamed from: fs0 */
/* compiled from: ContextReceiver.kt */
public final class fs0 extends C9588x6 {

    /* renamed from: c */
    public final C7420a f37905c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public fs0(C7420a aVar, xc3 xc3, j85 j85) {
        super(xc3, j85);
        vx2.m53591g(aVar, "declarationDescriptor");
        vx2.m53591g(xc3, "receiverType");
        this.f37905c = aVar;
    }

    /* renamed from: c */
    public C7420a mo51775c() {
        return this.f37905c;
    }

    public String toString() {
        return "Cxt { " + mo51775c() + " }";
    }
}
