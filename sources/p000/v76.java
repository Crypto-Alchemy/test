package p000;

import kotlin.Metadata;
import kotlin.Result;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u001e\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a!\u0010\u0003\u001a\u00028\u0000\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00028\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\"\u001c\u0010\b\u001a\n \u0006*\u0004\u0018\u00010\u00050\u00058\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0007\"\u001c\u0010\n\u001a\n \u0006*\u0004\u0018\u00010\u00050\u00058\u0002X\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0007*\f\b\u0000\u0010\f\"\u00020\u000b2\u00020\u000b*\f\b\u0000\u0010\u000e\"\u00020\r2\u00020\r¨\u0006\u000f"}, mo44877d2 = {"", "E", "exception", "a", "(Ljava/lang/Throwable;)Ljava/lang/Throwable;", "", "kotlin.jvm.PlatformType", "Ljava/lang/String;", "baseContinuationImplClassName", "b", "stackTraceRecoveryClassName", "Lju0;", "CoroutineStackFrame", "Ljava/lang/StackTraceElement;", "StackTraceElement", "kotlinx-coroutines-core"}, mo44878k = 2, mo44879mv = {1, 6, 0})
/* renamed from: v76 */
/* compiled from: StackTraceRecovery.kt */
public final class v76 {

    /* renamed from: a */
    public static final String f45236a;

    /* renamed from: b */
    public static final String f45237b;

    static {
        Object obj;
        Object obj2;
        try {
            Result.C6167a aVar = Result.Companion;
            obj = Result.m75635constructorimpl(Class.forName("kotlin.coroutines.jvm.internal.BaseContinuationImpl").getCanonicalName());
        } catch (Throwable th) {
            Result.C6167a aVar2 = Result.Companion;
            obj = Result.m75635constructorimpl(hg5.m45198a(th));
        }
        if (Result.m75638exceptionOrNullimpl(obj) != null) {
            obj = "kotlin.coroutines.jvm.internal.BaseContinuationImpl";
        }
        f45236a = (String) obj;
        try {
            obj2 = Result.m75635constructorimpl(v76.class.getCanonicalName());
        } catch (Throwable th2) {
            Result.C6167a aVar3 = Result.Companion;
            obj2 = Result.m75635constructorimpl(hg5.m45198a(th2));
        }
        if (Result.m75638exceptionOrNullimpl(obj2) != null) {
            obj2 = "kotlinx.coroutines.internal.StackTraceRecoveryKt";
        }
        f45237b = (String) obj2;
    }

    /* renamed from: a */
    public static final <E extends Throwable> E m73132a(E e) {
        return e;
    }
}
