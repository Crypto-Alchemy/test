package kotlin.reflect.jvm.internal.impl.metadata;

import com.google.mlkit.common.MlKitException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type;
import kotlin.reflect.jvm.internal.impl.protobuf.C7610a;
import kotlin.reflect.jvm.internal.impl.protobuf.C7613b;
import kotlin.reflect.jvm.internal.impl.protobuf.C7614c;
import kotlin.reflect.jvm.internal.impl.protobuf.C7616d;
import kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import net.sqlcipher.database.SQLiteDatabase;
import p000.c70;

public final class ProtoBuf$TypeAlias extends GeneratedMessageLite.ExtendableMessage<ProtoBuf$TypeAlias> {
    public static jm4<ProtoBuf$TypeAlias> PARSER = new C7569a();

    /* renamed from: a */
    public static final ProtoBuf$TypeAlias f39813a;
    /* access modifiers changed from: private */
    public List<ProtoBuf$Annotation> annotation_;
    /* access modifiers changed from: private */
    public int bitField0_;
    /* access modifiers changed from: private */
    public int expandedTypeId_;
    /* access modifiers changed from: private */
    public ProtoBuf$Type expandedType_;
    /* access modifiers changed from: private */
    public int flags_;
    private byte memoizedIsInitialized;
    private int memoizedSerializedSize;
    /* access modifiers changed from: private */
    public int name_;
    /* access modifiers changed from: private */
    public List<ProtoBuf$TypeParameter> typeParameter_;
    /* access modifiers changed from: private */
    public int underlyingTypeId_;
    /* access modifiers changed from: private */
    public ProtoBuf$Type underlyingType_;
    /* access modifiers changed from: private */
    public final c70 unknownFields;
    /* access modifiers changed from: private */
    public List<Integer> versionRequirement_;

