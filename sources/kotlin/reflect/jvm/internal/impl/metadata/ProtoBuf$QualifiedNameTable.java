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

public final class ProtoBuf$QualifiedNameTable extends GeneratedMessageLite implements ru3 {
    public static jm4<ProtoBuf$QualifiedNameTable> PARSER = new C7560a();

    /* renamed from: a */
    public static final ProtoBuf$QualifiedNameTable f39776a;
    private byte memoizedIsInitialized;
    private int memoizedSerializedSize;
    /* access modifiers changed from: private */
    public List<QualifiedName> qualifiedName_;
    /* access modifiers changed from: private */
    public final c70 unknownFields;

    public static final class QualifiedName extends GeneratedMessageLite implements ru3 {
        public static jm4<QualifiedName> PARSER = new C7558a();

        /* renamed from: a */
        public static final QualifiedName f39777a;
        /* access modifiers changed from: private */
        public int bitField0_;
        /* access modifiers changed from: private */
        public Kind kind_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        /* access modifiers changed from: private */
        public int parentQualifiedName_;
        /* access modifiers changed from: private */
        public int shortName_;
        /* access modifiers changed from: private */
        public final c70 unknownFields;

        public enum Kind implements C7621f.C7622a {
            CLASS(0, 0),
            PACKAGE(1, 1),
            LOCAL(2, 2);
            

            /* renamed from: a */
            public static C7621f.C7623b<Kind> f39778a;
            private final int value;

            /* renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$QualifiedNameTable$QualifiedName$Kind$a */
            public static class C7557a implements C7621f.C7623b<Kind> {
                /* renamed from: a */
                public Kind findValueByNumber(int i) {
                    return Kind.valueOf(i);
                }
            }

            /* access modifiers changed from: public */
            static {
                f39778a = new C7557a();
            }

            /* access modifiers changed from: public */
            Kind(int i, int i2) {
                this.value = i2;
            }

            public final int getNumber() {
                return this.value;
            }

            public static Kind valueOf(int i) {
                if (i == 0) {
                    return CLASS;
                }
                if (i == 1) {
                    return PACKAGE;
                }
                if (i != 2) {
                    return null;
                }
                return LOCAL;
            }
        }

        /* renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$QualifiedNameTable$QualifiedName$a */
        public static class C7558a extends C7613b<QualifiedName> {
            /* renamed from: m */
            public QualifiedName mo52753c(C7614c cVar, C7616d dVar) throws InvalidProtocolBufferException {
                return new QualifiedName(cVar, dVar);
            }
        }

        /* renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$QualifiedNameTable$QualifiedName$b */
        public static final class C7559b extends GeneratedMessageLite.C7601b<QualifiedName, C7559b> implements ru3 {

            /* renamed from: d */
            public int f39780d;

            /* renamed from: e */
            public int f39781e = -1;

            /* renamed from: g */
            public int f39782g;

            /* renamed from: k */
            public Kind f39783k = Kind.PACKAGE;

            public C7559b() {
                mo54269p();
            }

            /* renamed from: o */
            public static C7559b m61525o() {
                return new C7559b();
            }

            /* renamed from: j */
            public QualifiedName build() {
                QualifiedName l = mo54267l();
                if (l.isInitialized()) {
                    return l;
                }
                throw C7610a.C7611a.m61947b(l);
            }

            /* renamed from: l */
            public QualifiedName mo54267l() {
                QualifiedName qualifiedName = new QualifiedName((GeneratedMessageLite.C7601b) this);
                int i = this.f39780d;
                int i2 = 1;
                if ((i & 1) != 1) {
                    i2 = 0;
                }
                int unused = qualifiedName.parentQualifiedName_ = this.f39781e;
                if ((i & 2) == 2) {
                    i2 |= 2;
                }
                int unused2 = qualifiedName.shortName_ = this.f39782g;
                if ((i & 4) == 4) {
                    i2 |= 4;
                }
                Kind unused3 = qualifiedName.kind_ = this.f39783k;
                int unused4 = qualifiedName.bitField0_ = i2;
                return qualifiedName;
            }

            /* renamed from: m */
            public C7559b mo53895d() {
                return m61525o().mo53896g(mo54267l());
            }

            /* renamed from: p */
            public final void mo54269p() {
            }

