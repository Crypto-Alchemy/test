package kotlin.reflect.jvm.internal.impl.load.kotlin;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.reflect.jvm.internal.impl.load.kotlin.AbstractBinaryClassAnnotationLoader;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Property;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotatedCallableKind;
import org.web3j.ens.contracts.generated.PublicResolver;
import p000.ss3;
import p000.tc3;

/* compiled from: AbstractBinaryClassAnnotationAndConstantLoader.kt */
public abstract class AbstractBinaryClassAnnotationAndConstantLoader<A, C> extends AbstractBinaryClassAnnotationLoader<A, C7502a<? extends A, ? extends C>> implements C9363tl<A, C> {

    /* renamed from: b */
    public final vs3<tc3, C7502a<A, C>> f39586b;

    /* renamed from: kotlin.reflect.jvm.internal.impl.load.kotlin.AbstractBinaryClassAnnotationAndConstantLoader$a */
    /* compiled from: AbstractBinaryClassAnnotationAndConstantLoader.kt */
    public static final class C7502a<A, C> extends AbstractBinaryClassAnnotationLoader.C7508a<A> {

        /* renamed from: a */
        public final Map<ss3, List<A>> f39587a;

        /* renamed from: b */
        public final Map<ss3, C> f39588b;

        /* renamed from: c */
        public final Map<ss3, C> f39589c;

        public C7502a(Map<ss3, ? extends List<? extends A>> map, Map<ss3, ? extends C> map2, Map<ss3, ? extends C> map3) {
            vx2.m53591g(map, "memberAnnotations");
            vx2.m53591g(map2, "propertyConstants");
            vx2.m53591g(map3, "annotationParametersDefaultValues");
            this.f39587a = map;
            this.f39588b = map2;
            this.f39589c = map3;
        }

        /* renamed from: a */
        public Map<ss3, List<A>> mo53764a() {
            return this.f39587a;
        }

        /* renamed from: b */
        public final Map<ss3, C> mo53765b() {
            return this.f39589c;
        }

