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
import kotlin.reflect.jvm.internal.impl.protobuf.C7621f;
import kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import okhttp3.internal.http2.Http2;

public final class ProtoBuf$Class extends GeneratedMessageLite.ExtendableMessage<ProtoBuf$Class> {
    public static jm4<ProtoBuf$Class> PARSER = new C7532a();

    /* renamed from: a */
    public static final ProtoBuf$Class f39667a;
    /* access modifiers changed from: private */
    public int bitField0_;
    /* access modifiers changed from: private */
    public int companionObjectName_;
    /* access modifiers changed from: private */
    public List<ProtoBuf$Constructor> constructor_;
    private int contextReceiverTypeIdMemoizedSerializedSize;
    /* access modifiers changed from: private */
    public List<Integer> contextReceiverTypeId_;
    /* access modifiers changed from: private */
    public List<ProtoBuf$Type> contextReceiverType_;
    /* access modifiers changed from: private */
    public List<ProtoBuf$EnumEntry> enumEntry_;
    /* access modifiers changed from: private */
    public int flags_;
    /* access modifiers changed from: private */
    public int fqName_;
    /* access modifiers changed from: private */
    public List<ProtoBuf$Function> function_;
    /* access modifiers changed from: private */
    public int inlineClassUnderlyingPropertyName_;
    /* access modifiers changed from: private */
    public int inlineClassUnderlyingTypeId_;
    /* access modifiers changed from: private */
    public ProtoBuf$Type inlineClassUnderlyingType_;
    private byte memoizedIsInitialized;
    private int memoizedSerializedSize;
    private int multiFieldValueClassUnderlyingNameMemoizedSerializedSize;
    /* access modifiers changed from: private */
    public List<Integer> multiFieldValueClassUnderlyingName_;
    private int multiFieldValueClassUnderlyingTypeIdMemoizedSerializedSize;
    /* access modifiers changed from: private */
    public List<Integer> multiFieldValueClassUnderlyingTypeId_;
    /* access modifiers changed from: private */
    public List<ProtoBuf$Type> multiFieldValueClassUnderlyingType_;
    private int nestedClassNameMemoizedSerializedSize;
    /* access modifiers changed from: private */
    public List<Integer> nestedClassName_;
    /* access modifiers changed from: private */
    public List<ProtoBuf$Property> property_;
    private int sealedSubclassFqNameMemoizedSerializedSize;
    /* access modifiers changed from: private */
    public List<Integer> sealedSubclassFqName_;
    private int supertypeIdMemoizedSerializedSize;
    /* access modifiers changed from: private */
    public List<Integer> supertypeId_;
    /* access modifiers changed from: private */
    public List<ProtoBuf$Type> supertype_;
    /* access modifiers changed from: private */
    public List<ProtoBuf$TypeAlias> typeAlias_;
    /* access modifiers changed from: private */
    public List<ProtoBuf$TypeParameter> typeParameter_;
    /* access modifiers changed from: private */
    public ProtoBuf$TypeTable typeTable_;
    /* access modifiers changed from: private */
    public final c70 unknownFields;
    /* access modifiers changed from: private */
    public ProtoBuf$VersionRequirementTable versionRequirementTable_;
    /* access modifiers changed from: private */
    public List<Integer> versionRequirement_;

    public enum Kind implements C7621f.C7622a {
        CLASS(0, 0),
        INTERFACE(1, 1),
        ENUM_CLASS(2, 2),
        ENUM_ENTRY(3, 3),
        ANNOTATION_CLASS(4, 4),
        OBJECT(5, 5),
        COMPANION_OBJECT(6, 6);
        

        /* renamed from: a */
        public static C7621f.C7623b<Kind> f39668a;
        private final int value;

        /* renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Class$Kind$a */
        public static class C7531a implements C7621f.C7623b<Kind> {
            /* renamed from: a */
            public Kind findValueByNumber(int i) {
                return Kind.valueOf(i);
            }
        }

        /* access modifiers changed from: public */
        static {
            f39668a = new C7531a();
        }

        /* access modifiers changed from: public */
        Kind(int i, int i2) {
            this.value = i2;
        }

        public final int getNumber() {
            return this.value;
        }

