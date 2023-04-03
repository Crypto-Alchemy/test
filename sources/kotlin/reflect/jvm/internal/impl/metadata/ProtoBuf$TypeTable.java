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

public final class ProtoBuf$TypeTable extends GeneratedMessageLite implements ru3 {
    public static jm4<ProtoBuf$TypeTable> PARSER = new C7574a();

    /* renamed from: a */
    public static final ProtoBuf$TypeTable f39835a;
    /* access modifiers changed from: private */
    public int bitField0_;
    /* access modifiers changed from: private */
    public int firstNullable_;
    private byte memoizedIsInitialized;
    private int memoizedSerializedSize;
    /* access modifiers changed from: private */
    public List<ProtoBuf$Type> type_;
    /* access modifiers changed from: private */
    public final c70 unknownFields;

    /* renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeTable$a */
    public static class C7574a extends C7613b<ProtoBuf$TypeTable> {
        /* renamed from: m */
        public ProtoBuf$TypeTable mo52753c(C7614c cVar, C7616d dVar) throws InvalidProtocolBufferException {
            return new ProtoBuf$TypeTable(cVar, dVar);
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeTable$b */
    public static final class C7575b extends GeneratedMessageLite.C7601b<ProtoBuf$TypeTable, C7575b> implements ru3 {

        /* renamed from: d */
        public int f39836d;

        /* renamed from: e */
        public List<ProtoBuf$Type> f39837e = Collections.emptyList();

        /* renamed from: g */
        public int f39838g = -1;

        public C7575b() {
            mo54437r();
        }

        /* renamed from: o */
        public static C7575b m61668o() {
            return new C7575b();
        }

        /* renamed from: j */
        public ProtoBuf$TypeTable build() {
            ProtoBuf$TypeTable l = mo54434l();
            if (l.isInitialized()) {
                return l;
            }
            throw C7610a.C7611a.m61947b(l);
        }

        /* renamed from: l */
        public ProtoBuf$TypeTable mo54434l() {
            ProtoBuf$TypeTable protoBuf$TypeTable = new ProtoBuf$TypeTable((GeneratedMessageLite.C7601b) this);
            int i = this.f39836d;
            int i2 = 1;
            if ((i & 1) == 1) {
                this.f39837e = Collections.unmodifiableList(this.f39837e);
                this.f39836d &= -2;
            }
            List unused = protoBuf$TypeTable.type_ = this.f39837e;
            if ((i & 2) != 2) {
                i2 = 0;
            }
            int unused2 = protoBuf$TypeTable.firstNullable_ = this.f39838g;
            int unused3 = protoBuf$TypeTable.bitField0_ = i2;
            return protoBuf$TypeTable;
        }

        /* renamed from: m */
        public C7575b mo53895d() {
            return m61668o().mo53896g(mo54434l());
        }

        /* renamed from: p */
        public final void mo54436p() {
            if ((this.f39836d & 1) != 1) {
                this.f39837e = new ArrayList(this.f39837e);
                this.f39836d |= 1;
            }
        }

        /* renamed from: r */
        public final void mo54437r() {
        }

        /* renamed from: t */
        public C7575b mo53896g(ProtoBuf$TypeTable protoBuf$TypeTable) {
            if (protoBuf$TypeTable == ProtoBuf$TypeTable.getDefaultInstance()) {
                return this;
            }
            if (!protoBuf$TypeTable.type_.isEmpty()) {
                if (this.f39837e.isEmpty()) {
                    this.f39837e = protoBuf$TypeTable.type_;
                    this.f39836d &= -2;
                } else {
                    mo54436p();
                    this.f39837e.addAll(protoBuf$TypeTable.type_);
                }
            }
            if (protoBuf$TypeTable.hasFirstNullable()) {
                mo54440v(protoBuf$TypeTable.getFirstNullable());
            }
            mo54652h(mo54651f().mo50826j(protoBuf$TypeTable.unknownFields));
            return this;
        }

        /* renamed from: u */
        public C7575b mo53900n(C7614c cVar, C7616d dVar) throws IOException {
            ProtoBuf$TypeTable protoBuf$TypeTable;
            ProtoBuf$TypeTable protoBuf$TypeTable2 = null;
            try {
                ProtoBuf$TypeTable c = ProtoBuf$TypeTable.PARSER.mo52753c(cVar, dVar);
                if (c != null) {
                    mo53896g(c);
                }
                return this;
            } catch (InvalidProtocolBufferException e) {
                protoBuf$TypeTable = (ProtoBuf$TypeTable) e.getUnfinishedMessage();
                throw e;
            } catch (Throwable th) {
                th = th;
                protoBuf$TypeTable2 = protoBuf$TypeTable;
            }
            if (protoBuf$TypeTable2 != null) {
                mo53896g(protoBuf$TypeTable2);
            }
            throw th;
        }

        /* renamed from: v */
        public C7575b mo54440v(int i) {
            this.f39836d |= 2;
            this.f39838g = i;
            return this;
        }
    }

    static {
        ProtoBuf$TypeTable protoBuf$TypeTable = new ProtoBuf$TypeTable(true);
        f39835a = protoBuf$TypeTable;
        protoBuf$TypeTable.mo54426b();
    }

    public static ProtoBuf$TypeTable getDefaultInstance() {
        return f39835a;
    }

    public static C7575b newBuilder() {
        return C7575b.m61668o();
    }

    /* renamed from: b */
    public final void mo54426b() {
        this.type_ = Collections.emptyList();
        this.firstNullable_ = -1;
    }

    public int getFirstNullable() {
        return this.firstNullable_;
    }

    public jm4<ProtoBuf$TypeTable> getParserForType() {
        return PARSER;
    }

    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.type_.size(); i3++) {
            i2 += CodedOutputStream.m61870s(1, this.type_.get(i3));
        }
        if ((this.bitField0_ & 1) == 1) {
            i2 += CodedOutputStream.m61866o(2, this.firstNullable_);
        }
        int size = i2 + this.unknownFields.size();
        this.memoizedSerializedSize = size;
        return size;
    }

