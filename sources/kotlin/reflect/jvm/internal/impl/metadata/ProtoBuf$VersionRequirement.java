package kotlin.reflect.jvm.internal.impl.metadata;

import java.io.IOException;
import kotlin.reflect.jvm.internal.impl.protobuf.C7610a;
import kotlin.reflect.jvm.internal.impl.protobuf.C7613b;
import kotlin.reflect.jvm.internal.impl.protobuf.C7614c;
import kotlin.reflect.jvm.internal.impl.protobuf.C7616d;
import kotlin.reflect.jvm.internal.impl.protobuf.C7621f;
import kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import p000.c70;

public final class ProtoBuf$VersionRequirement extends GeneratedMessageLite implements ru3 {
    public static jm4<ProtoBuf$VersionRequirement> PARSER = new C7580a();

    /* renamed from: a */
    public static final ProtoBuf$VersionRequirement f39847a;
    /* access modifiers changed from: private */
    public int bitField0_;
    /* access modifiers changed from: private */
    public int errorCode_;
    /* access modifiers changed from: private */
    public Level level_;
    private byte memoizedIsInitialized;
    private int memoizedSerializedSize;
    /* access modifiers changed from: private */
    public int message_;
    /* access modifiers changed from: private */
    public final c70 unknownFields;
    /* access modifiers changed from: private */
    public int versionFull_;
    /* access modifiers changed from: private */
    public VersionKind versionKind_;
    /* access modifiers changed from: private */
    public int version_;

    public enum Level implements C7621f.C7622a {
        WARNING(0, 0),
        ERROR(1, 1),
        HIDDEN(2, 2);
        

        /* renamed from: a */
        public static C7621f.C7623b<Level> f39848a;
        private final int value;

        /* renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$VersionRequirement$Level$a */
        public static class C7578a implements C7621f.C7623b<Level> {
            /* renamed from: a */
            public Level findValueByNumber(int i) {
                return Level.valueOf(i);
            }
        }

        /* access modifiers changed from: public */
        static {
            f39848a = new C7578a();
        }

        /* access modifiers changed from: public */
        Level(int i, int i2) {
            this.value = i2;
        }

        public final int getNumber() {
            return this.value;
        }

        public static Level valueOf(int i) {
            if (i == 0) {
                return WARNING;
            }
            if (i == 1) {
                return ERROR;
            }
            if (i != 2) {
                return null;
            }
            return HIDDEN;
        }
    }

    public enum VersionKind implements C7621f.C7622a {
        LANGUAGE_VERSION(0, 0),
        COMPILER_VERSION(1, 1),
        API_VERSION(2, 2);
        

        /* renamed from: a */
        public static C7621f.C7623b<VersionKind> f39850a;
        private final int value;

        /* renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$VersionRequirement$VersionKind$a */
        public static class C7579a implements C7621f.C7623b<VersionKind> {
            /* renamed from: a */
            public VersionKind findValueByNumber(int i) {
                return VersionKind.valueOf(i);
            }
        }

        /* access modifiers changed from: public */
        static {
            f39850a = new C7579a();
        }

        /* access modifiers changed from: public */
        VersionKind(int i, int i2) {
            this.value = i2;
        }

        public final int getNumber() {
            return this.value;
        }

