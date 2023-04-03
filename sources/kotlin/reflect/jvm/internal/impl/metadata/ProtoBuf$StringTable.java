package kotlin.reflect.jvm.internal.impl.metadata;

import java.io.IOException;
import kotlin.reflect.jvm.internal.impl.protobuf.C7610a;
import kotlin.reflect.jvm.internal.impl.protobuf.C7613b;
import kotlin.reflect.jvm.internal.impl.protobuf.C7614c;
import kotlin.reflect.jvm.internal.impl.protobuf.C7616d;
import kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import p000.c70;

public final class ProtoBuf$StringTable extends GeneratedMessageLite implements ru3 {
    public static jm4<ProtoBuf$StringTable> PARSER = new C7562a();

    /* renamed from: a */
    public static final ProtoBuf$StringTable f39786a;
    private byte memoizedIsInitialized;
    private int memoizedSerializedSize;
    /* access modifiers changed from: private */
    public xf3 string_;
    /* access modifiers changed from: private */
    public final c70 unknownFields;

    /* renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$StringTable$a */
    public static class C7562a extends C7613b<ProtoBuf$StringTable> {
        /* renamed from: m */
        public ProtoBuf$StringTable mo52753c(C7614c cVar, C7616d dVar) throws InvalidProtocolBufferException {
            return new ProtoBuf$StringTable(cVar, dVar);
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$StringTable$b */
    public static final class C7563b extends GeneratedMessageLite.C7601b<ProtoBuf$StringTable, C7563b> implements ru3 {

        /* renamed from: d */
        public int f39787d;

        /* renamed from: e */
        public xf3 f39788e = vf3.f45285d;

        public C7563b() {
            mo54291r();
        }

        /* renamed from: o */
        public static C7563b m61558o() {
            return new C7563b();
        }

        /* renamed from: j */
        public ProtoBuf$StringTable build() {
            ProtoBuf$StringTable l = mo54288l();
            if (l.isInitialized()) {
                return l;
            }
            throw C7610a.C7611a.m61947b(l);
        }

        /* renamed from: l */
        public ProtoBuf$StringTable mo54288l() {
            ProtoBuf$StringTable protoBuf$StringTable = new ProtoBuf$StringTable((GeneratedMessageLite.C7601b) this);
            if ((this.f39787d & 1) == 1) {
                this.f39788e = this.f39788e.mo51372l();
                this.f39787d &= -2;
            }
            xf3 unused = protoBuf$StringTable.string_ = this.f39788e;
            return protoBuf$StringTable;
        }

        /* renamed from: m */
        public C7563b mo53895d() {
            return m61558o().mo53896g(mo54288l());
        }

        /* renamed from: p */
        public final void mo54290p() {
            if ((this.f39787d & 1) != 1) {
                this.f39788e = new vf3(this.f39788e);
                this.f39787d |= 1;
            }
        }

        /* renamed from: r */
        public final void mo54291r() {
        }

        /* renamed from: t */
        public C7563b mo53896g(ProtoBuf$StringTable protoBuf$StringTable) {
            if (protoBuf$StringTable == ProtoBuf$StringTable.getDefaultInstance()) {
                return this;
            }
            if (!protoBuf$StringTable.string_.isEmpty()) {
                if (this.f39788e.isEmpty()) {
                    this.f39788e = protoBuf$StringTable.string_;
                    this.f39787d &= -2;
                } else {
                    mo54290p();
                    this.f39788e.addAll(protoBuf$StringTable.string_);
                }
            }
            mo54652h(mo54651f().mo50826j(protoBuf$StringTable.unknownFields));
            return this;
        }

        /* renamed from: u */
        public C7563b mo53900n(C7614c cVar, C7616d dVar) throws IOException {
            ProtoBuf$StringTable protoBuf$StringTable;
            ProtoBuf$StringTable protoBuf$StringTable2 = null;
            try {
                ProtoBuf$StringTable c = ProtoBuf$StringTable.PARSER.mo52753c(cVar, dVar);
                if (c != null) {
                    mo53896g(c);
                }
                return this;
            } catch (InvalidProtocolBufferException e) {
                protoBuf$StringTable = (ProtoBuf$StringTable) e.getUnfinishedMessage();
                throw e;
            } catch (Throwable th) {
                th = th;
                protoBuf$StringTable2 = protoBuf$StringTable;
            }
            if (protoBuf$StringTable2 != null) {
                mo53896g(protoBuf$StringTable2);
            }
            throw th;
        }
    }

    static {
        ProtoBuf$StringTable protoBuf$StringTable = new ProtoBuf$StringTable(true);
        f39786a = protoBuf$StringTable;
        protoBuf$StringTable.mo54283b();
    }

    public static ProtoBuf$StringTable getDefaultInstance() {
        return f39786a;
    }

    public static C7563b newBuilder() {
        return C7563b.m61558o();
    }

    /* renamed from: b */
    public final void mo54283b() {
        this.string_ = vf3.f45285d;
    }

    public jm4<ProtoBuf$StringTable> getParserForType() {
        return PARSER;
    }

    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.string_.size(); i3++) {
            i2 += CodedOutputStream.m61856e(this.string_.mo51374o0(i3));
        }
        int size = 0 + i2 + (getStringList().size() * 1) + this.unknownFields.size();
        this.memoizedSerializedSize = size;
        return size;
    }

    public String getString(int i) {
        return (String) this.string_.get(i);
    }

    public gy4 getStringList() {
        return this.string_;
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
        for (int i = 0; i < this.string_.size(); i++) {
            codedOutputStream.mo54602O(1, this.string_.mo51374o0(i));
        }
        codedOutputStream.mo54622i0(this.unknownFields);
    }

    public static C7563b newBuilder(ProtoBuf$StringTable protoBuf$StringTable) {
        return newBuilder().mo53896g(protoBuf$StringTable);
    }

    public ProtoBuf$StringTable getDefaultInstanceForType() {
        return f39786a;
    }

    public C7563b newBuilderForType() {
        return newBuilder();
    }

    public C7563b toBuilder() {
        return newBuilder(this);
    }

    public ProtoBuf$StringTable(GeneratedMessageLite.C7601b bVar) {
        super(bVar);
        this.memoizedIsInitialized = -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = bVar.mo54651f();
    }

    public ProtoBuf$StringTable(boolean z) {
        this.memoizedIsInitialized = -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = c70.f37074a;
    }

    public ProtoBuf$StringTable(C7614c cVar, C7616d dVar) throws InvalidProtocolBufferException {
        this.memoizedIsInitialized = -1;
        this.memoizedSerializedSize = -1;
        mo54283b();
        c70.C6928b D = c70.m56312D();
        CodedOutputStream J = CodedOutputStream.m61851J(D, 1);
        boolean z = false;
        boolean z2 = false;
        while (!z) {
            try {
                int K = cVar.mo54700K();
                if (K != 0) {
                    if (K == 10) {
                        c70 l = cVar.mo54717l();
                        if (!z2 || !true) {
                            this.string_ = new vf3();
                            z2 |= true;
                        }
                        this.string_.mo51371j0(l);
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
                    this.string_ = this.string_.mo51372l();
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
            this.string_ = this.string_.mo51372l();
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
