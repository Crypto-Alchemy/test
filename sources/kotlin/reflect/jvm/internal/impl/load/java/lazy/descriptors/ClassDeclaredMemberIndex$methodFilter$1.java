package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import kotlin.jvm.internal.Lambda;

/* compiled from: DeclaredMemberIndex.kt */
public final class ClassDeclaredMemberIndex$methodFilter$1 extends Lambda implements rc2<m13, Boolean> {
    public final /* synthetic */ ClassDeclaredMemberIndex this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ClassDeclaredMemberIndex$methodFilter$1(ClassDeclaredMemberIndex classDeclaredMemberIndex) {
        super(1);
        this.this$0 = classDeclaredMemberIndex;
    }

    public final Boolean invoke(m13 m13) {
        vx2.m53591g(m13, "m");
        return Boolean.valueOf(((Boolean) this.this$0.f39462b.invoke(m13)).booleanValue() && !k13.m59653c(m13));
    }
}
