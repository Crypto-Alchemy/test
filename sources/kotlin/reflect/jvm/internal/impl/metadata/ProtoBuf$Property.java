package kotlin.reflect.jvm.internal.impl.metadata;

import androidx.recyclerview.widget.RecyclerView;
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

public final class ProtoBuf$Property extends GeneratedMessageLite.ExtendableMessage<ProtoBuf$Property> {
    public static jm4<ProtoBuf$Property> PARSER = new C7555a();

    /* renamed from: a */
    public static final ProtoBuf$Property f39760a;
    /* access modifiers changed from: private */
    public int bitField0_;
    private int contextReceiverTypeIdMemoizedSerializedSize;
    /* access modifiers changed from: private */
    public List<Integer> contextReceiverTypeId_;
    /* access modifiers changed from: private */
    public List<ProtoBuf$Type> contextReceiverType_;
    /* access modifiers changed from: private */
    public int flags_;
    /* access modifiers changed from: private */
    public int getterFlags_;
    private byte memoizedIsInitialized;
    private int memoizedSerializedSize;
    /* access modifiers changed from: private */
    public int name_;
    /* access modifiers changed from: private */
    public int oldFlags_;
    /* access modifiers changed from: private */
    public int receiverTypeId_;
    /* access modifiers changed from: private */
    public ProtoBuf$Type receiverType_;
    /* access modifiers changed from: private */
    public int returnTypeId_;
    /* access modifiers changed from: private */
    public ProtoBuf$Type returnType_;
    /* access modifiers changed from: private */
    public int setterFlags_;
    /* access modifiers changed from: private */
    public ProtoBuf$ValueParameter setterValueParameter_;
    /* access modifiers changed from: private */
    public List<ProtoBuf$TypeParameter> typeParameter_;
    /* access modifiers changed from: private */
    public final c70 unknownFields;
    /* access modifiers changed from: private */
    public List<Integer> versionRequirement_;