        /* renamed from: c */
        public final Map<ss3, C> mo53766c() {
            return this.f39588b;
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.load.kotlin.AbstractBinaryClassAnnotationAndConstantLoader$b */
    /* compiled from: AbstractBinaryClassAnnotationAndConstantLoader.kt */
    public static final class C7503b implements tc3.C9344d {

        /* renamed from: a */
        public final /* synthetic */ AbstractBinaryClassAnnotationAndConstantLoader<A, C> f39590a;

        /* renamed from: b */
        public final /* synthetic */ HashMap<ss3, List<A>> f39591b;

        /* renamed from: c */
        public final /* synthetic */ tc3 f39592c;

        /* renamed from: d */
        public final /* synthetic */ HashMap<ss3, C> f39593d;

        /* renamed from: e */
        public final /* synthetic */ HashMap<ss3, C> f39594e;

        /* renamed from: kotlin.reflect.jvm.internal.impl.load.kotlin.AbstractBinaryClassAnnotationAndConstantLoader$b$a */
        /* compiled from: AbstractBinaryClassAnnotationAndConstantLoader.kt */
        public final class C7504a extends C7505b implements tc3.C9345e {

            /* renamed from: d */
            public final /* synthetic */ C7503b f39595d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C7504a(C7503b bVar, ss3 ss3) {
                super(bVar, ss3);
                vx2.m53591g(ss3, "signature");
                this.f39595d = bVar;
            }

            /* renamed from: c */
            public tc3.C9341a mo53769c(int i, nf0 nf0, a66 a66) {
                vx2.m53591g(nf0, "classId");
                vx2.m53591g(a66, "source");
                ss3 e = ss3.f44599b.mo65906e(mo53772d(), i);
                List list = this.f39595d.f39591b.get(e);
                if (list == null) {
                    list = new ArrayList();
                    this.f39595d.f39591b.put(e, list);
                }
                return this.f39595d.f39590a.mo53794y(nf0, a66, list);
            }
        }

        /* renamed from: kotlin.reflect.jvm.internal.impl.load.kotlin.AbstractBinaryClassAnnotationAndConstantLoader$b$b */
        /* compiled from: AbstractBinaryClassAnnotationAndConstantLoader.kt */
        public class C7505b implements tc3.C9343c {

            /* renamed from: a */
            public final ss3 f39596a;

            /* renamed from: b */
            public final ArrayList<A> f39597b = new ArrayList<>();

            /* renamed from: c */
            public final /* synthetic */ C7503b f39598c;

            public C7505b(C7503b bVar, ss3 ss3) {
                vx2.m53591g(ss3, "signature");
                this.f39598c = bVar;
                this.f39596a = ss3;
            }

            /* renamed from: a */
            public void mo53770a() {
                if (!this.f39597b.isEmpty()) {
                    this.f39598c.f39591b.put(this.f39596a, this.f39597b);
                }
            }

            /* renamed from: b */
            public tc3.C9341a mo53771b(nf0 nf0, a66 a66) {
                vx2.m53591g(nf0, "classId");
                vx2.m53591g(a66, "source");
                return this.f39598c.f39590a.mo53794y(nf0, a66, this.f39597b);
            }

            /* renamed from: d */
            public final ss3 mo53772d() {
                return this.f39596a;
            }
        }

        public C7503b(AbstractBinaryClassAnnotationAndConstantLoader<A, C> abstractBinaryClassAnnotationAndConstantLoader, HashMap<ss3, List<A>> hashMap, tc3 tc3, HashMap<ss3, C> hashMap2, HashMap<ss3, C> hashMap3) {
            this.f39590a = abstractBinaryClassAnnotationAndConstantLoader;
            this.f39591b = hashMap;
            this.f39592c = tc3;
            this.f39593d = hashMap2;
            this.f39594e = hashMap3;
        }

        /* renamed from: a */
        public tc3.C9345e mo53767a(r24 r24, String str) {
            vx2.m53591g(r24, PublicResolver.FUNC_NAME);
            vx2.m53591g(str, "desc");
            ss3.C9315a aVar = ss3.f44599b;
            String d = r24.mo65594d();
            vx2.m53590f(d, "name.asString()");
            return new C7504a(this, aVar.mo65905d(d, str));
        }

        /* renamed from: b */
        public tc3.C9343c mo53768b(r24 r24, String str, Object obj) {
            C G;
            vx2.m53591g(r24, PublicResolver.FUNC_NAME);
            vx2.m53591g(str, "desc");
            ss3.C9315a aVar = ss3.f44599b;
            String d = r24.mo65594d();
            vx2.m53590f(d, "name.asString()");
            ss3 a = aVar.mo65902a(d, str);
            if (!(obj == null || (G = this.f39590a.mo52575G(str, obj)) == null)) {
                this.f39594e.put(a, G);
            }
            return new C7505b(this, a);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AbstractBinaryClassAnnotationAndConstantLoader(da6 da6, nc3 nc3) {
        super(nc3);
        vx2.m53591g(da6, "storageManager");
        vx2.m53591g(nc3, "kotlinClassFinder");
        this.f39586b = da6.mo51163h(new AbstractBinaryClassAnnotationAndConstantLoader$storage$1(this));
    }

    /* renamed from: D */
    public C7502a<A, C> mo53763p(tc3 tc3) {
        vx2.m53591g(tc3, "binaryClass");
        return this.f39586b.invoke(tc3);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: t83$b$b} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: E */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo53758E(p000.nf0 r3, java.util.Map<p000.r24, ? extends p000.fq0<?>> r4) {
        /*
            r2 = this;
            java.lang.String r0 = "annotationClassId"
            p000.vx2.m53591g(r3, r0)
            java.lang.String r0 = "arguments"
            p000.vx2.m53591g(r4, r0)
            m66 r0 = p000.m66.f40792a
            nf0 r0 = r0.mo56144a()
            boolean r3 = p000.vx2.m53586b(r3, r0)
            r0 = 0
            if (r3 != 0) goto L_0x0018
            return r0
        L_0x0018:
            java.lang.String r3 = "value"
            r24 r3 = p000.r24.m71445h(r3)
            java.lang.Object r3 = r4.get(r3)
            boolean r4 = r3 instanceof p000.t83
            r1 = 0
            if (r4 == 0) goto L_0x002a
            t83 r3 = (p000.t83) r3
            goto L_0x002b
        L_0x002a:
            r3 = r1
        L_0x002b:
            if (r3 != 0) goto L_0x002e
            return r0
        L_0x002e:
            java.lang.Object r3 = r3.mo51739b()
            boolean r4 = r3 instanceof p000.t83.C9332b.C9334b
            if (r4 == 0) goto L_0x0039
            r1 = r3
            t83$b$b r1 = (p000.t83.C9332b.C9334b) r1
        L_0x0039:
            if (r1 != 0) goto L_0x003c
            return r0
        L_0x003c:
            nf0 r3 = r1.mo65997b()
            boolean r3 = r2.mo53793w(r3)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.load.kotlin.AbstractBinaryClassAnnotationAndConstantLoader.mo53758E(nf0, java.util.Map):boolean");
    }

    /* renamed from: F */
    public final C7502a<A, C> mo53759F(tc3 tc3) {
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        HashMap hashMap3 = new HashMap();
        tc3.mo65263c(new C7503b(this, hashMap, tc3, hashMap3, hashMap2), mo53789q(tc3));
        return new C7502a<>(hashMap, hashMap2, hashMap3);
    }

    /* renamed from: G */
    public abstract C mo52575G(String str, Object obj);

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x001e, code lost:
        r4 = r10;
        r5 = r12;
     */
    /* renamed from: H */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final C mo53760H(p000.xx4 r11, kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Property r12, kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotatedCallableKind r13, p000.xc3 r14, p000.fd2<? super kotlin.reflect.jvm.internal.impl.load.kotlin.AbstractBinaryClassAnnotationAndConstantLoader.C7502a<? extends A, ? extends C>, ? super p000.ss3, ? extends C> r15) {
        /*
            r10 = this;
            b42$b r0 = p000.b42.f36637A
            int r1 = r12.getFlags()
            java.lang.Boolean r6 = r0.mo50465d(r1)
            boolean r7 = p000.i83.m58870f(r12)
            r4 = 1
            r5 = 1
            r2 = r10
            r3 = r11
            tc3 r0 = r2.mo53792v(r3, r4, r5, r6, r7)
            tc3 r0 = r10.mo53788o(r11, r0)
            r1 = 0
            if (r0 != 0) goto L_0x001e
            return r1
        L_0x001e:
            kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader r2 = r0.mo65261a()
            c83 r2 = r2.mo53823d()
            kotlin.reflect.jvm.internal.impl.load.kotlin.DeserializedDescriptorResolver$a r3 = kotlin.reflect.jvm.internal.impl.load.kotlin.DeserializedDescriptorResolver.f39604b
            c83 r3 = r3.mo53808a()
            boolean r9 = r2.mo62816d(r3)
            t24 r6 = r11.mo66966b()
            w17 r7 = r11.mo66968d()
            r4 = r10
            r5 = r12
            r8 = r13
            ss3 r11 = r4.mo53790r(r5, r6, r7, r8, r9)
            if (r11 != 0) goto L_0x0042
            return r1
        L_0x0042:
            vs3<tc3, kotlin.reflect.jvm.internal.impl.load.kotlin.AbstractBinaryClassAnnotationAndConstantLoader$a<A, C>> r12 = r10.f39586b
            java.lang.Object r12 = r12.invoke(r0)
            java.lang.Object r11 = r15.invoke(r12, r11)
            if (r11 != 0) goto L_0x004f
            return r1
        L_0x004f:
            boolean r12 = p000.s47.m71878d(r14)
            if (r12 == 0) goto L_0x0059
            java.lang.Object r11 = r10.mo52576I(r11)
        L_0x0059:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.load.kotlin.AbstractBinaryClassAnnotationAndConstantLoader.mo53760H(xx4, kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Property, kotlin.reflect.jvm.internal.impl.serialization.deserialization.AnnotatedCallableKind, xc3, fd2):java.lang.Object");
    }

    /* renamed from: I */
    public abstract C mo52576I(C c);

    /* renamed from: h */
    public C mo53761h(xx4 xx4, ProtoBuf$Property protoBuf$Property, xc3 xc3) {
        vx2.m53591g(xx4, "container");
        vx2.m53591g(protoBuf$Property, "proto");
        vx2.m53591g(xc3, "expectedType");
        return mo53760H(xx4, protoBuf$Property, AnnotatedCallableKind.PROPERTY, xc3, C7507xb4efac6.INSTANCE);
    }

    /* renamed from: j */
    public C mo53762j(xx4 xx4, ProtoBuf$Property protoBuf$Property, xc3 xc3) {
        vx2.m53591g(xx4, "container");
        vx2.m53591g(protoBuf$Property, "proto");
        vx2.m53591g(xc3, "expectedType");
        return mo53760H(xx4, protoBuf$Property, AnnotatedCallableKind.PROPERTY_GETTER, xc3, C7506xb1722d2c.INSTANCE);
    }
}
