package kotlin.reflect.jvm.internal.impl.metadata;

import androidx.recyclerview.widget.RecyclerView;
import com.github.mikephil.charting.utils.Utils;
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

public final class ProtoBuf$Annotation extends GeneratedMessageLite implements ru3 {
    public static jm4<ProtoBuf$Annotation> PARSER = new C7529a();

    /* renamed from: a */
    public static final ProtoBuf$Annotation f39644a;
    /* access modifiers changed from: private */
    public List<Argument> argument_;
    /* access modifiers changed from: private */
    public int bitField0_;
    /* access modifiers changed from: private */
    public int id_;
    private byte memoizedIsInitialized;
    private int memoizedSerializedSize;
    /* access modifiers changed from: private */
    public final c70 unknownFields;

    public static final class Argument extends GeneratedMessageLite implements ru3 {
        public static jm4<Argument> PARSER = new C7527a();

        /* renamed from: a */
        public static final Argument f39645a;
        /* access modifiers changed from: private */
        public int bitField0_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        /* access modifiers changed from: private */
        public int nameId_;
        /* access modifiers changed from: private */
        public final c70 unknownFields;
        /* access modifiers changed from: private */
        public Value value_;

        public static final class Value extends GeneratedMessageLite implements ru3 {
            public static jm4<Value> PARSER = new C7525a();

            /* renamed from: a */
            public static final Value f39646a;
            /* access modifiers changed from: private */
            public ProtoBuf$Annotation annotation_;
            /* access modifiers changed from: private */
            public int arrayDimensionCount_;
            /* access modifiers changed from: private */
            public List<Value> arrayElement_;
            /* access modifiers changed from: private */
            public int bitField0_;
            /* access modifiers changed from: private */
            public int classId_;
            /* access modifiers changed from: private */
            public double doubleValue_;
            /* access modifiers changed from: private */
            public int enumValueId_;
            /* access modifiers changed from: private */
            public int flags_;
            /* access modifiers changed from: private */
            public float floatValue_;
            /* access modifiers changed from: private */
            public long intValue_;
            private byte memoizedIsInitialized;
            private int memoizedSerializedSize;
            /* access modifiers changed from: private */
            public int stringValue_;
            /* access modifiers changed from: private */
            public Type type_;
            /* access modifiers changed from: private */
            public final c70 unknownFields;

            public enum Type implements C7621f.C7622a {
                BYTE(0, 0),
                CHAR(1, 1),
                SHORT(2, 2),
                INT(3, 3),
                LONG(4, 4),
                FLOAT(5, 5),
                DOUBLE(6, 6),
                BOOLEAN(7, 7),
                STRING(8, 8),
                CLASS(9, 9),
                ENUM(10, 10),
                ANNOTATION(11, 11),
                ARRAY(12, 12);
                

                /* renamed from: a */
                public static C7621f.C7623b<Type> f39647a;
                private final int value;

                /* renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Annotation$Argument$Value$Type$a */
                public static class C7524a implements C7621f.C7623b<Type> {
                    /* renamed from: a */
                    public Type findValueByNumber(int i) {
                        return Type.valueOf(i);
                    }
                }

                /* access modifiers changed from: public */
                static {
                    f39647a = new C7524a();
                }

                /* access modifiers changed from: public */
                Type(int i, int i2) {
                    this.value = i2;
                }

                public final int getNumber() {
                    return this.value;
                }

                public static Type valueOf(int i) {
                    switch (i) {
                        case 0:
                            return BYTE;
                        case 1:
                            return CHAR;
                        case 2:
                            return SHORT;
                        case 3:
                            return INT;
                        case 4:
                            return LONG;
                        case 5:
                            return FLOAT;
                        case 6:
                            return DOUBLE;
                        case 7:
                            return BOOLEAN;
                        case 8:
                            return STRING;
                        case 9:
                            return CLASS;
                        case 10:
                            return ENUM;
                        case 11:
                            return ANNOTATION;
                        case 12:
                            return ARRAY;
                        default:
                            return null;
                    }
                }
            }

            /* renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Annotation$Argument$Value$a */
            public static class C7525a extends C7613b<Value> {
                /* renamed from: m */
                public Value mo52753c(C7614c cVar, C7616d dVar) throws InvalidProtocolBufferException {
                    return new Value(cVar, dVar);
                }
            }

            /* renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Annotation$Argument$Value$b */
            public static final class C7526b extends GeneratedMessageLite.C7601b<Value, C7526b> implements ru3 {

                /* renamed from: A */
                public ProtoBuf$Annotation f39649A = ProtoBuf$Annotation.getDefaultInstance();

                /* renamed from: B */
                public List<Value> f39650B = Collections.emptyList();

                /* renamed from: C */
                public int f39651C;

                /* renamed from: H */
                public int f39652H;

