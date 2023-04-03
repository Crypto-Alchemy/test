package p000;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Pair;
import android.util.Xml;
import androidx.media3.common.C0792h;
import androidx.media3.common.DrmInitData;
import androidx.media3.common.ParserException;
import androidx.media3.exoplayer.upstream.C1023c;
import androidx.media3.extractor.metadata.emsg.EventMessage;
import androidx.recyclerview.widget.RecyclerView;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import okhttp3.internal.http2.Http2;
import org.web3j.ens.contracts.generated.PublicResolver;
import org.xml.sax.helpers.DefaultHandler;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;
import org.xmlpull.v1.XmlSerializer;
import p000.dt5;

/* renamed from: e11 */
/* compiled from: DashManifestParser */
public class e11 extends DefaultHandler implements C1023c.C1024a<d11> {

    /* renamed from: b */
    public static final Pattern f11015b = Pattern.compile("(\\d+)(?:/(\\d+))?");

    /* renamed from: c */
    public static final Pattern f11016c = Pattern.compile("CC([1-4])=.*");

    /* renamed from: d */
    public static final Pattern f11017d = Pattern.compile("([1-9]|[1-5][0-9]|6[0-3])=.*");

    /* renamed from: e */
    public static final int[] f11018e = {-1, 1, 2, 3, 4, 5, 6, 8, 2, 3, 4, 7, 8, 24, 8, 12, 10, 12, 14, 12, 14};

    /* renamed from: a */
    public final XmlPullParserFactory f11019a;

    /* renamed from: e11$a */
    /* compiled from: DashManifestParser */
    public static final class C2209a {

        /* renamed from: a */
        public final C0792h f11020a;

        /* renamed from: b */
        public final ImmutableList<C3018oz> f11021b;

        /* renamed from: c */
        public final dt5 f11022c;

        /* renamed from: d */
        public final String f11023d;

        /* renamed from: e */
        public final ArrayList<DrmInitData.SchemeData> f11024e;

        /* renamed from: f */
        public final ArrayList<sc1> f11025f;

        /* renamed from: g */
        public final long f11026g;

        /* renamed from: h */
        public final List<sc1> f11027h;

        /* renamed from: i */
        public final List<sc1> f11028i;

        public C2209a(C0792h hVar, List<C3018oz> list, dt5 dt5, String str, ArrayList<DrmInitData.SchemeData> arrayList, ArrayList<sc1> arrayList2, List<sc1> list2, List<sc1> list3, long j) {
            this.f11020a = hVar;
            this.f11021b = ImmutableList.copyOf(list);
            this.f11022c = dt5;
            this.f11023d = str;
            this.f11024e = arrayList;
            this.f11025f = arrayList2;
            this.f11027h = list2;
            this.f11028i = list3;
            this.f11026g = j;
        }
    }

