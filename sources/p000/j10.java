package p000;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.reflect.jvm.internal.impl.descriptors.FindClassInModuleKt;
import kotlin.reflect.jvm.internal.impl.descriptors.NotFoundClasses;
import kotlin.reflect.jvm.internal.impl.load.kotlin.AbstractBinaryClassAnnotationAndConstantLoader;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Annotation;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValueFactory;
import kotlin.text.StringsKt__StringsKt;
import p000.pr1;
import p000.tc3;

/* renamed from: j10 */
/* compiled from: BinaryClassAnnotationAndConstantLoaderImpl.kt */
public final class j10 extends AbstractBinaryClassAnnotationAndConstantLoader<C9460vl, fq0<?>> {

    /* renamed from: c */
    public final mx3 f38545c;

    /* renamed from: d */
    public final NotFoundClasses f38546d;

    /* renamed from: e */
    public final C9600xl f38547e;

    /* renamed from: j10$a */
    /* compiled from: BinaryClassAnnotationAndConstantLoaderImpl.kt */
    public abstract class C7233a implements tc3.C9341a {

        /* renamed from: j10$a$a */
        /* compiled from: BinaryClassAnnotationAndConstantLoaderImpl.kt */
        public static final class C7234a implements tc3.C9341a {

            /* renamed from: a */
            public final /* synthetic */ tc3.C9341a f38549a;

            /* renamed from: b */
            public final /* synthetic */ tc3.C9341a f38550b;

            /* renamed from: c */
            public final /* synthetic */ C7233a f38551c;

            /* renamed from: d */
            public final /* synthetic */ r24 f38552d;

            /* renamed from: e */
            public final /* synthetic */ ArrayList<C9460vl> f38553e;

            public C7234a(tc3.C9341a aVar, C7233a aVar2, r24 r24, ArrayList<C9460vl> arrayList) {
                this.f38550b = aVar;
                this.f38551c = aVar2;
                this.f38552d = r24;
                this.f38553e = arrayList;
                this.f38549a = aVar;
            }

            /* renamed from: a */
            public void mo52590a() {
                this.f38550b.mo52590a();
                this.f38551c.mo52589h(this.f38552d, new C6948cm((C9460vl) CollectionsKt___CollectionsKt.m47355z0(this.f38553e)));
            }

            /* renamed from: b */
            public void mo52583b(r24 r24, of0 of0) {
                vx2.m53591g(of0, "value");
                this.f38549a.mo52583b(r24, of0);
            }

            /* renamed from: c */
            public tc3.C9342b mo52584c(r24 r24) {
                return this.f38549a.mo52584c(r24);
            }

            /* renamed from: d */
            public void mo52585d(r24 r24, nf0 nf0, r24 r242) {
                vx2.m53591g(nf0, "enumClassId");
                vx2.m53591g(r242, "enumEntryName");
                this.f38549a.mo52585d(r24, nf0, r242);
            }

            /* renamed from: e */
            public tc3.C9341a mo52586e(r24 r24, nf0 nf0) {
                vx2.m53591g(nf0, "classId");
                return this.f38549a.mo52586e(r24, nf0);
            }

            /* renamed from: f */
            public void mo52587f(r24 r24, Object obj) {
                this.f38549a.mo52587f(r24, obj);
            }
        }

        /* renamed from: j10$a$b */
        /* compiled from: BinaryClassAnnotationAndConstantLoaderImpl.kt */
        public static final class C7235b implements tc3.C9342b {

            /* renamed from: a */
            public final ArrayList<fq0<?>> f38554a = new ArrayList<>();

            /* renamed from: b */
            public final /* synthetic */ j10 f38555b;

            /* renamed from: c */
            public final /* synthetic */ r24 f38556c;

            /* renamed from: d */
            public final /* synthetic */ C7233a f38557d;

            /* renamed from: j10$a$b$a */
            /* compiled from: BinaryClassAnnotationAndConstantLoaderImpl.kt */
            public static final class C7236a implements tc3.C9341a {

                /* renamed from: a */
                public final /* synthetic */ tc3.C9341a f38558a;

                /* renamed from: b */
                public final /* synthetic */ tc3.C9341a f38559b;

                /* renamed from: c */
                public final /* synthetic */ C7235b f38560c;

                /* renamed from: d */
                public final /* synthetic */ ArrayList<C9460vl> f38561d;

                public C7236a(tc3.C9341a aVar, C7235b bVar, ArrayList<C9460vl> arrayList) {
                    this.f38559b = aVar;
                    this.f38560c = bVar;
                    this.f38561d = arrayList;
                    this.f38558a = aVar;
                }

                /* renamed from: a */
                public void mo52590a() {
                    this.f38559b.mo52590a();
                    this.f38560c.f38554a.add(new C6948cm((C9460vl) CollectionsKt___CollectionsKt.m47355z0(this.f38561d)));
                }

                /* renamed from: b */
                public void mo52583b(r24 r24, of0 of0) {
                    vx2.m53591g(of0, "value");
                    this.f38558a.mo52583b(r24, of0);
                }

