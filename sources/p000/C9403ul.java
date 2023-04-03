package p000;

import java.util.ArrayList;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.descriptors.NotFoundClasses;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Annotation;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Constructor;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$EnumEntry;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Function;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Property;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeParameter;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$ValueParameter;
import kotlin.reflect.jvm.internal.impl.protobuf.C7628h;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotatedCallableKind;
import p000.xx4;

/* renamed from: ul */
/* compiled from: AnnotationAndConstantLoaderImpl.kt */
public final class C9403ul implements C9363tl<C9460vl, fq0<?>> {

    /* renamed from: a */
    public final xw5 f45104a;

    /* renamed from: b */
    public final C9600xl f45105b;

    /* renamed from: ul$a */
    /* compiled from: AnnotationAndConstantLoaderImpl.kt */
    public /* synthetic */ class C9404a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f45106a;

        static {
            int[] iArr = new int[AnnotatedCallableKind.values().length];
            iArr[AnnotatedCallableKind.PROPERTY.ordinal()] = 1;
            iArr[AnnotatedCallableKind.PROPERTY_GETTER.ordinal()] = 2;
            iArr[AnnotatedCallableKind.PROPERTY_SETTER.ordinal()] = 3;
            f45106a = iArr;
        }
    }

    public C9403ul(mx3 mx3, NotFoundClasses notFoundClasses, xw5 xw5) {
        vx2.m53591g(mx3, "module");
        vx2.m53591g(notFoundClasses, "notFoundClasses");
        vx2.m53591g(xw5, "protocol");
        this.f45104a = xw5;
        this.f45105b = new C9600xl(mx3, notFoundClasses);
    }

    /* renamed from: a */
    public List<C9460vl> mo53777a(xx4 xx4, C7628h hVar, AnnotatedCallableKind annotatedCallableKind) {
        vx2.m53591g(xx4, "container");
        vx2.m53591g(hVar, "proto");
        vx2.m53591g(annotatedCallableKind, "kind");
        return ck0.m33062j();
    }

    /* renamed from: b */
    public List<C9460vl> mo53778b(xx4 xx4, C7628h hVar, AnnotatedCallableKind annotatedCallableKind) {
        List<ProtoBuf$Annotation> list;
        vx2.m53591g(xx4, "container");
        vx2.m53591g(hVar, "proto");
        vx2.m53591g(annotatedCallableKind, "kind");
        if (hVar instanceof ProtoBuf$Constructor) {
            list = (List) ((ProtoBuf$Constructor) hVar).getExtension(this.f45104a.mo66952c());
        } else if (hVar instanceof ProtoBuf$Function) {
            list = (List) ((ProtoBuf$Function) hVar).getExtension(this.f45104a.mo66955f());
        } else if (hVar instanceof ProtoBuf$Property) {
            int i = C9404a.f45106a[annotatedCallableKind.ordinal()];
            if (i == 1) {
                list = (List) ((ProtoBuf$Property) hVar).getExtension(this.f45104a.mo66957h());
            } else if (i == 2) {
                list = (List) ((ProtoBuf$Property) hVar).getExtension(this.f45104a.mo66958i());
            } else if (i == 3) {
                list = (List) ((ProtoBuf$Property) hVar).getExtension(this.f45104a.mo66959j());
            } else {
                throw new IllegalStateException("Unsupported callable kind with property proto".toString());
            }
        } else {
            throw new IllegalStateException(("Unknown message: " + hVar).toString());
        }
        if (list == null) {
            list = ck0.m33062j();
        }
        ArrayList arrayList = new ArrayList(dk0.m43495u(list, 10));
        for (ProtoBuf$Annotation a : list) {
            arrayList.add(this.f45105b.mo66874a(a, xx4.mo66966b()));
        }
        return arrayList;
    }

    /* renamed from: c */
    public List<C9460vl> mo53779c(xx4 xx4, C7628h hVar, AnnotatedCallableKind annotatedCallableKind, int i, ProtoBuf$ValueParameter protoBuf$ValueParameter) {
        vx2.m53591g(xx4, "container");
        vx2.m53591g(hVar, "callableProto");
        vx2.m53591g(annotatedCallableKind, "kind");
        vx2.m53591g(protoBuf$ValueParameter, "proto");
        List<ProtoBuf$Annotation> list = (List) protoBuf$ValueParameter.getExtension(this.f45104a.mo66956g());
        if (list == null) {
            list = ck0.m33062j();
        }
        ArrayList arrayList = new ArrayList(dk0.m43495u(list, 10));
        for (ProtoBuf$Annotation a : list) {
            arrayList.add(this.f45105b.mo66874a(a, xx4.mo66966b()));
        }
        return arrayList;
    }

    /* renamed from: d */
    public List<C9460vl> mo53780d(xx4.C9612a aVar) {
        vx2.m53591g(aVar, "container");
        List<ProtoBuf$Annotation> list = (List) aVar.mo66971f().getExtension(this.f45104a.mo66950a());
        if (list == null) {
            list = ck0.m33062j();
        }
        ArrayList arrayList = new ArrayList(dk0.m43495u(list, 10));
        for (ProtoBuf$Annotation a : list) {
            arrayList.add(this.f45105b.mo66874a(a, aVar.mo66966b()));
        }
        return arrayList;
    }

    /* renamed from: e */
    public List<C9460vl> mo53781e(xx4 xx4, ProtoBuf$EnumEntry protoBuf$EnumEntry) {
        vx2.m53591g(xx4, "container");
        vx2.m53591g(protoBuf$EnumEntry, "proto");
        List<ProtoBuf$Annotation> list = (List) protoBuf$EnumEntry.getExtension(this.f45104a.mo66953d());
        if (list == null) {
            list = ck0.m33062j();
        }
        ArrayList arrayList = new ArrayList(dk0.m43495u(list, 10));
        for (ProtoBuf$Annotation a : list) {
            arrayList.add(this.f45105b.mo66874a(a, xx4.mo66966b()));
        }
        return arrayList;
    }

    /* renamed from: f */
    public List<C9460vl> mo53782f(xx4 xx4, ProtoBuf$Property protoBuf$Property) {
        vx2.m53591g(xx4, "container");
        vx2.m53591g(protoBuf$Property, "proto");
        return ck0.m33062j();
    }

    /* renamed from: g */
    public List<C9460vl> mo53783g(xx4 xx4, ProtoBuf$Property protoBuf$Property) {
        vx2.m53591g(xx4, "container");
        vx2.m53591g(protoBuf$Property, "proto");
        return ck0.m33062j();
    }

    /* renamed from: i */
    public List<C9460vl> mo53784i(ProtoBuf$TypeParameter protoBuf$TypeParameter, t24 t24) {
        vx2.m53591g(protoBuf$TypeParameter, "proto");
        vx2.m53591g(t24, "nameResolver");
        List<ProtoBuf$Annotation> list = (List) protoBuf$TypeParameter.getExtension(this.f45104a.mo66961l());
        if (list == null) {
            list = ck0.m33062j();
        }
        ArrayList arrayList = new ArrayList(dk0.m43495u(list, 10));
        for (ProtoBuf$Annotation a : list) {
            arrayList.add(this.f45105b.mo66874a(a, t24));
        }
        return arrayList;
    }

    /* renamed from: k */
    public List<C9460vl> mo53785k(ProtoBuf$Type protoBuf$Type, t24 t24) {
        vx2.m53591g(protoBuf$Type, "proto");
        vx2.m53591g(t24, "nameResolver");
        List<ProtoBuf$Annotation> list = (List) protoBuf$Type.getExtension(this.f45104a.mo66960k());
        if (list == null) {
            list = ck0.m33062j();
        }
        ArrayList arrayList = new ArrayList(dk0.m43495u(list, 10));
        for (ProtoBuf$Annotation a : list) {
            arrayList.add(this.f45105b.mo66874a(a, t24));
        }
        return arrayList;
    }

    /* renamed from: l */
    public fq0<?> mo53762j(xx4 xx4, ProtoBuf$Property protoBuf$Property, xc3 xc3) {
        vx2.m53591g(xx4, "container");
        vx2.m53591g(protoBuf$Property, "proto");
        vx2.m53591g(xc3, "expectedType");
        return null;
    }

    /* renamed from: m */
    public fq0<?> mo53761h(xx4 xx4, ProtoBuf$Property protoBuf$Property, xc3 xc3) {
        vx2.m53591g(xx4, "container");
        vx2.m53591g(protoBuf$Property, "proto");
        vx2.m53591g(xc3, "expectedType");
        ProtoBuf$Annotation.Argument.Value value = (ProtoBuf$Annotation.Argument.Value) wx4.m73751a(protoBuf$Property, this.f45104a.mo66951b());
        if (value == null) {
            return null;
        }
        return this.f45105b.mo66879f(xc3, value, xx4.mo66966b());
    }
}
