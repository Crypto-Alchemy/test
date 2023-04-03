package kotlin.reflect.jvm.internal.impl.metadata;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.protobuf.C7610a;
import kotlin.reflect.jvm.internal.impl.protobuf.C7613b;
import kotlin.reflect.jvm.internal.impl.protobuf.C7614c;
import kotlin.reflect.jvm.internal.impl.protobuf.C7616d;
import kotlin.reflect.jvm.internal.impl.protobuf.C7621f;
import kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import p000.c70;

public final class ProtoBuf$TypeParameter extends GeneratedMessageLite.ExtendableMessage<ProtoBuf$TypeParameter> {
    public static jm4<ProtoBuf$TypeParameter> PARSER = new C7572a();

    /* renamed from: a */
    public static final ProtoBuf$TypeParameter f39824a;
    /* access modifiers changed from: private */
    public int bitField0_;
    /* access modifiers changed from: private */
    public int id_;
    private byte memoizedIsInitialized;
    private int memoizedSerializedSize;
    /* access modifiers changed from: private */
    public int name_;
    /* access modifiers changed from: private */
    public boolean reified_;
    /* access modifiers changed from: private */
    public final c70 unknownFields;
    private int upperBoundIdMemoizedSerializedSize;
    /* access modifiers changed from: private */
    public List<Integer> upperBoundId_;
    /* access modifiers changed from: private */
    public List<ProtoBuf$Type> upperBound_;
    /* access modifiers changed from: private */
    public Variance variance_;

    public enum Variance implements C7621f.C7622a {
        IN(0, 0),
        OUT(1, 1),
        INV(2, 2);
        

        /* renamed from: a */
        public static C7621f.C7623b<Variance> f39826a;
        private final int value;

        /* renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeParameter$Variance$a */
        public static class C7571a implements C7621f.C7623b<Variance> {
            /* renamed from: a */
            public Variance findValueByNumber(int i) {
                return Variance.valueOf(i);
            }
        }

        /* access modifiers changed from: public */
        static {
            f39826a = new C7571a();
        }

        /* access modifiers changed from: public */
        Variance(int i, int i2) {
            this.value = i2;
        }

        public final int getNumber() {
            return this.value;
        }

