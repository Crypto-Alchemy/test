package p000;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.C6177b;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.reflect.jvm.internal.impl.builtins.C7389b;
import kotlin.reflect.jvm.internal.impl.descriptors.FindClassInModuleKt;
import kotlin.reflect.jvm.internal.impl.descriptors.NotFoundClasses;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Annotation;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializedArrayValue;
import p000.pr1;

/* renamed from: xl */
/* compiled from: AnnotationDeserializer.kt */
public final class C9600xl {

    /* renamed from: a */
    public final mx3 f45957a;

    /* renamed from: b */
    public final NotFoundClasses f45958b;

    /* renamed from: xl$a */
    /* compiled from: AnnotationDeserializer.kt */
    public /* synthetic */ class C9601a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f45959a;

        static {
            int[] iArr = new int[ProtoBuf$Annotation.Argument.Value.Type.values().length];
            iArr[ProtoBuf$Annotation.Argument.Value.Type.BYTE.ordinal()] = 1;
            iArr[ProtoBuf$Annotation.Argument.Value.Type.CHAR.ordinal()] = 2;
            iArr[ProtoBuf$Annotation.Argument.Value.Type.SHORT.ordinal()] = 3;
            iArr[ProtoBuf$Annotation.Argument.Value.Type.INT.ordinal()] = 4;
            iArr[ProtoBuf$Annotation.Argument.Value.Type.LONG.ordinal()] = 5;
            iArr[ProtoBuf$Annotation.Argument.Value.Type.FLOAT.ordinal()] = 6;
            iArr[ProtoBuf$Annotation.Argument.Value.Type.DOUBLE.ordinal()] = 7;
            iArr[ProtoBuf$Annotation.Argument.Value.Type.BOOLEAN.ordinal()] = 8;
            iArr[ProtoBuf$Annotation.Argument.Value.Type.STRING.ordinal()] = 9;
            iArr[ProtoBuf$Annotation.Argument.Value.Type.CLASS.ordinal()] = 10;
            iArr[ProtoBuf$Annotation.Argument.Value.Type.ENUM.ordinal()] = 11;
            iArr[ProtoBuf$Annotation.Argument.Value.Type.ANNOTATION.ordinal()] = 12;
            iArr[ProtoBuf$Annotation.Argument.Value.Type.ARRAY.ordinal()] = 13;
            f45959a = iArr;
        }
    }

    public C9600xl(mx3 mx3, NotFoundClasses notFoundClasses) {
        vx2.m53591g(mx3, "module");
        vx2.m53591g(notFoundClasses, "notFoundClasses");
        this.f45957a = mx3;
        this.f45958b = notFoundClasses;
    }

    /* renamed from: a */
    public final C9460vl mo66874a(ProtoBuf$Annotation protoBuf$Annotation, t24 t24) {
        vx2.m53591g(protoBuf$Annotation, "proto");
        vx2.m53591g(t24, "nameResolver");
        if0 e = mo66878e(v24.m73043a(t24, protoBuf$Annotation.getId()));
        Map i = C6177b.m47361i();
        if (protoBuf$Annotation.getArgumentCount() != 0 && !nr1.m70034m(e) && dd1.m56828t(e)) {
            Collection<ef0> h = e.mo52349h();
            vx2.m53590f(h, "annotationClass.constructors");
            ef0 ef0 = (ef0) CollectionsKt___CollectionsKt.m47301A0(h);
            if (ef0 != null) {
                List<n87> f = ef0.mo51763f();
                vx2.m53590f(f, "constructor.valueParameters");
                LinkedHashMap linkedHashMap = new LinkedHashMap(d75.m43382d(ao3.m31893e(dk0.m43495u(f, 10)), 16));
                for (T next : f) {
                    linkedHashMap.put(((n87) next).getName(), next);
                }
                List<ProtoBuf$Annotation.Argument> argumentList = protoBuf$Annotation.getArgumentList();
                vx2.m53590f(argumentList, "proto.argumentList");
                ArrayList arrayList = new ArrayList();
                for (ProtoBuf$Annotation.Argument argument : argumentList) {
                    vx2.m53590f(argument, "it");
                    Pair<r24, fq0<?>> d = mo66877d(argument, linkedHashMap, t24);
                    if (d != null) {
                        arrayList.add(d);
                    }
                }
                i = C6177b.m47369q(arrayList);
            }
        }
        return new C9554wl(e.mo51464n(), i, a66.f36360a);
    }

    /* renamed from: b */
    public final boolean mo66875b(fq0<?> fq0, xc3 xc3, ProtoBuf$Annotation.Argument.Value value) {
        int i;
        if0 if0;
        boolean z;
        ProtoBuf$Annotation.Argument.Value.Type type = value.getType();
        if (type == null) {
            i = -1;
        } else {
            i = C9601a.f45959a[type.ordinal()];
        }
        if (i == 10) {
            eg0 d = xc3.mo51134H0().mo51180d();
            if (d instanceof if0) {
                if0 = (if0) d;
            } else {
                if0 = null;
            }
            if (if0 != null && !C7389b.m60135k0(if0)) {
                return false;
            }
        } else if (i != 13) {
            return vx2.m53586b(fq0.mo50070a(this.f45957a), xc3);
        } else {
            if (!(fq0 instanceof C9313sq) || ((List) ((C9313sq) fq0).mo51739b()).size() != value.getArrayElementList().size()) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                xc3 k = mo66876c().mo53171k(xc3);
                vx2.m53590f(k, "builtIns.getArrayElementType(expectedType)");
                C9313sq sqVar = (C9313sq) fq0;
                rw2 k2 = ck0.m33063k((Collection) sqVar.mo51739b());
                if (!(k2 instanceof Collection) || !((Collection) k2).isEmpty()) {
                    Iterator it = k2.iterator();
                    while (it.hasNext()) {
                        int nextInt = ((lw2) it).nextInt();
                        ProtoBuf$Annotation.Argument.Value arrayElement = value.getArrayElement(nextInt);
                        vx2.m53590f(arrayElement, "value.getArrayElement(i)");
                        if (!mo66875b((fq0) ((List) sqVar.mo51739b()).get(nextInt), k, arrayElement)) {
                            return false;
                        }
                    }
                }
            } else {
                throw new IllegalStateException(("Deserialized ArrayValue should have the same number of elements as the original array value: " + fq0).toString());
            }
        }
        return true;
    }

    /* renamed from: c */
    public final C7389b mo66876c() {
        return this.f45957a.mo51535k();
    }

    /* renamed from: d */
    public final Pair<r24, fq0<?>> mo66877d(ProtoBuf$Annotation.Argument argument, Map<r24, ? extends n87> map, t24 t24) {
        n87 n87 = (n87) map.get(v24.m73044b(t24, argument.getNameId()));
        if (n87 == null) {
            return null;
        }
        r24 b = v24.m73044b(t24, argument.getNameId());
        xc3 type = n87.getType();
        vx2.m53590f(type, "parameter.type");
        ProtoBuf$Annotation.Argument.Value value = argument.getValue();
        vx2.m53590f(value, "proto.value");
        return new Pair<>(b, mo66880g(type, value, t24));
    }

    /* renamed from: e */
    public final if0 mo66878e(nf0 nf0) {
        return FindClassInModuleKt.m60280c(this.f45957a, nf0, this.f45958b);
    }

    /* renamed from: f */
    public final fq0<?> mo66879f(xc3 xc3, ProtoBuf$Annotation.Argument.Value value, t24 t24) {
        int i;
        fq0<?> fq0;
        fq0<?> fq02;
        boolean z;
        vx2.m53591g(xc3, "expectedType");
        vx2.m53591g(value, "value");
        vx2.m53591g(t24, "nameResolver");
        Boolean g = b42.f36651O.mo50465d(value.getFlags());
        vx2.m53590f(g, "IS_UNSIGNED.get(value.flags)");
        boolean booleanValue = g.booleanValue();
        ProtoBuf$Annotation.Argument.Value.Type type = value.getType();
        if (type == null) {
            i = -1;
        } else {
            i = C9601a.f45959a[type.ordinal()];
        }
        switch (i) {
            case 1:
                byte intValue = (byte) ((int) value.getIntValue());
                if (booleanValue) {
                    return new v27(intValue);
                }
                return new d70(intValue);
            case 2:
                fq0 = new vd0((char) ((int) value.getIntValue()));
                break;
            case 3:
                short intValue2 = (short) ((int) value.getIntValue());
                if (booleanValue) {
                    return new a37(intValue2);
                }
                return new u06(intValue2);
            case 4:
                int intValue3 = (int) value.getIntValue();
                if (booleanValue) {
                    return new w27(intValue3);
                }
                return new ax2(intValue3);
            case 5:
                long intValue4 = value.getIntValue();
                if (booleanValue) {
                    fq02 = new y27(intValue4);
                } else {
                    fq02 = new jl3(intValue4);
                }
                return fq02;
            case 6:
                fq0 = new u42(value.getFloatValue());
                break;
            case 7:
                fq0 = new qi1(value.getDoubleValue());
                break;
            case 8:
                if (value.getIntValue() != 0) {
                    z = true;
                } else {
                    z = false;
                }
                fq0 = new r30(z);
                break;
            case 9:
                fq0 = new lb6(t24.getString(value.getStringValue()));
                break;
            case 10:
                fq0 = new t83(v24.m73043a(t24, value.getClassId()), value.getArrayDimensionCount());
                break;
            case 11:
                fq0 = new zq1(v24.m73043a(t24, value.getClassId()), v24.m73044b(t24, value.getEnumValueId()));
                break;
            case 12:
                ProtoBuf$Annotation annotation = value.getAnnotation();
                vx2.m53590f(annotation, "value.annotation");
                fq0 = new C6948cm(mo66874a(annotation, t24));
                break;
            case 13:
                List<ProtoBuf$Annotation.Argument.Value> arrayElementList = value.getArrayElementList();
                vx2.m53590f(arrayElementList, "value.arrayElementList");
                ArrayList arrayList = new ArrayList(dk0.m43495u(arrayElementList, 10));
                for (ProtoBuf$Annotation.Argument.Value value2 : arrayElementList) {
                    d36 i2 = mo66876c().mo53169i();
                    vx2.m53590f(i2, "builtIns.anyType");
                    vx2.m53590f(value2, "it");
                    arrayList.add(mo66879f(i2, value2, t24));
                }
                return new DeserializedArrayValue(arrayList, xc3);
            default:
                throw new IllegalStateException(("Unsupported annotation argument type: " + value.getType() + " (expected " + xc3 + ')').toString());
        }
        return fq0;
    }

    /* renamed from: g */
    public final fq0<?> mo66880g(xc3 xc3, ProtoBuf$Annotation.Argument.Value value, t24 t24) {
        fq0<?> f = mo66879f(xc3, value, t24);
        if (!mo66875b(f, xc3, value)) {
            f = null;
        }
        if (f != null) {
            return f;
        }
        pr1.C9186a aVar = pr1.f44096b;
        return aVar.mo65345a("Unexpected argument value: actual type " + value.getType() + " != expected type " + xc3);
    }
}
