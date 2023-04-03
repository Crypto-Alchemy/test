package p000;

import android.text.Layout;
import androidx.media3.extractor.text.SubtitleDecoderException;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* renamed from: ly6 */
/* compiled from: TtmlDecoder */
public final class ly6 extends z26 {

    /* renamed from: p */
    public static final Pattern f14747p = Pattern.compile("^([0-9][0-9]+):([0-9][0-9]):([0-9][0-9])(?:(\\.[0-9]+)|:([0-9][0-9])(?:\\.([0-9]+))?)?$");

    /* renamed from: q */
    public static final Pattern f14748q = Pattern.compile("^([0-9]+(?:\\.[0-9]+)?)(h|m|s|ms|f|t)$");

    /* renamed from: r */
    public static final Pattern f14749r = Pattern.compile("^(([0-9]*.)?[0-9]+)(px|em|%)$");

    /* renamed from: s */
    public static final Pattern f14750s = Pattern.compile("^([-+]?\\d+\\.?\\d*?)%$");

    /* renamed from: t */
    public static final Pattern f14751t = Pattern.compile("^(\\d+\\.?\\d*?)% (\\d+\\.?\\d*?)%$");

    /* renamed from: u */
    public static final Pattern f14752u = Pattern.compile("^(\\d+\\.?\\d*?)px (\\d+\\.?\\d*?)px$");

    /* renamed from: v */
    public static final Pattern f14753v = Pattern.compile("^(\\d+) (\\d+)$");

    /* renamed from: w */
    public static final C2794b f14754w = new C2794b(30.0f, 1, 1);

    /* renamed from: x */
    public static final C2793a f14755x = new C2793a(32, 15);

    /* renamed from: o */
    public final XmlPullParserFactory f14756o;

    /* renamed from: ly6$a */
    /* compiled from: TtmlDecoder */
    public static final class C2793a {

        /* renamed from: a */
        public final int f14757a;

        /* renamed from: b */
        public final int f14758b;

        public C2793a(int i, int i2) {
            this.f14757a = i;
            this.f14758b = i2;
        }
    }

    /* renamed from: ly6$b */
    /* compiled from: TtmlDecoder */
    public static final class C2794b {

        /* renamed from: a */
        public final float f14759a;

        /* renamed from: b */
        public final int f14760b;

        /* renamed from: c */
        public final int f14761c;

        public C2794b(float f, int i, int i2) {
            this.f14759a = f;
            this.f14760b = i;
            this.f14761c = i2;
        }
    }

    /* renamed from: ly6$c */
    /* compiled from: TtmlDecoder */
    public static final class C2795c {

        /* renamed from: a */
        public final int f14762a;

        /* renamed from: b */
        public final int f14763b;

        public C2795c(int i, int i2) {
            this.f14762a = i;
            this.f14763b = i2;
        }
    }

