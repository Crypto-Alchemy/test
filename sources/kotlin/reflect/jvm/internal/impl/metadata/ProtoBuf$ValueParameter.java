package kotlin.reflect.jvm.internal.impl.metadata;

import com.google.mlkit.common.MlKitException;
import java.io.IOException;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type;
import kotlin.reflect.jvm.internal.impl.protobuf.C7610a;
import kotlin.reflect.jvm.internal.impl.protobuf.C7613b;
import kotlin.reflect.jvm.internal.impl.protobuf.C7614c;
import kotlin.reflect.jvm.internal.impl.protobuf.C7616d;
import kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import p000.c70;

public final class ProtoBuf$ValueParameter extends GeneratedMessageLite.ExtendableMessage<ProtoBuf$ValueParameter> {
    public static jm4<ProtoBuf$ValueParameter> PARSER = new C7576a();

    /* renamed from: a */
    public static final ProtoBuf$ValueParameter f39839a;
    /* access modifiers changed from: private */
    public int bitField0_;
    /* access modifiers changed from: private */
    public int flags_;
    private byte memoizedIsInitialized;
    private int memoizedSerializedSize;
    /* access modifiers changed from: private */
    public int name_;
    /* access modifiers changed from: private */
    public int typeId_;
    /* access modifiers changed from: private */
    public ProtoBuf$Type type_;
    /* access modifiers changed from: private */
    public final c70 unknownFields;
    /* access modifiers changed from: private */
    public int varargElementTypeId_;
    /* access modifiers changed from: private */
    public ProtoBuf$Type varargElementType_;

