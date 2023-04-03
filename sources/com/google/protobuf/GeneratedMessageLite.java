package com.google.protobuf;

import com.google.protobuf.C4949a;
import com.google.protobuf.C4956c0;
import com.google.protobuf.C4958d;
import com.google.protobuf.C5005p;
import com.google.protobuf.C5011t;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.GeneratedMessageLite.C4930a;
import com.google.protobuf.WireFormat;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public abstract class GeneratedMessageLite<MessageType extends GeneratedMessageLite<MessageType, BuilderType>, BuilderType extends C4930a<MessageType, BuilderType>> extends C4949a<MessageType, BuilderType> {
    private static Map<Object, GeneratedMessageLite<?, ?>> defaultInstanceMap = new ConcurrentHashMap();
    public int memoizedSerializedSize = -1;
    public C5003n0 unknownFields = C5003n0.m39843c();

    public enum MethodToInvoke {
        GET_MEMOIZED_IS_INITIALIZED,
        SET_MEMOIZED_IS_INITIALIZED,
        BUILD_MESSAGE_INFO,
        NEW_MUTABLE_INSTANCE,
        NEW_BUILDER,
        GET_DEFAULT_INSTANCE,
        GET_PARSER
    }

    /* renamed from: com.google.protobuf.GeneratedMessageLite$a */
    public static abstract class C4930a<MessageType extends GeneratedMessageLite<MessageType, BuilderType>, BuilderType extends C4930a<MessageType, BuilderType>> extends C4949a.C4950a<MessageType, BuilderType> {
        private final MessageType defaultInstance;
        public MessageType instance;
        public boolean isBuilt = false;

        public C4930a(MessageType messagetype) {
            this.defaultInstance = messagetype;
            this.instance = (GeneratedMessageLite) messagetype.dynamicMethod(MethodToInvoke.NEW_MUTABLE_INSTANCE);
        }

        private void mergeFromInstance(MessageType messagetype, MessageType messagetype2) {
            dy4.m43731a().mo42090e(messagetype).mo37170a(messagetype, messagetype2);
        }

        public final void copyOnWrite() {
            if (this.isBuilt) {
                copyOnWriteInternal();
                this.isBuilt = false;
            }
        }

        public void copyOnWriteInternal() {
            MessageType messagetype = (GeneratedMessageLite) this.instance.dynamicMethod(MethodToInvoke.NEW_MUTABLE_INSTANCE);
            mergeFromInstance(messagetype, this.instance);
            this.instance = messagetype;
        }

        public final boolean isInitialized() {
            return GeneratedMessageLite.isInitialized(this.instance, false);
        }

        public final MessageType build() {
            MessageType buildPartial = buildPartial();
            if (buildPartial.isInitialized()) {
                return buildPartial;
            }
            throw C4949a.C4950a.newUninitializedMessageException(buildPartial);
        }

        public MessageType buildPartial() {
            if (this.isBuilt) {
                return this.instance;
            }
            this.instance.makeImmutable();
            this.isBuilt = true;
            return this.instance;
        }

        public final BuilderType clear() {
            this.instance = (GeneratedMessageLite) this.instance.dynamicMethod(MethodToInvoke.NEW_MUTABLE_INSTANCE);
            return this;
        }

        public MessageType getDefaultInstanceForType() {
            return this.defaultInstance;
        }

        public BuilderType internalMergeFrom(MessageType messagetype) {
            return mergeFrom(messagetype);
        }

        public BuilderType clone() {
            BuilderType newBuilderForType = getDefaultInstanceForType().newBuilderForType();
            newBuilderForType.mergeFrom(buildPartial());
            return newBuilderForType;
        }

        public BuilderType mergeFrom(MessageType messagetype) {
            copyOnWrite();
            mergeFromInstance(this.instance, messagetype);
            return this;
        }

        public BuilderType mergeFrom(byte[] bArr, int i, int i2, C4987l lVar) throws InvalidProtocolBufferException {
            copyOnWrite();
            try {
                dy4.m43731a().mo42090e(this.instance).mo37187j(this.instance, bArr, i, i + i2, new C4958d.C4960b(lVar));
                return this;
            } catch (InvalidProtocolBufferException e) {
                throw e;
            } catch (IndexOutOfBoundsException unused) {
                throw InvalidProtocolBufferException.truncatedMessage();
            } catch (IOException e2) {
                throw new RuntimeException("Reading from byte array should not throw IOException.", e2);
            }
        }

        public BuilderType mergeFrom(byte[] bArr, int i, int i2) throws InvalidProtocolBufferException {
            return mergeFrom(bArr, i, i2, C4987l.m39771b());
        }

        public BuilderType mergeFrom(C4969g gVar, C4987l lVar) throws IOException {
            copyOnWrite();
            try {
                dy4.m43731a().mo42090e(this.instance).mo37185i(this.instance, C4977h.m39542Q(gVar), lVar);
                return this;
            } catch (RuntimeException e) {
                if (e.getCause() instanceof IOException) {
                    throw ((IOException) e.getCause());
                }
                throw e;
            }
        }
    }

    /* renamed from: com.google.protobuf.GeneratedMessageLite$b */
    public static class C4931b<T extends GeneratedMessageLite<T, ?>> extends C4953b<T> {

        /* renamed from: b */
        public final T f25554b;

        public C4931b(T t) {
            this.f25554b = t;
        }

        /* renamed from: l */
        public T mo36911c(C4969g gVar, C4987l lVar) throws InvalidProtocolBufferException {
            return GeneratedMessageLite.parsePartialFrom(this.f25554b, gVar, lVar);
        }

        /* renamed from: m */
        public T mo36912k(byte[] bArr, int i, int i2, C4987l lVar) throws InvalidProtocolBufferException {
            return GeneratedMessageLite.parsePartialFrom(this.f25554b, bArr, i, i2, lVar);
        }
    }

    /* renamed from: com.google.protobuf.GeneratedMessageLite$c */
    public static abstract class C4932c<MessageType extends C4932c<MessageType, BuilderType>, BuilderType> extends GeneratedMessageLite<MessageType, BuilderType> implements qu3 {

        /* renamed from: a */
        public C5005p<C4933d> f25555a = C5005p.m39870h();

        /* renamed from: a */
        public C5005p<C4933d> mo36915a() {
            if (this.f25555a.mo37478o()) {
                this.f25555a = this.f25555a.clone();
            }
            return this.f25555a;
        }

        public /* bridge */ /* synthetic */ C4956c0 getDefaultInstanceForType() {
            return GeneratedMessageLite.super.getDefaultInstanceForType();
        }

        public /* bridge */ /* synthetic */ C4956c0.C4957a newBuilderForType() {
            return GeneratedMessageLite.super.newBuilderForType();
        }

        public /* bridge */ /* synthetic */ C4956c0.C4957a toBuilder() {
            return GeneratedMessageLite.super.toBuilder();
        }
    }

    /* renamed from: com.google.protobuf.GeneratedMessageLite$d */
    public static final class C4933d implements C5005p.C5007b<C4933d> {

        /* renamed from: a */
        public final C5011t.C5015d<?> f25556a;

        /* renamed from: d */
        public final int f25557d;

        /* renamed from: e */
        public final WireFormat.FieldType f25558e;

        /* renamed from: g */
        public final boolean f25559g;

        /* renamed from: k */
        public final boolean f25560k;

        public C4933d(C5011t.C5015d<?> dVar, int i, WireFormat.FieldType fieldType, boolean z, boolean z2) {
            this.f25556a = dVar;
            this.f25557d = i;
            this.f25558e = fieldType;
            this.f25559g = z;
            this.f25560k = z2;
        }

        /* renamed from: Q */
        public C4956c0.C4957a mo36916Q(C4956c0.C4957a aVar, C4956c0 c0Var) {
            return ((C4930a) aVar).mergeFrom((GeneratedMessageLite) c0Var);
        }

        /* renamed from: a */
        public int compareTo(C4933d dVar) {
            return this.f25557d - dVar.f25557d;
        }

        /* renamed from: d */
        public C5011t.C5015d<?> mo36919d() {
            return this.f25556a;
        }

        public int getNumber() {
            return this.f25557d;
        }

        public boolean isPacked() {
            return this.f25560k;
        }

        /* renamed from: j */
        public boolean mo36922j() {
            return this.f25559g;
        }

        /* renamed from: k */
        public WireFormat.FieldType mo36923k() {
            return this.f25558e;
        }

        /* renamed from: n */
        public WireFormat.JavaType mo36924n() {
            return this.f25558e.getJavaType();
        }
    }

    /* renamed from: com.google.protobuf.GeneratedMessageLite$e */
    public static class C4934e<ContainingType extends C4956c0, Type> extends C4985k<ContainingType, Type> {

        /* renamed from: a */
        public final ContainingType f25561a;

        /* renamed from: b */
        public final Type f25562b;

        /* renamed from: c */
        public final C4956c0 f25563c;

        /* renamed from: d */
        public final C4933d f25564d;

        public C4934e(ContainingType containingtype, Type type, C4956c0 c0Var, C4933d dVar, Class cls) {
            if (containingtype == null) {
                throw new IllegalArgumentException("Null containingTypeDefaultInstance");
            } else if (dVar.mo36923k() == WireFormat.FieldType.MESSAGE && c0Var == null) {
                throw new IllegalArgumentException("Null messageDefaultInstance");
            } else {
                this.f25561a = containingtype;
                this.f25562b = type;
                this.f25563c = c0Var;
                this.f25564d = dVar;
            }
        }

        /* renamed from: b */
        public WireFormat.FieldType mo36925b() {
            return this.f25564d.mo36923k();
        }

        /* renamed from: c */
        public C4956c0 mo36926c() {
            return this.f25563c;
        }

        /* renamed from: d */
        public int mo36927d() {
            return this.f25564d.getNumber();
        }

        /* renamed from: e */
        public boolean mo36928e() {
            return this.f25564d.f25559g;
        }
    }

    /* access modifiers changed from: private */
    public static <MessageType extends C4932c<MessageType, BuilderType>, BuilderType, T> C4934e<MessageType, T> checkIsLite(C4985k<MessageType, T> kVar) {
        if (kVar.mo37365a()) {
            return (C4934e) kVar;
        }
        throw new IllegalArgumentException("Expected a lite extension.");
    }

    private static <T extends GeneratedMessageLite<T, ?>> T checkMessageInitialized(T t) throws InvalidProtocolBufferException {
        if (t == null || t.isInitialized()) {
            return t;
        }
        throw t.newUninitializedMessageException().asInvalidProtocolBufferException().setUnfinishedMessage(t);
    }

    public static C5011t.C5012a emptyBooleanList() {
        return C4967f.m39313q();
    }

    public static C5011t.C5013b emptyDoubleList() {
        return C4983j.m39689q();
    }

    public static C5011t.C5017f emptyFloatList() {
        return C5008q.m39896q();
    }

    public static C5011t.C5018g emptyIntList() {
        return C5010s.m39913q();
    }

    public static C5011t.C5019h emptyLongList() {
        return C5031y.m39979q();
    }

    public static <E> C5011t.C5020i<E> emptyProtobufList() {
        return C4979h0.m39594k();
    }

    private final void ensureUnknownFieldsInitialized() {
        if (this.unknownFields == C5003n0.m39843c()) {
            this.unknownFields = C5003n0.m39847n();
        }
    }

    public static <T extends GeneratedMessageLite<?, ?>> T getDefaultInstance(Class<T> cls) {
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
            t = ((GeneratedMessageLite) p47.m49717l(cls)).getDefaultInstanceForType();
            if (t != null) {
                defaultInstanceMap.put(cls, t);
            } else {
                throw new IllegalStateException();
            }
        }
        return t;
    }

    static Method getMethodOrDie(Class cls, String str, Class... clsArr) {
        try {
            return cls.getMethod(str, clsArr);
        } catch (NoSuchMethodException e) {
            throw new RuntimeException("Generated message class \"" + cls.getName() + "\" missing method \"" + str + "\".", e);
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

    public static C5011t.C5018g mutableCopy(C5011t.C5018g gVar) {
        int size = gVar.size();
        return gVar.mo37216a(size == 0 ? 10 : size * 2);
    }

    public static Object newMessageInfo(C4956c0 c0Var, String str, Object[] objArr) {
        return new f75(c0Var, str, objArr);
    }

    public static <ContainingType extends C4956c0, Type> C4934e<ContainingType, Type> newRepeatedGeneratedExtension(ContainingType containingtype, C4956c0 c0Var, C5011t.C5015d<?> dVar, int i, WireFormat.FieldType fieldType, boolean z, Class cls) {
        return new C4934e(containingtype, Collections.emptyList(), c0Var, new C4933d(dVar, i, fieldType, true, z), cls);
    }

    public static <ContainingType extends C4956c0, Type> C4934e<ContainingType, Type> newSingularGeneratedExtension(ContainingType containingtype, Type type, C4956c0 c0Var, C5011t.C5015d<?> dVar, int i, WireFormat.FieldType fieldType, Class cls) {
        return new C4934e(containingtype, type, c0Var, new C4933d(dVar, i, fieldType, false, false), cls);
    }

    public static <T extends GeneratedMessageLite<T, ?>> T parseDelimitedFrom(T t, InputStream inputStream) throws InvalidProtocolBufferException {
        return checkMessageInitialized(parsePartialDelimitedFrom(t, inputStream, C4987l.m39771b()));
    }

    public static <T extends GeneratedMessageLite<T, ?>> T parseFrom(T t, ByteBuffer byteBuffer, C4987l lVar) throws InvalidProtocolBufferException {
        return checkMessageInitialized(parseFrom(t, C4969g.m39347i(byteBuffer), lVar));
    }

    private static <T extends GeneratedMessageLite<T, ?>> T parsePartialDelimitedFrom(T t, InputStream inputStream, C4987l lVar) throws InvalidProtocolBufferException {
        try {
            int read = inputStream.read();
            if (read == -1) {
                return null;
            }
            C4969g f = C4969g.m39344f(new C4949a.C4950a.C4951a(inputStream, C4969g.m39352y(read, inputStream)));
            T parsePartialFrom = parsePartialFrom(t, f, lVar);
            try {
                f.mo37246a(0);
                return parsePartialFrom;
            } catch (InvalidProtocolBufferException e) {
                throw e.setUnfinishedMessage(parsePartialFrom);
            }
        } catch (InvalidProtocolBufferException e2) {
            e = e2;
            if (e.getThrownFromInputStream()) {
                e = new InvalidProtocolBufferException((IOException) e);
            }
            throw e;
        } catch (IOException e3) {
            throw new InvalidProtocolBufferException(e3);
        }
    }

    public static <T extends GeneratedMessageLite<T, ?>> T parsePartialFrom(T t, C4969g gVar, C4987l lVar) throws InvalidProtocolBufferException {
        T t2 = (GeneratedMessageLite) t.dynamicMethod(MethodToInvoke.NEW_MUTABLE_INSTANCE);
        try {
            C4984j0 e = dy4.m43731a().mo42090e(t2);
            e.mo37185i(t2, C4977h.m39542Q(gVar), lVar);
            e.mo37177e(t2);
            return t2;
        } catch (InvalidProtocolBufferException e2) {
            e = e2;
            if (e.getThrownFromInputStream()) {
                e = new InvalidProtocolBufferException((IOException) e);
            }
            throw e.setUnfinishedMessage(t2);
        } catch (UninitializedMessageException e3) {
            throw e3.asInvalidProtocolBufferException().setUnfinishedMessage(t2);
        } catch (IOException e4) {
            if (e4.getCause() instanceof InvalidProtocolBufferException) {
                throw ((InvalidProtocolBufferException) e4.getCause());
            }
            throw new InvalidProtocolBufferException(e4).setUnfinishedMessage(t2);
        } catch (RuntimeException e5) {
            if (e5.getCause() instanceof InvalidProtocolBufferException) {
                throw ((InvalidProtocolBufferException) e5.getCause());
            }
            throw e5;
        }
    }

    public static <T extends GeneratedMessageLite<?, ?>> void registerDefaultInstance(Class<T> cls, T t) {
        defaultInstanceMap.put(cls, t);
    }

    /* access modifiers changed from: package-private */
    public Object buildMessageInfo() throws Exception {
        return dynamicMethod(MethodToInvoke.BUILD_MESSAGE_INFO);
    }

    public final <MessageType extends GeneratedMessageLite<MessageType, BuilderType>, BuilderType extends C4930a<MessageType, BuilderType>> BuilderType createBuilder() {
        return (C4930a) dynamicMethod(MethodToInvoke.NEW_BUILDER);
    }

    public Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj) {
        return dynamicMethod(methodToInvoke, obj, (Object) null);
    }

    public abstract Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2);

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return dy4.m43731a().mo42090e(this).mo37175d(this, (GeneratedMessageLite) obj);
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public int getMemoizedSerializedSize() {
        return this.memoizedSerializedSize;
    }

    public final im4<MessageType> getParserForType() {
        return (im4) dynamicMethod(MethodToInvoke.GET_PARSER);
    }

    public int getSerializedSize() {
        if (this.memoizedSerializedSize == -1) {
            this.memoizedSerializedSize = dy4.m43731a().mo42090e(this).mo37181g(this);
        }
        return this.memoizedSerializedSize;
    }

    public int hashCode() {
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        int c = dy4.m43731a().mo42090e(this).mo37173c(this);
        this.memoizedHashCode = c;
        return c;
    }

    public final boolean isInitialized() {
        return isInitialized(this, true);
    }

    public void makeImmutable() {
        dy4.m43731a().mo42090e(this).mo37177e(this);
    }

    public void mergeLengthDelimitedField(int i, ByteString byteString) {
        ensureUnknownFieldsInitialized();
        this.unknownFields.mo37461k(i, byteString);
    }

    public final void mergeUnknownFields(C5003n0 n0Var) {
        this.unknownFields = C5003n0.m39846m(this.unknownFields, n0Var);
    }

    public void mergeVarintField(int i, int i2) {
        ensureUnknownFieldsInitialized();
        this.unknownFields.mo37462l(i, i2);
    }

    public boolean parseUnknownField(int i, C4969g gVar) throws IOException {
        if (WireFormat.m39051b(i) == 4) {
            return false;
        }
        ensureUnknownFieldsInitialized();
        return this.unknownFields.mo37459i(i, gVar);
    }

    /* access modifiers changed from: package-private */
    public void setMemoizedSerializedSize(int i) {
        this.memoizedSerializedSize = i;
    }

    public String toString() {
        return C4961d0.m39169e(this, super.toString());
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        dy4.m43731a().mo42090e(this).mo37183h(this, C4980i.m39599P(codedOutputStream));
    }

    public static final <T extends GeneratedMessageLite<T, ?>> boolean isInitialized(T t, boolean z) {
        byte byteValue = ((Byte) t.dynamicMethod(MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        boolean f = dy4.m43731a().mo42090e(t).mo37179f(t);
        if (z) {
            t.dynamicMethod(MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED, f ? t : null);
        }
        return f;
    }

    public final <MessageType extends GeneratedMessageLite<MessageType, BuilderType>, BuilderType extends C4930a<MessageType, BuilderType>> BuilderType createBuilder(MessageType messagetype) {
        return createBuilder().mergeFrom(messagetype);
    }

    public Object dynamicMethod(MethodToInvoke methodToInvoke) {
        return dynamicMethod(methodToInvoke, (Object) null, (Object) null);
    }

    public final MessageType getDefaultInstanceForType() {
        return (GeneratedMessageLite) dynamicMethod(MethodToInvoke.GET_DEFAULT_INSTANCE);
    }

    public final BuilderType newBuilderForType() {
        return (C4930a) dynamicMethod(MethodToInvoke.NEW_BUILDER);
    }

    public final BuilderType toBuilder() {
        BuilderType buildertype = (C4930a) dynamicMethod(MethodToInvoke.NEW_BUILDER);
        buildertype.mergeFrom(this);
        return buildertype;
    }

    public static C5011t.C5019h mutableCopy(C5011t.C5019h hVar) {
        int size = hVar.size();
        return hVar.mo37216a(size == 0 ? 10 : size * 2);
    }

    public static <T extends GeneratedMessageLite<T, ?>> T parseFrom(T t, ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return parseFrom(t, byteBuffer, C4987l.m39771b());
    }

    public static <T extends GeneratedMessageLite<T, ?>> T parseDelimitedFrom(T t, InputStream inputStream, C4987l lVar) throws InvalidProtocolBufferException {
        return checkMessageInitialized(parsePartialDelimitedFrom(t, inputStream, lVar));
    }

    public static <T extends GeneratedMessageLite<T, ?>> T parseFrom(T t, ByteString byteString) throws InvalidProtocolBufferException {
        return checkMessageInitialized(parseFrom(t, byteString, C4987l.m39771b()));
    }

    public static C5011t.C5017f mutableCopy(C5011t.C5017f fVar) {
        int size = fVar.size();
        return fVar.mo37216a(size == 0 ? 10 : size * 2);
    }

    public static <T extends GeneratedMessageLite<T, ?>> T parseFrom(T t, ByteString byteString, C4987l lVar) throws InvalidProtocolBufferException {
        return checkMessageInitialized(parsePartialFrom(t, byteString, lVar));
    }

    public static C5011t.C5013b mutableCopy(C5011t.C5013b bVar) {
        int size = bVar.size();
        return bVar.mo37216a(size == 0 ? 10 : size * 2);
    }

    public static <T extends GeneratedMessageLite<T, ?>> T parseFrom(T t, byte[] bArr) throws InvalidProtocolBufferException {
        return checkMessageInitialized(parsePartialFrom(t, bArr, 0, bArr.length, C4987l.m39771b()));
    }

    public static C5011t.C5012a mutableCopy(C5011t.C5012a aVar) {
        int size = aVar.size();
        return aVar.mo37216a(size == 0 ? 10 : size * 2);
    }

    public static <T extends GeneratedMessageLite<T, ?>> T parseFrom(T t, byte[] bArr, C4987l lVar) throws InvalidProtocolBufferException {
        return checkMessageInitialized(parsePartialFrom(t, bArr, 0, bArr.length, lVar));
    }

    public static <E> C5011t.C5020i<E> mutableCopy(C5011t.C5020i<E> iVar) {
        int size = iVar.size();
        return iVar.mo37216a(size == 0 ? 10 : size * 2);
    }

    public static <T extends GeneratedMessageLite<T, ?>> T parseFrom(T t, InputStream inputStream) throws InvalidProtocolBufferException {
        return checkMessageInitialized(parsePartialFrom(t, C4969g.m39344f(inputStream), C4987l.m39771b()));
    }

    /* access modifiers changed from: private */
    public static <T extends GeneratedMessageLite<T, ?>> T parsePartialFrom(T t, byte[] bArr, int i, int i2, C4987l lVar) throws InvalidProtocolBufferException {
        T t2 = (GeneratedMessageLite) t.dynamicMethod(MethodToInvoke.NEW_MUTABLE_INSTANCE);
        try {
            C4984j0 e = dy4.m43731a().mo42090e(t2);
            e.mo37187j(t2, bArr, i, i + i2, new C4958d.C4960b(lVar));
            e.mo37177e(t2);
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
        } catch (UninitializedMessageException e3) {
            throw e3.asInvalidProtocolBufferException().setUnfinishedMessage(t2);
        } catch (IOException e4) {
            if (e4.getCause() instanceof InvalidProtocolBufferException) {
                throw ((InvalidProtocolBufferException) e4.getCause());
            }
            throw new InvalidProtocolBufferException(e4).setUnfinishedMessage(t2);
        } catch (IndexOutOfBoundsException unused) {
            throw InvalidProtocolBufferException.truncatedMessage().setUnfinishedMessage(t2);
        }
    }

    public static <T extends GeneratedMessageLite<T, ?>> T parseFrom(T t, InputStream inputStream, C4987l lVar) throws InvalidProtocolBufferException {
        return checkMessageInitialized(parsePartialFrom(t, C4969g.m39344f(inputStream), lVar));
    }

    public static <T extends GeneratedMessageLite<T, ?>> T parseFrom(T t, C4969g gVar) throws InvalidProtocolBufferException {
        return parseFrom(t, gVar, C4987l.m39771b());
    }

    public static <T extends GeneratedMessageLite<T, ?>> T parseFrom(T t, C4969g gVar, C4987l lVar) throws InvalidProtocolBufferException {
        return checkMessageInitialized(parsePartialFrom(t, gVar, lVar));
    }

    public static <T extends GeneratedMessageLite<T, ?>> T parsePartialFrom(T t, C4969g gVar) throws InvalidProtocolBufferException {
        return parsePartialFrom(t, gVar, C4987l.m39771b());
    }

    private static <T extends GeneratedMessageLite<T, ?>> T parsePartialFrom(T t, ByteString byteString, C4987l lVar) throws InvalidProtocolBufferException {
        C4969g newCodedInput = byteString.newCodedInput();
        T parsePartialFrom = parsePartialFrom(t, newCodedInput, lVar);
        try {
            newCodedInput.mo37246a(0);
            return parsePartialFrom;
        } catch (InvalidProtocolBufferException e) {
            throw e.setUnfinishedMessage(parsePartialFrom);
        }
    }
}
