package kotlin.reflect.jvm.internal.impl.metadata.jvm;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Annotation;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Class;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Constructor;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Function;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Package;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Property;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeParameter;
import kotlin.reflect.jvm.internal.impl.protobuf.C7610a;
import kotlin.reflect.jvm.internal.impl.protobuf.C7613b;
import kotlin.reflect.jvm.internal.impl.protobuf.C7614c;
import kotlin.reflect.jvm.internal.impl.protobuf.C7616d;
import kotlin.reflect.jvm.internal.impl.protobuf.C7621f;
import kotlin.reflect.jvm.internal.impl.protobuf.C7628h;
import kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import kotlin.reflect.jvm.internal.impl.protobuf.WireFormat;
import p000.c70;

public final class JvmProtoBuf {

    /* renamed from: a */
    public static final GeneratedMessageLite.C7604e<ProtoBuf$Constructor, JvmMethodSignature> f39864a;

    /* renamed from: b */
    public static final GeneratedMessageLite.C7604e<ProtoBuf$Function, JvmMethodSignature> f39865b;

    /* renamed from: c */
    public static final GeneratedMessageLite.C7604e<ProtoBuf$Function, Integer> f39866c;

    /* renamed from: d */
    public static final GeneratedMessageLite.C7604e<ProtoBuf$Property, JvmPropertySignature> f39867d;

    /* renamed from: e */
    public static final GeneratedMessageLite.C7604e<ProtoBuf$Property, Integer> f39868e;

    /* renamed from: f */
    public static final GeneratedMessageLite.C7604e<ProtoBuf$Type, List<ProtoBuf$Annotation>> f39869f;

    /* renamed from: g */
    public static final GeneratedMessageLite.C7604e<ProtoBuf$Type, Boolean> f39870g = GeneratedMessageLite.newSingularGeneratedExtension(ProtoBuf$Type.getDefaultInstance(), Boolean.FALSE, (C7628h) null, (C7621f.C7623b<?>) null, 101, WireFormat.FieldType.BOOL, Boolean.class);

    /* renamed from: h */
    public static final GeneratedMessageLite.C7604e<ProtoBuf$TypeParameter, List<ProtoBuf$Annotation>> f39871h;

    /* renamed from: i */
    public static final GeneratedMessageLite.C7604e<ProtoBuf$Class, Integer> f39872i;

    /* renamed from: j */
    public static final GeneratedMessageLite.C7604e<ProtoBuf$Class, List<ProtoBuf$Property>> f39873j;

    /* renamed from: k */
    public static final GeneratedMessageLite.C7604e<ProtoBuf$Class, Integer> f39874k;

    /* renamed from: l */
    public static final GeneratedMessageLite.C7604e<ProtoBuf$Class, Integer> f39875l;

    /* renamed from: m */
    public static final GeneratedMessageLite.C7604e<ProtoBuf$Package, Integer> f39876m;

    /* renamed from: n */
    public static final GeneratedMessageLite.C7604e<ProtoBuf$Package, List<ProtoBuf$Property>> f39877n;

    public static final class JvmFieldSignature extends GeneratedMessageLite implements ru3 {
        public static jm4<JvmFieldSignature> PARSER = new C7585a();

        /* renamed from: a */
        public static final JvmFieldSignature f39878a;
        /* access modifiers changed from: private */
        public int bitField0_;
        /* access modifiers changed from: private */
        public int desc_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        /* access modifiers changed from: private */
        public int name_;
        /* access modifiers changed from: private */
        public final c70 unknownFields;

        /* renamed from: kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$JvmFieldSignature$a */
        public static class C7585a extends C7613b<JvmFieldSignature> {
            /* renamed from: m */
            public JvmFieldSignature mo52753c(C7614c cVar, C7616d dVar) throws InvalidProtocolBufferException {
                return new JvmFieldSignature(cVar, dVar);
            }
        }

        /* renamed from: kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$JvmFieldSignature$b */
        public static final class C7586b extends GeneratedMessageLite.C7601b<JvmFieldSignature, C7586b> implements ru3 {

            /* renamed from: d */
            public int f39879d;

            /* renamed from: e */
            public int f39880e;

            /* renamed from: g */
            public int f39881g;

            public C7586b() {
                mo54516p();
            }

            /* renamed from: o */
            public static C7586b m61747o() {
                return new C7586b();
            }

            /* renamed from: j */
            public JvmFieldSignature build() {
                JvmFieldSignature l = mo54514l();
                if (l.isInitialized()) {
                    return l;
                }
                throw C7610a.C7611a.m61947b(l);
            }

            /* renamed from: l */
            public JvmFieldSignature mo54514l() {
                JvmFieldSignature jvmFieldSignature = new JvmFieldSignature((GeneratedMessageLite.C7601b) this);
                int i = this.f39879d;
                int i2 = 1;
                if ((i & 1) != 1) {
                    i2 = 0;
                }
                int unused = jvmFieldSignature.name_ = this.f39880e;
                if ((i & 2) == 2) {
                    i2 |= 2;
                }
                int unused2 = jvmFieldSignature.desc_ = this.f39881g;
                int unused3 = jvmFieldSignature.bitField0_ = i2;
                return jvmFieldSignature;
            }

            /* renamed from: m */
            public C7586b mo53895d() {
                return m61747o().mo53896g(mo54514l());
            }

            /* renamed from: p */
            public final void mo54516p() {
            }

            /* renamed from: r */
            public C7586b mo53896g(JvmFieldSignature jvmFieldSignature) {
                if (jvmFieldSignature == JvmFieldSignature.getDefaultInstance()) {
                    return this;
                }
                if (jvmFieldSignature.hasName()) {
                    mo54520v(jvmFieldSignature.getName());
                }
                if (jvmFieldSignature.hasDesc()) {
                    mo54519u(jvmFieldSignature.getDesc());
                }
                mo54652h(mo54651f().mo50826j(jvmFieldSignature.unknownFields));
                return this;
            }

            /* renamed from: t */
            public C7586b mo53900n(C7614c cVar, C7616d dVar) throws IOException {
                JvmFieldSignature jvmFieldSignature;
                JvmFieldSignature jvmFieldSignature2 = null;
                try {
                    JvmFieldSignature c = JvmFieldSignature.PARSER.mo52753c(cVar, dVar);
                    if (c != null) {
                        mo53896g(c);
                    }
                    return this;
                } catch (InvalidProtocolBufferException e) {
                    jvmFieldSignature = (JvmFieldSignature) e.getUnfinishedMessage();
                    throw e;
                } catch (Throwable th) {
                    th = th;
                    jvmFieldSignature2 = jvmFieldSignature;
                }
                if (jvmFieldSignature2 != null) {
                    mo53896g(jvmFieldSignature2);
                }
                throw th;
            }

            /* renamed from: u */
            public C7586b mo54519u(int i) {
                this.f39879d |= 2;
                this.f39881g = i;
                return this;
            }

            /* renamed from: v */
            public C7586b mo54520v(int i) {
                this.f39879d |= 1;
                this.f39880e = i;
                return this;
            }
        }

        static {
            JvmFieldSignature jvmFieldSignature = new JvmFieldSignature(true);
            f39878a = jvmFieldSignature;
            jvmFieldSignature.mo54507b();
        }

        public static JvmFieldSignature getDefaultInstance() {
            return f39878a;
        }

        public static C7586b newBuilder() {
            return C7586b.m61747o();
        }

        /* renamed from: b */
        public final void mo54507b() {
            this.name_ = 0;
            this.desc_ = 0;
        }

        public int getDesc() {
            return this.desc_;
        }

        public int getName() {
            return this.name_;
        }

        public jm4<JvmFieldSignature> getParserForType() {
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
            if ((this.bitField0_ & 2) == 2) {
                i2 += CodedOutputStream.m61866o(2, this.desc_);
            }
            int size = i2 + this.unknownFields.size();
            this.memoizedSerializedSize = size;
            return size;
        }

        public boolean hasDesc() {
            if ((this.bitField0_ & 2) == 2) {
                return true;
            }
            return false;
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
            this.memoizedIsInitialized = 1;
            return true;
        }

        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            getSerializedSize();
            if ((this.bitField0_ & 1) == 1) {
                codedOutputStream.mo54614a0(1, this.name_);
            }
            if ((this.bitField0_ & 2) == 2) {
                codedOutputStream.mo54614a0(2, this.desc_);
            }
            codedOutputStream.mo54622i0(this.unknownFields);
        }

        public static C7586b newBuilder(JvmFieldSignature jvmFieldSignature) {
            return newBuilder().mo53896g(jvmFieldSignature);
        }

        public JvmFieldSignature getDefaultInstanceForType() {
            return f39878a;
        }

        public C7586b newBuilderForType() {
            return newBuilder();
        }

        public C7586b toBuilder() {
            return newBuilder(this);
        }

        public JvmFieldSignature(GeneratedMessageLite.C7601b bVar) {
            super(bVar);
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = bVar.mo54651f();
        }

        public JvmFieldSignature(boolean z) {
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = c70.f37074a;
        }