        public static Variance valueOf(int i) {
            if (i == 0) {
                return IN;
            }
            if (i == 1) {
                return OUT;
            }
            if (i != 2) {
                return null;
            }
            return INV;
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeParameter$a */
    public static class C7572a extends C7613b<ProtoBuf$TypeParameter> {
        /* renamed from: m */
        public ProtoBuf$TypeParameter mo52753c(C7614c cVar, C7616d dVar) throws InvalidProtocolBufferException {
            return new ProtoBuf$TypeParameter(cVar, dVar);
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeParameter$b */
    public static final class C7573b extends GeneratedMessageLite.C7602c<ProtoBuf$TypeParameter, C7573b> {

        /* renamed from: A */
        public List<Integer> f39828A = Collections.emptyList();

        /* renamed from: g */
        public int f39829g;

        /* renamed from: k */
        public int f39830k;

        /* renamed from: r */
        public int f39831r;

        /* renamed from: s */
        public boolean f39832s;

        /* renamed from: x */
        public Variance f39833x = Variance.INV;

        /* renamed from: y */
        public List<ProtoBuf$Type> f39834y = Collections.emptyList();

        public C7573b() {
            mo54423x();
        }

        /* renamed from: u */
        public static C7573b m61647u() {
            return new C7573b();
        }

        /* renamed from: B */
        public C7573b mo54414B(int i) {
            this.f39829g |= 1;
            this.f39830k = i;
            return this;
        }

        /* renamed from: C */
        public C7573b mo54415C(int i) {
            this.f39829g |= 2;
            this.f39831r = i;
            return this;
        }

        /* renamed from: D */
        public C7573b mo54416D(boolean z) {
            this.f39829g |= 4;
            this.f39832s = z;
            return this;
        }

        /* renamed from: E */
        public C7573b mo54417E(Variance variance) {
            variance.getClass();
            this.f39829g |= 8;
            this.f39833x = variance;
            return this;
        }

        /* renamed from: p */
        public ProtoBuf$TypeParameter build() {
            ProtoBuf$TypeParameter r = mo54419r();
            if (r.isInitialized()) {
                return r;
            }
            throw C7610a.C7611a.m61947b(r);
        }

        /* renamed from: r */
        public ProtoBuf$TypeParameter mo54419r() {
            ProtoBuf$TypeParameter protoBuf$TypeParameter = new ProtoBuf$TypeParameter((GeneratedMessageLite.C7602c) this);
            int i = this.f39829g;
            int i2 = 1;
            if ((i & 1) != 1) {
                i2 = 0;
            }
            int unused = protoBuf$TypeParameter.id_ = this.f39830k;
            if ((i & 2) == 2) {
                i2 |= 2;
            }
            int unused2 = protoBuf$TypeParameter.name_ = this.f39831r;
            if ((i & 4) == 4) {
                i2 |= 4;
            }
            boolean unused3 = protoBuf$TypeParameter.reified_ = this.f39832s;
            if ((i & 8) == 8) {
                i2 |= 8;
            }
            Variance unused4 = protoBuf$TypeParameter.variance_ = this.f39833x;
            if ((this.f39829g & 16) == 16) {
                this.f39834y = Collections.unmodifiableList(this.f39834y);
                this.f39829g &= -17;
            }
            List unused5 = protoBuf$TypeParameter.upperBound_ = this.f39834y;
            if ((this.f39829g & 32) == 32) {
                this.f39828A = Collections.unmodifiableList(this.f39828A);
                this.f39829g &= -33;
            }
            List unused6 = protoBuf$TypeParameter.upperBoundId_ = this.f39828A;
            int unused7 = protoBuf$TypeParameter.bitField0_ = i2;
            return protoBuf$TypeParameter;
        }

        /* renamed from: t */
        public C7573b mo53895d() {
            return m61647u().mo53896g(mo54419r());
        }

        /* renamed from: v */
        public final void mo54421v() {
            if ((this.f39829g & 32) != 32) {
                this.f39828A = new ArrayList(this.f39828A);
                this.f39829g |= 32;
            }
        }

        /* renamed from: w */
        public final void mo54422w() {
            if ((this.f39829g & 16) != 16) {
                this.f39834y = new ArrayList(this.f39834y);
                this.f39829g |= 16;
            }
        }

        /* renamed from: x */
        public final void mo54423x() {
        }

        /* renamed from: y */
        public C7573b mo53896g(ProtoBuf$TypeParameter protoBuf$TypeParameter) {
            if (protoBuf$TypeParameter == ProtoBuf$TypeParameter.getDefaultInstance()) {
                return this;
            }
            if (protoBuf$TypeParameter.hasId()) {
                mo54414B(protoBuf$TypeParameter.getId());
            }
            if (protoBuf$TypeParameter.hasName()) {
                mo54415C(protoBuf$TypeParameter.getName());
            }
            if (protoBuf$TypeParameter.hasReified()) {
                mo54416D(protoBuf$TypeParameter.getReified());
            }
            if (protoBuf$TypeParameter.hasVariance()) {
                mo54417E(protoBuf$TypeParameter.getVariance());
            }
            if (!protoBuf$TypeParameter.upperBound_.isEmpty()) {
                if (this.f39834y.isEmpty()) {
                    this.f39834y = protoBuf$TypeParameter.upperBound_;
                    this.f39829g &= -17;
                } else {
                    mo54422w();
                    this.f39834y.addAll(protoBuf$TypeParameter.upperBound_);
                }
            }
            if (!protoBuf$TypeParameter.upperBoundId_.isEmpty()) {
                if (this.f39828A.isEmpty()) {
                    this.f39828A = protoBuf$TypeParameter.upperBoundId_;
                    this.f39829g &= -33;
                } else {
                    mo54421v();
                    this.f39828A.addAll(protoBuf$TypeParameter.upperBoundId_);
                }
            }
            mo54655m(protoBuf$TypeParameter);
            mo54652h(mo54651f().mo50826j(protoBuf$TypeParameter.unknownFields));
            return this;
        }

        /* renamed from: z */
        public C7573b mo53900n(C7614c cVar, C7616d dVar) throws IOException {
            ProtoBuf$TypeParameter protoBuf$TypeParameter;
            ProtoBuf$TypeParameter protoBuf$TypeParameter2 = null;
            try {
                ProtoBuf$TypeParameter c = ProtoBuf$TypeParameter.PARSER.mo52753c(cVar, dVar);
                if (c != null) {
                    mo53896g(c);
                }
                return this;
            } catch (InvalidProtocolBufferException e) {
                protoBuf$TypeParameter = (ProtoBuf$TypeParameter) e.getUnfinishedMessage();
                throw e;
            } catch (Throwable th) {
                th = th;
                protoBuf$TypeParameter2 = protoBuf$TypeParameter;
            }
            if (protoBuf$TypeParameter2 != null) {
                mo53896g(protoBuf$TypeParameter2);
            }
            throw th;
        }
    }

    static {
        ProtoBuf$TypeParameter protoBuf$TypeParameter = new ProtoBuf$TypeParameter(true);
        f39824a = protoBuf$TypeParameter;
        protoBuf$TypeParameter.mo54399c();
    }

    public static ProtoBuf$TypeParameter getDefaultInstance() {
        return f39824a;
    }

    public static C7573b newBuilder() {
        return C7573b.m61647u();
    }

    /* renamed from: c */
    public final void mo54399c() {
        this.id_ = 0;
        this.name_ = 0;
        this.reified_ = false;
        this.variance_ = Variance.INV;
        this.upperBound_ = Collections.emptyList();
        this.upperBoundId_ = Collections.emptyList();
    }

    public int getId() {
        return this.id_;
    }

    public int getName() {
        return this.name_;
    }

    public jm4<ProtoBuf$TypeParameter> getParserForType() {
        return PARSER;
    }

    public boolean getReified() {
        return this.reified_;
    }

    public int getSerializedSize() {
        int i;
        int i2 = this.memoizedSerializedSize;
        if (i2 != -1) {
            return i2;
        }
        if ((this.bitField0_ & 1) == 1) {
            i = CodedOutputStream.m61866o(1, this.id_) + 0;
        } else {
            i = 0;
        }
        if ((this.bitField0_ & 2) == 2) {
            i += CodedOutputStream.m61866o(2, this.name_);
        }
        if ((this.bitField0_ & 4) == 4) {
            i += CodedOutputStream.m61852a(3, this.reified_);
        }
        if ((this.bitField0_ & 8) == 8) {
            i += CodedOutputStream.m61859h(4, this.variance_.getNumber());
        }
        for (int i3 = 0; i3 < this.upperBound_.size(); i3++) {
            i += CodedOutputStream.m61870s(5, this.upperBound_.get(i3));
        }
        int i4 = 0;
        for (int i5 = 0; i5 < this.upperBoundId_.size(); i5++) {
            i4 += CodedOutputStream.m61867p(this.upperBoundId_.get(i5).intValue());
        }
        int i6 = i + i4;
        if (!getUpperBoundIdList().isEmpty()) {
            i6 = i6 + 1 + CodedOutputStream.m61867p(i4);
        }
        this.upperBoundIdMemoizedSerializedSize = i4;
        int extensionsSerializedSize = i6 + extensionsSerializedSize() + this.unknownFields.size();
        this.memoizedSerializedSize = extensionsSerializedSize;
        return extensionsSerializedSize;
    }

    public ProtoBuf$Type getUpperBound(int i) {
        return this.upperBound_.get(i);
    }

    public int getUpperBoundCount() {
        return this.upperBound_.size();
    }

    public List<Integer> getUpperBoundIdList() {
        return this.upperBoundId_;
    }

    public List<ProtoBuf$Type> getUpperBoundList() {
        return this.upperBound_;
    }

    public Variance getVariance() {
        return this.variance_;
    }

    public boolean hasId() {
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

    public boolean hasReified() {
        if ((this.bitField0_ & 4) == 4) {
            return true;
        }
        return false;
    }

    public boolean hasVariance() {
        if ((this.bitField0_ & 8) == 8) {
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
        if (!hasId()) {
            this.memoizedIsInitialized = 0;
            return false;
        } else if (!hasName()) {
            this.memoizedIsInitialized = 0;
            return false;
        } else {
            for (int i = 0; i < getUpperBoundCount(); i++) {
                if (!getUpperBound(i).isInitialized()) {
                    this.memoizedIsInitialized = 0;
                    return false;
                }
            }
            if (!extensionsAreInitialized()) {
                this.memoizedIsInitialized = 0;
                return false;
            }
            this.memoizedIsInitialized = 1;
            return true;
        }
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        getSerializedSize();
        GeneratedMessageLite.ExtendableMessage<MessageType>.C6784a newExtensionWriter = newExtensionWriter();
        if ((this.bitField0_ & 1) == 1) {
            codedOutputStream.mo54614a0(1, this.id_);
        }
        if ((this.bitField0_ & 2) == 2) {
            codedOutputStream.mo54614a0(2, this.name_);
        }
        if ((this.bitField0_ & 4) == 4) {
            codedOutputStream.mo54599L(3, this.reified_);
        }
        if ((this.bitField0_ & 8) == 8) {
            codedOutputStream.mo54606S(4, this.variance_.getNumber());
        }
        for (int i = 0; i < this.upperBound_.size(); i++) {
            codedOutputStream.mo54617d0(5, this.upperBound_.get(i));
        }
        if (getUpperBoundIdList().size() > 0) {
            codedOutputStream.mo54628o0(50);
            codedOutputStream.mo54628o0(this.upperBoundIdMemoizedSerializedSize);
        }
        for (int i2 = 0; i2 < this.upperBoundId_.size(); i2++) {
            codedOutputStream.mo54615b0(this.upperBoundId_.get(i2).intValue());
        }
        newExtensionWriter.mo54650a(1000, codedOutputStream);
        codedOutputStream.mo54622i0(this.unknownFields);
    }

    public static C7573b newBuilder(ProtoBuf$TypeParameter protoBuf$TypeParameter) {
        return newBuilder().mo53896g(protoBuf$TypeParameter);
    }

    public ProtoBuf$TypeParameter getDefaultInstanceForType() {
        return f39824a;
    }

    public C7573b newBuilderForType() {
        return newBuilder();
    }

    public C7573b toBuilder() {
        return newBuilder(this);
    }

    public ProtoBuf$TypeParameter(GeneratedMessageLite.C7602c<ProtoBuf$TypeParameter, ?> cVar) {
        super(cVar);
        this.upperBoundIdMemoizedSerializedSize = -1;
        this.memoizedIsInitialized = -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = cVar.mo54651f();
    }

    public ProtoBuf$TypeParameter(boolean z) {
        this.upperBoundIdMemoizedSerializedSize = -1;
        this.memoizedIsInitialized = -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = c70.f37074a;
    }

    public ProtoBuf$TypeParameter(C7614c cVar, C7616d dVar) throws InvalidProtocolBufferException {
        this.upperBoundIdMemoizedSerializedSize = -1;
        this.memoizedIsInitialized = -1;
        this.memoizedSerializedSize = -1;
        mo54399c();
        c70.C6928b D = c70.m56312D();
        CodedOutputStream J = CodedOutputStream.m61851J(D, 1);
        boolean z = false;
        boolean z2 = false;
        while (!z) {
            try {
                int K = cVar.mo54700K();
                if (K != 0) {
                    if (K == 8) {
                        this.bitField0_ |= 1;
                        this.id_ = cVar.mo54724s();
                    } else if (K == 16) {
                        this.bitField0_ |= 2;
                        this.name_ = cVar.mo54724s();
                    } else if (K == 24) {
                        this.bitField0_ |= 4;
                        this.reified_ = cVar.mo54716k();
                    } else if (K == 32) {
                        int n = cVar.mo54719n();
                        Variance valueOf = Variance.valueOf(n);
                        if (valueOf == null) {
                            J.mo54628o0(K);
                            J.mo54628o0(n);
                        } else {
                            this.bitField0_ |= 8;
                            this.variance_ = valueOf;
                        }
                    } else if (K == 42) {
                        if (!(z2 & true)) {
                            this.upperBound_ = new ArrayList();
                            z2 |= true;
                        }
                        this.upperBound_.add(cVar.mo54726u(ProtoBuf$Type.PARSER, dVar));
                    } else if (K == 48) {
                        if (!(z2 & true)) {
                            this.upperBoundId_ = new ArrayList();
                            z2 |= true;
                        }
                        this.upperBoundId_.add(Integer.valueOf(cVar.mo54724s()));
                    } else if (K == 50) {
                        int j = cVar.mo54715j(cVar.mo54691A());
                        if (!(z2 & true) && cVar.mo54712e() > 0) {
                            this.upperBoundId_ = new ArrayList();
                            z2 |= true;
                        }
                        while (cVar.mo54712e() > 0) {
                            this.upperBoundId_.add(Integer.valueOf(cVar.mo54724s()));
                        }
                        cVar.mo54714i(j);
                    } else if (!parseUnknownField(cVar, J, dVar, K)) {
                    }
                }
                z = true;
            } catch (InvalidProtocolBufferException e) {
                throw e.setUnfinishedMessage(this);
            } catch (IOException e2) {
                throw new InvalidProtocolBufferException(e2.getMessage()).setUnfinishedMessage(this);
            } catch (Throwable th) {
                if (z2 & true) {
                    this.upperBound_ = Collections.unmodifiableList(this.upperBound_);
                }
                if (z2 & true) {
                    this.upperBoundId_ = Collections.unmodifiableList(this.upperBoundId_);
                }
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
        if (z2 & true) {
            this.upperBound_ = Collections.unmodifiableList(this.upperBound_);
        }
        if (z2 & true) {
            this.upperBoundId_ = Collections.unmodifiableList(this.upperBoundId_);
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
