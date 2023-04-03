package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;

/* compiled from: TypeAliasConstructorDescriptor.kt */
public final class TypeAliasConstructorDescriptorImpl$withDispatchReceiver$2 extends Lambda implements pc2<TypeAliasConstructorDescriptorImpl> {
    public final /* synthetic */ ef0 $underlyingConstructorDescriptor;
    public final /* synthetic */ TypeAliasConstructorDescriptorImpl this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TypeAliasConstructorDescriptorImpl$withDispatchReceiver$2(TypeAliasConstructorDescriptorImpl typeAliasConstructorDescriptorImpl, ef0 ef0) {
        super(0);
        this.this$0 = typeAliasConstructorDescriptorImpl;
        this.$underlyingConstructorDescriptor = ef0;
    }

    public final TypeAliasConstructorDescriptorImpl invoke() {
        da6 H = this.this$0.mo53302H();
        hz6 i1 = this.this$0.mo53307i1();
        ef0 ef0 = this.$underlyingConstructorDescriptor;
        TypeAliasConstructorDescriptorImpl typeAliasConstructorDescriptorImpl = this.this$0;
        C6983dm annotations = ef0.getAnnotations();
        CallableMemberDescriptor.Kind kind = this.$underlyingConstructorDescriptor.getKind();
        vx2.m53590f(kind, "underlyingConstructorDescriptor.kind");
        a66 source = this.this$0.mo53307i1().getSource();
        vx2.m53590f(source, "typeAliasDescriptor.source");
        TypeAliasConstructorDescriptorImpl typeAliasConstructorDescriptorImpl2 = new TypeAliasConstructorDescriptorImpl(H, i1, ef0, typeAliasConstructorDescriptorImpl, annotations, kind, source, (DefaultConstructorMarker) null);
        TypeAliasConstructorDescriptorImpl typeAliasConstructorDescriptorImpl3 = this.this$0;
        ef0 ef02 = this.$underlyingConstructorDescriptor;
        TypeSubstitutor a = TypeAliasConstructorDescriptorImpl.f39309v1.mo53310c(typeAliasConstructorDescriptorImpl3.mo53307i1());
        h85 h85 = null;
        if (a == null) {
            return null;
        }
        h85 G = ef02.mo51311G();
        if (G != null) {
            h85 = G.mo50708c(a);
        }
        List<h85> s0 = ef02.mo51327s0();
        vx2.m53590f(s0, "underlyingConstructorDes…contextReceiverParameters");
        ArrayList arrayList = new ArrayList(dk0.m43495u(s0, 10));
        for (h85 c : s0) {
            arrayList.add(c.mo50708c(a));
        }
        typeAliasConstructorDescriptorImpl2.mo52098L0((h85) null, h85, arrayList, typeAliasConstructorDescriptorImpl3.mo53307i1().mo51670o(), typeAliasConstructorDescriptorImpl3.mo51763f(), typeAliasConstructorDescriptorImpl3.getReturnType(), Modality.FINAL, typeAliasConstructorDescriptorImpl3.mo53307i1().getVisibility());
        return typeAliasConstructorDescriptorImpl2;
    }
}
