package kotlin.reflect.jvm.internal.impl.metadata;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Expression;
import kotlin.reflect.jvm.internal.impl.protobuf.C7610a;
import kotlin.reflect.jvm.internal.impl.protobuf.C7613b;
import kotlin.reflect.jvm.internal.impl.protobuf.C7614c;
import kotlin.reflect.jvm.internal.impl.protobuf.C7616d;
import kotlin.reflect.jvm.internal.impl.protobuf.C7621f;
import kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import p000.c70;

public final class ProtoBuf$Effect extends GeneratedMessageLite implements ru3 {
    public static jm4<ProtoBuf$Effect> PARSER = new C7540a();

    /* renamed from: a */
    public static final ProtoBuf$Effect f39703a;
    /* access modifiers changed from: private */
    public int bitField0_;
    /* access modifiers changed from: private */
    public ProtoBuf$Expression conclusionOfConditionalEffect_;
    /* access modifiers changed from: private */
    public List<ProtoBuf$Expression> effectConstructorArgument_;
    /* access modifiers changed from: private */
    public EffectType effectType_;
    /* access modifiers changed from: private */
    public InvocationKind kind_;
    private byte memoizedIsInitialized;
    private int memoizedSerializedSize;
    /* access modifiers changed from: private */
    public final c70 unknownFields;

    public enum EffectType implements C7621f.C7622a {
        RETURNS_CONSTANT(0, 0),
        CALLS(1, 1),
        RETURNS_NOT_NULL(2, 2);
        

        /* renamed from: a */
        public static C7621f.C7623b<EffectType> f39704a;
        private final int value;

        /* renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Effect$EffectType$a */
        public static class C7538a implements C7621f.C7623b<EffectType> {
            /* renamed from: a */
            public EffectType findValueByNumber(int i) {
                return EffectType.valueOf(i);
            }
        }

        /* access modifiers changed from: public */
        static {
            f39704a = new C7538a();
        }

        /* access modifiers changed from: public */
        EffectType(int i, int i2) {
            this.value = i2;
        }

        public final int getNumber() {
            return this.value;
        }

        public static EffectType valueOf(int i) {
            if (i == 0) {
                return RETURNS_CONSTANT;
            }
            if (i == 1) {
                return CALLS;
            }
            if (i != 2) {
                return null;
            }
            return RETURNS_NOT_NULL;
        }
    }

    public enum InvocationKind implements C7621f.C7622a {
        AT_MOST_ONCE(0, 0),
        EXACTLY_ONCE(1, 1),
        AT_LEAST_ONCE(2, 2);
        

        /* renamed from: a */
        public static C7621f.C7623b<InvocationKind> f39706a;
        private final int value;

        /* renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Effect$InvocationKind$a */
        public static class C7539a implements C7621f.C7623b<InvocationKind> {
            /* renamed from: a */
            public InvocationKind findValueByNumber(int i) {
                return InvocationKind.valueOf(i);
            }
        }

        /* access modifiers changed from: public */
        static {
            f39706a = new C7539a();
        }

        /* access modifiers changed from: public */
        InvocationKind(int i, int i2) {
            this.value = i2;
        }

        public final int getNumber() {
            return this.value;
        }

