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

public final class ProtoBuf$PackageFragment extends GeneratedMessageLite.ExtendableMessage<ProtoBuf$PackageFragment> {
    public static jm4<ProtoBuf$PackageFragment> PARSER = new C7553a();

    /* renamed from: a */
    public static final ProtoBuf$PackageFragment f39754a;
    /* access modifiers changed from: private */
    public int bitField0_;
    /* access modifiers changed from: private */
    public List<ProtoBuf$Class> class__;
    private byte memoizedIsInitialized;
    private int memoizedSerializedSize;
    /* access modifiers changed from: private */
    public ProtoBuf$Package package_;
    /* access modifiers changed from: private */
    public ProtoBuf$QualifiedNameTable qualifiedNames_;
    /* access modifiers changed from: private */
    public ProtoBuf$StringTable strings_;
    /* access modifiers changed from: private */
    public final c70 unknownFields;

    /* renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$PackageFragment$a */
    public static class C7553a extends C7613b<ProtoBuf$PackageFragment> {
        /* renamed from: m */
        public ProtoBuf$PackageFragment mo52753c(C7614c cVar, C7616d dVar) throws InvalidProtocolBufferException {
            return new ProtoBuf$PackageFragment(cVar, dVar);
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$PackageFragment$b */
    public static final class C7554b extends GeneratedMessageLite.C7602c<ProtoBuf$PackageFragment, C7554b> {

        /* renamed from: g */
        public int f39755g;

        /* renamed from: k */
        public ProtoBuf$StringTable f39756k = ProtoBuf$StringTable.getDefaultInstance();

        /* renamed from: r */
        public ProtoBuf$QualifiedNameTable f39757r = ProtoBuf$QualifiedNameTable.getDefaultInstance();

        /* renamed from: s */
        public ProtoBuf$Package f39758s = ProtoBuf$Package.getDefaultInstance();

        /* renamed from: x */
        public List<ProtoBuf$Class> f39759x = Collections.emptyList();

        public C7554b() {
            mo54200w();
        }

        /* renamed from: u */
        public static C7554b m61475u() {
            return new C7554b();
        }

        /* renamed from: B */
        public C7554b mo54194B(ProtoBuf$QualifiedNameTable protoBuf$QualifiedNameTable) {
            if ((this.f39755g & 2) != 2 || this.f39757r == ProtoBuf$QualifiedNameTable.getDefaultInstance()) {
                this.f39757r = protoBuf$QualifiedNameTable;
            } else {
                this.f39757r = ProtoBuf$QualifiedNameTable.newBuilder(this.f39757r).mo53896g(protoBuf$QualifiedNameTable).mo54277l();
            }
            this.f39755g |= 2;
            return this;
        }

        /* renamed from: C */
        public C7554b mo54195C(ProtoBuf$StringTable protoBuf$StringTable) {
            if ((this.f39755g & 1) != 1 || this.f39756k == ProtoBuf$StringTable.getDefaultInstance()) {
                this.f39756k = protoBuf$StringTable;
            } else {
                this.f39756k = ProtoBuf$StringTable.newBuilder(this.f39756k).mo53896g(protoBuf$StringTable).mo54288l();
            }
            this.f39755g |= 1;
            return this;
        }

        /* renamed from: p */
        public ProtoBuf$PackageFragment build() {
            ProtoBuf$PackageFragment r = mo54197r();
            if (r.isInitialized()) {
                return r;
            }
            throw C7610a.C7611a.m61947b(r);
        }

        /* renamed from: r */
        public ProtoBuf$PackageFragment mo54197r() {
            ProtoBuf$PackageFragment protoBuf$PackageFragment = new ProtoBuf$PackageFragment((GeneratedMessageLite.C7602c) this);
            int i = this.f39755g;
            int i2 = 1;
            if ((i & 1) != 1) {
                i2 = 0;
            }
            ProtoBuf$StringTable unused = protoBuf$PackageFragment.strings_ = this.f39756k;
            if ((i & 2) == 2) {
                i2 |= 2;
            }
            ProtoBuf$QualifiedNameTable unused2 = protoBuf$PackageFragment.qualifiedNames_ = this.f39757r;
            if ((i & 4) == 4) {
                i2 |= 4;
            }
            ProtoBuf$Package unused3 = protoBuf$PackageFragment.package_ = this.f39758s;
            if ((this.f39755g & 8) == 8) {
                this.f39759x = Collections.unmodifiableList(this.f39759x);
                this.f39755g &= -9;
            }
            List unused4 = protoBuf$PackageFragment.class__ = this.f39759x;
            int unused5 = protoBuf$PackageFragment.bitField0_ = i2;
            return protoBuf$PackageFragment;
        }

        /* renamed from: t */
        public C7554b mo53895d() {
            return m61475u().mo53896g(mo54197r());
        }

        /* renamed from: v */
        public final void mo54199v() {
            if ((this.f39755g & 8) != 8) {
                this.f39759x = new ArrayList(this.f39759x);
                this.f39755g |= 8;
            }
        }

        /* renamed from: w */
        public final void mo54200w() {
        }

        /* renamed from: x */
        public C7554b mo53896g(ProtoBuf$PackageFragment protoBuf$PackageFragment) {
            if (protoBuf$PackageFragment == ProtoBuf$PackageFragment.getDefaultInstance()) {
                return this;
            }
            if (protoBuf$PackageFragment.hasStrings()) {
                mo54195C(protoBuf$PackageFragment.getStrings());
            }
            if (protoBuf$PackageFragment.hasQualifiedNames()) {
                mo54194B(protoBuf$PackageFragment.getQualifiedNames());
            }
            if (protoBuf$PackageFragment.hasPackage()) {
                mo54203z(protoBuf$PackageFragment.getPackage());
            }
            if (!protoBuf$PackageFragment.class__.isEmpty()) {
                if (this.f39759x.isEmpty()) {
                    this.f39759x = protoBuf$PackageFragment.class__;
                    this.f39755g &= -9;
                } else {
                    mo54199v();
                    this.f39759x.addAll(protoBuf$PackageFragment.class__);
                }
            }
            mo54655m(protoBuf$PackageFragment);
            mo54652h(mo54651f().mo50826j(protoBuf$PackageFragment.unknownFields));
            return this;
        }

        /* renamed from: y */
        public C7554b mo53900n(C7614c cVar, C7616d dVar) throws IOException {
            ProtoBuf$PackageFragment protoBuf$PackageFragment;
            ProtoBuf$PackageFragment protoBuf$PackageFragment2 = null;
            try {
                ProtoBuf$PackageFragment c = ProtoBuf$PackageFragment.PARSER.mo52753c(cVar, dVar);
                if (c != null) {
                    mo53896g(c);
                }
                return this;
            } catch (InvalidProtocolBufferException e) {
                protoBuf$PackageFragment = (ProtoBuf$PackageFragment) e.getUnfinishedMessage();
                throw e;
            } catch (Throwable th) {
                th = th;
                protoBuf$PackageFragment2 = protoBuf$PackageFragment;
            }
            if (protoBuf$PackageFragment2 != null) {
                mo53896g(protoBuf$PackageFragment2);
            }
            throw th;
        }

        /* renamed from: z */
        public C7554b mo54203z(ProtoBuf$Package protoBuf$Package) {
            if ((this.f39755g & 4) != 4 || this.f39758s == ProtoBuf$Package.getDefaultInstance()) {
                this.f39758s = protoBuf$Package;
            } else {
                this.f39758s = ProtoBuf$Package.newBuilder(this.f39758s).mo53896g(protoBuf$Package).mo54176r();
            }
            this.f39755g |= 4;
            return this;
        }
    }

    static {
        ProtoBuf$PackageFragment protoBuf$PackageFragment = new ProtoBuf$PackageFragment(true);
        f39754a = protoBuf$PackageFragment;
        protoBuf$PackageFragment.mo54183c();
    }

    public static ProtoBuf$PackageFragment getDefaultInstance() {
        return f39754a;
    }

    public static C7554b newBuilder() {
        return C7554b.m61475u();
    }

    public static ProtoBuf$PackageFragment parseFrom(InputStream inputStream, C7616d dVar) throws IOException {
        return PARSER.mo52751a(inputStream, dVar);
    }

    /* renamed from: c */
    public final void mo54183c() {
        this.strings_ = ProtoBuf$StringTable.getDefaultInstance();
        this.qualifiedNames_ = ProtoBuf$QualifiedNameTable.getDefaultInstance();
        this.package_ = ProtoBuf$Package.getDefaultInstance();
        this.class__ = Collections.emptyList();
    }

    public ProtoBuf$Class getClass_(int i) {
        return this.class__.get(i);
    }

    public int getClass_Count() {
        return this.class__.size();
    }

    public List<ProtoBuf$Class> getClass_List() {
        return this.class__;
    }

    public ProtoBuf$Package getPackage() {
        return this.package_;
    }

    public jm4<ProtoBuf$PackageFragment> getParserForType() {
        return PARSER;
    }

    public ProtoBuf$QualifiedNameTable getQualifiedNames() {
        return this.qualifiedNames_;
    }

    public int getSerializedSize() {
        int i;
        int i2 = this.memoizedSerializedSize;
        if (i2 != -1) {
            return i2;
        }
        if ((this.bitField0_ & 1) == 1) {
            i = CodedOutputStream.m61870s(1, this.strings_) + 0;
        } else {
            i = 0;
        }
        if ((this.bitField0_ & 2) == 2) {
            i += CodedOutputStream.m61870s(2, this.qualifiedNames_);
        }
        if ((this.bitField0_ & 4) == 4) {
            i += CodedOutputStream.m61870s(3, this.package_);
        }
        for (int i3 = 0; i3 < this.class__.size(); i3++) {
            i += CodedOutputStream.m61870s(4, this.class__.get(i3));
        }
        int extensionsSerializedSize = i + extensionsSerializedSize() + this.unknownFields.size();
        this.memoizedSerializedSize = extensionsSerializedSize;
        return extensionsSerializedSize;
    }

    public ProtoBuf$StringTable getStrings() {
        return this.strings_;
    }

    public boolean hasPackage() {
        if ((this.bitField0_ & 4) == 4) {
            return true;
        }
        return false;
    }

    public boolean hasQualifiedNames() {
        if ((this.bitField0_ & 2) == 2) {
            return true;
        }
        return false;
    }

    public boolean hasStrings() {
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
        if (hasQualifiedNames() && !getQualifiedNames().isInitialized()) {
            this.memoizedIsInitialized = 0;
            return false;
        } else if (!hasPackage() || getPackage().isInitialized()) {
            for (int i = 0; i < getClass_Count(); i++) {
                if (!getClass_(i).isInitialized()) {
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
            codedOutputStream.mo54617d0(1, this.strings_);
        }
        if ((this.bitField0_ & 2) == 2) {
            codedOutputStream.mo54617d0(2, this.qualifiedNames_);
        }
        if ((this.bitField0_ & 4) == 4) {
            codedOutputStream.mo54617d0(3, this.package_);
        }
        for (int i = 0; i < this.class__.size(); i++) {
            codedOutputStream.mo54617d0(4, this.class__.get(i));
        }
        newExtensionWriter.mo54650a(MlKitException.CODE_SCANNER_UNAVAILABLE, codedOutputStream);
        codedOutputStream.mo54622i0(this.unknownFields);
    }

    public static C7554b newBuilder(ProtoBuf$PackageFragment protoBuf$PackageFragment) {
        return newBuilder().mo53896g(protoBuf$PackageFragment);
    }

    public ProtoBuf$PackageFragment getDefaultInstanceForType() {
        return f39754a;
    }

    public C7554b newBuilderForType() {
        return newBuilder();
    }

    public C7554b toBuilder() {
        return newBuilder(this);
    }

    public ProtoBuf$PackageFragment(GeneratedMessageLite.C7602c<ProtoBuf$PackageFragment, ?> cVar) {
        super(cVar);
        this.memoizedIsInitialized = -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = cVar.mo54651f();
    }

    public ProtoBuf$PackageFragment(boolean z) {
        this.memoizedIsInitialized = -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = c70.f37074a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v1, resolved type: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$StringTable$b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v3, resolved type: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$QualifiedNameTable$b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v5, resolved type: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Package$b} */
    /* JADX WARNING: type inference failed for: r8v0 */
    /* JADX WARNING: type inference failed for: r8v7 */
    /* JADX WARNING: type inference failed for: r8v8 */
    /* JADX WARNING: type inference failed for: r8v9 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ProtoBuf$PackageFragment(kotlin.reflect.jvm.internal.impl.protobuf.C7614c r10, kotlin.reflect.jvm.internal.impl.protobuf.C7616d r11) throws kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException {
        /*
            r9 = this;
            r9.<init>()
            r0 = -1
            r9.memoizedIsInitialized = r0
            r9.memoizedSerializedSize = r0
            r9.mo54183c()
            c70$b r0 = p000.c70.m56312D()
            r1 = 1
            kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream r2 = kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.m61851J(r0, r1)
            r3 = 0
            r4 = r3
        L_0x0016:
            r5 = 8
            if (r3 != 0) goto L_0x0104
            int r6 = r10.mo54700K()     // Catch:{ InvalidProtocolBufferException -> 0x00dc, IOException -> 0x00cd }
            if (r6 == 0) goto L_0x00c8
            r7 = 10
            r8 = 0
            if (r6 == r7) goto L_0x00a1
            r7 = 18
            if (r6 == r7) goto L_0x0079
            r7 = 26
            if (r6 == r7) goto L_0x0052
            r7 = 34
            if (r6 == r7) goto L_0x0039
            boolean r5 = r9.parseUnknownField(r10, r2, r11, r6)     // Catch:{ InvalidProtocolBufferException -> 0x00dc, IOException -> 0x00cd }
            if (r5 != 0) goto L_0x0016
            goto L_0x00c8
        L_0x0039:
            r6 = r4 & 8
            if (r6 == r5) goto L_0x0046
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch:{ InvalidProtocolBufferException -> 0x00dc, IOException -> 0x00cd }
            r6.<init>()     // Catch:{ InvalidProtocolBufferException -> 0x00dc, IOException -> 0x00cd }
            r9.class__ = r6     // Catch:{ InvalidProtocolBufferException -> 0x00dc, IOException -> 0x00cd }
            r4 = r4 | 8
        L_0x0046:
            java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Class> r6 = r9.class__     // Catch:{ InvalidProtocolBufferException -> 0x00dc, IOException -> 0x00cd }
            jm4<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Class> r7 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Class.PARSER     // Catch:{ InvalidProtocolBufferException -> 0x00dc, IOException -> 0x00cd }
            kotlin.reflect.jvm.internal.impl.protobuf.h r7 = r10.mo54726u(r7, r11)     // Catch:{ InvalidProtocolBufferException -> 0x00dc, IOException -> 0x00cd }
            r6.add(r7)     // Catch:{ InvalidProtocolBufferException -> 0x00dc, IOException -> 0x00cd }
            goto L_0x0016
        L_0x0052:
            int r6 = r9.bitField0_     // Catch:{ InvalidProtocolBufferException -> 0x00dc, IOException -> 0x00cd }
            r7 = 4
            r6 = r6 & r7
            if (r6 != r7) goto L_0x005e
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Package r6 = r9.package_     // Catch:{ InvalidProtocolBufferException -> 0x00dc, IOException -> 0x00cd }
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Package$b r8 = r6.toBuilder()     // Catch:{ InvalidProtocolBufferException -> 0x00dc, IOException -> 0x00cd }
        L_0x005e:
            jm4<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Package> r6 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Package.PARSER     // Catch:{ InvalidProtocolBufferException -> 0x00dc, IOException -> 0x00cd }
            kotlin.reflect.jvm.internal.impl.protobuf.h r6 = r10.mo54726u(r6, r11)     // Catch:{ InvalidProtocolBufferException -> 0x00dc, IOException -> 0x00cd }
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Package r6 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Package) r6     // Catch:{ InvalidProtocolBufferException -> 0x00dc, IOException -> 0x00cd }
            r9.package_ = r6     // Catch:{ InvalidProtocolBufferException -> 0x00dc, IOException -> 0x00cd }
            if (r8 == 0) goto L_0x0073
            r8.mo53896g(r6)     // Catch:{ InvalidProtocolBufferException -> 0x00dc, IOException -> 0x00cd }
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Package r6 = r8.mo54176r()     // Catch:{ InvalidProtocolBufferException -> 0x00dc, IOException -> 0x00cd }
            r9.package_ = r6     // Catch:{ InvalidProtocolBufferException -> 0x00dc, IOException -> 0x00cd }
        L_0x0073:
            int r6 = r9.bitField0_     // Catch:{ InvalidProtocolBufferException -> 0x00dc, IOException -> 0x00cd }
            r6 = r6 | r7
            r9.bitField0_ = r6     // Catch:{ InvalidProtocolBufferException -> 0x00dc, IOException -> 0x00cd }
            goto L_0x0016
        L_0x0079:
            int r6 = r9.bitField0_     // Catch:{ InvalidProtocolBufferException -> 0x00dc, IOException -> 0x00cd }
            r7 = 2
            r6 = r6 & r7
            if (r6 != r7) goto L_0x0085
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$QualifiedNameTable r6 = r9.qualifiedNames_     // Catch:{ InvalidProtocolBufferException -> 0x00dc, IOException -> 0x00cd }
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$QualifiedNameTable$b r8 = r6.toBuilder()     // Catch:{ InvalidProtocolBufferException -> 0x00dc, IOException -> 0x00cd }
        L_0x0085:
            jm4<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$QualifiedNameTable> r6 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$QualifiedNameTable.PARSER     // Catch:{ InvalidProtocolBufferException -> 0x00dc, IOException -> 0x00cd }
            kotlin.reflect.jvm.internal.impl.protobuf.h r6 = r10.mo54726u(r6, r11)     // Catch:{ InvalidProtocolBufferException -> 0x00dc, IOException -> 0x00cd }
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$QualifiedNameTable r6 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$QualifiedNameTable) r6     // Catch:{ InvalidProtocolBufferException -> 0x00dc, IOException -> 0x00cd }
            r9.qualifiedNames_ = r6     // Catch:{ InvalidProtocolBufferException -> 0x00dc, IOException -> 0x00cd }
            if (r8 == 0) goto L_0x009a
            r8.mo53896g(r6)     // Catch:{ InvalidProtocolBufferException -> 0x00dc, IOException -> 0x00cd }
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$QualifiedNameTable r6 = r8.mo54277l()     // Catch:{ InvalidProtocolBufferException -> 0x00dc, IOException -> 0x00cd }
            r9.qualifiedNames_ = r6     // Catch:{ InvalidProtocolBufferException -> 0x00dc, IOException -> 0x00cd }
        L_0x009a:
            int r6 = r9.bitField0_     // Catch:{ InvalidProtocolBufferException -> 0x00dc, IOException -> 0x00cd }
            r6 = r6 | r7
            r9.bitField0_ = r6     // Catch:{ InvalidProtocolBufferException -> 0x00dc, IOException -> 0x00cd }
            goto L_0x0016
        L_0x00a1:
            int r6 = r9.bitField0_     // Catch:{ InvalidProtocolBufferException -> 0x00dc, IOException -> 0x00cd }
            r6 = r6 & r1
            if (r6 != r1) goto L_0x00ac
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$StringTable r6 = r9.strings_     // Catch:{ InvalidProtocolBufferException -> 0x00dc, IOException -> 0x00cd }
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$StringTable$b r8 = r6.toBuilder()     // Catch:{ InvalidProtocolBufferException -> 0x00dc, IOException -> 0x00cd }
        L_0x00ac:
            jm4<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$StringTable> r6 = kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$StringTable.PARSER     // Catch:{ InvalidProtocolBufferException -> 0x00dc, IOException -> 0x00cd }
            kotlin.reflect.jvm.internal.impl.protobuf.h r6 = r10.mo54726u(r6, r11)     // Catch:{ InvalidProtocolBufferException -> 0x00dc, IOException -> 0x00cd }
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$StringTable r6 = (kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$StringTable) r6     // Catch:{ InvalidProtocolBufferException -> 0x00dc, IOException -> 0x00cd }
            r9.strings_ = r6     // Catch:{ InvalidProtocolBufferException -> 0x00dc, IOException -> 0x00cd }
            if (r8 == 0) goto L_0x00c1
            r8.mo53896g(r6)     // Catch:{ InvalidProtocolBufferException -> 0x00dc, IOException -> 0x00cd }
            kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$StringTable r6 = r8.mo54288l()     // Catch:{ InvalidProtocolBufferException -> 0x00dc, IOException -> 0x00cd }
            r9.strings_ = r6     // Catch:{ InvalidProtocolBufferException -> 0x00dc, IOException -> 0x00cd }
        L_0x00c1:
            int r6 = r9.bitField0_     // Catch:{ InvalidProtocolBufferException -> 0x00dc, IOException -> 0x00cd }
            r6 = r6 | r1
            r9.bitField0_ = r6     // Catch:{ InvalidProtocolBufferException -> 0x00dc, IOException -> 0x00cd }
            goto L_0x0016
        L_0x00c8:
            r3 = r1
            goto L_0x0016
        L_0x00cb:
            r10 = move-exception
            goto L_0x00e2
        L_0x00cd:
            r10 = move-exception
            kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException r11 = new kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException     // Catch:{ all -> 0x00cb }
            java.lang.String r10 = r10.getMessage()     // Catch:{ all -> 0x00cb }
            r11.<init>(r10)     // Catch:{ all -> 0x00cb }
            kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException r10 = r11.setUnfinishedMessage(r9)     // Catch:{ all -> 0x00cb }
            throw r10     // Catch:{ all -> 0x00cb }
        L_0x00dc:
            r10 = move-exception
            kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException r10 = r10.setUnfinishedMessage(r9)     // Catch:{ all -> 0x00cb }
            throw r10     // Catch:{ all -> 0x00cb }
        L_0x00e2:
            r11 = r4 & 8
            if (r11 != r5) goto L_0x00ee
            java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Class> r11 = r9.class__
            java.util.List r11 = java.util.Collections.unmodifiableList(r11)
            r9.class__ = r11
        L_0x00ee:
            r2.mo54597I()     // Catch:{ IOException -> 0x00f1, all -> 0x00f8 }
        L_0x00f1:
            c70 r11 = r0.mo50838d()
            r9.unknownFields = r11
            goto L_0x0100
        L_0x00f8:
            r10 = move-exception
            c70 r11 = r0.mo50838d()
            r9.unknownFields = r11
            throw r10
        L_0x0100:
            r9.makeExtensionsImmutable()
            throw r10
        L_0x0104:
            r10 = r4 & 8
            if (r10 != r5) goto L_0x0110
            java.util.List<kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Class> r10 = r9.class__
            java.util.List r10 = java.util.Collections.unmodifiableList(r10)
            r9.class__ = r10
        L_0x0110:
            r2.mo54597I()     // Catch:{ IOException -> 0x0113, all -> 0x011a }
        L_0x0113:
            c70 r10 = r0.mo50838d()
            r9.unknownFields = r10
            goto L_0x0122
        L_0x011a:
            r10 = move-exception
            c70 r11 = r0.mo50838d()
            r9.unknownFields = r11
            throw r10
        L_0x0122:
            r9.makeExtensionsImmutable()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$PackageFragment.<init>(kotlin.reflect.jvm.internal.impl.protobuf.c, kotlin.reflect.jvm.internal.impl.protobuf.d):void");
    }
}
