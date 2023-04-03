package kotlin.reflect.jvm.internal.impl.metadata;

import androidx.recyclerview.widget.RecyclerView;
import com.google.mlkit.common.MlKitException;
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

public final class ProtoBuf$Type extends GeneratedMessageLite.ExtendableMessage<ProtoBuf$Type> {
    public static jm4<ProtoBuf$Type> PARSER = new C7567a();

    /* renamed from: a */
    public static final ProtoBuf$Type f39789a;
    /* access modifiers changed from: private */
    public int abbreviatedTypeId_;
    /* access modifiers changed from: private */
    public ProtoBuf$Type abbreviatedType_;
    /* access modifiers changed from: private */
    public List<Argument> argument_;
    /* access modifiers changed from: private */
    public int bitField0_;
    /* access modifiers changed from: private */
    public int className_;
    /* access modifiers changed from: private */
    public int flags_;
    /* access modifiers changed from: private */
    public int flexibleTypeCapabilitiesId_;
    /* access modifiers changed from: private */
    public int flexibleUpperBoundId_;
    /* access modifiers changed from: private */
    public ProtoBuf$Type flexibleUpperBound_;
    private byte memoizedIsInitialized;
    private int memoizedSerializedSize;
    /* access modifiers changed from: private */
    public boolean nullable_;
    /* access modifiers changed from: private */
    public int outerTypeId_;
    /* access modifiers changed from: private */
    public ProtoBuf$Type outerType_;
    /* access modifiers changed from: private */
    public int typeAliasName_;
    /* access modifiers changed from: private */
    public int typeParameterName_;
    /* access modifiers changed from: private */
    public int typeParameter_;
    /* access modifiers changed from: private */
    public final c70 unknownFields;

    public static final class Argument extends GeneratedMessageLite implements ru3 {
        public static jm4<Argument> PARSER = new C7565a();

        /* renamed from: a */
        public static final Argument f39790a;
        /* access modifiers changed from: private */
        public int bitField0_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        /* access modifiers changed from: private */
        public Projection projection_;
        /* access modifiers changed from: private */
        public int typeId_;
        /* access modifiers changed from: private */
        public ProtoBuf$Type type_;
        /* access modifiers changed from: private */
        public final c70 unknownFields;

        public enum Projection implements C7621f.C7622a {
            IN(0, 0),
            OUT(1, 1),
            INV(2, 2),
            STAR(3, 3);
            

            /* renamed from: a */
            public static C7621f.C7623b<Projection> f39792a;
            private final int value;

            /* renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type$Argument$Projection$a */
            public static class C7564a implements C7621f.C7623b<Projection> {
                /* renamed from: a */
                public Projection findValueByNumber(int i) {
                    return Projection.valueOf(i);
                }
            }

            /* access modifiers changed from: public */
            static {
                f39792a = new C7564a();
            }

            /* access modifiers changed from: public */
            Projection(int i, int i2) {
                this.value = i2;
            }

            public final int getNumber() {
                return this.value;
            }

            public static Projection valueOf(int i) {
                if (i == 0) {
                    return IN;
                }
                if (i == 1) {
                    return OUT;
                }
                if (i == 2) {
                    return INV;
                }
                if (i != 3) {
                    return null;
                }
                return STAR;
            }
        }

        /* renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type$Argument$a */
        public static class C7565a extends C7613b<Argument> {
            /* renamed from: m */
            public Argument mo52753c(C7614c cVar, C7616d dVar) throws InvalidProtocolBufferException {
                return new Argument(cVar, dVar);
            }
        }

        /* renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type$Argument$b */
        public static final class C7566b extends GeneratedMessageLite.C7601b<Argument, C7566b> implements ru3 {

            /* renamed from: d */
            public int f39794d;

            /* renamed from: e */
            public Projection f39795e = Projection.INV;

            /* renamed from: g */
            public ProtoBuf$Type f39796g = ProtoBuf$Type.getDefaultInstance();

            /* renamed from: k */
            public int f39797k;

            public C7566b() {
                mo54336p();
            }

            /* renamed from: o */
            public static C7566b m61576o() {
                return new C7566b();
            }

            /* renamed from: j */
            public Argument build() {
                Argument l = mo54334l();
                if (l.isInitialized()) {
                    return l;
                }
                throw C7610a.C7611a.m61947b(l);
            }

            /* renamed from: l */
            public Argument mo54334l() {
                Argument argument = new Argument((GeneratedMessageLite.C7601b) this);
                int i = this.f39794d;
                int i2 = 1;
                if ((i & 1) != 1) {
                    i2 = 0;
                }
                Projection unused = argument.projection_ = this.f39795e;
                if ((i & 2) == 2) {
                    i2 |= 2;
                }
                ProtoBuf$Type unused2 = argument.type_ = this.f39796g;
                if ((i & 4) == 4) {
                    i2 |= 4;
                }
                int unused3 = argument.typeId_ = this.f39797k;
                int unused4 = argument.bitField0_ = i2;
                return argument;
            }

