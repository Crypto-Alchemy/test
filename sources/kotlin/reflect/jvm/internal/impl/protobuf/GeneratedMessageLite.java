package kotlin.reflect.jvm.internal.impl.protobuf;

import java.io.IOException;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.reflect.jvm.internal.impl.protobuf.C7610a;
import kotlin.reflect.jvm.internal.impl.protobuf.C7618e;
import kotlin.reflect.jvm.internal.impl.protobuf.C7621f;
import kotlin.reflect.jvm.internal.impl.protobuf.C7628h;
import kotlin.reflect.jvm.internal.impl.protobuf.WireFormat;

public abstract class GeneratedMessageLite extends C7610a implements Serializable {

    /* renamed from: kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$a */
    public static /* synthetic */ class C7600a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f39918a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                kotlin.reflect.jvm.internal.impl.protobuf.WireFormat$JavaType[] r0 = kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.JavaType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f39918a = r0
                kotlin.reflect.jvm.internal.impl.protobuf.WireFormat$JavaType r1 = kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.JavaType.MESSAGE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f39918a     // Catch:{ NoSuchFieldError -> 0x001d }
                kotlin.reflect.jvm.internal.impl.protobuf.WireFormat$JavaType r1 = kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.JavaType.ENUM     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.C7600a.<clinit>():void");
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$b */
    public static abstract class C7601b<MessageType extends GeneratedMessageLite, BuilderType extends C7601b> extends C7610a.C7611a<BuilderType> {

        /* renamed from: a */
        public c70 f39919a = c70.f37074a;

        /* renamed from: d */
        public BuilderType clone() {
            throw new UnsupportedOperationException("This is supposed to be overridden by subclasses.");
        }

        /* renamed from: f */
        public final c70 mo54651f() {
            return this.f39919a;
        }

        /* renamed from: g */
        public abstract BuilderType mo53896g(MessageType messagetype);

