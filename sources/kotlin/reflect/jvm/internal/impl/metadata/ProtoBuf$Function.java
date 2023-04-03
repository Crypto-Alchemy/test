package kotlin.reflect.jvm.internal.impl.metadata;

import androidx.recyclerview.widget.RecyclerView;
import java.io.IOException;
import java.io.InputStream;
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

public final class ProtoBuf$Function extends GeneratedMessageLite.ExtendableMessage<ProtoBuf$Function> {
    public static jm4<ProtoBuf$Function> PARSER = new C7547a();

    /* renamed from: a */
    public static final ProtoBuf$Function f39727a;
    /* access modifiers changed from: private */
    public int bitField0_;
    private int contextReceiverTypeIdMemoizedSerializedSize;
    /* access modifiers changed from: private */
    public List<Integer> contextReceiverTypeId_;
    /* access modifiers changed from: private */
    public List<ProtoBuf$Type> contextReceiverType_;
    /* access modifiers changed from: private */
    public ProtoBuf$Contract contract_;
    /* access modifiers changed from: private */
    public int flags_;
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
    public List<ProtoBuf$TypeParameter> typeParameter_;
    /* access modifiers changed from: private */
    public ProtoBuf$TypeTable typeTable_;
    /* access modifiers changed from: private */
    public final c70 unknownFields;
    /* access modifiers changed from: private */
    public List<ProtoBuf$ValueParameter> valueParameter_;
    /* access modifiers changed from: private */
    public List<Integer> versionRequirement_;