                /* renamed from: d */
                public int f39653d;

                /* renamed from: e */
                public Type f39654e = Type.BYTE;

                /* renamed from: g */
                public long f39655g;

                /* renamed from: k */
                public float f39656k;

                /* renamed from: r */
                public double f39657r;

                /* renamed from: s */
                public int f39658s;

                /* renamed from: x */
                public int f39659x;

                /* renamed from: y */
                public int f39660y;

                public C7526b() {
                    mo53902r();
                }

                /* renamed from: o */
                public static C7526b m61232o() {
                    return new C7526b();
                }

                /* renamed from: B */
                public C7526b mo53887B(int i) {
                    this.f39653d |= RecyclerView.C1231a0.FLAG_ADAPTER_FULLUPDATE;
                    this.f39652H = i;
                    return this;
                }

                /* renamed from: C */
                public C7526b mo53888C(float f) {
                    this.f39653d |= 4;
                    this.f39656k = f;
                    return this;
                }

                /* renamed from: D */
                public C7526b mo53889D(long j) {
                    this.f39653d |= 2;
                    this.f39655g = j;
                    return this;
                }

                /* renamed from: E */
                public C7526b mo53890E(int i) {
                    this.f39653d |= 16;
                    this.f39658s = i;
                    return this;
                }

                /* renamed from: F */
                public C7526b mo53891F(Type type) {
                    type.getClass();
                    this.f39653d |= 1;
                    this.f39654e = type;
                    return this;
                }

                /* renamed from: j */
                public Value build() {
                    Value l = mo53898l();
                    if (l.isInitialized()) {
                        return l;
                    }
                    throw C7610a.C7611a.m61947b(l);
                }

                /* renamed from: l */
                public Value mo53898l() {
                    Value value = new Value((GeneratedMessageLite.C7601b) this);
                    int i = this.f39653d;
                    int i2 = 1;
                    if ((i & 1) != 1) {
                        i2 = 0;
                    }
                    Type unused = value.type_ = this.f39654e;
                    if ((i & 2) == 2) {
                        i2 |= 2;
                    }
                    long unused2 = value.intValue_ = this.f39655g;
                    if ((i & 4) == 4) {
                        i2 |= 4;
                    }
                    float unused3 = value.floatValue_ = this.f39656k;
                    if ((i & 8) == 8) {
                        i2 |= 8;
                    }
                    double unused4 = value.doubleValue_ = this.f39657r;
                    if ((i & 16) == 16) {
                        i2 |= 16;
                    }
                    int unused5 = value.stringValue_ = this.f39658s;
                    if ((i & 32) == 32) {
                        i2 |= 32;
                    }
                    int unused6 = value.classId_ = this.f39659x;
                    if ((i & 64) == 64) {
                        i2 |= 64;
                    }
                    int unused7 = value.enumValueId_ = this.f39660y;
                    if ((i & 128) == 128) {
                        i2 |= 128;
                    }
                    ProtoBuf$Annotation unused8 = value.annotation_ = this.f39649A;
                    if ((this.f39653d & 256) == 256) {
                        this.f39650B = Collections.unmodifiableList(this.f39650B);
                        this.f39653d &= -257;
                    }
                    List unused9 = value.arrayElement_ = this.f39650B;
                    if ((i & RecyclerView.C1231a0.FLAG_ADAPTER_POSITION_UNKNOWN) == 512) {
                        i2 |= 256;
                    }
                    int unused10 = value.arrayDimensionCount_ = this.f39651C;
                    if ((i & RecyclerView.C1231a0.FLAG_ADAPTER_FULLUPDATE) == 1024) {
                        i2 |= RecyclerView.C1231a0.FLAG_ADAPTER_POSITION_UNKNOWN;
                    }
                    int unused11 = value.flags_ = this.f39652H;
                    int unused12 = value.bitField0_ = i2;
                    return value;
                }

                /* renamed from: m */
                public C7526b mo53895d() {
                    return m61232o().mo53896g(mo53898l());
                }

                /* renamed from: p */
                public final void mo53901p() {
                    if ((this.f39653d & 256) != 256) {
                        this.f39650B = new ArrayList(this.f39650B);
                        this.f39653d |= 256;
                    }
                }

                /* renamed from: r */
                public final void mo53902r() {
                }

                /* renamed from: t */
                public C7526b mo53903t(ProtoBuf$Annotation protoBuf$Annotation) {
                    if ((this.f39653d & 128) != 128 || this.f39649A == ProtoBuf$Annotation.getDefaultInstance()) {
                        this.f39649A = protoBuf$Annotation;
                    } else {
                        this.f39649A = ProtoBuf$Annotation.newBuilder(this.f39649A).mo53896g(protoBuf$Annotation).mo53921l();
                    }
                    this.f39653d |= 128;
                    return this;
                }

