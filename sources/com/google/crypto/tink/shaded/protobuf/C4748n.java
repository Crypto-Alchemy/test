package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.GeneratedMessageLite;
import com.google.crypto.tink.shaded.protobuf.WireFormat;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.crypto.tink.shaded.protobuf.n */
/* compiled from: ExtensionSchemaLite */
public final class C4748n extends C4746m<GeneratedMessageLite.C4683d> {

    /* renamed from: com.google.crypto.tink.shaded.protobuf.n$a */
    /* compiled from: ExtensionSchemaLite */
    public static /* synthetic */ class C4749a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f25271a;

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
                com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType[] r0 = com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f25271a = r0
                com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType r1 = com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType.DOUBLE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f25271a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType r1 = com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType.FLOAT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f25271a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType r1 = com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType.INT64     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f25271a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType r1 = com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType.UINT64     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f25271a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType r1 = com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType.INT32     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f25271a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType r1 = com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType.FIXED64     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f25271a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType r1 = com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType.FIXED32     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = f25271a     // Catch:{ NoSuchFieldError -> 0x0060 }
                com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType r1 = com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType.BOOL     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                int[] r0 = f25271a     // Catch:{ NoSuchFieldError -> 0x006c }
                com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType r1 = com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType.UINT32     // Catch:{ NoSuchFieldError -> 0x006c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006c }
            L_0x006c:
                int[] r0 = f25271a     // Catch:{ NoSuchFieldError -> 0x0078 }
                com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType r1 = com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType.SFIXED32     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r2 = 10
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                int[] r0 = f25271a     // Catch:{ NoSuchFieldError -> 0x0084 }
                com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType r1 = com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType.SFIXED64     // Catch:{ NoSuchFieldError -> 0x0084 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0084 }
                r2 = 11
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0084 }
            L_0x0084:
                int[] r0 = f25271a     // Catch:{ NoSuchFieldError -> 0x0090 }
                com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType r1 = com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType.SINT32     // Catch:{ NoSuchFieldError -> 0x0090 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0090 }
                r2 = 12
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0090 }
            L_0x0090:
                int[] r0 = f25271a     // Catch:{ NoSuchFieldError -> 0x009c }
                com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType r1 = com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType.SINT64     // Catch:{ NoSuchFieldError -> 0x009c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x009c }
                r2 = 13
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x009c }
            L_0x009c:
                int[] r0 = f25271a     // Catch:{ NoSuchFieldError -> 0x00a8 }
                com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType r1 = com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType.ENUM     // Catch:{ NoSuchFieldError -> 0x00a8 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00a8 }
                r2 = 14
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00a8 }
            L_0x00a8:
                int[] r0 = f25271a     // Catch:{ NoSuchFieldError -> 0x00b4 }
                com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType r1 = com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType.BYTES     // Catch:{ NoSuchFieldError -> 0x00b4 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00b4 }
                r2 = 15
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00b4 }
            L_0x00b4:
                int[] r0 = f25271a     // Catch:{ NoSuchFieldError -> 0x00c0 }
                com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType r1 = com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType.STRING     // Catch:{ NoSuchFieldError -> 0x00c0 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00c0 }
                r2 = 16
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00c0 }
            L_0x00c0:
                int[] r0 = f25271a     // Catch:{ NoSuchFieldError -> 0x00cc }
                com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType r1 = com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType.GROUP     // Catch:{ NoSuchFieldError -> 0x00cc }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00cc }
                r2 = 17
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00cc }
            L_0x00cc:
                int[] r0 = f25271a     // Catch:{ NoSuchFieldError -> 0x00d8 }
                com.google.crypto.tink.shaded.protobuf.WireFormat$FieldType r1 = com.google.crypto.tink.shaded.protobuf.WireFormat.FieldType.MESSAGE     // Catch:{ NoSuchFieldError -> 0x00d8 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00d8 }
                r2 = 18
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00d8 }
            L_0x00d8:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.C4748n.C4749a.<clinit>():void");
        }
    }

    /* renamed from: a */
    public int mo35959a(Map.Entry<?, ?> entry) {
        return ((GeneratedMessageLite.C4683d) entry.getKey()).getNumber();
    }

    /* renamed from: b */
    public Object mo35960b(C4734l lVar, C4705c0 c0Var, int i) {
        return lVar.mo35903a(c0Var, i);
    }

    /* renamed from: c */
    public C4752p<GeneratedMessageLite.C4683d> mo35961c(Object obj) {
        return ((GeneratedMessageLite.C4682c) obj).extensions;
    }

    /* renamed from: d */
    public C4752p<GeneratedMessageLite.C4683d> mo35962d(Object obj) {
        return ((GeneratedMessageLite.C4682c) obj).mo35475C();
    }

    /* renamed from: e */
    public boolean mo35963e(C4705c0 c0Var) {
        return c0Var instanceof GeneratedMessageLite.C4682c;
    }

    /* renamed from: f */
    public void mo35964f(Object obj) {
        mo35961c(obj).mo35996s();
    }

    /* renamed from: g */
    public <UT, UB> UB mo35965g(C4729i0 i0Var, Object obj, C4734l lVar, C4752p<GeneratedMessageLite.C4683d> pVar, UB ub, C4747m0<UT, UB> m0Var) throws IOException {
        Object i;
        ArrayList arrayList;
        GeneratedMessageLite.C4684e eVar = (GeneratedMessageLite.C4684e) obj;
        int c = eVar.mo35487c();
        if (!eVar.f25112b.mo35482j() || !eVar.f25112b.isPacked()) {
            Object obj2 = null;
            if (eVar.mo35485a() != WireFormat.FieldType.ENUM) {
                switch (C4749a.f25271a[eVar.mo35485a().ordinal()]) {
                    case 1:
                        obj2 = Double.valueOf(i0Var.readDouble());
                        break;
                    case 2:
                        obj2 = Float.valueOf(i0Var.readFloat());
                        break;
                    case 3:
                        obj2 = Long.valueOf(i0Var.mo35641H());
                        break;
                    case 4:
                        obj2 = Long.valueOf(i0Var.mo35692s());
                        break;
                    case 5:
                        obj2 = Integer.valueOf(i0Var.mo35687p());
                        break;
                    case 6:
                        obj2 = Long.valueOf(i0Var.mo35661b());
                        break;
                    case 7:
                        obj2 = Integer.valueOf(i0Var.mo35694u());
                        break;
                    case 8:
                        obj2 = Boolean.valueOf(i0Var.mo35667e());
                        break;
                    case 9:
                        obj2 = Integer.valueOf(i0Var.mo35673h());
                        break;
                    case 10:
                        obj2 = Integer.valueOf(i0Var.mo35638E());
                        break;
                    case 11:
                        obj2 = Long.valueOf(i0Var.mo35669f());
                        break;
                    case 12:
                        obj2 = Integer.valueOf(i0Var.mo35681l());
                        break;
                    case 13:
                        obj2 = Long.valueOf(i0Var.mo35698y());
                        break;
                    case 14:
                        throw new IllegalStateException("Shouldn't reach here.");
                    case 15:
                        obj2 = i0Var.mo35686o();
                        break;
                    case 16:
                        obj2 = i0Var.mo35699z();
                        break;
                    case 17:
                        obj2 = i0Var.mo35644K(eVar.mo35486b().getClass(), lVar);
                        break;
                    case 18:
                        obj2 = i0Var.mo35648O(eVar.mo35486b().getClass(), lVar);
                        break;
                }
            } else {
                int p = i0Var.mo35687p();
                if (eVar.f25112b.mo35479d().findValueByNumber(p) == null) {
                    return C4733k0.m38128L(c, p, ub, m0Var);
                }
                obj2 = Integer.valueOf(p);
            }
            if (eVar.mo35488d()) {
                pVar.mo35982a(eVar.f25112b, obj2);
            } else {
                int i2 = C4749a.f25271a[eVar.mo35485a().ordinal()];
                if ((i2 == 17 || i2 == 18) && (i = pVar.mo35988i(eVar.f25112b)) != null) {
                    obj2 = C4758t.m38327h(i, obj2);
                }
                pVar.mo35999w(eVar.f25112b, obj2);
            }
        } else {
            switch (C4749a.f25271a[eVar.mo35485a().ordinal()]) {
                case 1:
                    arrayList = new ArrayList();
                    i0Var.mo35640G(arrayList);
                    break;
                case 2:
                    arrayList = new ArrayList();
                    i0Var.mo35636C(arrayList);
                    break;
                case 3:
                    arrayList = new ArrayList();
                    i0Var.mo35675i(arrayList);
                    break;
                case 4:
                    arrayList = new ArrayList();
                    i0Var.mo35671g(arrayList);
                    break;
                case 5:
                    arrayList = new ArrayList();
                    i0Var.mo35696w(arrayList);
                    break;
                case 6:
                    arrayList = new ArrayList();
                    i0Var.mo35688q(arrayList);
                    break;
                case 7:
                    arrayList = new ArrayList();
                    i0Var.mo35697x(arrayList);
                    break;
                case 8:
                    arrayList = new ArrayList();
                    i0Var.mo35683m(arrayList);
                    break;
                case 9:
                    arrayList = new ArrayList();
                    i0Var.mo35693t(arrayList);
                    break;
                case 10:
                    arrayList = new ArrayList();
                    i0Var.mo35663c(arrayList);
                    break;
                case 11:
                    arrayList = new ArrayList();
                    i0Var.mo35695v(arrayList);
                    break;
                case 12:
                    arrayList = new ArrayList();
                    i0Var.mo35689r(arrayList);
                    break;
                case 13:
                    arrayList = new ArrayList();
                    i0Var.mo35665d(arrayList);
                    break;
                case 14:
                    arrayList = new ArrayList();
                    i0Var.mo35677j(arrayList);
                    ub = C4733k0.m38173z(c, arrayList, eVar.f25112b.mo35479d(), ub, m0Var);
                    break;
                default:
                    throw new IllegalStateException("Type cannot be packed: " + eVar.f25112b.mo35483k());
            }
            pVar.mo35999w(eVar.f25112b, arrayList);
        }
        return ub;
    }

    /* renamed from: h */
    public void mo35966h(C4729i0 i0Var, Object obj, C4734l lVar, C4752p<GeneratedMessageLite.C4683d> pVar) throws IOException {
        GeneratedMessageLite.C4684e eVar = (GeneratedMessageLite.C4684e) obj;
        pVar.mo35999w(eVar.f25112b, i0Var.mo35648O(eVar.mo35486b().getClass(), lVar));
    }

    /* renamed from: i */
    public void mo35967i(ByteString byteString, Object obj, C4734l lVar, C4752p<GeneratedMessageLite.C4683d> pVar) throws IOException {
        GeneratedMessageLite.C4684e eVar = (GeneratedMessageLite.C4684e) obj;
        C4705c0 buildPartial = eVar.mo35486b().newBuilderForType().buildPartial();
        C4711e Q = C4711e.m37585Q(ByteBuffer.wrap(byteString.toByteArray()), true);
        ey4.m44106a().mo42450b(buildPartial, Q, lVar);
        pVar.mo35999w(eVar.f25112b, buildPartial);
        if (Q.mo35634A() != Integer.MAX_VALUE) {
            throw InvalidProtocolBufferException.invalidEndTag();
        }
    }

    /* renamed from: j */
    public void mo35968j(Writer writer, Map.Entry<?, ?> entry) throws IOException {
        GeneratedMessageLite.C4683d dVar = (GeneratedMessageLite.C4683d) entry.getKey();
        if (dVar.mo35482j()) {
            switch (C4749a.f25271a[dVar.mo35483k().ordinal()]) {
                case 1:
                    C4733k0.m38132P(dVar.getNumber(), (List) entry.getValue(), writer, dVar.isPacked());
                    return;
                case 2:
                    C4733k0.m38136T(dVar.getNumber(), (List) entry.getValue(), writer, dVar.isPacked());
                    return;
                case 3:
                    C4733k0.m38139W(dVar.getNumber(), (List) entry.getValue(), writer, dVar.isPacked());
                    return;
                case 4:
                    C4733k0.m38152e0(dVar.getNumber(), (List) entry.getValue(), writer, dVar.isPacked());
                    return;
                case 5:
                    C4733k0.m38138V(dVar.getNumber(), (List) entry.getValue(), writer, dVar.isPacked());
                    return;
                case 6:
                    C4733k0.m38135S(dVar.getNumber(), (List) entry.getValue(), writer, dVar.isPacked());
                    return;
                case 7:
                    C4733k0.m38134R(dVar.getNumber(), (List) entry.getValue(), writer, dVar.isPacked());
                    return;
                case 8:
                    C4733k0.m38130N(dVar.getNumber(), (List) entry.getValue(), writer, dVar.isPacked());
                    return;
                case 9:
                    C4733k0.m38150d0(dVar.getNumber(), (List) entry.getValue(), writer, dVar.isPacked());
                    return;
                case 10:
                    C4733k0.m38141Y(dVar.getNumber(), (List) entry.getValue(), writer, dVar.isPacked());
                    return;
                case 11:
                    C4733k0.m38142Z(dVar.getNumber(), (List) entry.getValue(), writer, dVar.isPacked());
                    return;
                case 12:
                    C4733k0.m38144a0(dVar.getNumber(), (List) entry.getValue(), writer, dVar.isPacked());
                    return;
                case 13:
                    C4733k0.m38146b0(dVar.getNumber(), (List) entry.getValue(), writer, dVar.isPacked());
                    return;
                case 14:
                    C4733k0.m38138V(dVar.getNumber(), (List) entry.getValue(), writer, dVar.isPacked());
                    return;
                case 15:
                    C4733k0.m38131O(dVar.getNumber(), (List) entry.getValue(), writer);
                    return;
                case 16:
                    C4733k0.m38148c0(dVar.getNumber(), (List) entry.getValue(), writer);
                    return;
                case 17:
                    List list = (List) entry.getValue();
                    if (list != null && !list.isEmpty()) {
                        C4733k0.m38137U(dVar.getNumber(), (List) entry.getValue(), writer, ey4.m44106a().mo42452d(list.get(0).getClass()));
                        return;
                    }
                    return;
                case 18:
                    List list2 = (List) entry.getValue();
                    if (list2 != null && !list2.isEmpty()) {
                        C4733k0.m38140X(dVar.getNumber(), (List) entry.getValue(), writer, ey4.m44106a().mo42452d(list2.get(0).getClass()));
                        return;
                    }
                    return;
                default:
                    return;
            }
        } else {
            switch (C4749a.f25271a[dVar.mo35483k().ordinal()]) {
                case 1:
                    writer.mo35590p(dVar.getNumber(), ((Double) entry.getValue()).doubleValue());
                    return;
                case 2:
                    writer.mo35561B(dVar.getNumber(), ((Float) entry.getValue()).floatValue());
                    return;
                case 3:
                    writer.mo35595u(dVar.getNumber(), ((Long) entry.getValue()).longValue());
                    return;
                case 4:
                    writer.mo35580f(dVar.getNumber(), ((Long) entry.getValue()).longValue());
                    return;
                case 5:
                    writer.mo35582h(dVar.getNumber(), ((Integer) entry.getValue()).intValue());
                    return;
                case 6:
                    writer.mo35593s(dVar.getNumber(), ((Long) entry.getValue()).longValue());
                    return;
                case 7:
                    writer.mo35577c(dVar.getNumber(), ((Integer) entry.getValue()).intValue());
                    return;
                case 8:
                    writer.mo35596v(dVar.getNumber(), ((Boolean) entry.getValue()).booleanValue());
                    return;
                case 9:
                    writer.mo35589o(dVar.getNumber(), ((Integer) entry.getValue()).intValue());
                    return;
                case 10:
                    writer.mo35597w(dVar.getNumber(), ((Integer) entry.getValue()).intValue());
                    return;
                case 11:
                    writer.mo35583i(dVar.getNumber(), ((Long) entry.getValue()).longValue());
                    return;
                case 12:
                    writer.mo35567H(dVar.getNumber(), ((Integer) entry.getValue()).intValue());
                    return;
                case 13:
                    writer.mo35587m(dVar.getNumber(), ((Long) entry.getValue()).longValue());
                    return;
                case 14:
                    writer.mo35582h(dVar.getNumber(), ((Integer) entry.getValue()).intValue());
                    return;
                case 15:
                    writer.mo35572M(dVar.getNumber(), (ByteString) entry.getValue());
                    return;
                case 16:
                    writer.mo35579e(dVar.getNumber(), (String) entry.getValue());
                    return;
                case 17:
                    writer.mo35570K(dVar.getNumber(), entry.getValue(), ey4.m44106a().mo42452d(entry.getValue().getClass()));
                    return;
                case 18:
                    writer.mo35573N(dVar.getNumber(), entry.getValue(), ey4.m44106a().mo42452d(entry.getValue().getClass()));
                    return;
                default:
                    return;
            }
        }
    }
}