        public static Kind valueOf(int i) {
            switch (i) {
                case 0:
                    return CLASS;
                case 1:
                    return INTERFACE;
                case 2:
                    return ENUM_CLASS;
                case 3:
                    return ENUM_ENTRY;
                case 4:
                    return ANNOTATION_CLASS;
                case 5:
                    return OBJECT;
                case 6:
                    return COMPANION_OBJECT;
                default:
                    return null;
            }
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Class$a */
    public static class C7532a extends C7613b<ProtoBuf$Class> {
        /* renamed from: m */
        public ProtoBuf$Class mo52753c(C7614c cVar, C7616d dVar) throws InvalidProtocolBufferException {
            return new ProtoBuf$Class(cVar, dVar);
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Class$b */
    public static final class C7533b extends GeneratedMessageLite.C7602c<ProtoBuf$Class, C7533b> {

        /* renamed from: A */
        public List<Integer> f39670A = Collections.emptyList();

        /* renamed from: B */
        public List<Integer> f39671B = Collections.emptyList();

        /* renamed from: C */
        public List<ProtoBuf$Type> f39672C = Collections.emptyList();

        /* renamed from: H */
        public List<Integer> f39673H = Collections.emptyList();

        /* renamed from: I */
        public List<ProtoBuf$Constructor> f39674I = Collections.emptyList();

        /* renamed from: L */
        public List<ProtoBuf$Function> f39675L = Collections.emptyList();

        /* renamed from: M */
        public List<ProtoBuf$Property> f39676M = Collections.emptyList();

        /* renamed from: P */
        public List<ProtoBuf$TypeAlias> f39677P = Collections.emptyList();

        /* renamed from: Q */
        public List<ProtoBuf$EnumEntry> f39678Q = Collections.emptyList();

        /* renamed from: U */
        public List<Integer> f39679U = Collections.emptyList();

        /* renamed from: X */
        public int f39680X;

        /* renamed from: Y */
        public ProtoBuf$Type f39681Y = ProtoBuf$Type.getDefaultInstance();

        /* renamed from: Z */
        public int f39682Z;

        /* renamed from: b1 */
        public ProtoBuf$TypeTable f39683b1 = ProtoBuf$TypeTable.getDefaultInstance();

        /* renamed from: e0 */
        public List<Integer> f39684e0 = Collections.emptyList();

        /* renamed from: e1 */
        public List<Integer> f39685e1 = Collections.emptyList();

        /* renamed from: g */
        public int f39686g;

        /* renamed from: k */
        public int f39687k = 6;

        /* renamed from: k0 */
        public List<ProtoBuf$Type> f39688k0 = Collections.emptyList();

        /* renamed from: o1 */
        public ProtoBuf$VersionRequirementTable f39689o1 = ProtoBuf$VersionRequirementTable.getDefaultInstance();

        /* renamed from: r */
        public int f39690r;

        /* renamed from: s */
        public int f39691s;

        /* renamed from: v0 */
        public List<Integer> f39692v0 = Collections.emptyList();

        /* renamed from: x */
        public List<ProtoBuf$TypeParameter> f39693x = Collections.emptyList();

        /* renamed from: y */
        public List<ProtoBuf$Type> f39694y = Collections.emptyList();

        public C7533b() {
            mo53994M();
        }

        /* renamed from: u */
        public static C7533b m61291u() {
            return new C7533b();
        }

        /* renamed from: B */
        public final void mo53983B() {
            if ((this.f39686g & 262144) != 262144) {
                this.f39684e0 = new ArrayList(this.f39684e0);
                this.f39686g |= 262144;
            }
        }

        /* renamed from: C */
        public final void mo53984C() {
            if ((this.f39686g & 1048576) != 1048576) {
                this.f39692v0 = new ArrayList(this.f39692v0);
                this.f39686g |= 1048576;
            }
        }

        /* renamed from: D */
        public final void mo53985D() {
            if ((this.f39686g & 524288) != 524288) {
                this.f39688k0 = new ArrayList(this.f39688k0);
                this.f39686g |= 524288;
            }
        }

        /* renamed from: E */
        public final void mo53986E() {
            if ((this.f39686g & 64) != 64) {
                this.f39671B = new ArrayList(this.f39671B);
                this.f39686g |= 64;
            }
        }

        /* renamed from: F */
        public final void mo53987F() {
            if ((this.f39686g & 2048) != 2048) {
                this.f39676M = new ArrayList(this.f39676M);
                this.f39686g |= 2048;
            }
        }

        /* renamed from: G */
        public final void mo53988G() {
            if ((this.f39686g & Http2.INITIAL_MAX_FRAME_SIZE) != 16384) {
                this.f39679U = new ArrayList(this.f39679U);
                this.f39686g |= Http2.INITIAL_MAX_FRAME_SIZE;
            }
        }

        /* renamed from: H */
        public final void mo53989H() {
            if ((this.f39686g & 32) != 32) {
                this.f39670A = new ArrayList(this.f39670A);
                this.f39686g |= 32;
            }
        }

        /* renamed from: I */
        public final void mo53990I() {
            if ((this.f39686g & 16) != 16) {
                this.f39694y = new ArrayList(this.f39694y);
                this.f39686g |= 16;
            }
        }

        /* renamed from: J */
        public final void mo53991J() {
            if ((this.f39686g & 4096) != 4096) {
                this.f39677P = new ArrayList(this.f39677P);
                this.f39686g |= 4096;
            }
        }

        /* renamed from: K */
        public final void mo53992K() {
            if ((this.f39686g & 8) != 8) {
                this.f39693x = new ArrayList(this.f39693x);
                this.f39686g |= 8;
            }
        }

        /* renamed from: L */
        public final void mo53993L() {
            if ((this.f39686g & 4194304) != 4194304) {
                this.f39685e1 = new ArrayList(this.f39685e1);
                this.f39686g |= 4194304;
            }
        }

        /* renamed from: M */
        public final void mo53994M() {
        }

        /* renamed from: N */
        public C7533b mo53896g(ProtoBuf$Class protoBuf$Class) {
            if (protoBuf$Class == ProtoBuf$Class.getDefaultInstance()) {
                return this;
            }
            if (protoBuf$Class.hasFlags()) {
                mo54001U(protoBuf$Class.getFlags());
            }
            if (protoBuf$Class.hasFqName()) {
                mo54002V(protoBuf$Class.getFqName());
            }
            if (protoBuf$Class.hasCompanionObjectName()) {
                mo54000T(protoBuf$Class.getCompanionObjectName());
            }
            if (!protoBuf$Class.typeParameter_.isEmpty()) {
                if (this.f39693x.isEmpty()) {
                    this.f39693x = protoBuf$Class.typeParameter_;
                    this.f39686g &= -9;
                } else {
                    mo53992K();
                    this.f39693x.addAll(protoBuf$Class.typeParameter_);
                }
            }
            if (!protoBuf$Class.supertype_.isEmpty()) {
                if (this.f39694y.isEmpty()) {
                    this.f39694y = protoBuf$Class.supertype_;
                    this.f39686g &= -17;
                } else {
                    mo53990I();
                    this.f39694y.addAll(protoBuf$Class.supertype_);
                }
            }
            if (!protoBuf$Class.supertypeId_.isEmpty()) {
                if (this.f39670A.isEmpty()) {
                    this.f39670A = protoBuf$Class.supertypeId_;
                    this.f39686g &= -33;
                } else {
                    mo53989H();
                    this.f39670A.addAll(protoBuf$Class.supertypeId_);
                }
            }
            if (!protoBuf$Class.nestedClassName_.isEmpty()) {
                if (this.f39671B.isEmpty()) {
                    this.f39671B = protoBuf$Class.nestedClassName_;
                    this.f39686g &= -65;
                } else {
                    mo53986E();
                    this.f39671B.addAll(protoBuf$Class.nestedClassName_);
                }
            }
            if (!protoBuf$Class.contextReceiverType_.isEmpty()) {
                if (this.f39672C.isEmpty()) {
                    this.f39672C = protoBuf$Class.contextReceiverType_;
                    this.f39686g &= -129;
                } else {
                    mo54010x();
                    this.f39672C.addAll(protoBuf$Class.contextReceiverType_);
                }
            }
            if (!protoBuf$Class.contextReceiverTypeId_.isEmpty()) {
                if (this.f39673H.isEmpty()) {
                    this.f39673H = protoBuf$Class.contextReceiverTypeId_;
                    this.f39686g &= -257;
                } else {
                    mo54009w();
                    this.f39673H.addAll(protoBuf$Class.contextReceiverTypeId_);
                }
            }
            if (!protoBuf$Class.constructor_.isEmpty()) {
                if (this.f39674I.isEmpty()) {
                    this.f39674I = protoBuf$Class.constructor_;
                    this.f39686g &= -513;
                } else {
                    mo54008v();
                    this.f39674I.addAll(protoBuf$Class.constructor_);
                }
            }
            if (!protoBuf$Class.function_.isEmpty()) {
                if (this.f39675L.isEmpty()) {
                    this.f39675L = protoBuf$Class.function_;
                    this.f39686g &= -1025;
                } else {
                    mo54012z();
                    this.f39675L.addAll(protoBuf$Class.function_);
                }
            }
            if (!protoBuf$Class.property_.isEmpty()) {
                if (this.f39676M.isEmpty()) {
                    this.f39676M = protoBuf$Class.property_;
                    this.f39686g &= -2049;
                } else {
                    mo53987F();
                    this.f39676M.addAll(protoBuf$Class.property_);
                }
            }
            if (!protoBuf$Class.typeAlias_.isEmpty()) {
                if (this.f39677P.isEmpty()) {
                    this.f39677P = protoBuf$Class.typeAlias_;
                    this.f39686g &= -4097;
                } else {
                    mo53991J();
                    this.f39677P.addAll(protoBuf$Class.typeAlias_);
                }
            }
            if (!protoBuf$Class.enumEntry_.isEmpty()) {
                if (this.f39678Q.isEmpty()) {
                    this.f39678Q = protoBuf$Class.enumEntry_;
                    this.f39686g &= -8193;
                } else {
                    mo54011y();
                    this.f39678Q.addAll(protoBuf$Class.enumEntry_);
                }
            }
            if (!protoBuf$Class.sealedSubclassFqName_.isEmpty()) {
                if (this.f39679U.isEmpty()) {
                    this.f39679U = protoBuf$Class.sealedSubclassFqName_;
                    this.f39686g &= -16385;
                } else {
                    mo53988G();
                    this.f39679U.addAll(protoBuf$Class.sealedSubclassFqName_);
                }
            }
            if (protoBuf$Class.hasInlineClassUnderlyingPropertyName()) {
                mo54003Y(protoBuf$Class.getInlineClassUnderlyingPropertyName());
            }
            if (protoBuf$Class.hasInlineClassUnderlyingType()) {
                mo53997P(protoBuf$Class.getInlineClassUnderlyingType());
            }
            if (protoBuf$Class.hasInlineClassUnderlyingTypeId()) {
                mo54004Z(protoBuf$Class.getInlineClassUnderlyingTypeId());
            }
            if (!protoBuf$Class.multiFieldValueClassUnderlyingName_.isEmpty()) {
                if (this.f39684e0.isEmpty()) {
                    this.f39684e0 = protoBuf$Class.multiFieldValueClassUnderlyingName_;
                    this.f39686g &= -262145;
                } else {
                    mo53983B();
                    this.f39684e0.addAll(protoBuf$Class.multiFieldValueClassUnderlyingName_);
                }
            }
            if (!protoBuf$Class.multiFieldValueClassUnderlyingType_.isEmpty()) {
                if (this.f39688k0.isEmpty()) {
                    this.f39688k0 = protoBuf$Class.multiFieldValueClassUnderlyingType_;
                    this.f39686g &= -524289;
                } else {
                    mo53985D();
                    this.f39688k0.addAll(protoBuf$Class.multiFieldValueClassUnderlyingType_);
                }
            }
            if (!protoBuf$Class.multiFieldValueClassUnderlyingTypeId_.isEmpty()) {
                if (this.f39692v0.isEmpty()) {
                    this.f39692v0 = protoBuf$Class.multiFieldValueClassUnderlyingTypeId_;
                    this.f39686g &= -1048577;
                } else {
                    mo53984C();
                    this.f39692v0.addAll(protoBuf$Class.multiFieldValueClassUnderlyingTypeId_);
                }
            }
            if (protoBuf$Class.hasTypeTable()) {
                mo53998R(protoBuf$Class.getTypeTable());
            }
            if (!protoBuf$Class.versionRequirement_.isEmpty()) {
                if (this.f39685e1.isEmpty()) {
                    this.f39685e1 = protoBuf$Class.versionRequirement_;
                    this.f39686g &= -4194305;
                } else {
                    mo53993L();
                    this.f39685e1.addAll(protoBuf$Class.versionRequirement_);
                }
            }
            if (protoBuf$Class.hasVersionRequirementTable()) {
                mo53999S(protoBuf$Class.getVersionRequirementTable());
            }
            mo54655m(protoBuf$Class);
            mo54652h(mo54651f().mo50826j(protoBuf$Class.unknownFields));
            return this;
        }

        /* renamed from: O */
        public C7533b mo53900n(C7614c cVar, C7616d dVar) throws IOException {
            ProtoBuf$Class protoBuf$Class;
            ProtoBuf$Class protoBuf$Class2 = null;
            try {
                ProtoBuf$Class c = ProtoBuf$Class.PARSER.mo52753c(cVar, dVar);
                if (c != null) {
                    mo53896g(c);
                }
                return this;
            } catch (InvalidProtocolBufferException e) {
                protoBuf$Class = (ProtoBuf$Class) e.getUnfinishedMessage();
                throw e;
            } catch (Throwable th) {
                th = th;
                protoBuf$Class2 = protoBuf$Class;
            }
            if (protoBuf$Class2 != null) {
                mo53896g(protoBuf$Class2);
            }
            throw th;
        }

        /* renamed from: P */
        public C7533b mo53997P(ProtoBuf$Type protoBuf$Type) {
            if ((this.f39686g & 65536) != 65536 || this.f39681Y == ProtoBuf$Type.getDefaultInstance()) {
                this.f39681Y = protoBuf$Type;
            } else {
                this.f39681Y = ProtoBuf$Type.newBuilder(this.f39681Y).mo53896g(protoBuf$Type).mo54356r();
            }
            this.f39686g |= 65536;
            return this;
        }

        /* renamed from: R */
        public C7533b mo53998R(ProtoBuf$TypeTable protoBuf$TypeTable) {
            if ((this.f39686g & 2097152) != 2097152 || this.f39683b1 == ProtoBuf$TypeTable.getDefaultInstance()) {
                this.f39683b1 = protoBuf$TypeTable;
            } else {
                this.f39683b1 = ProtoBuf$TypeTable.newBuilder(this.f39683b1).mo53896g(protoBuf$TypeTable).mo54434l();
            }
            this.f39686g |= 2097152;
            return this;
        }

        /* renamed from: S */
        public C7533b mo53999S(ProtoBuf$VersionRequirementTable protoBuf$VersionRequirementTable) {
            if ((this.f39686g & 8388608) != 8388608 || this.f39689o1 == ProtoBuf$VersionRequirementTable.getDefaultInstance()) {
                this.f39689o1 = protoBuf$VersionRequirementTable;
            } else {
                this.f39689o1 = ProtoBuf$VersionRequirementTable.newBuilder(this.f39689o1).mo53896g(protoBuf$VersionRequirementTable).mo54500l();
            }
            this.f39686g |= 8388608;
            return this;
        }

        /* renamed from: T */
        public C7533b mo54000T(int i) {
            this.f39686g |= 4;
            this.f39691s = i;
            return this;
        }

        /* renamed from: U */
        public C7533b mo54001U(int i) {
            this.f39686g |= 1;
            this.f39687k = i;
            return this;
        }

        /* renamed from: V */
        public C7533b mo54002V(int i) {
            this.f39686g |= 2;
            this.f39690r = i;
            return this;
        }

        /* renamed from: Y */
        public C7533b mo54003Y(int i) {
            this.f39686g |= 32768;
            this.f39680X = i;
            return this;
        }

        /* renamed from: Z */
        public C7533b mo54004Z(int i) {
            this.f39686g |= 131072;
            this.f39682Z = i;
            return this;
        }

        /* renamed from: p */
        public ProtoBuf$Class build() {
            ProtoBuf$Class r = mo54006r();
            if (r.isInitialized()) {
                return r;
            }
            throw C7610a.C7611a.m61947b(r);
        }

        /* renamed from: r */
        public ProtoBuf$Class mo54006r() {
            ProtoBuf$Class protoBuf$Class = new ProtoBuf$Class((GeneratedMessageLite.C7602c) this);
            int i = this.f39686g;
            int i2 = 1;
            if ((i & 1) != 1) {
                i2 = 0;
            }
            int unused = protoBuf$Class.flags_ = this.f39687k;
            if ((i & 2) == 2) {
                i2 |= 2;
            }
            int unused2 = protoBuf$Class.fqName_ = this.f39690r;
            if ((i & 4) == 4) {
                i2 |= 4;
            }
            int unused3 = protoBuf$Class.companionObjectName_ = this.f39691s;
            if ((this.f39686g & 8) == 8) {
                this.f39693x = Collections.unmodifiableList(this.f39693x);
                this.f39686g &= -9;
            }
            List unused4 = protoBuf$Class.typeParameter_ = this.f39693x;
            if ((this.f39686g & 16) == 16) {
                this.f39694y = Collections.unmodifiableList(this.f39694y);
                this.f39686g &= -17;
            }
            List unused5 = protoBuf$Class.supertype_ = this.f39694y;
            if ((this.f39686g & 32) == 32) {
                this.f39670A = Collections.unmodifiableList(this.f39670A);
                this.f39686g &= -33;
            }
            List unused6 = protoBuf$Class.supertypeId_ = this.f39670A;
            if ((this.f39686g & 64) == 64) {
                this.f39671B = Collections.unmodifiableList(this.f39671B);
                this.f39686g &= -65;
            }
            List unused7 = protoBuf$Class.nestedClassName_ = this.f39671B;
            if ((this.f39686g & 128) == 128) {
                this.f39672C = Collections.unmodifiableList(this.f39672C);
                this.f39686g &= -129;
            }
            List unused8 = protoBuf$Class.contextReceiverType_ = this.f39672C;
            if ((this.f39686g & 256) == 256) {
                this.f39673H = Collections.unmodifiableList(this.f39673H);
                this.f39686g &= -257;
            }
            List unused9 = protoBuf$Class.contextReceiverTypeId_ = this.f39673H;
            if ((this.f39686g & RecyclerView.C1231a0.FLAG_ADAPTER_POSITION_UNKNOWN) == 512) {
                this.f39674I = Collections.unmodifiableList(this.f39674I);
                this.f39686g &= -513;
            }
            List unused10 = protoBuf$Class.constructor_ = this.f39674I;
            if ((this.f39686g & RecyclerView.C1231a0.FLAG_ADAPTER_FULLUPDATE) == 1024) {
                this.f39675L = Collections.unmodifiableList(this.f39675L);
                this.f39686g &= -1025;
            }
            List unused11 = protoBuf$Class.function_ = this.f39675L;
            if ((this.f39686g & 2048) == 2048) {
                this.f39676M = Collections.unmodifiableList(this.f39676M);
                this.f39686g &= -2049;
            }
            List unused12 = protoBuf$Class.property_ = this.f39676M;
            if ((this.f39686g & 4096) == 4096) {
                this.f39677P = Collections.unmodifiableList(this.f39677P);
                this.f39686g &= -4097;
            }
            List unused13 = protoBuf$Class.typeAlias_ = this.f39677P;
            if ((this.f39686g & 8192) == 8192) {
                this.f39678Q = Collections.unmodifiableList(this.f39678Q);
                this.f39686g &= -8193;
            }
            List unused14 = protoBuf$Class.enumEntry_ = this.f39678Q;
            if ((this.f39686g & Http2.INITIAL_MAX_FRAME_SIZE) == 16384) {
                this.f39679U = Collections.unmodifiableList(this.f39679U);
                this.f39686g &= -16385;
            }
            List unused15 = protoBuf$Class.sealedSubclassFqName_ = this.f39679U;
            if ((i & 32768) == 32768) {
                i2 |= 8;
            }
            int unused16 = protoBuf$Class.inlineClassUnderlyingPropertyName_ = this.f39680X;
            if ((i & 65536) == 65536) {
                i2 |= 16;
            }
            ProtoBuf$Type unused17 = protoBuf$Class.inlineClassUnderlyingType_ = this.f39681Y;
            if ((i & 131072) == 131072) {
                i2 |= 32;
            }
            int unused18 = protoBuf$Class.inlineClassUnderlyingTypeId_ = this.f39682Z;
            if ((this.f39686g & 262144) == 262144) {
                this.f39684e0 = Collections.unmodifiableList(this.f39684e0);
                this.f39686g &= -262145;
            }
            List unused19 = protoBuf$Class.multiFieldValueClassUnderlyingName_ = this.f39684e0;
            if ((this.f39686g & 524288) == 524288) {
                this.f39688k0 = Collections.unmodifiableList(this.f39688k0);
                this.f39686g &= -524289;
            }
            List unused20 = protoBuf$Class.multiFieldValueClassUnderlyingType_ = this.f39688k0;
            if ((this.f39686g & 1048576) == 1048576) {
                this.f39692v0 = Collections.unmodifiableList(this.f39692v0);
                this.f39686g &= -1048577;
            }
            List unused21 = protoBuf$Class.multiFieldValueClassUnderlyingTypeId_ = this.f39692v0;
            if ((i & 2097152) == 2097152) {
                i2 |= 64;
            }
            ProtoBuf$TypeTable unused22 = protoBuf$Class.typeTable_ = this.f39683b1;
            if ((this.f39686g & 4194304) == 4194304) {
                this.f39685e1 = Collections.unmodifiableList(this.f39685e1);
                this.f39686g &= -4194305;
            }
            List unused23 = protoBuf$Class.versionRequirement_ = this.f39685e1;
            if ((i & 8388608) == 8388608) {
                i2 |= 128;
            }
            ProtoBuf$VersionRequirementTable unused24 = protoBuf$Class.versionRequirementTable_ = this.f39689o1;
            int unused25 = protoBuf$Class.bitField0_ = i2;
            return protoBuf$Class;
        }

        /* renamed from: t */
        public C7533b mo53895d() {
            return m61291u().mo53896g(mo54006r());
        }

        /* renamed from: v */
        public final void mo54008v() {
            if ((this.f39686g & RecyclerView.C1231a0.FLAG_ADAPTER_POSITION_UNKNOWN) != 512) {
                this.f39674I = new ArrayList(this.f39674I);
                this.f39686g |= RecyclerView.C1231a0.FLAG_ADAPTER_POSITION_UNKNOWN;
            }
        }

        /* renamed from: w */
        public final void mo54009w() {
            if ((this.f39686g & 256) != 256) {
                this.f39673H = new ArrayList(this.f39673H);
                this.f39686g |= 256;
            }
        }

        /* renamed from: x */
        public final void mo54010x() {
            if ((this.f39686g & 128) != 128) {
                this.f39672C = new ArrayList(this.f39672C);
                this.f39686g |= 128;
            }
        }

        /* renamed from: y */
        public final void mo54011y() {
            if ((this.f39686g & 8192) != 8192) {
                this.f39678Q = new ArrayList(this.f39678Q);
                this.f39686g |= 8192;
            }
        }

        /* renamed from: z */
        public final void mo54012z() {
            if ((this.f39686g & RecyclerView.C1231a0.FLAG_ADAPTER_FULLUPDATE) != 1024) {
                this.f39675L = new ArrayList(this.f39675L);
                this.f39686g |= RecyclerView.C1231a0.FLAG_ADAPTER_FULLUPDATE;
            }
        }
    }

    static {
        ProtoBuf$Class protoBuf$Class = new ProtoBuf$Class(true);
        f39667a = protoBuf$Class;
        protoBuf$Class.mo53928c();
    }

    public static ProtoBuf$Class getDefaultInstance() {
        return f39667a;
    }

    public static C7533b newBuilder() {
        return C7533b.m61291u();
    }

    public static ProtoBuf$Class parseFrom(InputStream inputStream, C7616d dVar) throws IOException {
        return PARSER.mo52751a(inputStream, dVar);
    }

    /* renamed from: c */
    public final void mo53928c() {
        this.flags_ = 6;
        this.fqName_ = 0;
        this.companionObjectName_ = 0;
        this.typeParameter_ = Collections.emptyList();
        this.supertype_ = Collections.emptyList();
        this.supertypeId_ = Collections.emptyList();
        this.nestedClassName_ = Collections.emptyList();
        this.contextReceiverType_ = Collections.emptyList();
        this.contextReceiverTypeId_ = Collections.emptyList();
        this.constructor_ = Collections.emptyList();
        this.function_ = Collections.emptyList();
        this.property_ = Collections.emptyList();
        this.typeAlias_ = Collections.emptyList();
        this.enumEntry_ = Collections.emptyList();
        this.sealedSubclassFqName_ = Collections.emptyList();
        this.inlineClassUnderlyingPropertyName_ = 0;
        this.inlineClassUnderlyingType_ = ProtoBuf$Type.getDefaultInstance();
        this.inlineClassUnderlyingTypeId_ = 0;
        this.multiFieldValueClassUnderlyingName_ = Collections.emptyList();
        this.multiFieldValueClassUnderlyingType_ = Collections.emptyList();
        this.multiFieldValueClassUnderlyingTypeId_ = Collections.emptyList();
        this.typeTable_ = ProtoBuf$TypeTable.getDefaultInstance();
        this.versionRequirement_ = Collections.emptyList();
        this.versionRequirementTable_ = ProtoBuf$VersionRequirementTable.getDefaultInstance();
    }

    public int getCompanionObjectName() {
        return this.companionObjectName_;
    }

    public ProtoBuf$Constructor getConstructor(int i) {
        return this.constructor_.get(i);
    }

    public int getConstructorCount() {
        return this.constructor_.size();
    }

    public List<ProtoBuf$Constructor> getConstructorList() {
        return this.constructor_;
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

    public ProtoBuf$EnumEntry getEnumEntry(int i) {
        return this.enumEntry_.get(i);
    }

    public int getEnumEntryCount() {
        return this.enumEntry_.size();
    }

    public List<ProtoBuf$EnumEntry> getEnumEntryList() {
        return this.enumEntry_;
    }

    public int getFlags() {
        return this.flags_;
    }

    public int getFqName() {
        return this.fqName_;
    }

    public ProtoBuf$Function getFunction(int i) {
        return this.function_.get(i);
    }

    public int getFunctionCount() {
        return this.function_.size();
    }

    public List<ProtoBuf$Function> getFunctionList() {
        return this.function_;
    }

    public int getInlineClassUnderlyingPropertyName() {
        return this.inlineClassUnderlyingPropertyName_;
    }

    public ProtoBuf$Type getInlineClassUnderlyingType() {
        return this.inlineClassUnderlyingType_;
    }

    public int getInlineClassUnderlyingTypeId() {
        return this.inlineClassUnderlyingTypeId_;
    }

    public int getMultiFieldValueClassUnderlyingNameCount() {
        return this.multiFieldValueClassUnderlyingName_.size();
    }

    public List<Integer> getMultiFieldValueClassUnderlyingNameList() {
        return this.multiFieldValueClassUnderlyingName_;
    }

    public ProtoBuf$Type getMultiFieldValueClassUnderlyingType(int i) {
        return this.multiFieldValueClassUnderlyingType_.get(i);
    }

    public int getMultiFieldValueClassUnderlyingTypeCount() {
        return this.multiFieldValueClassUnderlyingType_.size();
    }

    public int getMultiFieldValueClassUnderlyingTypeIdCount() {
        return this.multiFieldValueClassUnderlyingTypeId_.size();
    }

    public List<Integer> getMultiFieldValueClassUnderlyingTypeIdList() {
        return this.multiFieldValueClassUnderlyingTypeId_;
    }

    public List<ProtoBuf$Type> getMultiFieldValueClassUnderlyingTypeList() {
        return this.multiFieldValueClassUnderlyingType_;
    }

    public List<Integer> getNestedClassNameList() {
        return this.nestedClassName_;
    }

    public jm4<ProtoBuf$Class> getParserForType() {
        return PARSER;
    }

    public ProtoBuf$Property getProperty(int i) {
        return this.property_.get(i);
    }

    public int getPropertyCount() {
        return this.property_.size();
    }

    public List<ProtoBuf$Property> getPropertyList() {
        return this.property_;
    }

    public List<Integer> getSealedSubclassFqNameList() {
        return this.sealedSubclassFqName_;
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
        int i3 = 0;
        for (int i4 = 0; i4 < this.supertypeId_.size(); i4++) {
            i3 += CodedOutputStream.m61867p(this.supertypeId_.get(i4).intValue());
        }
        int i5 = i + i3;
        if (!getSupertypeIdList().isEmpty()) {
            i5 = i5 + 1 + CodedOutputStream.m61867p(i3);
        }
        this.supertypeIdMemoizedSerializedSize = i3;
        if ((this.bitField0_ & 2) == 2) {
            i5 += CodedOutputStream.m61866o(3, this.fqName_);
        }
        if ((this.bitField0_ & 4) == 4) {
            i5 += CodedOutputStream.m61866o(4, this.companionObjectName_);
        }
        for (int i6 = 0; i6 < this.typeParameter_.size(); i6++) {
            i5 += CodedOutputStream.m61870s(5, this.typeParameter_.get(i6));
        }
        for (int i7 = 0; i7 < this.supertype_.size(); i7++) {
            i5 += CodedOutputStream.m61870s(6, this.supertype_.get(i7));
        }
        int i8 = 0;
        for (int i9 = 0; i9 < this.nestedClassName_.size(); i9++) {
            i8 += CodedOutputStream.m61867p(this.nestedClassName_.get(i9).intValue());
        }
        int i10 = i5 + i8;
        if (!getNestedClassNameList().isEmpty()) {
            i10 = i10 + 1 + CodedOutputStream.m61867p(i8);
        }
        this.nestedClassNameMemoizedSerializedSize = i8;
        for (int i11 = 0; i11 < this.constructor_.size(); i11++) {
            i10 += CodedOutputStream.m61870s(8, this.constructor_.get(i11));
        }
        for (int i12 = 0; i12 < this.function_.size(); i12++) {
            i10 += CodedOutputStream.m61870s(9, this.function_.get(i12));
        }
        for (int i13 = 0; i13 < this.property_.size(); i13++) {
            i10 += CodedOutputStream.m61870s(10, this.property_.get(i13));
        }
        for (int i14 = 0; i14 < this.typeAlias_.size(); i14++) {
            i10 += CodedOutputStream.m61870s(11, this.typeAlias_.get(i14));
        }
        for (int i15 = 0; i15 < this.enumEntry_.size(); i15++) {
            i10 += CodedOutputStream.m61870s(13, this.enumEntry_.get(i15));
        }
        int i16 = 0;
        for (int i17 = 0; i17 < this.sealedSubclassFqName_.size(); i17++) {
            i16 += CodedOutputStream.m61867p(this.sealedSubclassFqName_.get(i17).intValue());
        }
        int i18 = i10 + i16;
        if (!getSealedSubclassFqNameList().isEmpty()) {
            i18 = i18 + 2 + CodedOutputStream.m61867p(i16);
        }
        this.sealedSubclassFqNameMemoizedSerializedSize = i16;
        if ((this.bitField0_ & 8) == 8) {
            i18 += CodedOutputStream.m61866o(17, this.inlineClassUnderlyingPropertyName_);
        }
        if ((this.bitField0_ & 16) == 16) {
            i18 += CodedOutputStream.m61870s(18, this.inlineClassUnderlyingType_);
        }
        if ((this.bitField0_ & 32) == 32) {
            i18 += CodedOutputStream.m61866o(19, this.inlineClassUnderlyingTypeId_);
        }
        for (int i19 = 0; i19 < this.contextReceiverType_.size(); i19++) {
            i18 += CodedOutputStream.m61870s(20, this.contextReceiverType_.get(i19));
        }
        int i20 = 0;
        for (int i21 = 0; i21 < this.contextReceiverTypeId_.size(); i21++) {
            i20 += CodedOutputStream.m61867p(this.contextReceiverTypeId_.get(i21).intValue());
        }
        int i22 = i18 + i20;
        if (!getContextReceiverTypeIdList().isEmpty()) {
            i22 = i22 + 2 + CodedOutputStream.m61867p(i20);
        }
        this.contextReceiverTypeIdMemoizedSerializedSize = i20;
        int i23 = 0;
        for (int i24 = 0; i24 < this.multiFieldValueClassUnderlyingName_.size(); i24++) {
            i23 += CodedOutputStream.m61867p(this.multiFieldValueClassUnderlyingName_.get(i24).intValue());
        }
        int i25 = i22 + i23;
        if (!getMultiFieldValueClassUnderlyingNameList().isEmpty()) {
            i25 = i25 + 2 + CodedOutputStream.m61867p(i23);
        }
        this.multiFieldValueClassUnderlyingNameMemoizedSerializedSize = i23;
        for (int i26 = 0; i26 < this.multiFieldValueClassUnderlyingType_.size(); i26++) {
            i25 += CodedOutputStream.m61870s(23, this.multiFieldValueClassUnderlyingType_.get(i26));
        }
        int i27 = 0;
        for (int i28 = 0; i28 < this.multiFieldValueClassUnderlyingTypeId_.size(); i28++) {
            i27 += CodedOutputStream.m61867p(this.multiFieldValueClassUnderlyingTypeId_.get(i28).intValue());
        }
        int i29 = i25 + i27;
        if (!getMultiFieldValueClassUnderlyingTypeIdList().isEmpty()) {
            i29 = i29 + 2 + CodedOutputStream.m61867p(i27);
        }
        this.multiFieldValueClassUnderlyingTypeIdMemoizedSerializedSize = i27;
        if ((this.bitField0_ & 64) == 64) {
            i29 += CodedOutputStream.m61870s(30, this.typeTable_);
        }
        int i30 = 0;
        for (int i31 = 0; i31 < this.versionRequirement_.size(); i31++) {
            i30 += CodedOutputStream.m61867p(this.versionRequirement_.get(i31).intValue());
        }
        int size = i29 + i30 + (getVersionRequirementList().size() * 2);
        if ((this.bitField0_ & 128) == 128) {
            size += CodedOutputStream.m61870s(32, this.versionRequirementTable_);
        }
        int extensionsSerializedSize = size + extensionsSerializedSize() + this.unknownFields.size();
        this.memoizedSerializedSize = extensionsSerializedSize;
        return extensionsSerializedSize;
    }

    public ProtoBuf$Type getSupertype(int i) {
        return this.supertype_.get(i);
    }

    public int getSupertypeCount() {
        return this.supertype_.size();
    }

    public List<Integer> getSupertypeIdList() {
        return this.supertypeId_;
    }

    public List<ProtoBuf$Type> getSupertypeList() {
        return this.supertype_;
    }

    public ProtoBuf$TypeAlias getTypeAlias(int i) {
        return this.typeAlias_.get(i);
    }

    public int getTypeAliasCount() {
        return this.typeAlias_.size();
    }

    public List<ProtoBuf$TypeAlias> getTypeAliasList() {
        return this.typeAlias_;
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

    public List<Integer> getVersionRequirementList() {
        return this.versionRequirement_;
    }

    public ProtoBuf$VersionRequirementTable getVersionRequirementTable() {
        return this.versionRequirementTable_;
    }

    public boolean hasCompanionObjectName() {
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

    public boolean hasFqName() {
        if ((this.bitField0_ & 2) == 2) {
            return true;
        }
        return false;
    }

    public boolean hasInlineClassUnderlyingPropertyName() {
        if ((this.bitField0_ & 8) == 8) {
            return true;
        }
        return false;
    }

    public boolean hasInlineClassUnderlyingType() {
        if ((this.bitField0_ & 16) == 16) {
            return true;
        }
        return false;
    }

    public boolean hasInlineClassUnderlyingTypeId() {
        if ((this.bitField0_ & 32) == 32) {
            return true;
        }
        return false;
    }

    public boolean hasTypeTable() {
        if ((this.bitField0_ & 64) == 64) {
            return true;
        }
        return false;
    }

    public boolean hasVersionRequirementTable() {
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
        if (!hasFqName()) {
            this.memoizedIsInitialized = 0;
            return false;
        }
        for (int i = 0; i < getTypeParameterCount(); i++) {
            if (!getTypeParameter(i).isInitialized()) {
                this.memoizedIsInitialized = 0;
                return false;
            }
        }
        for (int i2 = 0; i2 < getSupertypeCount(); i2++) {
            if (!getSupertype(i2).isInitialized()) {
                this.memoizedIsInitialized = 0;
                return false;
            }
        }
        for (int i3 = 0; i3 < getContextReceiverTypeCount(); i3++) {
            if (!getContextReceiverType(i3).isInitialized()) {
                this.memoizedIsInitialized = 0;
                return false;
            }
        }
        for (int i4 = 0; i4 < getConstructorCount(); i4++) {
            if (!getConstructor(i4).isInitialized()) {
                this.memoizedIsInitialized = 0;
                return false;
            }
        }
        for (int i5 = 0; i5 < getFunctionCount(); i5++) {
            if (!getFunction(i5).isInitialized()) {
                this.memoizedIsInitialized = 0;
                return false;
            }
        }
        for (int i6 = 0; i6 < getPropertyCount(); i6++) {
            if (!getProperty(i6).isInitialized()) {
                this.memoizedIsInitialized = 0;
                return false;
            }
        }
        for (int i7 = 0; i7 < getTypeAliasCount(); i7++) {
            if (!getTypeAlias(i7).isInitialized()) {
                this.memoizedIsInitialized = 0;
                return false;
            }
        }
        for (int i8 = 0; i8 < getEnumEntryCount(); i8++) {
            if (!getEnumEntry(i8).isInitialized()) {
                this.memoizedIsInitialized = 0;
                return false;
            }
        }
        if (!hasInlineClassUnderlyingType() || getInlineClassUnderlyingType().isInitialized()) {
            for (int i9 = 0; i9 < getMultiFieldValueClassUnderlyingTypeCount(); i9++) {
                if (!getMultiFieldValueClassUnderlyingType(i9).isInitialized()) {
                    this.memoizedIsInitialized = 0;
                    return false;
                }
            }
            if (hasTypeTable() && !getTypeTable().isInitialized()) {
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
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        getSerializedSize();
        GeneratedMessageLite.ExtendableMessage<MessageType>.C6784a newExtensionWriter = newExtensionWriter();
        if ((this.bitField0_ & 1) == 1) {
            codedOutputStream.mo54614a0(1, this.flags_);
        }
        if (getSupertypeIdList().size() > 0) {
            codedOutputStream.mo54628o0(18);
            codedOutputStream.mo54628o0(this.supertypeIdMemoizedSerializedSize);
        }
        for (int i = 0; i < this.supertypeId_.size(); i++) {
            codedOutputStream.mo54615b0(this.supertypeId_.get(i).intValue());
        }
        if ((this.bitField0_ & 2) == 2) {
            codedOutputStream.mo54614a0(3, this.fqName_);
        }
        if ((this.bitField0_ & 4) == 4) {
            codedOutputStream.mo54614a0(4, this.companionObjectName_);
        }
        for (int i2 = 0; i2 < this.typeParameter_.size(); i2++) {
            codedOutputStream.mo54617d0(5, this.typeParameter_.get(i2));
        }
        for (int i3 = 0; i3 < this.supertype_.size(); i3++) {
            codedOutputStream.mo54617d0(6, this.supertype_.get(i3));
        }
        if (getNestedClassNameList().size() > 0) {
            codedOutputStream.mo54628o0(58);
            codedOutputStream.mo54628o0(this.nestedClassNameMemoizedSerializedSize);
        }
        for (int i4 = 0; i4 < this.nestedClassName_.size(); i4++) {
            codedOutputStream.mo54615b0(this.nestedClassName_.get(i4).intValue());
        }
        for (int i5 = 0; i5 < this.constructor_.size(); i5++) {
            codedOutputStream.mo54617d0(8, this.constructor_.get(i5));
        }
        for (int i6 = 0; i6 < this.function_.size(); i6++) {
            codedOutputStream.mo54617d0(9, this.function_.get(i6));
        }
        for (int i7 = 0; i7 < this.property_.size(); i7++) {
            codedOutputStream.mo54617d0(10, this.property_.get(i7));
        }
        for (int i8 = 0; i8 < this.typeAlias_.size(); i8++) {
            codedOutputStream.mo54617d0(11, this.typeAlias_.get(i8));
        }
        for (int i9 = 0; i9 < this.enumEntry_.size(); i9++) {
            codedOutputStream.mo54617d0(13, this.enumEntry_.get(i9));
        }
        if (getSealedSubclassFqNameList().size() > 0) {
            codedOutputStream.mo54628o0(130);
            codedOutputStream.mo54628o0(this.sealedSubclassFqNameMemoizedSerializedSize);
        }
        for (int i10 = 0; i10 < this.sealedSubclassFqName_.size(); i10++) {
            codedOutputStream.mo54615b0(this.sealedSubclassFqName_.get(i10).intValue());
        }
        if ((this.bitField0_ & 8) == 8) {
            codedOutputStream.mo54614a0(17, this.inlineClassUnderlyingPropertyName_);
        }
        if ((this.bitField0_ & 16) == 16) {
            codedOutputStream.mo54617d0(18, this.inlineClassUnderlyingType_);
        }
        if ((this.bitField0_ & 32) == 32) {
            codedOutputStream.mo54614a0(19, this.inlineClassUnderlyingTypeId_);
        }
        for (int i11 = 0; i11 < this.contextReceiverType_.size(); i11++) {
            codedOutputStream.mo54617d0(20, this.contextReceiverType_.get(i11));
        }
        if (getContextReceiverTypeIdList().size() > 0) {
            codedOutputStream.mo54628o0(170);
            codedOutputStream.mo54628o0(this.contextReceiverTypeIdMemoizedSerializedSize);
        }
        for (int i12 = 0; i12 < this.contextReceiverTypeId_.size(); i12++) {
            codedOutputStream.mo54615b0(this.contextReceiverTypeId_.get(i12).intValue());
        }
        if (getMultiFieldValueClassUnderlyingNameList().size() > 0) {
            codedOutputStream.mo54628o0(178);
            codedOutputStream.mo54628o0(this.multiFieldValueClassUnderlyingNameMemoizedSerializedSize);
        }
        for (int i13 = 0; i13 < this.multiFieldValueClassUnderlyingName_.size(); i13++) {
            codedOutputStream.mo54615b0(this.multiFieldValueClassUnderlyingName_.get(i13).intValue());
        }
        for (int i14 = 0; i14 < this.multiFieldValueClassUnderlyingType_.size(); i14++) {
            codedOutputStream.mo54617d0(23, this.multiFieldValueClassUnderlyingType_.get(i14));
        }
        if (getMultiFieldValueClassUnderlyingTypeIdList().size() > 0) {
            codedOutputStream.mo54628o0(194);
            codedOutputStream.mo54628o0(this.multiFieldValueClassUnderlyingTypeIdMemoizedSerializedSize);
        }
        for (int i15 = 0; i15 < this.multiFieldValueClassUnderlyingTypeId_.size(); i15++) {
            codedOutputStream.mo54615b0(this.multiFieldValueClassUnderlyingTypeId_.get(i15).intValue());
        }
        if ((this.bitField0_ & 64) == 64) {
            codedOutputStream.mo54617d0(30, this.typeTable_);
        }
        for (int i16 = 0; i16 < this.versionRequirement_.size(); i16++) {
            codedOutputStream.mo54614a0(31, this.versionRequirement_.get(i16).intValue());
        }
        if ((this.bitField0_ & 128) == 128) {
            codedOutputStream.mo54617d0(32, this.versionRequirementTable_);
        }
        newExtensionWriter.mo54650a(19000, codedOutputStream);
        codedOutputStream.mo54622i0(this.unknownFields);
    }

    public static C7533b newBuilder(ProtoBuf$Class protoBuf$Class) {
        return newBuilder().mo53896g(protoBuf$Class);
    }

    public ProtoBuf$Class getDefaultInstanceForType() {
        return f39667a;
    }

    public C7533b newBuilderForType() {
        return newBuilder();
    }

    public C7533b toBuilder() {
        return newBuilder(this);
    }

    public ProtoBuf$Class(GeneratedMessageLite.C7602c<ProtoBuf$Class, ?> cVar) {
        super(cVar);
        this.supertypeIdMemoizedSerializedSize = -1;
        this.nestedClassNameMemoizedSerializedSize = -1;
        this.contextReceiverTypeIdMemoizedSerializedSize = -1;
        this.sealedSubclassFqNameMemoizedSerializedSize = -1;
        this.multiFieldValueClassUnderlyingNameMemoizedSerializedSize = -1;
        this.multiFieldValueClassUnderlyingTypeIdMemoizedSerializedSize = -1;
        this.memoizedIsInitialized = -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = cVar.mo54651f();
    }

    public ProtoBuf$Class(boolean z) {
        this.supertypeIdMemoizedSerializedSize = -1;
        this.nestedClassNameMemoizedSerializedSize = -1;
        this.contextReceiverTypeIdMemoizedSerializedSize = -1;
        this.sealedSubclassFqNameMemoizedSerializedSize = -1;
        this.multiFieldValueClassUnderlyingNameMemoizedSerializedSize = -1;
        this.multiFieldValueClassUnderlyingTypeIdMemoizedSerializedSize = -1;
        this.memoizedIsInitialized = -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = c70.f37074a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v0, resolved type: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type$b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v1, resolved type: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type$b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v3, resolved type: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type$b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v82, resolved type: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeTable$b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v6, resolved type: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type$b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v23, resolved type: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$VersionRequirementTable$b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v8, resolved type: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type$b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v9, resolved type: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type$b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v10, resolved type: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type$b} */
    /* JADX WARNING: type inference failed for: r16v4, types: [kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeTable$b] */
    /* JADX WARNING: type inference failed for: r16v7, types: [kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$VersionRequirementTable$b] */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x042a, code lost:
        r12 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x043a, code lost:
        r7 = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:164:0x043f, code lost:
        r5 = r12;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ProtoBuf$Class(kotlin.reflect.jvm.internal.impl.protobuf.C7614c r18, kotlin.reflect.jvm.internal.impl.protobuf.C7616d r19) throws kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException {
        /*
            r17 = this;
            r1 = r17
            r2 = r18
            r3 = r19
            r17.<init>()
            r4 = -1
            r1.supertypeIdMemoizedSerializedSize = r4
            r1.nestedClassNameMemoizedSerializedSize = r4
            r1.contextReceiverTypeIdMemoizedSerializedSize = r4
            r1.sealedSubclassFqNameMemoizedSerializedSize = r4
            r1.multiFieldValueClassUnderlyingNameMemoizedSerializedSize = r4
            r1.multiFieldValueClassUnderlyingTypeIdMemoizedSerializedSize = r4
            r1.memoizedIsInitialized = r4
            r1.memoizedSerializedSize = r4
            r17.mo53928c()
            c70$b r4 = p000.c70.m56312D()
            r5 = 1
            kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream r6 = kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.m61851J(r4, r5)
            r7 = 0
            r8 = r7
        L_0x0028:
            r9 = 524288(0x80000, float:7.34684E-40)
            r5 = 4194304(0x400000, float:5.877472E-39)
            r14 = 1048576(0x100000, float:1.469368E-39)
            r13 = 262144(0x40000, float:3.67342E-40)
            r11 = 128(0x80, float:1.794E-43)
            r10 = 64
            if (r7 != 0) goto L_0x0549
            int r15 = r18.mo54700K()     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            r16 = 0
            switch(r15) {
                case 0: goto L_0x0439;
                case 8: goto L_0x042c;
                case 16: goto L_0x040e;
                case 18: goto L_0x03d9;
                case 24: goto L_0x03cc;
                case 32: goto L_0x03bf;
                case 42: goto L_0x03a4;
                case 50: goto L_0x0388;
                case 56: goto L_0x036c;
                case 58: goto L_0x0338;
                case 66: goto L_0x031c;
                case 74: goto L_0x0300;
                case 82: goto L_0x02e4;
                case 90: goto L_0x02c8;
                case 106: goto L_0x02ac;
                case 128: goto L_0x028e;
                case 130: goto L_0x0258;
                case 136: goto L_0x0249;
                case 146: goto L_0x021c;
                case 152: goto L_0x020d;
                case 162: goto L_0x01f1;
                case 168: goto L_0x01d3;
                case 170: goto L_0x019d;
                case 176: goto L_0x0182;
                case 178: goto L_0x014f;
                case 186: goto L_0x0136;
                case 192: goto L_0x011b;
                case 194: goto L_0x00e8;
                case 242: goto L_0x00bf;
                case 248: goto L_0x00a4;
                case 250: goto L_0x006f;
                case 258: goto L_0x0046;
                default: goto L_0x003f;
            }     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
        L_0x003f:
            r12 = 1
            boolean r5 = r1.parseUnknownField(r2, r6, r3, r15)     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            goto L_0x043c
        L_0x0046:
            int r15 = r1.bitField0_     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            r15 = r15 & r11
            if (r15 != r11) goto L_0x0051
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$VersionRequirementTable r15 = r1.versionRequirementTable_     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$VersionRequirementTable$b r16 = r15.toBuilder()     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
        L_0x0051:
            r15 = r16
            jm4<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$VersionRequirementTable> r12 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$VersionRequirementTable.PARSER     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            kotlin.reflect.jvm.internal.impl.protobuf.h r12 = r2.mo54726u(r12, r3)     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$VersionRequirementTable r12 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$VersionRequirementTable) r12     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            r1.versionRequirementTable_ = r12     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            if (r15 == 0) goto L_0x0068
            r15.mo53896g(r12)     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$VersionRequirementTable r12 = r15.mo54500l()     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            r1.versionRequirementTable_ = r12     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
        L_0x0068:
            int r12 = r1.bitField0_     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            r12 = r12 | r11
            r1.bitField0_ = r12     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            goto L_0x042a
        L_0x006f:
            int r12 = r18.mo54691A()     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            int r12 = r2.mo54715j(r12)     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            r15 = r8 & r5
            if (r15 == r5) goto L_0x0089
            int r15 = r18.mo54712e()     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            if (r15 <= 0) goto L_0x0089
            java.util.ArrayList r15 = new java.util.ArrayList     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            r15.<init>()     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            r1.versionRequirement_ = r15     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            r8 = r8 | r5
        L_0x0089:
            int r15 = r18.mo54712e()     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            if (r15 <= 0) goto L_0x009f
            java.util.List<java.lang.Integer> r15 = r1.versionRequirement_     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            int r16 = r18.mo54724s()     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            java.lang.Integer r11 = java.lang.Integer.valueOf(r16)     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            r15.add(r11)     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            r11 = 128(0x80, float:1.794E-43)
            goto L_0x0089
        L_0x009f:
            r2.mo54714i(r12)     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            goto L_0x042a
        L_0x00a4:
            r11 = r8 & r5
            if (r11 == r5) goto L_0x00b0
            java.util.ArrayList r11 = new java.util.ArrayList     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            r11.<init>()     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            r1.versionRequirement_ = r11     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            r8 = r8 | r5
        L_0x00b0:
            java.util.List<java.lang.Integer> r11 = r1.versionRequirement_     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            int r12 = r18.mo54724s()     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            r11.add(r12)     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            goto L_0x042a
        L_0x00bf:
            int r11 = r1.bitField0_     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            r11 = r11 & r10
            if (r11 != r10) goto L_0x00ca
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeTable r11 = r1.typeTable_     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeTable$b r16 = r11.toBuilder()     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
        L_0x00ca:
            r11 = r16
            jm4<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeTable> r12 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeTable.PARSER     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            kotlin.reflect.jvm.internal.impl.protobuf.h r12 = r2.mo54726u(r12, r3)     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeTable r12 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeTable) r12     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            r1.typeTable_ = r12     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            if (r11 == 0) goto L_0x00e1
            r11.mo53896g(r12)     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeTable r11 = r11.mo54434l()     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            r1.typeTable_ = r11     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
        L_0x00e1:
            int r11 = r1.bitField0_     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            r11 = r11 | r10
            r1.bitField0_ = r11     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            goto L_0x042a
        L_0x00e8:
            int r11 = r18.mo54691A()     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            int r11 = r2.mo54715j(r11)     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            r12 = r8 & r14
            if (r12 == r14) goto L_0x0102
            int r12 = r18.mo54712e()     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            if (r12 <= 0) goto L_0x0102
            java.util.ArrayList r12 = new java.util.ArrayList     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            r12.<init>()     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            r1.multiFieldValueClassUnderlyingTypeId_ = r12     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            r8 = r8 | r14
        L_0x0102:
            int r12 = r18.mo54712e()     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            if (r12 <= 0) goto L_0x0116
            java.util.List<java.lang.Integer> r12 = r1.multiFieldValueClassUnderlyingTypeId_     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            int r15 = r18.mo54724s()     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            java.lang.Integer r15 = java.lang.Integer.valueOf(r15)     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            r12.add(r15)     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            goto L_0x0102
        L_0x0116:
            r2.mo54714i(r11)     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            goto L_0x042a
        L_0x011b:
            r11 = r8 & r14
            if (r11 == r14) goto L_0x0127
            java.util.ArrayList r11 = new java.util.ArrayList     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            r11.<init>()     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            r1.multiFieldValueClassUnderlyingTypeId_ = r11     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            r8 = r8 | r14
        L_0x0127:
            java.util.List<java.lang.Integer> r11 = r1.multiFieldValueClassUnderlyingTypeId_     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            int r12 = r18.mo54724s()     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            r11.add(r12)     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            goto L_0x042a
        L_0x0136:
            r11 = r8 & r9
            if (r11 == r9) goto L_0x0142
            java.util.ArrayList r11 = new java.util.ArrayList     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            r11.<init>()     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            r1.multiFieldValueClassUnderlyingType_ = r11     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            r8 = r8 | r9
        L_0x0142:
            java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type> r11 = r1.multiFieldValueClassUnderlyingType_     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            jm4<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type> r12 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type.PARSER     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            kotlin.reflect.jvm.internal.impl.protobuf.h r12 = r2.mo54726u(r12, r3)     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            r11.add(r12)     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            goto L_0x042a
        L_0x014f:
            int r11 = r18.mo54691A()     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            int r11 = r2.mo54715j(r11)     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            r12 = r8 & r13
            if (r12 == r13) goto L_0x0169
            int r12 = r18.mo54712e()     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            if (r12 <= 0) goto L_0x0169
            java.util.ArrayList r12 = new java.util.ArrayList     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            r12.<init>()     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            r1.multiFieldValueClassUnderlyingName_ = r12     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            r8 = r8 | r13
        L_0x0169:
            int r12 = r18.mo54712e()     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            if (r12 <= 0) goto L_0x017d
            java.util.List<java.lang.Integer> r12 = r1.multiFieldValueClassUnderlyingName_     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            int r15 = r18.mo54724s()     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            java.lang.Integer r15 = java.lang.Integer.valueOf(r15)     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            r12.add(r15)     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            goto L_0x0169
        L_0x017d:
            r2.mo54714i(r11)     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            goto L_0x042a
        L_0x0182:
            r11 = r8 & r13
            if (r11 == r13) goto L_0x018e
            java.util.ArrayList r11 = new java.util.ArrayList     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            r11.<init>()     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            r1.multiFieldValueClassUnderlyingName_ = r11     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            r8 = r8 | r13
        L_0x018e:
            java.util.List<java.lang.Integer> r11 = r1.multiFieldValueClassUnderlyingName_     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            int r12 = r18.mo54724s()     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            r11.add(r12)     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            goto L_0x042a
        L_0x019d:
            int r11 = r18.mo54691A()     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            int r11 = r2.mo54715j(r11)     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            r12 = r8 & 256(0x100, float:3.59E-43)
            r15 = 256(0x100, float:3.59E-43)
            if (r12 == r15) goto L_0x01ba
            int r12 = r18.mo54712e()     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            if (r12 <= 0) goto L_0x01ba
            java.util.ArrayList r12 = new java.util.ArrayList     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            r12.<init>()     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            r1.contextReceiverTypeId_ = r12     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            r8 = r8 | 256(0x100, float:3.59E-43)
        L_0x01ba:
            int r12 = r18.mo54712e()     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            if (r12 <= 0) goto L_0x01ce
            java.util.List<java.lang.Integer> r12 = r1.contextReceiverTypeId_     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            int r15 = r18.mo54724s()     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            java.lang.Integer r15 = java.lang.Integer.valueOf(r15)     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            r12.add(r15)     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            goto L_0x01ba
        L_0x01ce:
            r2.mo54714i(r11)     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            goto L_0x042a
        L_0x01d3:
            r11 = r8 & 256(0x100, float:3.59E-43)
            r12 = 256(0x100, float:3.59E-43)
            if (r11 == r12) goto L_0x01e2
            java.util.ArrayList r11 = new java.util.ArrayList     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            r11.<init>()     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            r1.contextReceiverTypeId_ = r11     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            r8 = r8 | 256(0x100, float:3.59E-43)
        L_0x01e2:
            java.util.List<java.lang.Integer> r11 = r1.contextReceiverTypeId_     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            int r12 = r18.mo54724s()     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            r11.add(r12)     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            goto L_0x042a
        L_0x01f1:
            r11 = r8 & 128(0x80, float:1.794E-43)
            r12 = 128(0x80, float:1.794E-43)
            if (r11 == r12) goto L_0x0200
            java.util.ArrayList r11 = new java.util.ArrayList     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            r11.<init>()     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            r1.contextReceiverType_ = r11     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            r8 = r8 | 128(0x80, float:1.794E-43)
        L_0x0200:
            java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type> r11 = r1.contextReceiverType_     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            jm4<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type> r12 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type.PARSER     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            kotlin.reflect.jvm.internal.impl.protobuf.h r12 = r2.mo54726u(r12, r3)     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            r11.add(r12)     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            goto L_0x042a
        L_0x020d:
            int r11 = r1.bitField0_     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            r12 = 32
            r11 = r11 | r12
            r1.bitField0_ = r11     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            int r11 = r18.mo54724s()     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            r1.inlineClassUnderlyingTypeId_ = r11     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            goto L_0x042a
        L_0x021c:
            int r11 = r1.bitField0_     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            r12 = 16
            r11 = r11 & r12
            if (r11 != r12) goto L_0x0229
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type r11 = r1.inlineClassUnderlyingType_     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type$b r16 = r11.toBuilder()     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
        L_0x0229:
            r11 = r16
            jm4<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type> r12 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type.PARSER     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            kotlin.reflect.jvm.internal.impl.protobuf.h r12 = r2.mo54726u(r12, r3)     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type r12 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type) r12     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            r1.inlineClassUnderlyingType_ = r12     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            if (r11 == 0) goto L_0x0240
            r11.mo53896g(r12)     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type r11 = r11.mo54356r()     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            r1.inlineClassUnderlyingType_ = r11     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
        L_0x0240:
            int r11 = r1.bitField0_     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            r12 = 16
            r11 = r11 | r12
            r1.bitField0_ = r11     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            goto L_0x042a
        L_0x0249:
            int r11 = r1.bitField0_     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            r12 = 8
            r11 = r11 | r12
            r1.bitField0_ = r11     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            int r11 = r18.mo54724s()     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            r1.inlineClassUnderlyingPropertyName_ = r11     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            goto L_0x042a
        L_0x0258:
            int r11 = r18.mo54691A()     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            int r11 = r2.mo54715j(r11)     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            r12 = r8 & 16384(0x4000, float:2.2959E-41)
            r15 = 16384(0x4000, float:2.2959E-41)
            if (r12 == r15) goto L_0x0275
            int r12 = r18.mo54712e()     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            if (r12 <= 0) goto L_0x0275
            java.util.ArrayList r12 = new java.util.ArrayList     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            r12.<init>()     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            r1.sealedSubclassFqName_ = r12     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            r8 = r8 | 16384(0x4000, float:2.2959E-41)
        L_0x0275:
            int r12 = r18.mo54712e()     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            if (r12 <= 0) goto L_0x0289
            java.util.List<java.lang.Integer> r12 = r1.sealedSubclassFqName_     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            int r15 = r18.mo54724s()     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            java.lang.Integer r15 = java.lang.Integer.valueOf(r15)     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            r12.add(r15)     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            goto L_0x0275
        L_0x0289:
            r2.mo54714i(r11)     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            goto L_0x042a
        L_0x028e:
            r11 = r8 & 16384(0x4000, float:2.2959E-41)
            r12 = 16384(0x4000, float:2.2959E-41)
            if (r11 == r12) goto L_0x029d
            java.util.ArrayList r11 = new java.util.ArrayList     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            r11.<init>()     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            r1.sealedSubclassFqName_ = r11     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            r8 = r8 | 16384(0x4000, float:2.2959E-41)
        L_0x029d:
            java.util.List<java.lang.Integer> r11 = r1.sealedSubclassFqName_     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            int r12 = r18.mo54724s()     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            r11.add(r12)     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            goto L_0x042a
        L_0x02ac:
            r11 = r8 & 8192(0x2000, float:1.14794E-41)
            r12 = 8192(0x2000, float:1.14794E-41)
            if (r11 == r12) goto L_0x02bb
            java.util.ArrayList r11 = new java.util.ArrayList     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            r11.<init>()     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            r1.enumEntry_ = r11     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            r8 = r8 | 8192(0x2000, float:1.14794E-41)
        L_0x02bb:
            java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$EnumEntry> r11 = r1.enumEntry_     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            jm4<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$EnumEntry> r12 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$EnumEntry.PARSER     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            kotlin.reflect.jvm.internal.impl.protobuf.h r12 = r2.mo54726u(r12, r3)     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            r11.add(r12)     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            goto L_0x042a
        L_0x02c8:
            r11 = r8 & 4096(0x1000, float:5.74E-42)
            r12 = 4096(0x1000, float:5.74E-42)
            if (r11 == r12) goto L_0x02d7
            java.util.ArrayList r11 = new java.util.ArrayList     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            r11.<init>()     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            r1.typeAlias_ = r11     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            r8 = r8 | 4096(0x1000, float:5.74E-42)
        L_0x02d7:
            java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeAlias> r11 = r1.typeAlias_     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            jm4<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeAlias> r12 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeAlias.PARSER     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            kotlin.reflect.jvm.internal.impl.protobuf.h r12 = r2.mo54726u(r12, r3)     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            r11.add(r12)     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            goto L_0x042a
        L_0x02e4:
            r11 = r8 & 2048(0x800, float:2.87E-42)
            r12 = 2048(0x800, float:2.87E-42)
            if (r11 == r12) goto L_0x02f3
            java.util.ArrayList r11 = new java.util.ArrayList     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            r11.<init>()     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            r1.property_ = r11     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            r8 = r8 | 2048(0x800, float:2.87E-42)
        L_0x02f3:
            java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Property> r11 = r1.property_     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            jm4<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Property> r12 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Property.PARSER     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            kotlin.reflect.jvm.internal.impl.protobuf.h r12 = r2.mo54726u(r12, r3)     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            r11.add(r12)     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            goto L_0x042a
        L_0x0300:
            r11 = r8 & 1024(0x400, float:1.435E-42)
            r12 = 1024(0x400, float:1.435E-42)
            if (r11 == r12) goto L_0x030f
            java.util.ArrayList r11 = new java.util.ArrayList     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            r11.<init>()     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            r1.function_ = r11     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            r8 = r8 | 1024(0x400, float:1.435E-42)
        L_0x030f:
            java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Function> r11 = r1.function_     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            jm4<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Function> r12 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Function.PARSER     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            kotlin.reflect.jvm.internal.impl.protobuf.h r12 = r2.mo54726u(r12, r3)     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            r11.add(r12)     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            goto L_0x042a
        L_0x031c:
            r11 = r8 & 512(0x200, float:7.175E-43)
            r12 = 512(0x200, float:7.175E-43)
            if (r11 == r12) goto L_0x032b
            java.util.ArrayList r11 = new java.util.ArrayList     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            r11.<init>()     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            r1.constructor_ = r11     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            r8 = r8 | 512(0x200, float:7.175E-43)
        L_0x032b:
            java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Constructor> r11 = r1.constructor_     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            jm4<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Constructor> r12 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Constructor.PARSER     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            kotlin.reflect.jvm.internal.impl.protobuf.h r12 = r2.mo54726u(r12, r3)     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            r11.add(r12)     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            goto L_0x042a
        L_0x0338:
            int r11 = r18.mo54691A()     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            int r11 = r2.mo54715j(r11)     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            r12 = r8 & 64
            if (r12 == r10) goto L_0x0353
            int r12 = r18.mo54712e()     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            if (r12 <= 0) goto L_0x0353
            java.util.ArrayList r12 = new java.util.ArrayList     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            r12.<init>()     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            r1.nestedClassName_ = r12     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            r8 = r8 | 64
        L_0x0353:
            int r12 = r18.mo54712e()     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            if (r12 <= 0) goto L_0x0367
            java.util.List<java.lang.Integer> r12 = r1.nestedClassName_     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            int r15 = r18.mo54724s()     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            java.lang.Integer r15 = java.lang.Integer.valueOf(r15)     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            r12.add(r15)     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            goto L_0x0353
        L_0x0367:
            r2.mo54714i(r11)     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            goto L_0x042a
        L_0x036c:
            r11 = r8 & 64
            if (r11 == r10) goto L_0x0379
            java.util.ArrayList r11 = new java.util.ArrayList     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            r11.<init>()     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            r1.nestedClassName_ = r11     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            r8 = r8 | 64
        L_0x0379:
            java.util.List<java.lang.Integer> r11 = r1.nestedClassName_     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            int r12 = r18.mo54724s()     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            r11.add(r12)     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            goto L_0x042a
        L_0x0388:
            r11 = r8 & 16
            r12 = 16
            if (r11 == r12) goto L_0x0397
            java.util.ArrayList r11 = new java.util.ArrayList     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            r11.<init>()     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            r1.supertype_ = r11     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            r8 = r8 | 16
        L_0x0397:
            java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type> r11 = r1.supertype_     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            jm4<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type> r12 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type.PARSER     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            kotlin.reflect.jvm.internal.impl.protobuf.h r12 = r2.mo54726u(r12, r3)     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            r11.add(r12)     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            goto L_0x042a
        L_0x03a4:
            r11 = r8 & 8
            r12 = 8
            if (r11 == r12) goto L_0x03b3
            java.util.ArrayList r11 = new java.util.ArrayList     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            r11.<init>()     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            r1.typeParameter_ = r11     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            r8 = r8 | 8
        L_0x03b3:
            java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeParameter> r11 = r1.typeParameter_     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            jm4<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeParameter> r12 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeParameter.PARSER     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            kotlin.reflect.jvm.internal.impl.protobuf.h r12 = r2.mo54726u(r12, r3)     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            r11.add(r12)     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            goto L_0x042a
        L_0x03bf:
            int r11 = r1.bitField0_     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            r11 = r11 | 4
            r1.bitField0_ = r11     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            int r11 = r18.mo54724s()     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            r1.companionObjectName_ = r11     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            goto L_0x042a
        L_0x03cc:
            int r11 = r1.bitField0_     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            r11 = r11 | 2
            r1.bitField0_ = r11     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            int r11 = r18.mo54724s()     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            r1.fqName_ = r11     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            goto L_0x042a
        L_0x03d9:
            int r11 = r18.mo54691A()     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            int r11 = r2.mo54715j(r11)     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            r12 = r8 & 32
            r15 = 32
            if (r12 == r15) goto L_0x03f6
            int r12 = r18.mo54712e()     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            if (r12 <= 0) goto L_0x03f6
            java.util.ArrayList r12 = new java.util.ArrayList     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            r12.<init>()     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            r1.supertypeId_ = r12     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            r8 = r8 | 32
        L_0x03f6:
            int r12 = r18.mo54712e()     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            if (r12 <= 0) goto L_0x040a
            java.util.List<java.lang.Integer> r12 = r1.supertypeId_     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            int r15 = r18.mo54724s()     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            java.lang.Integer r15 = java.lang.Integer.valueOf(r15)     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            r12.add(r15)     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            goto L_0x03f6
        L_0x040a:
            r2.mo54714i(r11)     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            goto L_0x042a
        L_0x040e:
            r11 = r8 & 32
            r12 = 32
            if (r11 == r12) goto L_0x041d
            java.util.ArrayList r11 = new java.util.ArrayList     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            r11.<init>()     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            r1.supertypeId_ = r11     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            r8 = r8 | 32
        L_0x041d:
            java.util.List<java.lang.Integer> r11 = r1.supertypeId_     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            int r12 = r18.mo54724s()     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            r11.add(r12)     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
        L_0x042a:
            r12 = 1
            goto L_0x043f
        L_0x042c:
            int r11 = r1.bitField0_     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            r12 = 1
            r11 = r11 | r12
            r1.bitField0_ = r11     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            int r11 = r18.mo54724s()     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            r1.flags_ = r11     // Catch:{ InvalidProtocolBufferException -> 0x0455, IOException -> 0x0445 }
            goto L_0x043f
        L_0x0439:
            r12 = 1
        L_0x043a:
            r7 = r12
            goto L_0x043f
        L_0x043c:
            if (r5 != 0) goto L_0x043f
            goto L_0x043a
        L_0x043f:
            r5 = r12
            goto L_0x0028
        L_0x0442:
            r0 = move-exception
            r2 = r0
            goto L_0x045c
        L_0x0445:
            r0 = move-exception
            r2 = r0
            kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException r3 = new kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException     // Catch:{ all -> 0x0442 }
            java.lang.String r2 = r2.getMessage()     // Catch:{ all -> 0x0442 }
            r3.<init>(r2)     // Catch:{ all -> 0x0442 }
            kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException r2 = r3.setUnfinishedMessage(r1)     // Catch:{ all -> 0x0442 }
            throw r2     // Catch:{ all -> 0x0442 }
        L_0x0455:
            r0 = move-exception
            r2 = r0
            kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException r2 = r2.setUnfinishedMessage(r1)     // Catch:{ all -> 0x0442 }
            throw r2     // Catch:{ all -> 0x0442 }
        L_0x045c:
            r3 = r8 & 32
            r7 = 32
            if (r3 != r7) goto L_0x046a
            java.util.List<java.lang.Integer> r3 = r1.supertypeId_
            java.util.List r3 = java.util.Collections.unmodifiableList(r3)
            r1.supertypeId_ = r3
        L_0x046a:
            r3 = r8 & 8
            r7 = 8
            if (r3 != r7) goto L_0x0478
            java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeParameter> r3 = r1.typeParameter_
            java.util.List r3 = java.util.Collections.unmodifiableList(r3)
            r1.typeParameter_ = r3
        L_0x0478:
            r3 = r8 & 16
            r7 = 16
            if (r3 != r7) goto L_0x0486
            java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type> r3 = r1.supertype_
            java.util.List r3 = java.util.Collections.unmodifiableList(r3)
            r1.supertype_ = r3
        L_0x0486:
            r3 = r8 & 64
            if (r3 != r10) goto L_0x0492
            java.util.List<java.lang.Integer> r3 = r1.nestedClassName_
            java.util.List r3 = java.util.Collections.unmodifiableList(r3)
            r1.nestedClassName_ = r3
        L_0x0492:
            r3 = r8 & 512(0x200, float:7.175E-43)
            r7 = 512(0x200, float:7.175E-43)
            if (r3 != r7) goto L_0x04a0
            java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Constructor> r3 = r1.constructor_
            java.util.List r3 = java.util.Collections.unmodifiableList(r3)
            r1.constructor_ = r3
        L_0x04a0:
            r3 = r8 & 1024(0x400, float:1.435E-42)
            r7 = 1024(0x400, float:1.435E-42)
            if (r3 != r7) goto L_0x04ae
            java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Function> r3 = r1.function_
            java.util.List r3 = java.util.Collections.unmodifiableList(r3)
            r1.function_ = r3
        L_0x04ae:
            r3 = r8 & 2048(0x800, float:2.87E-42)
            r7 = 2048(0x800, float:2.87E-42)
            if (r3 != r7) goto L_0x04bc
            java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Property> r3 = r1.property_
            java.util.List r3 = java.util.Collections.unmodifiableList(r3)
            r1.property_ = r3
        L_0x04bc:
            r3 = r8 & 4096(0x1000, float:5.74E-42)
            r7 = 4096(0x1000, float:5.74E-42)
            if (r3 != r7) goto L_0x04ca
            java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeAlias> r3 = r1.typeAlias_
            java.util.List r3 = java.util.Collections.unmodifiableList(r3)
            r1.typeAlias_ = r3
        L_0x04ca:
            r3 = r8 & 8192(0x2000, float:1.14794E-41)
            r7 = 8192(0x2000, float:1.14794E-41)
            if (r3 != r7) goto L_0x04d8
            java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$EnumEntry> r3 = r1.enumEntry_
            java.util.List r3 = java.util.Collections.unmodifiableList(r3)
            r1.enumEntry_ = r3
        L_0x04d8:
            r3 = r8 & 16384(0x4000, float:2.2959E-41)
            r7 = 16384(0x4000, float:2.2959E-41)
            if (r3 != r7) goto L_0x04e6
            java.util.List<java.lang.Integer> r3 = r1.sealedSubclassFqName_
            java.util.List r3 = java.util.Collections.unmodifiableList(r3)
            r1.sealedSubclassFqName_ = r3
        L_0x04e6:
            r3 = r8 & 128(0x80, float:1.794E-43)
            r7 = 128(0x80, float:1.794E-43)
            if (r3 != r7) goto L_0x04f4
            java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type> r3 = r1.contextReceiverType_
            java.util.List r3 = java.util.Collections.unmodifiableList(r3)
            r1.contextReceiverType_ = r3
        L_0x04f4:
            r3 = r8 & 256(0x100, float:3.59E-43)
            r7 = 256(0x100, float:3.59E-43)
            if (r3 != r7) goto L_0x0502
            java.util.List<java.lang.Integer> r3 = r1.contextReceiverTypeId_
            java.util.List r3 = java.util.Collections.unmodifiableList(r3)
            r1.contextReceiverTypeId_ = r3
        L_0x0502:
            r3 = r8 & r13
            if (r3 != r13) goto L_0x050e
            java.util.List<java.lang.Integer> r3 = r1.multiFieldValueClassUnderlyingName_
            java.util.List r3 = java.util.Collections.unmodifiableList(r3)
            r1.multiFieldValueClassUnderlyingName_ = r3
        L_0x050e:
            r3 = r8 & r9
            if (r3 != r9) goto L_0x051a
            java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type> r3 = r1.multiFieldValueClassUnderlyingType_
            java.util.List r3 = java.util.Collections.unmodifiableList(r3)
            r1.multiFieldValueClassUnderlyingType_ = r3
        L_0x051a:
            r3 = r8 & r14
            if (r3 != r14) goto L_0x0526
            java.util.List<java.lang.Integer> r3 = r1.multiFieldValueClassUnderlyingTypeId_
            java.util.List r3 = java.util.Collections.unmodifiableList(r3)
            r1.multiFieldValueClassUnderlyingTypeId_ = r3
        L_0x0526:
            r3 = r8 & r5
            if (r3 != r5) goto L_0x0532
            java.util.List<java.lang.Integer> r3 = r1.versionRequirement_
            java.util.List r3 = java.util.Collections.unmodifiableList(r3)
            r1.versionRequirement_ = r3
        L_0x0532:
            r6.mo54597I()     // Catch:{ IOException -> 0x0535, all -> 0x053c }
        L_0x0535:
            c70 r3 = r4.mo50838d()
            r1.unknownFields = r3
            goto L_0x0545
        L_0x053c:
            r0 = move-exception
            r2 = r0
            c70 r3 = r4.mo50838d()
            r1.unknownFields = r3
            throw r2
        L_0x0545:
            r17.makeExtensionsImmutable()
            throw r2
        L_0x0549:
            r2 = r8 & 32
            r3 = 32
            if (r2 != r3) goto L_0x0557
            java.util.List<java.lang.Integer> r2 = r1.supertypeId_
            java.util.List r2 = java.util.Collections.unmodifiableList(r2)
            r1.supertypeId_ = r2
        L_0x0557:
            r2 = r8 & 8
            r3 = 8
            if (r2 != r3) goto L_0x0565
            java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeParameter> r2 = r1.typeParameter_
            java.util.List r2 = java.util.Collections.unmodifiableList(r2)
            r1.typeParameter_ = r2
        L_0x0565:
            r2 = r8 & 16
            r3 = 16
            if (r2 != r3) goto L_0x0573
            java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type> r2 = r1.supertype_
            java.util.List r2 = java.util.Collections.unmodifiableList(r2)
            r1.supertype_ = r2
        L_0x0573:
            r2 = r8 & 64
            if (r2 != r10) goto L_0x057f
            java.util.List<java.lang.Integer> r2 = r1.nestedClassName_
            java.util.List r2 = java.util.Collections.unmodifiableList(r2)
            r1.nestedClassName_ = r2
        L_0x057f:
            r2 = r8 & 512(0x200, float:7.175E-43)
            r3 = 512(0x200, float:7.175E-43)
            if (r2 != r3) goto L_0x058d
            java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Constructor> r2 = r1.constructor_
            java.util.List r2 = java.util.Collections.unmodifiableList(r2)
            r1.constructor_ = r2
        L_0x058d:
            r2 = r8 & 1024(0x400, float:1.435E-42)
            r3 = 1024(0x400, float:1.435E-42)
            if (r2 != r3) goto L_0x059b
            java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Function> r2 = r1.function_
            java.util.List r2 = java.util.Collections.unmodifiableList(r2)
            r1.function_ = r2
        L_0x059b:
            r2 = r8 & 2048(0x800, float:2.87E-42)
            r3 = 2048(0x800, float:2.87E-42)
            if (r2 != r3) goto L_0x05a9
            java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Property> r2 = r1.property_
            java.util.List r2 = java.util.Collections.unmodifiableList(r2)
            r1.property_ = r2
        L_0x05a9:
            r2 = r8 & 4096(0x1000, float:5.74E-42)
            r3 = 4096(0x1000, float:5.74E-42)
            if (r2 != r3) goto L_0x05b7
            java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeAlias> r2 = r1.typeAlias_
            java.util.List r2 = java.util.Collections.unmodifiableList(r2)
            r1.typeAlias_ = r2
        L_0x05b7:
            r2 = r8 & 8192(0x2000, float:1.14794E-41)
            r3 = 8192(0x2000, float:1.14794E-41)
            if (r2 != r3) goto L_0x05c5
            java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$EnumEntry> r2 = r1.enumEntry_
            java.util.List r2 = java.util.Collections.unmodifiableList(r2)
            r1.enumEntry_ = r2
        L_0x05c5:
            r2 = r8 & 16384(0x4000, float:2.2959E-41)
            r3 = 16384(0x4000, float:2.2959E-41)
            if (r2 != r3) goto L_0x05d3
            java.util.List<java.lang.Integer> r2 = r1.sealedSubclassFqName_
            java.util.List r2 = java.util.Collections.unmodifiableList(r2)
            r1.sealedSubclassFqName_ = r2
        L_0x05d3:
            r2 = r8 & 128(0x80, float:1.794E-43)
            r3 = 128(0x80, float:1.794E-43)
            if (r2 != r3) goto L_0x05e1
            java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type> r2 = r1.contextReceiverType_
            java.util.List r2 = java.util.Collections.unmodifiableList(r2)
            r1.contextReceiverType_ = r2
        L_0x05e1:
            r2 = r8 & 256(0x100, float:3.59E-43)
            r3 = 256(0x100, float:3.59E-43)
            if (r2 != r3) goto L_0x05ef
            java.util.List<java.lang.Integer> r2 = r1.contextReceiverTypeId_
            java.util.List r2 = java.util.Collections.unmodifiableList(r2)
            r1.contextReceiverTypeId_ = r2
        L_0x05ef:
            r2 = r8 & r13
            if (r2 != r13) goto L_0x05fb
            java.util.List<java.lang.Integer> r2 = r1.multiFieldValueClassUnderlyingName_
            java.util.List r2 = java.util.Collections.unmodifiableList(r2)
            r1.multiFieldValueClassUnderlyingName_ = r2
        L_0x05fb:
            r2 = r8 & r9
            if (r2 != r9) goto L_0x0607
            java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type> r2 = r1.multiFieldValueClassUnderlyingType_
            java.util.List r2 = java.util.Collections.unmodifiableList(r2)
            r1.multiFieldValueClassUnderlyingType_ = r2
        L_0x0607:
            r2 = r8 & r14
            if (r2 != r14) goto L_0x0613
            java.util.List<java.lang.Integer> r2 = r1.multiFieldValueClassUnderlyingTypeId_
            java.util.List r2 = java.util.Collections.unmodifiableList(r2)
            r1.multiFieldValueClassUnderlyingTypeId_ = r2
        L_0x0613:
            r2 = r8 & r5
            if (r2 != r5) goto L_0x061f
            java.util.List<java.lang.Integer> r2 = r1.versionRequirement_
            java.util.List r2 = java.util.Collections.unmodifiableList(r2)
            r1.versionRequirement_ = r2
        L_0x061f:
            r6.mo54597I()     // Catch:{ IOException -> 0x0622, all -> 0x0629 }
        L_0x0622:
            c70 r2 = r4.mo50838d()
            r1.unknownFields = r2
            goto L_0x0632
        L_0x0629:
            r0 = move-exception
            r2 = r0
            c70 r3 = r4.mo50838d()
            r1.unknownFields = r3
            throw r2
        L_0x0632:
            r17.makeExtensionsImmutable()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Class.<init>(kotlin.reflect.jvm.internal.impl.protobuf.c, kotlin.reflect.jvm.internal.impl.protobuf.d):void");
    }
}