            /* renamed from: r */
            public C7559b mo53896g(QualifiedName qualifiedName) {
                if (qualifiedName == QualifiedName.getDefaultInstance()) {
                    return this;
                }
                if (qualifiedName.hasParentQualifiedName()) {
                    mo54273v(qualifiedName.getParentQualifiedName());
                }
                if (qualifiedName.hasShortName()) {
                    mo54274w(qualifiedName.getShortName());
                }
                if (qualifiedName.hasKind()) {
                    mo54272u(qualifiedName.getKind());
                }
                mo54652h(mo54651f().mo50826j(qualifiedName.unknownFields));
                return this;
            }

            /* renamed from: t */
            public C7559b mo53900n(C7614c cVar, C7616d dVar) throws IOException {
                QualifiedName qualifiedName;
                QualifiedName qualifiedName2 = null;
                try {
                    QualifiedName c = QualifiedName.PARSER.mo52753c(cVar, dVar);
                    if (c != null) {
                        mo53896g(c);
                    }
                    return this;
                } catch (InvalidProtocolBufferException e) {
                    qualifiedName = (QualifiedName) e.getUnfinishedMessage();
                    throw e;
                } catch (Throwable th) {
                    th = th;
                    qualifiedName2 = qualifiedName;
                }
                if (qualifiedName2 != null) {
                    mo53896g(qualifiedName2);
                }
                throw th;
            }

            /* renamed from: u */
            public C7559b mo54272u(Kind kind) {
                kind.getClass();
                this.f39780d |= 4;
                this.f39783k = kind;
                return this;
            }

            /* renamed from: v */
            public C7559b mo54273v(int i) {
                this.f39780d |= 1;
                this.f39781e = i;
                return this;
            }

            /* renamed from: w */
            public C7559b mo54274w(int i) {
                this.f39780d |= 2;
                this.f39782g = i;
                return this;
            }
        }

        static {
            QualifiedName qualifiedName = new QualifiedName(true);
            f39777a = qualifiedName;
            qualifiedName.mo54257b();
        }

        public static QualifiedName getDefaultInstance() {
            return f39777a;
        }

        public static C7559b newBuilder() {
            return C7559b.m61525o();
        }

        /* renamed from: b */
        public final void mo54257b() {
            this.parentQualifiedName_ = -1;
            this.shortName_ = 0;
            this.kind_ = Kind.PACKAGE;
        }

        public Kind getKind() {
            return this.kind_;
        }

        public int getParentQualifiedName() {
            return this.parentQualifiedName_;
        }

        public jm4<QualifiedName> getParserForType() {
            return PARSER;
        }

        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int i2 = 0;
            if ((this.bitField0_ & 1) == 1) {
                i2 = 0 + CodedOutputStream.m61866o(1, this.parentQualifiedName_);
            }
            if ((this.bitField0_ & 2) == 2) {
                i2 += CodedOutputStream.m61866o(2, this.shortName_);
            }
            if ((this.bitField0_ & 4) == 4) {
                i2 += CodedOutputStream.m61859h(3, this.kind_.getNumber());
            }
            int size = i2 + this.unknownFields.size();
            this.memoizedSerializedSize = size;
            return size;
        }

        public int getShortName() {
            return this.shortName_;
        }

        public boolean hasKind() {
            if ((this.bitField0_ & 4) == 4) {
                return true;
            }
            return false;
        }

        public boolean hasParentQualifiedName() {
            if ((this.bitField0_ & 1) == 1) {
                return true;
            }
            return false;
        }

