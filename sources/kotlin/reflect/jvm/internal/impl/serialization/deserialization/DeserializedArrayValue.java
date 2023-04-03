package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import java.util.List;

/* compiled from: DeserializedArrayValue.kt */
public final class DeserializedArrayValue extends C9313sq {

    /* renamed from: c */
    public final xc3 f40140c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DeserializedArrayValue(List<? extends fq0<?>> list, final xc3 xc3) {
        super(list, new rc2<mx3, xc3>() {
            public final xc3 invoke(mx3 mx3) {
                vx2.m53591g(mx3, "it");
                return xc3;
            }
        });
        vx2.m53591g(list, "value");
        vx2.m53591g(xc3, "type");
        this.f40140c = xc3;
    }

    /* renamed from: c */
    public final xc3 mo55123c() {
        return this.f40140c;
    }
}