            /* renamed from: m */
            public C7566b mo53895d() {
                return m61576o().mo53896g(mo54334l());
            }

            /* renamed from: p */
            public final void mo54336p() {
            }

            /* renamed from: r */
            public C7566b mo53896g(Argument argument) {
                if (argument == Argument.getDefaultInstance()) {
                    return this;
                }
                if (argument.hasProjection()) {
                    mo54340v(argument.getProjection());
                }
                if (argument.hasType()) {
                    mo54339u(argument.getType());
                }
                if (argument.hasTypeId()) {
                    mo54341w(argument.getTypeId());
                }
                mo54652h(mo54651f().mo50826j(argument.unknownFields));
                return this;
            }

            /* renamed from: t */
            public C7566b mo53900n(C7614c cVar, C7616d dVar) throws IOException {
                Argument argument;
                Argument argument2 = null;
                try {
                    Argument c = Argument.PARSER.mo52753c(cVar, dVar);
                    if (c != null) {
                        mo53896g(c);
                    }
                    return this;
                } catch (InvalidProtocolBufferException e) {
                    argument = (Argument) e.getUnfinishedMessage();
                    throw e;
                } catch (Throwable th) {
                    th = th;
                    argument2 = argument;
                }
                if (argument2 != null) {
                    mo53896g(argument2);
                }
                throw th;
            }

            /* renamed from: u */
            public C7566b mo54339u(ProtoBuf$Type protoBuf$Type) {
                if ((this.f39794d & 2) != 2 || this.f39796g == ProtoBuf$Type.getDefaultInstance()) {
                    this.f39796g = protoBuf$Type;
                } else {
                    this.f39796g = ProtoBuf$Type.newBuilder(this.f39796g).mo53896g(protoBuf$Type).mo54356r();
                }
                this.f39794d |= 2;
                return this;
            }

            /* renamed from: v */
            public C7566b mo54340v(Projection projection) {
                projection.getClass();
                this.f39794d |= 1;
                this.f39795e = projection;
                return this;
            }

            /* renamed from: w */
            public C7566b mo54341w(int i) {
                this.f39794d |= 4;
                this.f39797k = i;
                return this;
            }
        }

        static {
            Argument argument = new Argument(true);
            f39790a = argument;
            argument.mo54324b();
        }

        public static Argument getDefaultInstance() {
            return f39790a;
        }

        public static C7566b newBuilder() {
            return C7566b.m61576o();
        }

        /* renamed from: b */
        public final void mo54324b() {
            this.projection_ = Projection.INV;
            this.type_ = ProtoBuf$Type.getDefaultInstance();
            this.typeId_ = 0;
        }

        public jm4<Argument> getParserForType() {
            return PARSER;
        }

        public Projection getProjection() {
            return this.projection_;
        }

        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int i2 = 0;
            if ((this.bitField0_ & 1) == 1) {
                i2 = 0 + CodedOutputStream.m61859h(1, this.projection_.getNumber());
            }
            if ((this.bitField0_ & 2) == 2) {
                i2 += CodedOutputStream.m61870s(2, this.type_);
            }
            if ((this.bitField0_ & 4) == 4) {
                i2 += CodedOutputStream.m61866o(3, this.typeId_);
            }
            int size = i2 + this.unknownFields.size();
            this.memoizedSerializedSize = size;
            return size;
        }

        public ProtoBuf$Type getType() {
            return this.type_;
        }

        public int getTypeId() {
            return this.typeId_;
        }

        public boolean hasProjection() {
            if ((this.bitField0_ & 1) == 1) {
                return true;
            }
            return false;
        }

        public boolean hasType() {
            if ((this.bitField0_ & 2) == 2) {
                return true;
            }
            return false;
        }

        public boolean hasTypeId() {
            if ((this.bitField0_ & 4) == 4) {
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
            if (!hasType() || getType().isInitialized()) {
                this.memoizedIsInitialized = 1;
                return true;
            }
            this.memoizedIsInitialized = 0;
            return false;
        }

        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            getSerializedSize();
            if ((this.bitField0_ & 1) == 1) {
                codedOutputStream.mo54606S(1, this.projection_.getNumber());
            }
            if ((this.bitField0_ & 2) == 2) {
                codedOutputStream.mo54617d0(2, this.type_);
            }
            if ((this.bitField0_ & 4) == 4) {
                codedOutputStream.mo54614a0(3, this.typeId_);
            }
            codedOutputStream.mo54622i0(this.unknownFields);
        }

        public static C7566b newBuilder(Argument argument) {
            return newBuilder().mo53896g(argument);
        }

