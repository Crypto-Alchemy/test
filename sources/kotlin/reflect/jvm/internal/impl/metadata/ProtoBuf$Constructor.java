package kotlin.reflect.jvm.internal.impl.metadata;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.protobuf.C7610a;
import kotlin.reflect.jvm.internal.impl.protobuf.C7613b;
import kotlin.reflect.jvm.internal.impl.protobuf.C7614c;
import kotlin.reflect.jvm.internal.impl.protobuf.C7616d;
import kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import p000.c70;

public final class ProtoBuf$Constructor extends GeneratedMessageLite.ExtendableMessage<ProtoBuf$Constructor> {
    public static jm4<ProtoBuf$Constructor> PARSER = new C7534a();

    /* renamed from: a */
    public static final ProtoBuf$Constructor f39695a;
    /* access modifiers changed from: private */
    public int bitField0_;
    /* access modifiers changed from: private */
    public int flags_;
    private byte memoizedIsInitialized;
    private int memoizedSerializedSize;
    /* access modifiers changed from: private */
    public final c70 unknownFields;
    /* access modifiers changed from: private */
    public List<ProtoBuf$ValueParameter> valueParameter_;
    /* access modifiers changed from: private */
    public List<Integer> versionRequirement_;

    /* renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Constructor$a */
    public static class C7534a extends C7613b<ProtoBuf$Constructor> {
        /* renamed from: m */
        public ProtoBuf$Constructor mo52753c(C7614c cVar, C7616d dVar) throws InvalidProtocolBufferException {
            return new ProtoBuf$Constructor(cVar, dVar);
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Constructor$b */
    public static final class C7535b extends GeneratedMessageLite.C7602c<ProtoBuf$Constructor, C7535b> {

        /* renamed from: g */
        public int f39696g;

        /* renamed from: k */
        public int f39697k = 6;

        /* renamed from: r */
        public List<ProtoBuf$ValueParameter> f39698r = Collections.emptyList();

        /* renamed from: s */
        public List<Integer> f39699s = Collections.emptyList();

        public C7535b() {
            mo54027x();
        }

        /* renamed from: u */
        public static C7535b m61330u() {
            return new C7535b();
        }

        /* renamed from: B */
        public C7535b mo54021B(int i) {
            this.f39696g |= 1;
            this.f39697k = i;
            return this;
        }

        /* renamed from: p */
        public ProtoBuf$Constructor build() {
            ProtoBuf$Constructor r = mo54023r();
            if (r.isInitialized()) {
                return r;
            }
            throw C7610a.C7611a.m61947b(r);
        }

        /* renamed from: r */
        public ProtoBuf$Constructor mo54023r() {
            ProtoBuf$Constructor protoBuf$Constructor = new ProtoBuf$Constructor((GeneratedMessageLite.C7602c) this);
            int i = 1;
            if ((this.f39696g & 1) != 1) {
                i = 0;
            }
            int unused = protoBuf$Constructor.flags_ = this.f39697k;
            if ((this.f39696g & 2) == 2) {
                this.f39698r = Collections.unmodifiableList(this.f39698r);
                this.f39696g &= -3;
            }
            List unused2 = protoBuf$Constructor.valueParameter_ = this.f39698r;
            if ((this.f39696g & 4) == 4) {
                this.f39699s = Collections.unmodifiableList(this.f39699s);
                this.f39696g &= -5;
            }
            List unused3 = protoBuf$Constructor.versionRequirement_ = this.f39699s;
            int unused4 = protoBuf$Constructor.bitField0_ = i;
            return protoBuf$Constructor;
        }

        /* renamed from: t */
        public C7535b mo53895d() {
            return m61330u().mo53896g(mo54023r());
        }

        /* renamed from: v */
        public final void mo54025v() {
            if ((this.f39696g & 2) != 2) {
                this.f39698r = new ArrayList(this.f39698r);
                this.f39696g |= 2;
            }
        }

        /* renamed from: w */
        public final void mo54026w() {
            if ((this.f39696g & 4) != 4) {
                this.f39699s = new ArrayList(this.f39699s);
                this.f39696g |= 4;
            }
        }

        /* renamed from: x */
        public final void mo54027x() {
        }

        /* renamed from: y */
        public C7535b mo53896g(ProtoBuf$Constructor protoBuf$Constructor) {
            if (protoBuf$Constructor == ProtoBuf$Constructor.getDefaultInstance()) {
                return this;
            }
            if (protoBuf$Constructor.hasFlags()) {
                mo54021B(protoBuf$Constructor.getFlags());
            }
            if (!protoBuf$Constructor.valueParameter_.isEmpty()) {
                if (this.f39698r.isEmpty()) {
                    this.f39698r = protoBuf$Constructor.valueParameter_;
                    this.f39696g &= -3;
                } else {
                    mo54025v();
                    this.f39698r.addAll(protoBuf$Constructor.valueParameter_);
                }
            }
            if (!protoBuf$Constructor.versionRequirement_.isEmpty()) {
                if (this.f39699s.isEmpty()) {
                    this.f39699s = protoBuf$Constructor.versionRequirement_;
                    this.f39696g &= -5;
                } else {
                    mo54026w();
                    this.f39699s.addAll(protoBuf$Constructor.versionRequirement_);
                }
            }
            mo54655m(protoBuf$Constructor);
            mo54652h(mo54651f().mo50826j(protoBuf$Constructor.unknownFields));
            return this;
        }

        /* renamed from: z */
        public C7535b mo53900n(C7614c cVar, C7616d dVar) throws IOException {
            ProtoBuf$Constructor protoBuf$Constructor;
            ProtoBuf$Constructor protoBuf$Constructor2 = null;
            try {
                ProtoBuf$Constructor c = ProtoBuf$Constructor.PARSER.mo52753c(cVar, dVar);
                if (c != null) {
                    mo53896g(c);
                }
                return this;
            } catch (InvalidProtocolBufferException e) {
                protoBuf$Constructor = (ProtoBuf$Constructor) e.getUnfinishedMessage();
                throw e;
            } catch (Throwable th) {
                th = th;
                protoBuf$Constructor2 = protoBuf$Constructor;
            }
            if (protoBuf$Constructor2 != null) {
                mo53896g(protoBuf$Constructor2);
            }
            throw th;
        }
    }

    static {
        ProtoBuf$Constructor protoBuf$Constructor = new ProtoBuf$Constructor(true);
        f39695a = protoBuf$Constructor;
        protoBuf$Constructor.mo54013c();
    }

    public static ProtoBuf$Constructor getDefaultInstance() {
        return f39695a;
    }

    public static C7535b newBuilder() {
        return C7535b.m61330u();
    }

    /* renamed from: c */
    public final void mo54013c() {
        this.flags_ = 6;
        this.valueParameter_ = Collections.emptyList();
        this.versionRequirement_ = Collections.emptyList();
    }

    public int getFlags() {
        return this.flags_;
    }

    public jm4<ProtoBuf$Constructor> getParserForType() {
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
        for (int i3 = 0; i3 < this.valueParameter_.size(); i3++) {
            i += CodedOutputStream.m61870s(2, this.valueParameter_.get(i3));
        }
        int i4 = 0;
        for (int i5 = 0; i5 < this.versionRequirement_.size(); i5++) {
            i4 += CodedOutputStream.m61867p(this.versionRequirement_.get(i5).intValue());
        }
        int size = i + i4 + (getVersionRequirementList().size() * 2) + extensionsSerializedSize() + this.unknownFields.size();
        this.memoizedSerializedSize = size;
        return size;
    }

    public ProtoBuf$ValueParameter getValueParameter(int i) {
        return this.valueParameter_.get(i);
    }

    public int getValueParameterCount() {
        return this.valueParameter_.size();
    }

    public List<ProtoBuf$ValueParameter> getValueParameterList() {
        return this.valueParameter_;
    }

    public List<Integer> getVersionRequirementList() {
        return this.versionRequirement_;
    }

    public boolean hasFlags() {
        if ((this.bitField0_ & 1) == 1) {
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
        for (int i = 0; i < getValueParameterCount(); i++) {
            if (!getValueParameter(i).isInitialized()) {
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

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        getSerializedSize();
        GeneratedMessageLite.ExtendableMessage<MessageType>.C6784a newExtensionWriter = newExtensionWriter();
        if ((this.bitField0_ & 1) == 1) {
            codedOutputStream.mo54614a0(1, this.flags_);
        }
        for (int i = 0; i < this.valueParameter_.size(); i++) {
            codedOutputStream.mo54617d0(2, this.valueParameter_.get(i));
        }
        for (int i2 = 0; i2 < this.versionRequirement_.size(); i2++) {
            codedOutputStream.mo54614a0(31, this.versionRequirement_.get(i2).intValue());
        }
        newExtensionWriter.mo54650a(19000, codedOutputStream);
        codedOutputStream.mo54622i0(this.unknownFields);
    }

    public static C7535b newBuilder(ProtoBuf$Constructor protoBuf$Constructor) {
        return newBuilder().mo53896g(protoBuf$Constructor);
    }

    public ProtoBuf$Constructor getDefaultInstanceForType() {
        return f39695a;
    }

    public C7535b newBuilderForType() {
        return newBuilder();
    }

    public C7535b toBuilder() {
        return newBuilder(this);
    }

    public ProtoBuf$Constructor(GeneratedMessageLite.C7602c<ProtoBuf$Constructor, ?> cVar) {
        super(cVar);
        this.memoizedIsInitialized = -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = cVar.mo54651f();
    }

    public ProtoBuf$Constructor(boolean z) {
        this.memoizedIsInitialized = -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = c70.f37074a;
    }

    public ProtoBuf$Constructor(C7614c cVar, C7616d dVar) throws InvalidProtocolBufferException {
        this.memoizedIsInitialized = -1;
        this.memoizedSerializedSize = -1;
        mo54013c();
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
                    } else if (K == 18) {
                        if (!(z2 & true)) {
                            this.valueParameter_ = new ArrayList();
                            z2 |= true;
                        }
                        this.valueParameter_.add(cVar.mo54726u(ProtoBuf$ValueParameter.PARSER, dVar));
                    } else if (K == 248) {
                        if (!(z2 & true)) {
                            this.versionRequirement_ = new ArrayList();
                            z2 |= true;
                        }
                        this.versionRequirement_.add(Integer.valueOf(cVar.mo54724s()));
                    } else if (K == 250) {
                        int j = cVar.mo54715j(cVar.mo54691A());
                        if (!(z2 & true) && cVar.mo54712e() > 0) {
                            this.versionRequirement_ = new ArrayList();
                            z2 |= true;
                        }
                        while (cVar.mo54712e() > 0) {
                            this.versionRequirement_.add(Integer.valueOf(cVar.mo54724s()));
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
                    this.valueParameter_ = Collections.unmodifiableList(this.valueParameter_);
                }
                if (z2 & true) {
                    this.versionRequirement_ = Collections.unmodifiableList(this.versionRequirement_);
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
            this.valueParameter_ = Collections.unmodifiableList(this.valueParameter_);
        }
        if (z2 & true) {
            this.versionRequirement_ = Collections.unmodifiableList(this.versionRequirement_);
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
