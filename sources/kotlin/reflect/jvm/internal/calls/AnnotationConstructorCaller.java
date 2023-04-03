package kotlin.reflect.jvm.internal.calls;

import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C6177b;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectClassUtilKt;
import p000.u90;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001:\u0002)*BA\u0012\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\b\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\f\u0012\u0006\u0010\u0014\u001a\u00020\u0011\u0012\u0006\u0010&\u001a\u00020%\u0012\u000e\b\u0002\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00150\f¢\u0006\u0004\b'\u0010(J\u001d\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0003H\u0016¢\u0006\u0004\b\u0006\u0010\u0007R\u0018\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0014\u001a\u00020\u00118\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00150\f8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u000fR \u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00180\f8\u0016X\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u000f\u001a\u0004\b\t\u0010\u001aR\u001e\u0010\u001d\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\b0\f8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u000fR\u001c\u0010\u001f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\f8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u000fR\u0016\u0010!\u001a\u0004\u0018\u00010\u00028VX\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010 R\u0014\u0010$\u001a\u00020\u00188VX\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010#¨\u0006+"}, mo44877d2 = {"Lkotlin/reflect/jvm/internal/calls/AnnotationConstructorCaller;", "Lu90;", "", "", "args", "", "call", "([Ljava/lang/Object;)Ljava/lang/Object;", "Ljava/lang/Class;", "a", "Ljava/lang/Class;", "jClass", "", "", "b", "Ljava/util/List;", "parameterNames", "Lkotlin/reflect/jvm/internal/calls/AnnotationConstructorCaller$CallMode;", "c", "Lkotlin/reflect/jvm/internal/calls/AnnotationConstructorCaller$CallMode;", "callMode", "Ljava/lang/reflect/Method;", "d", "methods", "Ljava/lang/reflect/Type;", "e", "()Ljava/util/List;", "parameterTypes", "f", "erasedParameterTypes", "g", "defaultValues", "()Ljava/lang/Void;", "member", "getReturnType", "()Ljava/lang/reflect/Type;", "returnType", "Lkotlin/reflect/jvm/internal/calls/AnnotationConstructorCaller$Origin;", "origin", "<init>", "(Ljava/lang/Class;Ljava/util/List;Lkotlin/reflect/jvm/internal/calls/AnnotationConstructorCaller$CallMode;Lkotlin/reflect/jvm/internal/calls/AnnotationConstructorCaller$Origin;Ljava/util/List;)V", "CallMode", "Origin", "kotlin-reflection"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* compiled from: AnnotationConstructorCaller.kt */
public final class AnnotationConstructorCaller implements u90 {

    /* renamed from: a */
    public final Class<?> f39046a;

    /* renamed from: b */
    public final List<String> f39047b;

    /* renamed from: c */
    public final CallMode f39048c;

    /* renamed from: d */
    public final List<Method> f39049d;

    /* renamed from: e */
    public final List<Type> f39050e;

    /* renamed from: f */
    public final List<Class<?>> f39051f;

    /* renamed from: g */
    public final List<Object> f39052g;

    @Metadata(mo44876d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, mo44877d2 = {"Lkotlin/reflect/jvm/internal/calls/AnnotationConstructorCaller$CallMode;", "", "(Ljava/lang/String;I)V", "CALL_BY_NAME", "POSITIONAL_CALL", "kotlin-reflection"}, mo44878k = 1, mo44879mv = {1, 7, 1}, mo44881xi = 48)
    /* compiled from: AnnotationConstructorCaller.kt */
    public enum CallMode {
        CALL_BY_NAME,
        POSITIONAL_CALL
    }

    @Metadata(mo44876d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, mo44877d2 = {"Lkotlin/reflect/jvm/internal/calls/AnnotationConstructorCaller$Origin;", "", "(Ljava/lang/String;I)V", "JAVA", "KOTLIN", "kotlin-reflection"}, mo44878k = 1, mo44879mv = {1, 7, 1}, mo44881xi = 48)
    /* compiled from: AnnotationConstructorCaller.kt */
    public enum Origin {
        JAVA,
        KOTLIN
    }

