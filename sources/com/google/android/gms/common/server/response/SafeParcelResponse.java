package com.google.android.gms.common.server.response;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.server.response.FastJsonResponse;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
public class SafeParcelResponse extends FastSafeParcelableJsonResponse {
    public static final Parcelable.Creator<SafeParcelResponse> CREATOR = new i38();

    /* renamed from: a */
    public final int f22373a;

    /* renamed from: d */
    public final Parcel f22374d;

    /* renamed from: e */
    public final int f22375e = 2;

    /* renamed from: g */
    public final zan f22376g;

    /* renamed from: k */
    public final String f22377k;

    /* renamed from: r */
    public int f22378r;

    /* renamed from: s */
    public int f22379s;

    public SafeParcelResponse(int i, Parcel parcel, zan zan) {
        String str;
        this.f22373a = i;
        this.f22374d = (Parcel) cu4.m43221k(parcel);
        this.f22376g = zan;
        if (zan == null) {
            str = null;
        } else {
            str = zan.mo30723r1();
        }
        this.f22377k = str;
        this.f22378r = 2;
    }

    /* renamed from: j */
    public static final void m33795j(StringBuilder sb, int i, Object obj) {
        switch (i) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                sb.append(obj);
                return;
            case 7:
                sb.append("\"");
                sb.append(j73.m46161a(cu4.m43221k(obj).toString()));
                sb.append("\"");
                return;
            case 8:
                sb.append("\"");
                sb.append(C6585ux.m53029a((byte[]) obj));
                sb.append("\"");
                return;
            case 9:
                sb.append("\"");
                sb.append(C6585ux.m53030b((byte[]) obj));
                sb.append("\"");
                return;
            case 10:
                tn3.m52382a(sb, (HashMap) cu4.m43221k(obj));
                return;
            case 11:
                throw new IllegalArgumentException("Method does not accept concrete type.");
            default:
                throw new IllegalArgumentException("Unknown type = " + i);
        }
    }

    /* renamed from: k */
    public static final void m33796k(StringBuilder sb, FastJsonResponse.Field field, Object obj) {
        if (field.f22366e) {
            ArrayList arrayList = (ArrayList) obj;
            sb.append("[");
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                if (i != 0) {
                    sb.append(",");
                }
                m33795j(sb, field.f22365d, arrayList.get(i));
            }
            sb.append("]");
            return;
        }
        m33795j(sb, field.f22365d, obj);
    }

    /* renamed from: a */
    public final Map<String, FastJsonResponse.Field<?, ?>> mo30696a() {
        zan zan = this.f22376g;
        if (zan == null) {
            return null;
        }
        return zan.mo30724s1((String) cu4.m43221k(this.f22377k));
    }

    /* renamed from: c */
    public final Object mo30698c(String str) {
        throw new UnsupportedOperationException("Converting to JSON does not require this method.");
    }

    /* renamed from: e */
    public final boolean mo30700e(String str) {
        throw new UnsupportedOperationException("Converting to JSON does not require this method.");
    }

    /* renamed from: h */
    public final Parcel mo30714h() {
        int i = this.f22378r;
        if (i == 0) {
            int a = rk5.m51125a(this.f22374d);
            this.f22379s = a;
            rk5.m51126b(this.f22374d, a);
            this.f22378r = 2;
        } else if (i == 1) {
            rk5.m51126b(this.f22374d, this.f22379s);
            this.f22378r = 2;
        }
        return this.f22374d;
    }

    /* renamed from: i */
    public final void mo30715i(StringBuilder sb, Map map, Parcel parcel) {
        SparseArray sparseArray = new SparseArray();
        for (Map.Entry entry : map.entrySet()) {
            sparseArray.put(((FastJsonResponse.Field) entry.getValue()).mo30702r1(), entry);
        }
        sb.append('{');
        int J = SafeParcelReader.m33730J(parcel);
        boolean z = false;
        while (parcel.dataPosition() < J) {
            int C = SafeParcelReader.m33723C(parcel);
            Map.Entry entry2 = (Map.Entry) sparseArray.get(SafeParcelReader.m33754v(C));
            if (entry2 != null) {
                if (z) {
                    sb.append(",");
                }
                FastJsonResponse.Field field = (FastJsonResponse.Field) entry2.getValue();
                sb.append("\"");
                sb.append((String) entry2.getKey());
                sb.append("\":");
                if (field.mo30710y1()) {
                    int i = field.f22367g;
                    switch (i) {
                        case 0:
                            m33796k(sb, field, FastJsonResponse.m33777f(field, Integer.valueOf(SafeParcelReader.m33725E(parcel, C))));
                            break;
                        case 1:
                            m33796k(sb, field, FastJsonResponse.m33777f(field, SafeParcelReader.m33735c(parcel, C)));
                            break;
                        case 2:
                            m33796k(sb, field, FastJsonResponse.m33777f(field, Long.valueOf(SafeParcelReader.m33726F(parcel, C))));
                            break;
                        case 3:
                            m33796k(sb, field, FastJsonResponse.m33777f(field, Float.valueOf(SafeParcelReader.m33721A(parcel, C))));
                            break;
                        case 4:
                            m33796k(sb, field, FastJsonResponse.m33777f(field, Double.valueOf(SafeParcelReader.m33757y(parcel, C))));
                            break;
                        case 5:
                            m33796k(sb, field, FastJsonResponse.m33777f(field, SafeParcelReader.m33733a(parcel, C)));
                            break;
                        case 6:
                            m33796k(sb, field, FastJsonResponse.m33777f(field, Boolean.valueOf(SafeParcelReader.m33755w(parcel, C))));
                            break;
                        case 7:
                            m33796k(sb, field, FastJsonResponse.m33777f(field, SafeParcelReader.m33748p(parcel, C)));
                            break;
                        case 8:
                        case 9:
                            m33796k(sb, field, FastJsonResponse.m33777f(field, SafeParcelReader.m33739g(parcel, C)));
                            break;
                        case 10:
                            Bundle f = SafeParcelReader.m33738f(parcel, C);
                            HashMap hashMap = new HashMap();
                            for (String next : f.keySet()) {
                                hashMap.put(next, (String) cu4.m43221k(f.getString(next)));
                            }
                            m33796k(sb, field, FastJsonResponse.m33777f(field, hashMap));
                            break;
                        case 11:
                            throw new IllegalArgumentException("Method does not accept concrete type.");
                        default:
                            throw new IllegalArgumentException("Unknown field out type = " + i);
                    }
                } else if (field.f22368k) {
                    sb.append("[");
                    switch (field.f22367g) {
                        case 0:
                            C6441rq.m51223f(sb, SafeParcelReader.m33743k(parcel, C));
                            break;
                        case 1:
                            C6441rq.m51225h(sb, SafeParcelReader.m33736d(parcel, C));
                            break;
                        case 2:
                            C6441rq.m51224g(sb, SafeParcelReader.m33744l(parcel, C));
                            break;
                        case 3:
                            C6441rq.m51222e(sb, SafeParcelReader.m33742j(parcel, C));
                            break;
                        case 4:
                            C6441rq.m51221d(sb, SafeParcelReader.m33741i(parcel, C));
                            break;
                        case 5:
                            C6441rq.m51225h(sb, SafeParcelReader.m33734b(parcel, C));
                            break;
                        case 6:
                            C6441rq.m51226i(sb, SafeParcelReader.m33737e(parcel, C));
                            break;
                        case 7:
                            C6441rq.m51227j(sb, SafeParcelReader.m33749q(parcel, C));
                            break;
                        case 8:
                        case 9:
                        case 10:
                            throw new UnsupportedOperationException("List of type BASE64, BASE64_URL_SAFE, or STRING_MAP is not supported");
                        case 11:
                            Parcel[] n = SafeParcelReader.m33746n(parcel, C);
                            int length = n.length;
                            for (int i2 = 0; i2 < length; i2++) {
                                if (i2 > 0) {
                                    sb.append(",");
                                }
                                n[i2].setDataPosition(0);
                                mo30715i(sb, field.mo30707w1(), n[i2]);
                            }
                            break;
                        default:
                            throw new IllegalStateException("Unknown field type out.");
                    }
                    sb.append("]");
                } else {
                    switch (field.f22367g) {
                        case 0:
                            sb.append(SafeParcelReader.m33725E(parcel, C));
                            break;
                        case 1:
                            sb.append(SafeParcelReader.m33735c(parcel, C));
                            break;
                        case 2:
                            sb.append(SafeParcelReader.m33726F(parcel, C));
                            break;
                        case 3:
                            sb.append(SafeParcelReader.m33721A(parcel, C));
                            break;
                        case 4:
                            sb.append(SafeParcelReader.m33757y(parcel, C));
                            break;
                        case 5:
                            sb.append(SafeParcelReader.m33733a(parcel, C));
                            break;
                        case 6:
                            sb.append(SafeParcelReader.m33755w(parcel, C));
                            break;
                        case 7:
                            String p = SafeParcelReader.m33748p(parcel, C);
                            sb.append("\"");
                            sb.append(j73.m46161a(p));
                            sb.append("\"");
                            break;
                        case 8:
                            byte[] g = SafeParcelReader.m33739g(parcel, C);
                            sb.append("\"");
                            sb.append(C6585ux.m53029a(g));
                            sb.append("\"");
                            break;
                        case 9:
                            byte[] g2 = SafeParcelReader.m33739g(parcel, C);
                            sb.append("\"");
                            sb.append(C6585ux.m53030b(g2));
                            sb.append("\"");
                            break;
                        case 10:
                            Bundle f2 = SafeParcelReader.m33738f(parcel, C);
                            Set<String> keySet = f2.keySet();
                            sb.append("{");
                            boolean z2 = true;
                            for (String next2 : keySet) {
                                if (!z2) {
                                    sb.append(",");
                                }
                                sb.append("\"");
                                sb.append(next2);
                                sb.append("\":\"");
                                sb.append(j73.m46161a(f2.getString(next2)));
                                sb.append("\"");
                                z2 = false;
                            }
                            sb.append("}");
                            break;
                        case 11:
                            Parcel m = SafeParcelReader.m33745m(parcel, C);
                            m.setDataPosition(0);
                            mo30715i(sb, field.mo30707w1(), m);
                            break;
                        default:
                            throw new IllegalStateException("Unknown field type out");
                    }
                }
                z = true;
            }
        }
        if (parcel.dataPosition() == J) {
            sb.append('}');
            return;
        }
        throw new SafeParcelReader.ParseException("Overread allowed size end=" + J, parcel);
    }

    public final String toString() {
        cu4.m43222l(this.f22376g, "Cannot convert to JSON on client side.");
        Parcel h = mo30714h();
        h.setDataPosition(0);
        StringBuilder sb = new StringBuilder(100);
        mo30715i(sb, (Map) cu4.m43221k(this.f22376g.mo30724s1((String) cu4.m43221k(this.f22377k))), h);
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        zan zan;
        int a = rk5.m51125a(parcel);
        rk5.m51137m(parcel, 1, this.f22373a);
        rk5.m51141q(parcel, 2, mo30714h(), false);
        int i2 = this.f22375e;
        if (i2 == 0) {
            zan = null;
        } else if (i2 != 1) {
            zan = this.f22376g;
        } else {
            zan = this.f22376g;
        }
        rk5.m51142r(parcel, 3, zan, i, false);
        rk5.m51126b(parcel, a);
    }
}