                /* renamed from: u */
                public C7526b mo53896g(Value value) {
                    if (value == Value.getDefaultInstance()) {
                        return this;
                    }
                    if (value.hasType()) {
                        mo53891F(value.getType());
                    }
                    if (value.hasIntValue()) {
                        mo53889D(value.getIntValue());
                    }
                    if (value.hasFloatValue()) {
                        mo53888C(value.getFloatValue());
                    }
                    if (value.hasDoubleValue()) {
                        mo53908y(value.getDoubleValue());
                    }
                    if (value.hasStringValue()) {
                        mo53890E(value.getStringValue());
                    }
                    if (value.hasClassId()) {
                        mo53907x(value.getClassId());
                    }
                    if (value.hasEnumValueId()) {
                        mo53909z(value.getEnumValueId());
                    }
                    if (value.hasAnnotation()) {
                        mo53903t(value.getAnnotation());
                    }
                    if (!value.arrayElement_.isEmpty()) {
                        if (this.f39650B.isEmpty()) {
                            this.f39650B = value.arrayElement_;
                            this.f39653d &= -257;
                        } else {
                            mo53901p();
                            this.f39650B.addAll(value.arrayElement_);
                        }
                    }
                    if (value.hasArrayDimensionCount()) {
                        mo53906w(value.getArrayDimensionCount());
                    }
                    if (value.hasFlags()) {
                        mo53887B(value.getFlags());
                    }
                    mo54652h(mo54651f().mo50826j(value.unknownFields));
                    return this;
                }

                /* renamed from: v */
                public C7526b mo53900n(C7614c cVar, C7616d dVar) throws IOException {
                    Value value;
                    Value value2 = null;
                    try {
                        Value c = Value.PARSER.mo52753c(cVar, dVar);
                        if (c != null) {
                            mo53896g(c);
                        }
                        return this;
                    } catch (InvalidProtocolBufferException e) {
                        value = (Value) e.getUnfinishedMessage();
                        throw e;
                    } catch (Throwable th) {
                        th = th;
                        value2 = value;
                    }
                    if (value2 != null) {
                        mo53896g(value2);
                    }
                    throw th;
                }

                /* renamed from: w */
                public C7526b mo53906w(int i) {
                    this.f39653d |= RecyclerView.C1231a0.FLAG_ADAPTER_POSITION_UNKNOWN;
                    this.f39651C = i;
                    return this;
                }

                /* renamed from: x */
                public C7526b mo53907x(int i) {
                    this.f39653d |= 32;
                    this.f39659x = i;
                    return this;
                }

                /* renamed from: y */
                public C7526b mo53908y(double d) {
                    this.f39653d |= 8;
                    this.f39657r = d;
                    return this;
                }

                /* renamed from: z */
                public C7526b mo53909z(int i) {
                    this.f39653d |= 64;
                    this.f39660y = i;
                    return this;
                }
            }

            static {
                Value value = new Value(true);
                f39646a = value;
                value.mo53859b();
            }

            public static Value getDefaultInstance() {
                return f39646a;
            }

            public static C7526b newBuilder() {
                return C7526b.m61232o();
            }

            /* renamed from: b */
            public final void mo53859b() {
                this.type_ = Type.BYTE;
                this.intValue_ = 0;
                this.floatValue_ = Utils.FLOAT_EPSILON;
                this.doubleValue_ = Utils.DOUBLE_EPSILON;
                this.stringValue_ = 0;
                this.classId_ = 0;
                this.enumValueId_ = 0;
                this.annotation_ = ProtoBuf$Annotation.getDefaultInstance();
                this.arrayElement_ = Collections.emptyList();
                this.arrayDimensionCount_ = 0;
                this.flags_ = 0;
            }

            public ProtoBuf$Annotation getAnnotation() {
                return this.annotation_;
            }

            public int getArrayDimensionCount() {
                return this.arrayDimensionCount_;
            }

            public Value getArrayElement(int i) {
                return this.arrayElement_.get(i);
            }

            public int getArrayElementCount() {
                return this.arrayElement_.size();
            }

            public List<Value> getArrayElementList() {
                return this.arrayElement_;
            }

            public int getClassId() {
                return this.classId_;
            }

            public double getDoubleValue() {
                return this.doubleValue_;
            }

            public int getEnumValueId() {
                return this.enumValueId_;
            }

            public int getFlags() {
                return this.flags_;
            }

            public float getFloatValue() {
                return this.floatValue_;
            }

            public long getIntValue() {
                return this.intValue_;
            }

            public jm4<Value> getParserForType() {
                return PARSER;
            }

