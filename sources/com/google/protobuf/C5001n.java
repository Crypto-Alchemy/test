package com.google.protobuf;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.WireFormat;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.protobuf.n */
/* compiled from: ExtensionSchemaLite */
public final class C5001n extends C4999m<GeneratedMessageLite.C4933d> {

    /* renamed from: com.google.protobuf.n$a */
    /* compiled from: ExtensionSchemaLite */
    public static /* synthetic */ class C5002a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f25727a;

        /* JADX WARNING: Can't wrap try/catch for region: R(36:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|(3:35|36|38)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(38:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|35|36|38) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0060 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x006c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0078 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0084 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0090 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x009c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x00a8 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x00b4 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x00c0 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:35:0x00cc */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.google.protobuf.WireFormat$FieldType[] r0 = com.google.protobuf.WireFormat.FieldType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f25727a = r0
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.DOUBLE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f25727a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.FLOAT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f25727a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.INT64     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f25727a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.UINT64     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f25727a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.INT32     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f25727a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.FIXED64     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f25727a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.FIXED32     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = f25727a     // Catch:{ NoSuchFieldError -> 0x0060 }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.BOOL     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                int[] r0 = f25727a     // Catch:{ NoSuchFieldError -> 0x006c }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.UINT32     // Catch:{ NoSuchFieldError -> 0x006c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006c }
            L_0x006c:
                int[] r0 = f25727a     // Catch:{ NoSuchFieldError -> 0x0078 }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.SFIXED32     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r2 = 10
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                int[] r0 = f25727a     // Catch:{ NoSuchFieldError -> 0x0084 }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.SFIXED64     // Catch:{ NoSuchFieldError -> 0x0084 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0084 }
                r2 = 11
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0084 }
            L_0x0084:
                int[] r0 = f25727a     // Catch:{ NoSuchFieldError -> 0x0090 }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.SINT32     // Catch:{ NoSuchFieldError -> 0x0090 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0090 }
                r2 = 12
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0090 }
            L_0x0090:
                int[] r0 = f25727a     // Catch:{ NoSuchFieldError -> 0x009c }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.SINT64     // Catch:{ NoSuchFieldError -> 0x009c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x009c }
                r2 = 13
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x009c }
            L_0x009c:
                int[] r0 = f25727a     // Catch:{ NoSuchFieldError -> 0x00a8 }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.ENUM     // Catch:{ NoSuchFieldError -> 0x00a8 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00a8 }
                r2 = 14
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00a8 }
            L_0x00a8:
                int[] r0 = f25727a     // Catch:{ NoSuchFieldError -> 0x00b4 }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.BYTES     // Catch:{ NoSuchFieldError -> 0x00b4 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00b4 }
                r2 = 15
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00b4 }
            L_0x00b4:
                int[] r0 = f25727a     // Catch:{ NoSuchFieldError -> 0x00c0 }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.STRING     // Catch:{ NoSuchFieldError -> 0x00c0 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00c0 }
                r2 = 16
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00c0 }
            L_0x00c0:
                int[] r0 = f25727a     // Catch:{ NoSuchFieldError -> 0x00cc }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.GROUP     // Catch:{ NoSuchFieldError -> 0x00cc }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00cc }
                r2 = 17
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00cc }
            L_0x00cc:
                int[] r0 = f25727a     // Catch:{ NoSuchFieldError -> 0x00d8 }
                com.google.protobuf.WireFormat$FieldType r1 = com.google.protobuf.WireFormat.FieldType.MESSAGE     // Catch:{ NoSuchFieldError -> 0x00d8 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00d8 }
                r2 = 18
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00d8 }
            L_0x00d8:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.C5001n.C5002a.<clinit>():void");
        }
    }

    /* renamed from: a */
    public int mo37422a(Map.Entry<?, ?> entry) {
        return ((GeneratedMessageLite.C4933d) entry.getKey()).getNumber();
    }

    /* renamed from: b */
    public Object mo37423b(C4987l lVar, C4956c0 c0Var, int i) {
        return lVar.mo37366a(c0Var, i);
    }

    /* renamed from: c */
    public C5005p<GeneratedMessageLite.C4933d> mo37424c(Object obj) {
        return ((GeneratedMessageLite.C4932c) obj).f25555a;
    }

    /* renamed from: d */
    public C5005p<GeneratedMessageLite.C4933d> mo37425d(Object obj) {
        return ((GeneratedMessageLite.C4932c) obj).mo36915a();
    }

    /* renamed from: e */
    public boolean mo37426e(C4956c0 c0Var) {
        return c0Var instanceof GeneratedMessageLite.C4932c;
    }

    /* renamed from: f */
    public void mo37427f(Object obj) {
        mo37424c(obj).mo37481u();
    }

    /* renamed from: g */
    public <UT, UB> UB mo37428g(C4982i0 i0Var, Object obj, C4987l lVar, C5005p<GeneratedMessageLite.C4933d> pVar, UB ub, C5000m0<UT, UB> m0Var) throws IOException {
        Object i;
        ArrayList arrayList;
        GeneratedMessageLite.C4934e eVar = (GeneratedMessageLite.C4934e) obj;
        int d = eVar.mo36927d();
        if (!eVar.f25564d.mo36922j() || !eVar.f25564d.isPacked()) {
            Object obj2 = null;
            if (eVar.mo36925b() != WireFormat.FieldType.ENUM) {
                switch (C5002a.f25727a[eVar.mo36925b().ordinal()]) {
                    case 1:
                        obj2 = Double.valueOf(i0Var.readDouble());
                        break;
                    case 2:
                        obj2 = Float.valueOf(i0Var.readFloat());
                        break;
                    case 3:
                        obj2 = Long.valueOf(i0Var.mo37098H());
                        break;
                    case 4:
                        obj2 = Long.valueOf(i0Var.mo37150s());
                        break;
                    case 5:
                        obj2 = Integer.valueOf(i0Var.mo37145p());
                        break;
                    case 6:
                        obj2 = Long.valueOf(i0Var.mo37118b());
                        break;
                    case 7:
                        obj2 = Integer.valueOf(i0Var.mo37152u());
                        break;
                    case 8:
                        obj2 = Boolean.valueOf(i0Var.mo37124e());
                        break;
                    case 9:
                        obj2 = Integer.valueOf(i0Var.mo37130h());
                        break;
                    case 10:
                        obj2 = Integer.valueOf(i0Var.mo37095E());
                        break;
                    case 11:
                        obj2 = Long.valueOf(i0Var.mo37126f());
                        break;
                    case 12:
                        obj2 = Integer.valueOf(i0Var.mo37138l());
                        break;
                    case 13:
                        obj2 = Long.valueOf(i0Var.mo37156y());
                        break;
                    case 14:
                        throw new IllegalStateException("Shouldn't reach here.");
                    case 15:
                        obj2 = i0Var.mo37144o();
                        break;
                    case 16:
                        obj2 = i0Var.mo37157z();
                        break;
                    case 17:
                        obj2 = i0Var.mo37102L(eVar.mo36926c().getClass(), lVar);
                        break;
                    case 18:
                        obj2 = i0Var.mo37104N(eVar.mo36926c().getClass(), lVar);
                        break;
                }
            } else {
                int p = i0Var.mo37145p();
                if (eVar.f25564d.mo36919d().findValueByNumber(p) == null) {
                    return C4986k0.m39725L(d, p, ub, m0Var);
                }
                obj2 = Integer.valueOf(p);
            }
            if (eVar.mo36928e()) {
                pVar.mo37467a(eVar.f25564d, obj2);
            } else {
                int i2 = C5002a.f25727a[eVar.mo36925b().ordinal()];
                if ((i2 == 17 || i2 == 18) && (i = pVar.mo37473i(eVar.f25564d)) != null) {
                    obj2 = C5011t.m39934h(i, obj2);
                }
                pVar.mo37484y(eVar.f25564d, obj2);
            }
        } else {
            switch (C5002a.f25727a[eVar.mo36925b().ordinal()]) {
                case 1:
                    arrayList = new ArrayList();
                    i0Var.mo37097G(arrayList);
                    break;
                case 2:
                    arrayList = new ArrayList();
                    i0Var.mo37093C(arrayList);
                    break;
                case 3:
                    arrayList = new ArrayList();
                    i0Var.mo37132i(arrayList);
                    break;
                case 4:
                    arrayList = new ArrayList();
                    i0Var.mo37128g(arrayList);
                    break;
                case 5:
                    arrayList = new ArrayList();
                    i0Var.mo37154w(arrayList);
                    break;
                case 6:
                    arrayList = new ArrayList();
                    i0Var.mo37146q(arrayList);
                    break;
                case 7:
                    arrayList = new ArrayList();
                    i0Var.mo37155x(arrayList);
                    break;
                case 8:
                    arrayList = new ArrayList();
                    i0Var.mo37140m(arrayList);
                    break;
                case 9:
                    arrayList = new ArrayList();
                    i0Var.mo37151t(arrayList);
                    break;
                case 10:
                    arrayList = new ArrayList();
                    i0Var.mo37120c(arrayList);
                    break;
                case 11:
                    arrayList = new ArrayList();
                    i0Var.mo37153v(arrayList);
                    break;
                case 12:
                    arrayList = new ArrayList();
                    i0Var.mo37147r(arrayList);
                    break;
                case 13:
                    arrayList = new ArrayList();
                    i0Var.mo37122d(arrayList);
                    break;
                case 14:
                    arrayList = new ArrayList();
                    i0Var.mo37134j(arrayList);
                    ub = C4986k0.m39770z(d, arrayList, eVar.f25564d.mo36919d(), ub, m0Var);
                    break;
                default:
                    throw new IllegalStateException("Type cannot be packed: " + eVar.f25564d.mo36923k());
            }
            pVar.mo37484y(eVar.f25564d, arrayList);
        }
        return ub;
    }

    /* renamed from: h */
    public void mo37429h(C4982i0 i0Var, Object obj, C4987l lVar, C5005p<GeneratedMessageLite.C4933d> pVar) throws IOException {
        GeneratedMessageLite.C4934e eVar = (GeneratedMessageLite.C4934e) obj;
        pVar.mo37484y(eVar.f25564d, i0Var.mo37104N(eVar.mo36926c().getClass(), lVar));
    }

    /* renamed from: i */
    public void mo37430i(ByteString byteString, Object obj, C4987l lVar, C5005p<GeneratedMessageLite.C4933d> pVar) throws IOException {
        GeneratedMessageLite.C4934e eVar = (GeneratedMessageLite.C4934e) obj;
        C4956c0 buildPartial = eVar.mo36926c().newBuilderForType().buildPartial();
        C4962e Q = C4962e.m39170Q(ByteBuffer.wrap(byteString.toByteArray()), true);
        dy4.m43731a().mo42087b(buildPartial, Q, lVar);
        pVar.mo37484y(eVar.f25564d, buildPartial);
        if (Q.mo37091A() != Integer.MAX_VALUE) {
            throw InvalidProtocolBufferException.invalidEndTag();
        }
    }

    /* renamed from: j */
    public void mo37431j(Writer writer, Map.Entry<?, ?> entry) throws IOException {
        GeneratedMessageLite.C4933d dVar = (GeneratedMessageLite.C4933d) entry.getKey();
        if (dVar.mo36922j()) {
            switch (C5002a.f25727a[dVar.mo36923k().ordinal()]) {
                case 1:
                    C4986k0.m39729P(dVar.getNumber(), (List) entry.getValue(), writer, dVar.isPacked());
                    return;
                case 2:
                    C4986k0.m39733T(dVar.getNumber(), (List) entry.getValue(), writer, dVar.isPacked());
                    return;
                case 3:
                    C4986k0.m39736W(dVar.getNumber(), (List) entry.getValue(), writer, dVar.isPacked());
                    return;
                case 4:
                    C4986k0.m39749e0(dVar.getNumber(), (List) entry.getValue(), writer, dVar.isPacked());
                    return;
                case 5:
                    C4986k0.m39735V(dVar.getNumber(), (List) entry.getValue(), writer, dVar.isPacked());
                    return;
                case 6:
                    C4986k0.m39732S(dVar.getNumber(), (List) entry.getValue(), writer, dVar.isPacked());
                    return;
                case 7:
                    C4986k0.m39731R(dVar.getNumber(), (List) entry.getValue(), writer, dVar.isPacked());
                    return;
                case 8:
                    C4986k0.m39727N(dVar.getNumber(), (List) entry.getValue(), writer, dVar.isPacked());
                    return;
                case 9:
                    C4986k0.m39747d0(dVar.getNumber(), (List) entry.getValue(), writer, dVar.isPacked());
                    return;
                case 10:
                    C4986k0.m39738Y(dVar.getNumber(), (List) entry.getValue(), writer, dVar.isPacked());
                    return;
                case 11:
                    C4986k0.m39739Z(dVar.getNumber(), (List) entry.getValue(), writer, dVar.isPacked());
                    return;
                case 12:
                    C4986k0.m39741a0(dVar.getNumber(), (List) entry.getValue(), writer, dVar.isPacked());
                    return;
                case 13:
                    C4986k0.m39743b0(dVar.getNumber(), (List) entry.getValue(), writer, dVar.isPacked());
                    return;
                case 14:
                    C4986k0.m39735V(dVar.getNumber(), (List) entry.getValue(), writer, dVar.isPacked());
                    return;
                case 15:
                    C4986k0.m39728O(dVar.getNumber(), (List) entry.getValue(), writer);
                    return;
                case 16:
                    C4986k0.m39745c0(dVar.getNumber(), (List) entry.getValue(), writer);
                    return;
                case 17:
                    List list = (List) entry.getValue();
                    if (list != null && !list.isEmpty()) {
                        C4986k0.m39734U(dVar.getNumber(), (List) entry.getValue(), writer, dy4.m43731a().mo42089d(list.get(0).getClass()));
                        return;
                    }
                    return;
                case 18:
                    List list2 = (List) entry.getValue();
                    if (list2 != null && !list2.isEmpty()) {
                        C4986k0.m39737X(dVar.getNumber(), (List) entry.getValue(), writer, dy4.m43731a().mo42089d(list2.get(0).getClass()));
                        return;
                    }
                    return;
                default:
                    return;
            }
        } else {
            switch (C5002a.f25727a[dVar.mo36923k().ordinal()]) {
                case 1:
                    writer.mo37030p(dVar.getNumber(), ((Double) entry.getValue()).doubleValue());
                    return;
                case 2:
                    writer.mo37001B(dVar.getNumber(), ((Float) entry.getValue()).floatValue());
                    return;
                case 3:
                    writer.mo37035u(dVar.getNumber(), ((Long) entry.getValue()).longValue());
                    return;
                case 4:
                    writer.mo37020f(dVar.getNumber(), ((Long) entry.getValue()).longValue());
                    return;
                case 5:
                    writer.mo37022h(dVar.getNumber(), ((Integer) entry.getValue()).intValue());
                    return;
                case 6:
                    writer.mo37033s(dVar.getNumber(), ((Long) entry.getValue()).longValue());
                    return;
                case 7:
                    writer.mo37017c(dVar.getNumber(), ((Integer) entry.getValue()).intValue());
                    return;
                case 8:
                    writer.mo37036v(dVar.getNumber(), ((Boolean) entry.getValue()).booleanValue());
                    return;
                case 9:
                    writer.mo37029o(dVar.getNumber(), ((Integer) entry.getValue()).intValue());
                    return;
                case 10:
                    writer.mo37037w(dVar.getNumber(), ((Integer) entry.getValue()).intValue());
                    return;
                case 11:
                    writer.mo37023i(dVar.getNumber(), ((Long) entry.getValue()).longValue());
                    return;
                case 12:
                    writer.mo37007H(dVar.getNumber(), ((Integer) entry.getValue()).intValue());
                    return;
                case 13:
                    writer.mo37027m(dVar.getNumber(), ((Long) entry.getValue()).longValue());
                    return;
                case 14:
                    writer.mo37022h(dVar.getNumber(), ((Integer) entry.getValue()).intValue());
                    return;
                case 15:
                    writer.mo37011L(dVar.getNumber(), (ByteString) entry.getValue());
                    return;
                case 16:
                    writer.mo37019e(dVar.getNumber(), (String) entry.getValue());
                    return;
                case 17:
                    writer.mo37010K(dVar.getNumber(), entry.getValue(), dy4.m43731a().mo42089d(entry.getValue().getClass()));
                    return;
                case 18:
                    writer.mo37013N(dVar.getNumber(), entry.getValue(), dy4.m43731a().mo42089d(entry.getValue().getClass()));
                    return;
                default:
                    return;
            }
        }
    }
}