    /* renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Property$a */
    public static class C7555a extends C7613b<ProtoBuf$Property> {
        /* renamed from: m */
        public ProtoBuf$Property mo52753c(C7614c cVar, C7616d dVar) throws InvalidProtocolBufferException {
            return new ProtoBuf$Property(cVar, dVar);
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Property$b */
    public static final class C7556b extends GeneratedMessageLite.C7602c<ProtoBuf$Property, C7556b> {

        /* renamed from: A */
        public List<ProtoBuf$TypeParameter> f39761A = Collections.emptyList();

        /* renamed from: B */
        public ProtoBuf$Type f39762B = ProtoBuf$Type.getDefaultInstance();

        /* renamed from: C */
        public int f39763C;

        /* renamed from: H */
        public List<ProtoBuf$Type> f39764H = Collections.emptyList();

        /* renamed from: I */
        public List<Integer> f39765I = Collections.emptyList();

        /* renamed from: L */
        public ProtoBuf$ValueParameter f39766L = ProtoBuf$ValueParameter.getDefaultInstance();

        /* renamed from: M */
        public int f39767M;

        /* renamed from: P */
        public int f39768P;

        /* renamed from: Q */
        public List<Integer> f39769Q = Collections.emptyList();

        /* renamed from: g */
        public int f39770g;

        /* renamed from: k */
        public int f39771k = 518;

        /* renamed from: r */
        public int f39772r = 2054;

        /* renamed from: s */
        public int f39773s;

        /* renamed from: x */
        public ProtoBuf$Type f39774x = ProtoBuf$Type.getDefaultInstance();

        /* renamed from: y */
        public int f39775y;

        public C7556b() {
            mo54253z();
        }

        /* renamed from: u */
        public static C7556b m61494u() {
            return new C7556b();
        }

        /* renamed from: B */
        public C7556b mo53896g(ProtoBuf$Property protoBuf$Property) {
            if (protoBuf$Property == ProtoBuf$Property.getDefaultInstance()) {
                return this;
            }
            if (protoBuf$Property.hasFlags()) {
                mo54239G(protoBuf$Property.getFlags());
            }
            if (protoBuf$Property.hasOldFlags()) {
                mo54242J(protoBuf$Property.getOldFlags());
            }
            if (protoBuf$Property.hasName()) {
                mo54241I(protoBuf$Property.getName());
            }
            if (protoBuf$Property.hasReturnType()) {
                mo54237E(protoBuf$Property.getReturnType());
            }
            if (protoBuf$Property.hasReturnTypeId()) {
                mo54244L(protoBuf$Property.getReturnTypeId());
            }
            if (!protoBuf$Property.typeParameter_.isEmpty()) {
                if (this.f39761A.isEmpty()) {
                    this.f39761A = protoBuf$Property.typeParameter_;
                    this.f39770g &= -33;
                } else {
                    mo54251x();
                    this.f39761A.addAll(protoBuf$Property.typeParameter_);
                }
            }
            if (protoBuf$Property.hasReceiverType()) {
                mo54236D(protoBuf$Property.getReceiverType());
            }
            if (protoBuf$Property.hasReceiverTypeId()) {
                mo54243K(protoBuf$Property.getReceiverTypeId());
            }
            if (!protoBuf$Property.contextReceiverType_.isEmpty()) {
                if (this.f39764H.isEmpty()) {
                    this.f39764H = protoBuf$Property.contextReceiverType_;
                    this.f39770g &= -257;
                } else {
                    mo54250w();
                    this.f39764H.addAll(protoBuf$Property.contextReceiverType_);
                }
            }
            if (!protoBuf$Property.contextReceiverTypeId_.isEmpty()) {
                if (this.f39765I.isEmpty()) {
                    this.f39765I = protoBuf$Property.contextReceiverTypeId_;
                    this.f39770g &= -513;
                } else {
                    mo54249v();
                    this.f39765I.addAll(protoBuf$Property.contextReceiverTypeId_);
                }
            }
            if (protoBuf$Property.hasSetterValueParameter()) {
                mo54238F(protoBuf$Property.getSetterValueParameter());
            }
            if (protoBuf$Property.hasGetterFlags()) {
                mo54240H(protoBuf$Property.getGetterFlags());
            }
            if (protoBuf$Property.hasSetterFlags()) {
                mo54245M(protoBuf$Property.getSetterFlags());
            }
            if (!protoBuf$Property.versionRequirement_.isEmpty()) {
                if (this.f39769Q.isEmpty()) {
                    this.f39769Q = protoBuf$Property.versionRequirement_;
                    this.f39770g &= -8193;
                } else {
                    mo54252y();
                    this.f39769Q.addAll(protoBuf$Property.versionRequirement_);
                }
            }
            mo54655m(protoBuf$Property);
            mo54652h(mo54651f().mo50826j(protoBuf$Property.unknownFields));
            return this;
        }

        /* renamed from: C */
        public C7556b mo53900n(C7614c cVar, C7616d dVar) throws IOException {
            ProtoBuf$Property protoBuf$Property;
            ProtoBuf$Property protoBuf$Property2 = null;
            try {
                ProtoBuf$Property c = ProtoBuf$Property.PARSER.mo52753c(cVar, dVar);
                if (c != null) {
                    mo53896g(c);
                }
                return this;
            } catch (InvalidProtocolBufferException e) {
                protoBuf$Property = (ProtoBuf$Property) e.getUnfinishedMessage();
                throw e;
            } catch (Throwable th) {
                th = th;
                protoBuf$Property2 = protoBuf$Property;
            }
            if (protoBuf$Property2 != null) {
                mo53896g(protoBuf$Property2);
            }
            throw th;
        }

        /* renamed from: D */
        public C7556b mo54236D(ProtoBuf$Type protoBuf$Type) {
            if ((this.f39770g & 64) != 64 || this.f39762B == ProtoBuf$Type.getDefaultInstance()) {
                this.f39762B = protoBuf$Type;
            } else {
                this.f39762B = ProtoBuf$Type.newBuilder(this.f39762B).mo53896g(protoBuf$Type).mo54356r();
            }
            this.f39770g |= 64;
            return this;
        }

        /* renamed from: E */
        public C7556b mo54237E(ProtoBuf$Type protoBuf$Type) {
            if ((this.f39770g & 8) != 8 || this.f39774x == ProtoBuf$Type.getDefaultInstance()) {
                this.f39774x = protoBuf$Type;
            } else {
                this.f39774x = ProtoBuf$Type.newBuilder(this.f39774x).mo53896g(protoBuf$Type).mo54356r();
            }
            this.f39770g |= 8;
            return this;
        }

        /* renamed from: F */
        public C7556b mo54238F(ProtoBuf$ValueParameter protoBuf$ValueParameter) {
            if ((this.f39770g & RecyclerView.C1231a0.FLAG_ADAPTER_FULLUPDATE) != 1024 || this.f39766L == ProtoBuf$ValueParameter.getDefaultInstance()) {
                this.f39766L = protoBuf$ValueParameter;
            } else {
                this.f39766L = ProtoBuf$ValueParameter.newBuilder(this.f39766L).mo53896g(protoBuf$ValueParameter).mo54460r();
            }
            this.f39770g |= RecyclerView.C1231a0.FLAG_ADAPTER_FULLUPDATE;
            return this;
        }

        /* renamed from: G */
        public C7556b mo54239G(int i) {
            this.f39770g |= 1;
            this.f39771k = i;
            return this;
        }

        /* renamed from: H */
        public C7556b mo54240H(int i) {
            this.f39770g |= 2048;
            this.f39767M = i;
            return this;
        }

        /* renamed from: I */
        public C7556b mo54241I(int i) {
            this.f39770g |= 4;
            this.f39773s = i;
            return this;
        }

        /* renamed from: J */
        public C7556b mo54242J(int i) {
            this.f39770g |= 2;
            this.f39772r = i;
            return this;
        }

        /* renamed from: K */
        public C7556b mo54243K(int i) {
            this.f39770g |= 128;
            this.f39763C = i;
            return this;
        }

        /* renamed from: L */
        public C7556b mo54244L(int i) {
            this.f39770g |= 16;
            this.f39775y = i;
            return this;
        }

        /* renamed from: M */
        public C7556b mo54245M(int i) {
            this.f39770g |= 4096;
            this.f39768P = i;
            return this;
        }

        /* renamed from: p */
        public ProtoBuf$Property build() {
            ProtoBuf$Property r = mo54247r();
            if (r.isInitialized()) {
                return r;
            }
            throw C7610a.C7611a.m61947b(r);
        }

        /* renamed from: r */
        public ProtoBuf$Property mo54247r() {
            ProtoBuf$Property protoBuf$Property = new ProtoBuf$Property((GeneratedMessageLite.C7602c) this);
            int i = this.f39770g;
            int i2 = 1;
            if ((i & 1) != 1) {
                i2 = 0;
            }
            int unused = protoBuf$Property.flags_ = this.f39771k;
            if ((i & 2) == 2) {
                i2 |= 2;
            }
            int unused2 = protoBuf$Property.oldFlags_ = this.f39772r;
            if ((i & 4) == 4) {
                i2 |= 4;
            }
            int unused3 = protoBuf$Property.name_ = this.f39773s;
            if ((i & 8) == 8) {
                i2 |= 8;
            }
            ProtoBuf$Type unused4 = protoBuf$Property.returnType_ = this.f39774x;
            if ((i & 16) == 16) {
                i2 |= 16;
            }
            int unused5 = protoBuf$Property.returnTypeId_ = this.f39775y;
            if ((this.f39770g & 32) == 32) {
                this.f39761A = Collections.unmodifiableList(this.f39761A);
                this.f39770g &= -33;
            }
            List unused6 = protoBuf$Property.typeParameter_ = this.f39761A;
            if ((i & 64) == 64) {
                i2 |= 32;
            }
            ProtoBuf$Type unused7 = protoBuf$Property.receiverType_ = this.f39762B;
            if ((i & 128) == 128) {
                i2 |= 64;
            }
            int unused8 = protoBuf$Property.receiverTypeId_ = this.f39763C;
            if ((this.f39770g & 256) == 256) {
                this.f39764H = Collections.unmodifiableList(this.f39764H);
                this.f39770g &= -257;
            }
            List unused9 = protoBuf$Property.contextReceiverType_ = this.f39764H;
            if ((this.f39770g & RecyclerView.C1231a0.FLAG_ADAPTER_POSITION_UNKNOWN) == 512) {
                this.f39765I = Collections.unmodifiableList(this.f39765I);
                this.f39770g &= -513;
            }
            List unused10 = protoBuf$Property.contextReceiverTypeId_ = this.f39765I;
            if ((i & RecyclerView.C1231a0.FLAG_ADAPTER_FULLUPDATE) == 1024) {
                i2 |= 128;
            }
            ProtoBuf$ValueParameter unused11 = protoBuf$Property.setterValueParameter_ = this.f39766L;
            if ((i & 2048) == 2048) {
                i2 |= 256;
            }
            int unused12 = protoBuf$Property.getterFlags_ = this.f39767M;
            if ((i & 4096) == 4096) {
                i2 |= RecyclerView.C1231a0.FLAG_ADAPTER_POSITION_UNKNOWN;
            }
            int unused13 = protoBuf$Property.setterFlags_ = this.f39768P;
            if ((this.f39770g & 8192) == 8192) {
                this.f39769Q = Collections.unmodifiableList(this.f39769Q);
                this.f39770g &= -8193;
            }
            List unused14 = protoBuf$Property.versionRequirement_ = this.f39769Q;
            int unused15 = protoBuf$Property.bitField0_ = i2;
            return protoBuf$Property;
        }

        /* renamed from: t */
        public C7556b mo53895d() {
            return m61494u().mo53896g(mo54247r());
        }

        /* renamed from: v */
        public final void mo54249v() {
            if ((this.f39770g & RecyclerView.C1231a0.FLAG_ADAPTER_POSITION_UNKNOWN) != 512) {
                this.f39765I = new ArrayList(this.f39765I);
                this.f39770g |= RecyclerView.C1231a0.FLAG_ADAPTER_POSITION_UNKNOWN;
            }
        }

        /* renamed from: w */
        public final void mo54250w() {
            if ((this.f39770g & 256) != 256) {
                this.f39764H = new ArrayList(this.f39764H);
                this.f39770g |= 256;
            }
        }

        /* renamed from: x */
        public final void mo54251x() {
            if ((this.f39770g & 32) != 32) {
                this.f39761A = new ArrayList(this.f39761A);
                this.f39770g |= 32;
            }
        }

        /* renamed from: y */
        public final void mo54252y() {
            if ((this.f39770g & 8192) != 8192) {
                this.f39769Q = new ArrayList(this.f39769Q);
                this.f39770g |= 8192;
            }
        }

        /* renamed from: z */
        public final void mo54253z() {
        }
    }

    static {
        ProtoBuf$Property protoBuf$Property = new ProtoBuf$Property(true);
        f39760a = protoBuf$Property;
        protoBuf$Property.mo54204c();
    }

    public static ProtoBuf$Property getDefaultInstance() {
        return f39760a;
    }

    public static C7556b newBuilder() {
        return C7556b.m61494u();
    }

    /* renamed from: c */
    public final void mo54204c() {
        this.flags_ = 518;
        this.oldFlags_ = 2054;
        this.name_ = 0;
        this.returnType_ = ProtoBuf$Type.getDefaultInstance();
        this.returnTypeId_ = 0;
        this.typeParameter_ = Collections.emptyList();
        this.receiverType_ = ProtoBuf$Type.getDefaultInstance();
        this.receiverTypeId_ = 0;
        this.contextReceiverType_ = Collections.emptyList();
        this.contextReceiverTypeId_ = Collections.emptyList();
        this.setterValueParameter_ = ProtoBuf$ValueParameter.getDefaultInstance();
        this.getterFlags_ = 0;
        this.setterFlags_ = 0;
        this.versionRequirement_ = Collections.emptyList();
    }

    public ProtoBuf$Type getContextReceiverType(int i) {
        return this.contextReceiverType_.get(i);
    }

    public int getContextReceiverTypeCount() {
        return this.contextReceiverType_.size();
    }

    public List<Integer> getContextReceiverTypeIdList() {
        return this.contextReceiverTypeId_;
    }

    public List<ProtoBuf$Type> getContextReceiverTypeList() {
        return this.contextReceiverType_;
    }

    public int getFlags() {
        return this.flags_;
    }

    public int getGetterFlags() {
        return this.getterFlags_;
    }

    public int getName() {
        return this.name_;
    }

    public int getOldFlags() {
        return this.oldFlags_;
    }

    public jm4<ProtoBuf$Property> getParserForType() {
        return PARSER;
    }

    public ProtoBuf$Type getReceiverType() {
        return this.receiverType_;
    }

    public int getReceiverTypeId() {
        return this.receiverTypeId_;
    }

    public ProtoBuf$Type getReturnType() {
        return this.returnType_;
    }

    public int getReturnTypeId() {
        return this.returnTypeId_;
    }

    public int getSerializedSize() {
        int i;
        int i2 = this.memoizedSerializedSize;
        if (i2 != -1) {
            return i2;
        }
        if ((this.bitField0_ & 2) == 2) {
            i = CodedOutputStream.m61866o(1, this.oldFlags_) + 0;
        } else {
            i = 0;
        }
        if ((this.bitField0_ & 4) == 4) {
            i += CodedOutputStream.m61866o(2, this.name_);
        }
        if ((this.bitField0_ & 8) == 8) {
            i += CodedOutputStream.m61870s(3, this.returnType_);
        }
        for (int i3 = 0; i3 < this.typeParameter_.size(); i3++) {
            i += CodedOutputStream.m61870s(4, this.typeParameter_.get(i3));
        }
        if ((this.bitField0_ & 32) == 32) {
            i += CodedOutputStream.m61870s(5, this.receiverType_);
        }
        if ((this.bitField0_ & 128) == 128) {
            i += CodedOutputStream.m61870s(6, this.setterValueParameter_);
        }
        if ((this.bitField0_ & 256) == 256) {
            i += CodedOutputStream.m61866o(7, this.getterFlags_);
        }
        if ((this.bitField0_ & RecyclerView.C1231a0.FLAG_ADAPTER_POSITION_UNKNOWN) == 512) {
            i += CodedOutputStream.m61866o(8, this.setterFlags_);
        }
        if ((this.bitField0_ & 16) == 16) {
            i += CodedOutputStream.m61866o(9, this.returnTypeId_);
        }
        if ((this.bitField0_ & 64) == 64) {
            i += CodedOutputStream.m61866o(10, this.receiverTypeId_);
        }
        if ((this.bitField0_ & 1) == 1) {
            i += CodedOutputStream.m61866o(11, this.flags_);
        }
        for (int i4 = 0; i4 < this.contextReceiverType_.size(); i4++) {
            i += CodedOutputStream.m61870s(12, this.contextReceiverType_.get(i4));
        }
        int i5 = 0;
        for (int i6 = 0; i6 < this.contextReceiverTypeId_.size(); i6++) {
            i5 += CodedOutputStream.m61867p(this.contextReceiverTypeId_.get(i6).intValue());
        }
        int i7 = i + i5;
        if (!getContextReceiverTypeIdList().isEmpty()) {
            i7 = i7 + 1 + CodedOutputStream.m61867p(i5);
        }
        this.contextReceiverTypeIdMemoizedSerializedSize = i5;
        int i8 = 0;
        for (int i9 = 0; i9 < this.versionRequirement_.size(); i9++) {
            i8 += CodedOutputStream.m61867p(this.versionRequirement_.get(i9).intValue());
        }
        int size = i7 + i8 + (getVersionRequirementList().size() * 2) + extensionsSerializedSize() + this.unknownFields.size();
        this.memoizedSerializedSize = size;
        return size;
    }

    public int getSetterFlags() {
        return this.setterFlags_;
    }

    public ProtoBuf$ValueParameter getSetterValueParameter() {
        return this.setterValueParameter_;
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

    public List<Integer> getVersionRequirementList() {
        return this.versionRequirement_;
    }

    public boolean hasFlags() {
        if ((this.bitField0_ & 1) == 1) {
            return true;
        }
        return false;
    }

    public boolean hasGetterFlags() {
        if ((this.bitField0_ & 256) == 256) {
            return true;
        }
        return false;
    }

    public boolean hasName() {
        if ((this.bitField0_ & 4) == 4) {
            return true;
        }
        return false;
    }

    public boolean hasOldFlags() {
        if ((this.bitField0_ & 2) == 2) {
            return true;
        }
        return false;
    }

    public boolean hasReceiverType() {
        if ((this.bitField0_ & 32) == 32) {
            return true;
        }
        return false;
    }

    public boolean hasReceiverTypeId() {
        if ((this.bitField0_ & 64) == 64) {
            return true;
        }
        return false;
    }

    public boolean hasReturnType() {
        if ((this.bitField0_ & 8) == 8) {
            return true;
        }
        return false;
    }

    public boolean hasReturnTypeId() {
        if ((this.bitField0_ & 16) == 16) {
            return true;
        }
        return false;
    }

    public boolean hasSetterFlags() {
        if ((this.bitField0_ & RecyclerView.C1231a0.FLAG_ADAPTER_POSITION_UNKNOWN) == 512) {
            return true;
        }
        return false;
    }

    public boolean hasSetterValueParameter() {
        if ((this.bitField0_ & 128) == 128) {
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
        } else if (!hasReturnType() || getReturnType().isInitialized()) {
            for (int i = 0; i < getTypeParameterCount(); i++) {
                if (!getTypeParameter(i).isInitialized()) {
                    this.memoizedIsInitialized = 0;
                    return false;
                }
            }
            if (!hasReceiverType() || getReceiverType().isInitialized()) {
                for (int i2 = 0; i2 < getContextReceiverTypeCount(); i2++) {
                    if (!getContextReceiverType(i2).isInitialized()) {
                        this.memoizedIsInitialized = 0;
                        return false;
                    }
                }
                if (hasSetterValueParameter() && !getSetterValueParameter().isInitialized()) {
                    this.memoizedIsInitialized = 0;
                    return false;
                } else if (!extensionsAreInitialized()) {
                    this.memoizedIsInitialized = 0;
                    return false;
                } else {
                    this.memoizedIsInitialized = 1;
                    return true;
                }
            } else {
                this.memoizedIsInitialized = 0;
                return false;
            }
        } else {
            this.memoizedIsInitialized = 0;
            return false;
        }
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        getSerializedSize();
        GeneratedMessageLite.ExtendableMessage<MessageType>.C6784a newExtensionWriter = newExtensionWriter();
        if ((this.bitField0_ & 2) == 2) {
            codedOutputStream.mo54614a0(1, this.oldFlags_);
        }
        if ((this.bitField0_ & 4) == 4) {
            codedOutputStream.mo54614a0(2, this.name_);
        }
        if ((this.bitField0_ & 8) == 8) {
            codedOutputStream.mo54617d0(3, this.returnType_);
        }
        for (int i = 0; i < this.typeParameter_.size(); i++) {
            codedOutputStream.mo54617d0(4, this.typeParameter_.get(i));
        }
        if ((this.bitField0_ & 32) == 32) {
            codedOutputStream.mo54617d0(5, this.receiverType_);
        }
        if ((this.bitField0_ & 128) == 128) {
            codedOutputStream.mo54617d0(6, this.setterValueParameter_);
        }
        if ((this.bitField0_ & 256) == 256) {
            codedOutputStream.mo54614a0(7, this.getterFlags_);
        }
        if ((this.bitField0_ & RecyclerView.C1231a0.FLAG_ADAPTER_POSITION_UNKNOWN) == 512) {
            codedOutputStream.mo54614a0(8, this.setterFlags_);
        }
        if ((this.bitField0_ & 16) == 16) {
            codedOutputStream.mo54614a0(9, this.returnTypeId_);
        }
        if ((this.bitField0_ & 64) == 64) {
            codedOutputStream.mo54614a0(10, this.receiverTypeId_);
        }
        if ((this.bitField0_ & 1) == 1) {
            codedOutputStream.mo54614a0(11, this.flags_);
        }
        for (int i2 = 0; i2 < this.contextReceiverType_.size(); i2++) {
            codedOutputStream.mo54617d0(12, this.contextReceiverType_.get(i2));
        }
        if (getContextReceiverTypeIdList().size() > 0) {
            codedOutputStream.mo54628o0(106);
            codedOutputStream.mo54628o0(this.contextReceiverTypeIdMemoizedSerializedSize);
        }
        for (int i3 = 0; i3 < this.contextReceiverTypeId_.size(); i3++) {
            codedOutputStream.mo54615b0(this.contextReceiverTypeId_.get(i3).intValue());
        }
        for (int i4 = 0; i4 < this.versionRequirement_.size(); i4++) {
            codedOutputStream.mo54614a0(31, this.versionRequirement_.get(i4).intValue());
        }
        newExtensionWriter.mo54650a(19000, codedOutputStream);
        codedOutputStream.mo54622i0(this.unknownFields);
    }

    public static C7556b newBuilder(ProtoBuf$Property protoBuf$Property) {
        return newBuilder().mo53896g(protoBuf$Property);
    }

    public ProtoBuf$Property getDefaultInstanceForType() {
        return f39760a;
    }

    public C7556b newBuilderForType() {
        return newBuilder();
    }

    public C7556b toBuilder() {
        return newBuilder(this);
    }

    public ProtoBuf$Property(GeneratedMessageLite.C7602c<ProtoBuf$Property, ?> cVar) {
        super(cVar);
        this.contextReceiverTypeIdMemoizedSerializedSize = -1;
        this.memoizedIsInitialized = -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = cVar.mo54651f();
    }

    public ProtoBuf$Property(boolean z) {
        this.contextReceiverTypeIdMemoizedSerializedSize = -1;
        this.memoizedIsInitialized = -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = c70.f37074a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v1, resolved type: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type$b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v5, resolved type: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type$b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v7, resolved type: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$ValueParameter$b} */
    /* JADX WARNING: type inference failed for: r10v0 */
    /* JADX WARNING: type inference failed for: r10v25 */
    /* JADX WARNING: type inference failed for: r10v26 */
    /* JADX WARNING: type inference failed for: r10v27 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ProtoBuf$Property(kotlin.reflect.jvm.internal.impl.protobuf.C7614c r13, kotlin.reflect.jvm.internal.impl.protobuf.C7616d r14) throws kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException {
        /*
            r12 = this;
            r12.<init>()
            r0 = -1
            r12.contextReceiverTypeIdMemoizedSerializedSize = r0
            r12.memoizedIsInitialized = r0
            r12.memoizedSerializedSize = r0
            r12.mo54204c()
            c70$b r0 = p000.c70.m56312D()
            r1 = 1
            kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream r2 = kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.m61851J(r0, r1)
            r3 = 0
            r4 = r3
        L_0x0018:
            r5 = 256(0x100, float:3.59E-43)
            r6 = 8192(0x2000, float:1.14794E-41)
            r7 = 32
            r8 = 512(0x200, float:7.175E-43)
            if (r3 != 0) goto L_0x023d
            int r9 = r13.mo54700K()     // Catch:{ InvalidProtocolBufferException -> 0x01f1, IOException -> 0x01e2 }
            r10 = 0
            switch(r9) {
                case 0: goto L_0x01da;
                case 8: goto L_0x01cc;
                case 16: goto L_0x01be;
                case 26: goto L_0x0195;
                case 34: goto L_0x017b;
                case 42: goto L_0x0154;
                case 50: goto L_0x012b;
                case 56: goto L_0x011e;
                case 64: goto L_0x0111;
                case 72: goto L_0x0103;
                case 80: goto L_0x00f5;
                case 88: goto L_0x00e8;
                case 98: goto L_0x00ce;
                case 104: goto L_0x00b2;
                case 106: goto L_0x007e;
                case 248: goto L_0x0063;
                case 250: goto L_0x0030;
                default: goto L_0x002a;
            }     // Catch:{ InvalidProtocolBufferException -> 0x01f1, IOException -> 0x01e2 }
        L_0x002a:
            boolean r5 = r12.parseUnknownField(r13, r2, r14, r9)     // Catch:{ InvalidProtocolBufferException -> 0x01f1, IOException -> 0x01e2 }
            goto L_0x01dd
        L_0x0030:
            int r9 = r13.mo54691A()     // Catch:{ InvalidProtocolBufferException -> 0x01f1, IOException -> 0x01e2 }
            int r9 = r13.mo54715j(r9)     // Catch:{ InvalidProtocolBufferException -> 0x01f1, IOException -> 0x01e2 }
            r10 = r4 & 8192(0x2000, float:1.14794E-41)
            if (r10 == r6) goto L_0x004b
            int r10 = r13.mo54712e()     // Catch:{ InvalidProtocolBufferException -> 0x01f1, IOException -> 0x01e2 }
            if (r10 <= 0) goto L_0x004b
            java.util.ArrayList r10 = new java.util.ArrayList     // Catch:{ InvalidProtocolBufferException -> 0x01f1, IOException -> 0x01e2 }
            r10.<init>()     // Catch:{ InvalidProtocolBufferException -> 0x01f1, IOException -> 0x01e2 }
            r12.versionRequirement_ = r10     // Catch:{ InvalidProtocolBufferException -> 0x01f1, IOException -> 0x01e2 }
            r4 = r4 | 8192(0x2000, float:1.14794E-41)
        L_0x004b:
            int r10 = r13.mo54712e()     // Catch:{ InvalidProtocolBufferException -> 0x01f1, IOException -> 0x01e2 }
            if (r10 <= 0) goto L_0x005f
            java.util.List<java.lang.Integer> r10 = r12.versionRequirement_     // Catch:{ InvalidProtocolBufferException -> 0x01f1, IOException -> 0x01e2 }
            int r11 = r13.mo54724s()     // Catch:{ InvalidProtocolBufferException -> 0x01f1, IOException -> 0x01e2 }
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)     // Catch:{ InvalidProtocolBufferException -> 0x01f1, IOException -> 0x01e2 }
            r10.add(r11)     // Catch:{ InvalidProtocolBufferException -> 0x01f1, IOException -> 0x01e2 }
            goto L_0x004b
        L_0x005f:
            r13.mo54714i(r9)     // Catch:{ InvalidProtocolBufferException -> 0x01f1, IOException -> 0x01e2 }
            goto L_0x0018
        L_0x0063:
            r9 = r4 & 8192(0x2000, float:1.14794E-41)
            if (r9 == r6) goto L_0x0070
            java.util.ArrayList r9 = new java.util.ArrayList     // Catch:{ InvalidProtocolBufferException -> 0x01f1, IOException -> 0x01e2 }
            r9.<init>()     // Catch:{ InvalidProtocolBufferException -> 0x01f1, IOException -> 0x01e2 }
            r12.versionRequirement_ = r9     // Catch:{ InvalidProtocolBufferException -> 0x01f1, IOException -> 0x01e2 }
            r4 = r4 | 8192(0x2000, float:1.14794E-41)
        L_0x0070:
            java.util.List<java.lang.Integer> r9 = r12.versionRequirement_     // Catch:{ InvalidProtocolBufferException -> 0x01f1, IOException -> 0x01e2 }
            int r10 = r13.mo54724s()     // Catch:{ InvalidProtocolBufferException -> 0x01f1, IOException -> 0x01e2 }
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)     // Catch:{ InvalidProtocolBufferException -> 0x01f1, IOException -> 0x01e2 }
            r9.add(r10)     // Catch:{ InvalidProtocolBufferException -> 0x01f1, IOException -> 0x01e2 }
            goto L_0x0018
        L_0x007e:
            int r9 = r13.mo54691A()     // Catch:{ InvalidProtocolBufferException -> 0x01f1, IOException -> 0x01e2 }
            int r9 = r13.mo54715j(r9)     // Catch:{ InvalidProtocolBufferException -> 0x01f1, IOException -> 0x01e2 }
            r10 = r4 & 512(0x200, float:7.175E-43)
            if (r10 == r8) goto L_0x0099
            int r10 = r13.mo54712e()     // Catch:{ InvalidProtocolBufferException -> 0x01f1, IOException -> 0x01e2 }
            if (r10 <= 0) goto L_0x0099
            java.util.ArrayList r10 = new java.util.ArrayList     // Catch:{ InvalidProtocolBufferException -> 0x01f1, IOException -> 0x01e2 }
            r10.<init>()     // Catch:{ InvalidProtocolBufferException -> 0x01f1, IOException -> 0x01e2 }
            r12.contextReceiverTypeId_ = r10     // Catch:{ InvalidProtocolBufferException -> 0x01f1, IOException -> 0x01e2 }
            r4 = r4 | 512(0x200, float:7.175E-43)
        L_0x0099:
            int r10 = r13.mo54712e()     // Catch:{ InvalidProtocolBufferException -> 0x01f1, IOException -> 0x01e2 }
            if (r10 <= 0) goto L_0x00ad
            java.util.List<java.lang.Integer> r10 = r12.contextReceiverTypeId_     // Catch:{ InvalidProtocolBufferException -> 0x01f1, IOException -> 0x01e2 }
            int r11 = r13.mo54724s()     // Catch:{ InvalidProtocolBufferException -> 0x01f1, IOException -> 0x01e2 }
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)     // Catch:{ InvalidProtocolBufferException -> 0x01f1, IOException -> 0x01e2 }
            r10.add(r11)     // Catch:{ InvalidProtocolBufferException -> 0x01f1, IOException -> 0x01e2 }
            goto L_0x0099
        L_0x00ad:
            r13.mo54714i(r9)     // Catch:{ InvalidProtocolBufferException -> 0x01f1, IOException -> 0x01e2 }
            goto L_0x0018
        L_0x00b2:
            r9 = r4 & 512(0x200, float:7.175E-43)
            if (r9 == r8) goto L_0x00bf
            java.util.ArrayList r9 = new java.util.ArrayList     // Catch:{ InvalidProtocolBufferException -> 0x01f1, IOException -> 0x01e2 }
            r9.<init>()     // Catch:{ InvalidProtocolBufferException -> 0x01f1, IOException -> 0x01e2 }
            r12.contextReceiverTypeId_ = r9     // Catch:{ InvalidProtocolBufferException -> 0x01f1, IOException -> 0x01e2 }
            r4 = r4 | 512(0x200, float:7.175E-43)
        L_0x00bf:
            java.util.List<java.lang.Integer> r9 = r12.contextReceiverTypeId_     // Catch:{ InvalidProtocolBufferException -> 0x01f1, IOException -> 0x01e2 }
            int r10 = r13.mo54724s()     // Catch:{ InvalidProtocolBufferException -> 0x01f1, IOException -> 0x01e2 }
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)     // Catch:{ InvalidProtocolBufferException -> 0x01f1, IOException -> 0x01e2 }
            r9.add(r10)     // Catch:{ InvalidProtocolBufferException -> 0x01f1, IOException -> 0x01e2 }
            goto L_0x0018
        L_0x00ce:
            r9 = r4 & 256(0x100, float:3.59E-43)
            if (r9 == r5) goto L_0x00db
            java.util.ArrayList r9 = new java.util.ArrayList     // Catch:{ InvalidProtocolBufferException -> 0x01f1, IOException -> 0x01e2 }
            r9.<init>()     // Catch:{ InvalidProtocolBufferException -> 0x01f1, IOException -> 0x01e2 }
            r12.contextReceiverType_ = r9     // Catch:{ InvalidProtocolBufferException -> 0x01f1, IOException -> 0x01e2 }
            r4 = r4 | 256(0x100, float:3.59E-43)
        L_0x00db:
            java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type> r9 = r12.contextReceiverType_     // Catch:{ InvalidProtocolBufferException -> 0x01f1, IOException -> 0x01e2 }
            jm4<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type> r10 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type.PARSER     // Catch:{ InvalidProtocolBufferException -> 0x01f1, IOException -> 0x01e2 }
            kotlin.reflect.jvm.internal.impl.protobuf.h r10 = r13.mo54726u(r10, r14)     // Catch:{ InvalidProtocolBufferException -> 0x01f1, IOException -> 0x01e2 }
            r9.add(r10)     // Catch:{ InvalidProtocolBufferException -> 0x01f1, IOException -> 0x01e2 }
            goto L_0x0018
        L_0x00e8:
            int r9 = r12.bitField0_     // Catch:{ InvalidProtocolBufferException -> 0x01f1, IOException -> 0x01e2 }
            r9 = r9 | r1
            r12.bitField0_ = r9     // Catch:{ InvalidProtocolBufferException -> 0x01f1, IOException -> 0x01e2 }
            int r9 = r13.mo54724s()     // Catch:{ InvalidProtocolBufferException -> 0x01f1, IOException -> 0x01e2 }
            r12.flags_ = r9     // Catch:{ InvalidProtocolBufferException -> 0x01f1, IOException -> 0x01e2 }
            goto L_0x0018
        L_0x00f5:
            int r9 = r12.bitField0_     // Catch:{ InvalidProtocolBufferException -> 0x01f1, IOException -> 0x01e2 }
            r9 = r9 | 64
            r12.bitField0_ = r9     // Catch:{ InvalidProtocolBufferException -> 0x01f1, IOException -> 0x01e2 }
            int r9 = r13.mo54724s()     // Catch:{ InvalidProtocolBufferException -> 0x01f1, IOException -> 0x01e2 }
            r12.receiverTypeId_ = r9     // Catch:{ InvalidProtocolBufferException -> 0x01f1, IOException -> 0x01e2 }
            goto L_0x0018
        L_0x0103:
            int r9 = r12.bitField0_     // Catch:{ InvalidProtocolBufferException -> 0x01f1, IOException -> 0x01e2 }
            r9 = r9 | 16
            r12.bitField0_ = r9     // Catch:{ InvalidProtocolBufferException -> 0x01f1, IOException -> 0x01e2 }
            int r9 = r13.mo54724s()     // Catch:{ InvalidProtocolBufferException -> 0x01f1, IOException -> 0x01e2 }
            r12.returnTypeId_ = r9     // Catch:{ InvalidProtocolBufferException -> 0x01f1, IOException -> 0x01e2 }
            goto L_0x0018
        L_0x0111:
            int r9 = r12.bitField0_     // Catch:{ InvalidProtocolBufferException -> 0x01f1, IOException -> 0x01e2 }
            r9 = r9 | r8
            r12.bitField0_ = r9     // Catch:{ InvalidProtocolBufferException -> 0x01f1, IOException -> 0x01e2 }
            int r9 = r13.mo54724s()     // Catch:{ InvalidProtocolBufferException -> 0x01f1, IOException -> 0x01e2 }
            r12.setterFlags_ = r9     // Catch:{ InvalidProtocolBufferException -> 0x01f1, IOException -> 0x01e2 }
            goto L_0x0018
        L_0x011e:
            int r9 = r12.bitField0_     // Catch:{ InvalidProtocolBufferException -> 0x01f1, IOException -> 0x01e2 }
            r9 = r9 | r5
            r12.bitField0_ = r9     // Catch:{ InvalidProtocolBufferException -> 0x01f1, IOException -> 0x01e2 }
            int r9 = r13.mo54724s()     // Catch:{ InvalidProtocolBufferException -> 0x01f1, IOException -> 0x01e2 }
            r12.getterFlags_ = r9     // Catch:{ InvalidProtocolBufferException -> 0x01f1, IOException -> 0x01e2 }
            goto L_0x0018
        L_0x012b:
            int r9 = r12.bitField0_     // Catch:{ InvalidProtocolBufferException -> 0x01f1, IOException -> 0x01e2 }
            r11 = 128(0x80, float:1.794E-43)
            r9 = r9 & r11
            if (r9 != r11) goto L_0x0138
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$ValueParameter r9 = r12.setterValueParameter_     // Catch:{ InvalidProtocolBufferException -> 0x01f1, IOException -> 0x01e2 }
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$ValueParameter$b r10 = r9.toBuilder()     // Catch:{ InvalidProtocolBufferException -> 0x01f1, IOException -> 0x01e2 }
        L_0x0138:
            jm4<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$ValueParameter> r9 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$ValueParameter.PARSER     // Catch:{ InvalidProtocolBufferException -> 0x01f1, IOException -> 0x01e2 }
            kotlin.reflect.jvm.internal.impl.protobuf.h r9 = r13.mo54726u(r9, r14)     // Catch:{ InvalidProtocolBufferException -> 0x01f1, IOException -> 0x01e2 }
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$ValueParameter r9 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$ValueParameter) r9     // Catch:{ InvalidProtocolBufferException -> 0x01f1, IOException -> 0x01e2 }
            r12.setterValueParameter_ = r9     // Catch:{ InvalidProtocolBufferException -> 0x01f1, IOException -> 0x01e2 }
            if (r10 == 0) goto L_0x014d
            r10.mo53896g(r9)     // Catch:{ InvalidProtocolBufferException -> 0x01f1, IOException -> 0x01e2 }
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$ValueParameter r9 = r10.mo54460r()     // Catch:{ InvalidProtocolBufferException -> 0x01f1, IOException -> 0x01e2 }
            r12.setterValueParameter_ = r9     // Catch:{ InvalidProtocolBufferException -> 0x01f1, IOException -> 0x01e2 }
        L_0x014d:
            int r9 = r12.bitField0_     // Catch:{ InvalidProtocolBufferException -> 0x01f1, IOException -> 0x01e2 }
            r9 = r9 | r11
            r12.bitField0_ = r9     // Catch:{ InvalidProtocolBufferException -> 0x01f1, IOException -> 0x01e2 }
            goto L_0x0018
        L_0x0154:
            int r9 = r12.bitField0_     // Catch:{ InvalidProtocolBufferException -> 0x01f1, IOException -> 0x01e2 }
            r9 = r9 & r7
            if (r9 != r7) goto L_0x015f
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type r9 = r12.receiverType_     // Catch:{ InvalidProtocolBufferException -> 0x01f1, IOException -> 0x01e2 }
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type$b r10 = r9.toBuilder()     // Catch:{ InvalidProtocolBufferException -> 0x01f1, IOException -> 0x01e2 }
        L_0x015f:
            jm4<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type> r9 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type.PARSER     // Catch:{ InvalidProtocolBufferException -> 0x01f1, IOException -> 0x01e2 }
            kotlin.reflect.jvm.internal.impl.protobuf.h r9 = r13.mo54726u(r9, r14)     // Catch:{ InvalidProtocolBufferException -> 0x01f1, IOException -> 0x01e2 }
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type r9 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type) r9     // Catch:{ InvalidProtocolBufferException -> 0x01f1, IOException -> 0x01e2 }
            r12.receiverType_ = r9     // Catch:{ InvalidProtocolBufferException -> 0x01f1, IOException -> 0x01e2 }
            if (r10 == 0) goto L_0x0174
            r10.mo53896g(r9)     // Catch:{ InvalidProtocolBufferException -> 0x01f1, IOException -> 0x01e2 }
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type r9 = r10.mo54356r()     // Catch:{ InvalidProtocolBufferException -> 0x01f1, IOException -> 0x01e2 }
            r12.receiverType_ = r9     // Catch:{ InvalidProtocolBufferException -> 0x01f1, IOException -> 0x01e2 }
        L_0x0174:
            int r9 = r12.bitField0_     // Catch:{ InvalidProtocolBufferException -> 0x01f1, IOException -> 0x01e2 }
            r9 = r9 | r7
            r12.bitField0_ = r9     // Catch:{ InvalidProtocolBufferException -> 0x01f1, IOException -> 0x01e2 }
            goto L_0x0018
        L_0x017b:
            r9 = r4 & 32
            if (r9 == r7) goto L_0x0188
            java.util.ArrayList r9 = new java.util.ArrayList     // Catch:{ InvalidProtocolBufferException -> 0x01f1, IOException -> 0x01e2 }
            r9.<init>()     // Catch:{ InvalidProtocolBufferException -> 0x01f1, IOException -> 0x01e2 }
            r12.typeParameter_ = r9     // Catch:{ InvalidProtocolBufferException -> 0x01f1, IOException -> 0x01e2 }
            r4 = r4 | 32
        L_0x0188:
            java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeParameter> r9 = r12.typeParameter_     // Catch:{ InvalidProtocolBufferException -> 0x01f1, IOException -> 0x01e2 }
            jm4<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeParameter> r10 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeParameter.PARSER     // Catch:{ InvalidProtocolBufferException -> 0x01f1, IOException -> 0x01e2 }
            kotlin.reflect.jvm.internal.impl.protobuf.h r10 = r13.mo54726u(r10, r14)     // Catch:{ InvalidProtocolBufferException -> 0x01f1, IOException -> 0x01e2 }
            r9.add(r10)     // Catch:{ InvalidProtocolBufferException -> 0x01f1, IOException -> 0x01e2 }
            goto L_0x0018
        L_0x0195:
            int r9 = r12.bitField0_     // Catch:{ InvalidProtocolBufferException -> 0x01f1, IOException -> 0x01e2 }
            r11 = 8
            r9 = r9 & r11
            if (r9 != r11) goto L_0x01a2
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type r9 = r12.returnType_     // Catch:{ InvalidProtocolBufferException -> 0x01f1, IOException -> 0x01e2 }
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type$b r10 = r9.toBuilder()     // Catch:{ InvalidProtocolBufferException -> 0x01f1, IOException -> 0x01e2 }
        L_0x01a2:
            jm4<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type> r9 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type.PARSER     // Catch:{ InvalidProtocolBufferException -> 0x01f1, IOException -> 0x01e2 }
            kotlin.reflect.jvm.internal.impl.protobuf.h r9 = r13.mo54726u(r9, r14)     // Catch:{ InvalidProtocolBufferException -> 0x01f1, IOException -> 0x01e2 }
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type r9 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type) r9     // Catch:{ InvalidProtocolBufferException -> 0x01f1, IOException -> 0x01e2 }
            r12.returnType_ = r9     // Catch:{ InvalidProtocolBufferException -> 0x01f1, IOException -> 0x01e2 }
            if (r10 == 0) goto L_0x01b7
            r10.mo53896g(r9)     // Catch:{ InvalidProtocolBufferException -> 0x01f1, IOException -> 0x01e2 }
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type r9 = r10.mo54356r()     // Catch:{ InvalidProtocolBufferException -> 0x01f1, IOException -> 0x01e2 }
            r12.returnType_ = r9     // Catch:{ InvalidProtocolBufferException -> 0x01f1, IOException -> 0x01e2 }
        L_0x01b7:
            int r9 = r12.bitField0_     // Catch:{ InvalidProtocolBufferException -> 0x01f1, IOException -> 0x01e2 }
            r9 = r9 | r11
            r12.bitField0_ = r9     // Catch:{ InvalidProtocolBufferException -> 0x01f1, IOException -> 0x01e2 }
            goto L_0x0018
        L_0x01be:
            int r9 = r12.bitField0_     // Catch:{ InvalidProtocolBufferException -> 0x01f1, IOException -> 0x01e2 }
            r9 = r9 | 4
            r12.bitField0_ = r9     // Catch:{ InvalidProtocolBufferException -> 0x01f1, IOException -> 0x01e2 }
            int r9 = r13.mo54724s()     // Catch:{ InvalidProtocolBufferException -> 0x01f1, IOException -> 0x01e2 }
            r12.name_ = r9     // Catch:{ InvalidProtocolBufferException -> 0x01f1, IOException -> 0x01e2 }
            goto L_0x0018
        L_0x01cc:
            int r9 = r12.bitField0_     // Catch:{ InvalidProtocolBufferException -> 0x01f1, IOException -> 0x01e2 }
            r9 = r9 | 2
            r12.bitField0_ = r9     // Catch:{ InvalidProtocolBufferException -> 0x01f1, IOException -> 0x01e2 }
            int r9 = r13.mo54724s()     // Catch:{ InvalidProtocolBufferException -> 0x01f1, IOException -> 0x01e2 }
            r12.oldFlags_ = r9     // Catch:{ InvalidProtocolBufferException -> 0x01f1, IOException -> 0x01e2 }
            goto L_0x0018
        L_0x01da:
            r3 = r1
            goto L_0x0018
        L_0x01dd:
            if (r5 != 0) goto L_0x0018
            goto L_0x01da
        L_0x01e0:
            r13 = move-exception
            goto L_0x01f7
        L_0x01e2:
            r13 = move-exception
            kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException r14 = new kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException     // Catch:{ all -> 0x01e0 }
            java.lang.String r13 = r13.getMessage()     // Catch:{ all -> 0x01e0 }
            r14.<init>(r13)     // Catch:{ all -> 0x01e0 }
            kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException r13 = r14.setUnfinishedMessage(r12)     // Catch:{ all -> 0x01e0 }
            throw r13     // Catch:{ all -> 0x01e0 }
        L_0x01f1:
            r13 = move-exception
            kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException r13 = r13.setUnfinishedMessage(r12)     // Catch:{ all -> 0x01e0 }
            throw r13     // Catch:{ all -> 0x01e0 }
        L_0x01f7:
            r14 = r4 & 32
            if (r14 != r7) goto L_0x0203
            java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeParameter> r14 = r12.typeParameter_
            java.util.List r14 = java.util.Collections.unmodifiableList(r14)
            r12.typeParameter_ = r14
        L_0x0203:
            r14 = r4 & 256(0x100, float:3.59E-43)
            if (r14 != r5) goto L_0x020f
            java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type> r14 = r12.contextReceiverType_
            java.util.List r14 = java.util.Collections.unmodifiableList(r14)
            r12.contextReceiverType_ = r14
        L_0x020f:
            r14 = r4 & 512(0x200, float:7.175E-43)
            if (r14 != r8) goto L_0x021b
            java.util.List<java.lang.Integer> r14 = r12.contextReceiverTypeId_
            java.util.List r14 = java.util.Collections.unmodifiableList(r14)
            r12.contextReceiverTypeId_ = r14
        L_0x021b:
            r14 = r4 & 8192(0x2000, float:1.14794E-41)
            if (r14 != r6) goto L_0x0227
            java.util.List<java.lang.Integer> r14 = r12.versionRequirement_
            java.util.List r14 = java.util.Collections.unmodifiableList(r14)
            r12.versionRequirement_ = r14
        L_0x0227:
            r2.mo54597I()     // Catch:{ IOException -> 0x022a, all -> 0x0231 }
        L_0x022a:
            c70 r14 = r0.mo50838d()
            r12.unknownFields = r14
            goto L_0x0239
        L_0x0231:
            r13 = move-exception
            c70 r14 = r0.mo50838d()
            r12.unknownFields = r14
            throw r13
        L_0x0239:
            r12.makeExtensionsImmutable()
            throw r13
        L_0x023d:
            r13 = r4 & 32
            if (r13 != r7) goto L_0x0249
            java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeParameter> r13 = r12.typeParameter_
            java.util.List r13 = java.util.Collections.unmodifiableList(r13)
            r12.typeParameter_ = r13
        L_0x0249:
            r13 = r4 & 256(0x100, float:3.59E-43)
            if (r13 != r5) goto L_0x0255
            java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type> r13 = r12.contextReceiverType_
            java.util.List r13 = java.util.Collections.unmodifiableList(r13)
            r12.contextReceiverType_ = r13
        L_0x0255:
            r13 = r4 & 512(0x200, float:7.175E-43)
            if (r13 != r8) goto L_0x0261
            java.util.List<java.lang.Integer> r13 = r12.contextReceiverTypeId_
            java.util.List r13 = java.util.Collections.unmodifiableList(r13)
            r12.contextReceiverTypeId_ = r13
        L_0x0261:
            r13 = r4 & 8192(0x2000, float:1.14794E-41)
            if (r13 != r6) goto L_0x026d
            java.util.List<java.lang.Integer> r13 = r12.versionRequirement_
            java.util.List r13 = java.util.Collections.unmodifiableList(r13)
            r12.versionRequirement_ = r13
        L_0x026d:
            r2.mo54597I()     // Catch:{ IOException -> 0x0270, all -> 0x0277 }
        L_0x0270:
            c70 r13 = r0.mo50838d()
            r12.unknownFields = r13
            goto L_0x027f
        L_0x0277:
            r13 = move-exception
            c70 r14 = r0.mo50838d()
            r12.unknownFields = r14
            throw r13
        L_0x027f:
            r12.makeExtensionsImmutable()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Property.<init>(kotlin.reflect.jvm.internal.impl.protobuf.c, kotlin.reflect.jvm.internal.impl.protobuf.d):void");
    }
}
