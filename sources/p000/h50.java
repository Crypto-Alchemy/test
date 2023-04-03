package p000;

/* renamed from: h50 */
/* compiled from: BuiltInSerializerProtocol.kt */
public final class h50 extends xw5 {

    /* renamed from: n */
    public static final h50 f38161n = new h50();

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public h50() {
        /*
            r14 = this;
            kotlin.reflect.jvm.internal.impl.protobuf.d r1 = kotlin.reflect.jvm.internal.impl.protobuf.C7616d.m62009d()
            p000.m50.m64172a(r1)
            java.lang.String r0 = "newInstance().apply(Buil…f::registerAllExtensions)"
            p000.vx2.m53590f(r1, r0)
            kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$e<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Package, java.lang.Integer> r2 = p000.m50.f40767a
            java.lang.String r0 = "packageFqName"
            p000.vx2.m53590f(r2, r0)
            kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$e<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Constructor, java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Annotation>> r3 = p000.m50.f40769c
            java.lang.String r0 = "constructorAnnotation"
            p000.vx2.m53590f(r3, r0)
            kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$e<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Class, java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Annotation>> r4 = p000.m50.f40768b
            java.lang.String r0 = "classAnnotation"
            p000.vx2.m53590f(r4, r0)
            kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$e<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Function, java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Annotation>> r5 = p000.m50.f40770d
            java.lang.String r0 = "functionAnnotation"
            p000.vx2.m53590f(r5, r0)
            kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$e<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Property, java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Annotation>> r6 = p000.m50.f40771e
            java.lang.String r0 = "propertyAnnotation"
            p000.vx2.m53590f(r6, r0)
            kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$e<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Property, java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Annotation>> r7 = p000.m50.f40772f
            java.lang.String r0 = "propertyGetterAnnotation"
            p000.vx2.m53590f(r7, r0)
            kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$e<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Property, java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Annotation>> r8 = p000.m50.f40773g
            java.lang.String r0 = "propertySetterAnnotation"
            p000.vx2.m53590f(r8, r0)
            kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$e<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$EnumEntry, java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Annotation>> r9 = p000.m50.f40775i
            java.lang.String r0 = "enumEntryAnnotation"
            p000.vx2.m53590f(r9, r0)
            kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$e<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Property, kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Annotation$Argument$Value> r10 = p000.m50.f40774h
            java.lang.String r0 = "compileTimeValue"
            p000.vx2.m53590f(r10, r0)
            kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$e<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$ValueParameter, java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Annotation>> r11 = p000.m50.f40776j
            java.lang.String r0 = "parameterAnnotation"
            p000.vx2.m53590f(r11, r0)
            kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$e<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type, java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Annotation>> r12 = p000.m50.f40777k
            java.lang.String r0 = "typeAnnotation"
            p000.vx2.m53590f(r12, r0)
            kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$e<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeParameter, java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Annotation>> r13 = p000.m50.f40778l
            java.lang.String r0 = "typeParameterAnnotation"
            p000.vx2.m53590f(r13, r0)
            r0 = r14
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.h50.<init>():void");
    }

    /* renamed from: m */
    public final String mo52121m(u82 u82) {
        vx2.m53591g(u82, "fqName");
        return mo52123o(u82) + ".kotlin_builtins";
    }

    /* renamed from: n */
    public final String mo52122n(u82 u82) {
        vx2.m53591g(u82, "fqName");
        StringBuilder sb = new StringBuilder();
        String b = u82.mo66195b();
        vx2.m53590f(b, "fqName.asString()");
        sb.append(yb6.m74331H(b, '.', '/', false, 4, (Object) null));
        sb.append('/');
        sb.append(mo52121m(u82));
        return sb.toString();
    }

    /* renamed from: o */
    public final String mo52123o(u82 u82) {
        if (u82.mo66197d()) {
            return "default-package";
        }
        String d = u82.mo66201g().mo65594d();
        vx2.m53590f(d, "fqName.shortName().asString()");
        return d;
    }
}