    public AnnotationConstructorCaller(Class<?> cls, List<String> list, CallMode callMode, Origin origin, List<Method> list2) {
        vx2.m53591g(cls, "jClass");
        vx2.m53591g(list, "parameterNames");
        vx2.m53591g(callMode, "callMode");
        vx2.m53591g(origin, "origin");
        vx2.m53591g(list2, "methods");
        this.f39046a = cls;
        this.f39047b = list;
        this.f39048c = callMode;
        this.f39049d = list2;
        ArrayList arrayList = new ArrayList(dk0.m43495u(list2, 10));
        for (Method genericReturnType : list2) {
            arrayList.add(genericReturnType.getGenericReturnType());
        }
        this.f39050e = arrayList;
        List<Method> list3 = this.f39049d;
        ArrayList arrayList2 = new ArrayList(dk0.m43495u(list3, 10));
        for (Method returnType : list3) {
            Class<?> returnType2 = returnType.getReturnType();
            vx2.m53590f(returnType2, "it");
            Class<?> g = ReflectClassUtilKt.m60599g(returnType2);
            if (g != null) {
                returnType2 = g;
            }
            arrayList2.add(returnType2);
        }
        this.f39051f = arrayList2;
        List<Method> list4 = this.f39049d;
        ArrayList arrayList3 = new ArrayList(dk0.m43495u(list4, 10));
        for (Method defaultValue : list4) {
            arrayList3.add(defaultValue.getDefaultValue());
        }
        this.f39052g = arrayList3;
        if (this.f39048c == CallMode.POSITIONAL_CALL && origin == Origin.JAVA && (!CollectionsKt___CollectionsKt.m47347r0(this.f39047b, "value").isEmpty())) {
            throw new UnsupportedOperationException("Positional call of a Java annotation constructor is allowed only if there are no parameters or one parameter named \"value\". This restriction exists because Java annotations (in contrast to Kotlin)do not impose any order on their arguments. Use KCallable#callBy instead.");
        }
    }

    /* renamed from: a */
    public List<Type> mo52786a() {
        return this.f39050e;
    }

    /* renamed from: b */
    public void mo53123b(Object[] objArr) {
        u90.C9393a.m72663a(this, objArr);
    }

    /* renamed from: c */
    public Void mo53124c() {
        return null;
    }

    public Object call(Object[] objArr) {
        Object obj;
        vx2.m53591g(objArr, "args");
        mo53123b(objArr);
        ArrayList arrayList = new ArrayList(objArr.length);
        int length = objArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            Object obj2 = objArr[i];
            int i3 = i2 + 1;
            if (obj2 == null && this.f39048c == CallMode.CALL_BY_NAME) {
                obj = this.f39052g.get(i2);
            } else {
                obj = AnnotationConstructorCallerKt.m60099l(obj2, this.f39051f.get(i2));
            }
            if (obj != null) {
                arrayList.add(obj);
                i++;
                i2 = i3;
            } else {
                Void unused = AnnotationConstructorCallerKt.m60098k(i2, this.f39047b.get(i2), this.f39051f.get(i2));
                throw null;
            }
        }
        return AnnotationConstructorCallerKt.m60093f(this.f39046a, C6177b.m47369q(CollectionsKt___CollectionsKt.m47321R0(this.f39047b, arrayList)), this.f39049d);
    }

    public /* bridge */ /* synthetic */ Member getMember() {
        return (Member) mo53124c();
    }

    public Type getReturnType() {
        return this.f39046a;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ AnnotationConstructorCaller(java.lang.Class r7, java.util.List r8, kotlin.reflect.jvm.internal.calls.AnnotationConstructorCaller.CallMode r9, kotlin.reflect.jvm.internal.calls.AnnotationConstructorCaller.Origin r10, java.util.List r11, int r12, kotlin.jvm.internal.DefaultConstructorMarker r13) {
        /*
            r6 = this;
            r12 = r12 & 16
            if (r12 == 0) goto L_0x002a
            java.util.ArrayList r11 = new java.util.ArrayList
            r12 = 10
            int r12 = p000.dk0.m43495u(r8, r12)
            r11.<init>(r12)
            java.util.Iterator r12 = r8.iterator()
        L_0x0013:
            boolean r13 = r12.hasNext()
            if (r13 == 0) goto L_0x002a
            java.lang.Object r13 = r12.next()
            java.lang.String r13 = (java.lang.String) r13
            r0 = 0
            java.lang.Class[] r0 = new java.lang.Class[r0]
            java.lang.reflect.Method r13 = r7.getDeclaredMethod(r13, r0)
            r11.add(r13)
            goto L_0x0013
        L_0x002a:
            r5 = r11
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r0.<init>(r1, r2, r3, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.calls.AnnotationConstructorCaller.<init>(java.lang.Class, java.util.List, kotlin.reflect.jvm.internal.calls.AnnotationConstructorCaller$CallMode, kotlin.reflect.jvm.internal.calls.AnnotationConstructorCaller$Origin, java.util.List, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