    /* renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeAlias$a */
    public static class C7569a extends C7613b<ProtoBuf$TypeAlias> {
        /* renamed from: m */
        public ProtoBuf$TypeAlias mo52753c(C7614c cVar, C7616d dVar) throws InvalidProtocolBufferException {
            return new ProtoBuf$TypeAlias(cVar, dVar);
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeAlias$b */
    public static final class C7570b extends GeneratedMessageLite.C7602c<ProtoBuf$TypeAlias, C7570b> {

        /* renamed from: A */
        public ProtoBuf$Type f39814A = ProtoBuf$Type.getDefaultInstance();

        /* renamed from: B */
        public int f39815B;

        /* renamed from: C */
        public List<ProtoBuf$Annotation> f39816C = Collections.emptyList();

        /* renamed from: H */
        public List<Integer> f39817H = Collections.emptyList();

        /* renamed from: g */
        public int f39818g;

        /* renamed from: k */
        public int f39819k = 6;

        /* renamed from: r */
        public int f39820r;

        /* renamed from: s */
        public List<ProtoBuf$TypeParameter> f39821s = Collections.emptyList();

        /* renamed from: x */
        public ProtoBuf$Type f39822x = ProtoBuf$Type.getDefaultInstance();

        /* renamed from: y */
        public int f39823y;

        public C7570b() {
            mo54397y();
        }

        /* renamed from: u */
        public static C7570b m61622u() {
            return new C7570b();
        }

        /* renamed from: B */
        public C7570b mo53896g(ProtoBuf$TypeAlias protoBuf$TypeAlias) {
            if (protoBuf$TypeAlias == ProtoBuf$TypeAlias.getDefaultInstance()) {
                return this;
            }
            if (protoBuf$TypeAlias.hasFlags()) {
                mo54388F(protoBuf$TypeAlias.getFlags());
            }
            if (protoBuf$TypeAlias.hasName()) {
                mo54389G(protoBuf$TypeAlias.getName());
            }
            if (!protoBuf$TypeAlias.typeParameter_.isEmpty()) {
                if (this.f39821s.isEmpty()) {
                    this.f39821s = protoBuf$TypeAlias.typeParameter_;
                    this.f39818g &= -5;
                } else {
                    mo54395w();
                    this.f39821s.addAll(protoBuf$TypeAlias.typeParameter_);
                }
            }
            if (protoBuf$TypeAlias.hasUnderlyingType()) {
                mo54386D(protoBuf$TypeAlias.getUnderlyingType());
            }
            if (protoBuf$TypeAlias.hasUnderlyingTypeId()) {
                mo54390H(protoBuf$TypeAlias.getUnderlyingTypeId());
            }
            if (protoBuf$TypeAlias.hasExpandedType()) {
                mo54398z(protoBuf$TypeAlias.getExpandedType());
            }
            if (protoBuf$TypeAlias.hasExpandedTypeId()) {
                mo54387E(protoBuf$TypeAlias.getExpandedTypeId());
            }
            if (!protoBuf$TypeAlias.annotation_.isEmpty()) {
                if (this.f39816C.isEmpty()) {
                    this.f39816C = protoBuf$TypeAlias.annotation_;
                    this.f39818g &= -129;
                } else {
                    mo54394v();
                    this.f39816C.addAll(protoBuf$TypeAlias.annotation_);
                }
            }
            if (!protoBuf$TypeAlias.versionRequirement_.isEmpty()) {
                if (this.f39817H.isEmpty()) {
                    this.f39817H = protoBuf$TypeAlias.versionRequirement_;
                    this.f39818g &= -257;
                } else {
                    mo54396x();
                    this.f39817H.addAll(protoBuf$TypeAlias.versionRequirement_);
                }
            }
            mo54655m(protoBuf$TypeAlias);
            mo54652h(mo54651f().mo50826j(protoBuf$TypeAlias.unknownFields));
            return this;
        }

        /* renamed from: C */
        public C7570b mo53900n(C7614c cVar, C7616d dVar) throws IOException {
            ProtoBuf$TypeAlias protoBuf$TypeAlias;
            ProtoBuf$TypeAlias protoBuf$TypeAlias2 = null;
            try {
                ProtoBuf$TypeAlias c = ProtoBuf$TypeAlias.PARSER.mo52753c(cVar, dVar);
                if (c != null) {
                    mo53896g(c);
                }
                return this;
            } catch (InvalidProtocolBufferException e) {
                protoBuf$TypeAlias = (ProtoBuf$TypeAlias) e.getUnfinishedMessage();
                throw e;
            } catch (Throwable th) {
                th = th;
                protoBuf$TypeAlias2 = protoBuf$TypeAlias;
            }
            if (protoBuf$TypeAlias2 != null) {
                mo53896g(protoBuf$TypeAlias2);
            }
            throw th;
        }

        /* renamed from: D */
        public C7570b mo54386D(ProtoBuf$Type protoBuf$Type) {
            if ((this.f39818g & 8) != 8 || this.f39822x == ProtoBuf$Type.getDefaultInstance()) {
                this.f39822x = protoBuf$Type;
            } else {
                this.f39822x = ProtoBuf$Type.newBuilder(this.f39822x).mo53896g(protoBuf$Type).mo54356r();
            }
            this.f39818g |= 8;
            return this;
        }

        /* renamed from: E */
        public C7570b mo54387E(int i) {
            this.f39818g |= 64;
            this.f39815B = i;
            return this;
        }

        /* renamed from: F */
        public C7570b mo54388F(int i) {
            this.f39818g |= 1;
            this.f39819k = i;
            return this;
        }

        /* renamed from: G */
        public C7570b mo54389G(int i) {
            this.f39818g |= 2;
            this.f39820r = i;
            return this;
        }

        /* renamed from: H */
        public C7570b mo54390H(int i) {
            this.f39818g |= 16;
            this.f39823y = i;
            return this;
        }

        /* renamed from: p */
        public ProtoBuf$TypeAlias build() {
            ProtoBuf$TypeAlias r = mo54392r();
            if (r.isInitialized()) {
                return r;
            }
            throw C7610a.C7611a.m61947b(r);
        }

        /* renamed from: r */
        public ProtoBuf$TypeAlias mo54392r() {
            ProtoBuf$TypeAlias protoBuf$TypeAlias = new ProtoBuf$TypeAlias((GeneratedMessageLite.C7602c) this);
            int i = this.f39818g;
            int i2 = 1;
            if ((i & 1) != 1) {
                i2 = 0;
            }
            int unused = protoBuf$TypeAlias.flags_ = this.f39819k;
            if ((i & 2) == 2) {
                i2 |= 2;
            }
            int unused2 = protoBuf$TypeAlias.name_ = this.f39820r;
            if ((this.f39818g & 4) == 4) {
                this.f39821s = Collections.unmodifiableList(this.f39821s);
                this.f39818g &= -5;
            }
            List unused3 = protoBuf$TypeAlias.typeParameter_ = this.f39821s;
            if ((i & 8) == 8) {
                i2 |= 4;
            }
            ProtoBuf$Type unused4 = protoBuf$TypeAlias.underlyingType_ = this.f39822x;
            if ((i & 16) == 16) {
                i2 |= 8;
            }
            int unused5 = protoBuf$TypeAlias.underlyingTypeId_ = this.f39823y;
            if ((i & 32) == 32) {
                i2 |= 16;
            }
            ProtoBuf$Type unused6 = protoBuf$TypeAlias.expandedType_ = this.f39814A;
            if ((i & 64) == 64) {
                i2 |= 32;
            }
            int unused7 = protoBuf$TypeAlias.expandedTypeId_ = this.f39815B;
            if ((this.f39818g & 128) == 128) {
                this.f39816C = Collections.unmodifiableList(this.f39816C);
                this.f39818g &= -129;
            }
            List unused8 = protoBuf$TypeAlias.annotation_ = this.f39816C;
            if ((this.f39818g & 256) == 256) {
                this.f39817H = Collections.unmodifiableList(this.f39817H);
                this.f39818g &= -257;
            }
            List unused9 = protoBuf$TypeAlias.versionRequirement_ = this.f39817H;
            int unused10 = protoBuf$TypeAlias.bitField0_ = i2;
            return protoBuf$TypeAlias;
        }

        /* renamed from: t */
        public C7570b mo53895d() {
            return m61622u().mo53896g(mo54392r());
        }

        /* renamed from: v */
        public final void mo54394v() {
            if ((this.f39818g & 128) != 128) {
                this.f39816C = new ArrayList(this.f39816C);
                this.f39818g |= 128;
            }
        }

        /* renamed from: w */
        public final void mo54395w() {
            if ((this.f39818g & 4) != 4) {
                this.f39821s = new ArrayList(this.f39821s);
                this.f39818g |= 4;
            }
        }

        /* renamed from: x */
        public final void mo54396x() {
            if ((this.f39818g & 256) != 256) {
                this.f39817H = new ArrayList(this.f39817H);
                this.f39818g |= 256;
            }
        }

        /* renamed from: y */
        public final void mo54397y() {
        }

        /* renamed from: z */
        public C7570b mo54398z(ProtoBuf$Type protoBuf$Type) {
            if ((this.f39818g & 32) != 32 || this.f39814A == ProtoBuf$Type.getDefaultInstance()) {
                this.f39814A = protoBuf$Type;
            } else {
                this.f39814A = ProtoBuf$Type.newBuilder(this.f39814A).mo53896g(protoBuf$Type).mo54356r();
            }
            this.f39818g |= 32;
            return this;
        }
    }

    static {
        ProtoBuf$TypeAlias protoBuf$TypeAlias = new ProtoBuf$TypeAlias(true);
        f39813a = protoBuf$TypeAlias;
        protoBuf$TypeAlias.mo54363c();
    }

    public static ProtoBuf$TypeAlias getDefaultInstance() {
        return f39813a;
    }

    public static C7570b newBuilder() {
        return C7570b.m61622u();
    }

    public static ProtoBuf$TypeAlias parseDelimitedFrom(InputStream inputStream, C7616d dVar) throws IOException {
        return PARSER.mo52754d(inputStream, dVar);
    }

    /* renamed from: c */
    public final void mo54363c() {
        this.flags_ = 6;
        this.name_ = 0;
        this.typeParameter_ = Collections.emptyList();
        this.underlyingType_ = ProtoBuf$Type.getDefaultInstance();
        this.underlyingTypeId_ = 0;
        this.expandedType_ = ProtoBuf$Type.getDefaultInstance();
        this.expandedTypeId_ = 0;
        this.annotation_ = Collections.emptyList();
        this.versionRequirement_ = Collections.emptyList();
    }

    public ProtoBuf$Annotation getAnnotation(int i) {
        return this.annotation_.get(i);
    }

    public int getAnnotationCount() {
        return this.annotation_.size();
    }

    public List<ProtoBuf$Annotation> getAnnotationList() {
        return this.annotation_;
    }

    public ProtoBuf$Type getExpandedType() {
        return this.expandedType_;
    }

    public int getExpandedTypeId() {
        return this.expandedTypeId_;
    }

    public int getFlags() {
        return this.flags_;
    }

    public int getName() {
        return this.name_;
    }

    public jm4<ProtoBuf$TypeAlias> getParserForType() {
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
            i += CodedOutputStream.m61866o(2, this.name_);
        }
        for (int i3 = 0; i3 < this.typeParameter_.size(); i3++) {
            i += CodedOutputStream.m61870s(3, this.typeParameter_.get(i3));
        }
        if ((this.bitField0_ & 4) == 4) {
            i += CodedOutputStream.m61870s(4, this.underlyingType_);
        }
        if ((this.bitField0_ & 8) == 8) {
            i += CodedOutputStream.m61866o(5, this.underlyingTypeId_);
        }
        if ((this.bitField0_ & 16) == 16) {
            i += CodedOutputStream.m61870s(6, this.expandedType_);
        }
        if ((this.bitField0_ & 32) == 32) {
            i += CodedOutputStream.m61866o(7, this.expandedTypeId_);
        }
        for (int i4 = 0; i4 < this.annotation_.size(); i4++) {
            i += CodedOutputStream.m61870s(8, this.annotation_.get(i4));
        }
        int i5 = 0;
        for (int i6 = 0; i6 < this.versionRequirement_.size(); i6++) {
            i5 += CodedOutputStream.m61867p(this.versionRequirement_.get(i6).intValue());
        }
        int size = i + i5 + (getVersionRequirementList().size() * 2) + extensionsSerializedSize() + this.unknownFields.size();
        this.memoizedSerializedSize = size;
        return size;
    }

