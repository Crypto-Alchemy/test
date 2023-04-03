package p000;

import com.github.mikephil.charting.utils.Utils;
import java.lang.annotation.Annotation;
import java.lang.reflect.Array;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.C6177b;
import kotlin.jvm.internal.FunctionReference;
import kotlin.jvm.internal.PropertyReference;
import kotlin.reflect.KVisibility;
import kotlin.reflect.jvm.internal.KCallableImpl;
import kotlin.reflect.jvm.internal.KFunctionImpl;
import kotlin.reflect.jvm.internal.KPropertyImpl;
import kotlin.reflect.jvm.internal.KTypeImpl;
import kotlin.reflect.jvm.internal.calls.AnnotationConstructorCallerKt;
import kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType;
import kotlin.reflect.jvm.internal.impl.descriptors.C7420a;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectClassUtilKt;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaClass;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Function;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Property;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$TypeParameter;
import kotlin.reflect.jvm.internal.impl.protobuf.C7628h;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.MemberDeserializer;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.TypeDeserializer;
import p000.ri5;
import p000.t83;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000À\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u001b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0012\u0010\u0002\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0001*\u00020\u0000H\u0000\u001a(\u0010\t\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0007H\u0002\u001a.\u0010\r\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u0007H\u0002\u001a\u0014\u0010\u000e\u001a\u0006\u0012\u0002\b\u00030\u0001*\u0006\u0012\u0002\b\u00030\u0001H\u0000\u001a\u000e\u0010\u0011\u001a\u0004\u0018\u00010\u0010*\u00020\u000fH\u0000\u001a\u0012\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013*\u00020\u0012H\u0000\u001a\u0018\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013*\b\u0012\u0004\u0012\u00020\u00140\u0013H\u0002\u001a\u000e\u0010\u0018\u001a\u0004\u0018\u00010\u0014*\u00020\u0017H\u0002\u001a\u001a\u0010\u001b\u001a\u0004\u0018\u00010\u001a*\u0006\u0012\u0002\b\u00030\u00192\u0006\u0010\u0004\u001a\u00020\u0003H\u0002\u001a\u0016\u0010\u001d\u001a\u0004\u0018\u00010\u001a*\u00020\u001c2\u0006\u0010\u0004\u001a\u00020\u0003H\u0002\u001a\u0010\u0010\u001f\u001a\u0004\u0018\u00010\u001e*\u0004\u0018\u00010\u001aH\u0000\u001a\u0014\u0010!\u001a\b\u0012\u0002\b\u0003\u0018\u00010 *\u0004\u0018\u00010\u001aH\u0000\u001a\u0014\u0010#\u001a\b\u0012\u0002\b\u0003\u0018\u00010\"*\u0004\u0018\u00010\u001aH\u0000\u001a\u0012\u0010&\u001a\u0004\u0018\u00010\u001a2\u0006\u0010%\u001a\u00020$H\u0000\u001ai\u00106\u001a\u00028\u0001\"\b\b\u0000\u0010(*\u00020'\"\b\b\u0001\u0010**\u00020)2\n\u0010+\u001a\u0006\u0012\u0002\b\u00030\u00012\u0006\u0010,\u001a\u00028\u00002\u0006\u0010.\u001a\u00020-2\u0006\u00100\u001a\u00020/2\u0006\u00102\u001a\u0002012\u0018\u00105\u001a\u0014\u0012\u0004\u0012\u000204\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u000103H\u0000¢\u0006\u0004\b6\u00107\u001a'\u0010;\u001a\u00028\u0000\"\u0004\b\u0000\u001082\f\u0010:\u001a\b\u0012\u0004\u0012\u00028\u000009H\bø\u0001\u0000¢\u0006\u0004\b;\u0010<\"\u001a\u0010A\u001a\u00020=8\u0000X\u0004¢\u0006\f\n\u0004\b\u001d\u0010>\u001a\u0004\b?\u0010@\"\u0018\u0010F\u001a\u00020C*\u00020B8@X\u0004¢\u0006\u0006\u001a\u0004\bD\u0010E\"\u001a\u0010J\u001a\u0004\u0018\u00010G*\u00020)8@X\u0004¢\u0006\u0006\u001a\u0004\bH\u0010I\u0002\u0007\n\u0005\b20\u0001¨\u0006K"}, mo44877d2 = {"Lif0;", "Ljava/lang/Class;", "p", "Ljava/lang/ClassLoader;", "classLoader", "Lnf0;", "kotlinClassId", "", "arrayDimensions", "l", "", "packageName", "className", "m", "f", "Lfd1;", "Lkotlin/reflect/KVisibility;", "q", "Lml;", "", "", "e", "s", "Lvl;", "o", "Lfq0;", "", "r", "Lsq;", "a", "Lkotlin/reflect/jvm/internal/KFunctionImpl;", "c", "Lkotlin/reflect/jvm/internal/KPropertyImpl;", "d", "Lkotlin/reflect/jvm/internal/KCallableImpl;", "b", "Ljava/lang/reflect/Type;", "type", "g", "Lkotlin/reflect/jvm/internal/impl/protobuf/h;", "M", "Lkotlin/reflect/jvm/internal/impl/descriptors/a;", "D", "moduleAnchor", "proto", "Lt24;", "nameResolver", "Lw17;", "typeTable", "Lo10;", "metadataVersion", "Lkotlin/Function2;", "Lkotlin/reflect/jvm/internal/impl/serialization/deserialization/MemberDeserializer;", "createDescriptor", "deserializeToDescriptor", "(Ljava/lang/Class;Lorg/jetbrains/kotlin/protobuf/MessageLite;Lorg/jetbrains/kotlin/metadata/deserialization/NameResolver;Lorg/jetbrains/kotlin/metadata/deserialization/TypeTable;Lorg/jetbrains/kotlin/metadata/deserialization/BinaryVersion;Lfd2;)Lorg/jetbrains/kotlin/descriptors/CallableDescriptor;", "R", "Lkotlin/Function0;", "block", "reflectionCall", "(Lpc2;)Ljava/lang/Object;", "Lu82;", "Lu82;", "getJVM_STATIC", "()Lorg/jetbrains/kotlin/name/FqName;", "JVM_STATIC", "Lm93;", "", "k", "(Lm93;)Z", "isInlineClassType", "Lh85;", "getInstanceReceiverParameter", "(Lorg/jetbrains/kotlin/descriptors/CallableDescriptor;)Lorg/jetbrains/kotlin/descriptors/ReceiverParameterDescriptor;", "instanceReceiverParameter", "kotlin-reflection"}, mo44878k = 2, mo44879mv = {1, 7, 1})
/* renamed from: y67 */
/* compiled from: util.kt */
public final class y67 {

    /* renamed from: a */
    public static final u82 f46130a = new u82("kotlin.jvm.JvmStatic");

    @Metadata(mo44878k = 3, mo44879mv = {1, 7, 1}, mo44881xi = 48)
    /* renamed from: y67$a */
    /* compiled from: util.kt */
    public /* synthetic */ class C9629a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f46131a;

        static {
            int[] iArr = new int[PrimitiveType.values().length];
            iArr[PrimitiveType.BOOLEAN.ordinal()] = 1;
            iArr[PrimitiveType.CHAR.ordinal()] = 2;
            iArr[PrimitiveType.BYTE.ordinal()] = 3;
            iArr[PrimitiveType.SHORT.ordinal()] = 4;
            iArr[PrimitiveType.INT.ordinal()] = 5;
            iArr[PrimitiveType.FLOAT.ordinal()] = 6;
            iArr[PrimitiveType.LONG.ordinal()] = 7;
            iArr[PrimitiveType.DOUBLE.ordinal()] = 8;
            f46131a = iArr;
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: InitCodeVariables
        jadx.core.utils.exceptions.JadxRuntimeException: Several immutable types in one variable: [boolean[], char[], byte[], short[]], vars: [r7v10 ?, r7v1 ?, r7v11 ?, r7v12 ?, r7v13 ?, r7v14 ?, r7v15 ?, r7v16 ?, r7v17 ?, r7v18 ?, r7v19 ?, r7v20 ?]
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVarType(InitCodeVariables.java:102)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:78)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:69)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:51)
        	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:32)
        */
    /* renamed from: a */
    public static final java.lang.Object m74271a(p000.C9313sq r6, java.lang.ClassLoader r7) {
        /*
            boolean r0 = r6 instanceof kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializedArrayValue
            r1 = 0
            if (r0 == 0) goto L_0x0009
            r0 = r6
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializedArrayValue r0 = (kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializedArrayValue) r0
            goto L_0x000a
        L_0x0009:
            r0 = r1
        L_0x000a:
            if (r0 == 0) goto L_0x0245
            xc3 r0 = r0.mo55123c()
            if (r0 != 0) goto L_0x0014
            goto L_0x0245
        L_0x0014:
            java.lang.Object r2 = r6.mo51739b()
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.ArrayList r3 = new java.util.ArrayList
            r4 = 10
            int r4 = p000.dk0.m43495u(r2, r4)
            r3.<init>(r4)
            java.util.Iterator r2 = r2.iterator()
        L_0x0029:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L_0x003d
            java.lang.Object r4 = r2.next()
            fq0 r4 = (p000.fq0) r4
            java.lang.Object r4 = m74288r(r4, r7)
            r3.add(r4)
            goto L_0x0029
        L_0x003d:
            kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType r2 = kotlin.reflect.jvm.internal.impl.builtins.C7389b.m60117N(r0)
            if (r2 != 0) goto L_0x0045
            r2 = -1
            goto L_0x004d
        L_0x0045:
            int[] r4 = p000.y67.C9629a.f46131a
            int r2 = r2.ordinal()
            r2 = r4[r2]
        L_0x004d:
            r4 = 0
            switch(r2) {
                case -1: goto L_0x0167;
                case 0: goto L_0x0051;
                case 1: goto L_0x0145;
                case 2: goto L_0x0123;
                case 3: goto L_0x0101;
                case 4: goto L_0x00df;
                case 5: goto L_0x00bd;
                case 6: goto L_0x009b;
                case 7: goto L_0x0079;
                case 8: goto L_0x0057;
                default: goto L_0x0051;
            }
        L_0x0051:
            kotlin.NoWhenBranchMatchedException r6 = new kotlin.NoWhenBranchMatchedException
            r6.<init>()
            throw r6
        L_0x0057:
            java.lang.Object r6 = r6.mo51739b()
            java.util.List r6 = (java.util.List) r6
            int r6 = r6.size()
            double[] r7 = new double[r6]
        L_0x0063:
            if (r4 >= r6) goto L_0x020d
            java.lang.Object r0 = r3.get(r4)
            java.lang.String r1 = "null cannot be cast to non-null type kotlin.Double"
            p000.vx2.m53589e(r0, r1)
            java.lang.Double r0 = (java.lang.Double) r0
            double r0 = r0.doubleValue()
            r7[r4] = r0
            int r4 = r4 + 1
            goto L_0x0063
        L_0x0079:
            java.lang.Object r6 = r6.mo51739b()
            java.util.List r6 = (java.util.List) r6
            int r6 = r6.size()
            long[] r7 = new long[r6]
        L_0x0085:
            if (r4 >= r6) goto L_0x020d
            java.lang.Object r0 = r3.get(r4)
            java.lang.String r1 = "null cannot be cast to non-null type kotlin.Long"
            p000.vx2.m53589e(r0, r1)
            java.lang.Long r0 = (java.lang.Long) r0
            long r0 = r0.longValue()
            r7[r4] = r0
            int r4 = r4 + 1
            goto L_0x0085
        L_0x009b:
            java.lang.Object r6 = r6.mo51739b()
            java.util.List r6 = (java.util.List) r6
            int r6 = r6.size()
            float[] r7 = new float[r6]
        L_0x00a7:
            if (r4 >= r6) goto L_0x020d
            java.lang.Object r0 = r3.get(r4)
            java.lang.String r1 = "null cannot be cast to non-null type kotlin.Float"
            p000.vx2.m53589e(r0, r1)
            java.lang.Float r0 = (java.lang.Float) r0
            float r0 = r0.floatValue()
            r7[r4] = r0
            int r4 = r4 + 1
            goto L_0x00a7
        L_0x00bd:
            java.lang.Object r6 = r6.mo51739b()
            java.util.List r6 = (java.util.List) r6
            int r6 = r6.size()
            int[] r7 = new int[r6]
        L_0x00c9:
            if (r4 >= r6) goto L_0x020d
            java.lang.Object r0 = r3.get(r4)
            java.lang.String r1 = "null cannot be cast to non-null type kotlin.Int"
            p000.vx2.m53589e(r0, r1)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            r7[r4] = r0
            int r4 = r4 + 1
            goto L_0x00c9
        L_0x00df:
            java.lang.Object r6 = r6.mo51739b()
            java.util.List r6 = (java.util.List) r6
            int r6 = r6.size()
            short[] r7 = new short[r6]
        L_0x00eb:
            if (r4 >= r6) goto L_0x020d
            java.lang.Object r0 = r3.get(r4)
            java.lang.String r1 = "null cannot be cast to non-null type kotlin.Short"
            p000.vx2.m53589e(r0, r1)
            java.lang.Short r0 = (java.lang.Short) r0
            short r0 = r0.shortValue()
            r7[r4] = r0
            int r4 = r4 + 1
            goto L_0x00eb
        L_0x0101:
            java.lang.Object r6 = r6.mo51739b()
            java.util.List r6 = (java.util.List) r6
            int r6 = r6.size()
            byte[] r7 = new byte[r6]
        L_0x010d:
            if (r4 >= r6) goto L_0x020d
            java.lang.Object r0 = r3.get(r4)
            java.lang.String r1 = "null cannot be cast to non-null type kotlin.Byte"
            p000.vx2.m53589e(r0, r1)
            java.lang.Byte r0 = (java.lang.Byte) r0
            byte r0 = r0.byteValue()
            r7[r4] = r0
            int r4 = r4 + 1
            goto L_0x010d
        L_0x0123:
            java.lang.Object r6 = r6.mo51739b()
            java.util.List r6 = (java.util.List) r6
            int r6 = r6.size()
            char[] r7 = new char[r6]
        L_0x012f:
            if (r4 >= r6) goto L_0x020d
            java.lang.Object r0 = r3.get(r4)
            java.lang.String r1 = "null cannot be cast to non-null type kotlin.Char"
            p000.vx2.m53589e(r0, r1)
            java.lang.Character r0 = (java.lang.Character) r0
            char r0 = r0.charValue()
            r7[r4] = r0
            int r4 = r4 + 1
            goto L_0x012f
        L_0x0145:
            java.lang.Object r6 = r6.mo51739b()
            java.util.List r6 = (java.util.List) r6
            int r6 = r6.size()
            boolean[] r7 = new boolean[r6]
        L_0x0151:
            if (r4 >= r6) goto L_0x020d
            java.lang.Object r0 = r3.get(r4)
            java.lang.String r1 = "null cannot be cast to non-null type kotlin.Boolean"
            p000.vx2.m53589e(r0, r1)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r7[r4] = r0
            int r4 = r4 + 1
            goto L_0x0151
        L_0x0167:
            boolean r2 = kotlin.reflect.jvm.internal.impl.builtins.C7389b.m60125c0(r0)
            if (r2 == 0) goto L_0x022a
            java.util.List r0 = r0.mo51132F0()
            java.lang.Object r0 = kotlin.collections.CollectionsKt___CollectionsKt.m47355z0(r0)
            f17 r0 = (p000.f17) r0
            xc3 r0 = r0.getType()
            java.lang.String r2 = "type.arguments.single().type"
            p000.vx2.m53590f(r0, r2)
            yz6 r2 = r0.mo51134H0()
            eg0 r2 = r2.mo51180d()
            boolean r5 = r2 instanceof p000.if0
            if (r5 == 0) goto L_0x018f
            if0 r2 = (p000.if0) r2
            goto L_0x0190
        L_0x018f:
            r2 = r1
        L_0x0190:
            if (r2 == 0) goto L_0x020f
            boolean r0 = kotlin.reflect.jvm.internal.impl.builtins.C7389b.m60145u0(r0)
            if (r0 == 0) goto L_0x01b6
            java.lang.Object r6 = r6.mo51739b()
            java.util.List r6 = (java.util.List) r6
            int r6 = r6.size()
            java.lang.String[] r7 = new java.lang.String[r6]
        L_0x01a4:
            if (r4 >= r6) goto L_0x020d
            java.lang.Object r0 = r3.get(r4)
            java.lang.String r1 = "null cannot be cast to non-null type kotlin.String"
            p000.vx2.m53589e(r0, r1)
            java.lang.String r0 = (java.lang.String) r0
            r7[r4] = r0
            int r4 = r4 + 1
            goto L_0x01a4
        L_0x01b6:
            boolean r0 = kotlin.reflect.jvm.internal.impl.builtins.C7389b.m60135k0(r2)
            if (r0 == 0) goto L_0x01da
            java.lang.Object r6 = r6.mo51739b()
            java.util.List r6 = (java.util.List) r6
            int r6 = r6.size()
            java.lang.Class[] r7 = new java.lang.Class[r6]
        L_0x01c8:
            if (r4 >= r6) goto L_0x020d
            java.lang.Object r0 = r3.get(r4)
            java.lang.String r1 = "null cannot be cast to non-null type java.lang.Class<*>"
            p000.vx2.m53589e(r0, r1)
            java.lang.Class r0 = (java.lang.Class) r0
            r7[r4] = r0
            int r4 = r4 + 1
            goto L_0x01c8
        L_0x01da:
            nf0 r0 = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt.m62446g(r2)
            if (r0 == 0) goto L_0x020e
            r2 = 4
            java.lang.Class r7 = m74284n(r7, r0, r4, r2, r1)
            if (r7 != 0) goto L_0x01e8
            goto L_0x020e
        L_0x01e8:
            java.lang.Object r6 = r6.mo51739b()
            java.util.List r6 = (java.util.List) r6
            int r6 = r6.size()
            java.lang.Object r6 = java.lang.reflect.Array.newInstance(r7, r6)
            java.lang.String r7 = "null cannot be cast to non-null type kotlin.Array<in kotlin.Any?>"
            p000.vx2.m53589e(r6, r7)
            r7 = r6
            java.lang.Object[] r7 = (java.lang.Object[]) r7
            int r6 = r3.size()
        L_0x0202:
            if (r4 >= r6) goto L_0x020d
            java.lang.Object r0 = r3.get(r4)
            r7[r4] = r0
            int r4 = r4 + 1
            goto L_0x0202
        L_0x020d:
            return r7
        L_0x020e:
            return r1
        L_0x020f:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r1 = "Not a class type: "
            r7.append(r1)
            r7.append(r0)
            java.lang.String r7 = r7.toString()
            java.lang.String r7 = r7.toString()
            r6.<init>(r7)
            throw r6
        L_0x022a:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "Not an array type: "
            r6.append(r7)
            r6.append(r0)
            java.lang.String r6 = r6.toString()
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r6 = r6.toString()
            r7.<init>(r6)
            throw r7
        L_0x0245:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.y67.m74271a(sq, java.lang.ClassLoader):java.lang.Object");
    }

    /* renamed from: b */
    public static final KCallableImpl<?> m74272b(Object obj) {
        KCallableImpl<?> kCallableImpl;
        if (obj instanceof KCallableImpl) {
            kCallableImpl = (KCallableImpl) obj;
        } else {
            kCallableImpl = null;
        }
        if (kCallableImpl != null) {
            return kCallableImpl;
        }
        KFunctionImpl c = m74273c(obj);
        if (c != null) {
            return c;
        }
        return m74274d(obj);
    }

    /* renamed from: c */
    public static final KFunctionImpl m74273c(Object obj) {
        KFunctionImpl kFunctionImpl;
        FunctionReference functionReference;
        n83 n83;
        if (obj instanceof KFunctionImpl) {
            kFunctionImpl = (KFunctionImpl) obj;
        } else {
            kFunctionImpl = null;
        }
        if (kFunctionImpl != null) {
            return kFunctionImpl;
        }
        if (obj instanceof FunctionReference) {
            functionReference = (FunctionReference) obj;
        } else {
            functionReference = null;
        }
        if (functionReference != null) {
            n83 = functionReference.compute();
        } else {
            n83 = null;
        }
        if (n83 instanceof KFunctionImpl) {
            return (KFunctionImpl) n83;
        }
        return null;
    }

    /* renamed from: d */
    public static final KPropertyImpl<?> m74274d(Object obj) {
        KPropertyImpl<?> kPropertyImpl;
        PropertyReference propertyReference;
        n83 n83;
        if (obj instanceof KPropertyImpl) {
            kPropertyImpl = (KPropertyImpl) obj;
        } else {
            kPropertyImpl = null;
        }
        if (kPropertyImpl != null) {
            return kPropertyImpl;
        }
        if (obj instanceof PropertyReference) {
            propertyReference = (PropertyReference) obj;
        } else {
            propertyReference = null;
        }
        if (propertyReference != null) {
            n83 = propertyReference.compute();
        } else {
            n83 = null;
        }
        if (n83 instanceof KPropertyImpl) {
            return (KPropertyImpl) n83;
        }
        return null;
    }

    /* renamed from: e */
    public static final List<Annotation> m74275e(C7903ml mlVar) {
        o95 o95;
        vx2.m53591g(mlVar, "<this>");
        C6983dm<C9460vl> annotations = mlVar.getAnnotations();
        ArrayList arrayList = new ArrayList();
        for (C9460vl vlVar : annotations) {
            a66 source = vlVar.getSource();
            Annotation annotation = null;
            if (source instanceof m95) {
                annotation = ((m95) source).mo56160d();
            } else if (source instanceof ri5.C9253a) {
                aa5 d = ((ri5.C9253a) source).mo50052c();
                if (d instanceof o95) {
                    o95 = (o95) d;
                } else {
                    o95 = null;
                }
                if (o95 != null) {
                    annotation = o95.mo62852P();
                }
            } else {
                annotation = m74285o(vlVar);
            }
            if (annotation != null) {
                arrayList.add(annotation);
            }
        }
        return m74289s(arrayList);
    }

    /* renamed from: f */
    public static final Class<?> m74276f(Class<?> cls) {
        vx2.m53591g(cls, "<this>");
        return Array.newInstance(cls, 0).getClass();
    }

    /* renamed from: g */
    public static final Object m74277g(Type type) {
        vx2.m53591g(type, "type");
        if (!(type instanceof Class) || !((Class) type).isPrimitive()) {
            return null;
        }
        if (vx2.m53586b(type, Boolean.TYPE)) {
            return Boolean.FALSE;
        }
        if (vx2.m53586b(type, Character.TYPE)) {
            return 0;
        }
        if (vx2.m53586b(type, Byte.TYPE)) {
            return (byte) 0;
        }
        if (vx2.m53586b(type, Short.TYPE)) {
            return (short) 0;
        }
        if (vx2.m53586b(type, Integer.TYPE)) {
            return 0;
        }
        if (vx2.m53586b(type, Float.TYPE)) {
            return Float.valueOf(Utils.FLOAT_EPSILON);
        }
        if (vx2.m53586b(type, Long.TYPE)) {
            return 0L;
        }
        if (vx2.m53586b(type, Double.TYPE)) {
            return Double.valueOf(Utils.DOUBLE_EPSILON);
        }
        if (vx2.m53586b(type, Void.TYPE)) {
            throw new IllegalStateException("Parameter with void type is illegal");
        }
        throw new UnsupportedOperationException("Unknown primitive: " + type);
    }

    /* renamed from: h */
    public static final <M extends C7628h, D extends C7420a> D m74278h(Class<?> cls, M m, t24 t24, w17 w17, o10 o10, fd2<? super MemberDeserializer, ? super M, ? extends D> fd2) {
        List<ProtoBuf$TypeParameter> typeParameterList;
        M m2 = m;
        fd2<? super MemberDeserializer, ? super M, ? extends D> fd22 = fd2;
        Class<?> cls2 = cls;
        vx2.m53591g(cls, "moduleAnchor");
        vx2.m53591g(m, "proto");
        vx2.m53591g(t24, "nameResolver");
        vx2.m53591g(w17, "typeTable");
        vx2.m53591g(o10, "metadataVersion");
        vx2.m53591g(fd22, "createDescriptor");
        oi5 a = gx3.m58285a(cls);
        if (m2 instanceof ProtoBuf$Function) {
            typeParameterList = ((ProtoBuf$Function) m2).getTypeParameterList();
        } else if (m2 instanceof ProtoBuf$Property) {
            typeParameterList = ((ProtoBuf$Property) m2).getTypeParameterList();
        } else {
            throw new IllegalStateException(("Unsupported message: " + m).toString());
        }
        List<ProtoBuf$TypeParameter> list = typeParameterList;
        id1 a2 = a.mo62927a();
        mx3 b = a.mo62928b();
        a97 b2 = a97.f36407b.mo50123b();
        vx2.m53590f(list, "typeParameters");
        return (C7420a) fd22.invoke(new MemberDeserializer(new md1(a2, t24, b, w17, b2, o10, (sd1) null, (TypeDeserializer) null, list)), m);
    }

    /* renamed from: i */
    public static final h85 m74279i(C7420a aVar) {
        vx2.m53591g(aVar, "<this>");
        if (aVar.mo51311G() == null) {
            return null;
        }
        d31 b = aVar.mo51119b();
        vx2.m53589e(b, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
        return ((if0) b).mo52460D0();
    }

    /* renamed from: j */
    public static final u82 m74280j() {
        return f46130a;
    }

    /* renamed from: k */
    public static final boolean m74281k(m93 m93) {
        KTypeImpl kTypeImpl;
        xc3 n;
        vx2.m53591g(m93, "<this>");
        if (m93 instanceof KTypeImpl) {
            kTypeImpl = (KTypeImpl) m93;
        } else {
            kTypeImpl = null;
        }
        if (kTypeImpl == null || (n = kTypeImpl.mo53096n()) == null || !nu2.m70091c(n)) {
            return false;
        }
        return true;
    }

    /* renamed from: l */
    public static final Class<?> m74282l(ClassLoader classLoader, nf0 nf0, int i) {
        c23 c23 = c23.f37039a;
        v82 j = nf0.mo62673b().mo66205j();
        vx2.m53590f(j, "kotlinClassId.asSingleFqName().toUnsafe()");
        nf0 n = c23.mo50793n(j);
        if (n != null) {
            nf0 = n;
        }
        String b = nf0.mo62678h().mo66195b();
        vx2.m53590f(b, "javaClassId.packageFqName.asString()");
        String b2 = nf0.mo62680i().mo66195b();
        vx2.m53590f(b2, "javaClassId.relativeClassName.asString()");
        return m74283m(classLoader, b, b2, i);
    }

    /* renamed from: m */
    public static final Class<?> m74283m(ClassLoader classLoader, String str, String str2, int i) {
        if (vx2.m53586b(str, "kotlin")) {
            switch (str2.hashCode()) {
                case -901856463:
                    if (str2.equals("BooleanArray")) {
                        return boolean[].class;
                    }
                    break;
                case -763279523:
                    if (str2.equals("ShortArray")) {
                        return short[].class;
                    }
                    break;
                case -755911549:
                    if (str2.equals("CharArray")) {
                        return char[].class;
                    }
                    break;
                case -74930671:
                    if (str2.equals("ByteArray")) {
                        return byte[].class;
                    }
                    break;
                case 22374632:
                    if (str2.equals("DoubleArray")) {
                        return double[].class;
                    }
                    break;
                case 63537721:
                    if (str2.equals("Array")) {
                        return Object[].class;
                    }
                    break;
                case 601811914:
                    if (str2.equals("IntArray")) {
                        return int[].class;
                    }
                    break;
                case 948852093:
                    if (str2.equals("FloatArray")) {
                        return float[].class;
                    }
                    break;
                case 2104330525:
                    if (str2.equals("LongArray")) {
                        return long[].class;
                    }
                    break;
            }
        }
        String str3 = str + '.' + yb6.m74331H(str2, '.', DecodedChar.FNC1, false, 4, (Object) null);
        if (i > 0) {
            str3 = yb6.m74328E("[", i) + 'L' + str3 + ';';
        }
        return w95.m73523a(classLoader, str3);
    }

    /* renamed from: n */
    public static /* synthetic */ Class m74284n(ClassLoader classLoader, nf0 nf0, int i, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            i = 0;
        }
        return m74282l(classLoader, nf0, i);
    }

    /* renamed from: o */
    public static final Annotation m74285o(C9460vl vlVar) {
        Class<?> cls;
        Pair pair;
        if0 e = DescriptorUtilsKt.m62444e(vlVar);
        if (e != null) {
            cls = m74286p(e);
        } else {
            cls = null;
        }
        if (!(cls instanceof Class)) {
            cls = null;
        }
        if (cls == null) {
            return null;
        }
        Set<Map.Entry<r24, fq0<?>>> entrySet = vlVar.mo53264f().entrySet();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : entrySet) {
            r24 r24 = (r24) entry.getKey();
            ClassLoader classLoader = cls.getClassLoader();
            vx2.m53590f(classLoader, "annotationClass.classLoader");
            Object r = m74288r((fq0) entry.getValue(), classLoader);
            if (r != null) {
                pair = wy6.m54142a(r24.mo65594d(), r);
            } else {
                pair = null;
            }
            if (pair != null) {
                arrayList.add(pair);
            }
        }
        return (Annotation) AnnotationConstructorCallerKt.m60094g(cls, C6177b.m47369q(arrayList), (List) null, 4, (Object) null);
    }

    /* renamed from: p */
    public static final Class<?> m74286p(if0 if0) {
        vx2.m53591g(if0, "<this>");
        a66 source = if0.getSource();
        vx2.m53590f(source, "source");
        if (source instanceof vc3) {
            tc3 d = ((vc3) source).mo66481d();
            vx2.m53589e(d, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.runtime.components.ReflectKotlinClass");
            return ((pa5) d).mo65264d();
        } else if (source instanceof ri5.C9253a) {
            aa5 d2 = ((ri5.C9253a) source).mo50052c();
            vx2.m53589e(d2, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.runtime.structure.ReflectJavaClass");
            return ((ReflectJavaClass) d2).getElement();
        } else {
            nf0 g = DescriptorUtilsKt.m62446g(if0);
            if (g == null) {
                return null;
            }
            return m74282l(ReflectClassUtilKt.m60598f(if0.getClass()), g, 0);
        }
    }

    /* renamed from: q */
    public static final KVisibility m74287q(fd1 fd1) {
        boolean z;
        vx2.m53591g(fd1, "<this>");
        if (vx2.m53586b(fd1, ed1.f37510e)) {
            return KVisibility.PUBLIC;
        }
        if (vx2.m53586b(fd1, ed1.f37508c)) {
            return KVisibility.PROTECTED;
        }
        if (vx2.m53586b(fd1, ed1.f37509d)) {
            return KVisibility.INTERNAL;
        }
        if (vx2.m53586b(fd1, ed1.f37506a)) {
            z = true;
        } else {
            z = vx2.m53586b(fd1, ed1.f37507b);
        }
        if (z) {
            return KVisibility.PRIVATE;
        }
        return null;
    }

    /* renamed from: r */
    public static final Object m74288r(fq0<?> fq0, ClassLoader classLoader) {
        boolean z;
        if0 if0;
        if (fq0 instanceof C6948cm) {
            return m74285o((C9460vl) ((C6948cm) fq0).mo51739b());
        }
        if (fq0 instanceof C9313sq) {
            return m74271a((C9313sq) fq0, classLoader);
        }
        if (fq0 instanceof zq1) {
            Pair pair = (Pair) ((zq1) fq0).mo51739b();
            r24 r24 = (r24) pair.component2();
            Class n = m74284n(classLoader, (nf0) pair.component1(), 0, 4, (Object) null);
            if (n != null) {
                return u67.m72618a(n, r24.mo65594d());
            }
            return null;
        } else if (fq0 instanceof t83) {
            t83.C9332b bVar = (t83.C9332b) ((t83) fq0).mo51739b();
            if (bVar instanceof t83.C9332b.C9334b) {
                t83.C9332b.C9334b bVar2 = (t83.C9332b.C9334b) bVar;
                return m74282l(classLoader, bVar2.mo65997b(), bVar2.mo65996a());
            } else if (bVar instanceof t83.C9332b.C9333a) {
                eg0 d = ((t83.C9332b.C9333a) bVar).mo65992a().mo51134H0().mo51180d();
                if (d instanceof if0) {
                    if0 = (if0) d;
                } else {
                    if0 = null;
                }
                if (if0 != null) {
                    return m74286p(if0);
                }
                return null;
            } else {
                throw new NoWhenBranchMatchedException();
            }
        } else {
            if (fq0 instanceof pr1) {
                z = true;
            } else {
                z = fq0 instanceof zb4;
            }
            if (z) {
                return null;
            }
            return fq0.mo51739b();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0034  */
    /* JADX WARNING: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
    /* renamed from: s */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.util.List<java.lang.annotation.Annotation> m74289s(java.util.List<? extends java.lang.annotation.Annotation> r7) {
        /*
            boolean r0 = r7 instanceof java.util.Collection
            java.lang.String r1 = "Container"
            r2 = 0
            if (r0 == 0) goto L_0x000f
            boolean r0 = r7.isEmpty()
            if (r0 == 0) goto L_0x000f
        L_0x000d:
            r0 = r2
            goto L_0x0032
        L_0x000f:
            java.util.Iterator r0 = r7.iterator()
        L_0x0013:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x000d
            java.lang.Object r3 = r0.next()
            java.lang.annotation.Annotation r3 = (java.lang.annotation.Annotation) r3
            q83 r3 = p000.x73.m54252a(r3)
            java.lang.Class r3 = p000.x73.m54253b(r3)
            java.lang.String r3 = r3.getSimpleName()
            boolean r3 = p000.vx2.m53586b(r3, r1)
            if (r3 == 0) goto L_0x0013
            r0 = 1
        L_0x0032:
            if (r0 == 0) goto L_0x0086
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r7 = r7.iterator()
        L_0x003d:
            boolean r3 = r7.hasNext()
            if (r3 == 0) goto L_0x0085
            java.lang.Object r3 = r7.next()
            java.lang.annotation.Annotation r3 = (java.lang.annotation.Annotation) r3
            q83 r4 = p000.x73.m54252a(r3)
            java.lang.Class r4 = p000.x73.m54253b(r4)
            java.lang.String r5 = r4.getSimpleName()
            boolean r5 = p000.vx2.m53586b(r5, r1)
            if (r5 == 0) goto L_0x007d
            java.lang.Class<ud5> r5 = p000.ud5.class
            java.lang.annotation.Annotation r5 = r4.getAnnotation(r5)
            if (r5 == 0) goto L_0x007d
            java.lang.Class[] r5 = new java.lang.Class[r2]
            java.lang.String r6 = "value"
            java.lang.reflect.Method r4 = r4.getDeclaredMethod(r6, r5)
            java.lang.Object[] r5 = new java.lang.Object[r2]
            java.lang.Object r3 = r4.invoke(r3, r5)
            java.lang.String r4 = "null cannot be cast to non-null type kotlin.Array<out kotlin.Annotation>"
            p000.vx2.m53589e(r3, r4)
            java.lang.annotation.Annotation[] r3 = (java.lang.annotation.Annotation[]) r3
            java.util.List r3 = p000.C6706xq.m54490d(r3)
            goto L_0x0081
        L_0x007d:
            java.util.List r3 = p000.bk0.m32598e(r3)
        L_0x0081:
            p000.hk0.m45275z(r0, r3)
            goto L_0x003d
        L_0x0085:
            r7 = r0
        L_0x0086:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.y67.m74289s(java.util.List):java.util.List");
    }
}