        public Argument getDefaultInstanceForType() {
            return f39790a;
        }

        public C7566b newBuilderForType() {
            return newBuilder();
        }

        public C7566b toBuilder() {
            return newBuilder(this);
        }

        public Argument(GeneratedMessageLite.C7601b bVar) {
            super(bVar);
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = bVar.mo54651f();
        }

        public Argument(boolean z) {
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = c70.f37074a;
        }

        public Argument(C7614c cVar, C7616d dVar) throws InvalidProtocolBufferException {
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            mo54324b();
            c70.C6928b D = c70.m56312D();
            CodedOutputStream J = CodedOutputStream.m61851J(D, 1);
            boolean z = false;
            while (!z) {
                try {
                    int K = cVar.mo54700K();
                    if (K != 0) {
                        if (K == 8) {
                            int n = cVar.mo54719n();
                            Projection valueOf = Projection.valueOf(n);
                            if (valueOf == null) {
                                J.mo54628o0(K);
                                J.mo54628o0(n);
                            } else {
                                this.bitField0_ |= 1;
                                this.projection_ = valueOf;
                            }
                        } else if (K == 18) {
                            C7568b builder = (this.bitField0_ & 2) == 2 ? this.type_.toBuilder() : null;
                            ProtoBuf$Type protoBuf$Type = (ProtoBuf$Type) cVar.mo54726u(ProtoBuf$Type.PARSER, dVar);
                            this.type_ = protoBuf$Type;
                            if (builder != null) {
                                builder.mo53896g(protoBuf$Type);
                                this.type_ = builder.mo54356r();
                            }
                            this.bitField0_ |= 2;
                        } else if (K == 24) {
                            this.bitField0_ |= 4;
                            this.typeId_ = cVar.mo54724s();
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

    /* renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type$a */
    public static class C7567a extends C7613b<ProtoBuf$Type> {
        /* renamed from: m */
        public ProtoBuf$Type mo52753c(C7614c cVar, C7616d dVar) throws InvalidProtocolBufferException {
            return new ProtoBuf$Type(cVar, dVar);
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type$b */
    public static final class C7568b extends GeneratedMessageLite.C7602c<ProtoBuf$Type, C7568b> {

        /* renamed from: A */
        public int f39798A;

        /* renamed from: B */
        public int f39799B;

        /* renamed from: C */
        public int f39800C;

        /* renamed from: H */
        public int f39801H;

        /* renamed from: I */
        public ProtoBuf$Type f39802I = ProtoBuf$Type.getDefaultInstance();

        /* renamed from: L */
        public int f39803L;

        /* renamed from: M */
        public ProtoBuf$Type f39804M = ProtoBuf$Type.getDefaultInstance();

        /* renamed from: P */
        public int f39805P;

        /* renamed from: Q */
        public int f39806Q;

        /* renamed from: g */
        public int f39807g;

        /* renamed from: k */
        public List<Argument> f39808k = Collections.emptyList();

        /* renamed from: r */
        public boolean f39809r;

        /* renamed from: s */
        public int f39810s;

        /* renamed from: x */
        public ProtoBuf$Type f39811x = ProtoBuf$Type.getDefaultInstance();

        /* renamed from: y */
        public int f39812y;

        public C7568b() {
            mo54359w();
        }

        /* renamed from: u */
        public static C7568b m61593u() {
            return new C7568b();
        }

        /* renamed from: B */
        public C7568b mo53900n(C7614c cVar, C7616d dVar) throws IOException {
            ProtoBuf$Type protoBuf$Type;
            ProtoBuf$Type protoBuf$Type2 = null;
            try {
                ProtoBuf$Type c = ProtoBuf$Type.PARSER.mo52753c(cVar, dVar);
                if (c != null) {
                    mo53896g(c);
                }
                return this;
            } catch (InvalidProtocolBufferException e) {
                protoBuf$Type = (ProtoBuf$Type) e.getUnfinishedMessage();
                throw e;
            } catch (Throwable th) {
                th = th;
                protoBuf$Type2 = protoBuf$Type;
            }
            if (protoBuf$Type2 != null) {
                mo53896g(protoBuf$Type2);
            }
            throw th;
        }

        /* renamed from: C */
        public C7568b mo54344C(ProtoBuf$Type protoBuf$Type) {
            if ((this.f39807g & RecyclerView.C1231a0.FLAG_ADAPTER_POSITION_UNKNOWN) != 512 || this.f39802I == ProtoBuf$Type.getDefaultInstance()) {
                this.f39802I = protoBuf$Type;
            } else {
                this.f39802I = ProtoBuf$Type.newBuilder(this.f39802I).mo53896g(protoBuf$Type).mo54356r();
            }
            this.f39807g |= RecyclerView.C1231a0.FLAG_ADAPTER_POSITION_UNKNOWN;
            return this;
        }

        /* renamed from: D */
        public C7568b mo54345D(int i) {
            this.f39807g |= 4096;
            this.f39805P = i;
            return this;
        }

        /* renamed from: E */
        public C7568b mo54346E(int i) {
            this.f39807g |= 32;
            this.f39798A = i;
            return this;
        }

        /* renamed from: F */
        public C7568b mo54347F(int i) {
            this.f39807g |= 8192;
            this.f39806Q = i;
            return this;
        }

        /* renamed from: G */
        public C7568b mo54348G(int i) {
            this.f39807g |= 4;
            this.f39810s = i;
            return this;
        }

        /* renamed from: H */
        public C7568b mo54349H(int i) {
            this.f39807g |= 16;
            this.f39812y = i;
            return this;
        }

        /* renamed from: I */
        public C7568b mo54350I(boolean z) {
            this.f39807g |= 2;
            this.f39809r = z;
            return this;
        }

        /* renamed from: J */
        public C7568b mo54351J(int i) {
            this.f39807g |= RecyclerView.C1231a0.FLAG_ADAPTER_FULLUPDATE;
            this.f39803L = i;
            return this;
        }

        /* renamed from: K */
        public C7568b mo54352K(int i) {
            this.f39807g |= 256;
            this.f39801H = i;
            return this;
        }

        /* renamed from: L */
        public C7568b mo54353L(int i) {
            this.f39807g |= 64;
            this.f39799B = i;
            return this;
        }

        /* renamed from: M */
        public C7568b mo54354M(int i) {
            this.f39807g |= 128;
            this.f39800C = i;
            return this;
        }

        /* renamed from: p */
        public ProtoBuf$Type build() {
            ProtoBuf$Type r = mo54356r();
            if (r.isInitialized()) {
                return r;
            }
            throw C7610a.C7611a.m61947b(r);
        }

        /* renamed from: r */
        public ProtoBuf$Type mo54356r() {
            ProtoBuf$Type protoBuf$Type = new ProtoBuf$Type((GeneratedMessageLite.C7602c) this);
            int i = this.f39807g;
            int i2 = 1;
            if ((i & 1) == 1) {
                this.f39808k = Collections.unmodifiableList(this.f39808k);
                this.f39807g &= -2;
            }
            List unused = protoBuf$Type.argument_ = this.f39808k;
            if ((i & 2) != 2) {
                i2 = 0;
            }
            boolean unused2 = protoBuf$Type.nullable_ = this.f39809r;
            if ((i & 4) == 4) {
                i2 |= 2;
            }
            int unused3 = protoBuf$Type.flexibleTypeCapabilitiesId_ = this.f39810s;
            if ((i & 8) == 8) {
                i2 |= 4;
            }
            ProtoBuf$Type unused4 = protoBuf$Type.flexibleUpperBound_ = this.f39811x;
            if ((i & 16) == 16) {
                i2 |= 8;
            }
            int unused5 = protoBuf$Type.flexibleUpperBoundId_ = this.f39812y;
            if ((i & 32) == 32) {
                i2 |= 16;
            }
            int unused6 = protoBuf$Type.className_ = this.f39798A;
            if ((i & 64) == 64) {
                i2 |= 32;
            }
            int unused7 = protoBuf$Type.typeParameter_ = this.f39799B;
            if ((i & 128) == 128) {
                i2 |= 64;
            }
            int unused8 = protoBuf$Type.typeParameterName_ = this.f39800C;
            if ((i & 256) == 256) {
                i2 |= 128;
            }
            int unused9 = protoBuf$Type.typeAliasName_ = this.f39801H;
            if ((i & RecyclerView.C1231a0.FLAG_ADAPTER_POSITION_UNKNOWN) == 512) {
                i2 |= 256;
            }
            ProtoBuf$Type unused10 = protoBuf$Type.outerType_ = this.f39802I;
            if ((i & RecyclerView.C1231a0.FLAG_ADAPTER_FULLUPDATE) == 1024) {
                i2 |= RecyclerView.C1231a0.FLAG_ADAPTER_POSITION_UNKNOWN;
            }
            int unused11 = protoBuf$Type.outerTypeId_ = this.f39803L;
            if ((i & 2048) == 2048) {
                i2 |= RecyclerView.C1231a0.FLAG_ADAPTER_FULLUPDATE;
            }
            ProtoBuf$Type unused12 = protoBuf$Type.abbreviatedType_ = this.f39804M;
            if ((i & 4096) == 4096) {
                i2 |= 2048;
            }
            int unused13 = protoBuf$Type.abbreviatedTypeId_ = this.f39805P;
            if ((i & 8192) == 8192) {
                i2 |= 4096;
            }
            int unused14 = protoBuf$Type.flags_ = this.f39806Q;
            int unused15 = protoBuf$Type.bitField0_ = i2;
            return protoBuf$Type;
        }

        /* renamed from: t */
        public C7568b mo53895d() {
            return m61593u().mo53896g(mo54356r());
        }

        /* renamed from: v */
        public final void mo54358v() {
            if ((this.f39807g & 1) != 1) {
                this.f39808k = new ArrayList(this.f39808k);
                this.f39807g |= 1;
            }
        }

        /* renamed from: w */
        public final void mo54359w() {
        }

        /* renamed from: x */
        public C7568b mo54360x(ProtoBuf$Type protoBuf$Type) {
            if ((this.f39807g & 2048) != 2048 || this.f39804M == ProtoBuf$Type.getDefaultInstance()) {
                this.f39804M = protoBuf$Type;
            } else {
                this.f39804M = ProtoBuf$Type.newBuilder(this.f39804M).mo53896g(protoBuf$Type).mo54356r();
            }
            this.f39807g |= 2048;
            return this;
        }

        /* renamed from: y */
        public C7568b mo54361y(ProtoBuf$Type protoBuf$Type) {
            if ((this.f39807g & 8) != 8 || this.f39811x == ProtoBuf$Type.getDefaultInstance()) {
                this.f39811x = protoBuf$Type;
            } else {
                this.f39811x = ProtoBuf$Type.newBuilder(this.f39811x).mo53896g(protoBuf$Type).mo54356r();
            }
            this.f39807g |= 8;
            return this;
        }

        /* renamed from: z */
        public C7568b mo53896g(ProtoBuf$Type protoBuf$Type) {
            if (protoBuf$Type == ProtoBuf$Type.getDefaultInstance()) {
                return this;
            }
            if (!protoBuf$Type.argument_.isEmpty()) {
                if (this.f39808k.isEmpty()) {
                    this.f39808k = protoBuf$Type.argument_;
                    this.f39807g &= -2;
                } else {
                    mo54358v();
                    this.f39808k.addAll(protoBuf$Type.argument_);
                }
            }
            if (protoBuf$Type.hasNullable()) {
                mo54350I(protoBuf$Type.getNullable());
            }
            if (protoBuf$Type.hasFlexibleTypeCapabilitiesId()) {
                mo54348G(protoBuf$Type.getFlexibleTypeCapabilitiesId());
            }
            if (protoBuf$Type.hasFlexibleUpperBound()) {
                mo54361y(protoBuf$Type.getFlexibleUpperBound());
            }
            if (protoBuf$Type.hasFlexibleUpperBoundId()) {
                mo54349H(protoBuf$Type.getFlexibleUpperBoundId());
            }
            if (protoBuf$Type.hasClassName()) {
                mo54346E(protoBuf$Type.getClassName());
            }
            if (protoBuf$Type.hasTypeParameter()) {
                mo54353L(protoBuf$Type.getTypeParameter());
            }
            if (protoBuf$Type.hasTypeParameterName()) {
                mo54354M(protoBuf$Type.getTypeParameterName());
            }
            if (protoBuf$Type.hasTypeAliasName()) {
                mo54352K(protoBuf$Type.getTypeAliasName());
            }
            if (protoBuf$Type.hasOuterType()) {
                mo54344C(protoBuf$Type.getOuterType());
            }
            if (protoBuf$Type.hasOuterTypeId()) {
                mo54351J(protoBuf$Type.getOuterTypeId());
            }
            if (protoBuf$Type.hasAbbreviatedType()) {
                mo54360x(protoBuf$Type.getAbbreviatedType());
            }
            if (protoBuf$Type.hasAbbreviatedTypeId()) {
                mo54345D(protoBuf$Type.getAbbreviatedTypeId());
            }
            if (protoBuf$Type.hasFlags()) {
                mo54347F(protoBuf$Type.getFlags());
            }
            mo54655m(protoBuf$Type);
            mo54652h(mo54651f().mo50826j(protoBuf$Type.unknownFields));
            return this;
        }
    }

    static {
        ProtoBuf$Type protoBuf$Type = new ProtoBuf$Type(true);
        f39789a = protoBuf$Type;
        protoBuf$Type.mo54294c();
    }

    public static ProtoBuf$Type getDefaultInstance() {
        return f39789a;
    }

    public static C7568b newBuilder() {
        return C7568b.m61593u();
    }

    /* renamed from: c */
    public final void mo54294c() {
        this.argument_ = Collections.emptyList();
        this.nullable_ = false;
        this.flexibleTypeCapabilitiesId_ = 0;
        this.flexibleUpperBound_ = getDefaultInstance();
        this.flexibleUpperBoundId_ = 0;
        this.className_ = 0;
        this.typeParameter_ = 0;
        this.typeParameterName_ = 0;
        this.typeAliasName_ = 0;
        this.outerType_ = getDefaultInstance();
        this.outerTypeId_ = 0;
        this.abbreviatedType_ = getDefaultInstance();
        this.abbreviatedTypeId_ = 0;
        this.flags_ = 0;
    }

    public ProtoBuf$Type getAbbreviatedType() {
        return this.abbreviatedType_;
    }

    public int getAbbreviatedTypeId() {
        return this.abbreviatedTypeId_;
    }

    public Argument getArgument(int i) {
        return this.argument_.get(i);
    }

    public int getArgumentCount() {
        return this.argument_.size();
    }

    public List<Argument> getArgumentList() {
        return this.argument_;
    }

    public int getClassName() {
        return this.className_;
    }

    public int getFlags() {
        return this.flags_;
    }

    public int getFlexibleTypeCapabilitiesId() {
        return this.flexibleTypeCapabilitiesId_;
    }

    public ProtoBuf$Type getFlexibleUpperBound() {
        return this.flexibleUpperBound_;
    }

    public int getFlexibleUpperBoundId() {
        return this.flexibleUpperBoundId_;
    }

    public boolean getNullable() {
        return this.nullable_;
    }

    public ProtoBuf$Type getOuterType() {
        return this.outerType_;
    }

    public int getOuterTypeId() {
        return this.outerTypeId_;
    }

    public jm4<ProtoBuf$Type> getParserForType() {
        return PARSER;
    }

    public int getSerializedSize() {
        int i;
        int i2 = this.memoizedSerializedSize;
        if (i2 != -1) {
            return i2;
        }
        if ((this.bitField0_ & 4096) == 4096) {
            i = CodedOutputStream.m61866o(1, this.flags_) + 0;
        } else {
            i = 0;
        }
        for (int i3 = 0; i3 < this.argument_.size(); i3++) {
            i += CodedOutputStream.m61870s(2, this.argument_.get(i3));
        }
        if ((this.bitField0_ & 1) == 1) {
            i += CodedOutputStream.m61852a(3, this.nullable_);
        }
        if ((this.bitField0_ & 2) == 2) {
            i += CodedOutputStream.m61866o(4, this.flexibleTypeCapabilitiesId_);
        }
        if ((this.bitField0_ & 4) == 4) {
            i += CodedOutputStream.m61870s(5, this.flexibleUpperBound_);
        }
        if ((this.bitField0_ & 16) == 16) {
            i += CodedOutputStream.m61866o(6, this.className_);
        }
        if ((this.bitField0_ & 32) == 32) {
            i += CodedOutputStream.m61866o(7, this.typeParameter_);
        }
        if ((this.bitField0_ & 8) == 8) {
            i += CodedOutputStream.m61866o(8, this.flexibleUpperBoundId_);
        }
        if ((this.bitField0_ & 64) == 64) {
            i += CodedOutputStream.m61866o(9, this.typeParameterName_);
        }
        if ((this.bitField0_ & 256) == 256) {
            i += CodedOutputStream.m61870s(10, this.outerType_);
        }
        if ((this.bitField0_ & RecyclerView.C1231a0.FLAG_ADAPTER_POSITION_UNKNOWN) == 512) {
            i += CodedOutputStream.m61866o(11, this.outerTypeId_);
        }
        if ((this.bitField0_ & 128) == 128) {
            i += CodedOutputStream.m61866o(12, this.typeAliasName_);
        }
        if ((this.bitField0_ & RecyclerView.C1231a0.FLAG_ADAPTER_FULLUPDATE) == 1024) {
            i += CodedOutputStream.m61870s(13, this.abbreviatedType_);
        }
        if ((this.bitField0_ & 2048) == 2048) {
            i += CodedOutputStream.m61866o(14, this.abbreviatedTypeId_);
        }
        int extensionsSerializedSize = i + extensionsSerializedSize() + this.unknownFields.size();
        this.memoizedSerializedSize = extensionsSerializedSize;
        return extensionsSerializedSize;
    }

    public int getTypeAliasName() {
        return this.typeAliasName_;
    }

    public int getTypeParameter() {
        return this.typeParameter_;
    }

    public int getTypeParameterName() {
        return this.typeParameterName_;
    }

    public boolean hasAbbreviatedType() {
        if ((this.bitField0_ & RecyclerView.C1231a0.FLAG_ADAPTER_FULLUPDATE) == 1024) {
            return true;
        }
        return false;
    }

    public boolean hasAbbreviatedTypeId() {
        if ((this.bitField0_ & 2048) == 2048) {
            return true;
        }
        return false;
    }

    public boolean hasClassName() {
        if ((this.bitField0_ & 16) == 16) {
            return true;
        }
        return false;
    }

    public boolean hasFlags() {
        if ((this.bitField0_ & 4096) == 4096) {
            return true;
        }
        return false;
    }

    public boolean hasFlexibleTypeCapabilitiesId() {
        if ((this.bitField0_ & 2) == 2) {
            return true;
        }
        return false;
    }

    public boolean hasFlexibleUpperBound() {
        if ((this.bitField0_ & 4) == 4) {
            return true;
        }
        return false;
    }

    public boolean hasFlexibleUpperBoundId() {
        if ((this.bitField0_ & 8) == 8) {
            return true;
        }
        return false;
    }

    public boolean hasNullable() {
        if ((this.bitField0_ & 1) == 1) {
            return true;
        }
        return false;
    }

    public boolean hasOuterType() {
        if ((this.bitField0_ & 256) == 256) {
            return true;
        }
        return false;
    }

    public boolean hasOuterTypeId() {
        if ((this.bitField0_ & RecyclerView.C1231a0.FLAG_ADAPTER_POSITION_UNKNOWN) == 512) {
            return true;
        }
        return false;
    }

    public boolean hasTypeAliasName() {
        if ((this.bitField0_ & 128) == 128) {
            return true;
        }
        return false;
    }

    public boolean hasTypeParameter() {
        if ((this.bitField0_ & 32) == 32) {
            return true;
        }
        return false;
    }

    public boolean hasTypeParameterName() {
        if ((this.bitField0_ & 64) == 64) {
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
        for (int i = 0; i < getArgumentCount(); i++) {
            if (!getArgument(i).isInitialized()) {
                this.memoizedIsInitialized = 0;
                return false;
            }
        }
        if (hasFlexibleUpperBound() && !getFlexibleUpperBound().isInitialized()) {
            this.memoizedIsInitialized = 0;
            return false;
        } else if (hasOuterType() && !getOuterType().isInitialized()) {
            this.memoizedIsInitialized = 0;
            return false;
        } else if (hasAbbreviatedType() && !getAbbreviatedType().isInitialized()) {
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
        if ((this.bitField0_ & 4096) == 4096) {
            codedOutputStream.mo54614a0(1, this.flags_);
        }
        for (int i = 0; i < this.argument_.size(); i++) {
            codedOutputStream.mo54617d0(2, this.argument_.get(i));
        }
        if ((this.bitField0_ & 1) == 1) {
            codedOutputStream.mo54599L(3, this.nullable_);
        }
        if ((this.bitField0_ & 2) == 2) {
            codedOutputStream.mo54614a0(4, this.flexibleTypeCapabilitiesId_);
        }
        if ((this.bitField0_ & 4) == 4) {
            codedOutputStream.mo54617d0(5, this.flexibleUpperBound_);
        }
        if ((this.bitField0_ & 16) == 16) {
            codedOutputStream.mo54614a0(6, this.className_);
        }
        if ((this.bitField0_ & 32) == 32) {
            codedOutputStream.mo54614a0(7, this.typeParameter_);
        }
        if ((this.bitField0_ & 8) == 8) {
            codedOutputStream.mo54614a0(8, this.flexibleUpperBoundId_);
        }
        if ((this.bitField0_ & 64) == 64) {
            codedOutputStream.mo54614a0(9, this.typeParameterName_);
        }
        if ((this.bitField0_ & 256) == 256) {
            codedOutputStream.mo54617d0(10, this.outerType_);
        }
        if ((this.bitField0_ & RecyclerView.C1231a0.FLAG_ADAPTER_POSITION_UNKNOWN) == 512) {
            codedOutputStream.mo54614a0(11, this.outerTypeId_);
        }
        if ((this.bitField0_ & 128) == 128) {
            codedOutputStream.mo54614a0(12, this.typeAliasName_);
        }
        if ((this.bitField0_ & RecyclerView.C1231a0.FLAG_ADAPTER_FULLUPDATE) == 1024) {
            codedOutputStream.mo54617d0(13, this.abbreviatedType_);
        }
        if ((this.bitField0_ & 2048) == 2048) {
            codedOutputStream.mo54614a0(14, this.abbreviatedTypeId_);
        }
        newExtensionWriter.mo54650a(MlKitException.CODE_SCANNER_UNAVAILABLE, codedOutputStream);
        codedOutputStream.mo54622i0(this.unknownFields);
    }

    public static C7568b newBuilder(ProtoBuf$Type protoBuf$Type) {
        return newBuilder().mo53896g(protoBuf$Type);
    }

    public ProtoBuf$Type getDefaultInstanceForType() {
        return f39789a;
    }

    public C7568b newBuilderForType() {
        return newBuilder();
    }

    public C7568b toBuilder() {
        return newBuilder(this);
    }

    public ProtoBuf$Type(GeneratedMessageLite.C7602c<ProtoBuf$Type, ?> cVar) {
        super(cVar);
        this.memoizedIsInitialized = -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = cVar.mo54651f();
    }

    public ProtoBuf$Type(boolean z) {
        this.memoizedIsInitialized = -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = c70.f37074a;
    }

    public ProtoBuf$Type(C7614c cVar, C7616d dVar) throws InvalidProtocolBufferException {
        this.memoizedIsInitialized = -1;
        this.memoizedSerializedSize = -1;
        mo54294c();
        c70.C6928b D = c70.m56312D();
        CodedOutputStream J = CodedOutputStream.m61851J(D, 1);
        boolean z = false;
        boolean z2 = false;
        while (!z) {
            try {
                int K = cVar.mo54700K();
                C7568b bVar = null;
                switch (K) {
                    case 0:
                        z = true;
                        break;
                    case 8:
                        this.bitField0_ |= 4096;
                        this.flags_ = cVar.mo54724s();
                        break;
                    case 18:
                        if (!z2 || !true) {
                            this.argument_ = new ArrayList();
                            z2 |= true;
                        }
                        this.argument_.add(cVar.mo54726u(Argument.PARSER, dVar));
                        break;
                    case 24:
                        this.bitField0_ |= 1;
                        this.nullable_ = cVar.mo54716k();
                        break;
                    case 32:
                        this.bitField0_ |= 2;
                        this.flexibleTypeCapabilitiesId_ = cVar.mo54724s();
                        break;
                    case 42:
                        bVar = (this.bitField0_ & 4) == 4 ? this.flexibleUpperBound_.toBuilder() : bVar;
                        ProtoBuf$Type protoBuf$Type = (ProtoBuf$Type) cVar.mo54726u(PARSER, dVar);
                        this.flexibleUpperBound_ = protoBuf$Type;
                        if (bVar != null) {
                            bVar.mo53896g(protoBuf$Type);
                            this.flexibleUpperBound_ = bVar.mo54356r();
                        }
                        this.bitField0_ |= 4;
                        break;
                    case 48:
                        this.bitField0_ |= 16;
                        this.className_ = cVar.mo54724s();
                        break;
                    case 56:
                        this.bitField0_ |= 32;
                        this.typeParameter_ = cVar.mo54724s();
                        break;
                    case 64:
                        this.bitField0_ |= 8;
                        this.flexibleUpperBoundId_ = cVar.mo54724s();
                        break;
                    case 72:
                        this.bitField0_ |= 64;
                        this.typeParameterName_ = cVar.mo54724s();
                        break;
                    case 82:
                        bVar = (this.bitField0_ & 256) == 256 ? this.outerType_.toBuilder() : bVar;
                        ProtoBuf$Type protoBuf$Type2 = (ProtoBuf$Type) cVar.mo54726u(PARSER, dVar);
                        this.outerType_ = protoBuf$Type2;
                        if (bVar != null) {
                            bVar.mo53896g(protoBuf$Type2);
                            this.outerType_ = bVar.mo54356r();
                        }
                        this.bitField0_ |= 256;
                        break;
                    case 88:
                        this.bitField0_ |= RecyclerView.C1231a0.FLAG_ADAPTER_POSITION_UNKNOWN;
                        this.outerTypeId_ = cVar.mo54724s();
                        break;
                    case 96:
                        this.bitField0_ |= 128;
                        this.typeAliasName_ = cVar.mo54724s();
                        break;
                    case 106:
                        bVar = (this.bitField0_ & RecyclerView.C1231a0.FLAG_ADAPTER_FULLUPDATE) == 1024 ? this.abbreviatedType_.toBuilder() : bVar;
                        ProtoBuf$Type protoBuf$Type3 = (ProtoBuf$Type) cVar.mo54726u(PARSER, dVar);
                        this.abbreviatedType_ = protoBuf$Type3;
                        if (bVar != null) {
                            bVar.mo53896g(protoBuf$Type3);
                            this.abbreviatedType_ = bVar.mo54356r();
                        }
                        this.bitField0_ |= RecyclerView.C1231a0.FLAG_ADAPTER_FULLUPDATE;
                        break;
                    case 112:
                        this.bitField0_ |= 2048;
                        this.abbreviatedTypeId_ = cVar.mo54724s();
                        break;
                    default:
                        if (parseUnknownField(cVar, J, dVar, K)) {
                            break;
                        }
                        z = true;
                        break;
                }
            } catch (InvalidProtocolBufferException e) {
                throw e.setUnfinishedMessage(this);
            } catch (IOException e2) {
                throw new InvalidProtocolBufferException(e2.getMessage()).setUnfinishedMessage(this);
            } catch (Throwable th) {
                if (z2 && true) {
                    this.argument_ = Collections.unmodifiableList(this.argument_);
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
        if (z2 && true) {
            this.argument_ = Collections.unmodifiableList(this.argument_);
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