        public boolean hasShortName() {
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
            if (!hasShortName()) {
                this.memoizedIsInitialized = 0;
                return false;
            }
            this.memoizedIsInitialized = 1;
            return true;
        }

        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            getSerializedSize();
            if ((this.bitField0_ & 1) == 1) {
                codedOutputStream.mo54614a0(1, this.parentQualifiedName_);
            }
            if ((this.bitField0_ & 2) == 2) {
                codedOutputStream.mo54614a0(2, this.shortName_);
            }
            if ((this.bitField0_ & 4) == 4) {
                codedOutputStream.mo54606S(3, this.kind_.getNumber());
            }
            codedOutputStream.mo54622i0(this.unknownFields);
        }

        public static C7559b newBuilder(QualifiedName qualifiedName) {
            return newBuilder().mo53896g(qualifiedName);
        }

        public QualifiedName getDefaultInstanceForType() {
            return f39777a;
        }

        public C7559b newBuilderForType() {
            return newBuilder();
        }

        public C7559b toBuilder() {
            return newBuilder(this);
        }

        public QualifiedName(GeneratedMessageLite.C7601b bVar) {
            super(bVar);
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = bVar.mo54651f();
        }

        public QualifiedName(boolean z) {
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = c70.f37074a;
        }

        public QualifiedName(C7614c cVar, C7616d dVar) throws InvalidProtocolBufferException {
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            mo54257b();
            c70.C6928b D = c70.m56312D();
            CodedOutputStream J = CodedOutputStream.m61851J(D, 1);
            boolean z = false;
            while (!z) {
                try {
                    int K = cVar.mo54700K();
                    if (K != 0) {
                        if (K == 8) {
                            this.bitField0_ |= 1;
                            this.parentQualifiedName_ = cVar.mo54724s();
                        } else if (K == 16) {
                            this.bitField0_ |= 2;
                            this.shortName_ = cVar.mo54724s();
                        } else if (K == 24) {
                            int n = cVar.mo54719n();
                            Kind valueOf = Kind.valueOf(n);
                            if (valueOf == null) {
                                J.mo54628o0(K);
                                J.mo54628o0(n);
                            } else {
                                this.bitField0_ |= 4;
                                this.kind_ = valueOf;
                            }
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

    /* renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$QualifiedNameTable$a */
    public static class C7560a extends C7613b<ProtoBuf$QualifiedNameTable> {
        /* renamed from: m */
        public ProtoBuf$QualifiedNameTable mo52753c(C7614c cVar, C7616d dVar) throws InvalidProtocolBufferException {
            return new ProtoBuf$QualifiedNameTable(cVar, dVar);
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$QualifiedNameTable$b */
    public static final class C7561b extends GeneratedMessageLite.C7601b<ProtoBuf$QualifiedNameTable, C7561b> implements ru3 {

        /* renamed from: d */
        public int f39784d;

        /* renamed from: e */
        public List<QualifiedName> f39785e = Collections.emptyList();

        public C7561b() {
            mo54280r();
        }

        /* renamed from: o */
        public static C7561b m61542o() {
            return new C7561b();
        }

        /* renamed from: j */
        public ProtoBuf$QualifiedNameTable build() {
            ProtoBuf$QualifiedNameTable l = mo54277l();
            if (l.isInitialized()) {
                return l;
            }
            throw C7610a.C7611a.m61947b(l);
        }

        /* renamed from: l */
        public ProtoBuf$QualifiedNameTable mo54277l() {
            ProtoBuf$QualifiedNameTable protoBuf$QualifiedNameTable = new ProtoBuf$QualifiedNameTable((GeneratedMessageLite.C7601b) this);
            if ((this.f39784d & 1) == 1) {
                this.f39785e = Collections.unmodifiableList(this.f39785e);
                this.f39784d &= -2;
            }
            List unused = protoBuf$QualifiedNameTable.qualifiedName_ = this.f39785e;
            return protoBuf$QualifiedNameTable;
        }

        /* renamed from: m */
        public C7561b mo53895d() {
            return m61542o().mo53896g(mo54277l());
        }

        /* renamed from: p */
        public final void mo54279p() {
            if ((this.f39784d & 1) != 1) {
                this.f39785e = new ArrayList(this.f39785e);
                this.f39784d |= 1;
            }
        }

        /* renamed from: r */
        public final void mo54280r() {
        }

        /* renamed from: t */
        public C7561b mo53896g(ProtoBuf$QualifiedNameTable protoBuf$QualifiedNameTable) {
            if (protoBuf$QualifiedNameTable == ProtoBuf$QualifiedNameTable.getDefaultInstance()) {
                return this;
            }
            if (!protoBuf$QualifiedNameTable.qualifiedName_.isEmpty()) {
                if (this.f39785e.isEmpty()) {
                    this.f39785e = protoBuf$QualifiedNameTable.qualifiedName_;
                    this.f39784d &= -2;
                } else {
                    mo54279p();
                    this.f39785e.addAll(protoBuf$QualifiedNameTable.qualifiedName_);
                }
            }
            mo54652h(mo54651f().mo50826j(protoBuf$QualifiedNameTable.unknownFields));
            return this;
        }

        /* renamed from: u */
        public C7561b mo53900n(C7614c cVar, C7616d dVar) throws IOException {
            ProtoBuf$QualifiedNameTable protoBuf$QualifiedNameTable;
            ProtoBuf$QualifiedNameTable protoBuf$QualifiedNameTable2 = null;
            try {
                ProtoBuf$QualifiedNameTable c = ProtoBuf$QualifiedNameTable.PARSER.mo52753c(cVar, dVar);
                if (c != null) {
                    mo53896g(c);
                }
                return this;
            } catch (InvalidProtocolBufferException e) {
                protoBuf$QualifiedNameTable = (ProtoBuf$QualifiedNameTable) e.getUnfinishedMessage();
                throw e;
            } catch (Throwable th) {
                th = th;
                protoBuf$QualifiedNameTable2 = protoBuf$QualifiedNameTable;
            }
            if (protoBuf$QualifiedNameTable2 != null) {
                mo53896g(protoBuf$QualifiedNameTable2);
            }
            throw th;
        }
    }

    static {
        ProtoBuf$QualifiedNameTable protoBuf$QualifiedNameTable = new ProtoBuf$QualifiedNameTable(true);
        f39776a = protoBuf$QualifiedNameTable;
        protoBuf$QualifiedNameTable.mo54254b();
    }

    public static ProtoBuf$QualifiedNameTable getDefaultInstance() {
        return f39776a;
    }

    public static C7561b newBuilder() {
        return C7561b.m61542o();
    }

    /* renamed from: b */
    public final void mo54254b() {
        this.qualifiedName_ = Collections.emptyList();
    }

    public jm4<ProtoBuf$QualifiedNameTable> getParserForType() {
        return PARSER;
    }

    public QualifiedName getQualifiedName(int i) {
        return this.qualifiedName_.get(i);
    }

    public int getQualifiedNameCount() {
        return this.qualifiedName_.size();
    }

    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.qualifiedName_.size(); i3++) {
            i2 += CodedOutputStream.m61870s(1, this.qualifiedName_.get(i3));
        }
        int size = i2 + this.unknownFields.size();
        this.memoizedSerializedSize = size;
        return size;
    }

    public final boolean isInitialized() {
        byte b = this.memoizedIsInitialized;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        for (int i = 0; i < getQualifiedNameCount(); i++) {
            if (!getQualifiedName(i).isInitialized()) {
                this.memoizedIsInitialized = 0;
                return false;
            }
        }
        this.memoizedIsInitialized = 1;
        return true;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        getSerializedSize();
        for (int i = 0; i < this.qualifiedName_.size(); i++) {
            codedOutputStream.mo54617d0(1, this.qualifiedName_.get(i));
        }
        codedOutputStream.mo54622i0(this.unknownFields);
    }

    public static C7561b newBuilder(ProtoBuf$QualifiedNameTable protoBuf$QualifiedNameTable) {
        return newBuilder().mo53896g(protoBuf$QualifiedNameTable);
    }

    public ProtoBuf$QualifiedNameTable getDefaultInstanceForType() {
        return f39776a;
    }

    public C7561b newBuilderForType() {
        return newBuilder();
    }

    public C7561b toBuilder() {
        return newBuilder(this);
    }

    public ProtoBuf$QualifiedNameTable(GeneratedMessageLite.C7601b bVar) {
        super(bVar);
        this.memoizedIsInitialized = -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = bVar.mo54651f();
    }

    public ProtoBuf$QualifiedNameTable(boolean z) {
        this.memoizedIsInitialized = -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = c70.f37074a;
    }

    public ProtoBuf$QualifiedNameTable(C7614c cVar, C7616d dVar) throws InvalidProtocolBufferException {
        this.memoizedIsInitialized = -1;
        this.memoizedSerializedSize = -1;
        mo54254b();
        c70.C6928b D = c70.m56312D();
        CodedOutputStream J = CodedOutputStream.m61851J(D, 1);
        boolean z = false;
        boolean z2 = false;
        while (!z) {
            try {
                int K = cVar.mo54700K();
                if (K != 0) {
                    if (K == 10) {
                        if (!z2 || !true) {
                            this.qualifiedName_ = new ArrayList();
                            z2 |= true;
                        }
                        this.qualifiedName_.add(cVar.mo54726u(QualifiedName.PARSER, dVar));
                    } else if (!parseUnknownField(cVar, J, dVar, K)) {
                    }
                }
                z = true;
            } catch (InvalidProtocolBufferException e) {
                throw e.setUnfinishedMessage(this);
            } catch (IOException e2) {
                throw new InvalidProtocolBufferException(e2.getMessage()).setUnfinishedMessage(this);
            } catch (Throwable th) {
                if (z2 && true) {
                    this.qualifiedName_ = Collections.unmodifiableList(this.qualifiedName_);
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
            this.qualifiedName_ = Collections.unmodifiableList(this.qualifiedName_);
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
