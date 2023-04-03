package p000;

import java.lang.reflect.Member;
import java.lang.reflect.Type;
import java.util.List;
import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\bÀ\u0002\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001d\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0003H\u0016¢\u0006\u0004\b\u0006\u0010\u0007R\u0016\u0010\n\u001a\u0004\u0018\u00010\u00028VX\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8VX\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0012\u001a\u00020\f8VX\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, mo44877d2 = {"Lqp6;", "Lu90;", "", "", "args", "", "call", "([Ljava/lang/Object;)Ljava/lang/Object;", "b", "()Ljava/lang/Void;", "member", "", "Ljava/lang/reflect/Type;", "a", "()Ljava/util/List;", "parameterTypes", "getReturnType", "()Ljava/lang/reflect/Type;", "returnType", "<init>", "()V", "kotlin-reflection"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: qp6 */
/* compiled from: ThrowingCaller.kt */
public final class qp6 implements u90 {

    /* renamed from: a */
    public static final qp6 f44223a = new qp6();

    /* renamed from: a */
    public List<Type> mo52786a() {
        return ck0.m33062j();
    }

    /* renamed from: b */
    public Void mo65494b() {
        return null;
    }

    public Object call(Object[] objArr) {
        vx2.m53591g(objArr, "args");
        throw new UnsupportedOperationException("call/callBy are not supported for this declaration.");
    }

    public /* bridge */ /* synthetic */ Member getMember() {
        return (Member) mo65494b();
    }

    public Type getReturnType() {
        Class cls = Void.TYPE;
        vx2.m53590f(cls, "TYPE");
        return cls;
    }
}