        public static VersionKind valueOf(int i) {
            if (i == 0) {
                return LANGUAGE_VERSION;
            }
            if (i == 1) {
                return COMPILER_VERSION;
            }
            if (i != 2) {
                return null;
            }
            return API_VERSION;
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$VersionRequirement$a */
    public static class C7580a extends C7613b<ProtoBuf$VersionRequirement> {
        /* renamed from: m */
        public ProtoBuf$VersionRequirement mo52753c(C7614c cVar, C7616d dVar) throws InvalidProtocolBufferException {
            return new ProtoBuf$VersionRequirement(cVar, dVar);
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$VersionRequirement$b */
    public static final class C7581b extends GeneratedMessageLite.C7601b<ProtoBuf$VersionRequirement, C7581b> implements ru3 {

        /* renamed from: d */
        public int f39852d;

        /* renamed from: e */
        public int f39853e;

        /* renamed from: g */
        public int f39854g;

        /* renamed from: k */
        public Level f39855k = Level.ERROR;

        /* renamed from: r */
        public int f39856r;

        /* renamed from: s */
        public int f39857s;

        /* renamed from: x */
        public VersionKind f39858x = VersionKind.LANGUAGE_VERSION;

        public C7581b() {
            mo54486p();
        }

        /* renamed from: o */
        public static C7581b m61708o() {
            return new C7581b();
        }

        /* renamed from: j */
        public ProtoBuf$VersionRequirement build() {
            ProtoBuf$VersionRequirement l = mo54484l();
            if (l.isInitialized()) {
                return l;
            }
            throw C7610a.C7611a.m61947b(l);
        }

        /* renamed from: l */
        public ProtoBuf$VersionRequirement mo54484l() {
            ProtoBuf$VersionRequirement protoBuf$VersionRequirement = new ProtoBuf$VersionRequirement((GeneratedMessageLite.C7601b) this);
            int i = this.f39852d;
            int i2 = 1;
            if ((i & 1) != 1) {
                i2 = 0;
            }
            int unused = protoBuf$VersionRequirement.version_ = this.f39853e;
            if ((i & 2) == 2) {
                i2 |= 2;
            }
            int unused2 = protoBuf$VersionRequirement.versionFull_ = this.f39854g;
            if ((i & 4) == 4) {
                i2 |= 4;
            }
            Level unused3 = protoBuf$VersionRequirement.level_ = this.f39855k;
            if ((i & 8) == 8) {
                i2 |= 8;
            }
            int unused4 = protoBuf$VersionRequirement.errorCode_ = this.f39856r;
            if ((i & 16) == 16) {
                i2 |= 16;
            }
            int unused5 = protoBuf$VersionRequirement.message_ = this.f39857s;
            if ((i & 32) == 32) {
                i2 |= 32;
            }
            VersionKind unused6 = protoBuf$VersionRequirement.versionKind_ = this.f39858x;
            int unused7 = protoBuf$VersionRequirement.bitField0_ = i2;
            return protoBuf$VersionRequirement;
        }

        /* renamed from: m */
        public C7581b mo53895d() {
            return m61708o().mo53896g(mo54484l());
        }

        /* renamed from: p */
        public final void mo54486p() {
        }

        /* renamed from: r */
        public C7581b mo53896g(ProtoBuf$VersionRequirement protoBuf$VersionRequirement) {
            if (protoBuf$VersionRequirement == ProtoBuf$VersionRequirement.getDefaultInstance()) {
                return this;
            }
            if (protoBuf$VersionRequirement.hasVersion()) {
                mo54492x(protoBuf$VersionRequirement.getVersion());
            }
            if (protoBuf$VersionRequirement.hasVersionFull()) {
                mo54493y(protoBuf$VersionRequirement.getVersionFull());
            }
            if (protoBuf$VersionRequirement.hasLevel()) {
                mo54490v(protoBuf$VersionRequirement.getLevel());
            }
            if (protoBuf$VersionRequirement.hasErrorCode()) {
                mo54489u(protoBuf$VersionRequirement.getErrorCode());
            }
            if (protoBuf$VersionRequirement.hasMessage()) {
                mo54491w(protoBuf$VersionRequirement.getMessage());
            }
            if (protoBuf$VersionRequirement.hasVersionKind()) {
                mo54494z(protoBuf$VersionRequirement.getVersionKind());
            }
            mo54652h(mo54651f().mo50826j(protoBuf$VersionRequirement.unknownFields));
            return this;
        }

        /* renamed from: t */
        public C7581b mo53900n(C7614c cVar, C7616d dVar) throws IOException {
            ProtoBuf$VersionRequirement protoBuf$VersionRequirement;
            ProtoBuf$VersionRequirement protoBuf$VersionRequirement2 = null;
            try {
                ProtoBuf$VersionRequirement c = ProtoBuf$VersionRequirement.PARSER.mo52753c(cVar, dVar);
                if (c != null) {
                    mo53896g(c);
                }
                return this;
            } catch (InvalidProtocolBufferException e) {
                protoBuf$VersionRequirement = (ProtoBuf$VersionRequirement) e.getUnfinishedMessage();
                throw e;
            } catch (Throwable th) {
                th = th;
                protoBuf$VersionRequirement2 = protoBuf$VersionRequirement;
            }
            if (protoBuf$VersionRequirement2 != null) {
                mo53896g(protoBuf$VersionRequirement2);
            }
            throw th;
        }

        /* renamed from: u */
        public C7581b mo54489u(int i) {
            this.f39852d |= 8;
            this.f39856r = i;
            return this;
        }

        /* renamed from: v */
        public C7581b mo54490v(Level level) {
            level.getClass();
            this.f39852d |= 4;
            this.f39855k = level;
            return this;
        }

        /* renamed from: w */
        public C7581b mo54491w(int i) {
            this.f39852d |= 16;
            this.f39857s = i;
            return this;
        }

        /* renamed from: x */
        public C7581b mo54492x(int i) {
            this.f39852d |= 1;
            this.f39853e = i;
            return this;
        }

        /* renamed from: y */
        public C7581b mo54493y(int i) {
            this.f39852d |= 2;
            this.f39854g = i;
            return this;
        }

        /* renamed from: z */
        public C7581b mo54494z(VersionKind versionKind) {
            versionKind.getClass();
            this.f39852d |= 32;
            this.f39858x = versionKind;
            return this;
        }
    }

    static {
        ProtoBuf$VersionRequirement protoBuf$VersionRequirement = new ProtoBuf$VersionRequirement(true);
        f39847a = protoBuf$VersionRequirement;
        protoBuf$VersionRequirement.mo54467b();
    }

    public static ProtoBuf$VersionRequirement getDefaultInstance() {
        return f39847a;
    }

    public static C7581b newBuilder() {
        return C7581b.m61708o();
    }

    /* renamed from: b */
    public final void mo54467b() {
        this.version_ = 0;
        this.versionFull_ = 0;
        this.level_ = Level.ERROR;
        this.errorCode_ = 0;
        this.message_ = 0;
        this.versionKind_ = VersionKind.LANGUAGE_VERSION;
    }

    public int getErrorCode() {
        return this.errorCode_;
    }

    public Level getLevel() {
        return this.level_;
    }

    public int getMessage() {
        return this.message_;
    }

    public jm4<ProtoBuf$VersionRequirement> getParserForType() {
        return PARSER;
    }

    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        if ((this.bitField0_ & 1) == 1) {
            i2 = 0 + CodedOutputStream.m61866o(1, this.version_);
        }
        if ((this.bitField0_ & 2) == 2) {
            i2 += CodedOutputStream.m61866o(2, this.versionFull_);
        }
        if ((this.bitField0_ & 4) == 4) {
            i2 += CodedOutputStream.m61859h(3, this.level_.getNumber());
        }
        if ((this.bitField0_ & 8) == 8) {
            i2 += CodedOutputStream.m61866o(4, this.errorCode_);
        }
        if ((this.bitField0_ & 16) == 16) {
            i2 += CodedOutputStream.m61866o(5, this.message_);
        }
        if ((this.bitField0_ & 32) == 32) {
            i2 += CodedOutputStream.m61859h(6, this.versionKind_.getNumber());
        }
        int size = i2 + this.unknownFields.size();
        this.memoizedSerializedSize = size;
        return size;
    }

    public int getVersion() {
        return this.version_;
    }

    public int getVersionFull() {
        return this.versionFull_;
    }

    public VersionKind getVersionKind() {
        return this.versionKind_;
    }

    public boolean hasErrorCode() {
        if ((this.bitField0_ & 8) == 8) {
            return true;
        }
        return false;
    }

    public boolean hasLevel() {
        if ((this.bitField0_ & 4) == 4) {
            return true;
        }
        return false;
    }

    public boolean hasMessage() {
        if ((this.bitField0_ & 16) == 16) {
            return true;
        }
        return false;
    }

    public boolean hasVersion() {
        if ((this.bitField0_ & 1) == 1) {
            return true;
        }
        return false;
    }

    public boolean hasVersionFull() {
        if ((this.bitField0_ & 2) == 2) {
            return true;
        }
        return false;
    }

    public boolean hasVersionKind() {
        if ((this.bitField0_ & 32) == 32) {
            return true;
        }
        return false;
    }

    public final boolean isInitialized() {
        byte b = this.memoizedIsInitialized;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        this.memoizedIsInitialized = 1;
        return true;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        getSerializedSize();
        if ((this.bitField0_ & 1) == 1) {
            codedOutputStream.mo54614a0(1, this.version_);
        }
        if ((this.bitField0_ & 2) == 2) {
            codedOutputStream.mo54614a0(2, this.versionFull_);
        }
        if ((this.bitField0_ & 4) == 4) {
            codedOutputStream.mo54606S(3, this.level_.getNumber());
        }
        if ((this.bitField0_ & 8) == 8) {
            codedOutputStream.mo54614a0(4, this.errorCode_);
        }
        if ((this.bitField0_ & 16) == 16) {
            codedOutputStream.mo54614a0(5, this.message_);
        }
        if ((this.bitField0_ & 32) == 32) {
            codedOutputStream.mo54606S(6, this.versionKind_.getNumber());
        }
        codedOutputStream.mo54622i0(this.unknownFields);
    }

    public static C7581b newBuilder(ProtoBuf$VersionRequirement protoBuf$VersionRequirement) {
        return newBuilder().mo53896g(protoBuf$VersionRequirement);
    }

    public ProtoBuf$VersionRequirement getDefaultInstanceForType() {
        return f39847a;
    }

    public C7581b newBuilderForType() {
        return newBuilder();
    }

    public C7581b toBuilder() {
        return newBuilder(this);
    }

    public ProtoBuf$VersionRequirement(GeneratedMessageLite.C7601b bVar) {
        super(bVar);
        this.memoizedIsInitialized = -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = bVar.mo54651f();
    }

    public ProtoBuf$VersionRequirement(boolean z) {
        this.memoizedIsInitialized = -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = c70.f37074a;
    }

    public ProtoBuf$VersionRequirement(C7614c cVar, C7616d dVar) throws InvalidProtocolBufferException {
        this.memoizedIsInitialized = -1;
        this.memoizedSerializedSize = -1;
        mo54467b();
        c70.C6928b D = c70.m56312D();
        CodedOutputStream J = CodedOutputStream.m61851J(D, 1);
        boolean z = false;
        while (!z) {
            try {
                int K = cVar.mo54700K();
                if (K != 0) {
                    if (K == 8) {
                        this.bitField0_ |= 1;
                        this.version_ = cVar.mo54724s();
                    } else if (K == 16) {
                        this.bitField0_ |= 2;
                        this.versionFull_ = cVar.mo54724s();
                    } else if (K == 24) {
                        int n = cVar.mo54719n();
                        Level valueOf = Level.valueOf(n);
                        if (valueOf == null) {
                            J.mo54628o0(K);
                            J.mo54628o0(n);
                        } else {
                            this.bitField0_ |= 4;
                            this.level_ = valueOf;
                        }
                    } else if (K == 32) {
                        this.bitField0_ |= 8;
                        this.errorCode_ = cVar.mo54724s();
                    } else if (K == 40) {
                        this.bitField0_ |= 16;
                        this.message_ = cVar.mo54724s();
                    } else if (K == 48) {
                        int n2 = cVar.mo54719n();
                        VersionKind valueOf2 = VersionKind.valueOf(n2);
                        if (valueOf2 == null) {
                            J.mo54628o0(K);
                            J.mo54628o0(n2);
                        } else {
                            this.bitField0_ |= 32;
                            this.versionKind_ = valueOf2;
                        }
                    } else if (!parseUnknownField(cVar, J, dVar, K)) {
                    }
                }
                z = true;
            } catch (InvalidProtocolBufferException e) {
                throw e.setUnfinishedMessage(this);
            } catch (IOException e2) {
                throw new InvalidProtocolBufferException(e2.getMessage()).setUnfinishedMessage(this);
            } catch (Throwable th) {
                try {
                    J.mo54597I();
                } catch (IOException unused) {
                } catch (Throwable th2) {
                    this.unknownFields = D.mo50838d();
                    throw th2;
                }
                this.unknownFields = D.mo50838d();
                makeExtensionsImmutable();
                throw th;
            }
        }
        try {
            J.mo54597I();
        } catch (IOException unused2) {
        } catch (Throwable th3) {
            this.unknownFields = D.mo50838d();
            throw th3;
        }
        this.unknownFields = D.mo50838d();
        makeExtensionsImmutable();
    }
}