        public JvmFieldSignature(C7614c cVar, C7616d dVar) throws InvalidProtocolBufferException {
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            mo54507b();
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
                        } else if (K == 16) {
                            this.bitField0_ |= 2;
                            this.desc_ = cVar.mo54724s();
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

    public static final class JvmMethodSignature extends GeneratedMessageLite implements ru3 {
        public static jm4<JvmMethodSignature> PARSER = new C7587a();

        /* renamed from: a */
        public static final JvmMethodSignature f39882a;
        /* access modifiers changed from: private */
        public int bitField0_;
        /* access modifiers changed from: private */
        public int desc_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        /* access modifiers changed from: private */
        public int name_;
        /* access modifiers changed from: private */
        public final c70 unknownFields;

        /* renamed from: kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$JvmMethodSignature$a */
        public static class C7587a extends C7613b<JvmMethodSignature> {
            /* renamed from: m */
            public JvmMethodSignature mo52753c(C7614c cVar, C7616d dVar) throws InvalidProtocolBufferException {
                return new JvmMethodSignature(cVar, dVar);
            }
        }

        /* renamed from: kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$JvmMethodSignature$b */
        public static final class C7588b extends GeneratedMessageLite.C7601b<JvmMethodSignature, C7588b> implements ru3 {

            /* renamed from: d */
            public int f39883d;

            /* renamed from: e */
            public int f39884e;

            /* renamed from: g */
            public int f39885g;

            public C7588b() {
                mo54530p();
            }

            /* renamed from: o */
            public static C7588b m61764o() {
                return new C7588b();
            }

            /* renamed from: j */
            public JvmMethodSignature build() {
                JvmMethodSignature l = mo54528l();
                if (l.isInitialized()) {
                    return l;
                }
                throw C7610a.C7611a.m61947b(l);
            }

            /* renamed from: l */
            public JvmMethodSignature mo54528l() {
                JvmMethodSignature jvmMethodSignature = new JvmMethodSignature((GeneratedMessageLite.C7601b) this);
                int i = this.f39883d;
                int i2 = 1;
                if ((i & 1) != 1) {
                    i2 = 0;
                }
                int unused = jvmMethodSignature.name_ = this.f39884e;
                if ((i & 2) == 2) {
                    i2 |= 2;
                }
                int unused2 = jvmMethodSignature.desc_ = this.f39885g;
                int unused3 = jvmMethodSignature.bitField0_ = i2;
                return jvmMethodSignature;
            }

            /* renamed from: m */
            public C7588b mo53895d() {
                return m61764o().mo53896g(mo54528l());
            }

            /* renamed from: p */
            public final void mo54530p() {
            }

            /* renamed from: r */
            public C7588b mo53896g(JvmMethodSignature jvmMethodSignature) {
                if (jvmMethodSignature == JvmMethodSignature.getDefaultInstance()) {
                    return this;
                }
                if (jvmMethodSignature.hasName()) {
                    mo54534v(jvmMethodSignature.getName());
                }
                if (jvmMethodSignature.hasDesc()) {
                    mo54533u(jvmMethodSignature.getDesc());
                }
                mo54652h(mo54651f().mo50826j(jvmMethodSignature.unknownFields));
                return this;
            }

            /* renamed from: t */
            public C7588b mo53900n(C7614c cVar, C7616d dVar) throws IOException {
                JvmMethodSignature jvmMethodSignature;
                JvmMethodSignature jvmMethodSignature2 = null;
                try {
                    JvmMethodSignature c = JvmMethodSignature.PARSER.mo52753c(cVar, dVar);
                    if (c != null) {
                        mo53896g(c);
                    }
                    return this;
                } catch (InvalidProtocolBufferException e) {
                    jvmMethodSignature = (JvmMethodSignature) e.getUnfinishedMessage();
                    throw e;
                } catch (Throwable th) {
                    th = th;
                    jvmMethodSignature2 = jvmMethodSignature;
                }
                if (jvmMethodSignature2 != null) {
                    mo53896g(jvmMethodSignature2);
                }
                throw th;
            }

            /* renamed from: u */
            public C7588b mo54533u(int i) {
                this.f39883d |= 2;
                this.f39885g = i;
                return this;
            }

            /* renamed from: v */
            public C7588b mo54534v(int i) {
                this.f39883d |= 1;
                this.f39884e = i;
                return this;
            }
        }

        static {
            JvmMethodSignature jvmMethodSignature = new JvmMethodSignature(true);
            f39882a = jvmMethodSignature;
            jvmMethodSignature.mo54521b();
        }

        public static JvmMethodSignature getDefaultInstance() {
            return f39882a;
        }

        public static C7588b newBuilder() {
            return C7588b.m61764o();
        }

        /* renamed from: b */
        public final void mo54521b() {
            this.name_ = 0;
            this.desc_ = 0;
        }

        public int getDesc() {
            return this.desc_;
        }

        public int getName() {
            return this.name_;
        }

        public jm4<JvmMethodSignature> getParserForType() {
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
            if ((this.bitField0_ & 2) == 2) {
                i2 += CodedOutputStream.m61866o(2, this.desc_);
            }
            int size = i2 + this.unknownFields.size();
            this.memoizedSerializedSize = size;
            return size;
        }

        public boolean hasDesc() {
            if ((this.bitField0_ & 2) == 2) {
                return true;
            }
            return false;
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
            this.memoizedIsInitialized = 1;
            return true;
        }

        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            getSerializedSize();
            if ((this.bitField0_ & 1) == 1) {
                codedOutputStream.mo54614a0(1, this.name_);
            }
            if ((this.bitField0_ & 2) == 2) {
                codedOutputStream.mo54614a0(2, this.desc_);
            }
            codedOutputStream.mo54622i0(this.unknownFields);
        }

        public static C7588b newBuilder(JvmMethodSignature jvmMethodSignature) {
            return newBuilder().mo53896g(jvmMethodSignature);
        }

        public JvmMethodSignature getDefaultInstanceForType() {
            return f39882a;
        }

        public C7588b newBuilderForType() {
            return newBuilder();
        }

        public C7588b toBuilder() {
            return newBuilder(this);
        }

        public JvmMethodSignature(GeneratedMessageLite.C7601b bVar) {
            super(bVar);
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = bVar.mo54651f();
        }

        public JvmMethodSignature(boolean z) {
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = c70.f37074a;
        }

        public JvmMethodSignature(C7614c cVar, C7616d dVar) throws InvalidProtocolBufferException {
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            mo54521b();
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
                        } else if (K == 16) {
                            this.bitField0_ |= 2;
                            this.desc_ = cVar.mo54724s();
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

    public static final class JvmPropertySignature extends GeneratedMessageLite implements ru3 {
        public static jm4<JvmPropertySignature> PARSER = new C7589a();

        /* renamed from: a */
        public static final JvmPropertySignature f39886a;
        /* access modifiers changed from: private */
        public int bitField0_;
        /* access modifiers changed from: private */
        public JvmMethodSignature delegateMethod_;
        /* access modifiers changed from: private */
        public JvmFieldSignature field_;
        /* access modifiers changed from: private */
        public JvmMethodSignature getter_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        /* access modifiers changed from: private */
        public JvmMethodSignature setter_;
        /* access modifiers changed from: private */
        public JvmMethodSignature syntheticMethod_;
        /* access modifiers changed from: private */
        public final c70 unknownFields;

        /* renamed from: kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$JvmPropertySignature$a */
        public static class C7589a extends C7613b<JvmPropertySignature> {
            /* renamed from: m */
            public JvmPropertySignature mo52753c(C7614c cVar, C7616d dVar) throws InvalidProtocolBufferException {
                return new JvmPropertySignature(cVar, dVar);
            }
        }

        /* renamed from: kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$JvmPropertySignature$b */
        public static final class C7590b extends GeneratedMessageLite.C7601b<JvmPropertySignature, C7590b> implements ru3 {

            /* renamed from: d */
            public int f39887d;

            /* renamed from: e */
            public JvmFieldSignature f39888e = JvmFieldSignature.getDefaultInstance();

            /* renamed from: g */
            public JvmMethodSignature f39889g = JvmMethodSignature.getDefaultInstance();

            /* renamed from: k */
            public JvmMethodSignature f39890k = JvmMethodSignature.getDefaultInstance();

            /* renamed from: r */
            public JvmMethodSignature f39891r = JvmMethodSignature.getDefaultInstance();

            /* renamed from: s */
            public JvmMethodSignature f39892s = JvmMethodSignature.getDefaultInstance();

            public C7590b() {
                mo54550p();
            }

            /* renamed from: o */
            public static C7590b m61781o() {
                return new C7590b();
            }

            /* renamed from: j */
            public JvmPropertySignature build() {
                JvmPropertySignature l = mo54548l();
                if (l.isInitialized()) {
                    return l;
                }
                throw C7610a.C7611a.m61947b(l);
            }

            /* renamed from: l */
            public JvmPropertySignature mo54548l() {
                JvmPropertySignature jvmPropertySignature = new JvmPropertySignature((GeneratedMessageLite.C7601b) this);
                int i = this.f39887d;
                int i2 = 1;
                if ((i & 1) != 1) {
                    i2 = 0;
                }
                JvmFieldSignature unused = jvmPropertySignature.field_ = this.f39888e;
                if ((i & 2) == 2) {
                    i2 |= 2;
                }
                JvmMethodSignature unused2 = jvmPropertySignature.syntheticMethod_ = this.f39889g;
                if ((i & 4) == 4) {
                    i2 |= 4;
                }
                JvmMethodSignature unused3 = jvmPropertySignature.getter_ = this.f39890k;
                if ((i & 8) == 8) {
                    i2 |= 8;
                }
                JvmMethodSignature unused4 = jvmPropertySignature.setter_ = this.f39891r;
                if ((i & 16) == 16) {
                    i2 |= 16;
                }
                JvmMethodSignature unused5 = jvmPropertySignature.delegateMethod_ = this.f39892s;
                int unused6 = jvmPropertySignature.bitField0_ = i2;
                return jvmPropertySignature;
            }

            /* renamed from: m */
            public C7590b mo53895d() {
                return m61781o().mo53896g(mo54548l());
            }

            /* renamed from: p */
            public final void mo54550p() {
            }

            /* renamed from: r */
            public C7590b mo54551r(JvmMethodSignature jvmMethodSignature) {
                if ((this.f39887d & 16) != 16 || this.f39892s == JvmMethodSignature.getDefaultInstance()) {
                    this.f39892s = jvmMethodSignature;
                } else {
                    this.f39892s = JvmMethodSignature.newBuilder(this.f39892s).mo53896g(jvmMethodSignature).mo54528l();
                }
                this.f39887d |= 16;
                return this;
            }

            /* renamed from: t */
            public C7590b mo54552t(JvmFieldSignature jvmFieldSignature) {
                if ((this.f39887d & 1) != 1 || this.f39888e == JvmFieldSignature.getDefaultInstance()) {
                    this.f39888e = jvmFieldSignature;
                } else {
                    this.f39888e = JvmFieldSignature.newBuilder(this.f39888e).mo53896g(jvmFieldSignature).mo54514l();
                }
                this.f39887d |= 1;
                return this;
            }

            /* renamed from: u */
            public C7590b mo53896g(JvmPropertySignature jvmPropertySignature) {
                if (jvmPropertySignature == JvmPropertySignature.getDefaultInstance()) {
                    return this;
                }
                if (jvmPropertySignature.hasField()) {
                    mo54552t(jvmPropertySignature.getField());
                }
                if (jvmPropertySignature.hasSyntheticMethod()) {
                    mo54557y(jvmPropertySignature.getSyntheticMethod());
                }
                if (jvmPropertySignature.hasGetter()) {
                    mo54555w(jvmPropertySignature.getGetter());
                }
                if (jvmPropertySignature.hasSetter()) {
                    mo54556x(jvmPropertySignature.getSetter());
                }
                if (jvmPropertySignature.hasDelegateMethod()) {
                    mo54551r(jvmPropertySignature.getDelegateMethod());
                }
                mo54652h(mo54651f().mo50826j(jvmPropertySignature.unknownFields));
                return this;
            }

            /* renamed from: v */
            public C7590b mo53900n(C7614c cVar, C7616d dVar) throws IOException {
                JvmPropertySignature jvmPropertySignature;
                JvmPropertySignature jvmPropertySignature2 = null;
                try {
                    JvmPropertySignature c = JvmPropertySignature.PARSER.mo52753c(cVar, dVar);
                    if (c != null) {
                        mo53896g(c);
                    }
                    return this;
                } catch (InvalidProtocolBufferException e) {
                    jvmPropertySignature = (JvmPropertySignature) e.getUnfinishedMessage();
                    throw e;
                } catch (Throwable th) {
                    th = th;
                    jvmPropertySignature2 = jvmPropertySignature;
                }
                if (jvmPropertySignature2 != null) {
                    mo53896g(jvmPropertySignature2);
                }
                throw th;
            }

            /* renamed from: w */
            public C7590b mo54555w(JvmMethodSignature jvmMethodSignature) {
                if ((this.f39887d & 4) != 4 || this.f39890k == JvmMethodSignature.getDefaultInstance()) {
                    this.f39890k = jvmMethodSignature;
                } else {
                    this.f39890k = JvmMethodSignature.newBuilder(this.f39890k).mo53896g(jvmMethodSignature).mo54528l();
                }
                this.f39887d |= 4;
                return this;
            }

            /* renamed from: x */
            public C7590b mo54556x(JvmMethodSignature jvmMethodSignature) {
                if ((this.f39887d & 8) != 8 || this.f39891r == JvmMethodSignature.getDefaultInstance()) {
                    this.f39891r = jvmMethodSignature;
                } else {
                    this.f39891r = JvmMethodSignature.newBuilder(this.f39891r).mo53896g(jvmMethodSignature).mo54528l();
                }
                this.f39887d |= 8;
                return this;
            }

            /* renamed from: y */
            public C7590b mo54557y(JvmMethodSignature jvmMethodSignature) {
                if ((this.f39887d & 2) != 2 || this.f39889g == JvmMethodSignature.getDefaultInstance()) {
                    this.f39889g = jvmMethodSignature;
                } else {
                    this.f39889g = JvmMethodSignature.newBuilder(this.f39889g).mo53896g(jvmMethodSignature).mo54528l();
                }
                this.f39887d |= 2;
                return this;
            }
        }

        static {
            JvmPropertySignature jvmPropertySignature = new JvmPropertySignature(true);
            f39886a = jvmPropertySignature;
            jvmPropertySignature.mo54535b();
        }

        public static JvmPropertySignature getDefaultInstance() {
            return f39886a;
        }

        public static C7590b newBuilder() {
            return C7590b.m61781o();
        }

        /* renamed from: b */
        public final void mo54535b() {
            this.field_ = JvmFieldSignature.getDefaultInstance();
            this.syntheticMethod_ = JvmMethodSignature.getDefaultInstance();
            this.getter_ = JvmMethodSignature.getDefaultInstance();
            this.setter_ = JvmMethodSignature.getDefaultInstance();
            this.delegateMethod_ = JvmMethodSignature.getDefaultInstance();
        }

        public JvmMethodSignature getDelegateMethod() {
            return this.delegateMethod_;
        }

        public JvmFieldSignature getField() {
            return this.field_;
        }

        public JvmMethodSignature getGetter() {
            return this.getter_;
        }

        public jm4<JvmPropertySignature> getParserForType() {
            return PARSER;
        }

        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int i2 = 0;
            if ((this.bitField0_ & 1) == 1) {
                i2 = 0 + CodedOutputStream.m61870s(1, this.field_);
            }
            if ((this.bitField0_ & 2) == 2) {
                i2 += CodedOutputStream.m61870s(2, this.syntheticMethod_);
            }
            if ((this.bitField0_ & 4) == 4) {
                i2 += CodedOutputStream.m61870s(3, this.getter_);
            }
            if ((this.bitField0_ & 8) == 8) {
                i2 += CodedOutputStream.m61870s(4, this.setter_);
            }
            if ((this.bitField0_ & 16) == 16) {
                i2 += CodedOutputStream.m61870s(5, this.delegateMethod_);
            }
            int size = i2 + this.unknownFields.size();
            this.memoizedSerializedSize = size;
            return size;
        }

        public JvmMethodSignature getSetter() {
            return this.setter_;
        }

        public JvmMethodSignature getSyntheticMethod() {
            return this.syntheticMethod_;
        }

        public boolean hasDelegateMethod() {
            if ((this.bitField0_ & 16) == 16) {
                return true;
            }
            return false;
        }

        public boolean hasField() {
            if ((this.bitField0_ & 1) == 1) {
                return true;
            }
            return false;
        }

        public boolean hasGetter() {
            if ((this.bitField0_ & 4) == 4) {
                return true;
            }
            return false;
        }

        public boolean hasSetter() {
            if ((this.bitField0_ & 8) == 8) {
                return true;
            }
            return false;
        }

        public boolean hasSyntheticMethod() {
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
            this.memoizedIsInitialized = 1;
            return true;
        }

        public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
            getSerializedSize();
            if ((this.bitField0_ & 1) == 1) {
                codedOutputStream.mo54617d0(1, this.field_);
            }
            if ((this.bitField0_ & 2) == 2) {
                codedOutputStream.mo54617d0(2, this.syntheticMethod_);
            }
            if ((this.bitField0_ & 4) == 4) {
                codedOutputStream.mo54617d0(3, this.getter_);
            }
            if ((this.bitField0_ & 8) == 8) {
                codedOutputStream.mo54617d0(4, this.setter_);
            }
            if ((this.bitField0_ & 16) == 16) {
                codedOutputStream.mo54617d0(5, this.delegateMethod_);
            }
            codedOutputStream.mo54622i0(this.unknownFields);
        }

        public static C7590b newBuilder(JvmPropertySignature jvmPropertySignature) {
            return newBuilder().mo53896g(jvmPropertySignature);
        }

        public JvmPropertySignature getDefaultInstanceForType() {
            return f39886a;
        }

        public C7590b newBuilderForType() {
            return newBuilder();
        }

        public C7590b toBuilder() {
            return newBuilder(this);
        }

        public JvmPropertySignature(GeneratedMessageLite.C7601b bVar) {
            super(bVar);
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = bVar.mo54651f();
        }

        public JvmPropertySignature(boolean z) {
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = c70.f37074a;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v1, resolved type: kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$JvmFieldSignature$b} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v3, resolved type: kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$JvmMethodSignature$b} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v5, resolved type: kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$JvmMethodSignature$b} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v7, resolved type: kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$JvmMethodSignature$b} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v9, resolved type: kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$JvmMethodSignature$b} */
        /* JADX WARNING: type inference failed for: r6v0 */
        /* JADX WARNING: type inference failed for: r6v11 */
        /* JADX WARNING: type inference failed for: r6v12 */
        /* JADX WARNING: type inference failed for: r6v13 */
        /* JADX WARNING: type inference failed for: r6v14 */
        /* JADX WARNING: type inference failed for: r6v15 */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public JvmPropertySignature(kotlin.reflect.jvm.internal.impl.protobuf.C7614c r8, kotlin.reflect.jvm.internal.impl.protobuf.C7616d r9) throws kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException {
            /*
                r7 = this;
                r7.<init>()
                r0 = -1
                r7.memoizedIsInitialized = r0
                r7.memoizedSerializedSize = r0
                r7.mo54535b()
                c70$b r0 = p000.c70.m56312D()
                r1 = 1
                kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream r2 = kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream.m61851J(r0, r1)
                r3 = 0
            L_0x0015:
                if (r3 != 0) goto L_0x0131
                int r4 = r8.mo54700K()     // Catch:{ InvalidProtocolBufferException -> 0x0115, IOException -> 0x0106 }
                if (r4 == 0) goto L_0x0101
                r5 = 10
                r6 = 0
                if (r4 == r5) goto L_0x00da
                r5 = 18
                if (r4 == r5) goto L_0x00b2
                r5 = 26
                if (r4 == r5) goto L_0x008a
                r5 = 34
                if (r4 == r5) goto L_0x0062
                r5 = 42
                if (r4 == r5) goto L_0x003a
                boolean r4 = r7.parseUnknownField(r8, r2, r9, r4)     // Catch:{ InvalidProtocolBufferException -> 0x0115, IOException -> 0x0106 }
                if (r4 != 0) goto L_0x0015
                goto L_0x0101
            L_0x003a:
                int r4 = r7.bitField0_     // Catch:{ InvalidProtocolBufferException -> 0x0115, IOException -> 0x0106 }
                r5 = 16
                r4 = r4 & r5
                if (r4 != r5) goto L_0x0047
                kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$JvmMethodSignature r4 = r7.delegateMethod_     // Catch:{ InvalidProtocolBufferException -> 0x0115, IOException -> 0x0106 }
                kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$JvmMethodSignature$b r6 = r4.toBuilder()     // Catch:{ InvalidProtocolBufferException -> 0x0115, IOException -> 0x0106 }
            L_0x0047:
                jm4<kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$JvmMethodSignature> r4 = kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.JvmMethodSignature.PARSER     // Catch:{ InvalidProtocolBufferException -> 0x0115, IOException -> 0x0106 }
                kotlin.reflect.jvm.internal.impl.protobuf.h r4 = r8.mo54726u(r4, r9)     // Catch:{ InvalidProtocolBufferException -> 0x0115, IOException -> 0x0106 }
                kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$JvmMethodSignature r4 = (kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.JvmMethodSignature) r4     // Catch:{ InvalidProtocolBufferException -> 0x0115, IOException -> 0x0106 }
                r7.delegateMethod_ = r4     // Catch:{ InvalidProtocolBufferException -> 0x0115, IOException -> 0x0106 }
                if (r6 == 0) goto L_0x005c
                r6.mo53896g(r4)     // Catch:{ InvalidProtocolBufferException -> 0x0115, IOException -> 0x0106 }
                kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$JvmMethodSignature r4 = r6.mo54528l()     // Catch:{ InvalidProtocolBufferException -> 0x0115, IOException -> 0x0106 }
                r7.delegateMethod_ = r4     // Catch:{ InvalidProtocolBufferException -> 0x0115, IOException -> 0x0106 }
            L_0x005c:
                int r4 = r7.bitField0_     // Catch:{ InvalidProtocolBufferException -> 0x0115, IOException -> 0x0106 }
                r4 = r4 | r5
                r7.bitField0_ = r4     // Catch:{ InvalidProtocolBufferException -> 0x0115, IOException -> 0x0106 }
                goto L_0x0015
            L_0x0062:
                int r4 = r7.bitField0_     // Catch:{ InvalidProtocolBufferException -> 0x0115, IOException -> 0x0106 }
                r5 = 8
                r4 = r4 & r5
                if (r4 != r5) goto L_0x006f
                kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$JvmMethodSignature r4 = r7.setter_     // Catch:{ InvalidProtocolBufferException -> 0x0115, IOException -> 0x0106 }
                kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$JvmMethodSignature$b r6 = r4.toBuilder()     // Catch:{ InvalidProtocolBufferException -> 0x0115, IOException -> 0x0106 }
            L_0x006f:
                jm4<kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$JvmMethodSignature> r4 = kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.JvmMethodSignature.PARSER     // Catch:{ InvalidProtocolBufferException -> 0x0115, IOException -> 0x0106 }
                kotlin.reflect.jvm.internal.impl.protobuf.h r4 = r8.mo54726u(r4, r9)     // Catch:{ InvalidProtocolBufferException -> 0x0115, IOException -> 0x0106 }
                kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$JvmMethodSignature r4 = (kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.JvmMethodSignature) r4     // Catch:{ InvalidProtocolBufferException -> 0x0115, IOException -> 0x0106 }
                r7.setter_ = r4     // Catch:{ InvalidProtocolBufferException -> 0x0115, IOException -> 0x0106 }
                if (r6 == 0) goto L_0x0084
                r6.mo53896g(r4)     // Catch:{ InvalidProtocolBufferException -> 0x0115, IOException -> 0x0106 }
                kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$JvmMethodSignature r4 = r6.mo54528l()     // Catch:{ InvalidProtocolBufferException -> 0x0115, IOException -> 0x0106 }
                r7.setter_ = r4     // Catch:{ InvalidProtocolBufferException -> 0x0115, IOException -> 0x0106 }
            L_0x0084:
                int r4 = r7.bitField0_     // Catch:{ InvalidProtocolBufferException -> 0x0115, IOException -> 0x0106 }
                r4 = r4 | r5
                r7.bitField0_ = r4     // Catch:{ InvalidProtocolBufferException -> 0x0115, IOException -> 0x0106 }
                goto L_0x0015
            L_0x008a:
                int r4 = r7.bitField0_     // Catch:{ InvalidProtocolBufferException -> 0x0115, IOException -> 0x0106 }
                r5 = 4
                r4 = r4 & r5
                if (r4 != r5) goto L_0x0096
                kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$JvmMethodSignature r4 = r7.getter_     // Catch:{ InvalidProtocolBufferException -> 0x0115, IOException -> 0x0106 }
                kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$JvmMethodSignature$b r6 = r4.toBuilder()     // Catch:{ InvalidProtocolBufferException -> 0x0115, IOException -> 0x0106 }
            L_0x0096:
                jm4<kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$JvmMethodSignature> r4 = kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.JvmMethodSignature.PARSER     // Catch:{ InvalidProtocolBufferException -> 0x0115, IOException -> 0x0106 }
                kotlin.reflect.jvm.internal.impl.protobuf.h r4 = r8.mo54726u(r4, r9)     // Catch:{ InvalidProtocolBufferException -> 0x0115, IOException -> 0x0106 }
                kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$JvmMethodSignature r4 = (kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.JvmMethodSignature) r4     // Catch:{ InvalidProtocolBufferException -> 0x0115, IOException -> 0x0106 }
                r7.getter_ = r4     // Catch:{ InvalidProtocolBufferException -> 0x0115, IOException -> 0x0106 }
                if (r6 == 0) goto L_0x00ab
                r6.mo53896g(r4)     // Catch:{ InvalidProtocolBufferException -> 0x0115, IOException -> 0x0106 }
                kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$JvmMethodSignature r4 = r6.mo54528l()     // Catch:{ InvalidProtocolBufferException -> 0x0115, IOException -> 0x0106 }
                r7.getter_ = r4     // Catch:{ InvalidProtocolBufferException -> 0x0115, IOException -> 0x0106 }
            L_0x00ab:
                int r4 = r7.bitField0_     // Catch:{ InvalidProtocolBufferException -> 0x0115, IOException -> 0x0106 }
                r4 = r4 | r5
                r7.bitField0_ = r4     // Catch:{ InvalidProtocolBufferException -> 0x0115, IOException -> 0x0106 }
                goto L_0x0015
            L_0x00b2:
                int r4 = r7.bitField0_     // Catch:{ InvalidProtocolBufferException -> 0x0115, IOException -> 0x0106 }
                r5 = 2
                r4 = r4 & r5
                if (r4 != r5) goto L_0x00be
                kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$JvmMethodSignature r4 = r7.syntheticMethod_     // Catch:{ InvalidProtocolBufferException -> 0x0115, IOException -> 0x0106 }
                kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$JvmMethodSignature$b r6 = r4.toBuilder()     // Catch:{ InvalidProtocolBufferException -> 0x0115, IOException -> 0x0106 }
            L_0x00be:
                jm4<kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$JvmMethodSignature> r4 = kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.JvmMethodSignature.PARSER     // Catch:{ InvalidProtocolBufferException -> 0x0115, IOException -> 0x0106 }
                kotlin.reflect.jvm.internal.impl.protobuf.h r4 = r8.mo54726u(r4, r9)     // Catch:{ InvalidProtocolBufferException -> 0x0115, IOException -> 0x0106 }
                kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$JvmMethodSignature r4 = (kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.JvmMethodSignature) r4     // Catch:{ InvalidProtocolBufferException -> 0x0115, IOException -> 0x0106 }
                r7.syntheticMethod_ = r4     // Catch:{ InvalidProtocolBufferException -> 0x0115, IOException -> 0x0106 }
                if (r6 == 0) goto L_0x00d3
                r6.mo53896g(r4)     // Catch:{ InvalidProtocolBufferException -> 0x0115, IOException -> 0x0106 }
                kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$JvmMethodSignature r4 = r6.mo54528l()     // Catch:{ InvalidProtocolBufferException -> 0x0115, IOException -> 0x0106 }
                r7.syntheticMethod_ = r4     // Catch:{ InvalidProtocolBufferException -> 0x0115, IOException -> 0x0106 }
            L_0x00d3:
                int r4 = r7.bitField0_     // Catch:{ InvalidProtocolBufferException -> 0x0115, IOException -> 0x0106 }
                r4 = r4 | r5
                r7.bitField0_ = r4     // Catch:{ InvalidProtocolBufferException -> 0x0115, IOException -> 0x0106 }
                goto L_0x0015
            L_0x00da:
                int r4 = r7.bitField0_     // Catch:{ InvalidProtocolBufferException -> 0x0115, IOException -> 0x0106 }
                r4 = r4 & r1
                if (r4 != r1) goto L_0x00e5
                kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$JvmFieldSignature r4 = r7.field_     // Catch:{ InvalidProtocolBufferException -> 0x0115, IOException -> 0x0106 }
                kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$JvmFieldSignature$b r6 = r4.toBuilder()     // Catch:{ InvalidProtocolBufferException -> 0x0115, IOException -> 0x0106 }
            L_0x00e5:
                jm4<kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$JvmFieldSignature> r4 = kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.JvmFieldSignature.PARSER     // Catch:{ InvalidProtocolBufferException -> 0x0115, IOException -> 0x0106 }
                kotlin.reflect.jvm.internal.impl.protobuf.h r4 = r8.mo54726u(r4, r9)     // Catch:{ InvalidProtocolBufferException -> 0x0115, IOException -> 0x0106 }
                kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$JvmFieldSignature r4 = (kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.JvmFieldSignature) r4     // Catch:{ InvalidProtocolBufferException -> 0x0115, IOException -> 0x0106 }
                r7.field_ = r4     // Catch:{ InvalidProtocolBufferException -> 0x0115, IOException -> 0x0106 }
                if (r6 == 0) goto L_0x00fa
                r6.mo53896g(r4)     // Catch:{ InvalidProtocolBufferException -> 0x0115, IOException -> 0x0106 }
                kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$JvmFieldSignature r4 = r6.mo54514l()     // Catch:{ InvalidProtocolBufferException -> 0x0115, IOException -> 0x0106 }
                r7.field_ = r4     // Catch:{ InvalidProtocolBufferException -> 0x0115, IOException -> 0x0106 }
            L_0x00fa:
                int r4 = r7.bitField0_     // Catch:{ InvalidProtocolBufferException -> 0x0115, IOException -> 0x0106 }
                r4 = r4 | r1
                r7.bitField0_ = r4     // Catch:{ InvalidProtocolBufferException -> 0x0115, IOException -> 0x0106 }
                goto L_0x0015
            L_0x0101:
                r3 = r1
                goto L_0x0015
            L_0x0104:
                r8 = move-exception
                goto L_0x011b
            L_0x0106:
                r8 = move-exception
                kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException r9 = new kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException     // Catch:{ all -> 0x0104 }
                java.lang.String r8 = r8.getMessage()     // Catch:{ all -> 0x0104 }
                r9.<init>(r8)     // Catch:{ all -> 0x0104 }
                kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException r8 = r9.setUnfinishedMessage(r7)     // Catch:{ all -> 0x0104 }
                throw r8     // Catch:{ all -> 0x0104 }
            L_0x0115:
                r8 = move-exception
                kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException r8 = r8.setUnfinishedMessage(r7)     // Catch:{ all -> 0x0104 }
                throw r8     // Catch:{ all -> 0x0104 }
            L_0x011b:
                r2.mo54597I()     // Catch:{ IOException -> 0x011e, all -> 0x0125 }
            L_0x011e:
                c70 r9 = r0.mo50838d()
                r7.unknownFields = r9
                goto L_0x012d
            L_0x0125:
                r8 = move-exception
                c70 r9 = r0.mo50838d()
                r7.unknownFields = r9
                throw r8
            L_0x012d:
                r7.makeExtensionsImmutable()
                throw r8
            L_0x0131:
                r2.mo54597I()     // Catch:{ IOException -> 0x0134, all -> 0x013b }
            L_0x0134:
                c70 r8 = r0.mo50838d()
                r7.unknownFields = r8
                goto L_0x0143
            L_0x013b:
                r8 = move-exception
                c70 r9 = r0.mo50838d()
                r7.unknownFields = r9
                throw r8
            L_0x0143:
                r7.makeExtensionsImmutable()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf.JvmPropertySignature.<init>(kotlin.reflect.jvm.internal.impl.protobuf.c, kotlin.reflect.jvm.internal.impl.protobuf.d):void");
        }
    }

    public static final class StringTableTypes extends GeneratedMessageLite implements ru3 {
        public static jm4<StringTableTypes> PARSER = new C7594a();

        /* renamed from: a */
        public static final StringTableTypes f39893a;
        private int localNameMemoizedSerializedSize;
        /* access modifiers changed from: private */
        public List<Integer> localName_;
        private byte memoizedIsInitialized;
        private int memoizedSerializedSize;
        /* access modifiers changed from: private */
        public List<Record> record_;
        /* access modifiers changed from: private */
        public final c70 unknownFields;

        public static final class Record extends GeneratedMessageLite implements ru3 {
            public static jm4<Record> PARSER = new C7592a();

            /* renamed from: a */
            public static final Record f39894a;
            /* access modifiers changed from: private */
            public int bitField0_;
            private byte memoizedIsInitialized;
            private int memoizedSerializedSize;
            /* access modifiers changed from: private */
            public Operation operation_;
            /* access modifiers changed from: private */
            public int predefinedIndex_;
            /* access modifiers changed from: private */
            public int range_;
            private int replaceCharMemoizedSerializedSize;
            /* access modifiers changed from: private */
            public List<Integer> replaceChar_;
            /* access modifiers changed from: private */
            public Object string_;
            private int substringIndexMemoizedSerializedSize;
            /* access modifiers changed from: private */
            public List<Integer> substringIndex_;
            /* access modifiers changed from: private */
            public final c70 unknownFields;

            public enum Operation implements C7621f.C7622a {
                NONE(0, 0),
                INTERNAL_TO_CLASS_ID(1, 1),
                DESC_TO_CLASS_ID(2, 2);
                

                /* renamed from: a */
                public static C7621f.C7623b<Operation> f39895a;
                private final int value;

                /* renamed from: kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$StringTableTypes$Record$Operation$a */
                public static class C7591a implements C7621f.C7623b<Operation> {
                    /* renamed from: a */
                    public Operation findValueByNumber(int i) {
                        return Operation.valueOf(i);
                    }
                }

                /* access modifiers changed from: public */
                static {
                    f39895a = new C7591a();
                }

                /* access modifiers changed from: public */
                Operation(int i, int i2) {
                    this.value = i2;
                }

                public final int getNumber() {
                    return this.value;
                }

                public static Operation valueOf(int i) {
                    if (i == 0) {
                        return NONE;
                    }
                    if (i == 1) {
                        return INTERNAL_TO_CLASS_ID;
                    }
                    if (i != 2) {
                        return null;
                    }
                    return DESC_TO_CLASS_ID;
                }
            }

            /* renamed from: kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$StringTableTypes$Record$a */
            public static class C7592a extends C7613b<Record> {
                /* renamed from: m */
                public Record mo52753c(C7614c cVar, C7616d dVar) throws InvalidProtocolBufferException {
                    return new Record(cVar, dVar);
                }
            }

            /* renamed from: kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$StringTableTypes$Record$b */
            public static final class C7593b extends GeneratedMessageLite.C7601b<Record, C7593b> implements ru3 {

                /* renamed from: d */
                public int f39897d;

                /* renamed from: e */
                public int f39898e = 1;

                /* renamed from: g */
                public int f39899g;

                /* renamed from: k */
                public Object f39900k = "";

                /* renamed from: r */
                public Operation f39901r = Operation.NONE;

                /* renamed from: s */
                public List<Integer> f39902s = Collections.emptyList();

                /* renamed from: x */
                public List<Integer> f39903x = Collections.emptyList();

                public C7593b() {
                    mo54582t();
                }

                /* renamed from: o */
                public static C7593b m61803o() {
                    return new C7593b();
                }

                /* renamed from: j */
                public Record build() {
                    Record l = mo54578l();
                    if (l.isInitialized()) {
                        return l;
                    }
                    throw C7610a.C7611a.m61947b(l);
                }

                /* renamed from: l */
                public Record mo54578l() {
                    Record record = new Record((GeneratedMessageLite.C7601b) this);
                    int i = this.f39897d;
                    int i2 = 1;
                    if ((i & 1) != 1) {
                        i2 = 0;
                    }
                    int unused = record.range_ = this.f39898e;
                    if ((i & 2) == 2) {
                        i2 |= 2;
                    }
                    int unused2 = record.predefinedIndex_ = this.f39899g;
                    if ((i & 4) == 4) {
                        i2 |= 4;
                    }
                    Object unused3 = record.string_ = this.f39900k;
                    if ((i & 8) == 8) {
                        i2 |= 8;
                    }
                    Operation unused4 = record.operation_ = this.f39901r;
                    if ((this.f39897d & 16) == 16) {
                        this.f39902s = Collections.unmodifiableList(this.f39902s);
                        this.f39897d &= -17;
                    }
                    List unused5 = record.substringIndex_ = this.f39902s;
                    if ((this.f39897d & 32) == 32) {
                        this.f39903x = Collections.unmodifiableList(this.f39903x);
                        this.f39897d &= -33;
                    }
                    List unused6 = record.replaceChar_ = this.f39903x;
                    int unused7 = record.bitField0_ = i2;
                    return record;
                }

                /* renamed from: m */
                public C7593b mo53895d() {
                    return m61803o().mo53896g(mo54578l());
                }

                /* renamed from: p */
                public final void mo54580p() {
                    if ((this.f39897d & 32) != 32) {
                        this.f39903x = new ArrayList(this.f39903x);
                        this.f39897d |= 32;
                    }
                }

                /* renamed from: r */
                public final void mo54581r() {
                    if ((this.f39897d & 16) != 16) {
                        this.f39902s = new ArrayList(this.f39902s);
                        this.f39897d |= 16;
                    }
                }

                /* renamed from: t */
                public final void mo54582t() {
                }

                /* renamed from: u */
                public C7593b mo53896g(Record record) {
                    if (record == Record.getDefaultInstance()) {
                        return this;
                    }
                    if (record.hasRange()) {
                        mo54587y(record.getRange());
                    }
                    if (record.hasPredefinedIndex()) {
                        mo54586x(record.getPredefinedIndex());
                    }
                    if (record.hasString()) {
                        this.f39897d |= 4;
                        this.f39900k = record.string_;
                    }
                    if (record.hasOperation()) {
                        mo54585w(record.getOperation());
                    }
                    if (!record.substringIndex_.isEmpty()) {
                        if (this.f39902s.isEmpty()) {
                            this.f39902s = record.substringIndex_;
                            this.f39897d &= -17;
                        } else {
                            mo54581r();
                            this.f39902s.addAll(record.substringIndex_);
                        }
                    }
                    if (!record.replaceChar_.isEmpty()) {
                        if (this.f39903x.isEmpty()) {
                            this.f39903x = record.replaceChar_;
                            this.f39897d &= -33;
                        } else {
                            mo54580p();
                            this.f39903x.addAll(record.replaceChar_);
                        }
                    }
                    mo54652h(mo54651f().mo50826j(record.unknownFields));
                    return this;
                }

                /* renamed from: v */
                public C7593b mo53900n(C7614c cVar, C7616d dVar) throws IOException {
                    Record record;
                    Record record2 = null;
                    try {
                        Record c = Record.PARSER.mo52753c(cVar, dVar);
                        if (c != null) {
                            mo53896g(c);
                        }
                        return this;
                    } catch (InvalidProtocolBufferException e) {
                        record = (Record) e.getUnfinishedMessage();
                        throw e;
                    } catch (Throwable th) {
                        th = th;
                        record2 = record;
                    }
                    if (record2 != null) {
                        mo53896g(record2);
                    }
                    throw th;
                }

                /* renamed from: w */
                public C7593b mo54585w(Operation operation) {
                    operation.getClass();
                    this.f39897d |= 8;
                    this.f39901r = operation;
                    return this;
                }

                /* renamed from: x */
                public C7593b mo54586x(int i) {
                    this.f39897d |= 2;
                    this.f39899g = i;
                    return this;
                }

                /* renamed from: y */
                public C7593b mo54587y(int i) {
                    this.f39897d |= 1;
                    this.f39898e = i;
                    return this;
                }
            }

            static {
                Record record = new Record(true);
                f39894a = record;
                record.mo54561b();
            }

            public static Record getDefaultInstance() {
                return f39894a;
            }

            public static C7593b newBuilder() {
                return C7593b.m61803o();
            }

            /* renamed from: b */
            public final void mo54561b() {
                this.range_ = 1;
                this.predefinedIndex_ = 0;
                this.string_ = "";
                this.operation_ = Operation.NONE;
                this.substringIndex_ = Collections.emptyList();
                this.replaceChar_ = Collections.emptyList();
            }

            public Operation getOperation() {
                return this.operation_;
            }

            public jm4<Record> getParserForType() {
                return PARSER;
            }

            public int getPredefinedIndex() {
                return this.predefinedIndex_;
            }

            public int getRange() {
                return this.range_;
            }

            public int getReplaceCharCount() {
                return this.replaceChar_.size();
            }

            public List<Integer> getReplaceCharList() {
                return this.replaceChar_;
            }

            public int getSerializedSize() {
                int i;
                int i2 = this.memoizedSerializedSize;
                if (i2 != -1) {
                    return i2;
                }
                if ((this.bitField0_ & 1) == 1) {
                    i = CodedOutputStream.m61866o(1, this.range_) + 0;
                } else {
                    i = 0;
                }
                if ((this.bitField0_ & 2) == 2) {
                    i += CodedOutputStream.m61866o(2, this.predefinedIndex_);
                }
                if ((this.bitField0_ & 8) == 8) {
                    i += CodedOutputStream.m61859h(3, this.operation_.getNumber());
                }
                int i3 = 0;
                for (int i4 = 0; i4 < this.substringIndex_.size(); i4++) {
                    i3 += CodedOutputStream.m61867p(this.substringIndex_.get(i4).intValue());
                }
                int i5 = i + i3;
                if (!getSubstringIndexList().isEmpty()) {
                    i5 = i5 + 1 + CodedOutputStream.m61867p(i3);
                }
                this.substringIndexMemoizedSerializedSize = i3;
                int i6 = 0;
                for (int i7 = 0; i7 < this.replaceChar_.size(); i7++) {
                    i6 += CodedOutputStream.m61867p(this.replaceChar_.get(i7).intValue());
                }
                int i8 = i5 + i6;
                if (!getReplaceCharList().isEmpty()) {
                    i8 = i8 + 1 + CodedOutputStream.m61867p(i6);
                }
                this.replaceCharMemoizedSerializedSize = i6;
                if ((this.bitField0_ & 4) == 4) {
                    i8 += CodedOutputStream.m61855d(6, getStringBytes());
                }
                int size = i8 + this.unknownFields.size();
                this.memoizedSerializedSize = size;
                return size;
            }

            public String getString() {
                Object obj = this.string_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                c70 c70 = (c70) obj;
                String M = c70.mo50821M();
                if (c70.mo50833w()) {
                    this.string_ = M;
                }
                return M;
            }

            public c70 getStringBytes() {
                Object obj = this.string_;
                if (!(obj instanceof String)) {
                    return (c70) obj;
                }
                c70 q = c70.m56317q((String) obj);
                this.string_ = q;
                return q;
            }

            public int getSubstringIndexCount() {
                return this.substringIndex_.size();
            }

            public List<Integer> getSubstringIndexList() {
                return this.substringIndex_;
            }

            public boolean hasOperation() {
                if ((this.bitField0_ & 8) == 8) {
                    return true;
                }
                return false;
            }

            public boolean hasPredefinedIndex() {
                if ((this.bitField0_ & 2) == 2) {
                    return true;
                }
                return false;
            }

            public boolean hasRange() {
                if ((this.bitField0_ & 1) == 1) {
                    return true;
                }
                return false;
            }

            public boolean hasString() {
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
                this.memoizedIsInitialized = 1;
                return true;
            }

            public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
                getSerializedSize();
                if ((this.bitField0_ & 1) == 1) {
                    codedOutputStream.mo54614a0(1, this.range_);
                }
                if ((this.bitField0_ & 2) == 2) {
                    codedOutputStream.mo54614a0(2, this.predefinedIndex_);
                }
                if ((this.bitField0_ & 8) == 8) {
                    codedOutputStream.mo54606S(3, this.operation_.getNumber());
                }
                if (getSubstringIndexList().size() > 0) {
                    codedOutputStream.mo54628o0(34);
                    codedOutputStream.mo54628o0(this.substringIndexMemoizedSerializedSize);
                }
                for (int i = 0; i < this.substringIndex_.size(); i++) {
                    codedOutputStream.mo54615b0(this.substringIndex_.get(i).intValue());
                }
                if (getReplaceCharList().size() > 0) {
                    codedOutputStream.mo54628o0(42);
                    codedOutputStream.mo54628o0(this.replaceCharMemoizedSerializedSize);
                }
                for (int i2 = 0; i2 < this.replaceChar_.size(); i2++) {
                    codedOutputStream.mo54615b0(this.replaceChar_.get(i2).intValue());
                }
                if ((this.bitField0_ & 4) == 4) {
                    codedOutputStream.mo54602O(6, getStringBytes());
                }
                codedOutputStream.mo54622i0(this.unknownFields);
            }

            public static C7593b newBuilder(Record record) {
                return newBuilder().mo53896g(record);
            }

            public Record getDefaultInstanceForType() {
                return f39894a;
            }

            public C7593b newBuilderForType() {
                return newBuilder();
            }

            public C7593b toBuilder() {
                return newBuilder(this);
            }

            public Record(GeneratedMessageLite.C7601b bVar) {
                super(bVar);
                this.substringIndexMemoizedSerializedSize = -1;
                this.replaceCharMemoizedSerializedSize = -1;
                this.memoizedIsInitialized = -1;
                this.memoizedSerializedSize = -1;
                this.unknownFields = bVar.mo54651f();
            }

            public Record(boolean z) {
                this.substringIndexMemoizedSerializedSize = -1;
                this.replaceCharMemoizedSerializedSize = -1;
                this.memoizedIsInitialized = -1;
                this.memoizedSerializedSize = -1;
                this.unknownFields = c70.f37074a;
            }

            public Record(C7614c cVar, C7616d dVar) throws InvalidProtocolBufferException {
                this.substringIndexMemoizedSerializedSize = -1;
                this.replaceCharMemoizedSerializedSize = -1;
                this.memoizedIsInitialized = -1;
                this.memoizedSerializedSize = -1;
                mo54561b();
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
                                this.range_ = cVar.mo54724s();
                            } else if (K == 16) {
                                this.bitField0_ |= 2;
                                this.predefinedIndex_ = cVar.mo54724s();
                            } else if (K == 24) {
                                int n = cVar.mo54719n();
                                Operation valueOf = Operation.valueOf(n);
                                if (valueOf == null) {
                                    J.mo54628o0(K);
                                    J.mo54628o0(n);
                                } else {
                                    this.bitField0_ |= 8;
                                    this.operation_ = valueOf;
                                }
                            } else if (K == 32) {
                                if (!(z2 & true)) {
                                    this.substringIndex_ = new ArrayList();
                                    z2 |= true;
                                }
                                this.substringIndex_.add(Integer.valueOf(cVar.mo54724s()));
                            } else if (K == 34) {
                                int j = cVar.mo54715j(cVar.mo54691A());
                                if (!(z2 & true) && cVar.mo54712e() > 0) {
                                    this.substringIndex_ = new ArrayList();
                                    z2 |= true;
                                }
                                while (cVar.mo54712e() > 0) {
                                    this.substringIndex_.add(Integer.valueOf(cVar.mo54724s()));
                                }
                                cVar.mo54714i(j);
                            } else if (K == 40) {
                                if (!(z2 & true)) {
                                    this.replaceChar_ = new ArrayList();
                                    z2 |= true;
                                }
                                this.replaceChar_.add(Integer.valueOf(cVar.mo54724s()));
                            } else if (K == 42) {
                                int j2 = cVar.mo54715j(cVar.mo54691A());
                                if (!(z2 & true) && cVar.mo54712e() > 0) {
                                    this.replaceChar_ = new ArrayList();
                                    z2 |= true;
                                }
                                while (cVar.mo54712e() > 0) {
                                    this.replaceChar_.add(Integer.valueOf(cVar.mo54724s()));
                                }
                                cVar.mo54714i(j2);
                            } else if (K == 50) {
                                c70 l = cVar.mo54717l();
                                this.bitField0_ |= 4;
                                this.string_ = l;
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
                            this.substringIndex_ = Collections.unmodifiableList(this.substringIndex_);
                        }
                        if (z2 & true) {
                            this.replaceChar_ = Collections.unmodifiableList(this.replaceChar_);
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
                    this.substringIndex_ = Collections.unmodifiableList(this.substringIndex_);
                }
                if (z2 & true) {
                    this.replaceChar_ = Collections.unmodifiableList(this.replaceChar_);
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

        /* renamed from: kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$StringTableTypes$a */
        public static class C7594a extends C7613b<StringTableTypes> {
            /* renamed from: m */
            public StringTableTypes mo52753c(C7614c cVar, C7616d dVar) throws InvalidProtocolBufferException {
                return new StringTableTypes(cVar, dVar);
            }
        }

        /* renamed from: kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf$StringTableTypes$b */
        public static final class C7595b extends GeneratedMessageLite.C7601b<StringTableTypes, C7595b> implements ru3 {

            /* renamed from: d */
            public int f39904d;

            /* renamed from: e */
            public List<Record> f39905e = Collections.emptyList();

            /* renamed from: g */
            public List<Integer> f39906g = Collections.emptyList();

            public C7595b() {
                mo54594t();
            }

            /* renamed from: o */
            public static C7595b m61822o() {
                return new C7595b();
            }

            /* renamed from: j */
            public StringTableTypes build() {
                StringTableTypes l = mo54590l();
                if (l.isInitialized()) {
                    return l;
                }
                throw C7610a.C7611a.m61947b(l);
            }

            /* renamed from: l */
            public StringTableTypes mo54590l() {
                StringTableTypes stringTableTypes = new StringTableTypes((GeneratedMessageLite.C7601b) this);
                if ((this.f39904d & 1) == 1) {
                    this.f39905e = Collections.unmodifiableList(this.f39905e);
                    this.f39904d &= -2;
                }
                List unused = stringTableTypes.record_ = this.f39905e;
                if ((this.f39904d & 2) == 2) {
                    this.f39906g = Collections.unmodifiableList(this.f39906g);
                    this.f39904d &= -3;
                }
                List unused2 = stringTableTypes.localName_ = this.f39906g;
                return stringTableTypes;
            }

            /* renamed from: m */
            public C7595b mo53895d() {
                return m61822o().mo53896g(mo54590l());
            }

            /* renamed from: p */
            public final void mo54592p() {
                if ((this.f39904d & 2) != 2) {
                    this.f39906g = new ArrayList(this.f39906g);
                    this.f39904d |= 2;
                }
            }

            /* renamed from: r */
            public final void mo54593r() {
                if ((this.f39904d & 1) != 1) {
                    this.f39905e = new ArrayList(this.f39905e);
                    this.f39904d |= 1;
                }
            }

            /* renamed from: t */
            public final void mo54594t() {
            }

            /* renamed from: u */
            public C7595b mo53896g(StringTableTypes stringTableTypes) {
                if (stringTableTypes == StringTableTypes.getDefaultInstance()) {
                    return this;
                }
                if (!stringTableTypes.record_.isEmpty()) {
                    if (this.f39905e.isEmpty()) {
                        this.f39905e = stringTableTypes.record_;
                        this.f39904d &= -2;
                    } else {
                        mo54593r();
                        this.f39905e.addAll(stringTableTypes.record_);
                    }
                }
                if (!stringTableTypes.localName_.isEmpty()) {
                    if (this.f39906g.isEmpty()) {
                        this.f39906g = stringTableTypes.localName_;
                        this.f39904d &= -3;
                    } else {
                        mo54592p();
                        this.f39906g.addAll(stringTableTypes.localName_);
                    }
                }
                mo54652h(mo54651f().mo50826j(stringTableTypes.unknownFields));
                return this;
            }

            /* renamed from: v */
            public C7595b mo53900n(C7614c cVar, C7616d dVar) throws IOException {
                StringTableTypes stringTableTypes;
                StringTableTypes stringTableTypes2 = null;
                try {
                    StringTableTypes c = StringTableTypes.PARSER.mo52753c(cVar, dVar);
                    if (c != null) {
                        mo53896g(c);
                    }
                    return this;
                } catch (InvalidProtocolBufferException e) {
                    stringTableTypes = (StringTableTypes) e.getUnfinishedMessage();
                    throw e;
                } catch (Throwable th) {
                    th = th;
                    stringTableTypes2 = stringTableTypes;
                }
                if (stringTableTypes2 != null) {
                    mo53896g(stringTableTypes2);
                }
                throw th;
            }
        }

        static {
            StringTableTypes stringTableTypes = new StringTableTypes(true);
            f39893a = stringTableTypes;
            stringTableTypes.mo54558b();
        }

        public static StringTableTypes getDefaultInstance() {
            return f39893a;
        }

        public static C7595b newBuilder() {
            return C7595b.m61822o();
        }

        public static StringTableTypes parseDelimitedFrom(InputStream inputStream, C7616d dVar) throws IOException {
            return PARSER.mo52754d(inputStream, dVar);
        }

        /* renamed from: b */
        public final void mo54558b() {
            this.record_ = Collections.emptyList();
            this.localName_ = Collections.emptyList();
        }

        public List<Integer> getLocalNameList() {
            return this.localName_;
        }

        public jm4<StringTableTypes> getParserForType() {
            return PARSER;
        }

        public List<Record> getRecordList() {
            return this.record_;
        }

        public int getSerializedSize() {
            int i = this.memoizedSerializedSize;
            if (i != -1) {
                return i;
            }
            int i2 = 0;
            for (int i3 = 0; i3 < this.record_.size(); i3++) {
                i2 += CodedOutputStream.m61870s(1, this.record_.get(i3));
            }
            int i4 = 0;
            for (int i5 = 0; i5 < this.localName_.size(); i5++) {
                i4 += CodedOutputStream.m61867p(this.localName_.get(i5).intValue());
            }
            int i6 = i2 + i4;
            if (!getLocalNameList().isEmpty()) {
                i6 = i6 + 1 + CodedOutputStream.m61867p(i4);
            }
            this.localNameMemoizedSerializedSize = i4;
            int size = i6 + this.unknownFields.size();
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
            for (int i = 0; i < this.record_.size(); i++) {
                codedOutputStream.mo54617d0(1, this.record_.get(i));
            }
            if (getLocalNameList().size() > 0) {
                codedOutputStream.mo54628o0(42);
                codedOutputStream.mo54628o0(this.localNameMemoizedSerializedSize);
            }
            for (int i2 = 0; i2 < this.localName_.size(); i2++) {
                codedOutputStream.mo54615b0(this.localName_.get(i2).intValue());
            }
            codedOutputStream.mo54622i0(this.unknownFields);
        }

        public static C7595b newBuilder(StringTableTypes stringTableTypes) {
            return newBuilder().mo53896g(stringTableTypes);
        }

        public StringTableTypes getDefaultInstanceForType() {
            return f39893a;
        }

        public C7595b newBuilderForType() {
            return newBuilder();
        }

        public C7595b toBuilder() {
            return newBuilder(this);
        }

        public StringTableTypes(GeneratedMessageLite.C7601b bVar) {
            super(bVar);
            this.localNameMemoizedSerializedSize = -1;
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = bVar.mo54651f();
        }

        public StringTableTypes(boolean z) {
            this.localNameMemoizedSerializedSize = -1;
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            this.unknownFields = c70.f37074a;
        }

        public StringTableTypes(C7614c cVar, C7616d dVar) throws InvalidProtocolBufferException {
            this.localNameMemoizedSerializedSize = -1;
            this.memoizedIsInitialized = -1;
            this.memoizedSerializedSize = -1;
            mo54558b();
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
                                this.record_ = new ArrayList();
                                z2 |= true;
                            }
                            this.record_.add(cVar.mo54726u(Record.PARSER, dVar));
                        } else if (K == 40) {
                            if (!(z2 & true)) {
                                this.localName_ = new ArrayList();
                                z2 |= true;
                            }
                            this.localName_.add(Integer.valueOf(cVar.mo54724s()));
                        } else if (K == 42) {
                            int j = cVar.mo54715j(cVar.mo54691A());
                            if (!(z2 & true) && cVar.mo54712e() > 0) {
                                this.localName_ = new ArrayList();
                                z2 |= true;
                            }
                            while (cVar.mo54712e() > 0) {
                                this.localName_.add(Integer.valueOf(cVar.mo54724s()));
                            }
                            cVar.mo54714i(j);
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
                        this.record_ = Collections.unmodifiableList(this.record_);
                    }
                    if (z2 & true) {
                        this.localName_ = Collections.unmodifiableList(this.localName_);
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
                this.record_ = Collections.unmodifiableList(this.record_);
            }
            if (z2 & true) {
                this.localName_ = Collections.unmodifiableList(this.localName_);
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

    static {
        ProtoBuf$Constructor defaultInstance = ProtoBuf$Constructor.getDefaultInstance();
        JvmMethodSignature defaultInstance2 = JvmMethodSignature.getDefaultInstance();
        JvmMethodSignature defaultInstance3 = JvmMethodSignature.getDefaultInstance();
        WireFormat.FieldType fieldType = WireFormat.FieldType.MESSAGE;
        f39864a = GeneratedMessageLite.newSingularGeneratedExtension(defaultInstance, defaultInstance2, defaultInstance3, (C7621f.C7623b<?>) null, 100, fieldType, JvmMethodSignature.class);
        WireFormat.FieldType fieldType2 = fieldType;
        f39865b = GeneratedMessageLite.newSingularGeneratedExtension(ProtoBuf$Function.getDefaultInstance(), JvmMethodSignature.getDefaultInstance(), JvmMethodSignature.getDefaultInstance(), (C7621f.C7623b<?>) null, 100, fieldType2, JvmMethodSignature.class);
        ProtoBuf$Function defaultInstance4 = ProtoBuf$Function.getDefaultInstance();
        WireFormat.FieldType fieldType3 = WireFormat.FieldType.INT32;
        f39866c = GeneratedMessageLite.newSingularGeneratedExtension(defaultInstance4, null, (C7628h) null, (C7621f.C7623b<?>) null, 101, fieldType3, Integer.class);
        f39867d = GeneratedMessageLite.newSingularGeneratedExtension(ProtoBuf$Property.getDefaultInstance(), JvmPropertySignature.getDefaultInstance(), JvmPropertySignature.getDefaultInstance(), (C7621f.C7623b<?>) null, 100, fieldType2, JvmPropertySignature.class);
        f39868e = GeneratedMessageLite.newSingularGeneratedExtension(ProtoBuf$Property.getDefaultInstance(), null, (C7628h) null, (C7621f.C7623b<?>) null, 101, fieldType3, Integer.class);
        f39869f = GeneratedMessageLite.newRepeatedGeneratedExtension(ProtoBuf$Type.getDefaultInstance(), ProtoBuf$Annotation.getDefaultInstance(), (C7621f.C7623b<?>) null, 100, fieldType, false, ProtoBuf$Annotation.class);
        f39871h = GeneratedMessageLite.newRepeatedGeneratedExtension(ProtoBuf$TypeParameter.getDefaultInstance(), ProtoBuf$Annotation.getDefaultInstance(), (C7621f.C7623b<?>) null, 100, fieldType, false, ProtoBuf$Annotation.class);
        f39872i = GeneratedMessageLite.newSingularGeneratedExtension(ProtoBuf$Class.getDefaultInstance(), null, (C7628h) null, (C7621f.C7623b<?>) null, 101, fieldType3, Integer.class);
        f39873j = GeneratedMessageLite.newRepeatedGeneratedExtension(ProtoBuf$Class.getDefaultInstance(), ProtoBuf$Property.getDefaultInstance(), (C7621f.C7623b<?>) null, 102, fieldType, false, ProtoBuf$Property.class);
        WireFormat.FieldType fieldType4 = fieldType3;
        f39874k = GeneratedMessageLite.newSingularGeneratedExtension(ProtoBuf$Class.getDefaultInstance(), null, (C7628h) null, (C7621f.C7623b<?>) null, 103, fieldType4, Integer.class);
        f39875l = GeneratedMessageLite.newSingularGeneratedExtension(ProtoBuf$Class.getDefaultInstance(), null, (C7628h) null, (C7621f.C7623b<?>) null, 104, fieldType4, Integer.class);
        f39876m = GeneratedMessageLite.newSingularGeneratedExtension(ProtoBuf$Package.getDefaultInstance(), null, (C7628h) null, (C7621f.C7623b<?>) null, 101, fieldType4, Integer.class);
        f39877n = GeneratedMessageLite.newRepeatedGeneratedExtension(ProtoBuf$Package.getDefaultInstance(), ProtoBuf$Property.getDefaultInstance(), (C7621f.C7623b<?>) null, 102, fieldType, false, ProtoBuf$Property.class);
    }

    /* renamed from: a */
    public static void m61742a(C7616d dVar) {
        dVar.mo54733a(f39864a);
        dVar.mo54733a(f39865b);
        dVar.mo54733a(f39866c);
        dVar.mo54733a(f39867d);
        dVar.mo54733a(f39868e);
        dVar.mo54733a(f39869f);
        dVar.mo54733a(f39870g);
        dVar.mo54733a(f39871h);
        dVar.mo54733a(f39872i);
        dVar.mo54733a(f39873j);
        dVar.mo54733a(f39874k);
        dVar.mo54733a(f39875l);
        dVar.mo54733a(f39876m);
        dVar.mo54733a(f39877n);
    }
}
