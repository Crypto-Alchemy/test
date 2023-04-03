package p000;

import java.util.ArrayList;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.text.StringsKt__StringsKt;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0006\u001a\u00020\u00052\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003J\u0012\u0010\t\u001a\u00020\u00052\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u0007J\u0006\u0010\n\u001a\u00020\u0005J-\u0010\u0004\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u000b2\n\u0010\r\u001a\u00060\u0001j\u0002`\f2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e¢\u0006\u0004\b\u0004\u0010\u0010J\u001e\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0013\"\u0004\b\u0000\u0010\u0011\"\u0004\b\u0001\u0010\u0012¨\u0006\u0017"}, mo44877d2 = {"Llc3;", "", "Ljava/lang/Exception;", "Lkotlin/Exception;", "e", "", "c", "Lq83;", "kClass", "b", "a", "R", "Lorg/koin/mp/Lockable;", "lock", "Lkotlin/Function0;", "block", "(Ljava/lang/Object;Lpc2;)Ljava/lang/Object;", "K", "V", "", "d", "<init>", "()V", "koin-core"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: lc3 */
/* compiled from: KoinPlatformTools.kt */
public final class lc3 {

    /* renamed from: a */
    public static final lc3 f40598a = new lc3();

    /* renamed from: a */
    public final String mo55877a() {
        String uuid = UUID.randomUUID().toString();
        vx2.m53590f(uuid, "randomUUID().toString()");
        return uuid;
    }

    /* renamed from: b */
    public final String mo55878b(q83<?> q83) {
        vx2.m53591g(q83, "kClass");
        String name = x73.m54253b(q83).getName();
        vx2.m53590f(name, "kClass.java.name");
        return name;
    }

    /* renamed from: c */
    public final String mo55879c(Exception exc) {
        vx2.m53591g(exc, "e");
        StringBuilder sb = new StringBuilder();
        sb.append(exc);
        sb.append("\n\t");
        StackTraceElement[] stackTrace = exc.getStackTrace();
        vx2.m53590f(stackTrace, "e.stackTrace");
        ArrayList arrayList = new ArrayList();
        for (StackTraceElement stackTraceElement : stackTrace) {
            String className = stackTraceElement.getClassName();
            vx2.m53590f(className, "it.className");
            if (!(!StringsKt__StringsKt.m63081R(className, "sun.reflect", false, 2, (Object) null))) {
                break;
            }
            arrayList.add(stackTraceElement);
        }
        sb.append(CollectionsKt___CollectionsKt.m47338i0(arrayList, "\n\t", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (rc2) null, 62, (Object) null));
        return sb.toString();
    }

    /* renamed from: d */
    public final <K, V> Map<K, V> mo55880d() {
        return new ConcurrentHashMap();
    }

    /* renamed from: e */
    public final <R> R mo55881e(Object obj, pc2<? extends R> pc2) {
        R invoke;
        vx2.m53591g(obj, "lock");
        vx2.m53591g(pc2, "block");
        synchronized (obj) {
            invoke = pc2.invoke();
        }
        return invoke;
    }
}
