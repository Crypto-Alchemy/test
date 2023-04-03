package kotlin.reflect.jvm.internal.impl.load.java;

import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;

/* renamed from: kotlin.reflect.jvm.internal.impl.load.java.ClassicBuiltinSpecialProperties$getBuiltinSpecialPropertyGetterName$descriptor$1 */
/* compiled from: ClassicBuiltinSpecialProperties.kt */
public final class C7445xccd5eab2 extends Lambda implements rc2<CallableMemberDescriptor, Boolean> {
    public static final C7445xccd5eab2 INSTANCE = new C7445xccd5eab2();

    public C7445xccd5eab2() {
        super(1);
    }

    public final Boolean invoke(CallableMemberDescriptor callableMemberDescriptor) {
        vx2.m53591g(callableMemberDescriptor, "it");
        return Boolean.valueOf(ClassicBuiltinSpecialProperties.f39395a.mo53435b(callableMemberDescriptor));
    }
}
