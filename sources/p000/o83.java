package p000;

import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.reflect.KParameter;
import kotlin.reflect.KVisibility;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\n\bf\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\u00020\u0002J'\u0010\u0006\u001a\u00028\u00002\u0016\u0010\u0005\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00040\u0003\"\u0004\u0018\u00010\u0004H&¢\u0006\u0004\b\u0006\u0010\u0007J%\u0010\n\u001a\u00028\u00002\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\u00040\bH&¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0011\u001a\u00020\f8&X§\u0004¢\u0006\f\u0012\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\t0\u00128&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0019\u001a\u00020\u00168&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R \u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00128&X§\u0004¢\u0006\f\u0012\u0004\b\u001c\u0010\u0010\u001a\u0004\b\u001b\u0010\u0014R\u001c\u0010\"\u001a\u0004\u0018\u00010\u001e8&X§\u0004¢\u0006\f\u0012\u0004\b!\u0010\u0010\u001a\u0004\b\u001f\u0010 R\u001a\u0010$\u001a\u00020#8&X§\u0004¢\u0006\f\u0012\u0004\b&\u0010\u0010\u001a\u0004\b$\u0010%R\u001a\u0010'\u001a\u00020#8&X§\u0004¢\u0006\f\u0012\u0004\b(\u0010\u0010\u001a\u0004\b'\u0010%R\u001a\u0010)\u001a\u00020#8&X§\u0004¢\u0006\f\u0012\u0004\b*\u0010\u0010\u001a\u0004\b)\u0010%R\u001a\u0010+\u001a\u00020#8&X§\u0004¢\u0006\f\u0012\u0004\b,\u0010\u0010\u001a\u0004\b+\u0010%¨\u0006-"}, mo44877d2 = {"Lo83;", "R", "Ln83;", "", "", "args", "call", "([Ljava/lang/Object;)Ljava/lang/Object;", "", "Lkotlin/reflect/KParameter;", "callBy", "(Ljava/util/Map;)Ljava/lang/Object;", "", "getName", "()Ljava/lang/String;", "getName$annotations", "()V", "name", "", "getParameters", "()Ljava/util/List;", "parameters", "Lm93;", "getReturnType", "()Lm93;", "returnType", "Lo93;", "getTypeParameters", "getTypeParameters$annotations", "typeParameters", "Lkotlin/reflect/KVisibility;", "getVisibility", "()Lkotlin/reflect/KVisibility;", "getVisibility$annotations", "visibility", "", "isFinal", "()Z", "isFinal$annotations", "isOpen", "isOpen$annotations", "isAbstract", "isAbstract$annotations", "isSuspend", "isSuspend$annotations", "kotlin-stdlib"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: o83 */
/* compiled from: KCallable.kt */
public interface o83<R> extends n83 {
    R call(Object... objArr);

    R callBy(Map<KParameter, ? extends Object> map);

    String getName();

    List<KParameter> getParameters();

    m93 getReturnType();

    List<o93> getTypeParameters();

    KVisibility getVisibility();

    boolean isAbstract();

    boolean isFinal();

    boolean isOpen();

    boolean isSuspend();
}