    public ProtoBuf$Type getType(int i) {
        return this.type_.get(i);
    }

    public int getTypeCount() {
        return this.type_.size();
    }

    public List<ProtoBuf$Type> getTypeList() {
        return this.type_;
    }

    public boolean hasFirstNullable() {
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
        for (int i = 0; i < getTypeCount(); i++) {
            if (!getType(i).isInitialized()) {
                this.memoizedIsInitialized = 0;
                return false;
            }
        }
        this.memoizedIsInitialized = 1;
        return true;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        getSerializedSize();
        for (int i = 0; i < this.type_.size(); i++) {
            codedOutputStream.mo54617d0(1, this.type_.get(i));
        }
        if ((this.bitField0_ & 1) == 1) {
            codedOutputStream.mo54614a0(2, this.firstNullable_);
        }
        codedOutputStream.mo54622i0(this.unknownFields);
    }

    public static C7575b newBuilder(ProtoBuf$TypeTable protoBuf$TypeTable) {
        return newBuilder().mo53896g(protoBuf$TypeTable);
    }

    public ProtoBuf$TypeTable getDefaultInstanceForType() {
        return f39835a;
    }

    public C7575b newBuilderForType() {
        return newBuilder();
    }

    public C7575b toBuilder() {
        return newBuilder(this);
    }

    public ProtoBuf$TypeTable(GeneratedMessageLite.C7601b bVar) {
        super(bVar);
        this.memoizedIsInitialized = -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = bVar.mo54651f();
    }

    public ProtoBuf$TypeTable(boolean z) {
        this.memoizedIsInitialized = -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = c70.f37074a;
    }

    public ProtoBuf$TypeTable(C7614c cVar, C7616d dVar) throws InvalidProtocolBufferException {
        this.memoizedIsInitialized = -1;
        this.memoizedSerializedSize = -1;
        mo54426b();
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
                            this.type_ = new ArrayList();
                            z2 |= true;
                        }
                        this.type_.add(cVar.mo54726u(ProtoBuf$Type.PARSER, dVar));
                    } else if (K == 16) {
                        this.bitField0_ |= 1;
                        this.firstNullable_ = cVar.mo54724s();
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
                    this.type_ = Collections.unmodifiableList(this.type_);
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
            this.type_ = Collections.unmodifiableList(this.type_);
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