    /* renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$ValueParameter$a */
    public static class C7576a extends C7613b<ProtoBuf$ValueParameter> {
        /* renamed from: m */
        public ProtoBuf$ValueParameter mo52753c(C7614c cVar, C7616d dVar) throws InvalidProtocolBufferException {
            return new ProtoBuf$ValueParameter(cVar, dVar);
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$ValueParameter$b */
    public static final class C7577b extends GeneratedMessageLite.C7602c<ProtoBuf$ValueParameter, C7577b> {

        /* renamed from: A */
        public int f39840A;

        /* renamed from: g */
        public int f39841g;

        /* renamed from: k */
        public int f39842k;

        /* renamed from: r */
        public int f39843r;

        /* renamed from: s */
        public ProtoBuf$Type f39844s = ProtoBuf$Type.getDefaultInstance();

        /* renamed from: x */
        public int f39845x;

        /* renamed from: y */
        public ProtoBuf$Type f39846y = ProtoBuf$Type.getDefaultInstance();

        public C7577b() {
            mo54462v();
        }

        /* renamed from: u */
        public static C7577b m61685u() {
            return new C7577b();
        }

        /* renamed from: B */
        public C7577b mo54455B(int i) {
            this.f39841g |= 1;
            this.f39842k = i;
            return this;
        }

        /* renamed from: C */
        public C7577b mo54456C(int i) {
            this.f39841g |= 2;
            this.f39843r = i;
            return this;
        }

        /* renamed from: D */
        public C7577b mo54457D(int i) {
            this.f39841g |= 8;
            this.f39845x = i;
            return this;
        }

        /* renamed from: E */
        public C7577b mo54458E(int i) {
            this.f39841g |= 32;
            this.f39840A = i;
            return this;
        }

        /* renamed from: p */
        public ProtoBuf$ValueParameter build() {
            ProtoBuf$ValueParameter r = mo54460r();
            if (r.isInitialized()) {
                return r;
            }
            throw C7610a.C7611a.m61947b(r);
        }

        /* renamed from: r */
        public ProtoBuf$ValueParameter mo54460r() {
            ProtoBuf$ValueParameter protoBuf$ValueParameter = new ProtoBuf$ValueParameter((GeneratedMessageLite.C7602c) this);
            int i = this.f39841g;
            int i2 = 1;
            if ((i & 1) != 1) {
                i2 = 0;
            }
            int unused = protoBuf$ValueParameter.flags_ = this.f39842k;
            if ((i & 2) == 2) {
                i2 |= 2;
            }
            int unused2 = protoBuf$ValueParameter.name_ = this.f39843r;
            if ((i & 4) == 4) {
                i2 |= 4;
            }
            ProtoBuf$Type unused3 = protoBuf$ValueParameter.type_ = this.f39844s;
            if ((i & 8) == 8) {
                i2 |= 8;
            }
            int unused4 = protoBuf$ValueParameter.typeId_ = this.f39845x;
            if ((i & 16) == 16) {
                i2 |= 16;
            }
            ProtoBuf$Type unused5 = protoBuf$ValueParameter.varargElementType_ = this.f39846y;
            if ((i & 32) == 32) {
                i2 |= 32;
            }
            int unused6 = protoBuf$ValueParameter.varargElementTypeId_ = this.f39840A;
            int unused7 = protoBuf$ValueParameter.bitField0_ = i2;
            return protoBuf$ValueParameter;
        }

        /* renamed from: t */
        public C7577b mo53895d() {
            return m61685u().mo53896g(mo54460r());
        }

        /* renamed from: v */
        public final void mo54462v() {
        }

        /* renamed from: w */
        public C7577b mo53896g(ProtoBuf$ValueParameter protoBuf$ValueParameter) {
            if (protoBuf$ValueParameter == ProtoBuf$ValueParameter.getDefaultInstance()) {
                return this;
            }
            if (protoBuf$ValueParameter.hasFlags()) {
                mo54455B(protoBuf$ValueParameter.getFlags());
            }
            if (protoBuf$ValueParameter.hasName()) {
                mo54456C(protoBuf$ValueParameter.getName());
            }
            if (protoBuf$ValueParameter.hasType()) {
                mo54465y(protoBuf$ValueParameter.getType());
            }
            if (protoBuf$ValueParameter.hasTypeId()) {
                mo54457D(protoBuf$ValueParameter.getTypeId());
            }
            if (protoBuf$ValueParameter.hasVarargElementType()) {
                mo54466z(protoBuf$ValueParameter.getVarargElementType());
            }
            if (protoBuf$ValueParameter.hasVarargElementTypeId()) {
                mo54458E(protoBuf$ValueParameter.getVarargElementTypeId());
            }
            mo54655m(protoBuf$ValueParameter);
            mo54652h(mo54651f().mo50826j(protoBuf$ValueParameter.unknownFields));
            return this;
        }

        /* renamed from: x */
        public C7577b mo53900n(C7614c cVar, C7616d dVar) throws IOException {
            ProtoBuf$ValueParameter protoBuf$ValueParameter;
            ProtoBuf$ValueParameter protoBuf$ValueParameter2 = null;
            try {
                ProtoBuf$ValueParameter c = ProtoBuf$ValueParameter.PARSER.mo52753c(cVar, dVar);
                if (c != null) {
                    mo53896g(c);
                }
                return this;
            } catch (InvalidProtocolBufferException e) {
                protoBuf$ValueParameter = (ProtoBuf$ValueParameter) e.getUnfinishedMessage();
                throw e;
            } catch (Throwable th) {
                th = th;
                protoBuf$ValueParameter2 = protoBuf$ValueParameter;
            }
            if (protoBuf$ValueParameter2 != null) {
                mo53896g(protoBuf$ValueParameter2);
            }
            throw th;
        }

        /* renamed from: y */
        public C7577b mo54465y(ProtoBuf$Type protoBuf$Type) {
            if ((this.f39841g & 4) != 4 || this.f39844s == ProtoBuf$Type.getDefaultInstance()) {
                this.f39844s = protoBuf$Type;
            } else {
                this.f39844s = ProtoBuf$Type.newBuilder(this.f39844s).mo53896g(protoBuf$Type).mo54356r();
            }
            this.f39841g |= 4;
            return this;
        }

        /* renamed from: z */
        public C7577b mo54466z(ProtoBuf$Type protoBuf$Type) {
            if ((this.f39841g & 16) != 16 || this.f39846y == ProtoBuf$Type.getDefaultInstance()) {
                this.f39846y = protoBuf$Type;
            } else {
                this.f39846y = ProtoBuf$Type.newBuilder(this.f39846y).mo53896g(protoBuf$Type).mo54356r();
            }
            this.f39841g |= 16;
            return this;
        }
    }

    static {
        ProtoBuf$ValueParameter protoBuf$ValueParameter = new ProtoBuf$ValueParameter(true);
        f39839a = protoBuf$ValueParameter;
        protoBuf$ValueParameter.mo54441c();
    }

    public static ProtoBuf$ValueParameter getDefaultInstance() {
        return f39839a;
    }

    public static C7577b newBuilder() {
        return C7577b.m61685u();
    }

    /* renamed from: c */
    public final void mo54441c() {
        this.flags_ = 0;
        this.name_ = 0;
        this.type_ = ProtoBuf$Type.getDefaultInstance();
        this.typeId_ = 0;
        this.varargElementType_ = ProtoBuf$Type.getDefaultInstance();
        this.varargElementTypeId_ = 0;
    }

    public int getFlags() {
        return this.flags_;
    }

    public int getName() {
        return this.name_;
    }

    public jm4<ProtoBuf$ValueParameter> getParserForType() {
        return PARSER;
    }

    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        if ((this.bitField0_ & 1) == 1) {
            i2 = 0 + CodedOutputStream.m61866o(1, this.flags_);
        }
        if ((this.bitField0_ & 2) == 2) {
            i2 += CodedOutputStream.m61866o(2, this.name_);
        }
        if ((this.bitField0_ & 4) == 4) {
            i2 += CodedOutputStream.m61870s(3, this.type_);
        }
        if ((this.bitField0_ & 16) == 16) {
            i2 += CodedOutputStream.m61870s(4, this.varargElementType_);
        }
        if ((this.bitField0_ & 8) == 8) {
            i2 += CodedOutputStream.m61866o(5, this.typeId_);
        }
        if ((this.bitField0_ & 32) == 32) {
            i2 += CodedOutputStream.m61866o(6, this.varargElementTypeId_);
        }
        int extensionsSerializedSize = i2 + extensionsSerializedSize() + this.unknownFields.size();
        this.memoizedSerializedSize = extensionsSerializedSize;
        return extensionsSerializedSize;
    }