                /* renamed from: c */
                public tc3.C9342b mo52584c(r24 r24) {
                    return this.f38558a.mo52584c(r24);
                }

                /* renamed from: d */
                public void mo52585d(r24 r24, nf0 nf0, r24 r242) {
                    vx2.m53591g(nf0, "enumClassId");
                    vx2.m53591g(r242, "enumEntryName");
                    this.f38558a.mo52585d(r24, nf0, r242);
                }

                /* renamed from: e */
                public tc3.C9341a mo52586e(r24 r24, nf0 nf0) {
                    vx2.m53591g(nf0, "classId");
                    return this.f38558a.mo52586e(r24, nf0);
                }

                /* renamed from: f */
                public void mo52587f(r24 r24, Object obj) {
                    this.f38558a.mo52587f(r24, obj);
                }
            }

            public C7235b(j10 j10, r24 r24, C7233a aVar) {
                this.f38555b = j10;
                this.f38556c = r24;
                this.f38557d = aVar;
            }

            /* renamed from: a */
            public void mo52591a() {
                this.f38557d.mo52588g(this.f38556c, this.f38554a);
            }

            /* renamed from: b */
            public tc3.C9341a mo52592b(nf0 nf0) {
                vx2.m53591g(nf0, "classId");
                ArrayList arrayList = new ArrayList();
                j10 j10 = this.f38555b;
                a66 a66 = a66.f36360a;
                vx2.m53590f(a66, "NO_SOURCE");
                tc3.C9341a x = j10.mo52582x(nf0, a66, arrayList);
                vx2.m53588d(x);
                return new C7236a(x, this, arrayList);
            }

            /* renamed from: c */
            public void mo52593c(Object obj) {
                this.f38554a.add(this.f38555b.mo52577K(this.f38556c, obj));
            }

            /* renamed from: d */
            public void mo52594d(nf0 nf0, r24 r24) {
                vx2.m53591g(nf0, "enumClassId");
                vx2.m53591g(r24, "enumEntryName");
                this.f38554a.add(new zq1(nf0, r24));
            }

            /* renamed from: e */
            public void mo52595e(of0 of0) {
                vx2.m53591g(of0, "value");
                this.f38554a.add(new t83(of0));
            }
        }

        public C7233a() {
        }

        /* renamed from: b */
        public void mo52583b(r24 r24, of0 of0) {
            vx2.m53591g(of0, "value");
            mo52589h(r24, new t83(of0));
        }

        /* renamed from: c */
        public tc3.C9342b mo52584c(r24 r24) {
            return new C7235b(j10.this, r24, this);
        }

        /* renamed from: d */
        public void mo52585d(r24 r24, nf0 nf0, r24 r242) {
            vx2.m53591g(nf0, "enumClassId");
            vx2.m53591g(r242, "enumEntryName");
            mo52589h(r24, new zq1(nf0, r242));
        }

        /* renamed from: e */
        public tc3.C9341a mo52586e(r24 r24, nf0 nf0) {
            vx2.m53591g(nf0, "classId");
            ArrayList arrayList = new ArrayList();
            j10 j10 = j10.this;
            a66 a66 = a66.f36360a;
            vx2.m53590f(a66, "NO_SOURCE");
            tc3.C9341a x = j10.mo52582x(nf0, a66, arrayList);
            vx2.m53588d(x);
            return new C7234a(x, this, r24, arrayList);
        }

        /* renamed from: f */
        public void mo52587f(r24 r24, Object obj) {
            mo52589h(r24, j10.this.mo52577K(r24, obj));
        }

        /* renamed from: g */
        public abstract void mo52588g(r24 r24, ArrayList<fq0<?>> arrayList);

        /* renamed from: h */
        public abstract void mo52589h(r24 r24, fq0<?> fq0);
    }

    /* renamed from: j10$b */
    /* compiled from: BinaryClassAnnotationAndConstantLoaderImpl.kt */
    public static final class C7237b extends C7233a {

        /* renamed from: b */
        public final HashMap<r24, fq0<?>> f38562b = new HashMap<>();

        /* renamed from: c */
        public final /* synthetic */ j10 f38563c;

        /* renamed from: d */
        public final /* synthetic */ if0 f38564d;

        /* renamed from: e */
        public final /* synthetic */ nf0 f38565e;

        /* renamed from: f */
        public final /* synthetic */ List<C9460vl> f38566f;

        /* renamed from: g */
        public final /* synthetic */ a66 f38567g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C7237b(j10 j10, if0 if0, nf0 nf0, List<C9460vl> list, a66 a66) {
            super();
            this.f38563c = j10;
            this.f38564d = if0;
            this.f38565e = nf0;
            this.f38566f = list;
            this.f38567g = a66;
        }

        /* renamed from: a */
        public void mo52590a() {
            if (!this.f38563c.mo53758E(this.f38565e, this.f38562b) && !this.f38563c.mo53793w(this.f38565e)) {
                this.f38566f.add(new C9554wl(this.f38564d.mo51464n(), this.f38562b, this.f38567g));
            }
        }

