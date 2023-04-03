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

public final class ProtoBuf$VersionRequirementTable extends GeneratedMessageLite implements ru3 {
    public static jm4<ProtoBuf$VersionRequirementTable> PARSER = new C7582a();

    /* renamed from: a */
    public static final ProtoBuf$VersionRequirementTable f39859a;
    private byte memoizedIsInitialized;
    private int memoizedSerializedSize;
    /* access modifiers changed from: private */
    public List<ProtoBuf$VersionRequirement> requirement_;
    /* access modifiers changed from: private */
    public final c70 unknownFields;

    /* renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$VersionRequirementTable$a */
    public static class C7582a extends C7613b<ProtoBuf$VersionRequirementTable> {
        /* renamed from: m */
        public ProtoBuf$VersionRequirementTable mo52753c(C7614c cVar, C7616d dVar) throws InvalidProtocolBufferException {
            return new ProtoBuf$VersionRequirementTable(cVar, dVar);
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$VersionRequirementTable$b */
    public static final class C7583b extends GeneratedMessageLite.C7601b<ProtoBuf$VersionRequirementTable, C7583b> implements ru3 {

        /* renamed from: d */
        public int f39860d;

        /* renamed from: e */
        public List<ProtoBuf$VersionRequirement> f39861e = Collections.emptyList();

        public C7583b() {
            mo54503r();
        }

        /* renamed from: o */
        public static C7583b m61729o() {
            return new C7583b();
        }

        /* renamed from: j */
        public ProtoBuf$VersionRequirementTable build() {
            ProtoBuf$VersionRequirementTable l = mo54500l();
            if (l.isInitialized()) {
                return l;
            }
            throw C7610a.C7611a.m61947b(l);
        }

        /* renamed from: l */
        public ProtoBuf$VersionRequirementTable mo54500l() {
            ProtoBuf$VersionRequirementTable protoBuf$VersionRequirementTable = new ProtoBuf$VersionRequirementTable((GeneratedMessageLite.C7601b) this);
            if ((this.f39860d & 1) == 1) {
                this.f39861e = Collections.unmodifiableList(this.f39861e);
                this.f39860d &= -2;
            }
            List unused = protoBuf$VersionRequirementTable.requirement_ = this.f39861e;
            return protoBuf$VersionRequirementTable;
        }

        /* renamed from: m */
        public C7583b mo53895d() {
            return m61729o().mo53896g(mo54500l());
        }

        /* renamed from: p */
        public final void mo54502p() {
            if ((this.f39860d & 1) != 1) {
                this.f39861e = new ArrayList(this.f39861e);
                this.f39860d |= 1;
            }
        }

        /* renamed from: r */
        public final void mo54503r() {
        }

        /* renamed from: t */
        public C7583b mo53896g(ProtoBuf$VersionRequirementTable protoBuf$VersionRequirementTable) {
            if (protoBuf$VersionRequirementTable == ProtoBuf$VersionRequirementTable.getDefaultInstance()) {
                return this;
            }
            if (!protoBuf$VersionRequirementTable.requirement_.isEmpty()) {
                if (this.f39861e.isEmpty()) {
                    this.f39861e = protoBuf$VersionRequirementTable.requirement_;
                    this.f39860d &= -2;
                } else {
                    mo54502p();
                    this.f39861e.addAll(protoBuf$VersionRequirementTable.requirement_);
                }
            }
            mo54652h(mo54651f().mo50826j(protoBuf$VersionRequirementTable.unknownFields));
            return this;
        }

        /* renamed from: u */
        public C7583b mo53900n(C7614c cVar, C7616d dVar) throws IOException {
            ProtoBuf$VersionRequirementTable protoBuf$VersionRequirementTable;
            ProtoBuf$VersionRequirementTable protoBuf$VersionRequirementTable2 = null;
            try {
                ProtoBuf$VersionRequirementTable c = ProtoBuf$VersionRequirementTable.PARSER.mo52753c(cVar, dVar);
                if (c != null) {
                    mo53896g(c);
                }
                return this;
            } catch (InvalidProtocolBufferException e) {
                protoBuf$VersionRequirementTable = (ProtoBuf$VersionRequirementTable) e.getUnfinishedMessage();
                throw e;
            } catch (Throwable th) {
                th = th;
                protoBuf$VersionRequirementTable2 = protoBuf$VersionRequirementTable;
            }
            if (protoBuf$VersionRequirementTable2 != null) {
                mo53896g(protoBuf$VersionRequirementTable2);
            }
            throw th;
        }
    }

    static {
        ProtoBuf$VersionRequirementTable protoBuf$VersionRequirementTable = new ProtoBuf$VersionRequirementTable(true);
        f39859a = protoBuf$VersionRequirementTable;
        protoBuf$VersionRequirementTable.mo54495b();
    }

    public static ProtoBuf$VersionRequirementTable getDefaultInstance() {
        return f39859a;
    }

    public static C7583b newBuilder() {
        return C7583b.m61729o();
    }

    /* renamed from: b */
    public final void mo54495b() {
        this.requirement_ = Collections.emptyList();
    }

    public jm4<ProtoBuf$VersionRequirementTable> getParserForType() {
        return PARSER;
    }

    public int getRequirementCount() {
        return this.requirement_.size();
    }

    public List<ProtoBuf$VersionRequirement> getRequirementList() {
        return this.requirement_;
    }

    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.requirement_.size(); i3++) {
            i2 += CodedOutputStream.m61870s(1, this.requirement_.get(i3));
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
        this.memoizedIsInitialized = 1;
        return true;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        getSerializedSize();
        for (int i = 0; i < this.requirement_.size(); i++) {
            codedOutputStream.mo54617d0(1, this.requirement_.get(i));
        }
        codedOutputStream.mo54622i0(this.unknownFields);
    }

    public static C7583b newBuilder(ProtoBuf$VersionRequirementTable protoBuf$VersionRequirementTable) {
        return newBuilder().mo53896g(protoBuf$VersionRequirementTable);
    }

    public ProtoBuf$VersionRequirementTable getDefaultInstanceForType() {
        return f39859a;
    }

    public C7583b newBuilderForType() {
        return newBuilder();
    }

    public C7583b toBuilder() {
        return newBuilder(this);
    }

    public ProtoBuf$VersionRequirementTable(GeneratedMessageLite.C7601b bVar) {
        super(bVar);
        this.memoizedIsInitialized = -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = bVar.mo54651f();
    }

    public ProtoBuf$VersionRequirementTable(boolean z) {
        this.memoizedIsInitialized = -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = c70.f37074a;
    }

    public ProtoBuf$VersionRequirementTable(C7614c cVar, C7616d dVar) throws InvalidProtocolBufferException {
        this.memoizedIsInitialized = -1;
        this.memoizedSerializedSize = -1;
        mo54495b();
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
                            this.requirement_ = new ArrayList();
                            z2 |= true;
                        }
                        this.requirement_.add(cVar.mo54726u(ProtoBuf$VersionRequirement.PARSER, dVar));
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
                    this.requirement_ = Collections.unmodifiableList(this.requirement_);
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
            this.requirement_ = Collections.unmodifiableList(this.requirement_);
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