            public int getSerializedSize() {
                int i;
                int i2 = this.memoizedSerializedSize;
                if (i2 != -1) {
                    return i2;
                }
                if ((this.bitField0_ & 1) == 1) {
                    i = CodedOutputStream.m61859h(1, this.type_.getNumber()) + 0;
                } else {
                    i = 0;
                }
                if ((this.bitField0_ & 2) == 2) {
                    i += CodedOutputStream.m61843A(2, this.intValue_);
                }
                if ((this.bitField0_ & 4) == 4) {
                    i += CodedOutputStream.m61863l(3, this.floatValue_);
                }
                if ((this.bitField0_ & 8) == 8) {
                    i += CodedOutputStream.m61857f(4, this.doubleValue_);
                }
                if ((this.bitField0_ & 16) == 16) {
                    i += CodedOutputStream.m61866o(5, this.stringValue_);
                }
                if ((this.bitField0_ & 32) == 32) {
                    i += CodedOutputStream.m61866o(6, this.classId_);
                }
                if ((this.bitField0_ & 64) == 64) {
                    i += CodedOutputStream.m61866o(7, this.enumValueId_);
                }
                if ((this.bitField0_ & 128) == 128) {
                    i += CodedOutputStream.m61870s(8, this.annotation_);
                }
                for (int i3 = 0; i3 < this.arrayElement_.size(); i3++) {
                    i += CodedOutputStream.m61870s(9, this.arrayElement_.get(i3));
                }
                if ((this.bitField0_ & RecyclerView.C1231a0.FLAG_ADAPTER_POSITION_UNKNOWN) == 512) {
                    i += CodedOutputStream.m61866o(10, this.flags_);
                }
                if ((this.bitField0_ & 256) == 256) {
                    i += CodedOutputStream.m61866o(11, this.arrayDimensionCount_);
                }
                int size = i + this.unknownFields.size();
                this.memoizedSerializedSize = size;
                return size;
            }

            public int getStringValue() {
                return this.stringValue_;
            }

            public Type getType() {
                return this.type_;
            }

            public boolean hasAnnotation() {
                if ((this.bitField0_ & 128) == 128) {
                    return true;
                }
                return false;
            }

            public boolean hasArrayDimensionCount() {
                if ((this.bitField0_ & 256) == 256) {
                    return true;
                }
                return false;
            }

            public boolean hasClassId() {
                if ((this.bitField0_ & 32) == 32) {
                    return true;
                }
                return false;
            }

            public boolean hasDoubleValue() {
                if ((this.bitField0_ & 8) == 8) {
                    return true;
                }
                return false;
            }

            public boolean hasEnumValueId() {
                if ((this.bitField0_ & 64) == 64) {
                    return true;
                }
                return false;
            }

            public boolean hasFlags() {
                if ((this.bitField0_ & RecyclerView.C1231a0.FLAG_ADAPTER_POSITION_UNKNOWN) == 512) {
                    return true;
                }
                return false;
            }

            public boolean hasFloatValue() {
                if ((this.bitField0_ & 4) == 4) {
                    return true;
                }
                return false;
            }

            public boolean hasIntValue() {
                if ((this.bitField0_ & 2) == 2) {
                    return true;
                }
                return false;
            }

            public boolean hasStringValue() {
                if ((this.bitField0_ & 16) == 16) {
                    return true;
                }
                return false;
            }

            public boolean hasType() {
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
                if (!hasAnnotation() || getAnnotation().isInitialized()) {
                    for (int i = 0; i < getArrayElementCount(); i++) {
                        if (!getArrayElement(i).isInitialized()) {
                            this.memoizedIsInitialized = 0;
                            return false;
                        }
                    }
                    this.memoizedIsInitialized = 1;
                    return true;
                }
                this.memoizedIsInitialized = 0;
                return false;
            }

            public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
                getSerializedSize();
                if ((this.bitField0_ & 1) == 1) {
                    codedOutputStream.mo54606S(1, this.type_.getNumber());
                }
                if ((this.bitField0_ & 2) == 2) {
                    codedOutputStream.mo54633t0(2, this.intValue_);
                }
                if ((this.bitField0_ & 4) == 4) {
                    codedOutputStream.mo54610W(3, this.floatValue_);
                }
                if ((this.bitField0_ & 8) == 8) {
                    codedOutputStream.mo54604Q(4, this.doubleValue_);
                }
                if ((this.bitField0_ & 16) == 16) {
                    codedOutputStream.mo54614a0(5, this.stringValue_);
                }
                if ((this.bitField0_ & 32) == 32) {
                    codedOutputStream.mo54614a0(6, this.classId_);
                }
                if ((this.bitField0_ & 64) == 64) {
                    codedOutputStream.mo54614a0(7, this.enumValueId_);
                }
                if ((this.bitField0_ & 128) == 128) {
                    codedOutputStream.mo54617d0(8, this.annotation_);
                }
                for (int i = 0; i < this.arrayElement_.size(); i++) {
                    codedOutputStream.mo54617d0(9, this.arrayElement_.get(i));
                }
                if ((this.bitField0_ & RecyclerView.C1231a0.FLAG_ADAPTER_POSITION_UNKNOWN) == 512) {
                    codedOutputStream.mo54614a0(10, this.flags_);
                }
                if ((this.bitField0_ & 256) == 256) {
                    codedOutputStream.mo54614a0(11, this.arrayDimensionCount_);
                }
                codedOutputStream.mo54622i0(this.unknownFields);
            }