    public ProtoBuf$Type getType() {
        return this.type_;
    }

    public int getTypeId() {
        return this.typeId_;
    }

    public ProtoBuf$Type getVarargElementType() {
        return this.varargElementType_;
    }

    public int getVarargElementTypeId() {
        return this.varargElementTypeId_;
    }

    public boolean hasFlags() {
        if ((this.bitField0_ & 1) == 1) {
            return true;
        }
        return false;
    }

    public boolean hasName() {
        if ((this.bitField0_ & 2) == 2) {
            return true;
        }
        return false;
    }

    public boolean hasType() {
        if ((this.bitField0_ & 4) == 4) {
            return true;
        }
        return false;
    }

    public boolean hasTypeId() {
        if ((this.bitField0_ & 8) == 8) {
            return true;
        }
        return false;
    }

    public boolean hasVarargElementType() {
        if ((this.bitField0_ & 16) == 16) {
            return true;
        }
        return false;
    }

    public boolean hasVarargElementTypeId() {
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
        if (!hasName()) {
            this.memoizedIsInitialized = 0;
            return false;
        } else if (hasType() && !getType().isInitialized()) {
            this.memoizedIsInitialized = 0;
            return false;
        } else if (hasVarargElementType() && !getVarargElementType().isInitialized()) {
            this.memoizedIsInitialized = 0;
            return false;
        } else if (!extensionsAreInitialized()) {
            this.memoizedIsInitialized = 0;
            return false;
        } else {
            this.memoizedIsInitialized = 1;
            return true;
        }
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        getSerializedSize();
        GeneratedMessageLite.ExtendableMessage<MessageType>.C6784a newExtensionWriter = newExtensionWriter();
        if ((this.bitField0_ & 1) == 1) {
            codedOutputStream.mo54614a0(1, this.flags_);
        }
        if ((this.bitField0_ & 2) == 2) {
            codedOutputStream.mo54614a0(2, this.name_);
        }
        if ((this.bitField0_ & 4) == 4) {
            codedOutputStream.mo54617d0(3, this.type_);
        }
        if ((this.bitField0_ & 16) == 16) {
            codedOutputStream.mo54617d0(4, this.varargElementType_);
        }
        if ((this.bitField0_ & 8) == 8) {
            codedOutputStream.mo54614a0(5, this.typeId_);
        }
        if ((this.bitField0_ & 32) == 32) {
            codedOutputStream.mo54614a0(6, this.varargElementTypeId_);
        }
        newExtensionWriter.mo54650a(MlKitException.CODE_SCANNER_UNAVAILABLE, codedOutputStream);
        codedOutputStream.mo54622i0(this.unknownFields);
    }