    public ProtoBuf$TypeParameter getTypeParameter(int i) {
        return this.typeParameter_.get(i);
    }

    public int getTypeParameterCount() {
        return this.typeParameter_.size();
    }

    public List<ProtoBuf$TypeParameter> getTypeParameterList() {
        return this.typeParameter_;
    }

    public ProtoBuf$Type getUnderlyingType() {
        return this.underlyingType_;
    }

    public int getUnderlyingTypeId() {
        return this.underlyingTypeId_;
    }

    public List<Integer> getVersionRequirementList() {
        return this.versionRequirement_;
    }

    public boolean hasExpandedType() {
        if ((this.bitField0_ & 16) == 16) {
            return true;
        }
        return false;
    }

    public boolean hasExpandedTypeId() {
        if ((this.bitField0_ & 32) == 32) {
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

    public boolean hasName() {
        if ((this.bitField0_ & 2) == 2) {
            return true;
        }
        return false;
    }

    public boolean hasUnderlyingType() {
        if ((this.bitField0_ & 4) == 4) {
            return true;
        }
        return false;
    }

    public boolean hasUnderlyingTypeId() {
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
        if (!hasName()) {
            this.memoizedIsInitialized = 0;
            return false;
        }
        for (int i = 0; i < getTypeParameterCount(); i++) {
            if (!getTypeParameter(i).isInitialized()) {
                this.memoizedIsInitialized = 0;
                return false;
            }
        }
        if (hasUnderlyingType() && !getUnderlyingType().isInitialized()) {
            this.memoizedIsInitialized = 0;
            return false;
        } else if (!hasExpandedType() || getExpandedType().isInitialized()) {
            for (int i2 = 0; i2 < getAnnotationCount(); i2++) {
                if (!getAnnotation(i2).isInitialized()) {
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
        } else {
            this.memoizedIsInitialized = 0;
            return false;
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
        for (int i = 0; i < this.typeParameter_.size(); i++) {
            codedOutputStream.mo54617d0(3, this.typeParameter_.get(i));
        }
        if ((this.bitField0_ & 4) == 4) {
            codedOutputStream.mo54617d0(4, this.underlyingType_);
        }
        if ((this.bitField0_ & 8) == 8) {
            codedOutputStream.mo54614a0(5, this.underlyingTypeId_);
        }
        if ((this.bitField0_ & 16) == 16) {
            codedOutputStream.mo54617d0(6, this.expandedType_);
        }
        if ((this.bitField0_ & 32) == 32) {
            codedOutputStream.mo54614a0(7, this.expandedTypeId_);
        }
        for (int i2 = 0; i2 < this.annotation_.size(); i2++) {
            codedOutputStream.mo54617d0(8, this.annotation_.get(i2));
        }
        for (int i3 = 0; i3 < this.versionRequirement_.size(); i3++) {
            codedOutputStream.mo54614a0(31, this.versionRequirement_.get(i3).intValue());
        }
        newExtensionWriter.mo54650a(MlKitException.CODE_SCANNER_UNAVAILABLE, codedOutputStream);
        codedOutputStream.mo54622i0(this.unknownFields);
    }

    public static C7570b newBuilder(ProtoBuf$TypeAlias protoBuf$TypeAlias) {
        return newBuilder().mo53896g(protoBuf$TypeAlias);
    }

    public ProtoBuf$TypeAlias getDefaultInstanceForType() {
        return f39813a;
    }

    public C7570b newBuilderForType() {
        return newBuilder();
    }

    public C7570b toBuilder() {
        return newBuilder(this);
    }

    public ProtoBuf$TypeAlias(GeneratedMessageLite.C7602c<ProtoBuf$TypeAlias, ?> cVar) {
        super(cVar);
        this.memoizedIsInitialized = -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = cVar.mo54651f();
    }

    public ProtoBuf$TypeAlias(boolean z) {
        this.memoizedIsInitialized = -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = c70.f37074a;
    }

    public ProtoBuf$TypeAlias(C7614c cVar, C7616d dVar) throws InvalidProtocolBufferException {
        this.memoizedIsInitialized = -1;
        this.memoizedSerializedSize = -1;
        mo54363c();
        c70.C6928b D = c70.m56312D();
        CodedOutputStream J = CodedOutputStream.m61851J(D, 1);
        boolean z = false;
        boolean z2 = false;
        while (!z) {
            try {
                int K = cVar.mo54700K();
                ProtoBuf$Type.C7568b bVar = null;
                switch (K) {
                    case 0:
                        z = true;
                        break;
                    case 8:
                        this.bitField0_ |= 1;
                        this.flags_ = cVar.mo54724s();
                        break;
                    case 16:
                        this.bitField0_ |= 2;
                        this.name_ = cVar.mo54724s();
                        break;
                    case 26:
                        if (!(z2 & true)) {
                            this.typeParameter_ = new ArrayList();
                            z2 |= true;
                        }
                        this.typeParameter_.add(cVar.mo54726u(ProtoBuf$TypeParameter.PARSER, dVar));
                        break;
                    case 34:
                        bVar = (this.bitField0_ & 4) == 4 ? this.underlyingType_.toBuilder() : bVar;
                        ProtoBuf$Type protoBuf$Type = (ProtoBuf$Type) cVar.mo54726u(ProtoBuf$Type.PARSER, dVar);
                        this.underlyingType_ = protoBuf$Type;
                        if (bVar != null) {
                            bVar.mo53896g(protoBuf$Type);
                            this.underlyingType_ = bVar.mo54356r();
                        }
                        this.bitField0_ |= 4;
                        break;
                    case 40:
                        this.bitField0_ |= 8;
                        this.underlyingTypeId_ = cVar.mo54724s();
                        break;
                    case 50:
                        bVar = (this.bitField0_ & 16) == 16 ? this.expandedType_.toBuilder() : bVar;
                        ProtoBuf$Type protoBuf$Type2 = (ProtoBuf$Type) cVar.mo54726u(ProtoBuf$Type.PARSER, dVar);
                        this.expandedType_ = protoBuf$Type2;
                        if (bVar != null) {
                            bVar.mo53896g(protoBuf$Type2);
                            this.expandedType_ = bVar.mo54356r();
                        }
                        this.bitField0_ |= 16;
                        break;
                    case 56:
                        this.bitField0_ |= 32;
                        this.expandedTypeId_ = cVar.mo54724s();
                        break;
                    case 66:
                        if (!(z2 & true)) {
                            this.annotation_ = new ArrayList();
                            z2 |= true;
                        }
                        this.annotation_.add(cVar.mo54726u(ProtoBuf$Annotation.PARSER, dVar));
                        break;
                    case 248:
                        if (!(z2 & true)) {
                            this.versionRequirement_ = new ArrayList();
                            z2 |= true;
                        }
                        this.versionRequirement_.add(Integer.valueOf(cVar.mo54724s()));
                        break;
                    case SQLiteDatabase.MAX_SQL_CACHE_SIZE /*250*/:
                        int j = cVar.mo54715j(cVar.mo54691A());
                        if (!(z2 & true) && cVar.mo54712e() > 0) {
                            this.versionRequirement_ = new ArrayList();
                            z2 |= true;
                        }
                        while (cVar.mo54712e() > 0) {
                            this.versionRequirement_.add(Integer.valueOf(cVar.mo54724s()));
                        }
                        cVar.mo54714i(j);
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
                if (z2 & true) {
                    this.typeParameter_ = Collections.unmodifiableList(this.typeParameter_);
                }
                if (z2 & true) {
                    this.annotation_ = Collections.unmodifiableList(this.annotation_);
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
            this.typeParameter_ = Collections.unmodifiableList(this.typeParameter_);
        }
        if (z2 & true) {
            this.annotation_ = Collections.unmodifiableList(this.annotation_);
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
