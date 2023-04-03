package kotlin.reflect.jvm.internal;

import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.jvm.internal.CallableReference;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.reflect.full.IllegalPropertyDelegateAccessException;
import kotlin.reflect.jvm.internal.impl.descriptors.C7427d;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf;
import org.web3j.ens.contracts.generated.PublicResolver;
import p000.f93;
import p000.h83;
import p000.i93;
import p000.ta5;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0015\b \u0018\u0000 -*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0004KLMNB\u0019\b\u0016\u0012\u0006\u0010\u0017\u001a\u00020\u0012\u0012\u0006\u0010E\u001a\u00020)¢\u0006\u0004\bF\u0010GB5\b\u0002\u0012\u0006\u0010\u0017\u001a\u00020\u0012\u0012\u0006\u0010\u001c\u001a\u00020\u0010\u0012\u0006\u0010\u001f\u001a\u00020\u0010\u0012\b\u0010H\u001a\u0004\u0018\u00010)\u0012\b\u0010\"\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\bF\u0010IB+\b\u0016\u0012\u0006\u0010\u0017\u001a\u00020\u0012\u0012\u0006\u0010\u001c\u001a\u00020\u0010\u0012\u0006\u0010\u001f\u001a\u00020\u0010\u0012\b\u0010/\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\bF\u0010JJ\n\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0004J(\u0010\n\u001a\u0004\u0018\u00010\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\t\u001a\u0004\u0018\u00010\u0007H\u0004J\u0013\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0007H\u0002J\b\u0010\u000f\u001a\u00020\u000eH\u0016J\b\u0010\u0011\u001a\u00020\u0010H\u0016R\u001a\u0010\u0017\u001a\u00020\u00128\u0016X\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u001c\u001a\u00020\u00108\u0016X\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u001f\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0019\u001a\u0004\b\u001e\u0010\u001bR\u0016\u0010\"\u001a\u0004\u0018\u00010\u00078\u0002X\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u001c\u0010'\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010$0#8\u0002X\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\"\u0010,\u001a\u0010\u0012\f\u0012\n **\u0004\u0018\u00010)0)0(8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010+R\u0013\u0010/\u001a\u0004\u0018\u00010\u00078F¢\u0006\u0006\u001a\u0004\b-\u0010.R\u0014\u00102\u001a\u00020\f8VX\u0004¢\u0006\u0006\u001a\u0004\b0\u00101R\u0013\u00105\u001a\u0004\u0018\u00010$8F¢\u0006\u0006\u001a\u0004\b3\u00104R\u001a\u00109\u001a\b\u0012\u0004\u0012\u00028\u0000068&X¦\u0004¢\u0006\u0006\u001a\u0004\b7\u00108R\u0018\u0010=\u001a\u0006\u0012\u0002\b\u00030:8VX\u0004¢\u0006\u0006\u001a\u0004\b;\u0010<R\u001a\u0010?\u001a\b\u0012\u0002\b\u0003\u0018\u00010:8VX\u0004¢\u0006\u0006\u001a\u0004\b>\u0010<R\u0014\u0010@\u001a\u00020\f8VX\u0004¢\u0006\u0006\u001a\u0004\b@\u00101R\u0014\u0010A\u001a\u00020\f8VX\u0004¢\u0006\u0006\u001a\u0004\bA\u00101R\u0014\u0010B\u001a\u00020\f8VX\u0004¢\u0006\u0006\u001a\u0004\bB\u00101R\u0014\u0010E\u001a\u00020)8VX\u0004¢\u0006\u0006\u001a\u0004\bC\u0010D¨\u0006O"}, mo44877d2 = {"Lkotlin/reflect/jvm/internal/KPropertyImpl;", "V", "Lkotlin/reflect/jvm/internal/KCallableImpl;", "Li93;", "Ljava/lang/reflect/Member;", "A", "fieldOrMethod", "", "receiver1", "receiver2", "C", "other", "", "equals", "", "hashCode", "", "toString", "Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;", "k", "Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;", "v", "()Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;", "container", "r", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "name", "s", "G", "signature", "x", "Ljava/lang/Object;", "rawBoundReceiver", "Lta5$b;", "Ljava/lang/reflect/Field;", "y", "Lta5$b;", "_javaField", "Lta5$a;", "Lfx4;", "kotlin.jvm.PlatformType", "Lta5$a;", "_descriptor", "B", "()Ljava/lang/Object;", "boundReceiver", "z", "()Z", "isBound", "F", "()Ljava/lang/reflect/Field;", "javaField", "Lkotlin/reflect/jvm/internal/KPropertyImpl$Getter;", "E", "()Lkotlin/reflect/jvm/internal/KPropertyImpl$Getter;", "getter", "Lu90;", "t", "()Lu90;", "caller", "w", "defaultCaller", "isLateinit", "isConst", "isSuspend", "getDescriptor", "()Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;", "descriptor", "<init>", "(Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;)V", "descriptorInitialValue", "(Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;Ljava/lang/String;Ljava/lang/String;Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;Ljava/lang/Object;)V", "(Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V", "a", "b", "Getter", "Setter", "kotlin-reflection"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* compiled from: KPropertyImpl.kt */
public abstract class KPropertyImpl<V> extends KCallableImpl<V> implements i93<V> {

    /* renamed from: B */
    public static final C7371b f39011B = new C7371b((DefaultConstructorMarker) null);

    /* renamed from: C */
    public static final Object f39012C = new Object();

    /* renamed from: A */
    public final ta5.C9335a<fx4> f39013A;

    /* renamed from: k */
    public final KDeclarationContainerImpl f39014k;

    /* renamed from: r */
    public final String f39015r;

    /* renamed from: s */
    public final String f39016s;

    /* renamed from: x */
    public final Object f39017x;

    /* renamed from: y */
    public final ta5.C9336b<Field> f39018y;

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\b&\u0018\u0000*\u0006\b\u0001\u0010\u0001 \u00012\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00010\u00022\b\u0012\u0004\u0012\u00028\u00010\u0003B\u0007¢\u0006\u0004\b\u001b\u0010\u001cJ\b\u0010\u0005\u001a\u00020\u0004H\u0016J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002J\b\u0010\u000b\u001a\u00020\nH\u0016R\u001b\u0010\u0011\u001a\u00020\f8VX\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001f\u0010\u0017\u001a\u0006\u0012\u0002\b\u00030\u00128VX\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u001a\u001a\u00020\u00048VX\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001d"}, mo44877d2 = {"Lkotlin/reflect/jvm/internal/KPropertyImpl$Getter;", "V", "Lkotlin/reflect/jvm/internal/KPropertyImpl$a;", "Li93$b;", "", "toString", "", "other", "", "equals", "", "hashCode", "Lix4;", "k", "Lta5$a;", "getDescriptor", "()Lorg/jetbrains/kotlin/descriptors/PropertyGetterDescriptor;", "descriptor", "Lu90;", "r", "Lta5$b;", "t", "()Lu90;", "caller", "getName", "()Ljava/lang/String;", "name", "<init>", "()V", "kotlin-reflection"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* compiled from: KPropertyImpl.kt */
    public static abstract class Getter<V> extends C7370a<V, V> implements i93.C5953b<V> {

        /* renamed from: s */
        public static final /* synthetic */ i93<Object>[] f39019s;

        /* renamed from: k */
        public final ta5.C9335a f39020k = ta5.m72213c(new KPropertyImpl$Getter$descriptor$2(this));

        /* renamed from: r */
        public final ta5.C9336b f39021r = ta5.m72212b(new KPropertyImpl$Getter$caller$2(this));

        static {
            Class<Getter> cls = Getter.class;
            f39019s = new i93[]{ua5.m52732g(new PropertyReference1Impl(ua5.m52727b(cls), "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/PropertyGetterDescriptor;")), ua5.m52732g(new PropertyReference1Impl(ua5.m52727b(cls), "caller", "getCaller()Lkotlin/reflect/jvm/internal/calls/Caller;"))};
        }

        /* renamed from: C */
        public ix4 mo52984x() {
            Object b = this.f39020k.mo66008b(this, f39019s[0]);
            vx2.m53590f(b, "<get-descriptor>(...)");
            return (ix4) b;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof Getter) || !vx2.m53586b(mo53049B(), ((Getter) obj).mo53049B())) {
                return false;
            }
            return true;
        }

        public String getName() {
            return "<get-" + mo53049B().getName() + '>';
        }

        public int hashCode() {
            return mo53049B().hashCode();
        }

        /* renamed from: t */
        public u90<?> mo52981t() {
            Object b = this.f39021r.mo66008b(this, f39019s[1]);
            vx2.m53590f(b, "<get-caller>(...)");
            return (u90) b;
        }

        public String toString() {
            return "getter of " + mo53049B();
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\b&\u0018\u0000*\u0004\b\u0001\u0010\u00012\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u00030\u00022\b\u0012\u0004\u0012\u00028\u00010\u0004B\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ\b\u0010\u0006\u001a\u00020\u0005H\u0016J\u0013\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0002J\b\u0010\f\u001a\u00020\u000bH\u0016R\u001b\u0010\u0012\u001a\u00020\r8VX\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001f\u0010\u0018\u001a\u0006\u0012\u0002\b\u00030\u00138VX\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001b\u001a\u00020\u00058VX\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001e"}, mo44877d2 = {"Lkotlin/reflect/jvm/internal/KPropertyImpl$Setter;", "V", "Lkotlin/reflect/jvm/internal/KPropertyImpl$a;", "Lr37;", "Lf93$a;", "", "toString", "", "other", "", "equals", "", "hashCode", "Llx4;", "k", "Lta5$a;", "getDescriptor", "()Lorg/jetbrains/kotlin/descriptors/PropertySetterDescriptor;", "descriptor", "Lu90;", "r", "Lta5$b;", "t", "()Lu90;", "caller", "getName", "()Ljava/lang/String;", "name", "<init>", "()V", "kotlin-reflection"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* compiled from: KPropertyImpl.kt */
    public static abstract class Setter<V> extends C7370a<V, r37> implements f93.C5836a<V> {

        /* renamed from: s */
        public static final /* synthetic */ i93<Object>[] f39022s;

        /* renamed from: k */
        public final ta5.C9335a f39023k = ta5.m72213c(new KPropertyImpl$Setter$descriptor$2(this));

        /* renamed from: r */
        public final ta5.C9336b f39024r = ta5.m72212b(new KPropertyImpl$Setter$caller$2(this));

        static {
            Class<Setter> cls = Setter.class;
            f39022s = new i93[]{ua5.m52732g(new PropertyReference1Impl(ua5.m52727b(cls), "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/PropertySetterDescriptor;")), ua5.m52732g(new PropertyReference1Impl(ua5.m52727b(cls), "caller", "getCaller()Lkotlin/reflect/jvm/internal/calls/Caller;"))};
        }

        /* renamed from: C */
        public lx4 mo52984x() {
            Object b = this.f39023k.mo66008b(this, f39022s[0]);
            vx2.m53590f(b, "<get-descriptor>(...)");
            return (lx4) b;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof Setter) || !vx2.m53586b(mo53049B(), ((Setter) obj).mo53049B())) {
                return false;
            }
            return true;
        }

        public String getName() {
            return "<set-" + mo53049B().getName() + '>';
        }

        public int hashCode() {
            return mo53049B().hashCode();
        }

        /* renamed from: t */
        public u90<?> mo52981t() {
            Object b = this.f39024r.mo66008b(this, f39022s[1]);
            vx2.m53590f(b, "<get-caller>(...)");
            return (u90) b;
        }

        public String toString() {
            return "setter of " + mo53049B();
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\b&\u0018\u0000*\u0006\b\u0001\u0010\u0001 \u0001*\u0006\b\u0002\u0010\u0002 \u00012\b\u0012\u0004\u0012\u00028\u00020\u00032\b\u0012\u0004\u0012\u00028\u00010\u00042\b\u0012\u0004\u0012\u00028\u00020\u0005B\u0007¢\u0006\u0004\b\u001f\u0010 R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00010\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\r\u001a\u00020\n8VX\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0011\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u000e8VX\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0015\u001a\u00020\u00128VX\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\u00128VX\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\u00128VX\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0014R\u0014\u0010\u0018\u001a\u00020\u00128VX\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0014R\u0014\u0010\u0019\u001a\u00020\u00128VX\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0014R\u0014\u0010\u001a\u001a\u00020\u00128VX\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0014R\u0014\u0010\u001e\u001a\u00020\u001b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001d¨\u0006!"}, mo44877d2 = {"Lkotlin/reflect/jvm/internal/KPropertyImpl$a;", "PropertyType", "ReturnType", "Lkotlin/reflect/jvm/internal/KCallableImpl;", "Li93$a;", "Lz83;", "Lkotlin/reflect/jvm/internal/KPropertyImpl;", "B", "()Lkotlin/reflect/jvm/internal/KPropertyImpl;", "property", "Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;", "v", "()Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;", "container", "Lu90;", "w", "()Lu90;", "defaultCaller", "", "z", "()Z", "isBound", "isInline", "isExternal", "isOperator", "isInfix", "isSuspend", "Lkotlin/reflect/jvm/internal/impl/descriptors/d;", "getDescriptor", "()Lorg/jetbrains/kotlin/descriptors/PropertyAccessorDescriptor;", "descriptor", "<init>", "()V", "kotlin-reflection"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: kotlin.reflect.jvm.internal.KPropertyImpl$a */
    /* compiled from: KPropertyImpl.kt */
    public static abstract class C7370a<PropertyType, ReturnType> extends KCallableImpl<ReturnType> implements z83<ReturnType>, i93.C5952a<PropertyType> {
        /* renamed from: A */
        public abstract C7427d mo53084A();

        /* renamed from: B */
        public abstract KPropertyImpl<PropertyType> mo53049B();

        public boolean isExternal() {
            return mo53084A().isExternal();
        }

        public boolean isInfix() {
            return mo53084A().isInfix();
        }

        public boolean isInline() {
            return mo53084A().isInline();
        }

        public boolean isOperator() {
            return mo53084A().isOperator();
        }

        public boolean isSuspend() {
            return mo53084A().isSuspend();
        }

        /* renamed from: v */
        public KDeclarationContainerImpl mo52982v() {
            return mo53049B().mo52982v();
        }

        /* renamed from: w */
        public u90<?> mo52983w() {
            return null;
        }

        /* renamed from: z */
        public boolean mo52986z() {
            return mo53049B().mo52986z();
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo44877d2 = {"Lkotlin/reflect/jvm/internal/KPropertyImpl$b;", "", "<init>", "()V", "kotlin-reflection"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: kotlin.reflect.jvm.internal.KPropertyImpl$b */
    /* compiled from: KPropertyImpl.kt */
    public static final class C7371b {
        public C7371b() {
        }

        public /* synthetic */ C7371b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public KPropertyImpl(KDeclarationContainerImpl kDeclarationContainerImpl, String str, String str2, fx4 fx4, Object obj) {
        this.f39014k = kDeclarationContainerImpl;
        this.f39015r = str;
        this.f39016s = str2;
        this.f39017x = obj;
        ta5.C9336b<Field> b = ta5.m72212b(new KPropertyImpl$_javaField$1(this));
        vx2.m53590f(b, "lazy {\n        when (val…y -> null\n        }\n    }");
        this.f39018y = b;
        ta5.C9335a<fx4> d = ta5.m72214d(fx4, new KPropertyImpl$_descriptor$1(this));
        vx2.m53590f(d, "lazySoft(descriptorIniti…or(name, signature)\n    }");
        this.f39013A = d;
    }

    /* renamed from: A */
    public final Member mo53075A() {
        if (!mo52984x().mo51773x()) {
            return null;
        }
        h83 f = si5.f44568a.mo65861f(mo52984x());
        if (f instanceof h83.C7169c) {
            h83.C7169c cVar = (h83.C7169c) f;
            if (cVar.mo52152f().hasDelegateMethod()) {
                JvmProtoBuf.JvmMethodSignature delegateMethod = cVar.mo52152f().getDelegateMethod();
                if (!delegateMethod.hasName() || !delegateMethod.hasDesc()) {
                    return null;
                }
                return mo52982v().mo53027u(cVar.mo52150d().getString(delegateMethod.getName()), cVar.mo52150d().getString(delegateMethod.getDesc()));
            }
        }
        return mo53079F();
    }

    /* renamed from: B */
    public final Object mo53076B() {
        return ku2.m63613a(this.f39017x, mo52984x());
    }

    /* renamed from: C */
    public final Object mo53077C(Member member, Object obj, Object obj2) {
        Object obj3;
        boolean z;
        boolean z2;
        try {
            Object obj4 = f39012C;
            if ((obj == obj4 || obj2 == obj4) && mo52984x().mo51315J() == null) {
                throw new RuntimeException('\'' + this + "' is not an extension property and thus getExtensionDelegate() is not going to work, use getDelegate() instead");
            }
            if (mo52986z()) {
                obj3 = mo53076B();
            } else {
                obj3 = obj;
            }
            if (obj3 != obj4) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                obj3 = null;
            }
            if (!mo52986z()) {
                obj = obj2;
            }
            if (obj != obj4) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!z2) {
                obj = null;
            }
            if (member == null) {
                return null;
            }
            if (member instanceof Field) {
                return ((Field) member).get(obj3);
            }
            if (member instanceof Method) {
                int length = ((Method) member).getParameterTypes().length;
                if (length == 0) {
                    return ((Method) member).invoke((Object) null, new Object[0]);
                }
                if (length == 1) {
                    Method method = (Method) member;
                    Object[] objArr = new Object[1];
                    if (obj3 == null) {
                        Class cls = ((Method) member).getParameterTypes()[0];
                        vx2.m53590f(cls, "fieldOrMethod.parameterTypes[0]");
                        obj3 = y67.m74277g(cls);
                    }
                    objArr[0] = obj3;
                    return method.invoke((Object) null, objArr);
                } else if (length == 2) {
                    Method method2 = (Method) member;
                    Object[] objArr2 = new Object[2];
                    objArr2[0] = obj3;
                    if (obj == null) {
                        Class cls2 = ((Method) member).getParameterTypes()[1];
                        vx2.m53590f(cls2, "fieldOrMethod.parameterTypes[1]");
                        obj = y67.m74277g(cls2);
                    }
                    objArr2[1] = obj;
                    return method2.invoke((Object) null, objArr2);
                } else {
                    throw new AssertionError("delegate method " + member + " should take 0, 1, or 2 parameters");
                }
            } else {
                throw new AssertionError("delegate field/method " + member + " neither field nor method");
            }
        } catch (IllegalAccessException e) {
            throw new IllegalPropertyDelegateAccessException(e);
        }
    }

    /* renamed from: D */
    public fx4 mo52984x() {
        fx4 invoke = this.f39013A.invoke();
        vx2.m53590f(invoke, "_descriptor()");
        return invoke;
    }

    /* renamed from: E */
    public abstract Getter<V> mo53069E();

    /* renamed from: F */
    public final Field mo53079F() {
        return this.f39018y.invoke();
    }

    /* renamed from: G */
    public final String mo53080G() {
        return this.f39016s;
    }

    public boolean equals(Object obj) {
        KPropertyImpl<?> d = y67.m74274d(obj);
        if (d != null && vx2.m53586b(mo52982v(), d.mo52982v()) && vx2.m53586b(getName(), d.getName()) && vx2.m53586b(this.f39016s, d.f39016s) && vx2.m53586b(this.f39017x, d.f39017x)) {
            return true;
        }
        return false;
    }

    public String getName() {
        return this.f39015r;
    }

    public int hashCode() {
        return (((mo52982v().hashCode() * 31) + getName().hashCode()) * 31) + this.f39016s.hashCode();
    }

    public boolean isConst() {
        return mo52984x().isConst();
    }

    public boolean isLateinit() {
        return mo52984x().mo51772t0();
    }

    public boolean isSuspend() {
        return false;
    }

    /* renamed from: t */
    public u90<?> mo52981t() {
        return mo53069E().mo52981t();
    }

    public String toString() {
        return ReflectionObjectRenderer.f39037a.mo53110g(mo52984x());
    }

    /* renamed from: v */
    public KDeclarationContainerImpl mo52982v() {
        return this.f39014k;
    }

    /* renamed from: w */
    public u90<?> mo52983w() {
        return mo53069E().mo52983w();
    }

    /* renamed from: z */
    public boolean mo52986z() {
        return !vx2.m53586b(this.f39017x, CallableReference.NO_RECEIVER);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public KPropertyImpl(KDeclarationContainerImpl kDeclarationContainerImpl, String str, String str2, Object obj) {
        this(kDeclarationContainerImpl, str, str2, (fx4) null, obj);
        vx2.m53591g(kDeclarationContainerImpl, "container");
        vx2.m53591g(str, PublicResolver.FUNC_NAME);
        vx2.m53591g(str2, "signature");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public KPropertyImpl(kotlin.reflect.jvm.internal.KDeclarationContainerImpl r8, p000.fx4 r9) {
        /*
            r7 = this;
            java.lang.String r0 = "container"
            p000.vx2.m53591g(r8, r0)
            java.lang.String r0 = "descriptor"
            p000.vx2.m53591g(r9, r0)
            r24 r0 = r9.getName()
            java.lang.String r3 = r0.mo65594d()
            java.lang.String r0 = "descriptor.name.asString()"
            p000.vx2.m53590f(r3, r0)
            si5 r0 = p000.si5.f44568a
            h83 r0 = r0.mo65861f(r9)
            java.lang.String r4 = r0.mo52144a()
            java.lang.Object r6 = kotlin.jvm.internal.CallableReference.NO_RECEIVER
            r1 = r7
            r2 = r8
            r5 = r9
            r1.<init>(r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.KPropertyImpl.<init>(kotlin.reflect.jvm.internal.KDeclarationContainerImpl, fx4):void");
    }
}