    public static C7577b newBuilder(ProtoBuf$ValueParameter protoBuf$ValueParameter) {
        return newBuilder().mo53896g(protoBuf$ValueParameter);
    }

    public ProtoBuf$ValueParameter getDefaultInstanceForType() {
        return f39839a;
    }

    public C7577b newBuilderForType() {
        return newBuilder();
    }

    public C7577b toBuilder() {
        return newBuilder(this);
    }

    public ProtoBuf$ValueParameter(GeneratedMessageLite.C7602c<ProtoBuf$ValueParameter, ?> cVar) {
        super(cVar);
        this.memoizedIsInitialized = -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = cVar.mo54651f();
    }

    public ProtoBuf$ValueParameter(boolean z) {
        this.memoizedIsInitialized = -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = c70.f37074a;
    }

    public ProtoBuf$ValueParameter(C7614c cVar, C7616d dVar) throws InvalidProtocolBufferException {
        this.memoizedIsInitialized = -1;
        this.memoizedSerializedSize = -1;
        mo54441c();
        c70.C6928b D = c70.m56312D();
        CodedOutputStream J = CodedOutputStream.m61851J(D, 1);
        boolean z = false;
        while (!z) {
            try {
                int K = cVar.mo54700K();
                if (K != 0) {
                    if (K == 8) {
                        this.bitField0_ |= 1;
                        this.flags_ = cVar.mo54724s();
                    } else if (K != 16) {
                        ProtoBuf$Type.C7568b bVar = null;
                        if (K == 26) {
                            bVar = (this.bitField0_ & 4) == 4 ? this.type_.toBuilder() : bVar;
                            ProtoBuf$Type protoBuf$Type = (ProtoBuf$Type) cVar.mo54726u(ProtoBuf$Type.PARSER, dVar);
                            this.type_ = protoBuf$Type;
                            if (bVar != null) {
                                bVar.mo53896g(protoBuf$Type);
                                this.type_ = bVar.mo54356r();
                            }
                            this.bitField0_ |= 4;
                        } else if (K == 34) {
                            bVar = (this.bitField0_ & 16) == 16 ? this.varargElementType_.toBuilder() : bVar;
                            ProtoBuf$Type protoBuf$Type2 = (ProtoBuf$Type) cVar.mo54726u(ProtoBuf$Type.PARSER, dVar);
                            this.varargElementType_ = protoBuf$Type2;
                            if (bVar != null) {
                                bVar.mo53896g(protoBuf$Type2);
                                this.varargElementType_ = bVar.mo54356r();
                            }
                            this.bitField0_ |= 16;
                        } else if (K == 40) {
                            this.bitField0_ |= 8;
                            this.typeId_ = cVar.mo54724s();
                        } else if (K == 48) {
                            this.bitField0_ |= 32;
                            this.varargElementTypeId_ = cVar.mo54724s();
                        } else if (!parseUnknownField(cVar, J, dVar, K)) {
                        }
                    } else {
                        this.bitField0_ |= 2;
                        this.name_ = cVar.mo54724s();
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
