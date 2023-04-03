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

public final class ProtoBuf$Contract extends GeneratedMessageLite implements ru3 {
    public static jm4<ProtoBuf$Contract> PARSER = new C7536a();

    /* renamed from: a */
    public static final ProtoBuf$Contract f39700a;
    /* access modifiers changed from: private */
    public List<ProtoBuf$Effect> effect_;
    private byte memoizedIsInitialized;
    private int memoizedSerializedSize;
    /* access modifiers changed from: private */
    public final c70 unknownFields;

    /* renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Contract$a */
    public static class C7536a extends C7613b<ProtoBuf$Contract> {
        /* renamed from: m */
        public ProtoBuf$Contract mo52753c(C7614c cVar, C7616d dVar) throws InvalidProtocolBufferException {
            return new ProtoBuf$Contract(cVar, dVar);
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Contract$b */
    public static final class C7537b extends GeneratedMessageLite.C7601b<ProtoBuf$Contract, C7537b> implements ru3 {

        /* renamed from: d */
        public int f39701d;

        /* renamed from: e */
        public List<ProtoBuf$Effect> f39702e = Collections.emptyList();

        public C7537b() {
            mo54038r();
        }

        /* renamed from: o */
        public static C7537b m61348o() {
            return new C7537b();
        }

        /* renamed from: j */
        public ProtoBuf$Contract build() {
            ProtoBuf$Contract l = mo54035l();
            if (l.isInitialized()) {
                return l;
            }
            throw C7610a.C7611a.m61947b(l);
        }

        /* renamed from: l */
        public ProtoBuf$Contract mo54035l() {
            ProtoBuf$Contract protoBuf$Contract = new ProtoBuf$Contract((GeneratedMessageLite.C7601b) this);
            if ((this.f39701d & 1) == 1) {
                this.f39702e = Collections.unmodifiableList(this.f39702e);
                this.f39701d &= -2;
            }
            List unused = protoBuf$Contract.effect_ = this.f39702e;
            return protoBuf$Contract;
        }

        /* renamed from: m */
        public C7537b mo53895d() {
            return m61348o().mo53896g(mo54035l());
        }

        /* renamed from: p */
        public final void mo54037p() {
            if ((this.f39701d & 1) != 1) {
                this.f39702e = new ArrayList(this.f39702e);
                this.f39701d |= 1;
            }
        }

        /* renamed from: r */
        public final void mo54038r() {
        }

        /* renamed from: t */
        public C7537b mo53896g(ProtoBuf$Contract protoBuf$Contract) {
            if (protoBuf$Contract == ProtoBuf$Contract.getDefaultInstance()) {
                return this;
            }
            if (!protoBuf$Contract.effect_.isEmpty()) {
                if (this.f39702e.isEmpty()) {
                    this.f39702e = protoBuf$Contract.effect_;
                    this.f39701d &= -2;
                } else {
                    mo54037p();
                    this.f39702e.addAll(protoBuf$Contract.effect_);
                }
            }
            mo54652h(mo54651f().mo50826j(protoBuf$Contract.unknownFields));
            return this;
        }

        /* renamed from: u */
        public C7537b mo53900n(C7614c cVar, C7616d dVar) throws IOException {
            ProtoBuf$Contract protoBuf$Contract;
            ProtoBuf$Contract protoBuf$Contract2 = null;
            try {
                ProtoBuf$Contract c = ProtoBuf$Contract.PARSER.mo52753c(cVar, dVar);
                if (c != null) {
                    mo53896g(c);
                }
                return this;
            } catch (InvalidProtocolBufferException e) {
                protoBuf$Contract = (ProtoBuf$Contract) e.getUnfinishedMessage();
                throw e;
            } catch (Throwable th) {
                th = th;
                protoBuf$Contract2 = protoBuf$Contract;
            }
            if (protoBuf$Contract2 != null) {
                mo53896g(protoBuf$Contract2);
            }
            throw th;
        }
    }

    static {
        ProtoBuf$Contract protoBuf$Contract = new ProtoBuf$Contract(true);
        f39700a = protoBuf$Contract;
        protoBuf$Contract.mo54030b();
    }

    public static ProtoBuf$Contract getDefaultInstance() {
        return f39700a;
    }

    public static C7537b newBuilder() {
        return C7537b.m61348o();
    }

    /* renamed from: b */
    public final void mo54030b() {
        this.effect_ = Collections.emptyList();
    }

    public ProtoBuf$Effect getEffect(int i) {
        return this.effect_.get(i);
    }

    public int getEffectCount() {
        return this.effect_.size();
    }

    public jm4<ProtoBuf$Contract> getParserForType() {
        return PARSER;
    }

    public int getSerializedSize() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.effect_.size(); i3++) {
            i2 += CodedOutputStream.m61870s(1, this.effect_.get(i3));
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
        for (int i = 0; i < getEffectCount(); i++) {
            if (!getEffect(i).isInitialized()) {
                this.memoizedIsInitialized = 0;
                return false;
            }
        }
        this.memoizedIsInitialized = 1;
        return true;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        getSerializedSize();
        for (int i = 0; i < this.effect_.size(); i++) {
            codedOutputStream.mo54617d0(1, this.effect_.get(i));
        }
        codedOutputStream.mo54622i0(this.unknownFields);
    }

    public static C7537b newBuilder(ProtoBuf$Contract protoBuf$Contract) {
        return newBuilder().mo53896g(protoBuf$Contract);
    }

    public ProtoBuf$Contract getDefaultInstanceForType() {
        return f39700a;
    }

    public C7537b newBuilderForType() {
        return newBuilder();
    }

    public C7537b toBuilder() {
        return newBuilder(this);
    }

    public ProtoBuf$Contract(GeneratedMessageLite.C7601b bVar) {
        super(bVar);
        this.memoizedIsInitialized = -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = bVar.mo54651f();
    }

    public ProtoBuf$Contract(boolean z) {
        this.memoizedIsInitialized = -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = c70.f37074a;
    }

    public ProtoBuf$Contract(C7614c cVar, C7616d dVar) throws InvalidProtocolBufferException {
        this.memoizedIsInitialized = -1;
        this.memoizedSerializedSize = -1;
        mo54030b();
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
                            this.effect_ = new ArrayList();
                            z2 |= true;
                        }
                        this.effect_.add(cVar.mo54726u(ProtoBuf$Effect.PARSER, dVar));
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
                    this.effect_ = Collections.unmodifiableList(this.effect_);
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
            this.effect_ = Collections.unmodifiableList(this.effect_);
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