            public static C7526b newBuilder(Value value) {
                return newBuilder().mo53896g(value);
            }

            public Value getDefaultInstanceForType() {
                return f39646a;
            }

            public C7526b newBuilderForType() {
                return newBuilder();
            }

            public C7526b toBuilder() {
                return newBuilder(this);
            }

            public Value(GeneratedMessageLite.C7601b bVar) {
                super(bVar);
                this.memoizedIsInitialized = -1;
                this.memoizedSerializedSize = -1;
                this.unknownFields = bVar.mo54651f();
            }

            public Value(boolean z) {
                this.memoizedIsInitialized = -1;
                this.memoizedSerializedSize = -1;
                this.unknownFields = c70.f37074a;
            }

            public Value(C7614c cVar, C7616d dVar) throws InvalidProtocolBufferException {
                this.memoizedIsInitialized = -1;
                this.memoizedSerializedSize = -1;
                mo53859b();
                c70.C6928b D = c70.m56312D();
                CodedOutputStream J = CodedOutputStream.m61851J(D, 1);
                boolean z = false;
                boolean z2 = false;
                while (!z) {
                    try {
                        int K = cVar.mo54700K();
                        switch (K) {
                            case 0:
                                z = true;
                                break;
                            case 8:
                                int n = cVar.mo54719n();
                                Type valueOf = Type.valueOf(n);
                                if (valueOf != null) {
                                    this.bitField0_ |= 1;
                                    this.type_ = valueOf;
                                    break;
                                } else {
                                    J.mo54628o0(K);
                                    J.mo54628o0(n);
                                    break;
                                }
                            case 16:
                                this.bitField0_ |= 2;
                                this.intValue_ = cVar.mo54697H();
                                break;
                            case 29:
                                this.bitField0_ |= 4;
                                this.floatValue_ = cVar.mo54722q();
                                break;
                            case 33:
                                this.bitField0_ |= 8;
                                this.doubleValue_ = cVar.mo54718m();
                                break;
                            case 40:
                                this.bitField0_ |= 16;
                                this.stringValue_ = cVar.mo54724s();
                                break;
                            case 48:
                                this.bitField0_ |= 32;
                                this.classId_ = cVar.mo54724s();
                                break;
                            case 56:
                                this.bitField0_ |= 64;
                                this.enumValueId_ = cVar.mo54724s();
                                break;
                            case 66:
                                C7530b builder = (this.bitField0_ & 128) == 128 ? this.annotation_.toBuilder() : null;
                                ProtoBuf$Annotation protoBuf$Annotation = (ProtoBuf$Annotation) cVar.mo54726u(ProtoBuf$Annotation.PARSER, dVar);
                                this.annotation_ = protoBuf$Annotation;
                                if (builder != null) {
                                    builder.mo53896g(protoBuf$Annotation);
                                    this.annotation_ = builder.mo53921l();
                                }
                                this.bitField0_ |= 128;
                                break;
                            case 74:
                                if (!(z2 & true)) {
                                    this.arrayElement_ = new ArrayList();
                                    z2 |= true;
                                }
                                this.arrayElement_.add(cVar.mo54726u(PARSER, dVar));
                                break;
                            case 80:
                                this.bitField0_ |= RecyclerView.C1231a0.FLAG_ADAPTER_POSITION_UNKNOWN;
                                this.flags_ = cVar.mo54724s();
                                break;
                            case 88:
                                this.bitField0_ |= 256;
                                this.arrayDimensionCount_ = cVar.mo54724s();
                                break;
                            default:
                                if (parseUnknownField(cVar, J, dVar, K)) {
                                    break;
                                }
                                z = true;
                                break;
                        }
                    } catch (InvalidProtocolBufferException e) {
                        throw e.setUnfinishedMessage(this);
                    } catch (IOException e2) {
                        throw new InvalidProtocolBufferException(e2.getMessage()).setUnfinishedMessage(this);
                    } catch (Throwable th) {
                        if (z2 & true) {
                            this.arrayElement_ = Collections.unmodifiableList(this.arrayElement_);
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
                    this.arrayElement_ = Collections.unmodifiableList(this.arrayElement_);
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

        /* renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Annotation$Argument$a */
        public static class C7527a extends C7613b<Argument> {
            /* renamed from: m */
            public Argument mo52753c(C7614c cVar, C7616d dVar) throws InvalidProtocolBufferException {
                return new Argument(cVar, dVar);
            }
        }

        /* renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Annotation$Argument$b */
        public static final class C7528b extends GeneratedMessageLite.C7601b<Argument, C7528b> implements ru3 {

            /* renamed from: d */
            public int f39661d;

            /* renamed from: e */
            public int f39662e;

            /* renamed from: g */
            public Value f39663g = Value.getDefaultInstance();

            public C7528b() {
                mo53914p();
            }

            /* renamed from: o */
            public static C7528b m61257o() {
                return new C7528b();
            }

            /* renamed from: j */
            public Argument build() {
                Argument l = mo53912l();
                if (l.isInitialized()) {
                    return l;
                }
                throw C7610a.C7611a.m61947b(l);
            }

            /* renamed from: l */
            public Argument mo53912l() {
                Argument argument = new Argument((GeneratedMessageLite.C7601b) this);
                int i = this.f39661d;
                int i2 = 1;
                if ((i & 1) != 1) {
                    i2 = 0;
                }
                int unused = argument.nameId_ = this.f39662e;
                if ((i & 2) == 2) {
                    i2 |= 2;
                }
                Value unused2 = argument.value_ = this.f39663g;
                int unused3 = argument.bitField0_ = i2;
                return argument;
            }

            /* renamed from: m */
            public C7528b mo53895d() {
                return m61257o().mo53896g(mo53912l());
            }

            /* renamed from: p */
            public final void mo53914p() {
            }

            /* renamed from: r */
            public C7528b mo53896g(Argument argument) {
                if (argument == Argument.getDefaultInstance()) {
                    return this;
                }
                if (argument.hasNameId()) {
                    mo53918v(argument.getNameId());
                }
                if (argument.hasValue()) {
                    mo53917u(argument.getValue());
                }
                mo54652h(mo54651f().mo50826j(argument.unknownFields));
                return this;
            }

            /* renamed from: t */
            public C7528b mo53900n(C7614c cVar, C7616d dVar) throws IOException {
                Argument argument;
                Argument argument2 = null;
                try {
                    Argument c = Argument.PARSER.mo52753c(cVar, dVar);
                    if (c != null) {
                        mo53896g(c);
                    }
                    return this;
                } catch (InvalidProtocolBufferException e) {
                    argument = (Argument) e.getUnfinishedMessage();
                    throw e;
                } catch (Throwable th) {
                    th = th;
                    argument2 = argument;
                }
                if (argument2 != null) {
                    mo53896g(argument2);
                }
                throw th;
            }

            /* renamed from: u */
            public C7528b mo53917u(Value value) {
                if ((this.f39661d & 2) != 2 || this.f39663g == Value.getDefaultInstance()) {
                    this.f39663g = value;
                } else {
                    this.f39663g = Value.newBuilder(this.f39663g).mo53896g(value).mo53898l();
                }
                this.f39661d |= 2;
                return this;
            }

            /* renamed from: v */
            public C7528b mo53918v(int i) {
                this.f39661d |= 1;
                this.f39662e = i;
                return this;
            }
        }

        static {
            Argument argument = new Argument(true);
            f39645a = argument;
            argument.mo53854b();
        }

        public static Argument getDefaultInstance() {
            return f39645a;
        }

        public static C7528b newBuilder() {
            return C7528b.m61257o();
        }

        /* renamed from: b */
        public final void mo53854b() {
            this.nameId_ = 0;
            this.value_ = Value.getDefaultInstance();
        }

        public int getNameId() {
            return this.nameId_;
        }

        public jm4<Argument> getParserForType() {
            return PARSER;
        }

        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int i2 = 0;
            if ((this.bitField0_ & 1) == 1) {
                i2 = 0 + CodedOutputStream.m61866o(1, this.nameId_);
            }
            if ((this.bitField0_ & 2) == 2) {
                i2 += CodedOutputStream.m61870s(2, this.value_);
            }
            int size = i2 + this.unknownFields.size();
            this.memoizedSerializedSize = size;
            return size;
        }

        public Value getValue() {
            return this.value_;
        }

        public boolean hasNameId() {
            if ((this.bitField0_ & 1) == 1) {
                return true;
            }
            return false;
        }

        public boolean hasValue() {
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
            if (!hasNameId()) {
                this.memoizedIsInitialized = 0;
                return false;
            } else if (!hasValue()) {
                this.memoizedIsInitialized = 0;
                return false;
            } else if (!getValue().isInitialized()) {
                this.memoizedIsInitialized = 0;
                return false;
            } else {
                this.memoizedIsInitialized = 1;
                return true;
            }
        }

        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            getSerializedSize();
            if ((this.bitField0_ & 1) == 1) {
                codedOutputStream.mo54614a0(1, this.nameId_);
            }
            if ((this.bitField0_ & 2) == 2) {
                codedOutputStream.mo54617d0(2, this.value_);
            }
            codedOutputStream.mo54622i0(this.unknownFields);
        }

        public static C7528b newBuilder(Argument argument) {
            return newBuilder().mo53896g(argument);
        }

        public Argument getDefaultInstanceForType() {
            return f39645a;
        }

        public C7528b newBuilderForType() {
            return newBuilder();
        }

        public C7528b toBuilder() {
            return newBuilder(this);
        }

        public Argument(GeneratedMessageLite.C7601b bVar) {
            super(bVar);
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = bVar.mo54651f();
        }

        public Argument(boolean z) {
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = c70.f37074a;
        }

        public Argument(C7614c cVar, C7616d dVar) throws InvalidProtocolBufferException {
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            mo53854b();
            c70.C6928b D = c70.m56312D();
            CodedOutputStream J = CodedOutputStream.m61851J(D, 1);
            boolean z = false;
            while (!z) {
                try {
                    int K = cVar.mo54700K();
                    if (K != 0) {
                        if (K == 8) {
                            this.bitField0_ |= 1;
                            this.nameId_ = cVar.mo54724s();
                        } else if (K == 18) {
                            Value.C7526b builder = (this.bitField0_ & 2) == 2 ? this.value_.toBuilder() : null;
                            Value value = (Value) cVar.mo54726u(Value.PARSER, dVar);
                            this.value_ = value;
                            if (builder != null) {
                                builder.mo53896g(value);
                                this.value_ = builder.mo53898l();
                            }
                            this.bitField0_ |= 2;
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

    /* renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Annotation$a */
    public static class C7529a extends C7613b<ProtoBuf$Annotation> {
        /* renamed from: m */
        public ProtoBuf$Annotation mo52753c(C7614c cVar, C7616d dVar) throws InvalidProtocolBufferException {
            return new ProtoBuf$Annotation(cVar, dVar);
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Annotation$b */
    public static final class C7530b extends GeneratedMessageLite.C7601b<ProtoBuf$Annotation, C7530b> implements ru3 {

        /* renamed from: d */
        public int f39664d;

        /* renamed from: e */
        public int f39665e;

        /* renamed from: g */
        public List<Argument> f39666g = Collections.emptyList();

        public C7530b() {
            mo53924r();
        }

        /* renamed from: o */
        public static C7530b m61273o() {
            return new C7530b();
        }

        /* renamed from: j */
        public ProtoBuf$Annotation build() {
            ProtoBuf$Annotation l = mo53921l();
            if (l.isInitialized()) {
                return l;
            }
            throw C7610a.C7611a.m61947b(l);
        }

        /* renamed from: l */
        public ProtoBuf$Annotation mo53921l() {
            ProtoBuf$Annotation protoBuf$Annotation = new ProtoBuf$Annotation((GeneratedMessageLite.C7601b) this);
            int i = 1;
            if ((this.f39664d & 1) != 1) {
                i = 0;
            }
            int unused = protoBuf$Annotation.id_ = this.f39665e;
            if ((this.f39664d & 2) == 2) {
                this.f39666g = Collections.unmodifiableList(this.f39666g);
                this.f39664d &= -3;
            }
            List unused2 = protoBuf$Annotation.argument_ = this.f39666g;
            int unused3 = protoBuf$Annotation.bitField0_ = i;
            return protoBuf$Annotation;
        }

        /* renamed from: m */
        public C7530b mo53895d() {
            return m61273o().mo53896g(mo53921l());
        }

        /* renamed from: p */
        public final void mo53923p() {
            if ((this.f39664d & 2) != 2) {
                this.f39666g = new ArrayList(this.f39666g);
                this.f39664d |= 2;
            }
        }

        /* renamed from: r */
        public final void mo53924r() {
        }

        /* renamed from: t */
        public C7530b mo53896g(ProtoBuf$Annotation protoBuf$Annotation) {
            if (protoBuf$Annotation == ProtoBuf$Annotation.getDefaultInstance()) {
                return this;
            }
            if (protoBuf$Annotation.hasId()) {
                mo53927v(protoBuf$Annotation.getId());
            }
            if (!protoBuf$Annotation.argument_.isEmpty()) {
                if (this.f39666g.isEmpty()) {
                    this.f39666g = protoBuf$Annotation.argument_;
                    this.f39664d &= -3;
                } else {
                    mo53923p();
                    this.f39666g.addAll(protoBuf$Annotation.argument_);
                }
            }
            mo54652h(mo54651f().mo50826j(protoBuf$Annotation.unknownFields));
            return this;
        }

        /* renamed from: u */
        public C7530b mo53900n(C7614c cVar, C7616d dVar) throws IOException {
            ProtoBuf$Annotation protoBuf$Annotation;
            ProtoBuf$Annotation protoBuf$Annotation2 = null;
            try {
                ProtoBuf$Annotation c = ProtoBuf$Annotation.PARSER.mo52753c(cVar, dVar);
                if (c != null) {
                    mo53896g(c);
                }
                return this;
            } catch (InvalidProtocolBufferException e) {
                protoBuf$Annotation = (ProtoBuf$Annotation) e.getUnfinishedMessage();
                throw e;
            } catch (Throwable th) {
                th = th;
                protoBuf$Annotation2 = protoBuf$Annotation;
            }
            if (protoBuf$Annotation2 != null) {
                mo53896g(protoBuf$Annotation2);
            }
            throw th;
        }

        /* renamed from: v */
        public C7530b mo53927v(int i) {
            this.f39664d |= 1;
            this.f39665e = i;
            return this;
        }
    }

    static {
        ProtoBuf$Annotation protoBuf$Annotation = new ProtoBuf$Annotation(true);
        f39644a = protoBuf$Annotation;
        protoBuf$Annotation.mo53841b();
    }

    public static ProtoBuf$Annotation getDefaultInstance() {
        return f39644a;
    }

    public static C7530b newBuilder() {
        return C7530b.m61273o();
    }

    /* renamed from: b */
    public final void mo53841b() {
        this.id_ = 0;
        this.argument_ = Collections.emptyList();
    }

    public Argument getArgument(int i) {
        return this.argument_.get(i);
    }

    public int getArgumentCount() {
        return this.argument_.size();
    }

    public List<Argument> getArgumentList() {
        return this.argument_;
    }

    public int getId() {
        return this.id_;
    }

    public jm4<ProtoBuf$Annotation> getParserForType() {
        return PARSER;
    }

    public int getSerializedSize() {
        int i;
        int i2 = this.memoizedSerializedSize;
        if (i2 != -1) {
            return i2;
        }
        if ((this.bitField0_ & 1) == 1) {
            i = CodedOutputStream.m61866o(1, this.id_) + 0;
        } else {
            i = 0;
        }
        for (int i3 = 0; i3 < this.argument_.size(); i3++) {
            i += CodedOutputStream.m61870s(2, this.argument_.get(i3));
        }
        int size = i + this.unknownFields.size();
        this.memoizedSerializedSize = size;
        return size;
    }

    public boolean hasId() {
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
        if (!hasId()) {
            this.memoizedIsInitialized = 0;
            return false;
        }
        for (int i = 0; i < getArgumentCount(); i++) {
            if (!getArgument(i).isInitialized()) {
                this.memoizedIsInitialized = 0;
                return false;
            }
        }
        this.memoizedIsInitialized = 1;
        return true;
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        getSerializedSize();
        if ((this.bitField0_ & 1) == 1) {
            codedOutputStream.mo54614a0(1, this.id_);
        }
        for (int i = 0; i < this.argument_.size(); i++) {
            codedOutputStream.mo54617d0(2, this.argument_.get(i));
        }
        codedOutputStream.mo54622i0(this.unknownFields);
    }

    public static C7530b newBuilder(ProtoBuf$Annotation protoBuf$Annotation) {
        return newBuilder().mo53896g(protoBuf$Annotation);
    }

    public ProtoBuf$Annotation getDefaultInstanceForType() {
        return f39644a;
    }

    public C7530b newBuilderForType() {
        return newBuilder();
    }

    public C7530b toBuilder() {
        return newBuilder(this);
    }

    public ProtoBuf$Annotation(GeneratedMessageLite.C7601b bVar) {
        super(bVar);
        this.memoizedIsInitialized = -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = bVar.mo54651f();
    }

    public ProtoBuf$Annotation(boolean z) {
        this.memoizedIsInitialized = -1;
        this.memoizedSerializedSize = -1;
        this.unknownFields = c70.f37074a;
    }

    public ProtoBuf$Annotation(C7614c cVar, C7616d dVar) throws InvalidProtocolBufferException {
        this.memoizedIsInitialized = -1;
        this.memoizedSerializedSize = -1;
        mo53841b();
        c70.C6928b D = c70.m56312D();
        CodedOutputStream J = CodedOutputStream.m61851J(D, 1);
        boolean z = false;
        boolean z2 = false;
        while (!z) {
            try {
                int K = cVar.mo54700K();
                if (K != 0) {
                    if (K == 8) {
                        this.bitField0_ |= 1;
                        this.id_ = cVar.mo54724s();
                    } else if (K == 18) {
                        if (!(z2 & true)) {
                            this.argument_ = new ArrayList();
                            z2 |= true;
                        }
                        this.argument_.add(cVar.mo54726u(Argument.PARSER, dVar));
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
                    this.argument_ = Collections.unmodifiableList(this.argument_);
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
            this.argument_ = Collections.unmodifiableList(this.argument_);
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
