package p000;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.Base64;
import android.util.Xml;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: m72 */
/* compiled from: FontResourcesParserCompat */
public class m72 {

    /* renamed from: m72$a */
    /* compiled from: FontResourcesParserCompat */
    public static class C2806a {
        /* renamed from: a */
        public static int m22047a(TypedArray typedArray, int i) {
            return typedArray.getType(i);
        }
    }

    /* renamed from: m72$b */
    /* compiled from: FontResourcesParserCompat */
    public interface C2807b {
    }

    /* renamed from: m72$c */
    /* compiled from: FontResourcesParserCompat */
    public static final class C2808c implements C2807b {

        /* renamed from: a */
        public final C2809d[] f14841a;

        public C2808c(C2809d[] dVarArr) {
            this.f14841a = dVarArr;
        }

        /* renamed from: a */
        public C2809d[] mo23051a() {
            return this.f14841a;
        }
    }

    /* renamed from: m72$d */
    /* compiled from: FontResourcesParserCompat */
    public static final class C2809d {

        /* renamed from: a */
        public final String f14842a;

        /* renamed from: b */
        public final int f14843b;

        /* renamed from: c */
        public final boolean f14844c;

        /* renamed from: d */
        public final String f14845d;

        /* renamed from: e */
        public final int f14846e;

        /* renamed from: f */
        public final int f14847f;

        public C2809d(String str, int i, boolean z, String str2, int i2, int i3) {
            this.f14842a = str;
            this.f14843b = i;
            this.f14844c = z;
            this.f14845d = str2;
            this.f14846e = i2;
            this.f14847f = i3;
        }

        /* renamed from: a */
        public String mo23052a() {
            return this.f14842a;
        }

        /* renamed from: b */
        public int mo23053b() {
            return this.f14847f;
        }

        /* renamed from: c */
        public int mo23054c() {
            return this.f14846e;
        }

        /* renamed from: d */
        public String mo23055d() {
            return this.f14845d;
        }

        /* renamed from: e */
        public int mo23056e() {
            return this.f14843b;
        }

        /* renamed from: f */
        public boolean mo23057f() {
            return this.f14844c;
        }
    }

    /* renamed from: m72$e */
    /* compiled from: FontResourcesParserCompat */
    public static final class C2810e implements C2807b {

        /* renamed from: a */
        public final j72 f14848a;

        /* renamed from: b */
        public final int f14849b;

        /* renamed from: c */
        public final int f14850c;

        /* renamed from: d */
        public final String f14851d;

        public C2810e(j72 j72, int i, int i2, String str) {
            this.f14848a = j72;
            this.f14850c = i;
            this.f14849b = i2;
            this.f14851d = str;
        }

        /* renamed from: a */
        public int mo23058a() {
            return this.f14850c;
        }

        /* renamed from: b */
        public j72 mo23059b() {
            return this.f14848a;
        }

        /* renamed from: c */
        public String mo23060c() {
            return this.f14851d;
        }

        /* renamed from: d */
        public int mo23061d() {
            return this.f14849b;
        }
    }

    /* renamed from: a */
    public static int m22039a(TypedArray typedArray, int i) {
        return C2806a.m22047a(typedArray, i);
    }