    public ly6() {
        super("TtmlDecoder");
        try {
            XmlPullParserFactory newInstance = XmlPullParserFactory.newInstance();
            this.f14756o = newInstance;
            newInstance.setNamespaceAware(true);
        } catch (XmlPullParserException e) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e);
        }
    }

    /* renamed from: C */
    public static py6 m21897C(py6 py6) {
        if (py6 == null) {
            return new py6();
        }
        return py6;
    }

    /* renamed from: D */
    public static boolean m21898D(String str) {
        if (str.equals("tt") || str.equals("head") || str.equals("body") || str.equals("div") || str.equals("p") || str.equals("span") || str.equals("br") || str.equals("style") || str.equals("styling") || str.equals("layout") || str.equals("region") || str.equals("metadata") || str.equals("image") || str.equals("data") || str.equals("information")) {
            return true;
        }
        return false;
    }

    /* renamed from: E */
    public static Layout.Alignment m21899E(String str) {
        String e = C5876gr.m44841e(str);
        e.hashCode();
        char c = 65535;
        switch (e.hashCode()) {
            case -1364013995:
                if (e.equals("center")) {
                    c = 0;
                    break;
                }
                break;
            case 100571:
                if (e.equals("end")) {
                    c = 1;
                    break;
                }
                break;
            case 3317767:
                if (e.equals("left")) {
                    c = 2;
                    break;
                }
                break;
            case 108511772:
                if (e.equals("right")) {
                    c = 3;
                    break;
                }
                break;
            case 109757538:
                if (e.equals("start")) {
                    c = 4;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return Layout.Alignment.ALIGN_CENTER;
            case 1:
            case 3:
                return Layout.Alignment.ALIGN_OPPOSITE;
            case 2:
            case 4:
                return Layout.Alignment.ALIGN_NORMAL;
            default:
                return null;
        }
    }

    /* renamed from: F */
    public static C2793a m21900F(XmlPullParser xmlPullParser, C2793a aVar) throws SubtitleDecoderException {
        String attributeValue = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "cellResolution");
        if (attributeValue == null) {
            return aVar;
        }
        Matcher matcher = f14753v.matcher(attributeValue);
        if (!matcher.matches()) {
            gk3.m18132i("TtmlDecoder", "Ignoring malformed cell resolution: " + attributeValue);
            return aVar;
        }
        try {
            int parseInt = Integer.parseInt((String) C2725kr.m20985e(matcher.group(1)));
            int parseInt2 = Integer.parseInt((String) C2725kr.m20985e(matcher.group(2)));
            if (parseInt != 0 && parseInt2 != 0) {
                return new C2793a(parseInt, parseInt2);
            }
            throw new SubtitleDecoderException("Invalid cell resolution " + parseInt + " " + parseInt2);
        } catch (NumberFormatException unused) {
            gk3.m18132i("TtmlDecoder", "Ignoring malformed cell resolution: " + attributeValue);
            return aVar;
        }
    }

    /* renamed from: G */
    public static void m21901G(String str, py6 py6) throws SubtitleDecoderException {
        Matcher matcher;
        String[] L0 = w67.m29317L0(str, "\\s+");
        if (L0.length == 1) {
            matcher = f14749r.matcher(str);
        } else if (L0.length == 2) {
            matcher = f14749r.matcher(L0[1]);
            gk3.m18132i("TtmlDecoder", "Multiple values in fontSize attribute. Picking the second value for vertical font size and ignoring the first.");
        } else {
            throw new SubtitleDecoderException("Invalid number of entries for fontSize: " + L0.length + ".");
        }
        if (matcher.matches()) {
            String str2 = (String) C2725kr.m20985e(matcher.group(3));
            str2.hashCode();
            char c = 65535;
            switch (str2.hashCode()) {
                case 37:
                    if (str2.equals("%")) {
                        c = 0;
                        break;
                    }
                    break;
                case 3240:
                    if (str2.equals("em")) {
                        c = 1;
                        break;
                    }
                    break;
                case 3592:
                    if (str2.equals("px")) {
                        c = 2;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    py6.mo24865z(3);
                    break;
                case 1:
                    py6.mo24865z(2);
                    break;
                case 2:
                    py6.mo24865z(1);
                    break;
                default:
                    throw new SubtitleDecoderException("Invalid unit for fontSize: '" + str2 + "'.");
            }
            py6.mo24864y(Float.parseFloat((String) C2725kr.m20985e(matcher.group(1))));
            return;
        }
        throw new SubtitleDecoderException("Invalid expression for fontSize: '" + str + "'.");
    }

    /* renamed from: H */
    public static C2794b m21902H(XmlPullParser xmlPullParser) throws SubtitleDecoderException {
        int i;
        String attributeValue = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "frameRate");
        if (attributeValue != null) {
            i = Integer.parseInt(attributeValue);
        } else {
            i = 30;
        }
        float f = 1.0f;
        String attributeValue2 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "frameRateMultiplier");
        if (attributeValue2 != null) {
            String[] L0 = w67.m29317L0(attributeValue2, " ");
            if (L0.length == 2) {
                f = ((float) Integer.parseInt(L0[0])) / ((float) Integer.parseInt(L0[1]));
            } else {
                throw new SubtitleDecoderException("frameRateMultiplier doesn't have 2 parts");
            }
        }
        C2794b bVar = f14754w;
        int i2 = bVar.f14760b;
        String attributeValue3 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "subFrameRate");
        if (attributeValue3 != null) {
            i2 = Integer.parseInt(attributeValue3);
        }
        int i3 = bVar.f14761c;
        String attributeValue4 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "tickRate");
        if (attributeValue4 != null) {
            i3 = Integer.parseInt(attributeValue4);
        }
        return new C2794b(((float) i) * f, i2, i3);
    }

    /* renamed from: I */
    public static Map<String, py6> m21903I(XmlPullParser xmlPullParser, Map<String, py6> map, C2793a aVar, C2795c cVar, Map<String, ny6> map2, Map<String, String> map3) throws IOException, XmlPullParserException {
        do {
            xmlPullParser.next();
            if (fp7.m17186f(xmlPullParser, "style")) {
                String a = fp7.m17181a(xmlPullParser, "style");
                py6 N = m21908N(xmlPullParser, new py6());
                if (a != null) {
                    for (String str : m21909O(a)) {
                        N.mo24840a(map.get(str));
                    }
                }
                String g = N.mo24846g();
                if (g != null) {
                    map.put(g, N);
                }
            } else if (fp7.m17186f(xmlPullParser, "region")) {
                ny6 L = m21906L(xmlPullParser, aVar, cVar);
                if (L != null) {
                    map2.put(L.f15727a, L);
                }
            } else if (fp7.m17186f(xmlPullParser, "metadata")) {
                m21904J(xmlPullParser, map3);
            }
        } while (!fp7.m17184d(xmlPullParser, "head"));
        return map;
    }

    /* renamed from: J */
    public static void m21904J(XmlPullParser xmlPullParser, Map<String, String> map) throws IOException, XmlPullParserException {
        String a;
        do {
            xmlPullParser.next();
            if (fp7.m17186f(xmlPullParser, "image") && (a = fp7.m17181a(xmlPullParser, "id")) != null) {
                map.put(a, xmlPullParser.nextText());
            }
        } while (!fp7.m17184d(xmlPullParser, "metadata"));
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: K */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p000.my6 m21905K(org.xmlpull.v1.XmlPullParser r19, p000.my6 r20, java.util.Map<java.lang.String, p000.ny6> r21, p000.ly6.C2794b r22) throws androidx.media3.extractor.text.SubtitleDecoderException {
        /*
            r0 = r19
            r9 = r20
            r1 = r22
            int r2 = r19.getAttributeCount()
            r3 = 0
            py6 r5 = m21908N(r0, r3)
            java.lang.String r8 = ""
            r11 = r3
            r10 = r8
            r12 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r14 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r16 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r8 = r11
            r3 = 0
        L_0x0024:
            if (r3 >= r2) goto L_0x00b4
            java.lang.String r4 = r0.getAttributeName(r3)
            java.lang.String r6 = r0.getAttributeValue(r3)
            r4.hashCode()
            int r18 = r4.hashCode()
            switch(r18) {
                case -934795532: goto L_0x0071;
                case 99841: goto L_0x0066;
                case 100571: goto L_0x005b;
                case 93616297: goto L_0x0050;
                case 109780401: goto L_0x0045;
                case 1292595405: goto L_0x003a;
                default: goto L_0x0038;
            }
        L_0x0038:
            r7 = -1
            goto L_0x007b
        L_0x003a:
            java.lang.String r7 = "backgroundImage"
            boolean r4 = r4.equals(r7)
            if (r4 != 0) goto L_0x0043
            goto L_0x0038
        L_0x0043:
            r7 = 5
            goto L_0x007b
        L_0x0045:
            java.lang.String r7 = "style"
            boolean r4 = r4.equals(r7)
            if (r4 != 0) goto L_0x004e
            goto L_0x0038
        L_0x004e:
            r7 = 4
            goto L_0x007b
        L_0x0050:
            java.lang.String r7 = "begin"
            boolean r4 = r4.equals(r7)
            if (r4 != 0) goto L_0x0059
            goto L_0x0038
        L_0x0059:
            r7 = 3
            goto L_0x007b
        L_0x005b:
            java.lang.String r7 = "end"
            boolean r4 = r4.equals(r7)
            if (r4 != 0) goto L_0x0064
            goto L_0x0038
        L_0x0064:
            r7 = 2
            goto L_0x007b
        L_0x0066:
            java.lang.String r7 = "dur"
            boolean r4 = r4.equals(r7)
            if (r4 != 0) goto L_0x006f
            goto L_0x0038
        L_0x006f:
            r7 = 1
            goto L_0x007b
        L_0x0071:
            java.lang.String r7 = "region"
            boolean r4 = r4.equals(r7)
            if (r4 != 0) goto L_0x007a
            goto L_0x0038
        L_0x007a:
            r7 = 0
        L_0x007b:
            switch(r7) {
                case 0: goto L_0x00a7;
                case 1: goto L_0x00a2;
                case 2: goto L_0x009d;
                case 3: goto L_0x0096;
                case 4: goto L_0x008d;
                case 5: goto L_0x007f;
                default: goto L_0x007e;
            }
        L_0x007e:
            goto L_0x009a
        L_0x007f:
            java.lang.String r4 = "#"
            boolean r4 = r6.startsWith(r4)
            if (r4 == 0) goto L_0x009a
            r4 = 1
            java.lang.String r11 = r6.substring(r4)
            goto L_0x009a
        L_0x008d:
            java.lang.String[] r4 = m21909O(r6)
            int r6 = r4.length
            if (r6 <= 0) goto L_0x009a
            r8 = r4
            goto L_0x009a
        L_0x0096:
            long r12 = m21910P(r6, r1)
        L_0x009a:
            r4 = r21
            goto L_0x00b0
        L_0x009d:
            long r14 = m21910P(r6, r1)
            goto L_0x009a
        L_0x00a2:
            long r16 = m21910P(r6, r1)
            goto L_0x009a
        L_0x00a7:
            r4 = r21
            boolean r7 = r4.containsKey(r6)
            if (r7 == 0) goto L_0x00b0
            r10 = r6
        L_0x00b0:
            int r3 = r3 + 1
            goto L_0x0024
        L_0x00b4:
            if (r9 == 0) goto L_0x00cc
            long r1 = r9.f15283d
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r6 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r6 == 0) goto L_0x00d1
            int r6 = (r12 > r3 ? 1 : (r12 == r3 ? 0 : -1))
            if (r6 == 0) goto L_0x00c6
            long r12 = r12 + r1
        L_0x00c6:
            int r6 = (r14 > r3 ? 1 : (r14 == r3 ? 0 : -1))
            if (r6 == 0) goto L_0x00d1
            long r14 = r14 + r1
            goto L_0x00d1
        L_0x00cc:
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L_0x00d1:
            r1 = r12
            int r6 = (r14 > r3 ? 1 : (r14 == r3 ? 0 : -1))
            if (r6 != 0) goto L_0x00e9
            int r6 = (r16 > r3 ? 1 : (r16 == r3 ? 0 : -1))
            if (r6 == 0) goto L_0x00df
            long r16 = r1 + r16
            r3 = r16
            goto L_0x00ea
        L_0x00df:
            if (r9 == 0) goto L_0x00e9
            long r6 = r9.f15284e
            int r3 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r3 == 0) goto L_0x00e9
            r3 = r6
            goto L_0x00ea
        L_0x00e9:
            r3 = r14
        L_0x00ea:
            java.lang.String r0 = r19.getName()
            r6 = r8
            r7 = r10
            r8 = r11
            r9 = r20
            my6 r0 = p000.my6.m22676c(r0, r1, r3, r5, r6, r7, r8, r9)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.ly6.m21905K(org.xmlpull.v1.XmlPullParser, my6, java.util.Map, ly6$b):my6");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x01a7, code lost:
        if (r0.equals("tb") == false) goto L_0x0189;
     */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x017a  */
    /* renamed from: L */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p000.ny6 m21906L(org.xmlpull.v1.XmlPullParser r17, p000.ly6.C2793a r18, p000.ly6.C2795c r19) {
        /*
            r0 = r17
            r1 = r19
            java.lang.String r2 = "id"
            java.lang.String r4 = p000.fp7.m17181a(r0, r2)
            r2 = 0
            if (r4 != 0) goto L_0x000e
            return r2
        L_0x000e:
            java.lang.String r3 = "origin"
            java.lang.String r3 = p000.fp7.m17181a(r0, r3)
            java.lang.String r5 = "TtmlDecoder"
            if (r3 == 0) goto L_0x0215
            java.util.regex.Pattern r6 = f14751t
            java.util.regex.Matcher r7 = r6.matcher(r3)
            java.util.regex.Pattern r8 = f14752u
            java.util.regex.Matcher r9 = r8.matcher(r3)
            boolean r10 = r7.matches()
            java.lang.String r11 = "Ignoring region with malformed origin: "
            java.lang.String r12 = "Ignoring region with missing tts:extent: "
            r13 = 1120403456(0x42c80000, float:100.0)
            r14 = 2
            r15 = 1
            if (r10 == 0) goto L_0x0069
            java.lang.String r9 = r7.group(r15)     // Catch:{ NumberFormatException -> 0x0056 }
            java.lang.Object r9 = p000.C2725kr.m20985e(r9)     // Catch:{ NumberFormatException -> 0x0056 }
            java.lang.String r9 = (java.lang.String) r9     // Catch:{ NumberFormatException -> 0x0056 }
            float r9 = java.lang.Float.parseFloat(r9)     // Catch:{ NumberFormatException -> 0x0056 }
            float r9 = r9 / r13
            java.lang.String r7 = r7.group(r14)     // Catch:{ NumberFormatException -> 0x0056 }
            java.lang.Object r7 = p000.C2725kr.m20985e(r7)     // Catch:{ NumberFormatException -> 0x0056 }
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ NumberFormatException -> 0x0056 }
            float r7 = java.lang.Float.parseFloat(r7)     // Catch:{ NumberFormatException -> 0x0056 }
            float r7 = r7 / r13
            r16 = r9
            r9 = r7
            r7 = r16
            goto L_0x00aa
        L_0x0056:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r11)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            p000.gk3.m18132i(r5, r0)
            return r2
        L_0x0069:
            boolean r7 = r9.matches()
            if (r7 == 0) goto L_0x0200
            if (r1 != 0) goto L_0x0084
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r12)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            p000.gk3.m18132i(r5, r0)
            return r2
        L_0x0084:
            java.lang.String r7 = r9.group(r15)     // Catch:{ NumberFormatException -> 0x01ed }
            java.lang.Object r7 = p000.C2725kr.m20985e(r7)     // Catch:{ NumberFormatException -> 0x01ed }
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ NumberFormatException -> 0x01ed }
            int r7 = java.lang.Integer.parseInt(r7)     // Catch:{ NumberFormatException -> 0x01ed }
            java.lang.String r9 = r9.group(r14)     // Catch:{ NumberFormatException -> 0x01ed }
            java.lang.Object r9 = p000.C2725kr.m20985e(r9)     // Catch:{ NumberFormatException -> 0x01ed }
            java.lang.String r9 = (java.lang.String) r9     // Catch:{ NumberFormatException -> 0x01ed }
            int r9 = java.lang.Integer.parseInt(r9)     // Catch:{ NumberFormatException -> 0x01ed }
            float r7 = (float) r7     // Catch:{ NumberFormatException -> 0x01ed }
            int r10 = r1.f14762a     // Catch:{ NumberFormatException -> 0x01ed }
            float r10 = (float) r10     // Catch:{ NumberFormatException -> 0x01ed }
            float r7 = r7 / r10
            float r9 = (float) r9     // Catch:{ NumberFormatException -> 0x01ed }
            int r10 = r1.f14763b     // Catch:{ NumberFormatException -> 0x01ed }
            float r10 = (float) r10
            float r9 = r9 / r10
        L_0x00aa:
            java.lang.String r10 = "extent"
            java.lang.String r10 = p000.fp7.m17181a(r0, r10)
            if (r10 == 0) goto L_0x01e7
            java.util.regex.Matcher r6 = r6.matcher(r10)
            java.util.regex.Matcher r8 = r8.matcher(r10)
            boolean r10 = r6.matches()
            java.lang.String r11 = "Ignoring region with malformed extent: "
            if (r10 == 0) goto L_0x00f5
            java.lang.String r1 = r6.group(r15)     // Catch:{ NumberFormatException -> 0x00e2 }
            java.lang.Object r1 = p000.C2725kr.m20985e(r1)     // Catch:{ NumberFormatException -> 0x00e2 }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ NumberFormatException -> 0x00e2 }
            float r1 = java.lang.Float.parseFloat(r1)     // Catch:{ NumberFormatException -> 0x00e2 }
            float r1 = r1 / r13
            java.lang.String r6 = r6.group(r14)     // Catch:{ NumberFormatException -> 0x00e2 }
            java.lang.Object r6 = p000.C2725kr.m20985e(r6)     // Catch:{ NumberFormatException -> 0x00e2 }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ NumberFormatException -> 0x00e2 }
            float r2 = java.lang.Float.parseFloat(r6)     // Catch:{ NumberFormatException -> 0x00e2 }
            float r2 = r2 / r13
            r10 = r2
            goto L_0x0138
        L_0x00e2:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r11)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            p000.gk3.m18132i(r5, r0)
            return r2
        L_0x00f5:
            boolean r6 = r8.matches()
            if (r6 == 0) goto L_0x01d2
            if (r1 != 0) goto L_0x0110
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r12)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            p000.gk3.m18132i(r5, r0)
            return r2
        L_0x0110:
            java.lang.String r6 = r8.group(r15)     // Catch:{ NumberFormatException -> 0x01bf }
            java.lang.Object r6 = p000.C2725kr.m20985e(r6)     // Catch:{ NumberFormatException -> 0x01bf }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ NumberFormatException -> 0x01bf }
            int r6 = java.lang.Integer.parseInt(r6)     // Catch:{ NumberFormatException -> 0x01bf }
            java.lang.String r8 = r8.group(r14)     // Catch:{ NumberFormatException -> 0x01bf }
            java.lang.Object r8 = p000.C2725kr.m20985e(r8)     // Catch:{ NumberFormatException -> 0x01bf }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ NumberFormatException -> 0x01bf }
            int r8 = java.lang.Integer.parseInt(r8)     // Catch:{ NumberFormatException -> 0x01bf }
            float r6 = (float) r6     // Catch:{ NumberFormatException -> 0x01bf }
            int r10 = r1.f14762a     // Catch:{ NumberFormatException -> 0x01bf }
            float r10 = (float) r10     // Catch:{ NumberFormatException -> 0x01bf }
            float r6 = r6 / r10
            float r8 = (float) r8     // Catch:{ NumberFormatException -> 0x01bf }
            int r1 = r1.f14763b     // Catch:{ NumberFormatException -> 0x01bf }
            float r1 = (float) r1
            float r8 = r8 / r1
            r1 = r6
            r10 = r8
        L_0x0138:
            java.lang.String r2 = "displayAlign"
            java.lang.String r2 = p000.fp7.m17181a(r0, r2)
            r3 = 0
            if (r2 == 0) goto L_0x0165
            java.lang.String r2 = p000.C5876gr.m44841e(r2)
            r2.hashCode()
            java.lang.String r5 = "center"
            boolean r5 = r2.equals(r5)
            if (r5 != 0) goto L_0x015d
            java.lang.String r5 = "after"
            boolean r2 = r2.equals(r5)
            if (r2 != 0) goto L_0x0159
            goto L_0x0165
        L_0x0159:
            float r9 = r9 + r10
            r6 = r9
            r8 = r14
            goto L_0x0167
        L_0x015d:
            r2 = 1073741824(0x40000000, float:2.0)
            float r2 = r10 / r2
            float r9 = r9 + r2
            r6 = r9
            r8 = r15
            goto L_0x0167
        L_0x0165:
            r8 = r3
            r6 = r9
        L_0x0167:
            r2 = 1065353216(0x3f800000, float:1.0)
            r5 = r18
            int r5 = r5.f14758b
            float r5 = (float) r5
            float r12 = r2 / r5
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            java.lang.String r5 = "writingMode"
            java.lang.String r0 = p000.fp7.m17181a(r0, r5)
            if (r0 == 0) goto L_0x01b2
            java.lang.String r0 = p000.C5876gr.m44841e(r0)
            r0.hashCode()
            r5 = -1
            int r9 = r0.hashCode()
            switch(r9) {
                case 3694: goto L_0x01a1;
                case 3553396: goto L_0x0196;
                case 3553576: goto L_0x018b;
                default: goto L_0x0189;
            }
        L_0x0189:
            r3 = r5
            goto L_0x01aa
        L_0x018b:
            java.lang.String r3 = "tbrl"
            boolean r0 = r0.equals(r3)
            if (r0 != 0) goto L_0x0194
            goto L_0x0189
        L_0x0194:
            r3 = r14
            goto L_0x01aa
        L_0x0196:
            java.lang.String r3 = "tblr"
            boolean r0 = r0.equals(r3)
            if (r0 != 0) goto L_0x019f
            goto L_0x0189
        L_0x019f:
            r3 = r15
            goto L_0x01aa
        L_0x01a1:
            java.lang.String r9 = "tb"
            boolean r0 = r0.equals(r9)
            if (r0 != 0) goto L_0x01aa
            goto L_0x0189
        L_0x01aa:
            switch(r3) {
                case 0: goto L_0x01b0;
                case 1: goto L_0x01b0;
                case 2: goto L_0x01ae;
                default: goto L_0x01ad;
            }
        L_0x01ad:
            goto L_0x01b2
        L_0x01ae:
            r13 = r15
            goto L_0x01b3
        L_0x01b0:
            r13 = r14
            goto L_0x01b3
        L_0x01b2:
            r13 = r2
        L_0x01b3:
            ny6 r0 = new ny6
            r2 = 0
            r11 = 1
            r3 = r0
            r5 = r7
            r7 = r2
            r9 = r1
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            return r0
        L_0x01bf:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r11)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            p000.gk3.m18132i(r5, r0)
            return r2
        L_0x01d2:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Ignoring region with unsupported extent: "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            p000.gk3.m18132i(r5, r0)
            return r2
        L_0x01e7:
            java.lang.String r0 = "Ignoring region without an extent"
            p000.gk3.m18132i(r5, r0)
            return r2
        L_0x01ed:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r11)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            p000.gk3.m18132i(r5, r0)
            return r2
        L_0x0200:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Ignoring region with unsupported origin: "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            p000.gk3.m18132i(r5, r0)
            return r2
        L_0x0215:
            java.lang.String r0 = "Ignoring region without an origin"
            p000.gk3.m18132i(r5, r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.ly6.m21906L(org.xmlpull.v1.XmlPullParser, ly6$a, ly6$c):ny6");
    }

    /* renamed from: M */
    public static float m21907M(String str) {
        Matcher matcher = f14750s.matcher(str);
        if (!matcher.matches()) {
            gk3.m18132i("TtmlDecoder", "Invalid value for shear: " + str);
            return Float.MAX_VALUE;
        }
        try {
            return Math.min(100.0f, Math.max(-100.0f, Float.parseFloat((String) C2725kr.m20985e(matcher.group(1)))));
        } catch (NumberFormatException e) {
            gk3.m18133j("TtmlDecoder", "Failed to parse shear: " + str, e);
            return Float.MAX_VALUE;
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x01e0, code lost:
        if (r3.equals(org.web3j.ens.contracts.generated.PublicResolver.FUNC_TEXT) == false) goto L_0x01d8;
     */
    /* renamed from: N */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p000.py6 m21908N(org.xmlpull.v1.XmlPullParser r12, p000.py6 r13) {
        /*
            int r0 = r12.getAttributeCount()
            r1 = 0
            r2 = r1
        L_0x0006:
            if (r2 >= r0) goto L_0x02f6
            java.lang.String r3 = r12.getAttributeValue(r2)
            java.lang.String r4 = r12.getAttributeName(r2)
            r4.hashCode()
            int r5 = r4.hashCode()
            r6 = 5
            r7 = 4
            r8 = -1
            r9 = 3
            r10 = 2
            r11 = 1
            switch(r5) {
                case -1550943582: goto L_0x00cf;
                case -1224696685: goto L_0x00c3;
                case -1065511464: goto L_0x00b7;
                case -879295043: goto L_0x00ab;
                case -734428249: goto L_0x009f;
                case 3355: goto L_0x0094;
                case 3511770: goto L_0x0089;
                case 94842723: goto L_0x007e;
                case 109403361: goto L_0x0071;
                case 110138194: goto L_0x0064;
                case 365601008: goto L_0x0057;
                case 921125321: goto L_0x004a;
                case 1115953443: goto L_0x003d;
                case 1287124693: goto L_0x0030;
                case 1754920356: goto L_0x0023;
                default: goto L_0x0020;
            }
        L_0x0020:
            r4 = r8
            goto L_0x00da
        L_0x0023:
            java.lang.String r5 = "multiRowAlign"
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L_0x002c
            goto L_0x0020
        L_0x002c:
            r4 = 14
            goto L_0x00da
        L_0x0030:
            java.lang.String r5 = "backgroundColor"
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L_0x0039
            goto L_0x0020
        L_0x0039:
            r4 = 13
            goto L_0x00da
        L_0x003d:
            java.lang.String r5 = "rubyPosition"
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L_0x0046
            goto L_0x0020
        L_0x0046:
            r4 = 12
            goto L_0x00da
        L_0x004a:
            java.lang.String r5 = "textEmphasis"
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L_0x0053
            goto L_0x0020
        L_0x0053:
            r4 = 11
            goto L_0x00da
        L_0x0057:
            java.lang.String r5 = "fontSize"
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L_0x0060
            goto L_0x0020
        L_0x0060:
            r4 = 10
            goto L_0x00da
        L_0x0064:
            java.lang.String r5 = "textCombine"
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L_0x006d
            goto L_0x0020
        L_0x006d:
            r4 = 9
            goto L_0x00da
        L_0x0071:
            java.lang.String r5 = "shear"
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L_0x007a
            goto L_0x0020
        L_0x007a:
            r4 = 8
            goto L_0x00da
        L_0x007e:
            java.lang.String r5 = "color"
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L_0x0087
            goto L_0x0020
        L_0x0087:
            r4 = 7
            goto L_0x00da
        L_0x0089:
            java.lang.String r5 = "ruby"
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L_0x0092
            goto L_0x0020
        L_0x0092:
            r4 = 6
            goto L_0x00da
        L_0x0094:
            java.lang.String r5 = "id"
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L_0x009d
            goto L_0x0020
        L_0x009d:
            r4 = r6
            goto L_0x00da
        L_0x009f:
            java.lang.String r5 = "fontWeight"
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L_0x00a9
            goto L_0x0020
        L_0x00a9:
            r4 = r7
            goto L_0x00da
        L_0x00ab:
            java.lang.String r5 = "textDecoration"
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L_0x00b5
            goto L_0x0020
        L_0x00b5:
            r4 = r9
            goto L_0x00da
        L_0x00b7:
            java.lang.String r5 = "textAlign"
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L_0x00c1
            goto L_0x0020
        L_0x00c1:
            r4 = r10
            goto L_0x00da
        L_0x00c3:
            java.lang.String r5 = "fontFamily"
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L_0x00cd
            goto L_0x0020
        L_0x00cd:
            r4 = r11
            goto L_0x00da
        L_0x00cf:
            java.lang.String r5 = "fontStyle"
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L_0x00d9
            goto L_0x0020
        L_0x00d9:
            r4 = r1
        L_0x00da:
            java.lang.String r5 = "TtmlDecoder"
            switch(r4) {
                case 0: goto L_0x02e4;
                case 1: goto L_0x02db;
                case 2: goto L_0x02ce;
                case 3: goto L_0x026c;
                case 4: goto L_0x025c;
                case 5: goto L_0x0246;
                case 6: goto L_0x01ca;
                case 7: goto L_0x01a7;
                case 8: goto L_0x0199;
                case 9: goto L_0x016c;
                case 10: goto L_0x014d;
                case 11: goto L_0x013f;
                case 12: goto L_0x0112;
                case 13: goto L_0x00ef;
                case 14: goto L_0x00e1;
                default: goto L_0x00df;
            }
        L_0x00df:
            goto L_0x02f2
        L_0x00e1:
            py6 r13 = m21897C(r13)
            android.text.Layout$Alignment r3 = m21899E(r3)
            py6 r13 = r13.mo24832D(r3)
            goto L_0x02f2
        L_0x00ef:
            py6 r13 = m21897C(r13)
            int r4 = p000.bl0.m11438c(r3)     // Catch:{ IllegalArgumentException -> 0x00fc }
            r13.mo24860u(r4)     // Catch:{ IllegalArgumentException -> 0x00fc }
            goto L_0x02f2
        L_0x00fc:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r6 = "Failed parsing background value: "
            r4.append(r6)
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            p000.gk3.m18132i(r5, r3)
            goto L_0x02f2
        L_0x0112:
            java.lang.String r3 = p000.C5876gr.m44841e(r3)
            r3.hashCode()
            java.lang.String r4 = "before"
            boolean r4 = r3.equals(r4)
            if (r4 != 0) goto L_0x0135
            java.lang.String r4 = "after"
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L_0x012b
            goto L_0x02f2
        L_0x012b:
            py6 r13 = m21897C(r13)
            py6 r13 = r13.mo24833E(r10)
            goto L_0x02f2
        L_0x0135:
            py6 r13 = m21897C(r13)
            py6 r13 = r13.mo24833E(r11)
            goto L_0x02f2
        L_0x013f:
            py6 r13 = m21897C(r13)
            kn6 r3 = p000.kn6.m20931a(r3)
            py6 r13 = r13.mo24838J(r3)
            goto L_0x02f2
        L_0x014d:
            py6 r13 = m21897C(r13)     // Catch:{ SubtitleDecoderException -> 0x0156 }
            m21901G(r3, r13)     // Catch:{ SubtitleDecoderException -> 0x0156 }
            goto L_0x02f2
        L_0x0156:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r6 = "Failed parsing fontSize value: "
            r4.append(r6)
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            p000.gk3.m18132i(r5, r3)
            goto L_0x02f2
        L_0x016c:
            java.lang.String r3 = p000.C5876gr.m44841e(r3)
            r3.hashCode()
            java.lang.String r4 = "all"
            boolean r4 = r3.equals(r4)
            if (r4 != 0) goto L_0x018f
            java.lang.String r4 = "none"
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L_0x0185
            goto L_0x02f2
        L_0x0185:
            py6 r13 = m21897C(r13)
            py6 r13 = r13.mo24837I(r1)
            goto L_0x02f2
        L_0x018f:
            py6 r13 = m21897C(r13)
            py6 r13 = r13.mo24837I(r11)
            goto L_0x02f2
        L_0x0199:
            py6 r13 = m21897C(r13)
            float r3 = m21907M(r3)
            py6 r13 = r13.mo24835G(r3)
            goto L_0x02f2
        L_0x01a7:
            py6 r13 = m21897C(r13)
            int r4 = p000.bl0.m11438c(r3)     // Catch:{ IllegalArgumentException -> 0x01b4 }
            r13.mo24862w(r4)     // Catch:{ IllegalArgumentException -> 0x01b4 }
            goto L_0x02f2
        L_0x01b4:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r6 = "Failed parsing color value: "
            r4.append(r6)
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            p000.gk3.m18132i(r5, r3)
            goto L_0x02f2
        L_0x01ca:
            java.lang.String r3 = p000.C5876gr.m44841e(r3)
            r3.hashCode()
            int r4 = r3.hashCode()
            switch(r4) {
                case -618561360: goto L_0x020f;
                case -410956671: goto L_0x0204;
                case -250518009: goto L_0x01f9;
                case -136074796: goto L_0x01ee;
                case 3016401: goto L_0x01e3;
                case 3556653: goto L_0x01da;
                default: goto L_0x01d8;
            }
        L_0x01d8:
            r6 = r8
            goto L_0x0219
        L_0x01da:
            java.lang.String r4 = "text"
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L_0x0219
            goto L_0x01d8
        L_0x01e3:
            java.lang.String r4 = "base"
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L_0x01ec
            goto L_0x01d8
        L_0x01ec:
            r6 = r7
            goto L_0x0219
        L_0x01ee:
            java.lang.String r4 = "textContainer"
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L_0x01f7
            goto L_0x01d8
        L_0x01f7:
            r6 = r9
            goto L_0x0219
        L_0x01f9:
            java.lang.String r4 = "delimiter"
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L_0x0202
            goto L_0x01d8
        L_0x0202:
            r6 = r10
            goto L_0x0219
        L_0x0204:
            java.lang.String r4 = "container"
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L_0x020d
            goto L_0x01d8
        L_0x020d:
            r6 = r11
            goto L_0x0219
        L_0x020f:
            java.lang.String r4 = "baseContainer"
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L_0x0218
            goto L_0x01d8
        L_0x0218:
            r6 = r1
        L_0x0219:
            switch(r6) {
                case 0: goto L_0x023c;
                case 1: goto L_0x0232;
                case 2: goto L_0x0228;
                case 3: goto L_0x021e;
                case 4: goto L_0x023c;
                case 5: goto L_0x021e;
                default: goto L_0x021c;
            }
        L_0x021c:
            goto L_0x02f2
        L_0x021e:
            py6 r13 = m21897C(r13)
            py6 r13 = r13.mo24834F(r9)
            goto L_0x02f2
        L_0x0228:
            py6 r13 = m21897C(r13)
            py6 r13 = r13.mo24834F(r7)
            goto L_0x02f2
        L_0x0232:
            py6 r13 = m21897C(r13)
            py6 r13 = r13.mo24834F(r11)
            goto L_0x02f2
        L_0x023c:
            py6 r13 = m21897C(r13)
            py6 r13 = r13.mo24834F(r10)
            goto L_0x02f2
        L_0x0246:
            java.lang.String r4 = r12.getName()
            java.lang.String r5 = "style"
            boolean r4 = r5.equals(r4)
            if (r4 == 0) goto L_0x02f2
            py6 r13 = m21897C(r13)
            py6 r13 = r13.mo24829A(r3)
            goto L_0x02f2
        L_0x025c:
            py6 r13 = m21897C(r13)
            java.lang.String r4 = "bold"
            boolean r3 = r4.equalsIgnoreCase(r3)
            py6 r13 = r13.mo24861v(r3)
            goto L_0x02f2
        L_0x026c:
            java.lang.String r3 = p000.C5876gr.m44841e(r3)
            r3.hashCode()
            int r4 = r3.hashCode()
            switch(r4) {
                case -1461280213: goto L_0x029c;
                case -1026963764: goto L_0x0291;
                case 913457136: goto L_0x0286;
                case 1679736913: goto L_0x027b;
                default: goto L_0x027a;
            }
        L_0x027a:
            goto L_0x02a6
        L_0x027b:
            java.lang.String r4 = "linethrough"
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L_0x0284
            goto L_0x02a6
        L_0x0284:
            r8 = r9
            goto L_0x02a6
        L_0x0286:
            java.lang.String r4 = "nolinethrough"
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L_0x028f
            goto L_0x02a6
        L_0x028f:
            r8 = r10
            goto L_0x02a6
        L_0x0291:
            java.lang.String r4 = "underline"
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L_0x029a
            goto L_0x02a6
        L_0x029a:
            r8 = r11
            goto L_0x02a6
        L_0x029c:
            java.lang.String r4 = "nounderline"
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L_0x02a5
            goto L_0x02a6
        L_0x02a5:
            r8 = r1
        L_0x02a6:
            switch(r8) {
                case 0: goto L_0x02c5;
                case 1: goto L_0x02bc;
                case 2: goto L_0x02b3;
                case 3: goto L_0x02aa;
                default: goto L_0x02a9;
            }
        L_0x02a9:
            goto L_0x02f2
        L_0x02aa:
            py6 r13 = m21897C(r13)
            py6 r13 = r13.mo24831C(r11)
            goto L_0x02f2
        L_0x02b3:
            py6 r13 = m21897C(r13)
            py6 r13 = r13.mo24831C(r1)
            goto L_0x02f2
        L_0x02bc:
            py6 r13 = m21897C(r13)
            py6 r13 = r13.mo24839K(r11)
            goto L_0x02f2
        L_0x02c5:
            py6 r13 = m21897C(r13)
            py6 r13 = r13.mo24839K(r1)
            goto L_0x02f2
        L_0x02ce:
            py6 r13 = m21897C(r13)
            android.text.Layout$Alignment r3 = m21899E(r3)
            py6 r13 = r13.mo24836H(r3)
            goto L_0x02f2
        L_0x02db:
            py6 r13 = m21897C(r13)
            py6 r13 = r13.mo24863x(r3)
            goto L_0x02f2
        L_0x02e4:
            py6 r13 = m21897C(r13)
            java.lang.String r4 = "italic"
            boolean r3 = r4.equalsIgnoreCase(r3)
            py6 r13 = r13.mo24830B(r3)
        L_0x02f2:
            int r2 = r2 + 1
            goto L_0x0006
        L_0x02f6:
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.ly6.m21908N(org.xmlpull.v1.XmlPullParser, py6):py6");
    }

    /* renamed from: O */
    public static String[] m21909O(String str) {
        String trim = str.trim();
        if (trim.isEmpty()) {
            return new String[0];
        }
        return w67.m29317L0(trim, "\\s+");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x00bc, code lost:
        if (r13.equals("ms") == false) goto L_0x00b4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00f3, code lost:
        r8 = r8 / r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0101, code lost:
        r8 = r8 * r13;
     */
    /* renamed from: P */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static long m21910P(java.lang.String r13, p000.ly6.C2794b r14) throws androidx.media3.extractor.text.SubtitleDecoderException {
        /*
            java.util.regex.Pattern r0 = f14747p
            java.util.regex.Matcher r0 = r0.matcher(r13)
            boolean r1 = r0.matches()
            r2 = 4696837146684686336(0x412e848000000000, double:1000000.0)
            r4 = 4
            r5 = 3
            r6 = 2
            r7 = 1
            if (r1 == 0) goto L_0x0085
            java.lang.String r13 = r0.group(r7)
            java.lang.Object r13 = p000.C2725kr.m20985e(r13)
            java.lang.String r13 = (java.lang.String) r13
            long r7 = java.lang.Long.parseLong(r13)
            r9 = 3600(0xe10, double:1.7786E-320)
            long r7 = r7 * r9
            double r7 = (double) r7
            java.lang.String r13 = r0.group(r6)
            java.lang.Object r13 = p000.C2725kr.m20985e(r13)
            java.lang.String r13 = (java.lang.String) r13
            long r9 = java.lang.Long.parseLong(r13)
            r11 = 60
            long r9 = r9 * r11
            double r9 = (double) r9
            double r7 = r7 + r9
            java.lang.String r13 = r0.group(r5)
            java.lang.Object r13 = p000.C2725kr.m20985e(r13)
            java.lang.String r13 = (java.lang.String) r13
            long r5 = java.lang.Long.parseLong(r13)
            double r5 = (double) r5
            double r7 = r7 + r5
            java.lang.String r13 = r0.group(r4)
            r4 = 0
            if (r13 == 0) goto L_0x0057
            double r9 = java.lang.Double.parseDouble(r13)
            goto L_0x0058
        L_0x0057:
            r9 = r4
        L_0x0058:
            double r7 = r7 + r9
            r13 = 5
            java.lang.String r13 = r0.group(r13)
            if (r13 == 0) goto L_0x006a
            long r9 = java.lang.Long.parseLong(r13)
            float r13 = (float) r9
            float r1 = r14.f14759a
            float r13 = r13 / r1
            double r9 = (double) r13
            goto L_0x006b
        L_0x006a:
            r9 = r4
        L_0x006b:
            double r7 = r7 + r9
            r13 = 6
            java.lang.String r13 = r0.group(r13)
            if (r13 == 0) goto L_0x0081
            long r0 = java.lang.Long.parseLong(r13)
            double r0 = (double) r0
            int r13 = r14.f14760b
            double r4 = (double) r13
            double r0 = r0 / r4
            float r13 = r14.f14759a
            double r13 = (double) r13
            double r4 = r0 / r13
        L_0x0081:
            double r7 = r7 + r4
            double r7 = r7 * r2
            long r13 = (long) r7
            return r13
        L_0x0085:
            java.util.regex.Pattern r0 = f14748q
            java.util.regex.Matcher r0 = r0.matcher(r13)
            boolean r1 = r0.matches()
            if (r1 == 0) goto L_0x010a
            java.lang.String r13 = r0.group(r7)
            java.lang.Object r13 = p000.C2725kr.m20985e(r13)
            java.lang.String r13 = (java.lang.String) r13
            double r8 = java.lang.Double.parseDouble(r13)
            java.lang.String r13 = r0.group(r6)
            java.lang.Object r13 = p000.C2725kr.m20985e(r13)
            java.lang.String r13 = (java.lang.String) r13
            r13.hashCode()
            r0 = -1
            int r1 = r13.hashCode()
            switch(r1) {
                case 102: goto L_0x00e0;
                case 104: goto L_0x00d5;
                case 109: goto L_0x00ca;
                case 116: goto L_0x00bf;
                case 3494: goto L_0x00b6;
                default: goto L_0x00b4;
            }
        L_0x00b4:
            r4 = r0
            goto L_0x00ea
        L_0x00b6:
            java.lang.String r1 = "ms"
            boolean r13 = r13.equals(r1)
            if (r13 != 0) goto L_0x00ea
            goto L_0x00b4
        L_0x00bf:
            java.lang.String r1 = "t"
            boolean r13 = r13.equals(r1)
            if (r13 != 0) goto L_0x00c8
            goto L_0x00b4
        L_0x00c8:
            r4 = r5
            goto L_0x00ea
        L_0x00ca:
            java.lang.String r1 = "m"
            boolean r13 = r13.equals(r1)
            if (r13 != 0) goto L_0x00d3
            goto L_0x00b4
        L_0x00d3:
            r4 = r6
            goto L_0x00ea
        L_0x00d5:
            java.lang.String r1 = "h"
            boolean r13 = r13.equals(r1)
            if (r13 != 0) goto L_0x00de
            goto L_0x00b4
        L_0x00de:
            r4 = r7
            goto L_0x00ea
        L_0x00e0:
            java.lang.String r1 = "f"
            boolean r13 = r13.equals(r1)
            if (r13 != 0) goto L_0x00e9
            goto L_0x00b4
        L_0x00e9:
            r4 = 0
        L_0x00ea:
            switch(r4) {
                case 0: goto L_0x0103;
                case 1: goto L_0x00fc;
                case 2: goto L_0x00f9;
                case 3: goto L_0x00f5;
                case 4: goto L_0x00ee;
                default: goto L_0x00ed;
            }
        L_0x00ed:
            goto L_0x0107
        L_0x00ee:
            r13 = 4652007308841189376(0x408f400000000000, double:1000.0)
        L_0x00f3:
            double r8 = r8 / r13
            goto L_0x0107
        L_0x00f5:
            int r13 = r14.f14761c
            double r13 = (double) r13
            goto L_0x00f3
        L_0x00f9:
            r13 = 4633641066610819072(0x404e000000000000, double:60.0)
            goto L_0x0101
        L_0x00fc:
            r13 = 4660134898793709568(0x40ac200000000000, double:3600.0)
        L_0x0101:
            double r8 = r8 * r13
            goto L_0x0107
        L_0x0103:
            float r13 = r14.f14759a
            double r13 = (double) r13
            goto L_0x00f3
        L_0x0107:
            double r8 = r8 * r2
            long r13 = (long) r8
            return r13
        L_0x010a:
            androidx.media3.extractor.text.SubtitleDecoderException r14 = new androidx.media3.extractor.text.SubtitleDecoderException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Malformed time expression: "
            r0.append(r1)
            r0.append(r13)
            java.lang.String r13 = r0.toString()
            r14.<init>((java.lang.String) r13)
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.ly6.m21910P(java.lang.String, ly6$b):long");
    }

    /* renamed from: Q */
    public static C2795c m21911Q(XmlPullParser xmlPullParser) {
        String a = fp7.m17181a(xmlPullParser, "extent");
        if (a == null) {
            return null;
        }
        Matcher matcher = f14752u.matcher(a);
        if (!matcher.matches()) {
            gk3.m18132i("TtmlDecoder", "Ignoring non-pixel tts extent: " + a);
            return null;
        }
        try {
            return new C2795c(Integer.parseInt((String) C2725kr.m20985e(matcher.group(1))), Integer.parseInt((String) C2725kr.m20985e(matcher.group(2))));
        } catch (NumberFormatException unused) {
            gk3.m18132i("TtmlDecoder", "Ignoring malformed tts extent: " + a);
            return null;
        }
    }

    /* renamed from: A */
    public xc6 mo11312A(byte[] bArr, int i, boolean z) throws SubtitleDecoderException {
        C2794b bVar;
        try {
            XmlPullParser newPullParser = this.f14756o.newPullParser();
            HashMap hashMap = new HashMap();
            HashMap hashMap2 = new HashMap();
            HashMap hashMap3 = new HashMap();
            hashMap2.put("", new ny6(""));
            C2795c cVar = null;
            newPullParser.setInput(new ByteArrayInputStream(bArr, 0, i), (String) null);
            ArrayDeque arrayDeque = new ArrayDeque();
            C2794b bVar2 = f14754w;
            C2793a aVar = f14755x;
            int i2 = 0;
            qy6 qy6 = null;
            for (int eventType = newPullParser.getEventType(); eventType != 1; eventType = newPullParser.getEventType()) {
                my6 my6 = (my6) arrayDeque.peek();
                if (i2 == 0) {
                    String name = newPullParser.getName();
                    if (eventType == 2) {
                        if ("tt".equals(name)) {
                            bVar2 = m21902H(newPullParser);
                            aVar = m21900F(newPullParser, f14755x);
                            cVar = m21911Q(newPullParser);
                        }
                        C2795c cVar2 = cVar;
                        C2794b bVar3 = bVar2;
                        C2793a aVar2 = aVar;
                        if (!m21898D(name)) {
                            gk3.m18129f("TtmlDecoder", "Ignoring unsupported tag: " + newPullParser.getName());
                            i2++;
                            bVar2 = bVar3;
                        } else {
                            if ("head".equals(name)) {
                                bVar = bVar3;
                                m21903I(newPullParser, hashMap, aVar2, cVar2, hashMap2, hashMap3);
                            } else {
                                bVar = bVar3;
                                try {
                                    my6 K = m21905K(newPullParser, my6, hashMap2, bVar);
                                    arrayDeque.push(K);
                                    if (my6 != null) {
                                        my6.mo23422a(K);
                                    }
                                } catch (SubtitleDecoderException e) {
                                    gk3.m18133j("TtmlDecoder", "Suppressing parser error", e);
                                    i2++;
                                }
                            }
                            bVar2 = bVar;
                        }
                        cVar = cVar2;
                        aVar = aVar2;
                    } else if (eventType == 4) {
                        ((my6) C2725kr.m20985e(my6)).mo23422a(my6.m22677d(newPullParser.getText()));
                    } else if (eventType == 3) {
                        if (newPullParser.getName().equals("tt")) {
                            qy6 = new qy6((my6) C2725kr.m20985e((my6) arrayDeque.peek()), hashMap, hashMap2, hashMap3);
                        }
                        arrayDeque.pop();
                    }
                } else if (eventType == 2) {
                    i2++;
                } else if (eventType == 3) {
                    i2--;
                }
                newPullParser.next();
            }
            if (qy6 != null) {
                return qy6;
            }
            throw new SubtitleDecoderException("No TTML subtitles found");
        } catch (XmlPullParserException e2) {
            throw new SubtitleDecoderException("Unable to decode source", e2);
        } catch (IOException e3) {
            throw new IllegalStateException("Unexpected error when reading input.", e3);
        }
    }
}