        public static InvocationKind valueOf(int i) {
            if (i == 0) {
                return AT_MOST_ONCE;
            }
            if (i == 1) {
                return EXACTLY_ONCE;
            }
            if (i != 2) {
                return null;
            }
            return AT_LEAST_ONCE;
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Effect$a */
    public static class C7540a extends C7613b<ProtoBuf$Effect> {
        /* renamed from: m */
        public ProtoBuf$Effect mo52753c(C7614c cVar, C7616d dVar) throws InvalidProtocolBufferException {
            return new ProtoBuf$Effect(cVar, dVar);
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Effect$b */
    public static final class C7541b extends GeneratedMessageLite.C7601b<ProtoBuf$Effect, C7541b> implements ru3 {

        /* renamed from: d */
        public int f39708d;

        /* renamed from: e */
        public EffectType f39709e = EffectType.RETURNS_CONSTANT;

        /* renamed from: g */
        public List<ProtoBuf$Expression> f39710g = Collections.emptyList();

        /* renamed from: k */
        public ProtoBuf$Expression f39711k = ProtoBuf$Expression.getDefaultInstance();

        /* renamed from: r */
        public InvocationKind f39712r = InvocationKind.AT_MOST_ONCE;

        public C7541b() {
            mo54057r();
        }

        /* renamed from: o */
        public static C7541b m61366o() {
            return new C7541b();
        }

        /* renamed from: j */
        public ProtoBuf$Effect build() {
            ProtoBuf$Effect l = mo54054l();
            if (l.isInitialized()) {
                return l;
            }
            throw C7610a.C7611a.m61947b(l);
        }

        /* renamed from: l */
        public ProtoBuf$Effect mo54054l() {
            ProtoBuf$Effect protoBuf$Effect = new ProtoBuf$Effect((GeneratedMessageLite.C7601b) this);
            int i = this.f39708d;
            int i2 = 1;
            if ((i & 1) != 1) {
                i2 = 0;
            }
            EffectType unused = protoBuf$Effect.effectType_ = this.f39709e;
            if ((this.f39708d & 2) == 2) {
                this.f39710g = Collections.unmodifiableList(this.f39710g);
                this.f39708d &= -3;
            }
            List unused2 = protoBuf$Effect.effectConstructorArgument_ = this.f39710g;
            if ((i & 4) == 4) {
                i2 |= 2;
            }
            ProtoBuf$Expression unused3 = protoBuf$Effect.conclusionOfConditionalEffect_ = this.f39711k;
            if ((i & 8) == 8) {
                i2 |= 4;
            }
            InvocationKind unused4 = protoBuf$Effect.kind_ = this.f39712r;
            int unused5 = protoBuf$Effect.bitField0_ = i2;
            return protoBuf$Effect;
        }

        /* renamed from: m */
        public C7541b mo53895d() {
            return m61366o().mo53896g(mo54054l());
        }

        /* renamed from: p */
        public final void mo54056p() {
            if ((this.f39708d & 2) != 2) {
                this.f39710g = new ArrayList(this.f39710g);
                this.f39708d |= 2;
            }
        }

        /* renamed from: r */
        public final void mo54057r() {
        }

        /* renamed from: t */
        public C7541b mo54058t(ProtoBuf$Expression protoBuf$Expression) {
            if ((this.f39708d & 4) != 4 || this.f39711k == ProtoBuf$Expression.getDefaultInstance()) {
                this.f39711k = protoBuf$Expression;
            } else {
                this.f39711k = ProtoBuf$Expression.newBuilder(this.f39711k).mo53896g(protoBuf$Expression).mo54093l();
            }
            this.f39708d |= 4;
            return this;
        }

        /* renamed from: u */
        public C7541b mo53896g(ProtoBuf$Effect protoBuf$Effect) {
            if (protoBuf$Effect == ProtoBuf$Effect.getDefaultInstance()) {
                return this;
            }
            if (protoBuf$Effect.hasEffectType()) {
                mo54061w(protoBuf$Effect.getEffectType());
            }
            if (!protoBuf$Effect.effectConstructorArgument_.isEmpty()) {
                if (this.f39710g.isEmpty()) {
                    this.f39710g = protoBuf$Effect.effectConstructorArgument_;
                    this.f39708d &= -3;
                } else {
                    mo54056p();
                    this.f39710g.addAll(protoBuf$Effect.effectConstructorArgument_);
                }
            }
            if (protoBuf$Effect.hasConclusionOfConditionalEffect()) {
                mo54058t(protoBuf$Effect.getConclusionOfConditionalEffect());
            }
            if (protoBuf$Effect.hasKind()) {
                mo54062x(protoBuf$Effect.getKind());
            }
            mo54652h(mo54651f().mo50826j(protoBuf$Effect.unknownFields));
            return this;
        }

        /* renamed from: v */
        public C7541b mo53900n(C7614c cVar, C7616d dVar) throws IOException {
            ProtoBuf$Effect protoBuf$Effect;
            ProtoBuf$Effect protoBuf$Effect2 = null;
            try {
                ProtoBuf$Effect c = ProtoBuf$Effect.PARSER.mo52753c(cVar, dVar);
                if (c != null) {
                    mo53896g(c);
                }
                return this;
            } catch (InvalidProtocolBufferException e) {
                protoBuf$Effect = (ProtoBuf$Effect) e.getUnfinishedMessage();
                throw e;
            } catch (Throwable th) {
                th = th;
                protoBuf$Effect2 = protoBuf$Effect;
            }
            if (protoBuf$Effect2 != null) {
                mo53896g(protoBuf$Effect2);
            }
            throw th;
        }

        /* renamed from: w */
        public C7541b mo54061w(EffectType effectType) {
            effectType.getClass();
            this.f39708d |= 1;
            this.f39709e = effectType;
            return this;
        }

        /* renamed from: x */
        public C7541b mo54062x(InvocationKind invocationKind) {
            invocationKind.getClass();
            this.f39708d |= 8;
            this.f39712r = invocationKind;
            return this;
        }
    }

    static {
        ProtoBuf$Effect protoBuf$Effect = new ProtoBuf$Effect(true);
        f39703a = protoBuf$Effect;
        protoBuf$Effect.mo54041b();
    }

    public static ProtoBuf$Effect getDefaultInstance() {
        return f39703a;
    }

    public static C7541b newBuilder() {
        return C7541b.m61366o();
    }

    /* renamed from: b */
    public final void mo54041b() {
        this.effectType_ = EffectType.RETURNS_CONSTANT;
        this.effectConstructorArgument_ = Collections.emptyList();
        this.conclusionOfConditionalEffect_ = ProtoBuf$Expression.getDefaultInstance();
        this.kind_ = InvocationKind.AT_MOST_ONCE;
    }

    public ProtoBuf$Expression getConclusionOfConditionalEffect() {
        return this.conclusionOfConditionalEffect_;
    }

    public ProtoBuf$Expression getEffectConstructorArgument(int i) {
        return this.effectConstructorArgument_.get(i);
    }

    public int getEffectConstructorArgumentCount() {
        return this.effectConstructorArgument_.size();
    }

    public EffectType getEffectType() {
        return this.effectType_;
    }

    public InvocationKind getKind() {
        return this.kind_;
    }

    public jm4<ProtoBuf$Effect> getParserForType() {
        return PARSER;
    }

    public int getSerializedSize() {
        int i;
        int i2 = this.memoizedSerializedSize;
        if (i2 != -1) {
            return i2;
        }
        if ((this.bitField0_ & 1) == 1) {
            i = CodedOutputStream.m61859h(1, this.effectType_.getNumber()) + 0;
        } else {
            i = 0;
        }
        for (int i3 = 0; i3 < this.effectConstructorArgument_.size(); i3++) {
            i += CodedOutputStream.m61870s(2, this.effectConstructorArgument_.get(i3));
        }
        if ((this.bitField0_ & 2) == 2) {
            i += CodedOutputStream.m61870s(3, this.conclusionOfConditionalEffect_);
        }
        if ((this.bitField0_ & 4) == 4) {
            i += CodedOutputStream.m61859h(4, this.kind_.getNumber());
        }
        int size = i + this.unknownFields.size();
        this.memoizedSerializedSize = size;
        return size;
    }

    public boolean hasConclusionOfConditionalEffect() {
        if ((this.bitField0_ & 2) == 2) {
            return true;
        }
        return false;
    }

    public boolean hasEffectType() {
        if ((this.bitField0_ & 1) == 1) {
            return true;
        }
        return false;
    }

    public boolean hasKind() {
        if ((this.bitField0_ & 4) == 4) {
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
        for (int i = 0; i < getEffectConstructorArgumentCount(); i++) {
            if (!getEffectConstructorArgument(i).isInitialized()) {
                this.memoizedIsInitialized = 0;
                return false;
            }
        }
        if (!hasConclusionOfConditionalEffect() || getConclusionOfConditionalEffect().isInitialized()) {
            this.memoizedIsInitialized = 1;
            return true;
        }
        this.memoizedIsInitialized = 0;
        return false;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        getSerializedSize();
        if ((this.bitField0_ & 1) == 1) {
            codedOutputStream.mo54606S(1, this.effectType_.getNumber());
        }
        for (int i = 0; i < this.effectConstructorArgument_.size(); i++) {
            codedOutputStream.mo54617d0(2, this.effectConstructorArgument_.get(i));
        }
        if ((this.bitField0_ & 2) == 2) {
            codedOutputStream.mo54617d0(3, this.conclusionOfConditionalEffect_);
        }
        if ((this.bitField0_ & 4) == 4) {
            codedOutputStream.mo54606S(4, this.kind_.getNumber());
        }
        codedOutputStream.mo54622i0(this.unknownFields);
    }

    public static C7541b newBuilder(ProtoBuf$Effect protoBuf$Effect) {
        return newBuilder().mo53896g(protoBuf$Effect);
    }

    public ProtoBuf$Effect getDefaultInstanceForType() {
        return f39703a;
    }

    public C7541b newBuilderForType() {
        return newBuilder();
    }

    public C7541b toBuilder() {
        return newBuilder(this);
    }

    public ProtoBuf$Effect(GeneratedMessageLite.C7601b bVar) {
        super(bVar);
        this.memoizedIsInitialized = -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = bVar.mo54651f();
    }

    public ProtoBuf$Effect(boolean z) {
        this.memoizedIsInitialized = -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = c70.f37074a;
    }

    public ProtoBuf$Effect(C7614c cVar, C7616d dVar) throws InvalidProtocolBufferException {
        this.memoizedIsInitialized = -1;
        this.memoizedSerializedSize = -1;
        mo54041b();
        c70.C6928b D = c70.m56312D();
        CodedOutputStream J = CodedOutputStream.m61851J(D, 1);
        boolean z = false;
        boolean z2 = false;
        while (!z) {
            try {
                int K = cVar.mo54700K();
                if (K != 0) {
                    if (K == 8) {
                        int n = cVar.mo54719n();
                        EffectType valueOf = EffectType.valueOf(n);
                        if (valueOf == null) {
                            J.mo54628o0(K);
                            J.mo54628o0(n);
                        } else {
                            this.bitField0_ |= 1;
                            this.effectType_ = valueOf;
                        }
                    } else if (K == 18) {
                        if (!(z2 & true)) {
                            this.effectConstructorArgument_ = new ArrayList();
                            z2 |= true;
                        }
                        this.effectConstructorArgument_.add(cVar.mo54726u(ProtoBuf$Expression.PARSER, dVar));
                    } else if (K == 26) {
                        ProtoBuf$Expression.C7546b builder = (this.bitField0_ & 2) == 2 ? this.conclusionOfConditionalEffect_.toBuilder() : null;
                        ProtoBuf$Expression protoBuf$Expression = (ProtoBuf$Expression) cVar.mo54726u(ProtoBuf$Expression.PARSER, dVar);
                        this.conclusionOfConditionalEffect_ = protoBuf$Expression;
                        if (builder != null) {
                            builder.mo53896g(protoBuf$Expression);
                            this.conclusionOfConditionalEffect_ = builder.mo54093l();
                        }
                        this.bitField0_ |= 2;
                    } else if (K == 32) {
                        int n2 = cVar.mo54719n();
                        InvocationKind valueOf2 = InvocationKind.valueOf(n2);
                        if (valueOf2 == null) {
                            J.mo54628o0(K);
                            J.mo54628o0(n2);
                        } else {
                            this.bitField0_ |= 4;
                            this.kind_ = valueOf2;
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
                if (z2 & true) {
                    this.effectConstructorArgument_ = Collections.unmodifiableList(this.effectConstructorArgument_);
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
        if (z2 & true) {
            this.effectConstructorArgument_ = Collections.unmodifiableList(this.effectConstructorArgument_);
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
