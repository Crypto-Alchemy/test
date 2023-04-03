package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import java.lang.reflect.Member;
import kotlin.jvm.internal.FunctionReference;

/* compiled from: ReflectJavaClass.kt */
public /* synthetic */ class ReflectJavaClass$fields$1 extends FunctionReference implements rc2<Member, Boolean> {
    public static final ReflectJavaClass$fields$1 INSTANCE = new ReflectJavaClass$fields$1();

    public ReflectJavaClass$fields$1() {
        super(1);
    }

    public final String getName() {
        return "isSynthetic";
    }

    public final y83 getOwner() {
        return ua5.m52727b(Member.class);
    }

    public final String getSignature() {
        return "isSynthetic()Z";
    }

    public final Boolean invoke(Member member) {
        vx2.m53591g(member, "p0");
        return Boolean.valueOf(member.isSynthetic());
    }
}
