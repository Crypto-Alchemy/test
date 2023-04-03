package kotlin.reflect.jvm.internal.impl.metadata;

import com.google.mlkit.common.MlKitException;
import java.io.IOException;
import kotlin.reflect.jvm.internal.impl.protobuf.C7610a;
import kotlin.reflect.jvm.internal.impl.protobuf.C7613b;
import kotlin.reflect.jvm.internal.impl.protobuf.C7614c;
import kotlin.reflect.jvm.internal.impl.protobuf.C7616d;
import kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import p000.c70;

public final class ProtoBuf$EnumEntry extends GeneratedMessageLite.ExtendableMessage<ProtoBuf$EnumEntry> {
    public static jm4<ProtoBuf$EnumEntry> PARSER = new C7542a();

    /* renamed from: a */
    public static final ProtoBuf$EnumEntry f39713a;
    /* access modifiers changed from: private */
    public int bitField0_;
    private byte memoizedIsInitialized;
    private int memoizedSerializedSize;
    /* access modifiers changed from: private */
    public int name_;
    /* access modifiers changed from: private */
    public final c70 unknownFields;

    /* renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$EnumEntry$a */
    public static class C7542a extends C7613b<ProtoBuf$EnumEntry> {
        /* renamed from: m */
        public ProtoBuf$EnumEntry mo52753c(C7614c cVar, C7616d dVar) throws InvalidProtocolBufferException {
            return new ProtoBuf$EnumEntry(cVar, dVar);
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$EnumEntry$b */
    public static final class C7543b extends GeneratedMessageLite.C7602c<ProtoBuf$EnumEntry, C7543b> {

        /* renamed from: g */
        public int f39714g;

        /* renamed from: k */
        public int f39715k;

        public C7543b() {
            mo54070v();
        }

        /* renamed from: u */
        public static C7543b m61385u() {
            return new C7543b();
        }

        /* renamed from: p */
        public ProtoBuf$EnumEntry build() {
            ProtoBuf$EnumEntry r = mo54068r();
            if (r.isInitialized()) {
                return r;
            }
            throw C7610a.C7611a.m61947b(r);
        }

        /* renamed from: r */
        public ProtoBuf$EnumEntry mo54068r() {
            ProtoBuf$EnumEntry protoBuf$EnumEntry = new ProtoBuf$EnumEntry((GeneratedMessageLite.C7602c) this);
            int i = 1;
            if ((this.f39714g & 1) != 1) {
                i = 0;
            }
            int unused = protoBuf$EnumEntry.name_ = this.f39715k;
            int unused2 = protoBuf$EnumEntry.bitField0_ = i;
            return protoBuf$EnumEntry;
        }

        /* renamed from: t */
        public C7543b mo53895d() {
            return m61385u().mo53896g(mo54068r());
        }

        /* renamed from: v */
        public final void mo54070v() {
        }

        /* renamed from: w */
        public C7543b mo53896g(ProtoBuf$EnumEntry protoBuf$EnumEntry) {
            if (protoBuf$EnumEntry == ProtoBuf$EnumEntry.getDefaultInstance()) {
                return this;
            }
            if (protoBuf$EnumEntry.hasName()) {
                mo54073y(protoBuf$EnumEntry.getName());
            }
            mo54655m(protoBuf$EnumEntry);
            mo54652h(mo54651f().mo50826j(protoBuf$EnumEntry.unknownFields));
            return this;
        }

        /* renamed from: x */
        public C7543b mo53900n(C7614c cVar, C7616d dVar) throws IOException {
            ProtoBuf$EnumEntry protoBuf$EnumEntry;
            ProtoBuf$EnumEntry protoBuf$EnumEntry2 = null;
            try {
                ProtoBuf$EnumEntry c = ProtoBuf$EnumEntry.PARSER.mo52753c(cVar, dVar);
                if (c != null) {
                    mo53896g(c);
                }
                return this;
            } catch (InvalidProtocolBufferException e) {
                protoBuf$EnumEntry = (ProtoBuf$EnumEntry) e.getUnfinishedMessage();
                throw e;
            } catch (Throwable th) {
                th = th;
                protoBuf$EnumEntry2 = protoBuf$EnumEntry;
            }
            if (protoBuf$EnumEntry2 != null) {
                mo53896g(protoBuf$EnumEntry2);
            }
            throw th;
        }

        /* renamed from: y */
        public C7543b mo54073y(int i) {
            this.f39714g |= 1;
            this.f39715k = i;
            return this;
        }
    }

    static {
        ProtoBuf$EnumEntry protoBuf$EnumEntry = new ProtoBuf$EnumEntry(true);
        f39713a = protoBuf$EnumEntry;
        protoBuf$EnumEntry.mo54063c();
    }

    public static ProtoBuf$EnumEntry getDefaultInstance() {
        return f39713a;
    }

    public static C7543b newBuilder() {
        return C7543b.m61385u();
    }

    /* renamed from: c */
    public final void mo54063c() {
        this.name_ = 0;
    }

    public int getName() {
        return this.name_;
    }

    public jm4<ProtoBuf$EnumEntry> getParserForType() {
        return PARSER;
    }

    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        if ((this.bitField0_ & 1) == 1) {
            i2 = 0 + CodedOutputStream.m61866o(1, this.name_);
        }
        int extensionsSerializedSize = i2 + extensionsSerializedSize() + this.unknownFields.size();
        this.memoizedSerializedSize = extensionsSerializedSize;
        return extensionsSerializedSize;
    }

    public boolean hasName() {
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
        if (!extensionsAreInitialized()) {
            this.memoizedIsInitialized = 0;
            return false;
        }
        this.memoizedIsInitialized = 1;
        return true;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        getSerializedSize();
        GeneratedMessageLite.ExtendableMessage<MessageType>.C6784a newExtensionWriter = newExtensionWriter();
        if ((this.bitField0_ & 1) == 1) {
            codedOutputStream.mo54614a0(1, this.name_);
        }
        newExtensionWriter.mo54650a(MlKitException.CODE_SCANNER_UNAVAILABLE, codedOutputStream);
        codedOutputStream.mo54622i0(this.unknownFields);
    }

    public static C7543b newBuilder(ProtoBuf$EnumEntry protoBuf$EnumEntry) {
        return newBuilder().mo53896g(protoBuf$EnumEntry);
    }

    public ProtoBuf$EnumEntry getDefaultInstanceForType() {
        return f39713a;
    }

    public C7543b newBuilderForType() {
        return newBuilder();
    }

    public C7543b toBuilder() {
        return newBuilder(this);
    }

    public ProtoBuf$EnumEntry(GeneratedMessageLite.C7602c<ProtoBuf$EnumEntry, ?> cVar) {
        super(cVar);
        this.memoizedIsInitialized = -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = cVar.mo54651f();
    }

    public ProtoBuf$EnumEntry(boolean z) {
        this.memoizedIsInitialized = -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = c70.f37074a;
    }

    public ProtoBuf$EnumEntry(C7614c cVar, C7616d dVar) throws InvalidProtocolBufferException {
        this.memoizedIsInitialized = -1;
        this.memoizedSerializedSize = -1;
        mo54063c();
        c70.C6928b D = c70.m56312D();
        CodedOutputStream J = CodedOutputStream.m61851J(D, 1);
        boolean z = false;
        while (!z) {
            try {
                int K = cVar.mo54700K();
                if (K != 0) {
                    if (K == 8) {
                        this.bitField0_ |= 1;
                        this.name_ = cVar.mo54724s();
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