        /* renamed from: h */
        public final BuilderType mo54652h(c70 c70) {
            this.f39919a = c70;
            return this;
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$c */
    public static abstract class C7602c<MessageType extends ExtendableMessage<MessageType>, BuilderType extends C7602c<MessageType, BuilderType>> extends C7601b<MessageType, BuilderType> implements ru3 {

        /* renamed from: d */
        public C7618e<C7603d> f39920d = C7618e.m62015g();

        /* renamed from: e */
        public boolean f39921e;

        /* renamed from: j */
        public final C7618e<C7603d> mo54653j() {
            this.f39920d.mo54749q();
            this.f39921e = false;
            return this.f39920d;
        }

        /* renamed from: l */
        public final void mo54654l() {
            if (!this.f39921e) {
                this.f39920d = this.f39920d.clone();
                this.f39921e = true;
            }
        }

        /* renamed from: m */
        public final void mo54655m(MessageType messagetype) {
            mo54654l();
            this.f39920d.mo54750r(messagetype.extensions);
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$d */
    public static final class C7603d implements C7618e.C7620b<C7603d> {

        /* renamed from: a */
        public final C7621f.C7623b<?> f39922a;

        /* renamed from: d */
        public final int f39923d;

        /* renamed from: e */
        public final WireFormat.FieldType f39924e;

        /* renamed from: g */
        public final boolean f39925g;

        /* renamed from: k */
        public final boolean f39926k;

        public C7603d(C7621f.C7623b<?> bVar, int i, WireFormat.FieldType fieldType, boolean z, boolean z2) {
            this.f39922a = bVar;
            this.f39923d = i;
            this.f39924e = fieldType;
            this.f39925g = z;
            this.f39926k = z2;
        }

        /* renamed from: a */
        public int compareTo(C7603d dVar) {
            return this.f39923d - dVar.f39923d;
        }

        /* renamed from: d */
        public C7621f.C7623b<?> mo54658d() {
            return this.f39922a;
        }

        public int getNumber() {
            return this.f39923d;
        }

        public boolean isPacked() {
            return this.f39926k;
        }

        /* renamed from: j */
        public boolean mo54661j() {
            return this.f39925g;
        }

        /* renamed from: k */
        public WireFormat.FieldType mo54662k() {
            return this.f39924e;
        }

        /* renamed from: n */
        public WireFormat.JavaType mo54663n() {
            return this.f39924e.getJavaType();
        }

        /* renamed from: y0 */
        public C7628h.C7629a mo54664y0(C7628h.C7629a aVar, C7628h hVar) {
            return ((C7601b) aVar).mo53896g((GeneratedMessageLite) hVar);
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$e */
    public static class C7604e<ContainingType extends C7628h, Type> {

        /* renamed from: a */
        public final ContainingType f39927a;

        /* renamed from: b */
        public final Type f39928b;

        /* renamed from: c */
        public final C7628h f39929c;

        /* renamed from: d */
        public final C7603d f39930d;

        /* renamed from: e */
        public final Class f39931e;

        /* renamed from: f */
        public final Method f39932f;

        public C7604e(ContainingType containingtype, Type type, C7628h hVar, C7603d dVar, Class cls) {
            if (containingtype == null) {
                throw new IllegalArgumentException("Null containingTypeDefaultInstance");
            } else if (dVar.mo54662k() == WireFormat.FieldType.MESSAGE && hVar == null) {
                throw new IllegalArgumentException("Null messageDefaultInstance");
            } else {
                this.f39927a = containingtype;
                this.f39928b = type;
                this.f39929c = hVar;
                this.f39930d = dVar;
                this.f39931e = cls;
                if (C7621f.C7622a.class.isAssignableFrom(cls)) {
                    this.f39932f = GeneratedMessageLite.getMethodOrDie(cls, "valueOf", Integer.TYPE);
                    return;
                }
                this.f39932f = null;
            }
        }

        /* renamed from: a */
        public Object mo54665a(Object obj) {
            if (!this.f39930d.mo54661j()) {
                return mo54669e(obj);
            }
            if (this.f39930d.mo54663n() != WireFormat.JavaType.ENUM) {
                return obj;
            }
            ArrayList arrayList = new ArrayList();
            for (Object e : (List) obj) {
                arrayList.add(mo54669e(e));
            }
            return arrayList;
        }

        /* renamed from: b */
        public ContainingType mo54666b() {
            return this.f39927a;
        }

        /* renamed from: c */
        public C7628h mo54667c() {
            return this.f39929c;
        }

        /* renamed from: d */
        public int mo54668d() {
            return this.f39930d.getNumber();
        }

        /* renamed from: e */
        public Object mo54669e(Object obj) {
            if (this.f39930d.mo54663n() != WireFormat.JavaType.ENUM) {
                return obj;
            }
            return GeneratedMessageLite.invokeOrDie(this.f39932f, (Object) null, (Integer) obj);
        }

        /* renamed from: f */
        public Object mo54670f(Object obj) {
            if (this.f39930d.mo54663n() == WireFormat.JavaType.ENUM) {
                return Integer.valueOf(((C7621f.C7622a) obj).getNumber());
            }
            return obj;
        }
    }

    public GeneratedMessageLite() {
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0045  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static <MessageType extends kotlin.reflect.jvm.internal.impl.protobuf.C7628h> boolean m61921a(kotlin.reflect.jvm.internal.impl.protobuf.C7618e<kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.C7603d> r5, MessageType r6, kotlin.reflect.jvm.internal.impl.protobuf.C7614c r7, kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream r8, kotlin.reflect.jvm.internal.impl.protobuf.C7616d r9, int r10) throws java.io.IOException {
        /*
            int r0 = kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.m61945b(r10)
            int r1 = kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.m61944a(r10)
            kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$e r6 = r9.mo54734b(r6, r1)
            r1 = 0
            r2 = 1
            if (r6 != 0) goto L_0x0013
        L_0x0010:
            r3 = r1
            r0 = r2
            goto L_0x003e
        L_0x0013:
            kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$d r3 = r6.f39930d
            kotlin.reflect.jvm.internal.impl.protobuf.WireFormat$FieldType r3 = r3.mo54662k()
            int r3 = kotlin.reflect.jvm.internal.impl.protobuf.C7618e.m62016l(r3, r1)
            if (r0 != r3) goto L_0x0022
            r0 = r1
            r3 = r0
            goto L_0x003e
        L_0x0022:
            kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$d r3 = r6.f39930d
            boolean r4 = r3.f39925g
            if (r4 == 0) goto L_0x0010
            kotlin.reflect.jvm.internal.impl.protobuf.WireFormat$FieldType r3 = r3.f39924e
            boolean r3 = r3.isPackable()
            if (r3 == 0) goto L_0x0010
            kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$d r3 = r6.f39930d
            kotlin.reflect.jvm.internal.impl.protobuf.WireFormat$FieldType r3 = r3.mo54662k()
            int r3 = kotlin.reflect.jvm.internal.impl.protobuf.C7618e.m62016l(r3, r2)
            if (r0 != r3) goto L_0x0010
            r0 = r1
            r3 = r2
        L_0x003e:
            if (r0 == 0) goto L_0x0045
            boolean r5 = r7.mo54705P(r10, r8)
            return r5
        L_0x0045:
            if (r3 == 0) goto L_0x0095
            int r8 = r7.mo54691A()
            int r8 = r7.mo54715j(r8)
            kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$d r9 = r6.f39930d
            kotlin.reflect.jvm.internal.impl.protobuf.WireFormat$FieldType r9 = r9.mo54662k()
            kotlin.reflect.jvm.internal.impl.protobuf.WireFormat$FieldType r10 = kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.FieldType.ENUM
            if (r9 != r10) goto L_0x007a
        L_0x0059:
            int r9 = r7.mo54712e()
            if (r9 <= 0) goto L_0x0090
            int r9 = r7.mo54719n()
            kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$d r10 = r6.f39930d
            kotlin.reflect.jvm.internal.impl.protobuf.f$b r10 = r10.mo54658d()
            kotlin.reflect.jvm.internal.impl.protobuf.f$a r9 = r10.findValueByNumber(r9)
            if (r9 != 0) goto L_0x0070
            return r2
        L_0x0070:
            kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$d r10 = r6.f39930d
            java.lang.Object r9 = r6.mo54670f(r9)
            r5.mo54737a(r10, r9)
            goto L_0x0059
        L_0x007a:
            int r9 = r7.mo54712e()
            if (r9 <= 0) goto L_0x0090
            kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$d r9 = r6.f39930d
            kotlin.reflect.jvm.internal.impl.protobuf.WireFormat$FieldType r9 = r9.mo54662k()
            java.lang.Object r9 = kotlin.reflect.jvm.internal.impl.protobuf.C7618e.m62018u(r7, r9, r1)
            kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$d r10 = r6.f39930d
            r5.mo54737a(r10, r9)
            goto L_0x007a
        L_0x0090:
            r7.mo54714i(r8)
            goto L_0x0121
        L_0x0095:
            int[] r0 = kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.C7600a.f39918a
            kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$d r3 = r6.f39930d
            kotlin.reflect.jvm.internal.impl.protobuf.WireFormat$JavaType r3 = r3.mo54663n()
            int r3 = r3.ordinal()
            r0 = r0[r3]
            if (r0 == r2) goto L_0x00cc
            r9 = 2
            if (r0 == r9) goto L_0x00b3
            kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$d r8 = r6.f39930d
            kotlin.reflect.jvm.internal.impl.protobuf.WireFormat$FieldType r8 = r8.mo54662k()
            java.lang.Object r7 = kotlin.reflect.jvm.internal.impl.protobuf.C7618e.m62018u(r7, r8, r1)
            goto L_0x0106
        L_0x00b3:
            int r7 = r7.mo54719n()
            kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$d r9 = r6.f39930d
            kotlin.reflect.jvm.internal.impl.protobuf.f$b r9 = r9.mo54658d()
            kotlin.reflect.jvm.internal.impl.protobuf.f$a r9 = r9.findValueByNumber(r7)
            if (r9 != 0) goto L_0x00ca
            r8.mo54628o0(r10)
            r8.mo54638y0(r7)
            return r2
        L_0x00ca:
            r7 = r9
            goto L_0x0106
        L_0x00cc:
            r8 = 0
            kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$d r10 = r6.f39930d
            boolean r10 = r10.mo54661j()
            if (r10 != 0) goto L_0x00e3
            kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$d r10 = r6.f39930d
            java.lang.Object r10 = r5.mo54741h(r10)
            kotlin.reflect.jvm.internal.impl.protobuf.h r10 = (kotlin.reflect.jvm.internal.impl.protobuf.C7628h) r10
            if (r10 == 0) goto L_0x00e3
            kotlin.reflect.jvm.internal.impl.protobuf.h$a r8 = r10.toBuilder()
        L_0x00e3:
            if (r8 != 0) goto L_0x00ed
            kotlin.reflect.jvm.internal.impl.protobuf.h r8 = r6.mo54667c()
            kotlin.reflect.jvm.internal.impl.protobuf.h$a r8 = r8.newBuilderForType()
        L_0x00ed:
            kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$d r10 = r6.f39930d
            kotlin.reflect.jvm.internal.impl.protobuf.WireFormat$FieldType r10 = r10.mo54662k()
            kotlin.reflect.jvm.internal.impl.protobuf.WireFormat$FieldType r0 = kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.FieldType.GROUP
            if (r10 != r0) goto L_0x00ff
            int r10 = r6.mo54668d()
            r7.mo54723r(r10, r8, r9)
            goto L_0x0102
        L_0x00ff:
            r7.mo54727v(r8, r9)
        L_0x0102:
            kotlin.reflect.jvm.internal.impl.protobuf.h r7 = r8.build()
        L_0x0106:
            kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$d r8 = r6.f39930d
            boolean r8 = r8.mo54661j()
            if (r8 == 0) goto L_0x0118
            kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$d r8 = r6.f39930d
            java.lang.Object r6 = r6.mo54670f(r7)
            r5.mo54737a(r8, r6)
            goto L_0x0121
        L_0x0118:
            kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$d r8 = r6.f39930d
            java.lang.Object r6 = r6.mo54670f(r7)
            r5.mo54752v(r8, r6)
        L_0x0121:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.m61921a(kotlin.reflect.jvm.internal.impl.protobuf.e, kotlin.reflect.jvm.internal.impl.protobuf.h, kotlin.reflect.jvm.internal.impl.protobuf.c, kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream, kotlin.reflect.jvm.internal.impl.protobuf.d, int):boolean");
    }

    static Method getMethodOrDie(Class cls, String str, Class... clsArr) {
        try {
            return cls.getMethod(str, clsArr);
        } catch (NoSuchMethodException e) {
            String name = cls.getName();
            String valueOf = String.valueOf(str);
            StringBuilder sb = new StringBuilder(name.length() + 45 + valueOf.length());
            sb.append("Generated message class \"");
            sb.append(name);
            sb.append("\" missing method \"");
            sb.append(valueOf);
            sb.append("\".");
            throw new RuntimeException(sb.toString(), e);
        }
    }

    static Object invokeOrDie(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e);
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            } else if (cause instanceof Error) {
                throw ((Error) cause);
            } else {
                throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
            }
        }
    }

    public static <ContainingType extends C7628h, Type> C7604e<ContainingType, Type> newRepeatedGeneratedExtension(ContainingType containingtype, C7628h hVar, C7621f.C7623b<?> bVar, int i, WireFormat.FieldType fieldType, boolean z, Class cls) {
        return new C7604e(containingtype, Collections.emptyList(), hVar, new C7603d(bVar, i, fieldType, true, z), cls);
    }

    public static <ContainingType extends C7628h, Type> C7604e<ContainingType, Type> newSingularGeneratedExtension(ContainingType containingtype, Type type, C7628h hVar, C7621f.C7623b<?> bVar, int i, WireFormat.FieldType fieldType, Class cls) {
        return new C7604e(containingtype, type, hVar, new C7603d(bVar, i, fieldType, false, false), cls);
    }

    public abstract /* synthetic */ C7628h getDefaultInstanceForType();

    public jm4<? extends C7628h> getParserForType() {
        throw new UnsupportedOperationException("This is supposed to be overridden by subclasses.");
    }

    public abstract /* synthetic */ int getSerializedSize();

    public abstract /* synthetic */ boolean isInitialized();

    public void makeExtensionsImmutable() {
    }

    public abstract /* synthetic */ C7628h.C7629a newBuilderForType();

    public boolean parseUnknownField(C7614c cVar, CodedOutputStream codedOutputStream, C7616d dVar, int i) throws IOException {
        return cVar.mo54705P(i, codedOutputStream);
    }

    public abstract /* synthetic */ C7628h.C7629a toBuilder();

    public abstract /* synthetic */ void writeTo(CodedOutputStream codedOutputStream) throws IOException;

    public static abstract class ExtendableMessage<MessageType extends ExtendableMessage<MessageType>> extends GeneratedMessageLite implements ru3 {
        /* access modifiers changed from: private */
        public final C7618e<C7603d> extensions;

        /* renamed from: kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$ExtendableMessage$a */
        public class C7599a {

            /* renamed from: a */
            public final Iterator<Map.Entry<C7603d, Object>> f39914a;

            /* renamed from: b */
            public Map.Entry<C7603d, Object> f39915b;

            /* renamed from: c */
            public final boolean f39916c;

            public /* synthetic */ C7599a(ExtendableMessage extendableMessage, boolean z, C7600a aVar) {
                this(z);
            }

            /* renamed from: a */
            public void mo54650a(int i, CodedOutputStream codedOutputStream) throws IOException {
                while (true) {
                    Map.Entry<C7603d, Object> entry = this.f39915b;
                    if (entry != null && entry.getKey().getNumber() < i) {
                        C7603d key = this.f39915b.getKey();
                        if (!this.f39916c || key.mo54663n() != WireFormat.JavaType.MESSAGE || key.mo54661j()) {
                            C7618e.m62022z(key, this.f39915b.getValue(), codedOutputStream);
                        } else {
                            codedOutputStream.mo54619f0(key.getNumber(), (C7628h) this.f39915b.getValue());
                        }
                        if (this.f39914a.hasNext()) {
                            this.f39915b = this.f39914a.next();
                        } else {
                            this.f39915b = null;
                        }
                    } else {
                        return;
                    }
                }
            }

            public C7599a(boolean z) {
                Iterator<Map.Entry<C7603d, Object>> p = ExtendableMessage.this.extensions.mo54748p();
                this.f39914a = p;
                if (p.hasNext()) {
                    this.f39915b = p.next();
                }
                this.f39916c = z;
            }
        }

        public ExtendableMessage() {
            this.extensions = C7618e.m62017t();
        }

        /* renamed from: b */
        public final void mo54642b(C7604e<MessageType, ?> eVar) {
            if (eVar.mo54666b() != getDefaultInstanceForType()) {
                throw new IllegalArgumentException("This extension is for a different message type.  Please make sure that you are not suppressing any generics type warnings.");
            }
        }

        public boolean extensionsAreInitialized() {
            return this.extensions.mo54746n();
        }

        public int extensionsSerializedSize() {
            return this.extensions.mo54744k();
        }

        public abstract /* synthetic */ C7628h getDefaultInstanceForType();

        public final <Type> Type getExtension(C7604e<MessageType, Type> eVar) {
            mo54642b(eVar);
            Object h = this.extensions.mo54741h(eVar.f39930d);
            if (h == null) {
                return eVar.f39928b;
            }
            return eVar.mo54665a(h);
        }

        public final <Type> int getExtensionCount(C7604e<MessageType, List<Type>> eVar) {
            mo54642b(eVar);
            return this.extensions.mo54743j(eVar.f39930d);
        }

        public abstract /* synthetic */ int getSerializedSize();

        public final <Type> boolean hasExtension(C7604e<MessageType, Type> eVar) {
            mo54642b(eVar);
            return this.extensions.mo54745m(eVar.f39930d);
        }

        public abstract /* synthetic */ boolean isInitialized();

        public void makeExtensionsImmutable() {
            this.extensions.mo54749q();
        }

        public abstract /* synthetic */ C7628h.C7629a newBuilderForType();

        public ExtendableMessage<MessageType>.C6784a newExtensionWriter() {
            return new C7599a(this, false, (C7600a) null);
        }

        public boolean parseUnknownField(C7614c cVar, CodedOutputStream codedOutputStream, C7616d dVar, int i) throws IOException {
            return GeneratedMessageLite.m61921a(this.extensions, getDefaultInstanceForType(), cVar, codedOutputStream, dVar, i);
        }

        public abstract /* synthetic */ C7628h.C7629a toBuilder();

        public abstract /* synthetic */ void writeTo(CodedOutputStream codedOutputStream) throws IOException;

        public ExtendableMessage(C7602c<MessageType, ?> cVar) {
            this.extensions = cVar.mo54653j();
        }

        public final <Type> Type getExtension(C7604e<MessageType, List<Type>> eVar, int i) {
            mo54642b(eVar);
            return eVar.mo54669e(this.extensions.mo54742i(eVar.f39930d, i));
        }
    }

    public GeneratedMessageLite(C7601b bVar) {
    }
}
