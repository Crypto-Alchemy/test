package p000;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.telephony.PhoneNumberUtils;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.MultiFormatWriter;
import com.google.zxing.common.BitMatrix;
import java.util.EnumMap;
import java.util.HashSet;
import org.web3j.ens.contracts.generated.PublicResolver;

/* renamed from: fz4 */
/* compiled from: QRGEncoder */
public class fz4 {

    /* renamed from: a */
    public int f12130a = -1;

    /* renamed from: b */
    public int f12131b = -16777216;

    /* renamed from: c */
    public int f12132c;

    /* renamed from: d */
    public String f12133d = null;

    /* renamed from: e */
    public String f12134e = null;

    /* renamed from: f */
    public String f12135f = null;

    /* renamed from: g */
    public BarcodeFormat f12136g = null;

    /* renamed from: h */
    public boolean f12137h = false;

    public fz4(String str, Bundle bundle, String str2, int i) {
        this.f12132c = i;
        this.f12137h = mo20299a(str, bundle, str2);
    }

    /* renamed from: a */
    public final boolean mo20299a(String str, Bundle bundle, String str2) {
        BarcodeFormat barcodeFormat = BarcodeFormat.QR_CODE;
        this.f12136g = barcodeFormat;
        this.f12136g = barcodeFormat;
        mo20300b(str, bundle, str2);
        String str3 = this.f12133d;
        if (str3 == null || str3.length() <= 0) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public final void mo20300b(String str, Bundle bundle, String str2) {
        str2.hashCode();
        int i = 0;
        char c = 65535;
        switch (str2.hashCode()) {
            case -1309271157:
                if (str2.equals("PHONE_TYPE")) {
                    c = 0;
                    break;
                }
                break;
            case -670199783:
                if (str2.equals("CONTACT_TYPE")) {
                    c = 1;
                    break;
                }
                break;
            case 709220992:
                if (str2.equals("SMS_TYPE")) {
                    c = 2;
                    break;
                }
                break;
            case 1349204356:
                if (str2.equals("LOCATION_TYPE")) {
                    c = 3;
                    break;
                }
                break;
            case 1778595596:
                if (str2.equals("TEXT_TYPE")) {
                    c = 4;
                    break;
                }
                break;
            case 1833351709:
                if (str2.equals("EMAIL_TYPE")) {
                    c = 5;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                String h = mo20306h(str);
                if (h != null) {
                    this.f12133d = "tel:" + h;
                    this.f12134e = PhoneNumberUtils.formatNumber(h);
                    this.f12135f = "Phone";
                    return;
                }
                return;
            case 1:
                if (bundle != null) {
                    StringBuilder sb = new StringBuilder(100);
                    StringBuilder sb2 = new StringBuilder(100);
                    sb.append("BEGIN:VCARD\n");
                    String h2 = mo20306h(bundle.getString(PublicResolver.FUNC_NAME));
                    if (h2 != null) {
                        sb.append("N:");
                        sb.append(mo20301c(h2));
                        sb.append(';');
                        sb2.append(h2);
                        sb.append("\n");
                    }
                    String h3 = mo20306h(bundle.getString("postal"));
                    if (h3 != null) {
                        sb.append("ADR:");
                        sb.append(mo20301c(h3));
                        sb.append("\n");
                        sb2.append(10);
                        sb2.append(h3);
                    }
                    HashSet<String> hashSet = new HashSet<>(ez4.f11466a.length);
                    int i2 = 0;
                    while (true) {
                        String[] strArr = ez4.f11466a;
                        if (i2 < strArr.length) {
                            String h4 = mo20306h(bundle.getString(strArr[i2]));
                            if (h4 != null) {
                                hashSet.add(h4);
                            }
                            i2++;
                        } else {
                            for (String str3 : hashSet) {
                                sb.append("TEL:");
                                sb.append(mo20301c(str3));
                                sb.append("\n");
                                sb2.append(10);
                                sb2.append(PhoneNumberUtils.formatNumber(str3));
                            }
                            HashSet<String> hashSet2 = new HashSet<>(ez4.f11468c.length);
                            while (true) {
                                String[] strArr2 = ez4.f11468c;
                                if (i < strArr2.length) {
                                    String h5 = mo20306h(bundle.getString(strArr2[i]));
                                    if (h5 != null) {
                                        hashSet2.add(h5);
                                    }
                                    i++;
                                } else {
                                    for (String str4 : hashSet2) {
                                        sb.append("EMAIL:");
                                        sb.append(mo20301c(str4));
                                        sb.append("\n");
                                        sb2.append(10);
                                        sb2.append(str4);
                                    }
                                    String h6 = mo20306h(bundle.getString("company"));
                                    if (h6 != null) {
                                        sb.append("ORG:");
                                        sb.append(h6);
                                        sb.append("\n");
                                        sb2.append(10);
                                        sb2.append(h6);
                                    }
                                    String h7 = mo20306h(bundle.getString("data"));
                                    if (h7 != null) {
                                        sb.append("URL:");
                                        sb.append(mo20301c(h7));
                                        sb.append("\n");
                                        sb2.append(10);
                                        sb2.append(h7);
                                    }
                                    String h8 = mo20306h(bundle.getString("notes"));
                                    if (h8 != null) {
                                        sb.append("NOTE:");
                                        sb.append(mo20301c(h8));
                                        sb.append("\n");
                                        sb2.append(10);
                                        sb2.append(h8);
                                    }
                                    if (sb2.length() > 0) {
                                        sb.append("END:VCARD");
                                        sb.append(';');
                                        this.f12133d = sb.toString();
                                        this.f12134e = sb2.toString();
                                        this.f12135f = "Contact";
                                        return;
                                    }
                                    this.f12133d = null;
                                    this.f12134e = null;
                                    return;
                                }
                            }
                        }
                    }
                } else {
                    return;
                }
            case 2:
                String h9 = mo20306h(str);
                if (h9 != null) {
                    this.f12133d = "sms:" + h9;
                    this.f12134e = PhoneNumberUtils.formatNumber(h9);
                    this.f12135f = "SMS";
                    return;
                }
                return;
            case 3:
                if (bundle != null) {
                    float f = bundle.getFloat("LAT", Float.MAX_VALUE);
                    float f2 = bundle.getFloat("LONG", Float.MAX_VALUE);
                    if (f != Float.MAX_VALUE && f2 != Float.MAX_VALUE) {
                        this.f12133d = "geo:" + f + ',' + f2;
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(f);
                        sb3.append(",");
                        sb3.append(f2);
                        this.f12134e = sb3.toString();
                        this.f12135f = "Location";
                        return;
                    }
                    return;
                }
                return;
            case 4:
                if (str != null && str.length() > 0) {
                    this.f12133d = str;
                    this.f12134e = str;
                    this.f12135f = "Text";
                    return;
                }
                return;
            case 5:
                String h10 = mo20306h(str);
                if (h10 != null) {
                    this.f12133d = "mailto:" + h10;
                    this.f12134e = h10;
                    this.f12135f = "E-Mail";
                    return;
                }
                return;
            default:
                return;
        }
    }

    /* renamed from: c */
    public final String mo20301c(String str) {
        if (str == null) {
            return str;
        }
        if (str.indexOf(58) < 0 && str.indexOf(59) < 0) {
            return str;
        }
        int length = str.length();
        StringBuilder sb = new StringBuilder(length);
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (charAt == ':' || charAt == ';') {
                sb.append('\\');
            }
            sb.append(charAt);
        }
        return sb.toString();
    }

    /* renamed from: d */
    public Bitmap mo20302d(int i) {
        int i2;
        if (!this.f12137h) {
            return null;
        }
        try {
            EnumMap enumMap = new EnumMap(EncodeHintType.class);
            String g = mo20305g(this.f12133d);
            if (g != null) {
                enumMap.put(EncodeHintType.CHARACTER_SET, g);
            }
            enumMap.put(EncodeHintType.MARGIN, Integer.valueOf(i));
            MultiFormatWriter multiFormatWriter = new MultiFormatWriter();
            String str = this.f12133d;
            BarcodeFormat barcodeFormat = this.f12136g;
            int i3 = this.f12132c;
            BitMatrix encode = multiFormatWriter.encode(str, barcodeFormat, i3, i3, enumMap);
            int width = encode.getWidth();
            int height = encode.getHeight();
            int[] iArr = new int[(width * height)];
            for (int i4 = 0; i4 < height; i4++) {
                int i5 = i4 * width;
                for (int i6 = 0; i6 < width; i6++) {
                    int i7 = i5 + i6;
                    if (encode.get(i6, i4)) {
                        i2 = mo20303e();
                    } else {
                        i2 = mo20304f();
                    }
                    iArr[i7] = i2;
                }
            }
            Bitmap createBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
            createBitmap.setPixels(iArr, 0, width, 0, 0, width, height);
            return createBitmap;
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: e */
    public int mo20303e() {
        return this.f12131b;
    }

    /* renamed from: f */
    public int mo20304f() {
        return this.f12130a;
    }

    /* renamed from: g */
    public final String mo20305g(CharSequence charSequence) {
        for (int i = 0; i < charSequence.length(); i++) {
            if (charSequence.charAt(i) > 255) {
                return "UTF-8";
            }
        }
        return null;
    }

    /* renamed from: h */
    public final String mo20306h(String str) {
        if (str == null) {
            return null;
        }
        String trim = str.trim();
        if (trim.length() == 0) {
            return null;
        }
        return trim;
    }
}