        /* renamed from: g */
        public void mo52588g(r24 r24, ArrayList<fq0<?>> arrayList) {
            vx2.m53591g(arrayList, "elements");
            if (r24 != null) {
                n87 b = ad1.m55454b(r24, this.f38564d);
                if (b != null) {
                    HashMap<r24, fq0<?>> hashMap = this.f38562b;
                    ConstantValueFactory constantValueFactory = ConstantValueFactory.f40088a;
                    List<T> c = ak0.m55533c(arrayList);
                    xc3 type = b.getType();
                    vx2.m53590f(type, "parameter.type");
                    hashMap.put(r24, constantValueFactory.mo55064a(c, type));
                } else if (this.f38563c.mo53793w(this.f38565e) && vx2.m53586b(r24.mo65594d(), "value")) {
                    ArrayList<C6948cm> arrayList2 = new ArrayList<>();
                    for (T next : arrayList) {
                        if (next instanceof C6948cm) {
                            arrayList2.add(next);
                        }
                    }
                    List<C9460vl> list = this.f38566f;
                    for (C6948cm b2 : arrayList2) {
                        list.add((C9460vl) b2.mo51739b());
                    }
                }
            }
        }

        /* renamed from: h */
        public void mo52589h(r24 r24, fq0<?> fq0) {
            vx2.m53591g(fq0, "value");
            if (r24 != null) {
                this.f38562b.put(r24, fq0);
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public j10(mx3 mx3, NotFoundClasses notFoundClasses, da6 da6, nc3 nc3) {
        super(da6, nc3);
        vx2.m53591g(mx3, "module");
        vx2.m53591g(notFoundClasses, "notFoundClasses");
        vx2.m53591g(da6, "storageManager");
        vx2.m53591g(nc3, "kotlinClassFinder");
        this.f38545c = mx3;
        this.f38546d = notFoundClasses;
        this.f38547e = new C9600xl(mx3, notFoundClasses);
    }

    /* renamed from: K */
    public final fq0<?> mo52577K(r24 r24, Object obj) {
        fq0<?> c = ConstantValueFactory.f40088a.mo55066c(obj);
        if (c != null) {
            return c;
        }
        pr1.C9186a aVar = pr1.f44096b;
        return aVar.mo65345a("Unsupported annotation argument: " + r24);
    }

    /* renamed from: L */
    public fq0<?> mo52575G(String str, Object obj) {
        vx2.m53591g(str, "desc");
        vx2.m53591g(obj, "initializer");
        boolean z = false;
        if (StringsKt__StringsKt.m63081R("ZBCS", str, false, 2, (Object) null)) {
            int intValue = ((Integer) obj).intValue();
            int hashCode = str.hashCode();
            if (hashCode != 66) {
                if (hashCode != 67) {
                    if (hashCode != 83) {
                        if (hashCode == 90 && str.equals("Z")) {
                            if (intValue != 0) {
                                z = true;
                            }
                            obj = Boolean.valueOf(z);
                        }
                    } else if (str.equals("S")) {
                        obj = Short.valueOf((short) intValue);
                    }
                } else if (str.equals("C")) {
                    obj = Character.valueOf((char) intValue);
                }
            } else if (str.equals("B")) {
                obj = Byte.valueOf((byte) intValue);
            }
            throw new AssertionError(str);
        }
        return ConstantValueFactory.f40088a.mo55066c(obj);
    }

    /* renamed from: M */
    public C9460vl mo52574A(ProtoBuf$Annotation protoBuf$Annotation, t24 t24) {
        vx2.m53591g(protoBuf$Annotation, "proto");
        vx2.m53591g(t24, "nameResolver");
        return this.f38547e.mo66874a(protoBuf$Annotation, t24);
    }

    /* renamed from: N */
    public final if0 mo52580N(nf0 nf0) {
        return FindClassInModuleKt.m60280c(this.f38545c, nf0, this.f38546d);
    }

    /* renamed from: O */
    public fq0<?> mo52576I(fq0<?> fq0) {
        fq0<?> y27;
        vx2.m53591g(fq0, "constant");
        if (fq0 instanceof d70) {
            y27 = new v27(((Number) ((d70) fq0).mo51739b()).byteValue());
        } else if (fq0 instanceof u06) {
            y27 = new a37(((Number) ((u06) fq0).mo51739b()).shortValue());
        } else if (fq0 instanceof ax2) {
            y27 = new w27(((Number) ((ax2) fq0).mo51739b()).intValue());
        } else if (!(fq0 instanceof jl3)) {
            return fq0;
        } else {
            y27 = new y27(((Number) ((jl3) fq0).mo51739b()).longValue());
        }
        return y27;
    }

    /* renamed from: x */
    public tc3.C9341a mo52582x(nf0 nf0, a66 a66, List<C9460vl> list) {
        vx2.m53591g(nf0, "annotationClassId");
        vx2.m53591g(a66, "source");
        vx2.m53591g(list, "result");
        return new C7237b(this, mo52580N(nf0), nf0, list, a66);
    }
}
