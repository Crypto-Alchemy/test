package kotlin.reflect.jvm.internal.impl.metadata;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type;
import kotlin.reflect.jvm.internal.impl.protobuf.C7610a;
import kotlin.reflect.jvm.internal.impl.protobuf.C7613b;
import kotlin.reflect.jvm.internal.impl.protobuf.C7614c;
import kotlin.reflect.jvm.internal.impl.protobuf.C7616d;
import kotlin.reflect.jvm.internal.impl.protobuf.C7621f;
import kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import p000.c70;

public final class ProtoBuf$Expression extends GeneratedMessageLite implements ru3 {
    public static jm4<ProtoBuf$Expression> PARSER = new C7545a();

    /* renamed from: a */
    public static final ProtoBuf$Expression f39716a;
    /* access modifiers changed from: private */
    public List<ProtoBuf$Expression> andArgument_;
    /* access modifiers changed from: private */
    public int bitField0_;
    /* access modifiers changed from: private */
    public ConstantValue constantValue_;
    /* access modifiers changed from: private */
    public int flags_;
    /* access modifiers changed from: private */
    public int isInstanceTypeId_;
    /* access modifiers changed from: private */
    public ProtoBuf$Type isInstanceType_;
    private byte memoizedIsInitialized;
    private int memoizedSerializedSize;
    /* access modifiers changed from: private */
    public List<ProtoBuf$Expression> orArgument_;
    /* access modifiers changed from: private */
    public final c70 unknownFields;
    /* access modifiers changed from: private */
    public int valueParameterReference_;

    public enum ConstantValue implements C7621f.C7622a {
        TRUE(0, 0),
        FALSE(1, 1),
        NULL(2, 2);
        

        /* renamed from: a */
        public static C7621f.C7623b<ConstantValue> f39717a;
        private final int value;

        /* renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Expression$ConstantValue$a */
        public static class C7544a implements C7621f.C7623b<ConstantValue> {
            /* renamed from: a */
            public ConstantValue findValueByNumber(int i) {
                return ConstantValue.valueOf(i);
            }
        }

        /* access modifiers changed from: public */
        static {
            f39717a = new C7544a();
        }

        /* access modifiers changed from: public */
        ConstantValue(int i, int i2) {
            this.value = i2;
        }

        public final int getNumber() {
            return this.value;
        }

