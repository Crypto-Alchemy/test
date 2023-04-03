package kotlin.reflect.jvm.internal.impl.metadata;

import com.google.mlkit.common.MlKitException;
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

public final class ProtoBuf$Package extends GeneratedMessageLite.ExtendableMessage<ProtoBuf$Package> {
    public static jm4<ProtoBuf$Package> PARSER = new C7551a();

    /* renamed from: a */
    public static final ProtoBuf$Package f39747a;
    /* access modifiers changed from: private */
    public int bitField0_;
    /* access modifiers changed from: private */
    public List<ProtoBuf$Function> function_;
    private byte memoizedIsInitialized;
    private int memoizedSerializedSize;
    /* access modifiers changed from: private */
    public List<ProtoBuf$Property> property_;
    /* access modifiers changed from: private */
    public List<ProtoBuf$TypeAlias> typeAlias_;
    /* access modifiers changed from: private */
    public ProtoBuf$TypeTable typeTable_;
    /* access modifiers changed from: private */
    public final c70 unknownFields;
    /* access modifiers changed from: private */
    public ProtoBuf$VersionRequirementTable versionRequirementTable_;

    /* renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Package$a */
    public static class C7551a extends C7613b<ProtoBuf$Package> {
        /* renamed from: m */
        public ProtoBuf$Package mo52753c(C7614c cVar, C7616d dVar) throws InvalidProtocolBufferException {
            return new ProtoBuf$Package(cVar, dVar);
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Package$b */
    public static final class C7552b extends GeneratedMessageLite.C7602c<ProtoBuf$Package, C7552b> {

        /* renamed from: g */
        public int f39748g;

        /* renamed from: k */
        public List<ProtoBuf$Function> f39749k = Collections.emptyList();

        /* renamed from: r */
        public List<ProtoBuf$Property> f39750r = Collections.emptyList();

        /* renamed from: s */
        public List<ProtoBuf$TypeAlias> f39751s = Collections.emptyList();

        /* renamed from: x */
        public ProtoBuf$TypeTable f39752x = ProtoBuf$TypeTable.getDefaultInstance();

        /* renamed from: y */
        public ProtoBuf$VersionRequirementTable f39753y = ProtoBuf$VersionRequirementTable.getDefaultInstance();

        public C7552b() {
            mo54181y();
        }

        /* renamed from: u */
        public static C7552b m61455u() {
            return new C7552b();
        }

        /* renamed from: B */
        public C7552b mo53900n(C7614c cVar, C7616d dVar) throws IOException {
            ProtoBuf$Package protoBuf$Package;
            ProtoBuf$Package protoBuf$Package2 = null;
            try {
                ProtoBuf$Package c = ProtoBuf$Package.PARSER.mo52753c(cVar, dVar);
                if (c != null) {
                    mo53896g(c);
                }
                return this;
            } catch (InvalidProtocolBufferException e) {
                protoBuf$Package = (ProtoBuf$Package) e.getUnfinishedMessage();
                throw e;
            } catch (Throwable th) {
                th = th;
                protoBuf$Package2 = protoBuf$Package;
            }
            if (protoBuf$Package2 != null) {
                mo53896g(protoBuf$Package2);
            }
            throw th;
        }

        /* renamed from: C */
        public C7552b mo54173C(ProtoBuf$TypeTable protoBuf$TypeTable) {
            if ((this.f39748g & 8) != 8 || this.f39752x == ProtoBuf$TypeTable.getDefaultInstance()) {
                this.f39752x = protoBuf$TypeTable;
            } else {
                this.f39752x = ProtoBuf$TypeTable.newBuilder(this.f39752x).mo53896g(protoBuf$TypeTable).mo54434l();
            }
            this.f39748g |= 8;
            return this;
        }

        /* renamed from: D */
        public C7552b mo54174D(ProtoBuf$VersionRequirementTable protoBuf$VersionRequirementTable) {
            if ((this.f39748g & 16) != 16 || this.f39753y == ProtoBuf$VersionRequirementTable.getDefaultInstance()) {
                this.f39753y = protoBuf$VersionRequirementTable;
            } else {
                this.f39753y = ProtoBuf$VersionRequirementTable.newBuilder(this.f39753y).mo53896g(protoBuf$VersionRequirementTable).mo54500l();
            }
            this.f39748g |= 16;
            return this;
        }

        /* renamed from: p */
        public ProtoBuf$Package build() {
            ProtoBuf$Package r = mo54176r();
            if (r.isInitialized()) {
                return r;
            }
            throw C7610a.C7611a.m61947b(r);
        }

        /* renamed from: r */
        public ProtoBuf$Package mo54176r() {
            ProtoBuf$Package protoBuf$Package = new ProtoBuf$Package((GeneratedMessageLite.C7602c) this);
            int i = this.f39748g;
            int i2 = 1;
            if ((i & 1) == 1) {
                this.f39749k = Collections.unmodifiableList(this.f39749k);
                this.f39748g &= -2;
            }
            List unused = protoBuf$Package.function_ = this.f39749k;
            if ((this.f39748g & 2) == 2) {
                this.f39750r = Collections.unmodifiableList(this.f39750r);
                this.f39748g &= -3;
            }
            List unused2 = protoBuf$Package.property_ = this.f39750r;
            if ((this.f39748g & 4) == 4) {
                this.f39751s = Collections.unmodifiableList(this.f39751s);
                this.f39748g &= -5;
            }
            List unused3 = protoBuf$Package.typeAlias_ = this.f39751s;
            if ((i & 8) != 8) {
                i2 = 0;
            }
            ProtoBuf$TypeTable unused4 = protoBuf$Package.typeTable_ = this.f39752x;
            if ((i & 16) == 16) {
                i2 |= 2;
            }
            ProtoBuf$VersionRequirementTable unused5 = protoBuf$Package.versionRequirementTable_ = this.f39753y;
            int unused6 = protoBuf$Package.bitField0_ = i2;
            return protoBuf$Package;
        }

        /* renamed from: t */
        public C7552b mo53895d() {
            return m61455u().mo53896g(mo54176r());
        }

        /* renamed from: v */
        public final void mo54178v() {
            if ((this.f39748g & 1) != 1) {
                this.f39749k = new ArrayList(this.f39749k);
                this.f39748g |= 1;
            }
        }

        /* renamed from: w */
        public final void mo54179w() {
            if ((this.f39748g & 2) != 2) {
                this.f39750r = new ArrayList(this.f39750r);
                this.f39748g |= 2;
            }
        }

        /* renamed from: x */
        public final void mo54180x() {
            if ((this.f39748g & 4) != 4) {
                this.f39751s = new ArrayList(this.f39751s);
                this.f39748g |= 4;
            }
        }

        /* renamed from: y */
        public final void mo54181y() {
        }

        /* renamed from: z */
        public C7552b mo53896g(ProtoBuf$Package protoBuf$Package) {
            if (protoBuf$Package == ProtoBuf$Package.getDefaultInstance()) {
                return this;
            }
            if (!protoBuf$Package.function_.isEmpty()) {
                if (this.f39749k.isEmpty()) {
                    this.f39749k = protoBuf$Package.function_;
                    this.f39748g &= -2;
                } else {
                    mo54178v();
                    this.f39749k.addAll(protoBuf$Package.function_);
                }
            }
            if (!protoBuf$Package.property_.isEmpty()) {
                if (this.f39750r.isEmpty()) {
                    this.f39750r = protoBuf$Package.property_;
                    this.f39748g &= -3;
                } else {
                    mo54179w();
                    this.f39750r.addAll(protoBuf$Package.property_);
                }
            }
            if (!protoBuf$Package.typeAlias_.isEmpty()) {
                if (this.f39751s.isEmpty()) {
                    this.f39751s = protoBuf$Package.typeAlias_;
                    this.f39748g &= -5;
                } else {
                    mo54180x();
                    this.f39751s.addAll(protoBuf$Package.typeAlias_);
                }
            }
            if (protoBuf$Package.hasTypeTable()) {
                mo54173C(protoBuf$Package.getTypeTable());
            }
            if (protoBuf$Package.hasVersionRequirementTable()) {
                mo54174D(protoBuf$Package.getVersionRequirementTable());
            }
            mo54655m(protoBuf$Package);
            mo54652h(mo54651f().mo50826j(protoBuf$Package.unknownFields));
            return this;
        }
    }

    static {
        ProtoBuf$Package protoBuf$Package = new ProtoBuf$Package(true);
        f39747a = protoBuf$Package;
        protoBuf$Package.mo54157c();
    }

    public static ProtoBuf$Package getDefaultInstance() {
        return f39747a;
    }

    public static C7552b newBuilder() {
        return C7552b.m61455u();
    }

    public static ProtoBuf$Package parseFrom(InputStream inputStream, C7616d dVar) throws IOException {
        return PARSER.mo52751a(inputStream, dVar);
    }

    /* renamed from: c */
    public final void mo54157c() {
        this.function_ = Collections.emptyList();
        this.property_ = Collections.emptyList();
        this.typeAlias_ = Collections.emptyList();
        this.typeTable_ = ProtoBuf$TypeTable.getDefaultInstance();
        this.versionRequirementTable_ = ProtoBuf$VersionRequirementTable.getDefaultInstance();
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

    public jm4<ProtoBuf$Package> getParserForType() {
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

    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.function_.size(); i3++) {
            i2 += CodedOutputStream.m61870s(3, this.function_.get(i3));
        }
        for (int i4 = 0; i4 < this.property_.size(); i4++) {
            i2 += CodedOutputStream.m61870s(4, this.property_.get(i4));
        }
        for (int i5 = 0; i5 < this.typeAlias_.size(); i5++) {
            i2 += CodedOutputStream.m61870s(5, this.typeAlias_.get(i5));
        }
        if ((this.bitField0_ & 1) == 1) {
            i2 += CodedOutputStream.m61870s(30, this.typeTable_);
        }
        if ((this.bitField0_ & 2) == 2) {
            i2 += CodedOutputStream.m61870s(32, this.versionRequirementTable_);
        }
        int extensionsSerializedSize = i2 + extensionsSerializedSize() + this.unknownFields.size();
        this.memoizedSerializedSize = extensionsSerializedSize;
        return extensionsSerializedSize;
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

    public ProtoBuf$TypeTable getTypeTable() {
        return this.typeTable_;
    }

    public ProtoBuf$VersionRequirementTable getVersionRequirementTable() {
        return this.versionRequirementTable_;
    }

    public boolean hasTypeTable() {
        if ((this.bitField0_ & 1) == 1) {
            return true;
        }
        return false;
    }

    public boolean hasVersionRequirementTable() {
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
        for (int i = 0; i < getFunctionCount(); i++) {
            if (!getFunction(i).isInitialized()) {
                this.memoizedIsInitialized = 0;
                return false;
            }
        }
        for (int i2 = 0; i2 < getPropertyCount(); i2++) {
            if (!getProperty(i2).isInitialized()) {
                this.memoizedIsInitialized = 0;
                return false;
            }
        }
        for (int i3 = 0; i3 < getTypeAliasCount(); i3++) {
            if (!getTypeAlias(i3).isInitialized()) {
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
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        getSerializedSize();
        GeneratedMessageLite.ExtendableMessage<MessageType>.C6784a newExtensionWriter = newExtensionWriter();
        for (int i = 0; i < this.function_.size(); i++) {
            codedOutputStream.mo54617d0(3, this.function_.get(i));
        }
        for (int i2 = 0; i2 < this.property_.size(); i2++) {
            codedOutputStream.mo54617d0(4, this.property_.get(i2));
        }
        for (int i3 = 0; i3 < this.typeAlias_.size(); i3++) {
            codedOutputStream.mo54617d0(5, this.typeAlias_.get(i3));
        }
        if ((this.bitField0_ & 1) == 1) {
            codedOutputStream.mo54617d0(30, this.typeTable_);
        }
        if ((this.bitField0_ & 2) == 2) {
            codedOutputStream.mo54617d0(32, this.versionRequirementTable_);
        }
        newExtensionWriter.mo54650a(MlKitException.CODE_SCANNER_UNAVAILABLE, codedOutputStream);
        codedOutputStream.mo54622i0(this.unknownFields);
    }

    public static C7552b newBuilder(ProtoBuf$Package protoBuf$Package) {
        return newBuilder().mo53896g(protoBuf$Package);
    }

    public ProtoBuf$Package getDefaultInstanceForType() {
        return f39747a;
    }

    public C7552b newBuilderForType() {
        return newBuilder();
    }

    public C7552b toBuilder() {
        return newBuilder(this);
    }

    public ProtoBuf$Package(GeneratedMessageLite.C7602c<ProtoBuf$Package, ?> cVar) {
        super(cVar);
        this.memoizedIsInitialized = -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = cVar.mo54651f();
    }

    public ProtoBuf$Package(boolean z) {
        this.memoizedIsInitialized = -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = c70.f37074a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v1, resolved type: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeTable$b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v3, resolved type: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$VersionRequirementTable$b} */
    /* JADX WARNING: type inference failed for: r9v0 */
    /* JADX WARNING: type inference failed for: r9v5 */
    /* JADX WARNING: type inference failed for: r9v6 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ProtoBuf$Package(kotlin.reflect.jvm.internal.impl.protobuf.C7614c r11, kotlin.reflect.jvm.internal.impl.protobuf.C7616d r12) throws kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException {
        /*
            r10 = this;
            r10.<init>()
            r0 = -1
            r10.memoizedIsInitialized = r0
            r10.memoizedSerializedSize = r0
            r10.mo54157c()
            c70$b r0 = p000.c70.m56312D()
            r1 = 1
            kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream r2 = kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.m61851J(r0, r1)
            r3 = 0
            r4 = r3
        L_0x0016:
            r5 = 4
            r6 = 2
            if (r3 != 0) goto L_0x012b
            int r7 = r11.mo54700K()     // Catch:{ InvalidProtocolBufferException -> 0x00eb, IOException -> 0x00dc }
            if (r7 == 0) goto L_0x00d7
            r8 = 26
            if (r7 == r8) goto L_0x00bd
            r8 = 34
            if (r7 == r8) goto L_0x00a3
            r8 = 42
            if (r7 == r8) goto L_0x0089
            r8 = 242(0xf2, float:3.39E-43)
            r9 = 0
            if (r7 == r8) goto L_0x0063
            r8 = 258(0x102, float:3.62E-43)
            if (r7 == r8) goto L_0x003d
            boolean r5 = r10.parseUnknownField(r11, r2, r12, r7)     // Catch:{ InvalidProtocolBufferException -> 0x00eb, IOException -> 0x00dc }
            if (r5 != 0) goto L_0x0016
            goto L_0x00d7
        L_0x003d:
            int r7 = r10.bitField0_     // Catch:{ InvalidProtocolBufferException -> 0x00eb, IOException -> 0x00dc }
            r7 = r7 & r6
            if (r7 != r6) goto L_0x0048
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$VersionRequirementTable r7 = r10.versionRequirementTable_     // Catch:{ InvalidProtocolBufferException -> 0x00eb, IOException -> 0x00dc }
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$VersionRequirementTable$b r9 = r7.toBuilder()     // Catch:{ InvalidProtocolBufferException -> 0x00eb, IOException -> 0x00dc }
        L_0x0048:
            jm4<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$VersionRequirementTable> r7 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$VersionRequirementTable.PARSER     // Catch:{ InvalidProtocolBufferException -> 0x00eb, IOException -> 0x00dc }
            kotlin.reflect.jvm.internal.impl.protobuf.h r7 = r11.mo54726u(r7, r12)     // Catch:{ InvalidProtocolBufferException -> 0x00eb, IOException -> 0x00dc }
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$VersionRequirementTable r7 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$VersionRequirementTable) r7     // Catch:{ InvalidProtocolBufferException -> 0x00eb, IOException -> 0x00dc }
            r10.versionRequirementTable_ = r7     // Catch:{ InvalidProtocolBufferException -> 0x00eb, IOException -> 0x00dc }
            if (r9 == 0) goto L_0x005d
            r9.mo53896g(r7)     // Catch:{ InvalidProtocolBufferException -> 0x00eb, IOException -> 0x00dc }
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$VersionRequirementTable r7 = r9.mo54500l()     // Catch:{ InvalidProtocolBufferException -> 0x00eb, IOException -> 0x00dc }
            r10.versionRequirementTable_ = r7     // Catch:{ InvalidProtocolBufferException -> 0x00eb, IOException -> 0x00dc }
        L_0x005d:
            int r7 = r10.bitField0_     // Catch:{ InvalidProtocolBufferException -> 0x00eb, IOException -> 0x00dc }
            r7 = r7 | r6
            r10.bitField0_ = r7     // Catch:{ InvalidProtocolBufferException -> 0x00eb, IOException -> 0x00dc }
            goto L_0x0016
        L_0x0063:
            int r7 = r10.bitField0_     // Catch:{ InvalidProtocolBufferException -> 0x00eb, IOException -> 0x00dc }
            r7 = r7 & r1
            if (r7 != r1) goto L_0x006e
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeTable r7 = r10.typeTable_     // Catch:{ InvalidProtocolBufferException -> 0x00eb, IOException -> 0x00dc }
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeTable$b r9 = r7.toBuilder()     // Catch:{ InvalidProtocolBufferException -> 0x00eb, IOException -> 0x00dc }
        L_0x006e:
            jm4<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeTable> r7 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeTable.PARSER     // Catch:{ InvalidProtocolBufferException -> 0x00eb, IOException -> 0x00dc }
            kotlin.reflect.jvm.internal.impl.protobuf.h r7 = r11.mo54726u(r7, r12)     // Catch:{ InvalidProtocolBufferException -> 0x00eb, IOException -> 0x00dc }
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeTable r7 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeTable) r7     // Catch:{ InvalidProtocolBufferException -> 0x00eb, IOException -> 0x00dc }
            r10.typeTable_ = r7     // Catch:{ InvalidProtocolBufferException -> 0x00eb, IOException -> 0x00dc }
            if (r9 == 0) goto L_0x0083
            r9.mo53896g(r7)     // Catch:{ InvalidProtocolBufferException -> 0x00eb, IOException -> 0x00dc }
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeTable r7 = r9.mo54434l()     // Catch:{ InvalidProtocolBufferException -> 0x00eb, IOException -> 0x00dc }
            r10.typeTable_ = r7     // Catch:{ InvalidProtocolBufferException -> 0x00eb, IOException -> 0x00dc }
        L_0x0083:
            int r7 = r10.bitField0_     // Catch:{ InvalidProtocolBufferException -> 0x00eb, IOException -> 0x00dc }
            r7 = r7 | r1
            r10.bitField0_ = r7     // Catch:{ InvalidProtocolBufferException -> 0x00eb, IOException -> 0x00dc }
            goto L_0x0016
        L_0x0089:
            r7 = r4 & 4
            if (r7 == r5) goto L_0x0096
            java.util.ArrayList r7 = new java.util.ArrayList     // Catch:{ InvalidProtocolBufferException -> 0x00eb, IOException -> 0x00dc }
            r7.<init>()     // Catch:{ InvalidProtocolBufferException -> 0x00eb, IOException -> 0x00dc }
            r10.typeAlias_ = r7     // Catch:{ InvalidProtocolBufferException -> 0x00eb, IOException -> 0x00dc }
            r4 = r4 | 4
        L_0x0096:
            java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeAlias> r7 = r10.typeAlias_     // Catch:{ InvalidProtocolBufferException -> 0x00eb, IOException -> 0x00dc }
            jm4<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeAlias> r8 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeAlias.PARSER     // Catch:{ InvalidProtocolBufferException -> 0x00eb, IOException -> 0x00dc }
            kotlin.reflect.jvm.internal.impl.protobuf.h r8 = r11.mo54726u(r8, r12)     // Catch:{ InvalidProtocolBufferException -> 0x00eb, IOException -> 0x00dc }
            r7.add(r8)     // Catch:{ InvalidProtocolBufferException -> 0x00eb, IOException -> 0x00dc }
            goto L_0x0016
        L_0x00a3:
            r7 = r4 & 2
            if (r7 == r6) goto L_0x00b0
            java.util.ArrayList r7 = new java.util.ArrayList     // Catch:{ InvalidProtocolBufferException -> 0x00eb, IOException -> 0x00dc }
            r7.<init>()     // Catch:{ InvalidProtocolBufferException -> 0x00eb, IOException -> 0x00dc }
            r10.property_ = r7     // Catch:{ InvalidProtocolBufferException -> 0x00eb, IOException -> 0x00dc }
            r4 = r4 | 2
        L_0x00b0:
            java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Property> r7 = r10.property_     // Catch:{ InvalidProtocolBufferException -> 0x00eb, IOException -> 0x00dc }
            jm4<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Property> r8 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Property.PARSER     // Catch:{ InvalidProtocolBufferException -> 0x00eb, IOException -> 0x00dc }
            kotlin.reflect.jvm.internal.impl.protobuf.h r8 = r11.mo54726u(r8, r12)     // Catch:{ InvalidProtocolBufferException -> 0x00eb, IOException -> 0x00dc }
            r7.add(r8)     // Catch:{ InvalidProtocolBufferException -> 0x00eb, IOException -> 0x00dc }
            goto L_0x0016
        L_0x00bd:
            r7 = r4 & 1
            if (r7 == r1) goto L_0x00ca
            java.util.ArrayList r7 = new java.util.ArrayList     // Catch:{ InvalidProtocolBufferException -> 0x00eb, IOException -> 0x00dc }
            r7.<init>()     // Catch:{ InvalidProtocolBufferException -> 0x00eb, IOException -> 0x00dc }
            r10.function_ = r7     // Catch:{ InvalidProtocolBufferException -> 0x00eb, IOException -> 0x00dc }
            r4 = r4 | 1
        L_0x00ca:
            java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Function> r7 = r10.function_     // Catch:{ InvalidProtocolBufferException -> 0x00eb, IOException -> 0x00dc }
            jm4<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Function> r8 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Function.PARSER     // Catch:{ InvalidProtocolBufferException -> 0x00eb, IOException -> 0x00dc }
            kotlin.reflect.jvm.internal.impl.protobuf.h r8 = r11.mo54726u(r8, r12)     // Catch:{ InvalidProtocolBufferException -> 0x00eb, IOException -> 0x00dc }
            r7.add(r8)     // Catch:{ InvalidProtocolBufferException -> 0x00eb, IOException -> 0x00dc }
            goto L_0x0016
        L_0x00d7:
            r3 = r1
            goto L_0x0016
        L_0x00da:
            r11 = move-exception
            goto L_0x00f1
        L_0x00dc:
            r11 = move-exception
            kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException r12 = new kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException     // Catch:{ all -> 0x00da }
            java.lang.String r11 = r11.getMessage()     // Catch:{ all -> 0x00da }
            r12.<init>(r11)     // Catch:{ all -> 0x00da }
            kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException r11 = r12.setUnfinishedMessage(r10)     // Catch:{ all -> 0x00da }
            throw r11     // Catch:{ all -> 0x00da }
        L_0x00eb:
            r11 = move-exception
            kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException r11 = r11.setUnfinishedMessage(r10)     // Catch:{ all -> 0x00da }
            throw r11     // Catch:{ all -> 0x00da }
        L_0x00f1:
            r12 = r4 & 1
            if (r12 != r1) goto L_0x00fd
            java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Function> r12 = r10.function_
            java.util.List r12 = java.util.Collections.unmodifiableList(r12)
            r10.function_ = r12
        L_0x00fd:
            r12 = r4 & 2
            if (r12 != r6) goto L_0x0109
            java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Property> r12 = r10.property_
            java.util.List r12 = java.util.Collections.unmodifiableList(r12)
            r10.property_ = r12
        L_0x0109:
            r12 = r4 & 4
            if (r12 != r5) goto L_0x0115
            java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeAlias> r12 = r10.typeAlias_
            java.util.List r12 = java.util.Collections.unmodifiableList(r12)
            r10.typeAlias_ = r12
        L_0x0115:
            r2.mo54597I()     // Catch:{ IOException -> 0x0118, all -> 0x011f }
        L_0x0118:
            c70 r12 = r0.mo50838d()
            r10.unknownFields = r12
            goto L_0x0127
        L_0x011f:
            r11 = move-exception
            c70 r12 = r0.mo50838d()
            r10.unknownFields = r12
            throw r11
        L_0x0127:
            r10.makeExtensionsImmutable()
            throw r11
        L_0x012b:
            r11 = r4 & 1
            if (r11 != r1) goto L_0x0137
            java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Function> r11 = r10.function_
            java.util.List r11 = java.util.Collections.unmodifiableList(r11)
            r10.function_ = r11
        L_0x0137:
            r11 = r4 & 2
            if (r11 != r6) goto L_0x0143
            java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Property> r11 = r10.property_
            java.util.List r11 = java.util.Collections.unmodifiableList(r11)
            r10.property_ = r11
        L_0x0143:
            r11 = r4 & 4
            if (r11 != r5) goto L_0x014f
            java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeAlias> r11 = r10.typeAlias_
            java.util.List r11 = java.util.Collections.unmodifiableList(r11)
            r10.typeAlias_ = r11
        L_0x014f:
            r2.mo54597I()     // Catch:{ IOException -> 0x0152, all -> 0x0159 }
        L_0x0152:
            c70 r11 = r0.mo50838d()
            r10.unknownFields = r11
            goto L_0x0161
        L_0x0159:
            r11 = move-exception
            c70 r12 = r0.mo50838d()
            r10.unknownFields = r12
            throw r11
        L_0x0161:
            r10.makeExtensionsImmutable()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Package.<init>(kotlin.reflect.jvm.internal.impl.protobuf.c, kotlin.reflect.jvm.internal.impl.protobuf.d):void");
    }
}
