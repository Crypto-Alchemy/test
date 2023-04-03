package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.C4699a;
import com.google.crypto.tink.shaded.protobuf.C4705c0;
import com.google.crypto.tink.shaded.protobuf.C4707d;
import com.google.crypto.tink.shaded.protobuf.C4752p;
import com.google.crypto.tink.shaded.protobuf.C4758t;
import com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite;
import com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite.C4680a;
import com.google.crypto.tink.shaded.protobuf.WireFormat;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public abstract class GeneratedMessageLite<MessageType extends GeneratedMessageLite<MessageType, BuilderType>, BuilderType extends C4680a<MessageType, BuilderType>> extends C4699a<MessageType, BuilderType> {
    private static Map<Object, GeneratedMessageLite<?, ?>> defaultInstanceMap = new ConcurrentHashMap();
    public int memoizedSerializedSize = -1;
    public C4750n0 unknownFields = C4750n0.m38246c();

    public enum MethodToInvoke {
        GET_MEMOIZED_IS_INITIALIZED,
        SET_MEMOIZED_IS_INITIALIZED,
        BUILD_MESSAGE_INFO,
        NEW_MUTABLE_INSTANCE,
        NEW_BUILDER,
        GET_DEFAULT_INSTANCE,
        GET_PARSER
    }

    /* renamed from: com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$a */
    public static abstract class C4680a<MessageType extends GeneratedMessageLite<MessageType, BuilderType>, BuilderType extends C4680a<MessageType, BuilderType>> extends C4699a.C4700a<MessageType, BuilderType> {

        /* renamed from: a */
        public final MessageType f25102a;

        /* renamed from: d */
        public MessageType f25103d;

        /* renamed from: e */
        public boolean f25104e = false;

        public C4680a(MessageType messagetype) {
            this.f25102a = messagetype;
            this.f25103d = (GeneratedMessageLite) messagetype.mo35452j(MethodToInvoke.NEW_MUTABLE_INSTANCE);
        }

        /* renamed from: g */
        public final MessageType build() {
            MessageType h = buildPartial();
            if (h.isInitialized()) {
                return h;
            }
            throw C4699a.C4700a.m37508f(h);
        }

        /* renamed from: h */
        public MessageType buildPartial() {
            if (this.f25104e) {
                return this.f25103d;
            }
            this.f25103d.mo35456r();
            this.f25104e = true;
            return this.f25103d;
        }

        /* renamed from: i */
        public BuilderType clone() {
            BuilderType t = getDefaultInstanceForType().newBuilderForType();
            t.mo35471p(buildPartial());
            return t;
        }

        /* renamed from: j */
        public final void mo35467j() {
            if (this.f25104e) {
                mo35468l();
                this.f25104e = false;
            }
        }

        /* renamed from: l */
        public void mo35468l() {
            MessageType messagetype = (GeneratedMessageLite) this.f25103d.mo35452j(MethodToInvoke.NEW_MUTABLE_INSTANCE);
            mo35472r(messagetype, this.f25103d);
            this.f25103d = messagetype;
        }

        /* renamed from: m */
        public MessageType getDefaultInstanceForType() {
            return this.f25102a;
        }

        /* renamed from: o */
        public BuilderType mo35460b(MessageType messagetype) {
            return mo35471p(messagetype);
        }

        /* renamed from: p */
        public BuilderType mo35471p(MessageType messagetype) {
            mo35467j();
            mo35472r(this.f25103d, messagetype);
            return this;
        }

        /* renamed from: r */
        public final void mo35472r(MessageType messagetype, MessageType messagetype2) {
            ey4.m44106a().mo42453e(messagetype).mo35712a(messagetype, messagetype2);
        }
    }

    /* renamed from: com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$b */
    public static class C4681b<T extends GeneratedMessageLite<T, ?>> extends C4702b<T> {

        /* renamed from: b */
        public final T f25105b;

        public C4681b(T t) {
            this.f25105b = t;
        }

        /* renamed from: g */
        public T mo35473a(C4717g gVar, C4734l lVar) throws InvalidProtocolBufferException {
            return GeneratedMessageLite.m37328y(this.f25105b, gVar, lVar);
        }
    }

    /* renamed from: com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$c */
    public static abstract class C4682c<MessageType extends C4682c<MessageType, BuilderType>, BuilderType> extends GeneratedMessageLite<MessageType, BuilderType> implements su3 {
        public C4752p<C4683d> extensions = C4752p.m38267h();

        /* renamed from: C */
        public C4752p<C4683d> mo35475C() {
            if (this.extensions.mo35993n()) {
                this.extensions = this.extensions.clone();
            }
            return this.extensions;
        }
    }

    /* renamed from: com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$d */
    public static final class C4683d implements C4752p.C4754b<C4683d> {

        /* renamed from: a */
        public final C4758t.C4762d<?> f25106a;

        /* renamed from: d */
        public final int f25107d;

        /* renamed from: e */
        public final WireFormat.FieldType f25108e;

        /* renamed from: g */
        public final boolean f25109g;

        /* renamed from: k */
        public final boolean f25110k;

        /* renamed from: X */
        public C4705c0.C4706a mo35476X(C4705c0.C4706a aVar, C4705c0 c0Var) {
            return ((C4680a) aVar).mo35471p((GeneratedMessageLite) c0Var);
        }

        /* renamed from: a */
        public int compareTo(C4683d dVar) {
            return this.f25107d - dVar.f25107d;
        }

        /* renamed from: d */
        public C4758t.C4762d<?> mo35479d() {
            return this.f25106a;
        }

        public int getNumber() {
            return this.f25107d;
        }

        public boolean isPacked() {
            return this.f25110k;
        }

        /* renamed from: j */
        public boolean mo35482j() {
            return this.f25109g;
        }

        /* renamed from: k */
        public WireFormat.FieldType mo35483k() {
            return this.f25108e;
        }

        /* renamed from: n */
        public WireFormat.JavaType mo35484n() {
            return this.f25108e.getJavaType();
        }
    }

    /* renamed from: com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite$e */
    public static class C4684e<ContainingType extends C4705c0, Type> extends C4732k<ContainingType, Type> {

        /* renamed from: a */
        public final C4705c0 f25111a;

        /* renamed from: b */
        public final C4683d f25112b;

        /* renamed from: a */
        public WireFormat.FieldType mo35485a() {
            return this.f25112b.mo35483k();
        }

        /* renamed from: b */
        public C4705c0 mo35486b() {
            return this.f25111a;
        }

        /* renamed from: c */
        public int mo35487c() {
            return this.f25112b.getNumber();
        }

        /* renamed from: d */
        public boolean mo35488d() {
            return this.f25112b.f25109g;
        }
    }

    /* renamed from: A */
    public static <T extends GeneratedMessageLite<?, ?>> void m37317A(Class<T> cls, T t) {
        defaultInstanceMap.put(cls, t);
    }

    /* renamed from: h */
    public static <T extends GeneratedMessageLite<T, ?>> T m37318h(T t) throws InvalidProtocolBufferException {
        if (t == null || t.isInitialized()) {
            return t;
        }
        throw t.mo35603e().asInvalidProtocolBufferException().setUnfinishedMessage(t);
    }

    /* renamed from: m */
    public static <E> C4758t.C4767i<E> m37319m() {
        return C4726h0.m38003k();
    }

    /* renamed from: n */
    public static <T extends GeneratedMessageLite<?, ?>> T m37320n(Class<T> cls) {
        T t = (GeneratedMessageLite) defaultInstanceMap.get(cls);
        if (t == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                t = (GeneratedMessageLite) defaultInstanceMap.get(cls);
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (t == null) {
            t = ((GeneratedMessageLite) q47.m50264l(cls)).getDefaultInstanceForType();
            if (t != null) {
                defaultInstanceMap.put(cls, t);
            } else {
                throw new IllegalStateException();
            }
        }
        return t;
    }

    /* renamed from: p */
    static Object m37321p(Method method, Object obj, Object... objArr) {
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

    /* renamed from: q */
    public static final <T extends GeneratedMessageLite<T, ?>> boolean m37322q(T t, boolean z) {
        T t2;
        byte byteValue = ((Byte) t.mo35452j(MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        boolean f = ey4.m44106a().mo42453e(t).mo35722f(t);
        if (z) {
            MethodToInvoke methodToInvoke = MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED;
            if (f) {
                t2 = t;
            } else {
                t2 = null;
            }
            t.mo35453k(methodToInvoke, t2);
        }
        return f;
    }

    /* renamed from: s */
    public static <E> C4758t.C4767i<E> m37323s(C4758t.C4767i<E> iVar) {
        int i;
        int size = iVar.size();
        if (size == 0) {
            i = 10;
        } else {
            i = size * 2;
        }
        return iVar.mo35757a(i);
    }

    /* renamed from: u */
    public static Object m37324u(C4705c0 c0Var, String str, Object[] objArr) {
        return new g75(c0Var, str, objArr);
    }

    /* renamed from: v */
    public static <T extends GeneratedMessageLite<T, ?>> T m37325v(T t, ByteString byteString, C4734l lVar) throws InvalidProtocolBufferException {
        return m37318h(m37327x(t, byteString, lVar));
    }

    /* renamed from: w */
    public static <T extends GeneratedMessageLite<T, ?>> T m37326w(T t, byte[] bArr, C4734l lVar) throws InvalidProtocolBufferException {
        return m37318h(m37329z(t, bArr, 0, bArr.length, lVar));
    }

    /* renamed from: x */
    public static <T extends GeneratedMessageLite<T, ?>> T m37327x(T t, ByteString byteString, C4734l lVar) throws InvalidProtocolBufferException {
        T y;
        try {
            C4717g newCodedInput = byteString.newCodedInput();
            y = m37328y(t, newCodedInput, lVar);
            newCodedInput.mo35786a(0);
            return y;
        } catch (InvalidProtocolBufferException e) {
            throw e.setUnfinishedMessage(y);
        } catch (InvalidProtocolBufferException e2) {
            throw e2;
        }
    }

    /* renamed from: y */
    public static <T extends GeneratedMessageLite<T, ?>> T m37328y(T t, C4717g gVar, C4734l lVar) throws InvalidProtocolBufferException {
        T t2 = (GeneratedMessageLite) t.mo35452j(MethodToInvoke.NEW_MUTABLE_INSTANCE);
        try {
            C4731j0 e = ey4.m44106a().mo42453e(t2);
            e.mo35728i(t2, C4725h.m37952Q(gVar), lVar);
            e.mo35720e(t2);
            return t2;
        } catch (InvalidProtocolBufferException e2) {
            e = e2;
            if (e.getThrownFromInputStream()) {
                e = new InvalidProtocolBufferException((IOException) e);
            }
            throw e.setUnfinishedMessage(t2);
        } catch (IOException e3) {
            if (e3.getCause() instanceof InvalidProtocolBufferException) {
                throw ((InvalidProtocolBufferException) e3.getCause());
            }
            throw new InvalidProtocolBufferException(e3).setUnfinishedMessage(t2);
        } catch (RuntimeException e4) {
            if (e4.getCause() instanceof InvalidProtocolBufferException) {
                throw ((InvalidProtocolBufferException) e4.getCause());
            }
            throw e4;
        }
    }

    /* renamed from: z */
    public static <T extends GeneratedMessageLite<T, ?>> T m37329z(T t, byte[] bArr, int i, int i2, C4734l lVar) throws InvalidProtocolBufferException {
        T t2 = (GeneratedMessageLite) t.mo35452j(MethodToInvoke.NEW_MUTABLE_INSTANCE);
        try {
            C4731j0 e = ey4.m44106a().mo42453e(t2);
            e.mo35726h(t2, bArr, i, i + i2, new C4707d.C4709b(lVar));
            e.mo35720e(t2);
            if (t2.memoizedHashCode == 0) {
                return t2;
            }
            throw new RuntimeException();
        } catch (InvalidProtocolBufferException e2) {
            e = e2;
            if (e.getThrownFromInputStream()) {
                e = new InvalidProtocolBufferException((IOException) e);
            }
            throw e.setUnfinishedMessage(t2);
        } catch (IOException e3) {
            if (e3.getCause() instanceof InvalidProtocolBufferException) {
                throw ((InvalidProtocolBufferException) e3.getCause());
            }
            throw new InvalidProtocolBufferException(e3).setUnfinishedMessage(t2);
        } catch (IndexOutOfBoundsException unused) {
            throw InvalidProtocolBufferException.truncatedMessage().setUnfinishedMessage(t2);
        }
    }

    /* renamed from: B */
    public final BuilderType toBuilder() {
        BuilderType buildertype = (C4680a) mo35452j(MethodToInvoke.NEW_BUILDER);
        buildertype.mo35471p(this);
        return buildertype;
    }

    /* renamed from: a */
    public void mo35441a(CodedOutputStream codedOutputStream) throws IOException {
        ey4.m44106a().mo42453e(this).mo35730j(this, C4727i.m38008P(codedOutputStream));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public int mo35442b() {
        return this.memoizedSerializedSize;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return ey4.m44106a().mo42453e(this).mo35718d(this, (GeneratedMessageLite) obj);
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo35444f(int i) {
        this.memoizedSerializedSize = i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public Object mo35445g() throws Exception {
        return mo35452j(MethodToInvoke.BUILD_MESSAGE_INFO);
    }

    public final km4<MessageType> getParserForType() {
        return (km4) mo35452j(MethodToInvoke.GET_PARSER);
    }

    public int getSerializedSize() {
        if (this.memoizedSerializedSize == -1) {
            this.memoizedSerializedSize = ey4.m44106a().mo42453e(this).mo35724g(this);
        }
        return this.memoizedSerializedSize;
    }

    public int hashCode() {
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        int c = ey4.m44106a().mo42453e(this).mo35716c(this);
        this.memoizedHashCode = c;
        return c;
    }

    /* renamed from: i */
    public final <MessageType extends GeneratedMessageLite<MessageType, BuilderType>, BuilderType extends C4680a<MessageType, BuilderType>> BuilderType mo35450i() {
        return (C4680a) mo35452j(MethodToInvoke.NEW_BUILDER);
    }

    public final boolean isInitialized() {
        return m37322q(this, true);
    }

    /* renamed from: j */
    public Object mo35452j(MethodToInvoke methodToInvoke) {
        return mo28927l(methodToInvoke, (Object) null, (Object) null);
    }

    /* renamed from: k */
    public Object mo35453k(MethodToInvoke methodToInvoke, Object obj) {
        return mo28927l(methodToInvoke, obj, (Object) null);
    }

    /* renamed from: l */
    public abstract Object mo28927l(MethodToInvoke methodToInvoke, Object obj, Object obj2);

    /* renamed from: o */
    public final MessageType getDefaultInstanceForType() {
        return (GeneratedMessageLite) mo35452j(MethodToInvoke.GET_DEFAULT_INSTANCE);
    }

    /* renamed from: r */
    public void mo35456r() {
        ey4.m44106a().mo42453e(this).mo35720e(this);
    }

    /* renamed from: t */
    public final BuilderType newBuilderForType() {
        return (C4680a) mo35452j(MethodToInvoke.NEW_BUILDER);
    }

    public String toString() {
        return C4710d0.m37584e(this, super.toString());
    }
}