    /* renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Function$a */
    public static class C7547a extends C7613b<ProtoBuf$Function> {
        /* renamed from: m */
        public ProtoBuf$Function mo52753c(C7614c cVar, C7616d dVar) throws InvalidProtocolBufferException {
            return new ProtoBuf$Function(cVar, dVar);
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Function$b */
    public static final class C7548b extends GeneratedMessageLite.C7602c<ProtoBuf$Function, C7548b> {

        /* renamed from: A */
        public List<ProtoBuf$TypeParameter> f39728A = Collections.emptyList();

        /* renamed from: B */
        public ProtoBuf$Type f39729B = ProtoBuf$Type.getDefaultInstance();

        /* renamed from: C */
        public int f39730C;

        /* renamed from: H */
        public List<ProtoBuf$Type> f39731H = Collections.emptyList();

        /* renamed from: I */
        public List<Integer> f39732I = Collections.emptyList();

        /* renamed from: L */
        public List<ProtoBuf$ValueParameter> f39733L = Collections.emptyList();

        /* renamed from: M */
        public ProtoBuf$TypeTable f39734M = ProtoBuf$TypeTable.getDefaultInstance();

        /* renamed from: P */
        public List<Integer> f39735P = Collections.emptyList();

        /* renamed from: Q */
        public ProtoBuf$Contract f39736Q = ProtoBuf$Contract.getDefaultInstance();

        /* renamed from: g */
        public int f39737g;

        /* renamed from: k */
        public int f39738k = 6;

        /* renamed from: r */
        public int f39739r = 6;

        /* renamed from: s */
        public int f39740s;

        /* renamed from: x */
        public ProtoBuf$Type f39741x = ProtoBuf$Type.getDefaultInstance();

        /* renamed from: y */
        public int f39742y;

        public C7548b() {
            mo54135B();
        }

        /* renamed from: u */
        public static C7548b m61424u() {
            return new C7548b();
        }

        /* renamed from: B */
        public final void mo54135B() {
        }

        /* renamed from: C */
        public C7548b mo54136C(ProtoBuf$Contract protoBuf$Contract) {
            if ((this.f39737g & 8192) != 8192 || this.f39736Q == ProtoBuf$Contract.getDefaultInstance()) {
                this.f39736Q = protoBuf$Contract;
            } else {
                this.f39736Q = ProtoBuf$Contract.newBuilder(this.f39736Q).mo53896g(protoBuf$Contract).mo54035l();
            }
            this.f39737g |= 8192;
            return this;
        }

        /* renamed from: D */
        public C7548b mo53896g(ProtoBuf$Function protoBuf$Function) {
            if (protoBuf$Function == ProtoBuf$Function.getDefaultInstance()) {
                return this;
            }
            if (protoBuf$Function.hasFlags()) {
                mo54142I(protoBuf$Function.getFlags());
            }
            if (protoBuf$Function.hasOldFlags()) {
                mo54144K(protoBuf$Function.getOldFlags());
            }
            if (protoBuf$Function.hasName()) {
                mo54143J(protoBuf$Function.getName());
            }
            if (protoBuf$Function.hasReturnType()) {
                mo54140G(protoBuf$Function.getReturnType());
            }
            if (protoBuf$Function.hasReturnTypeId()) {
                mo54146M(protoBuf$Function.getReturnTypeId());
            }
            if (!protoBuf$Function.typeParameter_.isEmpty()) {
                if (this.f39728A.isEmpty()) {
                    this.f39728A = protoBuf$Function.typeParameter_;
                    this.f39737g &= -33;
                } else {
                    mo54152x();
                    this.f39728A.addAll(protoBuf$Function.typeParameter_);
                }
            }
            if (protoBuf$Function.hasReceiverType()) {
                mo54139F(protoBuf$Function.getReceiverType());
            }
            if (protoBuf$Function.hasReceiverTypeId()) {
                mo54145L(protoBuf$Function.getReceiverTypeId());
            }
            if (!protoBuf$Function.contextReceiverType_.isEmpty()) {
                if (this.f39731H.isEmpty()) {
                    this.f39731H = protoBuf$Function.contextReceiverType_;
                    this.f39737g &= -257;
                } else {
                    mo54151w();
                    this.f39731H.addAll(protoBuf$Function.contextReceiverType_);
                }
            }
            if (!protoBuf$Function.contextReceiverTypeId_.isEmpty()) {
                if (this.f39732I.isEmpty()) {
                    this.f39732I = protoBuf$Function.contextReceiverTypeId_;
                    this.f39737g &= -513;
                } else {
                    mo54150v();
                    this.f39732I.addAll(protoBuf$Function.contextReceiverTypeId_);
                }
            }
            if (!protoBuf$Function.valueParameter_.isEmpty()) {
                if (this.f39733L.isEmpty()) {
                    this.f39733L = protoBuf$Function.valueParameter_;
                    this.f39737g &= -1025;
                } else {
                    mo54153y();
                    this.f39733L.addAll(protoBuf$Function.valueParameter_);
                }
            }
            if (protoBuf$Function.hasTypeTable()) {
                mo54141H(protoBuf$Function.getTypeTable());
            }
            if (!protoBuf$Function.versionRequirement_.isEmpty()) {
                if (this.f39735P.isEmpty()) {
                    this.f39735P = protoBuf$Function.versionRequirement_;
                    this.f39737g &= -4097;
                } else {
                    mo54154z();
                    this.f39735P.addAll(protoBuf$Function.versionRequirement_);
                }
            }
            if (protoBuf$Function.hasContract()) {
                mo54136C(protoBuf$Function.getContract());
            }
            mo54655m(protoBuf$Function);
            mo54652h(mo54651f().mo50826j(protoBuf$Function.unknownFields));
            return this;
        }

        /* renamed from: E */
        public C7548b mo53900n(C7614c cVar, C7616d dVar) throws IOException {
            ProtoBuf$Function protoBuf$Function;
            ProtoBuf$Function protoBuf$Function2 = null;
            try {
                ProtoBuf$Function c = ProtoBuf$Function.PARSER.mo52753c(cVar, dVar);
                if (c != null) {
                    mo53896g(c);
                }
                return this;
            } catch (InvalidProtocolBufferException e) {
                protoBuf$Function = (ProtoBuf$Function) e.getUnfinishedMessage();
                throw e;
            } catch (Throwable th) {
                th = th;
                protoBuf$Function2 = protoBuf$Function;
            }
            if (protoBuf$Function2 != null) {
                mo53896g(protoBuf$Function2);
            }
            throw th;
        }

        /* renamed from: F */
        public C7548b mo54139F(ProtoBuf$Type protoBuf$Type) {
            if ((this.f39737g & 64) != 64 || this.f39729B == ProtoBuf$Type.getDefaultInstance()) {
                this.f39729B = protoBuf$Type;
            } else {
                this.f39729B = ProtoBuf$Type.newBuilder(this.f39729B).mo53896g(protoBuf$Type).mo54356r();
            }
            this.f39737g |= 64;
            return this;
        }

        /* renamed from: G */
        public C7548b mo54140G(ProtoBuf$Type protoBuf$Type) {
            if ((this.f39737g & 8) != 8 || this.f39741x == ProtoBuf$Type.getDefaultInstance()) {
                this.f39741x = protoBuf$Type;
            } else {
                this.f39741x = ProtoBuf$Type.newBuilder(this.f39741x).mo53896g(protoBuf$Type).mo54356r();
            }
            this.f39737g |= 8;
            return this;
        }

        /* renamed from: H */
        public C7548b mo54141H(ProtoBuf$TypeTable protoBuf$TypeTable) {
            if ((this.f39737g & 2048) != 2048 || this.f39734M == ProtoBuf$TypeTable.getDefaultInstance()) {
                this.f39734M = protoBuf$TypeTable;
            } else {
                this.f39734M = ProtoBuf$TypeTable.newBuilder(this.f39734M).mo53896g(protoBuf$TypeTable).mo54434l();
            }
            this.f39737g |= 2048;
            return this;
        }

        /* renamed from: I */
        public C7548b mo54142I(int i) {
            this.f39737g |= 1;
            this.f39738k = i;
            return this;
        }

        /* renamed from: J */
        public C7548b mo54143J(int i) {
            this.f39737g |= 4;
            this.f39740s = i;
            return this;
        }

        /* renamed from: K */
        public C7548b mo54144K(int i) {
            this.f39737g |= 2;
            this.f39739r = i;
            return this;
        }

        /* renamed from: L */
        public C7548b mo54145L(int i) {
            this.f39737g |= 128;
            this.f39730C = i;
            return this;
        }

        /* renamed from: M */
        public C7548b mo54146M(int i) {
            this.f39737g |= 16;
            this.f39742y = i;
            return this;
        }

        /* renamed from: p */
        public ProtoBuf$Function build() {
            ProtoBuf$Function r = mo54148r();
            if (r.isInitialized()) {
                return r;
            }
            throw C7610a.C7611a.m61947b(r);
        }

        /* renamed from: r */
        public ProtoBuf$Function mo54148r() {
            ProtoBuf$Function protoBuf$Function = new ProtoBuf$Function((GeneratedMessageLite.C7602c) this);
            int i = this.f39737g;
            int i2 = 1;
            if ((i & 1) != 1) {
                i2 = 0;
            }
            int unused = protoBuf$Function.flags_ = this.f39738k;
            if ((i & 2) == 2) {
                i2 |= 2;
            }
            int unused2 = protoBuf$Function.oldFlags_ = this.f39739r;
            if ((i & 4) == 4) {
                i2 |= 4;
            }
            int unused3 = protoBuf$Function.name_ = this.f39740s;
            if ((i & 8) == 8) {
                i2 |= 8;
            }
            ProtoBuf$Type unused4 = protoBuf$Function.returnType_ = this.f39741x;
            if ((i & 16) == 16) {
                i2 |= 16;
            }
            int unused5 = protoBuf$Function.returnTypeId_ = this.f39742y;
            if ((this.f39737g & 32) == 32) {
                this.f39728A = Collections.unmodifiableList(this.f39728A);
                this.f39737g &= -33;
            }
            List unused6 = protoBuf$Function.typeParameter_ = this.f39728A;
            if ((i & 64) == 64) {
                i2 |= 32;
            }
            ProtoBuf$Type unused7 = protoBuf$Function.receiverType_ = this.f39729B;
            if ((i & 128) == 128) {
                i2 |= 64;
            }
            int unused8 = protoBuf$Function.receiverTypeId_ = this.f39730C;
            if ((this.f39737g & 256) == 256) {
                this.f39731H = Collections.unmodifiableList(this.f39731H);
                this.f39737g &= -257;
            }
            List unused9 = protoBuf$Function.contextReceiverType_ = this.f39731H;
            if ((this.f39737g & RecyclerView.C1231a0.FLAG_ADAPTER_POSITION_UNKNOWN) == 512) {
                this.f39732I = Collections.unmodifiableList(this.f39732I);
                this.f39737g &= -513;
            }
            List unused10 = protoBuf$Function.contextReceiverTypeId_ = this.f39732I;
            if ((this.f39737g & RecyclerView.C1231a0.FLAG_ADAPTER_FULLUPDATE) == 1024) {
                this.f39733L = Collections.unmodifiableList(this.f39733L);
                this.f39737g &= -1025;
            }
            List unused11 = protoBuf$Function.valueParameter_ = this.f39733L;
            if ((i & 2048) == 2048) {
                i2 |= 128;
            }
            ProtoBuf$TypeTable unused12 = protoBuf$Function.typeTable_ = this.f39734M;
            if ((this.f39737g & 4096) == 4096) {
                this.f39735P = Collections.unmodifiableList(this.f39735P);
                this.f39737g &= -4097;
            }
            List unused13 = protoBuf$Function.versionRequirement_ = this.f39735P;
            if ((i & 8192) == 8192) {
                i2 |= 256;
            }
            ProtoBuf$Contract unused14 = protoBuf$Function.contract_ = this.f39736Q;
            int unused15 = protoBuf$Function.bitField0_ = i2;
            return protoBuf$Function;
        }

        /* renamed from: t */
        public C7548b mo53895d() {
            return m61424u().mo53896g(mo54148r());
        }

        /* renamed from: v */
        public final void mo54150v() {
            if ((this.f39737g & RecyclerView.C1231a0.FLAG_ADAPTER_POSITION_UNKNOWN) != 512) {
                this.f39732I = new ArrayList(this.f39732I);
                this.f39737g |= RecyclerView.C1231a0.FLAG_ADAPTER_POSITION_UNKNOWN;
            }
        }

        /* renamed from: w */
        public final void mo54151w() {
            if ((this.f39737g & 256) != 256) {
                this.f39731H = new ArrayList(this.f39731H);
                this.f39737g |= 256;
            }
        }

        /* renamed from: x */
        public final void mo54152x() {
            if ((this.f39737g & 32) != 32) {
                this.f39728A = new ArrayList(this.f39728A);
                this.f39737g |= 32;
            }
        }

        /* renamed from: y */
        public final void mo54153y() {
            if ((this.f39737g & RecyclerView.C1231a0.FLAG_ADAPTER_FULLUPDATE) != 1024) {
                this.f39733L = new ArrayList(this.f39733L);
                this.f39737g |= RecyclerView.C1231a0.FLAG_ADAPTER_FULLUPDATE;
            }
        }

        /* renamed from: z */
        public final void mo54154z() {
            if ((this.f39737g & 4096) != 4096) {
                this.f39735P = new ArrayList(this.f39735P);
                this.f39737g |= 4096;
            }
        }
    }

    static {
        ProtoBuf$Function protoBuf$Function = new ProtoBuf$Function(true);
        f39727a = protoBuf$Function;
        protoBuf$Function.mo54104c();
    }

    public static ProtoBuf$Function getDefaultInstance() {
        return f39727a;
    }

    public static C7548b newBuilder() {
        return C7548b.m61424u();
    }

    public static ProtoBuf$Function parseFrom(InputStream inputStream, C7616d dVar) throws IOException {
        return PARSER.mo52751a(inputStream, dVar);
    }

    /* renamed from: c */
    public final void mo54104c() {
        this.flags_ = 6;
        this.oldFlags_ = 6;
        this.name_ = 0;
        this.returnType_ = ProtoBuf$Type.getDefaultInstance();
        this.returnTypeId_ = 0;
        this.typeParameter_ = Collections.emptyList();
        this.receiverType_ = ProtoBuf$Type.getDefaultInstance();
        this.receiverTypeId_ = 0;
        this.contextReceiverType_ = Collections.emptyList();
        this.contextReceiverTypeId_ = Collections.emptyList();
        this.valueParameter_ = Collections.emptyList();
        this.typeTable_ = ProtoBuf$TypeTable.getDefaultInstance();
        this.versionRequirement_ = Collections.emptyList();
        this.contract_ = ProtoBuf$Contract.getDefaultInstance();
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

    public ProtoBuf$Contract getContract() {
        return this.contract_;
    }

    public int getFlags() {
        return this.flags_;
    }

    public int getName() {
        return this.name_;
    }

    public int getOldFlags() {
        return this.oldFlags_;
    }

    public jm4<ProtoBuf$Function> getParserForType() {
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
        for (int i4 = 0; i4 < this.valueParameter_.size(); i4++) {
            i += CodedOutputStream.m61870s(6, this.valueParameter_.get(i4));
        }
        if ((this.bitField0_ & 16) == 16) {
            i += CodedOutputStream.m61866o(7, this.returnTypeId_);
        }
        if ((this.bitField0_ & 64) == 64) {
            i += CodedOutputStream.m61866o(8, this.receiverTypeId_);
        }
        if ((this.bitField0_ & 1) == 1) {
            i += CodedOutputStream.m61866o(9, this.flags_);
        }
        for (int i5 = 0; i5 < this.contextReceiverType_.size(); i5++) {
            i += CodedOutputStream.m61870s(10, this.contextReceiverType_.get(i5));
        }
        int i6 = 0;
        for (int i7 = 0; i7 < this.contextReceiverTypeId_.size(); i7++) {
            i6 += CodedOutputStream.m61867p(this.contextReceiverTypeId_.get(i7).intValue());
        }
        int i8 = i + i6;
        if (!getContextReceiverTypeIdList().isEmpty()) {
            i8 = i8 + 1 + CodedOutputStream.m61867p(i6);
        }
        this.contextReceiverTypeIdMemoizedSerializedSize = i6;
        if ((this.bitField0_ & 128) == 128) {
            i8 += CodedOutputStream.m61870s(30, this.typeTable_);
        }
        int i9 = 0;
        for (int i10 = 0; i10 < this.versionRequirement_.size(); i10++) {
            i9 += CodedOutputStream.m61867p(this.versionRequirement_.get(i10).intValue());
        }
        int size = i8 + i9 + (getVersionRequirementList().size() * 2);
        if ((this.bitField0_ & 256) == 256) {
            size += CodedOutputStream.m61870s(32, this.contract_);
        }
        int extensionsSerializedSize = size + extensionsSerializedSize() + this.unknownFields.size();
        this.memoizedSerializedSize = extensionsSerializedSize;
        return extensionsSerializedSize;
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

    public ProtoBuf$TypeTable getTypeTable() {
        return this.typeTable_;
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

    public boolean hasContract() {
        if ((this.bitField0_ & 256) == 256) {
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

    public boolean hasTypeTable() {
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
                for (int i3 = 0; i3 < getValueParameterCount(); i3++) {
                    if (!getValueParameter(i3).isInitialized()) {
                        this.memoizedIsInitialized = 0;
                        return false;
                    }
                }
                if (hasTypeTable() && !getTypeTable().isInitialized()) {
                    this.memoizedIsInitialized = 0;
                    return false;
                } else if (hasContract() && !getContract().isInitialized()) {
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
        for (int i2 = 0; i2 < this.valueParameter_.size(); i2++) {
            codedOutputStream.mo54617d0(6, this.valueParameter_.get(i2));
        }
        if ((this.bitField0_ & 16) == 16) {
            codedOutputStream.mo54614a0(7, this.returnTypeId_);
        }
        if ((this.bitField0_ & 64) == 64) {
            codedOutputStream.mo54614a0(8, this.receiverTypeId_);
        }
        if ((this.bitField0_ & 1) == 1) {
            codedOutputStream.mo54614a0(9, this.flags_);
        }
        for (int i3 = 0; i3 < this.contextReceiverType_.size(); i3++) {
            codedOutputStream.mo54617d0(10, this.contextReceiverType_.get(i3));
        }
        if (getContextReceiverTypeIdList().size() > 0) {
            codedOutputStream.mo54628o0(90);
            codedOutputStream.mo54628o0(this.contextReceiverTypeIdMemoizedSerializedSize);
        }
        for (int i4 = 0; i4 < this.contextReceiverTypeId_.size(); i4++) {
            codedOutputStream.mo54615b0(this.contextReceiverTypeId_.get(i4).intValue());
        }
        if ((this.bitField0_ & 128) == 128) {
            codedOutputStream.mo54617d0(30, this.typeTable_);
        }
        for (int i5 = 0; i5 < this.versionRequirement_.size(); i5++) {
            codedOutputStream.mo54614a0(31, this.versionRequirement_.get(i5).intValue());
        }
        if ((this.bitField0_ & 256) == 256) {
            codedOutputStream.mo54617d0(32, this.contract_);
        }
        newExtensionWriter.mo54650a(19000, codedOutputStream);
        codedOutputStream.mo54622i0(this.unknownFields);
    }

    public static C7548b newBuilder(ProtoBuf$Function protoBuf$Function) {
        return newBuilder().mo53896g(protoBuf$Function);
    }

    public ProtoBuf$Function getDefaultInstanceForType() {
        return f39727a;
    }

    public C7548b newBuilderForType() {
        return newBuilder();
    }

    public C7548b toBuilder() {
        return newBuilder(this);
    }

    public ProtoBuf$Function(GeneratedMessageLite.C7602c<ProtoBuf$Function, ?> cVar) {
        super(cVar);
        this.contextReceiverTypeIdMemoizedSerializedSize = -1;
        this.memoizedIsInitialized = -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = cVar.mo54651f();
    }

    public ProtoBuf$Function(boolean z) {
        this.contextReceiverTypeIdMemoizedSerializedSize = -1;
        this.memoizedIsInitialized = -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = c70.f37074a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v1, resolved type: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type$b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v5, resolved type: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type$b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v18, resolved type: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeTable$b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v27, resolved type: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Contract$b} */
    /* JADX WARNING: type inference failed for: r11v0 */
    /* JADX WARNING: type inference failed for: r11v29 */
    /* JADX WARNING: type inference failed for: r11v30 */
    /* JADX WARNING: type inference failed for: r11v31 */
    /* JADX WARNING: type inference failed for: r11v32 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ProtoBuf$Function(kotlin.reflect.jvm.internal.impl.protobuf.C7614c r14, kotlin.reflect.jvm.internal.impl.protobuf.C7616d r15) throws kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException {
        /*
            r13 = this;
            r13.<init>()
            r0 = -1
            r13.contextReceiverTypeIdMemoizedSerializedSize = r0
            r13.memoizedIsInitialized = r0
            r13.memoizedSerializedSize = r0
            r13.mo54104c()
            c70$b r0 = p000.c70.m56312D()
            r1 = 1
            kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream r2 = kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.m61851J(r0, r1)
            r3 = 0
            r4 = r3
        L_0x0018:
            r5 = 1024(0x400, float:1.435E-42)
            r6 = 4096(0x1000, float:5.74E-42)
            r7 = 512(0x200, float:7.175E-43)
            r8 = 256(0x100, float:3.59E-43)
            r9 = 32
            if (r3 != 0) goto L_0x0272
            int r10 = r14.mo54700K()     // Catch:{ InvalidProtocolBufferException -> 0x021a, IOException -> 0x020b }
            r11 = 0
            switch(r10) {
                case 0: goto L_0x0203;
                case 8: goto L_0x01f5;
                case 16: goto L_0x01e7;
                case 26: goto L_0x01be;
                case 34: goto L_0x01a4;
                case 42: goto L_0x017d;
                case 50: goto L_0x0163;
                case 56: goto L_0x0155;
                case 64: goto L_0x0147;
                case 72: goto L_0x013a;
                case 82: goto L_0x0120;
                case 88: goto L_0x0104;
                case 90: goto L_0x00d0;
                case 242: goto L_0x00a7;
                case 248: goto L_0x008b;
                case 250: goto L_0x0058;
                case 258: goto L_0x0032;
                default: goto L_0x002c;
            }     // Catch:{ InvalidProtocolBufferException -> 0x021a, IOException -> 0x020b }
        L_0x002c:
            boolean r5 = r13.parseUnknownField(r14, r2, r15, r10)     // Catch:{ InvalidProtocolBufferException -> 0x021a, IOException -> 0x020b }
            goto L_0x0206
        L_0x0032:
            int r10 = r13.bitField0_     // Catch:{ InvalidProtocolBufferException -> 0x021a, IOException -> 0x020b }
            r10 = r10 & r8
            if (r10 != r8) goto L_0x003d
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Contract r10 = r13.contract_     // Catch:{ InvalidProtocolBufferException -> 0x021a, IOException -> 0x020b }
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Contract$b r11 = r10.toBuilder()     // Catch:{ InvalidProtocolBufferException -> 0x021a, IOException -> 0x020b }
        L_0x003d:
            jm4<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Contract> r10 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Contract.PARSER     // Catch:{ InvalidProtocolBufferException -> 0x021a, IOException -> 0x020b }
            kotlin.reflect.jvm.internal.impl.protobuf.h r10 = r14.mo54726u(r10, r15)     // Catch:{ InvalidProtocolBufferException -> 0x021a, IOException -> 0x020b }
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Contract r10 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Contract) r10     // Catch:{ InvalidProtocolBufferException -> 0x021a, IOException -> 0x020b }
            r13.contract_ = r10     // Catch:{ InvalidProtocolBufferException -> 0x021a, IOException -> 0x020b }
            if (r11 == 0) goto L_0x0052
            r11.mo53896g(r10)     // Catch:{ InvalidProtocolBufferException -> 0x021a, IOException -> 0x020b }
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Contract r10 = r11.mo54035l()     // Catch:{ InvalidProtocolBufferException -> 0x021a, IOException -> 0x020b }
            r13.contract_ = r10     // Catch:{ InvalidProtocolBufferException -> 0x021a, IOException -> 0x020b }
        L_0x0052:
            int r10 = r13.bitField0_     // Catch:{ InvalidProtocolBufferException -> 0x021a, IOException -> 0x020b }
            r10 = r10 | r8
            r13.bitField0_ = r10     // Catch:{ InvalidProtocolBufferException -> 0x021a, IOException -> 0x020b }
            goto L_0x0018
        L_0x0058:
            int r10 = r14.mo54691A()     // Catch:{ InvalidProtocolBufferException -> 0x021a, IOException -> 0x020b }
            int r10 = r14.mo54715j(r10)     // Catch:{ InvalidProtocolBufferException -> 0x021a, IOException -> 0x020b }
            r11 = r4 & 4096(0x1000, float:5.74E-42)
            if (r11 == r6) goto L_0x0073
            int r11 = r14.mo54712e()     // Catch:{ InvalidProtocolBufferException -> 0x021a, IOException -> 0x020b }
            if (r11 <= 0) goto L_0x0073
            java.util.ArrayList r11 = new java.util.ArrayList     // Catch:{ InvalidProtocolBufferException -> 0x021a, IOException -> 0x020b }
            r11.<init>()     // Catch:{ InvalidProtocolBufferException -> 0x021a, IOException -> 0x020b }
            r13.versionRequirement_ = r11     // Catch:{ InvalidProtocolBufferException -> 0x021a, IOException -> 0x020b }
            r4 = r4 | 4096(0x1000, float:5.74E-42)
        L_0x0073:
            int r11 = r14.mo54712e()     // Catch:{ InvalidProtocolBufferException -> 0x021a, IOException -> 0x020b }
            if (r11 <= 0) goto L_0x0087
            java.util.List<java.lang.Integer> r11 = r13.versionRequirement_     // Catch:{ InvalidProtocolBufferException -> 0x021a, IOException -> 0x020b }
            int r12 = r14.mo54724s()     // Catch:{ InvalidProtocolBufferException -> 0x021a, IOException -> 0x020b }
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)     // Catch:{ InvalidProtocolBufferException -> 0x021a, IOException -> 0x020b }
            r11.add(r12)     // Catch:{ InvalidProtocolBufferException -> 0x021a, IOException -> 0x020b }
            goto L_0x0073
        L_0x0087:
            r14.mo54714i(r10)     // Catch:{ InvalidProtocolBufferException -> 0x021a, IOException -> 0x020b }
            goto L_0x0018
        L_0x008b:
            r10 = r4 & 4096(0x1000, float:5.74E-42)
            if (r10 == r6) goto L_0x0098
            java.util.ArrayList r10 = new java.util.ArrayList     // Catch:{ InvalidProtocolBufferException -> 0x021a, IOException -> 0x020b }
            r10.<init>()     // Catch:{ InvalidProtocolBufferException -> 0x021a, IOException -> 0x020b }
            r13.versionRequirement_ = r10     // Catch:{ InvalidProtocolBufferException -> 0x021a, IOException -> 0x020b }
            r4 = r4 | 4096(0x1000, float:5.74E-42)
        L_0x0098:
            java.util.List<java.lang.Integer> r10 = r13.versionRequirement_     // Catch:{ InvalidProtocolBufferException -> 0x021a, IOException -> 0x020b }
            int r11 = r14.mo54724s()     // Catch:{ InvalidProtocolBufferException -> 0x021a, IOException -> 0x020b }
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)     // Catch:{ InvalidProtocolBufferException -> 0x021a, IOException -> 0x020b }
            r10.add(r11)     // Catch:{ InvalidProtocolBufferException -> 0x021a, IOException -> 0x020b }
            goto L_0x0018
        L_0x00a7:
            int r10 = r13.bitField0_     // Catch:{ InvalidProtocolBufferException -> 0x021a, IOException -> 0x020b }
            r12 = 128(0x80, float:1.794E-43)
            r10 = r10 & r12
            if (r10 != r12) goto L_0x00b4
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeTable r10 = r13.typeTable_     // Catch:{ InvalidProtocolBufferException -> 0x021a, IOException -> 0x020b }
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeTable$b r11 = r10.toBuilder()     // Catch:{ InvalidProtocolBufferException -> 0x021a, IOException -> 0x020b }
        L_0x00b4:
            jm4<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeTable> r10 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeTable.PARSER     // Catch:{ InvalidProtocolBufferException -> 0x021a, IOException -> 0x020b }
            kotlin.reflect.jvm.internal.impl.protobuf.h r10 = r14.mo54726u(r10, r15)     // Catch:{ InvalidProtocolBufferException -> 0x021a, IOException -> 0x020b }
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeTable r10 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeTable) r10     // Catch:{ InvalidProtocolBufferException -> 0x021a, IOException -> 0x020b }
            r13.typeTable_ = r10     // Catch:{ InvalidProtocolBufferException -> 0x021a, IOException -> 0x020b }
            if (r11 == 0) goto L_0x00c9
            r11.mo53896g(r10)     // Catch:{ InvalidProtocolBufferException -> 0x021a, IOException -> 0x020b }
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeTable r10 = r11.mo54434l()     // Catch:{ InvalidProtocolBufferException -> 0x021a, IOException -> 0x020b }
            r13.typeTable_ = r10     // Catch:{ InvalidProtocolBufferException -> 0x021a, IOException -> 0x020b }
        L_0x00c9:
            int r10 = r13.bitField0_     // Catch:{ InvalidProtocolBufferException -> 0x021a, IOException -> 0x020b }
            r10 = r10 | r12
            r13.bitField0_ = r10     // Catch:{ InvalidProtocolBufferException -> 0x021a, IOException -> 0x020b }
            goto L_0x0018
        L_0x00d0:
            int r10 = r14.mo54691A()     // Catch:{ InvalidProtocolBufferException -> 0x021a, IOException -> 0x020b }
            int r10 = r14.mo54715j(r10)     // Catch:{ InvalidProtocolBufferException -> 0x021a, IOException -> 0x020b }
            r11 = r4 & 512(0x200, float:7.175E-43)
            if (r11 == r7) goto L_0x00eb
            int r11 = r14.mo54712e()     // Catch:{ InvalidProtocolBufferException -> 0x021a, IOException -> 0x020b }
            if (r11 <= 0) goto L_0x00eb
            java.util.ArrayList r11 = new java.util.ArrayList     // Catch:{ InvalidProtocolBufferException -> 0x021a, IOException -> 0x020b }
            r11.<init>()     // Catch:{ InvalidProtocolBufferException -> 0x021a, IOException -> 0x020b }
            r13.contextReceiverTypeId_ = r11     // Catch:{ InvalidProtocolBufferException -> 0x021a, IOException -> 0x020b }
            r4 = r4 | 512(0x200, float:7.175E-43)
        L_0x00eb:
            int r11 = r14.mo54712e()     // Catch:{ InvalidProtocolBufferException -> 0x021a, IOException -> 0x020b }
            if (r11 <= 0) goto L_0x00ff
            java.util.List<java.lang.Integer> r11 = r13.contextReceiverTypeId_     // Catch:{ InvalidProtocolBufferException -> 0x021a, IOException -> 0x020b }
            int r12 = r14.mo54724s()     // Catch:{ InvalidProtocolBufferException -> 0x021a, IOException -> 0x020b }
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)     // Catch:{ InvalidProtocolBufferException -> 0x021a, IOException -> 0x020b }
            r11.add(r12)     // Catch:{ InvalidProtocolBufferException -> 0x021a, IOException -> 0x020b }
            goto L_0x00eb
        L_0x00ff:
            r14.mo54714i(r10)     // Catch:{ InvalidProtocolBufferException -> 0x021a, IOException -> 0x020b }
            goto L_0x0018
        L_0x0104:
            r10 = r4 & 512(0x200, float:7.175E-43)
            if (r10 == r7) goto L_0x0111
            java.util.ArrayList r10 = new java.util.ArrayList     // Catch:{ InvalidProtocolBufferException -> 0x021a, IOException -> 0x020b }
            r10.<init>()     // Catch:{ InvalidProtocolBufferException -> 0x021a, IOException -> 0x020b }
            r13.contextReceiverTypeId_ = r10     // Catch:{ InvalidProtocolBufferException -> 0x021a, IOException -> 0x020b }
            r4 = r4 | 512(0x200, float:7.175E-43)
        L_0x0111:
            java.util.List<java.lang.Integer> r10 = r13.contextReceiverTypeId_     // Catch:{ InvalidProtocolBufferException -> 0x021a, IOException -> 0x020b }
            int r11 = r14.mo54724s()     // Catch:{ InvalidProtocolBufferException -> 0x021a, IOException -> 0x020b }
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)     // Catch:{ InvalidProtocolBufferException -> 0x021a, IOException -> 0x020b }
            r10.add(r11)     // Catch:{ InvalidProtocolBufferException -> 0x021a, IOException -> 0x020b }
            goto L_0x0018
        L_0x0120:
            r10 = r4 & 256(0x100, float:3.59E-43)
            if (r10 == r8) goto L_0x012d
            java.util.ArrayList r10 = new java.util.ArrayList     // Catch:{ InvalidProtocolBufferException -> 0x021a, IOException -> 0x020b }
            r10.<init>()     // Catch:{ InvalidProtocolBufferException -> 0x021a, IOException -> 0x020b }
            r13.contextReceiverType_ = r10     // Catch:{ InvalidProtocolBufferException -> 0x021a, IOException -> 0x020b }
            r4 = r4 | 256(0x100, float:3.59E-43)
        L_0x012d:
            java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type> r10 = r13.contextReceiverType_     // Catch:{ InvalidProtocolBufferException -> 0x021a, IOException -> 0x020b }
            jm4<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type> r11 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type.PARSER     // Catch:{ InvalidProtocolBufferException -> 0x021a, IOException -> 0x020b }
            kotlin.reflect.jvm.internal.impl.protobuf.h r11 = r14.mo54726u(r11, r15)     // Catch:{ InvalidProtocolBufferException -> 0x021a, IOException -> 0x020b }
            r10.add(r11)     // Catch:{ InvalidProtocolBufferException -> 0x021a, IOException -> 0x020b }
            goto L_0x0018
        L_0x013a:
            int r10 = r13.bitField0_     // Catch:{ InvalidProtocolBufferException -> 0x021a, IOException -> 0x020b }
            r10 = r10 | r1
            r13.bitField0_ = r10     // Catch:{ InvalidProtocolBufferException -> 0x021a, IOException -> 0x020b }
            int r10 = r14.mo54724s()     // Catch:{ InvalidProtocolBufferException -> 0x021a, IOException -> 0x020b }
            r13.flags_ = r10     // Catch:{ InvalidProtocolBufferException -> 0x021a, IOException -> 0x020b }
            goto L_0x0018
        L_0x0147:
            int r10 = r13.bitField0_     // Catch:{ InvalidProtocolBufferException -> 0x021a, IOException -> 0x020b }
            r10 = r10 | 64
            r13.bitField0_ = r10     // Catch:{ InvalidProtocolBufferException -> 0x021a, IOException -> 0x020b }
            int r10 = r14.mo54724s()     // Catch:{ InvalidProtocolBufferException -> 0x021a, IOException -> 0x020b }
            r13.receiverTypeId_ = r10     // Catch:{ InvalidProtocolBufferException -> 0x021a, IOException -> 0x020b }
            goto L_0x0018
        L_0x0155:
            int r10 = r13.bitField0_     // Catch:{ InvalidProtocolBufferException -> 0x021a, IOException -> 0x020b }
            r10 = r10 | 16
            r13.bitField0_ = r10     // Catch:{ InvalidProtocolBufferException -> 0x021a, IOException -> 0x020b }
            int r10 = r14.mo54724s()     // Catch:{ InvalidProtocolBufferException -> 0x021a, IOException -> 0x020b }
            r13.returnTypeId_ = r10     // Catch:{ InvalidProtocolBufferException -> 0x021a, IOException -> 0x020b }
            goto L_0x0018
        L_0x0163:
            r10 = r4 & 1024(0x400, float:1.435E-42)
            if (r10 == r5) goto L_0x0170
            java.util.ArrayList r10 = new java.util.ArrayList     // Catch:{ InvalidProtocolBufferException -> 0x021a, IOException -> 0x020b }
            r10.<init>()     // Catch:{ InvalidProtocolBufferException -> 0x021a, IOException -> 0x020b }
            r13.valueParameter_ = r10     // Catch:{ InvalidProtocolBufferException -> 0x021a, IOException -> 0x020b }
            r4 = r4 | 1024(0x400, float:1.435E-42)
        L_0x0170:
            java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$ValueParameter> r10 = r13.valueParameter_     // Catch:{ InvalidProtocolBufferException -> 0x021a, IOException -> 0x020b }
            jm4<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$ValueParameter> r11 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$ValueParameter.PARSER     // Catch:{ InvalidProtocolBufferException -> 0x021a, IOException -> 0x020b }
            kotlin.reflect.jvm.internal.impl.protobuf.h r11 = r14.mo54726u(r11, r15)     // Catch:{ InvalidProtocolBufferException -> 0x021a, IOException -> 0x020b }
            r10.add(r11)     // Catch:{ InvalidProtocolBufferException -> 0x021a, IOException -> 0x020b }
            goto L_0x0018
        L_0x017d:
            int r10 = r13.bitField0_     // Catch:{ InvalidProtocolBufferException -> 0x021a, IOException -> 0x020b }
            r10 = r10 & r9
            if (r10 != r9) goto L_0x0188
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type r10 = r13.receiverType_     // Catch:{ InvalidProtocolBufferException -> 0x021a, IOException -> 0x020b }
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type$b r11 = r10.toBuilder()     // Catch:{ InvalidProtocolBufferException -> 0x021a, IOException -> 0x020b }
        L_0x0188:
            jm4<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type> r10 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type.PARSER     // Catch:{ InvalidProtocolBufferException -> 0x021a, IOException -> 0x020b }
            kotlin.reflect.jvm.internal.impl.protobuf.h r10 = r14.mo54726u(r10, r15)     // Catch:{ InvalidProtocolBufferException -> 0x021a, IOException -> 0x020b }
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type r10 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type) r10     // Catch:{ InvalidProtocolBufferException -> 0x021a, IOException -> 0x020b }
            r13.receiverType_ = r10     // Catch:{ InvalidProtocolBufferException -> 0x021a, IOException -> 0x020b }
            if (r11 == 0) goto L_0x019d
            r11.mo53896g(r10)     // Catch:{ InvalidProtocolBufferException -> 0x021a, IOException -> 0x020b }
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type r10 = r11.mo54356r()     // Catch:{ InvalidProtocolBufferException -> 0x021a, IOException -> 0x020b }
            r13.receiverType_ = r10     // Catch:{ InvalidProtocolBufferException -> 0x021a, IOException -> 0x020b }
        L_0x019d:
            int r10 = r13.bitField0_     // Catch:{ InvalidProtocolBufferException -> 0x021a, IOException -> 0x020b }
            r10 = r10 | r9
            r13.bitField0_ = r10     // Catch:{ InvalidProtocolBufferException -> 0x021a, IOException -> 0x020b }
            goto L_0x0018
        L_0x01a4:
            r10 = r4 & 32
            if (r10 == r9) goto L_0x01b1
            java.util.ArrayList r10 = new java.util.ArrayList     // Catch:{ InvalidProtocolBufferException -> 0x021a, IOException -> 0x020b }
            r10.<init>()     // Catch:{ InvalidProtocolBufferException -> 0x021a, IOException -> 0x020b }
            r13.typeParameter_ = r10     // Catch:{ InvalidProtocolBufferException -> 0x021a, IOException -> 0x020b }
            r4 = r4 | 32
        L_0x01b1:
            java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeParameter> r10 = r13.typeParameter_     // Catch:{ InvalidProtocolBufferException -> 0x021a, IOException -> 0x020b }
            jm4<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeParameter> r11 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeParameter.PARSER     // Catch:{ InvalidProtocolBufferException -> 0x021a, IOException -> 0x020b }
            kotlin.reflect.jvm.internal.impl.protobuf.h r11 = r14.mo54726u(r11, r15)     // Catch:{ InvalidProtocolBufferException -> 0x021a, IOException -> 0x020b }
            r10.add(r11)     // Catch:{ InvalidProtocolBufferException -> 0x021a, IOException -> 0x020b }
            goto L_0x0018
        L_0x01be:
            int r10 = r13.bitField0_     // Catch:{ InvalidProtocolBufferException -> 0x021a, IOException -> 0x020b }
            r12 = 8
            r10 = r10 & r12
            if (r10 != r12) goto L_0x01cb
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type r10 = r13.returnType_     // Catch:{ InvalidProtocolBufferException -> 0x021a, IOException -> 0x020b }
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type$b r11 = r10.toBuilder()     // Catch:{ InvalidProtocolBufferException -> 0x021a, IOException -> 0x020b }
        L_0x01cb:
            jm4<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type> r10 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type.PARSER     // Catch:{ InvalidProtocolBufferException -> 0x021a, IOException -> 0x020b }
            kotlin.reflect.jvm.internal.impl.protobuf.h r10 = r14.mo54726u(r10, r15)     // Catch:{ InvalidProtocolBufferException -> 0x021a, IOException -> 0x020b }
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type r10 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type) r10     // Catch:{ InvalidProtocolBufferException -> 0x021a, IOException -> 0x020b }
            r13.returnType_ = r10     // Catch:{ InvalidProtocolBufferException -> 0x021a, IOException -> 0x020b }
            if (r11 == 0) goto L_0x01e0
            r11.mo53896g(r10)     // Catch:{ InvalidProtocolBufferException -> 0x021a, IOException -> 0x020b }
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type r10 = r11.mo54356r()     // Catch:{ InvalidProtocolBufferException -> 0x021a, IOException -> 0x020b }
            r13.returnType_ = r10     // Catch:{ InvalidProtocolBufferException -> 0x021a, IOException -> 0x020b }
        L_0x01e0:
            int r10 = r13.bitField0_     // Catch:{ InvalidProtocolBufferException -> 0x021a, IOException -> 0x020b }
            r10 = r10 | r12
            r13.bitField0_ = r10     // Catch:{ InvalidProtocolBufferException -> 0x021a, IOException -> 0x020b }
            goto L_0x0018
        L_0x01e7:
            int r10 = r13.bitField0_     // Catch:{ InvalidProtocolBufferException -> 0x021a, IOException -> 0x020b }
            r10 = r10 | 4
            r13.bitField0_ = r10     // Catch:{ InvalidProtocolBufferException -> 0x021a, IOException -> 0x020b }
            int r10 = r14.mo54724s()     // Catch:{ InvalidProtocolBufferException -> 0x021a, IOException -> 0x020b }
            r13.name_ = r10     // Catch:{ InvalidProtocolBufferException -> 0x021a, IOException -> 0x020b }
            goto L_0x0018
        L_0x01f5:
            int r10 = r13.bitField0_     // Catch:{ InvalidProtocolBufferException -> 0x021a, IOException -> 0x020b }
            r10 = r10 | 2
            r13.bitField0_ = r10     // Catch:{ InvalidProtocolBufferException -> 0x021a, IOException -> 0x020b }
            int r10 = r14.mo54724s()     // Catch:{ InvalidProtocolBufferException -> 0x021a, IOException -> 0x020b }
            r13.oldFlags_ = r10     // Catch:{ InvalidProtocolBufferException -> 0x021a, IOException -> 0x020b }
            goto L_0x0018
        L_0x0203:
            r3 = r1
            goto L_0x0018
        L_0x0206:
            if (r5 != 0) goto L_0x0018
            goto L_0x0203
        L_0x0209:
            r14 = move-exception
            goto L_0x0220
        L_0x020b:
            r14 = move-exception
            kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException r15 = new kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException     // Catch:{ all -> 0x0209 }
            java.lang.String r14 = r14.getMessage()     // Catch:{ all -> 0x0209 }
            r15.<init>(r14)     // Catch:{ all -> 0x0209 }
            kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException r14 = r15.setUnfinishedMessage(r13)     // Catch:{ all -> 0x0209 }
            throw r14     // Catch:{ all -> 0x0209 }
        L_0x021a:
            r14 = move-exception
            kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException r14 = r14.setUnfinishedMessage(r13)     // Catch:{ all -> 0x0209 }
            throw r14     // Catch:{ all -> 0x0209 }
        L_0x0220:
            r15 = r4 & 32
            if (r15 != r9) goto L_0x022c
            java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeParameter> r15 = r13.typeParameter_
            java.util.List r15 = java.util.Collections.unmodifiableList(r15)
            r13.typeParameter_ = r15
        L_0x022c:
            r15 = r4 & 1024(0x400, float:1.435E-42)
            if (r15 != r5) goto L_0x0238
            java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$ValueParameter> r15 = r13.valueParameter_
            java.util.List r15 = java.util.Collections.unmodifiableList(r15)
            r13.valueParameter_ = r15
        L_0x0238:
            r15 = r4 & 256(0x100, float:3.59E-43)
            if (r15 != r8) goto L_0x0244
            java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type> r15 = r13.contextReceiverType_
            java.util.List r15 = java.util.Collections.unmodifiableList(r15)
            r13.contextReceiverType_ = r15
        L_0x0244:
            r15 = r4 & 512(0x200, float:7.175E-43)
            if (r15 != r7) goto L_0x0250
            java.util.List<java.lang.Integer> r15 = r13.contextReceiverTypeId_
            java.util.List r15 = java.util.Collections.unmodifiableList(r15)
            r13.contextReceiverTypeId_ = r15
        L_0x0250:
            r15 = r4 & 4096(0x1000, float:5.74E-42)
            if (r15 != r6) goto L_0x025c
            java.util.List<java.lang.Integer> r15 = r13.versionRequirement_
            java.util.List r15 = java.util.Collections.unmodifiableList(r15)
            r13.versionRequirement_ = r15
        L_0x025c:
            r2.mo54597I()     // Catch:{ IOException -> 0x025f, all -> 0x0266 }
        L_0x025f:
            c70 r15 = r0.mo50838d()
            r13.unknownFields = r15
            goto L_0x026e
        L_0x0266:
            r14 = move-exception
            c70 r15 = r0.mo50838d()
            r13.unknownFields = r15
            throw r14
        L_0x026e:
            r13.makeExtensionsImmutable()
            throw r14
        L_0x0272:
            r14 = r4 & 32
            if (r14 != r9) goto L_0x027e
            java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeParameter> r14 = r13.typeParameter_
            java.util.List r14 = java.util.Collections.unmodifiableList(r14)
            r13.typeParameter_ = r14
        L_0x027e:
            r14 = r4 & 1024(0x400, float:1.435E-42)
            if (r14 != r5) goto L_0x028a
            java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$ValueParameter> r14 = r13.valueParameter_
            java.util.List r14 = java.util.Collections.unmodifiableList(r14)
            r13.valueParameter_ = r14
        L_0x028a:
            r14 = r4 & 256(0x100, float:3.59E-43)
            if (r14 != r8) goto L_0x0296
            java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type> r14 = r13.contextReceiverType_
            java.util.List r14 = java.util.Collections.unmodifiableList(r14)
            r13.contextReceiverType_ = r14
        L_0x0296:
            r14 = r4 & 512(0x200, float:7.175E-43)
            if (r14 != r7) goto L_0x02a2
            java.util.List<java.lang.Integer> r14 = r13.contextReceiverTypeId_
            java.util.List r14 = java.util.Collections.unmodifiableList(r14)
            r13.contextReceiverTypeId_ = r14
        L_0x02a2:
            r14 = r4 & 4096(0x1000, float:5.74E-42)
            if (r14 != r6) goto L_0x02ae
            java.util.List<java.lang.Integer> r14 = r13.versionRequirement_
            java.util.List r14 = java.util.Collections.unmodifiableList(r14)
            r13.versionRequirement_ = r14
        L_0x02ae:
            r2.mo54597I()     // Catch:{ IOException -> 0x02b1, all -> 0x02b8 }
        L_0x02b1:
            c70 r14 = r0.mo50838d()
            r13.unknownFields = r14
            goto L_0x02c0
        L_0x02b8:
            r14 = move-exception
            c70 r15 = r0.mo50838d()
            r13.unknownFields = r15
            throw r14
        L_0x02c0:
            r13.makeExtensionsImmutable()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Function.<init>(kotlin.reflect.jvm.internal.impl.protobuf.c, kotlin.reflect.jvm.internal.impl.protobuf.d):void");
    }
}