    /*  JADX ERROR: StackOverflow in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: 
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* renamed from: b */
    public static p000.m72.C2807b m22040b(org.xmlpull.v1.XmlPullParser r3, android.content.res.Resources r4) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
        L_0x0000:
            int r0 = r3.next()
            r1 = 2
            if (r0 == r1) goto L_0x000b
            r2 = 1
            if (r0 == r2) goto L_0x000b
            goto L_0x0000
        L_0x000b:
            if (r0 != r1) goto L_0x0012
            m72$b r3 = m22042d(r3, r4)
            return r3
        L_0x0012:
            org.xmlpull.v1.XmlPullParserException r3 = new org.xmlpull.v1.XmlPullParserException
            java.lang.String r4 = "No start tag found"
            r3.<init>(r4)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.m72.m22040b(org.xmlpull.v1.XmlPullParser, android.content.res.Resources):m72$b");
    }

    /* renamed from: c */
    public static List<List<byte[]>> m22041c(Resources resources, int i) {
        if (i == 0) {
            return Collections.emptyList();
        }
        TypedArray obtainTypedArray = resources.obtainTypedArray(i);
        try {
            if (obtainTypedArray.length() == 0) {
                return Collections.emptyList();
            }
            ArrayList arrayList = new ArrayList();
            if (m22039a(obtainTypedArray, 0) == 1) {
                for (int i2 = 0; i2 < obtainTypedArray.length(); i2++) {
                    int resourceId = obtainTypedArray.getResourceId(i2, 0);
                    if (resourceId != 0) {
                        arrayList.add(m22046h(resources.getStringArray(resourceId)));
                    }
                }
            } else {
                arrayList.add(m22046h(resources.getStringArray(i)));
            }
            obtainTypedArray.recycle();
            return arrayList;
        } finally {
            obtainTypedArray.recycle();
        }
    }

    /* renamed from: d */
    public static C2807b m22042d(XmlPullParser xmlPullParser, Resources resources) throws XmlPullParserException, IOException {
        xmlPullParser.require(2, (String) null, "font-family");
        if (xmlPullParser.getName().equals("font-family")) {
            return m22043e(xmlPullParser, resources);
        }
        m22045g(xmlPullParser);
        return null;
    }

    /* renamed from: e */
    public static C2807b m22043e(XmlPullParser xmlPullParser, Resources resources) throws XmlPullParserException, IOException {
        TypedArray obtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), e65.FontFamily);
        String string = obtainAttributes.getString(e65.FontFamily_fontProviderAuthority);
        String string2 = obtainAttributes.getString(e65.FontFamily_fontProviderPackage);
        String string3 = obtainAttributes.getString(e65.FontFamily_fontProviderQuery);
        int resourceId = obtainAttributes.getResourceId(e65.FontFamily_fontProviderCerts, 0);
        int integer = obtainAttributes.getInteger(e65.FontFamily_fontProviderFetchStrategy, 1);
        int integer2 = obtainAttributes.getInteger(e65.FontFamily_fontProviderFetchTimeout, 500);
        String string4 = obtainAttributes.getString(e65.FontFamily_fontProviderSystemFontFamily);
        obtainAttributes.recycle();
        if (string == null || string2 == null || string3 == null) {
            ArrayList arrayList = new ArrayList();
            while (xmlPullParser.next() != 3) {
                if (xmlPullParser.getEventType() == 2) {
                    if (xmlPullParser.getName().equals("font")) {
                        arrayList.add(m22044f(xmlPullParser, resources));
                    } else {
                        m22045g(xmlPullParser);
                    }
                }
            }
            if (arrayList.isEmpty()) {
                return null;
            }
            return new C2808c((C2809d[]) arrayList.toArray(new C2809d[0]));
        }
        while (xmlPullParser.next() != 3) {
            m22045g(xmlPullParser);
        }
        return new C2810e(new j72(string, string2, string3, m22041c(resources, resourceId)), integer, integer2, string4);
    }

    /* renamed from: f */
    public static C2809d m22044f(XmlPullParser xmlPullParser, Resources resources) throws XmlPullParserException, IOException {
        boolean z;
        TypedArray obtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), e65.FontFamilyFont);
        int i = e65.FontFamilyFont_fontWeight;
        if (!obtainAttributes.hasValue(i)) {
            i = e65.FontFamilyFont_android_fontWeight;
        }
        int i2 = obtainAttributes.getInt(i, 400);
        int i3 = e65.FontFamilyFont_fontStyle;
        if (!obtainAttributes.hasValue(i3)) {
            i3 = e65.FontFamilyFont_android_fontStyle;
        }
        if (1 == obtainAttributes.getInt(i3, 0)) {
            z = true;
        } else {
            z = false;
        }
        int i4 = e65.FontFamilyFont_ttcIndex;
        if (!obtainAttributes.hasValue(i4)) {
            i4 = e65.FontFamilyFont_android_ttcIndex;
        }
        int i5 = e65.FontFamilyFont_fontVariationSettings;
        if (!obtainAttributes.hasValue(i5)) {
            i5 = e65.FontFamilyFont_android_fontVariationSettings;
        }
        String string = obtainAttributes.getString(i5);
        int i6 = obtainAttributes.getInt(i4, 0);
        int i7 = e65.FontFamilyFont_font;
        if (!obtainAttributes.hasValue(i7)) {
            i7 = e65.FontFamilyFont_android_font;
        }
        int resourceId = obtainAttributes.getResourceId(i7, 0);
        String string2 = obtainAttributes.getString(i7);
        obtainAttributes.recycle();
        while (xmlPullParser.next() != 3) {
            m22045g(xmlPullParser);
        }
        return new C2809d(string2, i2, z, string, i6, resourceId);
    }

    /* renamed from: g */
    public static void m22045g(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        int i = 1;
        while (i > 0) {
            int next = xmlPullParser.next();
            if (next == 2) {
                i++;
            } else if (next == 3) {
                i--;
            }
        }
    }

    /* renamed from: h */
    public static List<byte[]> m22046h(String[] strArr) {
        ArrayList arrayList = new ArrayList();
        for (String decode : strArr) {
            arrayList.add(Base64.decode(decode, 0));
        }
        return arrayList;
    }
}