    public e11() {
        try {
            this.f11019a = XmlPullParserFactory.newInstance();
        } catch (XmlPullParserException e) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e);
        }
    }

    /* renamed from: D */
    public static int m15557D(List<sc1> list) {
        String str;
        for (int i = 0; i < list.size(); i++) {
            sc1 sc1 = list.get(i);
            if ("urn:scte:dash:cc:cea-608:2015".equals(sc1.f17608a) && (str = sc1.f17609b) != null) {
                Matcher matcher = f11016c.matcher(str);
                if (matcher.matches()) {
                    return Integer.parseInt(matcher.group(1));
                }
                gk3.m18132i("MpdParser", "Unable to parse CEA-608 channel number from: " + sc1.f17609b);
            }
        }
        return -1;
    }

    /* renamed from: E */
    public static int m15558E(List<sc1> list) {
        String str;
        for (int i = 0; i < list.size(); i++) {
            sc1 sc1 = list.get(i);
            if ("urn:scte:dash:cc:cea-708:2015".equals(sc1.f17608a) && (str = sc1.f17609b) != null) {
                Matcher matcher = f11017d.matcher(str);
                if (matcher.matches()) {
                    return Integer.parseInt(matcher.group(1));
                }
                gk3.m18132i("MpdParser", "Unable to parse CEA-708 service block number from: " + sc1.f17609b);
            }
        }
        return -1;
    }

    /* renamed from: H */
    public static long m15559H(XmlPullParser xmlPullParser, String str, long j) throws ParserException {
        String attributeValue = xmlPullParser.getAttributeValue((String) null, str);
        if (attributeValue == null) {
            return j;
        }
        return w67.m29303E0(attributeValue);
    }

    /* renamed from: I */
    public static sc1 m15560I(XmlPullParser xmlPullParser, String str) throws XmlPullParserException, IOException {
        String r0 = m15575r0(xmlPullParser, "schemeIdUri", "");
        String r02 = m15575r0(xmlPullParser, "value", (String) null);
        String r03 = m15575r0(xmlPullParser, "id", (String) null);
        do {
            xmlPullParser.next();
        } while (!fp7.m17184d(xmlPullParser, str));
        return new sc1(r0, r02, r03);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: J */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int m15561J(org.xmlpull.v1.XmlPullParser r4) {
        /*
            r0 = 0
            java.lang.String r1 = "value"
            java.lang.String r4 = r4.getAttributeValue(r0, r1)
            r0 = -1
            if (r4 != 0) goto L_0x000b
            return r0
        L_0x000b:
            java.lang.String r4 = p000.C5876gr.m44841e(r4)
            r4.hashCode()
            int r1 = r4.hashCode()
            r2 = 2
            r3 = 1
            switch(r1) {
                case 1596796: goto L_0x003e;
                case 2937391: goto L_0x0033;
                case 3094035: goto L_0x0028;
                case 3133436: goto L_0x001d;
                default: goto L_0x001b;
            }
        L_0x001b:
            r4 = r0
            goto L_0x0048
        L_0x001d:
            java.lang.String r1 = "fa01"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L_0x0026
            goto L_0x001b
        L_0x0026:
            r4 = 3
            goto L_0x0048
        L_0x0028:
            java.lang.String r1 = "f801"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L_0x0031
            goto L_0x001b
        L_0x0031:
            r4 = r2
            goto L_0x0048
        L_0x0033:
            java.lang.String r1 = "a000"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L_0x003c
            goto L_0x001b
        L_0x003c:
            r4 = r3
            goto L_0x0048
        L_0x003e:
            java.lang.String r1 = "4000"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L_0x0047
            goto L_0x001b
        L_0x0047:
            r4 = 0
        L_0x0048:
            switch(r4) {
                case 0: goto L_0x0052;
                case 1: goto L_0x0051;
                case 2: goto L_0x004f;
                case 3: goto L_0x004c;
                default: goto L_0x004b;
            }
        L_0x004b:
            return r0
        L_0x004c:
            r4 = 8
            return r4
        L_0x004f:
            r4 = 6
            return r4
        L_0x0051:
            return r2
        L_0x0052:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.e11.m15561J(org.xmlpull.v1.XmlPullParser):int");
    }

    /* renamed from: K */
    public static int m15562K(XmlPullParser xmlPullParser) {
        int U = m15568U(xmlPullParser, "value", -1);
        if (U <= 0 || U >= 33) {
            return -1;
        }
        return U;
    }

    /* renamed from: L */
    public static int m15563L(XmlPullParser xmlPullParser) {
        int bitCount;
        String attributeValue = xmlPullParser.getAttributeValue((String) null, "value");
        if (attributeValue == null || (bitCount = Integer.bitCount(Integer.parseInt(attributeValue, 16))) == 0) {
            return -1;
        }
        return bitCount;
    }

    /* renamed from: M */
    public static long m15564M(XmlPullParser xmlPullParser, String str, long j) {
        String attributeValue = xmlPullParser.getAttributeValue((String) null, str);
        if (attributeValue == null) {
            return j;
        }
        return w67.m29305F0(attributeValue);
    }

    /* renamed from: N */
    public static String m15565N(List<sc1> list) {
        for (int i = 0; i < list.size(); i++) {
            sc1 sc1 = list.get(i);
            String str = sc1.f17608a;
            if ("tag:dolby.com,2018:dash:EC3_ExtensionType:2018".equals(str) && "JOC".equals(sc1.f17609b)) {
                return "audio/eac3-joc";
            }
            if ("tag:dolby.com,2014:dash:DolbyDigitalPlusExtensionType:2014".equals(str) && "ec+3".equals(sc1.f17609b)) {
                return "audio/eac3-joc";
            }
        }
        return "audio/eac3";
    }

    /* renamed from: R */
    public static float m15566R(XmlPullParser xmlPullParser, String str, float f) {
        String attributeValue = xmlPullParser.getAttributeValue((String) null, str);
        if (attributeValue == null) {
            return f;
        }
        return Float.parseFloat(attributeValue);
    }

    /* renamed from: S */
    public static float m15567S(XmlPullParser xmlPullParser, float f) {
        String attributeValue = xmlPullParser.getAttributeValue((String) null, "frameRate");
        if (attributeValue == null) {
            return f;
        }
        Matcher matcher = f11015b.matcher(attributeValue);
        if (!matcher.matches()) {
            return f;
        }
        int parseInt = Integer.parseInt(matcher.group(1));
        String group = matcher.group(2);
        if (!TextUtils.isEmpty(group)) {
            return ((float) parseInt) / ((float) Integer.parseInt(group));
        }
        return (float) parseInt;
    }

    /* renamed from: U */
    public static int m15568U(XmlPullParser xmlPullParser, String str, int i) {
        String attributeValue = xmlPullParser.getAttributeValue((String) null, str);
        if (attributeValue == null) {
            return i;
        }
        return Integer.parseInt(attributeValue);
    }

    /* renamed from: W */
    public static long m15569W(List<sc1> list) {
        for (int i = 0; i < list.size(); i++) {
            sc1 sc1 = list.get(i);
            if (C5876gr.m44837a("http://dashif.org/guidelines/last-segment-number", sc1.f17608a)) {
                return Long.parseLong(sc1.f17609b);
            }
        }
        return -1;
    }

    /* renamed from: X */
    public static long m15570X(XmlPullParser xmlPullParser, String str, long j) {
        String attributeValue = xmlPullParser.getAttributeValue((String) null, str);
        if (attributeValue == null) {
            return j;
        }
        return Long.parseLong(attributeValue);
    }

    /* renamed from: Z */
    public static int m15571Z(XmlPullParser xmlPullParser) {
        int U = m15568U(xmlPullParser, "value", -1);
        if (U < 0) {
            return -1;
        }
        int[] iArr = f11018e;
        if (U < iArr.length) {
            return iArr[U];
        }
        return -1;
    }

    /* renamed from: p */
    public static int m15572p(int i, int i2) {
        boolean z;
        if (i == -1) {
            return i2;
        }
        if (i2 == -1) {
            return i;
        }
        if (i == i2) {
            z = true;
        } else {
            z = false;
        }
        C2725kr.m20987g(z);
        return i;
    }

    /* renamed from: q */
    public static String m15573q(String str, String str2) {
        if (str == null) {
            return str2;
        }
        if (str2 == null) {
            return str;
        }
        C2725kr.m20987g(str.equals(str2));
        return str;
    }

    /* renamed from: r */
    public static void m15574r(ArrayList<DrmInitData.SchemeData> arrayList) {
        String str;
        int i = 0;
        while (true) {
            if (i >= arrayList.size()) {
                str = null;
                break;
            }
            DrmInitData.SchemeData schemeData = arrayList.get(i);
            if (l70.f14425c.equals(schemeData.f4116d) && (str = schemeData.f4117e) != null) {
                arrayList.remove(i);
                break;
            }
            i++;
        }
        if (str != null) {
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                DrmInitData.SchemeData schemeData2 = arrayList.get(i2);
                if (l70.f14424b.equals(schemeData2.f4116d) && schemeData2.f4117e == null) {
                    arrayList.set(i2, new DrmInitData.SchemeData(l70.f14425c, str, schemeData2.f4118g, schemeData2.f4119k));
                }
            }
        }
    }

    /* renamed from: r0 */
    public static String m15575r0(XmlPullParser xmlPullParser, String str, String str2) {
        String attributeValue = xmlPullParser.getAttributeValue((String) null, str);
        if (attributeValue == null) {
            return str2;
        }
        return attributeValue;
    }

    /* renamed from: s */
    public static void m15576s(ArrayList<DrmInitData.SchemeData> arrayList) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            DrmInitData.SchemeData schemeData = arrayList.get(size);
            if (!schemeData.mo6528c()) {
                int i = 0;
                while (true) {
                    if (i >= arrayList.size()) {
                        break;
                    } else if (arrayList.get(i).mo6526a(schemeData)) {
                        arrayList.remove(size);
                        break;
                    } else {
                        i++;
                    }
                }
            }
        }
    }

    /* renamed from: s0 */
    public static String m15577s0(XmlPullParser xmlPullParser, String str) throws XmlPullParserException, IOException {
        String str2 = "";
        do {
            xmlPullParser.next();
            if (xmlPullParser.getEventType() == 4) {
                str2 = xmlPullParser.getText();
            } else {
                m15580w(xmlPullParser);
            }
        } while (!fp7.m17184d(xmlPullParser, str));
        return str2;
    }

    /* renamed from: t */
    public static long m15578t(long j, long j2) {
        if (j2 != CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED) {
            j = j2;
        }
        return j == Long.MAX_VALUE ? CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED : j;
    }

    /* renamed from: u */
    public static String m15579u(String str, String str2) {
        if (vv3.m29139m(str)) {
            return vv3.m29128b(str2);
        }
        if (vv3.m29143q(str)) {
            return vv3.m29138l(str2);
        }
        if (vv3.m29142p(str) || vv3.m29140n(str)) {
            return str;
        }
        if (!"application/mp4".equals(str)) {
            return null;
        }
        String e = vv3.m29131e(str2);
        if ("text/vtt".equals(e)) {
            return "application/x-mp4-vtt";
        }
        return e;
    }

    /* renamed from: w */
    public static void m15580w(XmlPullParser xmlPullParser) throws IOException, XmlPullParserException {
        if (fp7.m17185e(xmlPullParser)) {
            int i = 1;
            while (i != 0) {
                xmlPullParser.next();
                if (fp7.m17185e(xmlPullParser)) {
                    i++;
                } else if (fp7.m17183c(xmlPullParser)) {
                    i--;
                }
            }
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: A */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int mo19029A(org.xmlpull.v1.XmlPullParser r4) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            r3 = this;
            java.lang.String r0 = "schemeIdUri"
            r1 = 0
            java.lang.String r0 = m15575r0(r4, r0, r1)
            r0.hashCode()
            int r1 = r0.hashCode()
            r2 = -1
            switch(r1) {
                case -2128649360: goto L_0x0056;
                case -1352850286: goto L_0x004b;
                case -1138141449: goto L_0x0040;
                case -986633423: goto L_0x0035;
                case -79006963: goto L_0x002a;
                case 312179081: goto L_0x001f;
                case 2036691300: goto L_0x0014;
                default: goto L_0x0012;
            }
        L_0x0012:
            r0 = r2
            goto L_0x0060
        L_0x0014:
            java.lang.String r1 = "urn:dolby:dash:audio_channel_configuration:2011"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x001d
            goto L_0x0012
        L_0x001d:
            r0 = 6
            goto L_0x0060
        L_0x001f:
            java.lang.String r1 = "tag:dts.com,2018:uhd:audio_channel_configuration"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0028
            goto L_0x0012
        L_0x0028:
            r0 = 5
            goto L_0x0060
        L_0x002a:
            java.lang.String r1 = "tag:dts.com,2014:dash:audio_channel_configuration:2012"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0033
            goto L_0x0012
        L_0x0033:
            r0 = 4
            goto L_0x0060
        L_0x0035:
            java.lang.String r1 = "urn:mpeg:mpegB:cicp:ChannelConfiguration"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x003e
            goto L_0x0012
        L_0x003e:
            r0 = 3
            goto L_0x0060
        L_0x0040:
            java.lang.String r1 = "tag:dolby.com,2014:dash:audio_channel_configuration:2011"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0049
            goto L_0x0012
        L_0x0049:
            r0 = 2
            goto L_0x0060
        L_0x004b:
            java.lang.String r1 = "urn:mpeg:dash:23003:3:audio_channel_configuration:2011"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0054
            goto L_0x0012
        L_0x0054:
            r0 = 1
            goto L_0x0060
        L_0x0056:
            java.lang.String r1 = "urn:dts:dash:audio_channel_configuration:2012"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x005f
            goto L_0x0012
        L_0x005f:
            r0 = 0
        L_0x0060:
            switch(r0) {
                case 0: goto L_0x007a;
                case 1: goto L_0x0073;
                case 2: goto L_0x006e;
                case 3: goto L_0x0069;
                case 4: goto L_0x007a;
                case 5: goto L_0x0064;
                case 6: goto L_0x006e;
                default: goto L_0x0063;
            }
        L_0x0063:
            goto L_0x007e
        L_0x0064:
            int r2 = m15563L(r4)
            goto L_0x007e
        L_0x0069:
            int r2 = m15571Z(r4)
            goto L_0x007e
        L_0x006e:
            int r2 = m15561J(r4)
            goto L_0x007e
        L_0x0073:
            java.lang.String r0 = "value"
            int r2 = m15568U(r4, r0, r2)
            goto L_0x007e
        L_0x007a:
            int r2 = m15562K(r4)
        L_0x007e:
            r4.next()
            java.lang.String r0 = "AudioChannelConfiguration"
            boolean r0 = p000.fp7.m17184d(r4, r0)
            if (r0 == 0) goto L_0x007e
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.e11.mo19029A(org.xmlpull.v1.XmlPullParser):int");
    }

    /* renamed from: B */
    public long mo19030B(XmlPullParser xmlPullParser, long j) {
        String attributeValue = xmlPullParser.getAttributeValue((String) null, "availabilityTimeOffset");
        if (attributeValue == null) {
            return j;
        }
        if ("INF".equals(attributeValue)) {
            return Long.MAX_VALUE;
        }
        return (long) (Float.parseFloat(attributeValue) * 1000000.0f);
    }

    /* renamed from: C */
    public List<C3018oz> mo19031C(XmlPullParser xmlPullParser, List<C3018oz> list, boolean z) throws XmlPullParserException, IOException {
        int i;
        int i2;
        String str;
        String attributeValue = xmlPullParser.getAttributeValue((String) null, "dvb:priority");
        if (attributeValue != null) {
            i = Integer.parseInt(attributeValue);
        } else if (z) {
            i = 1;
        } else {
            i = Integer.MIN_VALUE;
        }
        String attributeValue2 = xmlPullParser.getAttributeValue((String) null, "dvb:weight");
        if (attributeValue2 != null) {
            i2 = Integer.parseInt(attributeValue2);
        } else {
            i2 = 1;
        }
        String attributeValue3 = xmlPullParser.getAttributeValue((String) null, "serviceLocation");
        String s0 = m15577s0(xmlPullParser, "BaseURL");
        if (j57.m19969b(s0)) {
            if (attributeValue3 == null) {
                attributeValue3 = s0;
            }
            return Lists.m36794k(new C3018oz(s0, attributeValue3, i, i2));
        }
        ArrayList arrayList = new ArrayList();
        for (int i3 = 0; i3 < list.size(); i3++) {
            C3018oz ozVar = list.get(i3);
            String d = j57.m19971d(ozVar.f16254a, s0);
            if (attributeValue3 == null) {
                str = d;
            } else {
                str = attributeValue3;
            }
            if (z) {
                i = ozVar.f16256c;
                i2 = ozVar.f16257d;
                str = ozVar.f16255b;
            }
            arrayList.add(new C3018oz(d, str, i, i2));
        }
        return arrayList;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v0, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v2, resolved type: byte[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v7, resolved type: byte[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v8, resolved type: byte[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v9, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v10, resolved type: java.util.UUID} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v12, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v19, resolved type: byte[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v24, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v25, resolved type: byte[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v26, resolved type: byte[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v27, resolved type: byte[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v28, resolved type: byte[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v29, resolved type: byte[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v30, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v31, resolved type: java.lang.String} */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x008a, code lost:
        r1 = null;
        r4 = null;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: F */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.util.Pair<java.lang.String, androidx.media3.common.DrmInitData.SchemeData> mo19032F(org.xmlpull.v1.XmlPullParser r11) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            r10 = this;
            r0 = 0
            java.lang.String r1 = "schemeIdUri"
            java.lang.String r1 = r11.getAttributeValue(r0, r1)
            r2 = 0
            if (r1 == 0) goto L_0x0090
            java.lang.String r1 = p000.C5876gr.m44841e(r1)
            r1.hashCode()
            r3 = -1
            int r4 = r1.hashCode()
            switch(r4) {
                case -1980789791: goto L_0x003b;
                case 489446379: goto L_0x0030;
                case 755418770: goto L_0x0025;
                case 1812765994: goto L_0x001a;
                default: goto L_0x0019;
            }
        L_0x0019:
            goto L_0x0045
        L_0x001a:
            java.lang.String r4 = "urn:mpeg:dash:mp4protection:2011"
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto L_0x0023
            goto L_0x0045
        L_0x0023:
            r3 = 3
            goto L_0x0045
        L_0x0025:
            java.lang.String r4 = "urn:uuid:edef8ba9-79d6-4ace-a3c8-27dcd51d21ed"
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto L_0x002e
            goto L_0x0045
        L_0x002e:
            r3 = 2
            goto L_0x0045
        L_0x0030:
            java.lang.String r4 = "urn:uuid:9a04f079-9840-4286-ab92-e65be0885f95"
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto L_0x0039
            goto L_0x0045
        L_0x0039:
            r3 = 1
            goto L_0x0045
        L_0x003b:
            java.lang.String r4 = "urn:uuid:e2719d58-a985-b3c9-781a-b030af78d30e"
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto L_0x0044
            goto L_0x0045
        L_0x0044:
            r3 = r2
        L_0x0045:
            switch(r3) {
                case 0: goto L_0x008d;
                case 1: goto L_0x0088;
                case 2: goto L_0x0085;
                case 3: goto L_0x0049;
                default: goto L_0x0048;
            }
        L_0x0048:
            goto L_0x0090
        L_0x0049:
            java.lang.String r1 = "value"
            java.lang.String r1 = r11.getAttributeValue(r0, r1)
            java.lang.String r3 = "default_KID"
            java.lang.String r3 = p000.fp7.m17182b(r11, r3)
            boolean r4 = android.text.TextUtils.isEmpty(r3)
            if (r4 != 0) goto L_0x0083
            java.lang.String r4 = "00000000-0000-0000-0000-000000000000"
            boolean r4 = r4.equals(r3)
            if (r4 != 0) goto L_0x0083
            java.lang.String r4 = "\\s+"
            java.lang.String[] r3 = r3.split(r4)
            int r4 = r3.length
            java.util.UUID[] r4 = new java.util.UUID[r4]
            r5 = r2
        L_0x006d:
            int r6 = r3.length
            if (r5 >= r6) goto L_0x007b
            r6 = r3[r5]
            java.util.UUID r6 = java.util.UUID.fromString(r6)
            r4[r5] = r6
            int r5 = r5 + 1
            goto L_0x006d
        L_0x007b:
            java.util.UUID r3 = p000.l70.f14424b
            byte[] r4 = p000.sy4.m27187b(r3, r4, r0)
            r5 = r0
            goto L_0x0094
        L_0x0083:
            r3 = r0
            goto L_0x0092
        L_0x0085:
            java.util.UUID r3 = p000.l70.f14426d
            goto L_0x008a
        L_0x0088:
            java.util.UUID r3 = p000.l70.f14427e
        L_0x008a:
            r1 = r0
            r4 = r1
            goto L_0x0093
        L_0x008d:
            java.util.UUID r3 = p000.l70.f14425c
            goto L_0x008a
        L_0x0090:
            r1 = r0
            r3 = r1
        L_0x0092:
            r4 = r3
        L_0x0093:
            r5 = r4
        L_0x0094:
            r11.next()
            java.lang.String r6 = "clearkey:Laurl"
            boolean r6 = p000.fp7.m17186f(r11, r6)
            r7 = 4
            if (r6 == 0) goto L_0x00ac
            int r6 = r11.next()
            if (r6 != r7) goto L_0x00ac
            java.lang.String r5 = r11.getText()
            goto L_0x010f
        L_0x00ac:
            java.lang.String r6 = "ms:laurl"
            boolean r6 = p000.fp7.m17186f(r11, r6)
            if (r6 == 0) goto L_0x00bb
            java.lang.String r5 = "licenseUrl"
            java.lang.String r5 = r11.getAttributeValue(r0, r5)
            goto L_0x010f
        L_0x00bb:
            if (r4 != 0) goto L_0x00e7
            java.lang.String r6 = "pssh"
            boolean r6 = p000.fp7.m17187g(r11, r6)
            if (r6 == 0) goto L_0x00e7
            int r6 = r11.next()
            if (r6 != r7) goto L_0x00e7
            java.lang.String r3 = r11.getText()
            byte[] r3 = android.util.Base64.decode(r3, r2)
            java.util.UUID r4 = p000.sy4.m27191f(r3)
            if (r4 != 0) goto L_0x00e3
            java.lang.String r3 = "MpdParser"
            java.lang.String r6 = "Skipping malformed cenc:pssh data"
            p000.gk3.m18132i(r3, r6)
            r3 = r4
            r4 = r0
            goto L_0x010f
        L_0x00e3:
            r9 = r4
            r4 = r3
            r3 = r9
            goto L_0x010f
        L_0x00e7:
            if (r4 != 0) goto L_0x010c
            java.util.UUID r6 = p000.l70.f14427e
            boolean r8 = r6.equals(r3)
            if (r8 == 0) goto L_0x010c
            java.lang.String r8 = "mspr:pro"
            boolean r8 = p000.fp7.m17186f(r11, r8)
            if (r8 == 0) goto L_0x010c
            int r8 = r11.next()
            if (r8 != r7) goto L_0x010c
            java.lang.String r4 = r11.getText()
            byte[] r4 = android.util.Base64.decode(r4, r2)
            byte[] r4 = p000.sy4.m27186a(r6, r4)
            goto L_0x010f
        L_0x010c:
            m15580w(r11)
        L_0x010f:
            java.lang.String r6 = "ContentProtection"
            boolean r6 = p000.fp7.m17184d(r11, r6)
            if (r6 == 0) goto L_0x0094
            if (r3 == 0) goto L_0x0120
            androidx.media3.common.DrmInitData$SchemeData r0 = new androidx.media3.common.DrmInitData$SchemeData
            java.lang.String r11 = "video/mp4"
            r0.<init>(r3, r5, r11, r4)
        L_0x0120:
            android.util.Pair r11 = android.util.Pair.create(r1, r0)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.e11.mo19032F(org.xmlpull.v1.XmlPullParser):android.util.Pair");
    }

    /* renamed from: G */
    public int mo19033G(XmlPullParser xmlPullParser) {
        String attributeValue = xmlPullParser.getAttributeValue((String) null, "contentType");
        if (TextUtils.isEmpty(attributeValue)) {
            return -1;
        }
        if ("audio".equals(attributeValue)) {
            return 1;
        }
        if ("video".equals(attributeValue)) {
            return 2;
        }
        if (PublicResolver.FUNC_TEXT.equals(attributeValue)) {
            return 3;
        }
        return -1;
    }

    /* renamed from: O */
    public Pair<Long, EventMessage> mo19034O(XmlPullParser xmlPullParser, String str, String str2, long j, ByteArrayOutputStream byteArrayOutputStream) throws IOException, XmlPullParserException {
        XmlPullParser xmlPullParser2 = xmlPullParser;
        long X = m15570X(xmlPullParser2, "id", 0);
        long X2 = m15570X(xmlPullParser2, "duration", CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED);
        long X3 = m15570X(xmlPullParser2, "presentationTime", 0);
        long J0 = w67.m29313J0(X2, 1000, j);
        long J02 = w67.m29313J0(X3, 1000000, j);
        String r0 = m15575r0(xmlPullParser2, "messageData", (String) null);
        byte[] P = mo19035P(xmlPullParser2, byteArrayOutputStream);
        Long valueOf = Long.valueOf(J02);
        if (r0 != null) {
            P = w67.m29361j0(r0);
        }
        return Pair.create(valueOf, mo19045d(str, str2, X, J0, P));
    }

    /* renamed from: P */
    public byte[] mo19035P(XmlPullParser xmlPullParser, ByteArrayOutputStream byteArrayOutputStream) throws XmlPullParserException, IOException {
        byteArrayOutputStream.reset();
        XmlSerializer newSerializer = Xml.newSerializer();
        newSerializer.setOutput(byteArrayOutputStream, be0.f21263c.name());
        xmlPullParser.nextToken();
        while (!fp7.m17184d(xmlPullParser, "Event")) {
            switch (xmlPullParser.getEventType()) {
                case 0:
                    newSerializer.startDocument((String) null, Boolean.FALSE);
                    break;
                case 1:
                    newSerializer.endDocument();
                    break;
                case 2:
                    newSerializer.startTag(xmlPullParser.getNamespace(), xmlPullParser.getName());
                    for (int i = 0; i < xmlPullParser.getAttributeCount(); i++) {
                        newSerializer.attribute(xmlPullParser.getAttributeNamespace(i), xmlPullParser.getAttributeName(i), xmlPullParser.getAttributeValue(i));
                    }
                    break;
                case 3:
                    newSerializer.endTag(xmlPullParser.getNamespace(), xmlPullParser.getName());
                    break;
                case 4:
                    newSerializer.text(xmlPullParser.getText());
                    break;
                case 5:
                    newSerializer.cdsect(xmlPullParser.getText());
                    break;
                case 6:
                    newSerializer.entityRef(xmlPullParser.getText());
                    break;
                case 7:
                    newSerializer.ignorableWhitespace(xmlPullParser.getText());
                    break;
                case 8:
                    newSerializer.processingInstruction(xmlPullParser.getText());
                    break;
                case 9:
                    newSerializer.comment(xmlPullParser.getText());
                    break;
                case 10:
                    newSerializer.docdecl(xmlPullParser.getText());
                    break;
            }
            xmlPullParser.nextToken();
        }
        newSerializer.flush();
        return byteArrayOutputStream.toByteArray();
    }

    /* renamed from: Q */
    public ju1 mo19036Q(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        String r0 = m15575r0(xmlPullParser, "schemeIdUri", "");
        String r02 = m15575r0(xmlPullParser, "value", "");
        long X = m15570X(xmlPullParser, "timescale", 1);
        ArrayList arrayList = new ArrayList();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(RecyclerView.C1231a0.FLAG_ADAPTER_POSITION_UNKNOWN);
        do {
            xmlPullParser.next();
            if (fp7.m17186f(xmlPullParser, "Event")) {
                arrayList.add(mo19034O(xmlPullParser, r0, r02, X, byteArrayOutputStream));
            } else {
                m15580w(xmlPullParser);
            }
        } while (!fp7.m17184d(xmlPullParser, "EventStream"));
        long[] jArr = new long[arrayList.size()];
        EventMessage[] eventMessageArr = new EventMessage[arrayList.size()];
        for (int i = 0; i < arrayList.size(); i++) {
            Pair pair = (Pair) arrayList.get(i);
            jArr[i] = ((Long) pair.first).longValue();
            eventMessageArr[i] = (EventMessage) pair.second;
        }
        return mo19047e(r0, r02, X, jArr, eventMessageArr);
    }

    /* renamed from: T */
    public b75 mo19037T(XmlPullParser xmlPullParser) {
        return mo19046d0(xmlPullParser, "sourceURL", "range");
    }

    /* renamed from: V */
    public String mo19038V(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        return m15577s0(xmlPullParser, "Label");
    }

    /* JADX WARNING: Removed duplicated region for block: B:75:0x01c0  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x01e0  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x01e7 A[LOOP:0: B:23:0x00a4->B:79:0x01e7, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x01a3 A[SYNTHETIC] */
    /* renamed from: Y */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public p000.d11 mo19039Y(org.xmlpull.v1.XmlPullParser r47, android.net.Uri r48) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            r46 = this;
            r14 = r46
            r12 = r47
            r0 = 0
            java.lang.String[] r1 = new java.lang.String[r0]
            java.lang.String r2 = "profiles"
            java.lang.String[] r1 = r14.mo19042b0(r12, r2, r1)
            boolean r13 = r14.mo19073v(r1)
            java.lang.String r1 = "availabilityStartTime"
            r9 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            long r15 = m15559H(r12, r1, r9)
            java.lang.String r1 = "mediaPresentationDuration"
            long r17 = m15564M(r12, r1, r9)
            java.lang.String r1 = "minBufferTime"
            long r19 = m15564M(r12, r1, r9)
            r11 = 0
            java.lang.String r1 = "type"
            java.lang.String r1 = r12.getAttributeValue(r11, r1)
            java.lang.String r2 = "dynamic"
            boolean r21 = r2.equals(r1)
            if (r21 == 0) goto L_0x0040
            java.lang.String r1 = "minimumUpdatePeriod"
            long r1 = m15564M(r12, r1, r9)
            r22 = r1
            goto L_0x0042
        L_0x0040:
            r22 = r9
        L_0x0042:
            if (r21 == 0) goto L_0x004d
            java.lang.String r1 = "timeShiftBufferDepth"
            long r1 = m15564M(r12, r1, r9)
            r24 = r1
            goto L_0x004f
        L_0x004d:
            r24 = r9
        L_0x004f:
            if (r21 == 0) goto L_0x005a
            java.lang.String r1 = "suggestedPresentationDelay"
            long r1 = m15564M(r12, r1, r9)
            r26 = r1
            goto L_0x005c
        L_0x005a:
            r26 = r9
        L_0x005c:
            java.lang.String r1 = "publishTime"
            long r28 = m15559H(r12, r1, r9)
            if (r21 == 0) goto L_0x0067
            r3 = 0
            goto L_0x0068
        L_0x0067:
            r3 = r9
        L_0x0068:
            oz r5 = new oz
            java.lang.String r6 = r48.toString()
            java.lang.String r7 = r48.toString()
            r8 = 1
            if (r13 == 0) goto L_0x0077
            r1 = r8
            goto L_0x007b
        L_0x0077:
            r30 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r30
        L_0x007b:
            r5.<init>(r6, r7, r1, r8)
            oz[] r1 = new p000.C3018oz[r8]
            r1[r0] = r5
            java.util.ArrayList r7 = com.google.common.collect.Lists.m36794k(r1)
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            if (r21 == 0) goto L_0x0094
            r1 = r9
            goto L_0x0096
        L_0x0094:
            r1 = 0
        L_0x0096:
            r30 = r0
            r31 = r30
            r32 = r1
            r34 = r11
            r35 = r34
            r36 = r35
            r37 = r36
        L_0x00a4:
            r47.next()
            java.lang.String r0 = "BaseURL"
            boolean r0 = p000.fp7.m17186f(r12, r0)
            if (r0 == 0) goto L_0x00bf
            if (r30 != 0) goto L_0x00b7
            long r3 = r14.mo19030B(r12, r3)
            r30 = r8
        L_0x00b7:
            java.util.List r0 = r14.mo19031C(r12, r7, r13)
            r6.addAll(r0)
            goto L_0x00cd
        L_0x00bf:
            java.lang.String r0 = "ProgramInformation"
            boolean r0 = p000.fp7.m17186f(r12, r0)
            if (r0 == 0) goto L_0x00d9
            lw4 r0 = r46.mo19044c0(r47)
            r34 = r0
        L_0x00cd:
            r41 = r6
            r43 = r7
            r42 = r8
            r44 = r9
            r14 = r11
            r11 = r5
            goto L_0x019b
        L_0x00d9:
            java.lang.String r0 = "UTCTiming"
            boolean r0 = p000.fp7.m17186f(r12, r0)
            if (r0 == 0) goto L_0x00e8
            e67 r0 = r46.mo19074v0(r47)
            r35 = r0
            goto L_0x00cd
        L_0x00e8:
            java.lang.String r0 = "Location"
            boolean r0 = p000.fp7.m17186f(r12, r0)
            if (r0 == 0) goto L_0x00ff
            java.lang.String r0 = r48.toString()
            java.lang.String r1 = r47.nextText()
            android.net.Uri r0 = p000.j57.m19972e(r0, r1)
            r36 = r0
            goto L_0x00cd
        L_0x00ff:
            java.lang.String r0 = "ServiceDescription"
            boolean r0 = p000.fp7.m17186f(r12, r0)
            if (r0 == 0) goto L_0x010e
            hx5 r0 = r46.mo19070q0(r47)
            r37 = r0
            goto L_0x00cd
        L_0x010e:
            java.lang.String r0 = "Period"
            boolean r0 = p000.fp7.m17186f(r12, r0)
            if (r0 == 0) goto L_0x018a
            if (r31 != 0) goto L_0x018a
            boolean r0 = r6.isEmpty()
            if (r0 != 0) goto L_0x0120
            r2 = r6
            goto L_0x0121
        L_0x0120:
            r2 = r7
        L_0x0121:
            r0 = r46
            r1 = r47
            r38 = r3
            r3 = r32
            r40 = r5
            r41 = r6
            r5 = r38
            r43 = r7
            r42 = r8
            r7 = r15
            r44 = r9
            r9 = r24
            r14 = r11
            r11 = r13
            android.util.Pair r0 = r0.mo19040a0(r1, r2, r3, r5, r7, r9, r11)
            java.lang.Object r1 = r0.first
            jn4 r1 = (p000.jn4) r1
            long r2 = r1.f13723b
            int r2 = (r2 > r44 ? 1 : (r2 == r44 ? 0 : -1))
            if (r2 != 0) goto L_0x0169
            if (r21 == 0) goto L_0x014f
            r11 = r40
            r8 = r42
            goto L_0x0187
        L_0x014f:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Unable to determine start of period "
            r0.append(r1)
            int r1 = r40.size()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            androidx.media3.common.ParserException r0 = androidx.media3.common.ParserException.createForMalformedManifest(r0, r14)
            throw r0
        L_0x0169:
            java.lang.Object r0 = r0.second
            java.lang.Long r0 = (java.lang.Long) r0
            long r2 = r0.longValue()
            int r0 = (r2 > r44 ? 1 : (r2 == r44 ? 0 : -1))
            if (r0 != 0) goto L_0x017a
            r11 = r40
            r9 = r44
            goto L_0x0180
        L_0x017a:
            long r4 = r1.f13723b
            long r9 = r4 + r2
            r11 = r40
        L_0x0180:
            r11.add(r1)
            r32 = r9
            r8 = r31
        L_0x0187:
            r31 = r8
            goto L_0x0199
        L_0x018a:
            r38 = r3
            r41 = r6
            r43 = r7
            r42 = r8
            r44 = r9
            r14 = r11
            r11 = r5
            m15580w(r47)
        L_0x0199:
            r3 = r38
        L_0x019b:
            java.lang.String r0 = "MPD"
            boolean r0 = p000.fp7.m17184d(r12, r0)
            if (r0 == 0) goto L_0x01e7
            int r0 = (r17 > r44 ? 1 : (r17 == r44 ? 0 : -1))
            if (r0 != 0) goto L_0x01b8
            int r0 = (r32 > r44 ? 1 : (r32 == r44 ? 0 : -1))
            if (r0 == 0) goto L_0x01ae
            r3 = r32
            goto L_0x01ba
        L_0x01ae:
            if (r21 == 0) goto L_0x01b1
            goto L_0x01b8
        L_0x01b1:
            java.lang.String r0 = "Unable to determine duration of static manifest."
            androidx.media3.common.ParserException r0 = androidx.media3.common.ParserException.createForMalformedManifest(r0, r14)
            throw r0
        L_0x01b8:
            r3 = r17
        L_0x01ba:
            boolean r0 = r11.isEmpty()
            if (r0 != 0) goto L_0x01e0
            r0 = r46
            r1 = r15
            r5 = r19
            r7 = r21
            r8 = r22
            r38 = r11
            r10 = r24
            r12 = r26
            r14 = r28
            r16 = r34
            r17 = r35
            r18 = r37
            r19 = r36
            r20 = r38
            d11 r0 = r0.mo19051g(r1, r3, r5, r7, r8, r10, r12, r14, r16, r17, r18, r19, r20)
            return r0
        L_0x01e0:
            java.lang.String r0 = "No periods found."
            androidx.media3.common.ParserException r0 = androidx.media3.common.ParserException.createForMalformedManifest(r0, r14)
            throw r0
        L_0x01e7:
            r5 = r11
            r11 = r14
            r6 = r41
            r8 = r42
            r7 = r43
            r9 = r44
            r14 = r46
            goto L_0x00a4
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.e11.mo19039Y(org.xmlpull.v1.XmlPullParser, android.net.Uri):d11");
    }

    /* renamed from: a0 */
    public Pair<jn4, Long> mo19040a0(XmlPullParser xmlPullParser, List<C3018oz> list, long j, long j2, long j3, long j4, boolean z) throws XmlPullParserException, IOException {
        long j5;
        long j6;
        ArrayList arrayList;
        Object obj;
        ArrayList arrayList2;
        ArrayList arrayList3;
        long j7;
        long j8;
        dt5 l0;
        ArrayList arrayList4;
        e11 e11 = this;
        XmlPullParser xmlPullParser2 = xmlPullParser;
        Object obj2 = null;
        String attributeValue = xmlPullParser2.getAttributeValue((String) null, "id");
        long M = m15564M(xmlPullParser2, "start", j);
        long j9 = CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED;
        if (j3 != CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED) {
            j5 = j3 + M;
        } else {
            j5 = -9223372036854775807L;
        }
        long M2 = m15564M(xmlPullParser2, "duration", CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED);
        ArrayList arrayList5 = new ArrayList();
        ArrayList arrayList6 = new ArrayList();
        ArrayList arrayList7 = new ArrayList();
        long j10 = j2;
        boolean z2 = false;
        long j11 = -9223372036854775807L;
        dt5 dt5 = null;
        sc1 sc1 = null;
        while (true) {
            xmlPullParser.next();
            if (fp7.m17186f(xmlPullParser2, "BaseURL")) {
                if (!z2) {
                    j10 = e11.mo19030B(xmlPullParser2, j10);
                    z2 = true;
                }
                arrayList7.addAll(e11.mo19031C(xmlPullParser2, list, z));
                arrayList = arrayList6;
                arrayList2 = arrayList7;
                j6 = j9;
                obj = obj2;
                arrayList3 = arrayList5;
            } else {
                List<C3018oz> list2 = list;
                boolean z3 = z;
                if (fp7.m17186f(xmlPullParser2, "AdaptationSet")) {
                    if (!arrayList7.isEmpty()) {
                        arrayList4 = arrayList7;
                    } else {
                        arrayList4 = list2;
                    }
                    j7 = j10;
                    arrayList2 = arrayList7;
                    arrayList3 = arrayList5;
                    arrayList3.add(mo19076y(xmlPullParser, arrayList4, dt5, M2, j10, j11, j5, j4, z));
                    xmlPullParser2 = xmlPullParser;
                    arrayList = arrayList6;
                } else {
                    j7 = j10;
                    ArrayList arrayList8 = arrayList6;
                    arrayList2 = arrayList7;
                    arrayList3 = arrayList5;
                    xmlPullParser2 = xmlPullParser;
                    if (fp7.m17186f(xmlPullParser2, "EventStream")) {
                        ArrayList arrayList9 = arrayList8;
                        arrayList9.add(mo19036Q(xmlPullParser));
                        arrayList = arrayList9;
                    } else {
                        ArrayList arrayList10 = arrayList8;
                        if (fp7.m17186f(xmlPullParser2, "SegmentBase")) {
                            arrayList = arrayList10;
                            dt5 = mo19058j0(xmlPullParser2, (dt5.C2201e) null);
                            obj = null;
                            j10 = j7;
                            j6 = CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED;
                        } else {
                            arrayList = arrayList10;
                            if (fp7.m17186f(xmlPullParser2, "SegmentList")) {
                                long B = mo19030B(xmlPullParser2, CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED);
                                obj = null;
                                l0 = mo19060k0(xmlPullParser, (dt5.C2198b) null, j5, M2, j7, B, j4);
                                j11 = B;
                                j10 = j7;
                                j6 = CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED;
                            } else {
                                obj = null;
                                if (fp7.m17186f(xmlPullParser2, "SegmentTemplate")) {
                                    long B2 = mo19030B(xmlPullParser2, CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED);
                                    j6 = -9223372036854775807L;
                                    l0 = mo19062l0(xmlPullParser, (dt5.C2199c) null, ImmutableList.m36627of(), j5, M2, j7, B2, j4);
                                    j11 = B2;
                                    j10 = j7;
                                } else {
                                    j8 = CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED;
                                    if (fp7.m17186f(xmlPullParser2, "AssetIdentifier")) {
                                        sc1 = m15560I(xmlPullParser2, "AssetIdentifier");
                                    } else {
                                        m15580w(xmlPullParser);
                                    }
                                    j10 = j7;
                                }
                            }
                            dt5 = l0;
                        }
                    }
                }
                obj = null;
                j8 = CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED;
                j10 = j7;
            }
            if (fp7.m17184d(xmlPullParser2, "Period")) {
                return Pair.create(mo19053h(attributeValue, M, arrayList3, arrayList, sc1), Long.valueOf(M2));
            }
            arrayList5 = arrayList3;
            arrayList7 = arrayList2;
            obj2 = obj;
            arrayList6 = arrayList;
            j9 = j6;
            e11 = this;
        }
    }

    /* renamed from: b */
    public final long mo19041b(List<dt5.C2200d> list, long j, long j2, int i, long j3) {
        int i2;
        if (i >= 0) {
            i2 = i + 1;
        } else {
            i2 = (int) w67.m29366m(j3 - j, j2);
        }
        for (int i3 = 0; i3 < i2; i3++) {
            list.add(mo19063m(j, j2));
            j += j2;
        }
        return j;
    }

    /* renamed from: b0 */
    public String[] mo19042b0(XmlPullParser xmlPullParser, String str, String[] strArr) {
        String attributeValue = xmlPullParser.getAttributeValue((String) null, str);
        if (attributeValue == null) {
            return strArr;
        }
        return attributeValue.split(",");
    }

    /* renamed from: c */
    public C2751lb mo19043c(int i, int i2, List<xd5> list, List<sc1> list2, List<sc1> list3, List<sc1> list4) {
        return new C2751lb(i, i2, list, list2, list3, list4);
    }

    /* renamed from: c0 */
    public lw4 mo19044c0(XmlPullParser xmlPullParser) throws IOException, XmlPullParserException {
        String str = null;
        String r0 = m15575r0(xmlPullParser, "moreInformationURL", (String) null);
        String r02 = m15575r0(xmlPullParser, "lang", (String) null);
        String str2 = null;
        String str3 = null;
        while (true) {
            xmlPullParser.next();
            if (fp7.m17186f(xmlPullParser, "Title")) {
                str = xmlPullParser.nextText();
            } else if (fp7.m17186f(xmlPullParser, "Source")) {
                str2 = xmlPullParser.nextText();
            } else if (fp7.m17186f(xmlPullParser, "Copyright")) {
                str3 = xmlPullParser.nextText();
            } else {
                m15580w(xmlPullParser);
            }
            String str4 = str3;
            if (fp7.m17184d(xmlPullParser, "ProgramInformation")) {
                return new lw4(str, str2, str4, r0, r02);
            }
            str3 = str4;
        }
    }

    /* renamed from: d */
    public EventMessage mo19045d(String str, String str2, long j, long j2, byte[] bArr) {
        return new EventMessage(str, str2, j2, j, bArr);
    }

    /* renamed from: d0 */
    public b75 mo19046d0(XmlPullParser xmlPullParser, String str, String str2) {
        long j;
        long j2;
        String attributeValue = xmlPullParser.getAttributeValue((String) null, str);
        String attributeValue2 = xmlPullParser.getAttributeValue((String) null, str2);
        if (attributeValue2 != null) {
            String[] split = attributeValue2.split("-");
            j2 = Long.parseLong(split[0]);
            if (split.length == 2) {
                j = (Long.parseLong(split[1]) - j2) + 1;
                return mo19055i(attributeValue, j2, j);
            }
        } else {
            j2 = 0;
        }
        j = -1;
        return mo19055i(attributeValue, j2, j);
    }

    /* renamed from: e */
    public ju1 mo19047e(String str, String str2, long j, long[] jArr, EventMessage[] eventMessageArr) {
        return new ju1(str, str2, j, jArr, eventMessageArr);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r31v0, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r24v4, resolved type: dt5$e} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r31v3, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r31v4, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r31v5, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r31v6, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r31v7, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r31v8, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r31v9, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r31v10, resolved type: java.util.ArrayList} */
    /* JADX WARNING: type inference failed for: r31v1 */
    /* JADX WARNING: type inference failed for: r31v2 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x01ee A[LOOP:0: B:1:0x006a->B:53:0x01ee, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0198 A[EDGE_INSN: B:54:0x0198->B:45:0x0198 ?: BREAK  , SYNTHETIC] */
    /* renamed from: e0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public p000.e11.C2209a mo19048e0(org.xmlpull.v1.XmlPullParser r36, java.util.List<p000.C3018oz> r37, java.lang.String r38, java.lang.String r39, int r40, int r41, float r42, int r43, int r44, java.lang.String r45, java.util.List<p000.sc1> r46, java.util.List<p000.sc1> r47, java.util.List<p000.sc1> r48, java.util.List<p000.sc1> r49, p000.dt5 r50, long r51, long r53, long r55, long r57, long r59, boolean r61) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            r35 = this;
            r15 = r35
            r14 = r36
            r0 = 0
            java.lang.String r1 = "id"
            java.lang.String r16 = r14.getAttributeValue(r0, r1)
            java.lang.String r1 = "bandwidth"
            r2 = -1
            int r17 = m15568U(r14, r1, r2)
            java.lang.String r1 = "mimeType"
            r2 = r38
            java.lang.String r18 = m15575r0(r14, r1, r2)
            java.lang.String r1 = "codecs"
            r2 = r39
            java.lang.String r19 = m15575r0(r14, r1, r2)
            java.lang.String r1 = "width"
            r2 = r40
            int r20 = m15568U(r14, r1, r2)
            java.lang.String r1 = "height"
            r2 = r41
            int r21 = m15568U(r14, r1, r2)
            r1 = r42
            float r22 = m15567S(r14, r1)
            java.lang.String r1 = "audioSamplingRate"
            r2 = r44
            int r23 = m15568U(r14, r1, r2)
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            java.util.ArrayList r12 = new java.util.ArrayList
            r1 = r48
            r12.<init>(r1)
            java.util.ArrayList r9 = new java.util.ArrayList
            r10 = r49
            r9.<init>(r10)
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            r1 = 0
            r24 = r43
            r5 = r55
            r25 = r0
            r26 = r1
            r0 = r50
            r1 = r57
        L_0x006a:
            r36.next()
            java.lang.String r3 = "BaseURL"
            boolean r3 = p000.fp7.m17186f(r14, r3)
            if (r3 == 0) goto L_0x0090
            if (r26 != 0) goto L_0x007d
            long r5 = r15.mo19030B(r14, r5)
            r26 = 1
        L_0x007d:
            r8 = r37
            r3 = r61
            java.util.List r4 = r15.mo19031C(r14, r8, r3)
            r7.addAll(r4)
        L_0x0088:
            r31 = r7
            r15 = r13
            r7 = r24
            r24 = r0
            goto L_0x00a6
        L_0x0090:
            r8 = r37
            r3 = r61
            java.lang.String r4 = "AudioChannelConfiguration"
            boolean r4 = p000.fp7.m17186f(r14, r4)
            if (r4 == 0) goto L_0x00aa
            int r4 = r35.mo19029A(r36)
            r24 = r0
            r31 = r7
            r15 = r13
            r7 = r4
        L_0x00a6:
            r13 = r11
            r11 = r9
            goto L_0x0190
        L_0x00aa:
            java.lang.String r4 = "SegmentBase"
            boolean r4 = p000.fp7.m17186f(r14, r4)
            if (r4 == 0) goto L_0x00b9
            dt5$e r0 = (p000.dt5.C2201e) r0
            dt5$e r0 = r15.mo19058j0(r14, r0)
            goto L_0x0088
        L_0x00b9:
            java.lang.String r4 = "SegmentList"
            boolean r4 = p000.fp7.m17186f(r14, r4)
            if (r4 == 0) goto L_0x00f5
            long r27 = r15.mo19030B(r14, r1)
            r2 = r0
            dt5$b r2 = (p000.dt5.C2198b) r2
            r0 = r35
            r1 = r36
            r3 = r51
            r29 = r5
            r5 = r53
            r31 = r7
            r7 = r29
            r32 = r9
            r9 = r27
            r33 = r11
            r34 = r12
            r11 = r59
            dt5$b r0 = r0.mo19060k0(r1, r2, r3, r5, r7, r9, r11)
            r15 = r13
        L_0x00e5:
            r7 = r24
            r1 = r27
        L_0x00e9:
            r5 = r29
            r11 = r32
            r13 = r33
            r12 = r34
        L_0x00f1:
            r24 = r0
            goto L_0x0190
        L_0x00f5:
            r29 = r5
            r31 = r7
            r32 = r9
            r33 = r11
            r34 = r12
            java.lang.String r3 = "SegmentTemplate"
            boolean r3 = p000.fp7.m17186f(r14, r3)
            if (r3 == 0) goto L_0x0124
            long r27 = r15.mo19030B(r14, r1)
            r2 = r0
            dt5$c r2 = (p000.dt5.C2199c) r2
            r0 = r35
            r1 = r36
            r3 = r49
            r4 = r51
            r6 = r53
            r8 = r29
            r10 = r27
            r15 = r13
            r12 = r59
            dt5$c r0 = r0.mo19062l0(r1, r2, r3, r4, r6, r8, r10, r12)
            goto L_0x00e5
        L_0x0124:
            r15 = r13
            java.lang.String r3 = "ContentProtection"
            boolean r3 = p000.fp7.m17186f(r14, r3)
            if (r3 == 0) goto L_0x0145
            android.util.Pair r3 = r35.mo19032F(r36)
            java.lang.Object r4 = r3.first
            if (r4 == 0) goto L_0x0139
            r25 = r4
            java.lang.String r25 = (java.lang.String) r25
        L_0x0139:
            java.lang.Object r3 = r3.second
            if (r3 == 0) goto L_0x0142
            androidx.media3.common.DrmInitData$SchemeData r3 = (androidx.media3.common.DrmInitData.SchemeData) r3
            r15.add(r3)
        L_0x0142:
            r7 = r24
            goto L_0x00e9
        L_0x0145:
            java.lang.String r3 = "InbandEventStream"
            boolean r4 = p000.fp7.m17186f(r14, r3)
            if (r4 == 0) goto L_0x015b
            sc1 r3 = m15560I(r14, r3)
            r13 = r33
            r13.add(r3)
            r11 = r32
            r12 = r34
            goto L_0x018a
        L_0x015b:
            r13 = r33
            java.lang.String r3 = "EssentialProperty"
            boolean r4 = p000.fp7.m17186f(r14, r3)
            if (r4 == 0) goto L_0x0171
            sc1 r3 = m15560I(r14, r3)
            r12 = r34
            r12.add(r3)
            r11 = r32
            goto L_0x018a
        L_0x0171:
            r12 = r34
            java.lang.String r3 = "SupplementalProperty"
            boolean r4 = p000.fp7.m17186f(r14, r3)
            if (r4 == 0) goto L_0x0185
            sc1 r3 = m15560I(r14, r3)
            r11 = r32
            r11.add(r3)
            goto L_0x018a
        L_0x0185:
            r11 = r32
            m15580w(r36)
        L_0x018a:
            r7 = r24
            r5 = r29
            goto L_0x00f1
        L_0x0190:
            java.lang.String r0 = "Representation"
            boolean r0 = p000.fp7.m17184d(r14, r0)
            if (r0 == 0) goto L_0x01ee
            r0 = r35
            r1 = r16
            r2 = r18
            r3 = r20
            r4 = r21
            r5 = r22
            r6 = r7
            r7 = r23
            r8 = r17
            r9 = r45
            r10 = r46
            r27 = r11
            r11 = r47
            r28 = r12
            r12 = r19
            r29 = r13
            r13 = r28
            r14 = r27
            androidx.media3.common.h r0 = r0.mo19049f(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            if (r24 == 0) goto L_0x01c2
            goto L_0x01c9
        L_0x01c2:
            dt5$e r1 = new dt5$e
            r1.<init>()
            r24 = r1
        L_0x01c9:
            e11$a r1 = new e11$a
            boolean r2 = r31.isEmpty()
            if (r2 != 0) goto L_0x01d2
            goto L_0x01d4
        L_0x01d2:
            r31 = r37
        L_0x01d4:
            r2 = -1
            r36 = r1
            r37 = r0
            r38 = r31
            r39 = r24
            r40 = r25
            r41 = r15
            r42 = r29
            r43 = r28
            r44 = r27
            r45 = r2
            r36.<init>(r37, r38, r39, r40, r41, r42, r43, r44, r45)
            return r1
        L_0x01ee:
            r10 = r49
            r9 = r11
            r11 = r13
            r13 = r15
            r0 = r24
            r15 = r35
            r24 = r7
            r7 = r31
            goto L_0x006a
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.e11.mo19048e0(org.xmlpull.v1.XmlPullParser, java.util.List, java.lang.String, java.lang.String, int, int, float, int, int, java.lang.String, java.util.List, java.util.List, java.util.List, java.util.List, dt5, long, long, long, long, long, boolean):e11$a");
    }

    /* renamed from: f */
    public C0792h mo19049f(String str, String str2, int i, int i2, float f, int i3, int i4, int i5, String str3, List<sc1> list, List<sc1> list2, String str4, List<sc1> list3, List<sc1> list4) {
        String str5 = str2;
        int i6 = i;
        int i7 = i2;
        List<sc1> list5 = list;
        String str6 = str4;
        String u = m15579u(str2, str6);
        if ("audio/eac3".equals(u)) {
            u = m15565N(list4);
            if ("audio/eac3-joc".equals(u)) {
                str6 = "ec+3";
            }
        }
        int p0 = mo19069p0(list5);
        String str7 = str;
        C0792h.C0794b V = new C0792h.C0794b().mo6658S(str).mo6650K(str2).mo6670e0(u).mo6648I(str6).mo6665Z(i5).mo6672g0(p0).mo6668c0(mo19056i0(list5) | mo19050f0(list2) | mo19054h0(list3) | mo19054h0(list4)).mo6661V(str3);
        if (vv3.m29143q(u)) {
            V.mo6675j0(i).mo6656Q(i2).mo6655P(f);
        } else if (vv3.m29139m(u)) {
            V.mo6647H(i3).mo6671f0(i4);
        } else if (vv3.m29142p(u)) {
            int i8 = -1;
            if ("application/cea-608".equals(u)) {
                i8 = m15557D(list2);
            } else if ("application/cea-708".equals(u)) {
                i8 = m15558E(list2);
            }
            V.mo6645F(i8);
        } else if (vv3.m29140n(u)) {
            V.mo6675j0(i).mo6656Q(i2);
        }
        return V.mo6644E();
    }

    /* renamed from: f0 */
    public int mo19050f0(List<sc1> list) {
        int t0;
        int i = 0;
        for (int i2 = 0; i2 < list.size(); i2++) {
            sc1 sc1 = list.get(i2);
            if (C5876gr.m44837a("urn:mpeg:dash:role:2011", sc1.f17608a)) {
                t0 = mo19052g0(sc1.f17609b);
            } else if (C5876gr.m44837a("urn:tva:metadata:cs:AudioPurposeCS:2007", sc1.f17608a)) {
                t0 = mo19071t0(sc1.f17609b);
            }
            i |= t0;
        }
        return i;
    }

    /* renamed from: g */
    public d11 mo19051g(long j, long j2, long j3, boolean z, long j4, long j5, long j6, long j7, lw4 lw4, e67 e67, hx5 hx5, Uri uri, List<jn4> list) {
        return new d11(j, j2, j3, z, j4, j5, j6, j7, lw4, e67, hx5, uri, list);
    }

    /* renamed from: g0 */
    public int mo19052g0(String str) {
        if (str == null) {
            return 0;
        }
        char c = 65535;
        switch (str.hashCode()) {
            case -2060497896:
                if (str.equals("subtitle")) {
                    c = 0;
                    break;
                }
                break;
            case -1724546052:
                if (str.equals("description")) {
                    c = 1;
                    break;
                }
                break;
            case -1580883024:
                if (str.equals("enhanced-audio-intelligibility")) {
                    c = 2;
                    break;
                }
                break;
            case -1574842690:
                if (str.equals("forced_subtitle")) {
                    c = 3;
                    break;
                }
                break;
            case -1408024454:
                if (str.equals("alternate")) {
                    c = 4;
                    break;
                }
                break;
            case -1396432756:
                if (str.equals("forced-subtitle")) {
                    c = 5;
                    break;
                }
                break;
            case 99825:
                if (str.equals("dub")) {
                    c = 6;
                    break;
                }
                break;
            case 3343801:
                if (str.equals("main")) {
                    c = 7;
                    break;
                }
                break;
            case 3530173:
                if (str.equals("sign")) {
                    c = 8;
                    break;
                }
                break;
            case 552573414:
                if (str.equals("caption")) {
                    c = 9;
                    break;
                }
                break;
            case 899152809:
                if (str.equals("commentary")) {
                    c = 10;
                    break;
                }
                break;
            case 1629013393:
                if (str.equals("emergency")) {
                    c = 11;
                    break;
                }
                break;
            case 1855372047:
                if (str.equals("supplementary")) {
                    c = 12;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
            case 3:
            case 5:
                return 128;
            case 1:
                return RecyclerView.C1231a0.FLAG_ADAPTER_POSITION_UNKNOWN;
            case 2:
                return 2048;
            case 4:
                return 2;
            case 6:
                return 16;
            case 7:
                return 1;
            case 8:
                return 256;
            case 9:
                return 64;
            case 10:
                return 8;
            case 11:
                return 32;
            case 12:
                return 4;
            default:
                return 0;
        }
    }

    /* renamed from: h */
    public jn4 mo19053h(String str, long j, List<C2751lb> list, List<ju1> list2, sc1 sc1) {
        return new jn4(str, j, list, list2, sc1);
    }

    /* renamed from: h0 */
    public int mo19054h0(List<sc1> list) {
        int i = 0;
        for (int i2 = 0; i2 < list.size(); i2++) {
            if (C5876gr.m44837a("http://dashif.org/guidelines/trickmode", list.get(i2).f17608a)) {
                i |= Http2.INITIAL_MAX_FRAME_SIZE;
            }
        }
        return i;
    }

    /* renamed from: i */
    public b75 mo19055i(String str, long j, long j2) {
        return new b75(str, j, j2);
    }

    /* renamed from: i0 */
    public int mo19056i0(List<sc1> list) {
        int i = 0;
        for (int i2 = 0; i2 < list.size(); i2++) {
            sc1 sc1 = list.get(i2);
            if (C5876gr.m44837a("urn:mpeg:dash:role:2011", sc1.f17608a)) {
                i |= mo19052g0(sc1.f17609b);
            }
        }
        return i;
    }

    /* renamed from: j */
    public xd5 mo19057j(C2209a aVar, String str, String str2, ArrayList<DrmInitData.SchemeData> arrayList, ArrayList<sc1> arrayList2) {
        C0792h.C0794b b = aVar.f11020a.mo6636b();
        if (str != null) {
            b.mo6660U(str);
        }
        String str3 = aVar.f11023d;
        if (str3 != null) {
            str2 = str3;
        }
        ArrayList<DrmInitData.SchemeData> arrayList3 = aVar.f11024e;
        arrayList3.addAll(arrayList);
        if (!arrayList3.isEmpty()) {
            m15574r(arrayList3);
            m15576s(arrayList3);
            b.mo6652M(new DrmInitData(str2, (List<DrmInitData.SchemeData>) arrayList3));
        }
        ArrayList<sc1> arrayList4 = aVar.f11025f;
        arrayList4.addAll(arrayList2);
        return xd5.m30036o(aVar.f11026g, b.mo6644E(), aVar.f11021b, aVar.f11022c, arrayList4, aVar.f11027h, aVar.f11028i, (String) null);
    }

    /* renamed from: j0 */
    public dt5.C2201e mo19058j0(XmlPullParser xmlPullParser, dt5.C2201e eVar) throws XmlPullParserException, IOException {
        long j;
        long j2;
        long j3;
        long j4;
        long j5;
        XmlPullParser xmlPullParser2 = xmlPullParser;
        dt5.C2201e eVar2 = eVar;
        if (eVar2 != null) {
            j = eVar2.f10856b;
        } else {
            j = 1;
        }
        long X = m15570X(xmlPullParser2, "timescale", j);
        long j6 = 0;
        if (eVar2 != null) {
            j2 = eVar2.f10857c;
        } else {
            j2 = 0;
        }
        long X2 = m15570X(xmlPullParser2, "presentationTimeOffset", j2);
        if (eVar2 != null) {
            j3 = eVar2.f10870d;
        } else {
            j3 = 0;
        }
        if (eVar2 != null) {
            j6 = eVar2.f10871e;
        }
        b75 b75 = null;
        String attributeValue = xmlPullParser2.getAttributeValue((String) null, "indexRange");
        if (attributeValue != null) {
            String[] split = attributeValue.split("-");
            long parseLong = Long.parseLong(split[0]);
            j4 = (Long.parseLong(split[1]) - parseLong) + 1;
            j5 = parseLong;
        } else {
            j4 = j6;
            j5 = j3;
        }
        if (eVar2 != null) {
            b75 = eVar2.f10855a;
        }
        do {
            xmlPullParser.next();
            if (fp7.m17186f(xmlPullParser2, "Initialization")) {
                b75 = mo19037T(xmlPullParser);
            } else {
                m15580w(xmlPullParser);
            }
        } while (!fp7.m17184d(xmlPullParser2, "SegmentBase"));
        return mo19065n(b75, X, X2, j5, j4);
    }

    /* renamed from: k */
    public dt5.C2198b mo19059k(b75 b75, long j, long j2, long j3, long j4, List<dt5.C2200d> list, long j5, List<b75> list2, long j6, long j7) {
        return new dt5.C2198b(b75, j, j2, j3, j4, list, j5, list2, w67.m29391y0(j6), w67.m29391y0(j7));
    }

    /* renamed from: k0 */
    public dt5.C2198b mo19060k0(XmlPullParser xmlPullParser, dt5.C2198b bVar, long j, long j2, long j3, long j4, long j5) throws XmlPullParserException, IOException {
        long j6;
        long j7;
        long j8;
        XmlPullParser xmlPullParser2 = xmlPullParser;
        dt5.C2198b bVar2 = bVar;
        long j9 = 1;
        if (bVar2 != null) {
            j6 = bVar2.f10856b;
        } else {
            j6 = 1;
        }
        long X = m15570X(xmlPullParser2, "timescale", j6);
        if (bVar2 != null) {
            j7 = bVar2.f10857c;
        } else {
            j7 = 0;
        }
        long X2 = m15570X(xmlPullParser2, "presentationTimeOffset", j7);
        if (bVar2 != null) {
            j8 = bVar2.f10859e;
        } else {
            j8 = CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED;
        }
        long X3 = m15570X(xmlPullParser2, "duration", j8);
        if (bVar2 != null) {
            j9 = bVar2.f10858d;
        }
        long X4 = m15570X(xmlPullParser2, "startNumber", j9);
        long t = m15578t(j3, j4);
        List<dt5.C2200d> list = null;
        List list2 = null;
        b75 b75 = null;
        do {
            xmlPullParser.next();
            if (fp7.m17186f(xmlPullParser2, "Initialization")) {
                b75 = mo19037T(xmlPullParser);
            } else if (fp7.m17186f(xmlPullParser2, "SegmentTimeline")) {
                list = mo19064m0(xmlPullParser, X, j2);
            } else if (fp7.m17186f(xmlPullParser2, "SegmentURL")) {
                if (list2 == null) {
                    list2 = new ArrayList();
                }
                list2.add(mo19066n0(xmlPullParser));
            } else {
                m15580w(xmlPullParser);
            }
        } while (!fp7.m17184d(xmlPullParser2, "SegmentList"));
        if (bVar2 != null) {
            if (b75 == null) {
                b75 = bVar2.f10855a;
            }
            if (list == null) {
                list = bVar2.f10860f;
            }
            if (list2 == null) {
                list2 = bVar2.f10864j;
            }
        }
        return mo19059k(b75, X, X2, X4, X3, list, t, list2, j5, j);
    }

    /* renamed from: l */
    public dt5.C2199c mo19061l(b75 b75, long j, long j2, long j3, long j4, long j5, List<dt5.C2200d> list, long j6, o57 o57, o57 o572, long j7, long j8) {
        return new dt5.C2199c(b75, j, j2, j3, j4, j5, list, j6, o57, o572, w67.m29391y0(j7), w67.m29391y0(j8));
    }

    /* renamed from: l0 */
    public dt5.C2199c mo19062l0(XmlPullParser xmlPullParser, dt5.C2199c cVar, List<sc1> list, long j, long j2, long j3, long j4, long j5) throws XmlPullParserException, IOException {
        long j6;
        long j7;
        long j8;
        o57 o57;
        o57 o572;
        XmlPullParser xmlPullParser2 = xmlPullParser;
        dt5.C2199c cVar2 = cVar;
        long j9 = 1;
        if (cVar2 != null) {
            j6 = cVar2.f10856b;
        } else {
            j6 = 1;
        }
        long X = m15570X(xmlPullParser2, "timescale", j6);
        if (cVar2 != null) {
            j7 = cVar2.f10857c;
        } else {
            j7 = 0;
        }
        long X2 = m15570X(xmlPullParser2, "presentationTimeOffset", j7);
        if (cVar2 != null) {
            j8 = cVar2.f10859e;
        } else {
            j8 = CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED;
        }
        long X3 = m15570X(xmlPullParser2, "duration", j8);
        if (cVar2 != null) {
            j9 = cVar2.f10858d;
        }
        long X4 = m15570X(xmlPullParser2, "startNumber", j9);
        long W = m15569W(list);
        long t = m15578t(j3, j4);
        List<dt5.C2200d> list2 = null;
        if (cVar2 != null) {
            o57 = cVar2.f10866k;
        } else {
            o57 = null;
        }
        o57 u0 = mo19072u0(xmlPullParser2, "media", o57);
        if (cVar2 != null) {
            o572 = cVar2.f10865j;
        } else {
            o572 = null;
        }
        o57 u02 = mo19072u0(xmlPullParser2, "initialization", o572);
        b75 b75 = null;
        while (true) {
            xmlPullParser.next();
            if (fp7.m17186f(xmlPullParser2, "Initialization")) {
                b75 = mo19037T(xmlPullParser);
            } else if (fp7.m17186f(xmlPullParser2, "SegmentTimeline")) {
                list2 = mo19064m0(xmlPullParser, X, j2);
            } else {
                m15580w(xmlPullParser);
            }
            if (fp7.m17184d(xmlPullParser2, "SegmentTemplate")) {
                break;
            }
        }
        if (cVar2 != null) {
            if (b75 == null) {
                b75 = cVar2.f10855a;
            }
            if (list2 == null) {
                list2 = cVar2.f10860f;
            }
        }
        return mo19061l(b75, X, X2, X4, W, X3, list2, t, u02, u0, j5, j);
    }

    /* renamed from: m */
    public dt5.C2200d mo19063m(long j, long j2) {
        return new dt5.C2200d(j, j2);
    }

    /* renamed from: m0 */
    public List<dt5.C2200d> mo19064m0(XmlPullParser xmlPullParser, long j, long j2) throws XmlPullParserException, IOException {
        XmlPullParser xmlPullParser2 = xmlPullParser;
        ArrayList arrayList = new ArrayList();
        long j3 = 0;
        boolean z = false;
        int i = 0;
        long j4 = -9223372036854775807L;
        do {
            xmlPullParser.next();
            if (fp7.m17186f(xmlPullParser2, "S")) {
                long X = m15570X(xmlPullParser2, "t", CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED);
                if (z) {
                    j3 = mo19041b(arrayList, j3, j4, i, X);
                }
                if (X == CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED) {
                    X = j3;
                }
                j4 = m15570X(xmlPullParser2, "d", CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED);
                i = m15568U(xmlPullParser2, "r", 0);
                z = true;
                j3 = X;
            } else {
                m15580w(xmlPullParser);
            }
        } while (!fp7.m17184d(xmlPullParser2, "SegmentTimeline"));
        if (z) {
            mo19041b(arrayList, j3, j4, i, w67.m29313J0(j2, j, 1000));
        }
        return arrayList;
    }

    /* renamed from: n */
    public dt5.C2201e mo19065n(b75 b75, long j, long j2, long j3, long j4) {
        return new dt5.C2201e(b75, j, j2, j3, j4);
    }

    /* renamed from: n0 */
    public b75 mo19066n0(XmlPullParser xmlPullParser) {
        return mo19046d0(xmlPullParser, "media", "mediaRange");
    }

    /* renamed from: o */
    public e67 mo19067o(String str, String str2) {
        return new e67(str, str2);
    }

    /* renamed from: o0 */
    public int mo19068o0(String str) {
        if (str == null) {
            return 0;
        }
        if (str.equals("forced_subtitle") || str.equals("forced-subtitle")) {
            return 2;
        }
        return 0;
    }

    /* renamed from: p0 */
    public int mo19069p0(List<sc1> list) {
        int i = 0;
        for (int i2 = 0; i2 < list.size(); i2++) {
            sc1 sc1 = list.get(i2);
            if (C5876gr.m44837a("urn:mpeg:dash:role:2011", sc1.f17608a)) {
                i |= mo19068o0(sc1.f17609b);
            }
        }
        return i;
    }

    /* renamed from: q0 */
    public hx5 mo19070q0(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        XmlPullParser xmlPullParser2 = xmlPullParser;
        float f = -3.4028235E38f;
        float f2 = -3.4028235E38f;
        long j = -9223372036854775807L;
        long j2 = -9223372036854775807L;
        long j3 = -9223372036854775807L;
        while (true) {
            xmlPullParser.next();
            if (fp7.m17186f(xmlPullParser2, "Latency")) {
                j = m15570X(xmlPullParser2, "target", CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED);
                j2 = m15570X(xmlPullParser2, "min", CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED);
                j3 = m15570X(xmlPullParser2, "max", CellBase.ID_SYSTEM_MESSAGE_REQUEST_CLOSED);
            } else if (fp7.m17186f(xmlPullParser2, "PlaybackRate")) {
                f = m15566R(xmlPullParser2, "min", -3.4028235E38f);
                f2 = m15566R(xmlPullParser2, "max", -3.4028235E38f);
            }
            long j4 = j;
            long j5 = j2;
            long j6 = j3;
            float f3 = f;
            float f4 = f2;
            if (fp7.m17184d(xmlPullParser2, "ServiceDescription")) {
                return new hx5(j4, j5, j6, f3, f4);
            }
            j = j4;
            j2 = j5;
            j3 = j6;
            f = f3;
            f2 = f4;
        }
    }

    /* renamed from: t0 */
    public int mo19071t0(String str) {
        if (str == null) {
            return 0;
        }
        char c = 65535;
        switch (str.hashCode()) {
            case 49:
                if (str.equals("1")) {
                    c = 0;
                    break;
                }
                break;
            case 50:
                if (str.equals("2")) {
                    c = 1;
                    break;
                }
                break;
            case 51:
                if (str.equals("3")) {
                    c = 2;
                    break;
                }
                break;
            case 52:
                if (str.equals("4")) {
                    c = 3;
                    break;
                }
                break;
            case 54:
                if (str.equals("6")) {
                    c = 4;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return RecyclerView.C1231a0.FLAG_ADAPTER_POSITION_UNKNOWN;
            case 1:
                return 2048;
            case 2:
                return 4;
            case 3:
                return 8;
            case 4:
                return 1;
            default:
                return 0;
        }
    }

    /* renamed from: u0 */
    public o57 mo19072u0(XmlPullParser xmlPullParser, String str, o57 o57) {
        String attributeValue = xmlPullParser.getAttributeValue((String) null, str);
        if (attributeValue != null) {
            return o57.m23683b(attributeValue);
        }
        return o57;
    }

    /* renamed from: v */
    public final boolean mo19073v(String[] strArr) {
        for (String startsWith : strArr) {
            if (startsWith.startsWith("urn:dvb:dash:profile:dvb-dash:")) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: v0 */
    public e67 mo19074v0(XmlPullParser xmlPullParser) {
        return mo19067o(xmlPullParser.getAttributeValue((String) null, "schemeIdUri"), xmlPullParser.getAttributeValue((String) null, "value"));
    }

    /* renamed from: x */
    public d11 mo7217a(Uri uri, InputStream inputStream) throws IOException {
        try {
            XmlPullParser newPullParser = this.f11019a.newPullParser();
            newPullParser.setInput(inputStream, (String) null);
            if (newPullParser.next() == 2 && "MPD".equals(newPullParser.getName())) {
                return mo19039Y(newPullParser, uri);
            }
            throw ParserException.createForMalformedManifest("inputStream does not contain a valid media presentation description", (Throwable) null);
        } catch (XmlPullParserException e) {
            throw ParserException.createForMalformedManifest((String) null, e);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:69:0x030e A[LOOP:0: B:1:0x007c->B:69:0x030e, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x02ce A[EDGE_INSN: B:70:0x02ce->B:63:0x02ce ?: BREAK  , SYNTHETIC] */
    /* renamed from: y */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public p000.C2751lb mo19076y(org.xmlpull.v1.XmlPullParser r55, java.util.List<p000.C3018oz> r56, p000.dt5 r57, long r58, long r60, long r62, long r64, long r66, boolean r68) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            r54 = this;
            r15 = r54
            r14 = r55
            java.lang.String r0 = "id"
            r1 = -1
            int r27 = m15568U(r14, r0, r1)
            int r0 = r54.mo19033G(r55)
            r13 = 0
            java.lang.String r2 = "mimeType"
            java.lang.String r28 = r14.getAttributeValue(r13, r2)
            java.lang.String r2 = "codecs"
            java.lang.String r29 = r14.getAttributeValue(r13, r2)
            java.lang.String r2 = "width"
            int r30 = m15568U(r14, r2, r1)
            java.lang.String r2 = "height"
            int r31 = m15568U(r14, r2, r1)
            r2 = -1082130432(0xffffffffbf800000, float:-1.0)
            float r32 = m15567S(r14, r2)
            java.lang.String r2 = "audioSamplingRate"
            int r33 = m15568U(r14, r2, r1)
            java.lang.String r12 = "lang"
            java.lang.String r2 = r14.getAttributeValue(r13, r12)
            java.lang.String r3 = "label"
            java.lang.String r3 = r14.getAttributeValue(r13, r3)
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r34 = 0
            r35 = r57
            r36 = r0
            r37 = r1
            r38 = r2
            r39 = r3
            r41 = r13
            r40 = r34
            r2 = r60
            r0 = r62
        L_0x007c:
            r55.next()
            java.lang.String r13 = "BaseURL"
            boolean r13 = p000.fp7.m17186f(r14, r13)
            if (r13 == 0) goto L_0x00bb
            if (r40 != 0) goto L_0x008f
            long r2 = r15.mo19030B(r14, r2)
            r40 = 1
        L_0x008f:
            r13 = r56
            r60 = r0
            r17 = r10
            r10 = r68
            java.util.List r0 = r15.mo19031C(r14, r13, r10)
            r4.addAll(r0)
        L_0x009e:
            r0 = r60
            r42 = r2
            r15 = r5
            r45 = r7
            r46 = r8
            r47 = r9
            r49 = r11
            r50 = r12
            r3 = r17
            r51 = r36
            r53 = r38
            r52 = 0
            r36 = r4
            r38 = r6
            goto L_0x02c6
        L_0x00bb:
            r13 = r56
            r60 = r0
            r17 = r10
            r10 = r68
            java.lang.String r0 = "ContentProtection"
            boolean r0 = p000.fp7.m17186f(r14, r0)
            if (r0 == 0) goto L_0x00e1
            android.util.Pair r0 = r54.mo19032F(r55)
            java.lang.Object r1 = r0.first
            if (r1 == 0) goto L_0x00d7
            r41 = r1
            java.lang.String r41 = (java.lang.String) r41
        L_0x00d7:
            java.lang.Object r0 = r0.second
            if (r0 == 0) goto L_0x009e
            androidx.media3.common.DrmInitData$SchemeData r0 = (androidx.media3.common.DrmInitData.SchemeData) r0
            r11.add(r0)
            goto L_0x009e
        L_0x00e1:
            java.lang.String r0 = "ContentComponent"
            boolean r0 = p000.fp7.m17186f(r14, r0)
            if (r0 == 0) goto L_0x011b
            r1 = 0
            java.lang.String r0 = r14.getAttributeValue(r1, r12)
            r15 = r38
            java.lang.String r0 = m15573q(r15, r0)
            int r15 = r54.mo19033G(r55)
            r13 = r36
            int r13 = m15572p(r13, r15)
            r53 = r0
            r52 = r1
            r42 = r2
            r36 = r4
            r15 = r5
            r38 = r6
            r45 = r7
            r46 = r8
            r47 = r9
            r49 = r11
            r50 = r12
            r51 = r13
            r3 = r17
        L_0x0117:
            r0 = r60
            goto L_0x02c6
        L_0x011b:
            r13 = r36
            r15 = r38
            r1 = 0
            java.lang.String r0 = "Role"
            boolean r16 = p000.fp7.m17186f(r14, r0)
            if (r16 == 0) goto L_0x0130
            sc1 r0 = m15560I(r14, r0)
            r8.add(r0)
            goto L_0x013e
        L_0x0130:
            java.lang.String r0 = "AudioChannelConfiguration"
            boolean r0 = p000.fp7.m17186f(r14, r0)
            if (r0 == 0) goto L_0x015b
            int r0 = r54.mo19029A(r55)
            r37 = r0
        L_0x013e:
            r52 = r1
            r42 = r2
            r36 = r4
            r38 = r6
            r45 = r7
            r46 = r8
            r47 = r9
            r49 = r11
            r50 = r12
            r51 = r13
            r53 = r15
            r3 = r17
            r0 = r60
            r15 = r5
            goto L_0x02c6
        L_0x015b:
            java.lang.String r0 = "Accessibility"
            boolean r16 = p000.fp7.m17186f(r14, r0)
            if (r16 == 0) goto L_0x016b
            sc1 r0 = m15560I(r14, r0)
            r9.add(r0)
            goto L_0x013e
        L_0x016b:
            java.lang.String r0 = "EssentialProperty"
            boolean r16 = p000.fp7.m17186f(r14, r0)
            if (r16 == 0) goto L_0x017b
            sc1 r0 = m15560I(r14, r0)
            r7.add(r0)
            goto L_0x013e
        L_0x017b:
            java.lang.String r0 = "SupplementalProperty"
            boolean r16 = p000.fp7.m17186f(r14, r0)
            if (r16 == 0) goto L_0x018b
            sc1 r0 = m15560I(r14, r0)
            r6.add(r0)
            goto L_0x013e
        L_0x018b:
            java.lang.String r0 = "Representation"
            boolean r0 = p000.fp7.m17186f(r14, r0)
            if (r0 == 0) goto L_0x0204
            boolean r0 = r4.isEmpty()
            if (r0 != 0) goto L_0x019c
            r16 = r4
            goto L_0x019e
        L_0x019c:
            r16 = r56
        L_0x019e:
            r0 = r54
            r18 = r1
            r1 = r55
            r42 = r2
            r2 = r16
            r3 = r28
            r36 = r4
            r4 = r29
            r44 = r5
            r5 = r30
            r38 = r6
            r6 = r31
            r45 = r7
            r7 = r32
            r46 = r8
            r8 = r37
            r47 = r9
            r9 = r33
            r48 = r17
            r10 = r15
            r49 = r11
            r11 = r46
            r50 = r12
            r12 = r47
            r51 = r13
            r52 = r18
            r13 = r45
            r14 = r38
            r53 = r15
            r15 = r35
            r16 = r64
            r18 = r58
            r20 = r42
            r22 = r60
            r24 = r66
            r26 = r68
            e11$a r0 = r0.mo19048e0(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r18, r20, r22, r24, r26)
            androidx.media3.common.h r1 = r0.f11020a
            java.lang.String r1 = r1.f4175C
            int r1 = p000.vv3.m29135i(r1)
            r14 = r51
            int r1 = m15572p(r14, r1)
            r15 = r44
            r15.add(r0)
            r14 = r55
            r51 = r1
            r3 = r48
            goto L_0x0117
        L_0x0204:
            r52 = r1
            r42 = r2
            r36 = r4
            r38 = r6
            r45 = r7
            r46 = r8
            r47 = r9
            r49 = r11
            r50 = r12
            r14 = r13
            r53 = r15
            r48 = r17
            r15 = r5
            java.lang.String r0 = "SegmentBase"
            r13 = r55
            boolean r0 = p000.fp7.m17186f(r13, r0)
            if (r0 == 0) goto L_0x023b
            r0 = r35
            dt5$e r0 = (p000.dt5.C2201e) r0
            r11 = r54
            dt5$e r0 = r11.mo19058j0(r13, r0)
            r35 = r0
            r51 = r14
            r3 = r48
            r0 = r60
            r14 = r13
            goto L_0x02c6
        L_0x023b:
            r11 = r54
            java.lang.String r0 = "SegmentList"
            boolean r0 = p000.fp7.m17186f(r13, r0)
            if (r0 == 0) goto L_0x026c
            r0 = r60
            long r16 = r11.mo19030B(r13, r0)
            r2 = r35
            dt5$b r2 = (p000.dt5.C2198b) r2
            r0 = r54
            r1 = r55
            r3 = r64
            r5 = r58
            r7 = r42
            r9 = r16
            r51 = r14
            r14 = r11
            r11 = r66
            dt5$b r0 = r0.mo19060k0(r1, r2, r3, r5, r7, r9, r11)
            r35 = r0
            r14 = r13
        L_0x0267:
            r0 = r16
            r3 = r48
            goto L_0x02c6
        L_0x026c:
            r0 = r60
            r51 = r14
            r14 = r11
            java.lang.String r2 = "SegmentTemplate"
            boolean r2 = p000.fp7.m17186f(r13, r2)
            if (r2 == 0) goto L_0x0299
            long r16 = r14.mo19030B(r13, r0)
            r2 = r35
            dt5$c r2 = (p000.dt5.C2199c) r2
            r0 = r54
            r1 = r55
            r3 = r38
            r4 = r64
            r6 = r58
            r8 = r42
            r10 = r16
            r14 = r13
            r12 = r66
            dt5$c r0 = r0.mo19062l0(r1, r2, r3, r4, r6, r8, r10, r12)
            r35 = r0
            goto L_0x0267
        L_0x0299:
            r14 = r13
            java.lang.String r2 = "InbandEventStream"
            boolean r3 = p000.fp7.m17186f(r14, r2)
            if (r3 == 0) goto L_0x02ac
            sc1 r2 = m15560I(r14, r2)
            r3 = r48
            r3.add(r2)
            goto L_0x02c6
        L_0x02ac:
            r3 = r48
            java.lang.String r2 = "Label"
            boolean r2 = p000.fp7.m17186f(r14, r2)
            if (r2 == 0) goto L_0x02bd
            java.lang.String r2 = r54.mo19038V(r55)
            r39 = r2
            goto L_0x02c6
        L_0x02bd:
            boolean r2 = p000.fp7.m17185e(r55)
            if (r2 == 0) goto L_0x02c6
            r54.mo19077z(r55)
        L_0x02c6:
            java.lang.String r2 = "AdaptationSet"
            boolean r2 = p000.fp7.m17184d(r14, r2)
            if (r2 == 0) goto L_0x030e
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r15.size()
            r0.<init>(r1)
            r1 = r34
        L_0x02d9:
            int r2 = r15.size()
            if (r1 >= r2) goto L_0x02fb
            java.lang.Object r2 = r15.get(r1)
            e11$a r2 = (p000.e11.C2209a) r2
            r55 = r54
            r56 = r2
            r57 = r39
            r58 = r41
            r59 = r49
            r60 = r3
            xd5 r2 = r55.mo19057j(r56, r57, r58, r59, r60)
            r0.add(r2)
            int r1 = r1 + 1
            goto L_0x02d9
        L_0x02fb:
            r55 = r54
            r56 = r27
            r57 = r51
            r58 = r0
            r59 = r47
            r60 = r45
            r61 = r38
            lb r0 = r55.mo19043c(r56, r57, r58, r59, r60, r61)
            return r0
        L_0x030e:
            r10 = r3
            r5 = r15
            r4 = r36
            r6 = r38
            r2 = r42
            r7 = r45
            r8 = r46
            r9 = r47
            r11 = r49
            r12 = r50
            r36 = r51
            r13 = r52
            r38 = r53
            r15 = r54
            goto L_0x007c
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.e11.mo19076y(org.xmlpull.v1.XmlPullParser, java.util.List, dt5, long, long, long, long, long, boolean):lb");
    }

    /* renamed from: z */
    public void mo19077z(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        m15580w(xmlPullParser);
    }
}
