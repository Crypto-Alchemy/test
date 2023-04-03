package p000;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.zzkn;
import com.google.android.gms.measurement.internal.zzaq;
import com.google.android.gms.measurement.internal.zzas;
import com.google.android.gms.measurement.internal.zzp;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;
import java.util.zip.GZIPOutputStream;
import org.web3j.ens.contracts.generated.PublicResolver;

/* renamed from: w59 */
/* compiled from: com.google.android.gms:play-services-measurement@@19.0.0 */
public final class w59 extends t49 {
    public w59(s59 s59) {
        super(s59);
    }

    /* renamed from: C */
    public static boolean m53709C(String str) {
        if (str == null || !str.matches("([+-])?([0-9]+\\.?[0-9]*|[0-9]*\\.?[0-9]+)") || str.length() > 310) {
            return false;
        }
        return true;
    }

    /* renamed from: D */
    public static boolean m53710D(List<Long> list, int i) {
        if (i >= list.size() * 64) {
            return false;
        }
        if (((1 << (i % 64)) & list.get(i / 64).longValue()) != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: E */
    public static List<Long> m53711E(BitSet bitSet) {
        int length = (bitSet.length() + 63) / 64;
        ArrayList arrayList = new ArrayList(length);
        for (int i = 0; i < length; i++) {
            long j = 0;
            for (int i2 = 0; i2 < 64; i2++) {
                int i3 = (i * 64) + i2;
                if (i3 >= bitSet.length()) {
                    break;
                }
                if (bitSet.get(i3)) {
                    j |= 1 << i2;
                }
            }
            arrayList.add(Long.valueOf(j));
        }
        return arrayList;
    }

    /* renamed from: J */
    public static <Builder extends p79> Builder m53712J(Builder builder, byte[] bArr) throws zzkn {
        t29 b = t29.m52055b();
        if (b != null) {
            return builder.mo46663E0(bArr, b);
        }
        return builder.mo46662A(bArr);
    }

    /* renamed from: K */
    public static int m53713K(nr8 nr8, String str) {
        for (int i = 0; i < nr8.mo46144C0(); i++) {
            if (str.equals(nr8.mo46148F0(i).mo43931z())) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: L */
    public static List<er8> m53714L(Bundle[] bundleArr) {
        ArrayList arrayList = new ArrayList();
        for (Bundle bundle : bundleArr) {
            if (bundle != null) {
                br8 K = er8.m44025K();
                for (String next : bundle.keySet()) {
                    br8 K2 = er8.m44025K();
                    K2.mo29705w(next);
                    Object obj = bundle.get(next);
                    if (obj instanceof Long) {
                        K2.mo29708z(((Long) obj).longValue());
                    } else if (obj instanceof String) {
                        K2.mo29706x((String) obj);
                    } else if (obj instanceof Double) {
                        K2.mo29699C(((Double) obj).doubleValue());
                    }
                    K.mo29702F(K2);
                }
                if (K.mo29701E() > 0) {
                    arrayList.add((er8) K.mo48885o());
                }
            }
        }
        return arrayList;
    }

    /* renamed from: M */
    public static zzas m53715M(h58 h58) {
        Bundle bundle = new Bundle();
        String str = "app";
        for (String next : h58.mo43091f().keySet()) {
            Object e = h58.mo43089e(next);
            if ("_o".equals(next) && e != null) {
                str = e.toString();
            }
            if (e == null) {
                bundle.putString(next, (String) null);
            } else if (e instanceof Long) {
                bundle.putLong(next, ((Long) e).longValue());
            } else if (e instanceof Double) {
                bundle.putDouble(next, ((Double) e).doubleValue());
            } else {
                bundle.putString(next, e.toString());
            }
        }
        String b = cu8.m43238b(h58.mo43085b());
        if (b == null) {
            b = h58.mo43085b();
        }
        return new zzas(b, new zzaq(bundle), str, h58.mo43084a());
    }

    /* renamed from: N */
    public static final void m53716N(uq8 uq8, String str, Object obj) {
        List<er8> w = uq8.mo48499w();
        int i = 0;
        while (true) {
            if (i >= w.size()) {
                i = -1;
                break;
            } else if (str.equals(w.get(i).mo42393y())) {
                break;
            } else {
                i++;
            }
        }
        br8 K = er8.m44025K();
        K.mo29705w(str);
        if (obj instanceof Long) {
            K.mo29708z(((Long) obj).longValue());
        } else if (obj instanceof String) {
            K.mo29706x((String) obj);
        } else if (obj instanceof Double) {
            K.mo29699C(((Double) obj).doubleValue());
        } else if (obj instanceof Bundle[]) {
            K.mo29703G(m53714L((Bundle[]) obj));
        }
        if (i >= 0) {
            uq8.mo48486B(i, K);
        } else {
            uq8.mo48488D(K);
        }
    }

    /* renamed from: O */
    public static final boolean m53717O(zzas zzas, zzp zzp) {
        cu4.m43221k(zzas);
        cu4.m43221k(zzp);
        if (!TextUtils.isEmpty(zzp.f23099d) || !TextUtils.isEmpty(zzp.f23092P)) {
            return true;
        }
        return false;
    }

    /* renamed from: j */
    public static final er8 m53718j(wq8 wq8, String str) {
        for (er8 next : wq8.mo49255x()) {
            if (next.mo42393y().equals(str)) {
                return next;
            }
        }
        return null;
    }

    /* renamed from: k */
    public static final Object m53719k(wq8 wq8, String str) {
        er8 j = m53718j(wq8, str);
        if (j == null) {
            return null;
        }
        if (j.mo42394z()) {
            return j.mo42382B();
        }
        if (j.mo42383C()) {
            return Long.valueOf(j.mo42384D());
        }
        if (j.mo42387G()) {
            return Double.valueOf(j.mo42388H());
        }
        if (j.mo42390J() <= 0) {
            return null;
        }
        List<er8> I = j.mo42389I();
        ArrayList arrayList = new ArrayList();
        for (er8 next : I) {
            if (next != null) {
                Bundle bundle = new Bundle();
                for (er8 next2 : next.mo42389I()) {
                    if (next2.mo42394z()) {
                        bundle.putString(next2.mo42393y(), next2.mo42382B());
                    } else if (next2.mo42383C()) {
                        bundle.putLong(next2.mo42393y(), next2.mo42384D());
                    } else if (next2.mo42387G()) {
                        bundle.putDouble(next2.mo42393y(), next2.mo42388H());
                    }
                }
                if (!bundle.isEmpty()) {
                    arrayList.add(bundle);
                }
            }
        }
        return (Bundle[]) arrayList.toArray(new Bundle[arrayList.size()]);
    }

    /* renamed from: n */
    public static final void m53720n(StringBuilder sb, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            sb.append("  ");
        }
    }

    /* renamed from: o */
    public static final String m53721o(boolean z, boolean z2, boolean z3) {
        StringBuilder sb = new StringBuilder();
        if (z) {
            sb.append("Dynamic ");
        }
        if (z2) {
            sb.append("Sequence ");
        }
        if (z3) {
            sb.append("Session-Scoped ");
        }
        return sb.toString();
    }

    /* renamed from: p */
    public static final void m53722p(StringBuilder sb, int i, String str, at8 at8) {
        Integer num;
        Integer num2;
        Long l;
        if (at8 != null) {
            m53720n(sb, 3);
            sb.append(str);
            sb.append(" {\n");
            if (at8.mo29054B() != 0) {
                m53720n(sb, 4);
                sb.append("results: ");
                int i2 = 0;
                for (Long next : at8.mo29065z()) {
                    int i3 = i2 + 1;
                    if (i2 != 0) {
                        sb.append(", ");
                    }
                    sb.append(next);
                    i2 = i3;
                }
                sb.append(10);
            }
            if (at8.mo29064y() != 0) {
                m53720n(sb, 4);
                sb.append("status: ");
                int i4 = 0;
                for (Long next2 : at8.mo29063x()) {
                    int i5 = i4 + 1;
                    if (i4 != 0) {
                        sb.append(", ");
                    }
                    sb.append(next2);
                    i4 = i5;
                }
                sb.append(10);
            }
            if (at8.mo29056D() != 0) {
                m53720n(sb, 4);
                sb.append("dynamic_filter_timestamps: {");
                int i6 = 0;
                for (tq8 next3 : at8.mo29055C()) {
                    int i7 = i6 + 1;
                    if (i6 != 0) {
                        sb.append(", ");
                    }
                    if (next3.mo48158x()) {
                        num2 = Integer.valueOf(next3.mo48159y());
                    } else {
                        num2 = null;
                    }
                    sb.append(num2);
                    sb.append(":");
                    if (next3.mo48160z()) {
                        l = Long.valueOf(next3.mo48157B());
                    } else {
                        l = null;
                    }
                    sb.append(l);
                    i6 = i7;
                }
                sb.append("}\n");
            }
            if (at8.mo29059G() != 0) {
                m53720n(sb, 4);
                sb.append("sequence_filter_timestamps: {");
                int i8 = 0;
                for (et8 next4 : at8.mo29058F()) {
                    int i9 = i8 + 1;
                    if (i8 != 0) {
                        sb.append(", ");
                    }
                    if (next4.mo42415x()) {
                        num = Integer.valueOf(next4.mo42416y());
                    } else {
                        num = null;
                    }
                    sb.append(num);
                    sb.append(": [");
                    int i10 = 0;
                    for (Long longValue : next4.mo42417z()) {
                        long longValue2 = longValue.longValue();
                        int i11 = i10 + 1;
                        if (i10 != 0) {
                            sb.append(", ");
                        }
                        sb.append(longValue2);
                        i10 = i11;
                    }
                    sb.append("]");
                    i8 = i9;
                }
                sb.append("}\n");
            }
            m53720n(sb, 3);
            sb.append("}\n");
        }
    }

    /* renamed from: r */
    public static final void m53723r(StringBuilder sb, int i, String str, Object obj) {
        if (obj != null) {
            m53720n(sb, i + 1);
            sb.append(str);
            sb.append(": ");
            sb.append(obj);
            sb.append(10);
        }
    }

    /* renamed from: t */
    public static final void m53724t(StringBuilder sb, int i, String str, ln8 ln8) {
        if (ln8 != null) {
            m53720n(sb, i);
            sb.append(str);
            sb.append(" {\n");
            if (ln8.mo45471x()) {
                m53723r(sb, i, "comparison_type", ln8.mo45472y().name());
            }
            if (ln8.mo45473z()) {
                m53723r(sb, i, "match_as_float", Boolean.valueOf(ln8.mo45464B()));
            }
            if (ln8.mo45465C()) {
                m53723r(sb, i, "comparison_value", ln8.mo45466D());
            }
            if (ln8.mo45467E()) {
                m53723r(sb, i, "min_comparison_value", ln8.mo45468F());
            }
            if (ln8.mo45469G()) {
                m53723r(sb, i, "max_comparison_value", ln8.mo45470H());
            }
            m53720n(sb, i);
            sb.append("}\n");
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:?, code lost:
        r4.f34342a.mo45237A().mo29670l().mo48769a("Failed to load parcelable from buffer");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002e, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002f, code lost:
        r1.recycle();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0032, code lost:
        throw r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001a, code lost:
        r5 = move-exception;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x001c */
    /* renamed from: B */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final <T extends android.os.Parcelable> T mo48897B(byte[] r5, android.os.Parcelable.Creator<T> r6) {
        /*
            r4 = this;
            r0 = 0
            if (r5 != 0) goto L_0x0004
            return r0
        L_0x0004:
            android.os.Parcel r1 = android.os.Parcel.obtain()
            int r2 = r5.length     // Catch:{ ParseException -> 0x001c }
            r3 = 0
            r1.unmarshall(r5, r3, r2)     // Catch:{ ParseException -> 0x001c }
            r1.setDataPosition(r3)     // Catch:{ ParseException -> 0x001c }
            java.lang.Object r5 = r6.createFromParcel(r1)     // Catch:{ ParseException -> 0x001c }
            android.os.Parcelable r5 = (android.os.Parcelable) r5     // Catch:{ ParseException -> 0x001c }
            r1.recycle()
            return r5
        L_0x001a:
            r5 = move-exception
            goto L_0x002f
        L_0x001c:
            kr8 r5 = r4.f34342a     // Catch:{ all -> 0x001a }
            bn8 r5 = r5.mo45237A()     // Catch:{ all -> 0x001a }
            vm8 r5 = r5.mo29670l()     // Catch:{ all -> 0x001a }
            java.lang.String r6 = "Failed to load parcelable from buffer"
            r5.mo48769a(r6)     // Catch:{ all -> 0x001a }
            r1.recycle()
            return r0
        L_0x002f:
            r1.recycle()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.w59.mo48897B(byte[], android.os.Parcelable$Creator):android.os.Parcelable");
    }

    /* renamed from: F */
    public final List<Long> mo48898F(List<Long> list, List<Integer> list2) {
        int i;
        ArrayList arrayList = new ArrayList(list);
        for (Integer next : list2) {
            if (next.intValue() < 0) {
                this.f34342a.mo45237A().mo29673o().mo48770b("Ignoring negative bit index to be cleared", next);
            } else {
                int intValue = next.intValue() / 64;
                if (intValue >= arrayList.size()) {
                    this.f34342a.mo45237A().mo29673o().mo48771c("Ignoring bit index greater than bitSet size", next, Integer.valueOf(arrayList.size()));
                } else {
                    arrayList.set(intValue, Long.valueOf(((Long) arrayList.get(intValue)).longValue() & (~(1 << (next.intValue() % 64)))));
                }
            }
        }
        int size = arrayList.size();
        int size2 = arrayList.size() - 1;
        while (true) {
            int i2 = size2;
            i = size;
            size = i2;
            if (size >= 0 && ((Long) arrayList.get(size)).longValue() == 0) {
                size2 = size - 1;
            }
        }
        return arrayList.subList(0, i);
    }

    /* renamed from: G */
    public final boolean mo48899G(long j, long j2) {
        if (j == 0 || j2 <= 0 || Math.abs(this.f34342a.mo45256a().mo29580a() - j) > j2) {
            return true;
        }
        return false;
    }

    /* renamed from: H */
    public final long mo48900H(byte[] bArr) {
        cu4.m43221k(bArr);
        this.f34342a.mo45243G().mo29006e();
        MessageDigest B = g69.m44574B();
        if (B != null) {
            return g69.m44575C(B.digest(bArr));
        }
        this.f34342a.mo45237A().mo29670l().mo48769a("Failed to get MD5");
        return 0;
    }

    /* renamed from: I */
    public final byte[] mo48901I(byte[] bArr) throws IOException {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            gZIPOutputStream.write(bArr);
            gZIPOutputStream.close();
            byteArrayOutputStream.close();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            this.f34342a.mo45237A().mo29670l().mo48770b("Failed to gzip content", e);
            throw e;
        }
    }

    /* renamed from: h */
    public final boolean mo43450h() {
        return false;
    }

    /* renamed from: l */
    public final void mo48902l(StringBuilder sb, int i, List<er8> list) {
        String str;
        String str2;
        Long l;
        if (list != null) {
            int i2 = i + 1;
            for (er8 next : list) {
                if (next != null) {
                    m53720n(sb, i2);
                    sb.append("param {\n");
                    Double d = null;
                    if (next.mo42392x()) {
                        str = this.f34342a.mo45244H().mo45822n(next.mo42393y());
                    } else {
                        str = null;
                    }
                    m53723r(sb, i2, PublicResolver.FUNC_NAME, str);
                    if (next.mo42394z()) {
                        str2 = next.mo42382B();
                    } else {
                        str2 = null;
                    }
                    m53723r(sb, i2, "string_value", str2);
                    if (next.mo42383C()) {
                        l = Long.valueOf(next.mo42384D());
                    } else {
                        l = null;
                    }
                    m53723r(sb, i2, "int_value", l);
                    if (next.mo42387G()) {
                        d = Double.valueOf(next.mo42388H());
                    }
                    m53723r(sb, i2, "double_value", d);
                    if (next.mo42390J() > 0) {
                        mo48902l(sb, i2, next.mo42389I());
                    }
                    m53720n(sb, i2);
                    sb.append("}\n");
                }
            }
        }
    }

    /* renamed from: m */
    public final void mo48903m(StringBuilder sb, int i, xm8 xm8) {
        if (xm8 != null) {
            m53720n(sb, i);
            sb.append("filter {\n");
            if (xm8.mo49514C()) {
                m53723r(sb, i, "complement", Boolean.valueOf(xm8.mo49515D()));
            }
            if (xm8.mo49516E()) {
                m53723r(sb, i, "param_name", this.f34342a.mo45244H().mo45822n(xm8.mo49517F()));
            }
            if (xm8.mo49518x()) {
                int i2 = i + 1;
                eo8 y = xm8.mo49519y();
                if (y != null) {
                    m53720n(sb, i2);
                    sb.append("string_filter {\n");
                    if (y.mo42341x()) {
                        m53723r(sb, i2, "match_type", y.mo42342y().name());
                    }
                    if (y.mo42343z()) {
                        m53723r(sb, i2, "expression", y.mo42336B());
                    }
                    if (y.mo42337C()) {
                        m53723r(sb, i2, "case_sensitive", Boolean.valueOf(y.mo42338D()));
                    }
                    if (y.mo42340F() > 0) {
                        m53720n(sb, i2 + 1);
                        sb.append("expression_list {\n");
                        for (String append : y.mo42339E()) {
                            m53720n(sb, i2 + 2);
                            sb.append(append);
                            sb.append("\n");
                        }
                        sb.append("}\n");
                    }
                    m53720n(sb, i2);
                    sb.append("}\n");
                }
            }
            if (xm8.mo49520z()) {
                m53724t(sb, i + 1, "number_filter", xm8.mo49513B());
            }
            m53720n(sb, i);
            sb.append("}\n");
        }
    }

    /* renamed from: u */
    public final void mo48904u(gt8 gt8, Object obj) {
        cu4.m43221k(obj);
        gt8.mo42979z();
        gt8.mo42973C();
        gt8.mo42975E();
        if (obj instanceof String) {
            gt8.mo42978y((String) obj);
        } else if (obj instanceof Long) {
            gt8.mo42972B(((Long) obj).longValue());
        } else if (obj instanceof Double) {
            gt8.mo42974D(((Double) obj).doubleValue());
        } else {
            this.f34342a.mo45237A().mo29670l().mo48770b("Ignoring invalid (type) user attribute value", obj);
        }
    }

    /* renamed from: v */
    public final void mo48905v(br8 br8, Object obj) {
        cu4.m43221k(obj);
        br8.mo29707y();
        br8.mo29698B();
        br8.mo29700D();
        br8.mo29704H();
        if (obj instanceof String) {
            br8.mo29706x((String) obj);
        } else if (obj instanceof Long) {
            br8.mo29708z(((Long) obj).longValue());
        } else if (obj instanceof Double) {
            br8.mo29699C(((Double) obj).doubleValue());
        } else if (obj instanceof Bundle[]) {
            br8.mo29703G(m53714L((Bundle[]) obj));
        } else {
            this.f34342a.mo45237A().mo29670l().mo48770b("Ignoring invalid (type) event param value", obj);
        }
    }

    /* renamed from: w */
    public final wq8 mo48906w(j88 j88) {
        uq8 I = wq8.m54013I();
        I.mo48498N(j88.f30244e);
        q88 q88 = new q88(j88.f30245f);
        while (q88.hasNext()) {
            String a = q88.next();
            br8 K = er8.m44025K();
            K.mo29705w(a);
            Object r1 = j88.f30245f.mo31413r1(a);
            cu4.m43221k(r1);
            mo48905v(K, r1);
            I.mo48488D(K);
        }
        return (wq8) I.mo48885o();
    }

    /* renamed from: x */
    public final String mo48907x(jr8 jr8) {
        Long l;
        Long l2;
        Double d;
        if (jr8 == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("\nbatch {\n");
        for (or8 next : jr8.mo44566x()) {
            if (next != null) {
                m53720n(sb, 1);
                sb.append("bundle {\n");
                if (next.mo46502Z()) {
                    m53723r(sb, 1, "protocol_version", Integer.valueOf(next.mo46503b1()));
                }
                m53723r(sb, 1, "platform", next.mo46479I1());
                if (next.mo46515z()) {
                    m53723r(sb, 1, "gmp_version", Long.valueOf(next.mo46457B()));
                }
                if (next.mo46460C()) {
                    m53723r(sb, 1, "uploading_gmp_version", Long.valueOf(next.mo46463D()));
                }
                if (next.mo46469F0()) {
                    m53723r(sb, 1, "dynamite_version", Long.valueOf(next.mo46472G0()));
                }
                if (next.mo46498U()) {
                    m53723r(sb, 1, "config_version", Long.valueOf(next.mo46499V()));
                }
                m53723r(sb, 1, "gmp_app_id", next.mo46489N());
                m53723r(sb, 1, "admob_app_id", next.mo46464D0());
                m53723r(sb, 1, "app_id", next.mo46511x());
                m53723r(sb, 1, "app_version", next.mo46513y());
                if (next.mo46496S()) {
                    m53723r(sb, 1, "app_version_major", Integer.valueOf(next.mo46497T()));
                }
                m53723r(sb, 1, "firebase_instance_id", next.mo46495R());
                if (next.mo46477I()) {
                    m53723r(sb, 1, "dev_cert_hash", Long.valueOf(next.mo46480J()));
                }
                m53723r(sb, 1, "app_store", next.mo46492O1());
                if (next.mo46514y1()) {
                    m53723r(sb, 1, "upload_timestamp_millis", Long.valueOf(next.mo46516z1()));
                }
                if (next.mo46456A1()) {
                    m53723r(sb, 1, "start_timestamp_millis", Long.valueOf(next.mo46459B1()));
                }
                if (next.mo46462C1()) {
                    m53723r(sb, 1, "end_timestamp_millis", Long.valueOf(next.mo46465D1()));
                }
                if (next.mo46467E1()) {
                    m53723r(sb, 1, "previous_bundle_start_timestamp_millis", Long.valueOf(next.mo46470F1()));
                }
                if (next.mo46473G1()) {
                    m53723r(sb, 1, "previous_bundle_end_timestamp_millis", Long.valueOf(next.mo46476H1()));
                }
                m53723r(sb, 1, "app_instance_id", next.mo46474H());
                m53723r(sb, 1, "resettable_device_id", next.mo46466E());
                m53723r(sb, 1, "ds_id", next.mo46455A0());
                if (next.mo46468F()) {
                    m53723r(sb, 1, "limited_ad_tracking", Boolean.valueOf(next.mo46471G()));
                }
                m53723r(sb, 1, "os_version", next.mo46482J1());
                m53723r(sb, 1, "device_model", next.mo46484K1());
                m53723r(sb, 1, "user_default_language", next.mo46486L1());
                if (next.mo46488M1()) {
                    m53723r(sb, 1, "time_zone_offset_minutes", Integer.valueOf(next.mo46490N1()));
                }
                if (next.mo46483K()) {
                    m53723r(sb, 1, "bundle_sequential_index", Integer.valueOf(next.mo46485L()));
                }
                if (next.mo46491O()) {
                    m53723r(sb, 1, "service_upload", Boolean.valueOf(next.mo46493P()));
                }
                m53723r(sb, 1, "health_monitor", next.mo46487M());
                if (!this.f34342a.mo45274y().mo45997v((String) null, rl8.f33527v0) && next.mo46500X() && next.mo46501Y() != 0) {
                    m53723r(sb, 1, "android_id", Long.valueOf(next.mo46501Y()));
                }
                if (next.mo46458B0()) {
                    m53723r(sb, 1, "retry_counter", Integer.valueOf(next.mo46461C0()));
                }
                if (next.mo46478I0()) {
                    m53723r(sb, 1, "consent_signals", next.mo46481J0());
                }
                List<it8> v1 = next.mo46509v1();
                if (v1 != null) {
                    for (it8 next2 : v1) {
                        if (next2 != null) {
                            m53720n(sb, 2);
                            sb.append("user_property {\n");
                            if (next2.mo43929x()) {
                                l = Long.valueOf(next2.mo43930y());
                            } else {
                                l = null;
                            }
                            m53723r(sb, 2, "set_timestamp_millis", l);
                            m53723r(sb, 2, PublicResolver.FUNC_NAME, this.f34342a.mo45244H().mo45823o(next2.mo43931z()));
                            m53723r(sb, 2, "string_value", next2.mo43924C());
                            if (next2.mo43925D()) {
                                l2 = Long.valueOf(next2.mo43926E());
                            } else {
                                l2 = null;
                            }
                            m53723r(sb, 2, "int_value", l2);
                            if (next2.mo43927F()) {
                                d = Double.valueOf(next2.mo43928G());
                            } else {
                                d = null;
                            }
                            m53723r(sb, 2, "double_value", d);
                            m53720n(sb, 2);
                            sb.append("}\n");
                        }
                    }
                }
                List<mq8> Q = next.mo46494Q();
                if (Q != null) {
                    for (mq8 next3 : Q) {
                        if (next3 != null) {
                            m53720n(sb, 2);
                            sb.append("audience_membership {\n");
                            if (next3.mo45856x()) {
                                m53723r(sb, 2, "audience_id", Integer.valueOf(next3.mo45857y()));
                            }
                            if (next3.mo45854D()) {
                                m53723r(sb, 2, "new_audience", Boolean.valueOf(next3.mo45855E()));
                            }
                            m53722p(sb, 2, "current_data", next3.mo45858z());
                            if (next3.mo45852B()) {
                                m53722p(sb, 2, "previous_data", next3.mo45853C());
                            }
                            m53720n(sb, 2);
                            sb.append("}\n");
                        }
                    }
                }
                List<wq8> s1 = next.mo46506s1();
                if (s1 != null) {
                    for (wq8 next4 : s1) {
                        if (next4 != null) {
                            m53720n(sb, 2);
                            sb.append("event {\n");
                            m53723r(sb, 2, PublicResolver.FUNC_NAME, this.f34342a.mo45244H().mo45821m(next4.mo49247B()));
                            if (next4.mo49248C()) {
                                m53723r(sb, 2, "timestamp_millis", Long.valueOf(next4.mo49249D()));
                            }
                            if (next4.mo49250E()) {
                                m53723r(sb, 2, "previous_timestamp_millis", Long.valueOf(next4.mo49251F()));
                            }
                            if (next4.mo49252G()) {
                                m53723r(sb, 2, "count", Integer.valueOf(next4.mo49253H()));
                            }
                            if (next4.mo49256y() != 0) {
                                mo48902l(sb, 2, next4.mo49255x());
                            }
                            m53720n(sb, 2);
                            sb.append("}\n");
                        }
                    }
                }
                m53720n(sb, 1);
                sb.append("}\n");
            }
        }
        sb.append("}\n");
        return sb.toString();
    }

    /* renamed from: y */
    public final String mo48908y(rm8 rm8) {
        if (rm8 == null) {
            return "null";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("\nevent_filter {\n");
        if (rm8.mo47444x()) {
            m53723r(sb, 0, "filter_id", Integer.valueOf(rm8.mo47445y()));
        }
        m53723r(sb, 0, "event_name", this.f34342a.mo45244H().mo45821m(rm8.mo47446z()));
        String o = m53721o(rm8.mo47440G(), rm8.mo47441H(), rm8.mo47443J());
        if (!o.isEmpty()) {
            m53723r(sb, 0, "filter_type", o);
        }
        if (rm8.mo47438E()) {
            m53724t(sb, 1, "event_count_filter", rm8.mo47439F());
        }
        if (rm8.mo47436C() > 0) {
            sb.append("  filters {\n");
            for (xm8 m : rm8.mo47435B()) {
                mo48903m(sb, 2, m);
            }
        }
        m53720n(sb, 1);
        sb.append("}\n}\n");
        return sb.toString();
    }

    /* renamed from: z */
    public final String mo48909z(rn8 rn8) {
        if (rn8 == null) {
            return "null";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("\nproperty_filter {\n");
        if (rn8.mo47452x()) {
            m53723r(sb, 0, "filter_id", Integer.valueOf(rn8.mo47453y()));
        }
        m53723r(sb, 0, "property_name", this.f34342a.mo45244H().mo45823o(rn8.mo47454z()));
        String o = m53721o(rn8.mo47448C(), rn8.mo47449D(), rn8.mo47451F());
        if (!o.isEmpty()) {
            m53723r(sb, 0, "filter_type", o);
        }
        mo48903m(sb, 1, rn8.mo47447B());
        sb.append("}\n");
        return sb.toString();
    }
}