        public static ConstantValue valueOf(int i) {
            if (i == 0) {
                return TRUE;
            }
            if (i == 1) {
                return FALSE;
            }
            if (i != 2) {
                return null;
            }
            return NULL;
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Expression$a */
    public static class C7545a extends C7613b<ProtoBuf$Expression> {
        /* renamed from: m */
        public ProtoBuf$Expression mo52753c(C7614c cVar, C7616d dVar) throws InvalidProtocolBufferException {
            return new ProtoBuf$Expression(cVar, dVar);
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Expression$b */
    public static final class C7546b extends GeneratedMessageLite.C7601b<ProtoBuf$Expression, C7546b> implements ru3 {

        /* renamed from: d */
        public int f39719d;

        /* renamed from: e */
        public int f39720e;

        /* renamed from: g */
        public int f39721g;

        /* renamed from: k */
        public ConstantValue f39722k = ConstantValue.TRUE;

        /* renamed from: r */
        public ProtoBuf$Type f39723r = ProtoBuf$Type.getDefaultInstance();

        /* renamed from: s */
        public int f39724s;

        /* renamed from: x */
        public List<ProtoBuf$Expression> f39725x = Collections.emptyList();

        /* renamed from: y */
        public List<ProtoBuf$Expression> f39726y = Collections.emptyList();

        public C7546b() {
            mo54097t();
        }

        /* renamed from: o */
        public static C7546b m61402o() {
            return new C7546b();
        }

        /* renamed from: B */
        public C7546b mo54091B(int i) {
            this.f39719d |= 2;
            this.f39721g = i;
            return this;
        }

        /* renamed from: j */
        public ProtoBuf$Expression build() {
            ProtoBuf$Expression l = mo54093l();
            if (l.isInitialized()) {
                return l;
            }
            throw C7610a.C7611a.m61947b(l);
        }

        /* renamed from: l */
        public ProtoBuf$Expression mo54093l() {
            ProtoBuf$Expression protoBuf$Expression = new ProtoBuf$Expression((GeneratedMessageLite.C7601b) this);
            int i = this.f39719d;
            int i2 = 1;
            if ((i & 1) != 1) {
                i2 = 0;
            }
            int unused = protoBuf$Expression.flags_ = this.f39720e;
            if ((i & 2) == 2) {
                i2 |= 2;
            }
            int unused2 = protoBuf$Expression.valueParameterReference_ = this.f39721g;
            if ((i & 4) == 4) {
                i2 |= 4;
            }
            ConstantValue unused3 = protoBuf$Expression.constantValue_ = this.f39722k;
            if ((i & 8) == 8) {
                i2 |= 8;
            }
            ProtoBuf$Type unused4 = protoBuf$Expression.isInstanceType_ = this.f39723r;
            if ((i & 16) == 16) {
                i2 |= 16;
            }
            int unused5 = protoBuf$Expression.isInstanceTypeId_ = this.f39724s;
            if ((this.f39719d & 32) == 32) {
                this.f39725x = Collections.unmodifiableList(this.f39725x);
                this.f39719d &= -33;
            }
            List unused6 = protoBuf$Expression.andArgument_ = this.f39725x;
            if ((this.f39719d & 64) == 64) {
                this.f39726y = Collections.unmodifiableList(this.f39726y);
                this.f39719d &= -65;
            }
            List unused7 = protoBuf$Expression.orArgument_ = this.f39726y;
            int unused8 = protoBuf$Expression.bitField0_ = i2;
            return protoBuf$Expression;
        }

        /* renamed from: m */
        public C7546b mo53895d() {
            return m61402o().mo53896g(mo54093l());
        }

        /* renamed from: p */
        public final void mo54095p() {
            if ((this.f39719d & 32) != 32) {
                this.f39725x = new ArrayList(this.f39725x);
                this.f39719d |= 32;
            }
        }

        /* renamed from: r */
        public final void mo54096r() {
            if ((this.f39719d & 64) != 64) {
                this.f39726y = new ArrayList(this.f39726y);
                this.f39719d |= 64;
            }
        }

        /* renamed from: t */
        public final void mo54097t() {
        }

        /* renamed from: u */
        public C7546b mo53896g(ProtoBuf$Expression protoBuf$Expression) {
            if (protoBuf$Expression == ProtoBuf$Expression.getDefaultInstance()) {
                return this;
            }
            if (protoBuf$Expression.hasFlags()) {
                mo54102y(protoBuf$Expression.getFlags());
            }
            if (protoBuf$Expression.hasValueParameterReference()) {
                mo54091B(protoBuf$Expression.getValueParameterReference());
            }
            if (protoBuf$Expression.hasConstantValue()) {
                mo54101x(protoBuf$Expression.getConstantValue());
            }
            if (protoBuf$Expression.hasIsInstanceType()) {
                mo54100w(protoBuf$Expression.getIsInstanceType());
            }
            if (protoBuf$Expression.hasIsInstanceTypeId()) {
                mo54103z(protoBuf$Expression.getIsInstanceTypeId());
            }
            if (!protoBuf$Expression.andArgument_.isEmpty()) {
                if (this.f39725x.isEmpty()) {
                    this.f39725x = protoBuf$Expression.andArgument_;
                    this.f39719d &= -33;
                } else {
                    mo54095p();
                    this.f39725x.addAll(protoBuf$Expression.andArgument_);
                }
            }
            if (!protoBuf$Expression.orArgument_.isEmpty()) {
                if (this.f39726y.isEmpty()) {
                    this.f39726y = protoBuf$Expression.orArgument_;
                    this.f39719d &= -65;
                } else {
                    mo54096r();
                    this.f39726y.addAll(protoBuf$Expression.orArgument_);
                }
            }
            mo54652h(mo54651f().mo50826j(protoBuf$Expression.unknownFields));
            return this;
        }

        /* renamed from: v */
        public C7546b mo53900n(C7614c cVar, C7616d dVar) throws IOException {
            ProtoBuf$Expression protoBuf$Expression;
            ProtoBuf$Expression protoBuf$Expression2 = null;
            try {
                ProtoBuf$Expression c = ProtoBuf$Expression.PARSER.mo52753c(cVar, dVar);
                if (c != null) {
                    mo53896g(c);
                }
                return this;
            } catch (InvalidProtocolBufferException e) {
                protoBuf$Expression = (ProtoBuf$Expression) e.getUnfinishedMessage();
                throw e;
            } catch (Throwable th) {
                th = th;
                protoBuf$Expression2 = protoBuf$Expression;
            }
            if (protoBuf$Expression2 != null) {
                mo53896g(protoBuf$Expression2);
            }
            throw th;
        }

        /* renamed from: w */
        public C7546b mo54100w(ProtoBuf$Type protoBuf$Type) {
            if ((this.f39719d & 8) != 8 || this.f39723r == ProtoBuf$Type.getDefaultInstance()) {
                this.f39723r = protoBuf$Type;
            } else {
                this.f39723r = ProtoBuf$Type.newBuilder(this.f39723r).mo53896g(protoBuf$Type).mo54356r();
            }
            this.f39719d |= 8;
            return this;
        }

        /* renamed from: x */
        public C7546b mo54101x(ConstantValue constantValue) {
            constantValue.getClass();
            this.f39719d |= 4;
            this.f39722k = constantValue;
            return this;
        }

        /* renamed from: y */
        public C7546b mo54102y(int i) {
            this.f39719d |= 1;
            this.f39720e = i;
            return this;
        }

        /* renamed from: z */
        public C7546b mo54103z(int i) {
            this.f39719d |= 16;
            this.f39724s = i;
            return this;
        }
    }

    static {
        ProtoBuf$Expression protoBuf$Expression = new ProtoBuf$Expression(true);
        f39716a = protoBuf$Expression;
        protoBuf$Expression.mo54074b();
    }

    public static ProtoBuf$Expression getDefaultInstance() {
        return f39716a;
    }

    public static C7546b newBuilder() {
        return C7546b.m61402o();
    }

    /* renamed from: b */
    public final void mo54074b() {
        this.flags_ = 0;
        this.valueParameterReference_ = 0;
        this.constantValue_ = ConstantValue.TRUE;
        this.isInstanceType_ = ProtoBuf$Type.getDefaultInstance();
        this.isInstanceTypeId_ = 0;
        this.andArgument_ = Collections.emptyList();
        this.orArgument_ = Collections.emptyList();
    }

    public ProtoBuf$Expression getAndArgument(int i) {
        return this.andArgument_.get(i);
    }

    public int getAndArgumentCount() {
        return this.andArgument_.size();
    }

    public ConstantValue getConstantValue() {
        return this.constantValue_;
    }

    public int getFlags() {
        return this.flags_;
    }

    public ProtoBuf$Type getIsInstanceType() {
        return this.isInstanceType_;
    }

    public int getIsInstanceTypeId() {
        return this.isInstanceTypeId_;
    }

    public ProtoBuf$Expression getOrArgument(int i) {
        return this.orArgument_.get(i);
    }

    public int getOrArgumentCount() {
        return this.orArgument_.size();
    }

    public jm4<ProtoBuf$Expression> getParserForType() {
        return PARSER;
    }

    public int getSerializedSize() {
        int i;
        int i2 = this.memoizedSerializedSize;
        if (i2 != -1) {
            return i2;
        }
        if ((this.bitField0_ & 1) == 1) {
            i = CodedOutputStream.m61866o(1, this.flags_) + 0;
        } else {
            i = 0;
        }
        if ((this.bitField0_ & 2) == 2) {
            i += CodedOutputStream.m61866o(2, this.valueParameterReference_);
        }
        if ((this.bitField0_ & 4) == 4) {
            i += CodedOutputStream.m61859h(3, this.constantValue_.getNumber());
        }
        if ((this.bitField0_ & 8) == 8) {
            i += CodedOutputStream.m61870s(4, this.isInstanceType_);
        }
        if ((this.bitField0_ & 16) == 16) {
            i += CodedOutputStream.m61866o(5, this.isInstanceTypeId_);
        }
        for (int i3 = 0; i3 < this.andArgument_.size(); i3++) {
            i += CodedOutputStream.m61870s(6, this.andArgument_.get(i3));
        }
        for (int i4 = 0; i4 < this.orArgument_.size(); i4++) {
            i += CodedOutputStream.m61870s(7, this.orArgument_.get(i4));
        }
        int size = i + this.unknownFields.size();
        this.memoizedSerializedSize = size;
        return size;
    }

    public int getValueParameterReference() {
        return this.valueParameterReference_;
    }

    public boolean hasConstantValue() {
        if ((this.bitField0_ & 4) == 4) {
            return true;
        }
        return false;
    }

    public boolean hasFlags() {
        if ((this.bitField0_ & 1) == 1) {
            return true;
        }
        return false;
    }

    public boolean hasIsInstanceType() {
        if ((this.bitField0_ & 8) == 8) {
            return true;
        }
        return false;
    }

    public boolean hasIsInstanceTypeId() {
        if ((this.bitField0_ & 16) == 16) {
            return true;
        }
        return false;
    }

    public boolean hasValueParameterReference() {
        if ((this.bitField0_ & 2) == 2) {
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
        if (!hasIsInstanceType() || getIsInstanceType().isInitialized()) {
            for (int i = 0; i < getAndArgumentCount(); i++) {
                if (!getAndArgument(i).isInitialized()) {
                    this.memoizedIsInitialized = 0;
                    return false;
                }
            }
            for (int i2 = 0; i2 < getOrArgumentCount(); i2++) {
                if (!getOrArgument(i2).isInitialized()) {
                    this.memoizedIsInitialized = 0;
                    return false;
                }
            }
            this.memoizedIsInitialized = 1;
            return true;
        }
        this.memoizedIsInitialized = 0;
        return false;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        getSerializedSize();
        if ((this.bitField0_ & 1) == 1) {
            codedOutputStream.mo54614a0(1, this.flags_);
        }
        if ((this.bitField0_ & 2) == 2) {
            codedOutputStream.mo54614a0(2, this.valueParameterReference_);
        }
        if ((this.bitField0_ & 4) == 4) {
            codedOutputStream.mo54606S(3, this.constantValue_.getNumber());
        }
        if ((this.bitField0_ & 8) == 8) {
            codedOutputStream.mo54617d0(4, this.isInstanceType_);
        }
        if ((this.bitField0_ & 16) == 16) {
            codedOutputStream.mo54614a0(5, this.isInstanceTypeId_);
        }
        for (int i = 0; i < this.andArgument_.size(); i++) {
            codedOutputStream.mo54617d0(6, this.andArgument_.get(i));
        }
        for (int i2 = 0; i2 < this.orArgument_.size(); i2++) {
            codedOutputStream.mo54617d0(7, this.orArgument_.get(i2));
        }
        codedOutputStream.mo54622i0(this.unknownFields);
    }

    public static C7546b newBuilder(ProtoBuf$Expression protoBuf$Expression) {
        return newBuilder().mo53896g(protoBuf$Expression);
    }

    public ProtoBuf$Expression getDefaultInstanceForType() {
        return f39716a;
    }

    public C7546b newBuilderForType() {
        return newBuilder();
    }

    public C7546b toBuilder() {
        return newBuilder(this);
    }

    public ProtoBuf$Expression(GeneratedMessageLite.C7601b bVar) {
        super(bVar);
        this.memoizedIsInitialized = -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = bVar.mo54651f();
    }

    public ProtoBuf$Expression(boolean z) {
        this.memoizedIsInitialized = -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = c70.f37074a;
    }

    public ProtoBuf$Expression(C7614c cVar, C7616d dVar) throws InvalidProtocolBufferException {
        this.memoizedIsInitialized = -1;
        this.memoizedSerializedSize = -1;
        mo54074b();
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
                        this.flags_ = cVar.mo54724s();
                    } else if (K == 16) {
                        this.bitField0_ |= 2;
                        this.valueParameterReference_ = cVar.mo54724s();
                    } else if (K == 24) {
                        int n = cVar.mo54719n();
                        ConstantValue valueOf = ConstantValue.valueOf(n);
                        if (valueOf == null) {
                            J.mo54628o0(K);
                            J.mo54628o0(n);
                        } else {
                            this.bitField0_ |= 4;
                            this.constantValue_ = valueOf;
                        }
                    } else if (K == 34) {
                        ProtoBuf$Type.C7568b builder = (this.bitField0_ & 8) == 8 ? this.isInstanceType_.toBuilder() : null;
                        ProtoBuf$Type protoBuf$Type = (ProtoBuf$Type) cVar.mo54726u(ProtoBuf$Type.PARSER, dVar);
                        this.isInstanceType_ = protoBuf$Type;
                        if (builder != null) {
                            builder.mo53896g(protoBuf$Type);
                            this.isInstanceType_ = builder.mo54356r();
                        }
                        this.bitField0_ |= 8;
                    } else if (K == 40) {
                        this.bitField0_ |= 16;
                        this.isInstanceTypeId_ = cVar.mo54724s();
                    } else if (K == 50) {
                        if (!(z2 & true)) {
                            this.andArgument_ = new ArrayList();
                            z2 |= true;
                        }
                        this.andArgument_.add(cVar.mo54726u(PARSER, dVar));
                    } else if (K == 58) {
                        if (!(z2 & true)) {
                            this.orArgument_ = new ArrayList();
                            z2 |= true;
                        }
                        this.orArgument_.add(cVar.mo54726u(PARSER, dVar));
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
                    this.andArgument_ = Collections.unmodifiableList(this.andArgument_);
                }
                if (z2 & true) {
                    this.orArgument_ = Collections.unmodifiableList(this.orArgument_);
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
            this.andArgument_ = Collections.unmodifiableList(this.andArgument_);
        }
        if (z2 & true) {
            this.orArgument_ = Collections.unmodifiableList(this.orArgument_);
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
