package p000;

import androidx.recyclerview.widget.RecyclerView;
import com.google.zxing.datamatrix.encoder.HighLevelEncoder;
import java.io.PrintStream;
import java.math.BigInteger;
import java.util.Date;
import java.util.Random;

/* renamed from: ow7 */
/* compiled from: pingpongping */
public class ow7 {

    /* renamed from: o */
    public static final BigInteger f16175o = BigInteger.valueOf(0);

    /* renamed from: p */
    public static final BigInteger f16176p = BigInteger.valueOf(1);

    /* renamed from: q */
    public static final BigInteger f16177q = BigInteger.valueOf(4);

    /* renamed from: r */
    public static final BigInteger f16178r = BigInteger.valueOf(5);

    /* renamed from: s */
    public static final BigInteger f16179s = BigInteger.valueOf(6);

    /* renamed from: t */
    public static BigInteger f16180t = BigInteger.valueOf(0);

    /* renamed from: u */
    public static char[] f16181u;

    /* renamed from: v */
    public static String f16182v = "3331826350523954630311241967640951239858294736445361608086460265235096225983933203968500061419285926981287171155562181811253311132720944069446752355550722072540646541099242367017695428891868144180426342560303673050047649325575536678356628163268853184301619108551489143799507230749751313284539962710451153012503469991732518919004376111560492715132988352979816403246299836154209306136382046119628637054794112808035581653351864682935672170538730939963307751519414959213140044324492527775639241487923054459219166863271398472665208668730894374266515826156351847767160333379109315703307795489630821937186650430805236414320111877443611461276760182135837058775318162183952960557414502646346523814650817308641653094213272224663864175066958788046576178422969598329655544232966314206325330912385257831278348375483446261763187682794158803356489788013774805195010271059727551198993486030318095007967113710812986240362715215376495780841639";

    /* renamed from: w */
    public static String f16183w = "3331826350523954630311241967640951239858294736445361608086460265235096225983933203968500061419285926981287171155562181811253311132720944069446752355550722072540646541099242367017695428891868144180426342560303673050047649325575536678356628163268853184301619108551489143799507230749751313284539962710451153012503469991732518919004376111560492715132988352979816403246299836154209306136382046119628637054794112808035581653351864682935672170538730939963307751519414959213140044324492527775639241487923054459219166863271398472665208668730894374266515826156351847767160333379109315703307795489630821937186650430805236414320111877443611461276760182135837058775318162183952960557414502646346523814650817308641653094213272224663864175066958788046576178422969598329655544232966314206325330912385257831278348375483446261763187682794158803356489788013774805195010271059727551198993486030318095007967113710812986240362715215376495765967083";

    /* renamed from: a */
    public int f16184a;

    /* renamed from: b */
    public String f16185b;

    /* renamed from: c */
    public boolean f16186c;

    /* renamed from: d */
    public int f16187d;

    /* renamed from: e */
    public cx7 f16188e;

    /* renamed from: f */
    public qo4 f16189f;

    /* renamed from: g */
    public int f16190g;

    /* renamed from: h */
    public int f16191h;

    /* renamed from: i */
    public byte[] f16192i;

    /* renamed from: j */
    public long f16193j;

    /* renamed from: k */
    public BigInteger f16194k;

    /* renamed from: l */
    public BigInteger f16195l;

    /* renamed from: m */
    public BigInteger f16196m;

    /* renamed from: n */
    public BigInteger f16197n;

    static {
        char[] cArr = new char[90];
        cArr[0] = 1;
        cArr[1] = 'a';
        cArr[2] = 'g';
        cArr[3] = 'B';
        cArr[4] = 'k';
        cArr[5] = 'A';
        cArr[6] = 'G';
        cArr[7] = '0';
        cArr[8] = 'A';
        cArr[9] = 'Y';
        cArr[10] = 'Q';
        cArr[11] = 'B';
        cArr[12] = 'y';
        cArr[13] = 'A';
        cArr[14] = 'H';
        cArr[15] = 'Q';
        cArr[16] = 'A';
        cArr[17] = 'a';
        cArr[18] = 'Q';
        cArr[19] = 'B';
        cArr[20] = 'u';
        cArr[21] = 'A';
        cArr[22] = 'A';
        cArr[23] = ']';
        cArr[24] = ']';
        cArr[26] = 234;
        cArr[27] = 'e';
        cArr[28] = '}';
        cArr[29] = 'o';
        cArr[30] = 129;
        cArr[31] = 'b';
        cArr[32] = 10;
        cArr[33] = 194;
        cArr[34] = '(';
        cArr[35] = 165;
        cArr[36] = 162;
        cArr[37] = 179;
        cArr[38] = 'r';
        cArr[39] = 233;
        cArr[40] = '^';
        cArr[41] = 193;
        cArr[42] = 'g';
        cArr[43] = ')';
        cArr[44] = 194;
        cArr[45] = 242;
        cArr[46] = ':';
        cArr[47] = ':';
        cArr[48] = 136;
        cArr[49] = ',';
        cArr[50] = 132;
        cArr[51] = 'A';
        cArr[52] = 168;
        cArr[53] = 'x';
        cArr[54] = '.';
        cArr[55] = 232;
        cArr[56] = 199;
        cArr[57] = 254;
        cArr[58] = 161;
        cArr[59] = '`';
        cArr[60] = '^';
        cArr[61] = 'T';
        cArr[62] = 201;
        cArr[63] = 165;
        cArr[64] = 31;
        cArr[65] = 127;
        cArr[66] = '>';
        cArr[67] = 'x';
        cArr[68] = 162;
        cArr[69] = 253;
        cArr[70] = 138;
        cArr[71] = 'a';
        cArr[72] = 143;
        cArr[73] = 13;
        cArr[74] = 196;
        cArr[75] = 213;
        cArr[76] = 151;
        cArr[77] = 'y';
        cArr[78] = '_';
        cArr[79] = ',';
        cArr[80] = 'N';
        cArr[81] = 250;
        cArr[82] = 152;
        cArr[83] = 181;
        cArr[84] = 171;
        cArr[85] = 30;
        cArr[86] = '2';
        cArr[87] = 202;
        cArr[88] = 222;
        cArr[89] = HighLevelEncoder.LATCH_TO_BASE256;
        f16181u = cArr;
    }

    public ow7() {
        this.f16184a = 12312;
        this.f16185b = "4.1.13";
        this.f16186c = false;
        this.f16187d = 0;
        this.f16188e = new cx7(true);
        this.f16189f = new qo4();
        this.f16190g = RecyclerView.C1231a0.FLAG_ADAPTER_FULLUPDATE;
        this.f16191h = 768;
        this.f16194k = BigInteger.valueOf(0);
        this.f16195l = BigInteger.valueOf(0);
        this.f16196m = BigInteger.valueOf(0);
        this.f16197n = BigInteger.valueOf(0);
        this.f16193j = 0;
        this.f16189f = new qo4();
    }

    /* renamed from: a */
    public BigInteger[] mo24207a() {
        BigInteger bigInteger;
        BigInteger[] bigIntegerArr = new BigInteger[2];
        this.f16194k = mo24208b();
        if (this.f16187d == 0) {
            BigInteger bigInteger2 = new BigInteger(this.f16191h, new Random(new Date().getTime()));
            BigInteger remainder = bigInteger2.remainder(f16179s);
            BigInteger bigInteger3 = f16176p;
            BigInteger subtract = bigInteger2.subtract(remainder.subtract(bigInteger3));
            if (subtract.remainder(f16178r).compareTo(f16175o) == 0) {
                subtract = subtract.add(f16177q);
            }
            this.f16195l = subtract;
            bigInteger = this.f16195l.modInverse(this.f16194k.subtract(bigInteger3));
            mo24212f(this.f16195l);
            mo24212f(bigInteger);
        } else {
            this.f16195l = new BigInteger("9775946708954075513105450550018683278099002657566007032591109087139915126019509814779461256980775392304629751276791567952192046464423375586795491105751843");
            bigInteger = new BigInteger("50964855539960795901098958607004994025117615179372442973433536261416681314198551964402895305772357403748460032129176867663643586072061211882772054838536476598450232003253410400372227625010273806272462551734434888237388313469925208461646171086915766921109875451538270711018680655277456326315213259015672816949");
        }
        mo24212f(this.f16195l);
        mo24212f(bigInteger);
        this.f16196m = bigInteger;
        bigIntegerArr[0] = bigInteger;
        bigIntegerArr[1] = this.f16195l;
        return bigIntegerArr;
    }

    /* renamed from: b */
    public BigInteger mo24208b() {
        BigInteger valueOf = BigInteger.valueOf(0);
        int i = this.f16190g;
        if (i == 1024) {
            valueOf = new BigInteger("155315526351482395991155996351231807220169644828378937433223838972232518351958838087073321845624756550146945246003790108045940383194773439496051917019892370102341378990113959561895891019716873290512815434724157588460613638202017020672756091067223336194394910765309830876066246480156617492164140095427773547319");
            this.f16191h = 768;
        } else if (i == 2048) {
            valueOf = new BigInteger("23305194876708628772942683712029936077909669703685601536444639373642192961312057628536252556993613535085814978074159499472186948366786511073521042149496833091653927921051971991878417514244523141840390929407035897870051133798325148487490127609979590754317732309227672185636344887595480613978815978023799438712228855016292399124518070073985663909563703587906667969897977595160213407719977739503277175679754624803077227852082230001597232751102744845455251210318774263448932578893084926219730828456570578353097506847447616887558397334732907988224984263418791672177125610795030874376815488104459799035590942083438936294203");
            this.f16191h = 1009;
        } else if (i == 3072) {
            valueOf = new BigInteger(f16182v);
            this.f16191h = 1857;
        }
        this.f16194k = valueOf;
        return valueOf;
    }

    /* renamed from: c */
    public int mo24209c(String str, String str2) {
        return this.f16189f.mo25187a(str, str2);
    }

    /* renamed from: d */
    public BigInteger mo24210d(String str) {
        byte[] bArr;
        BigInteger valueOf = BigInteger.valueOf(0);
        short charAt = (short) ((((byte) str.charAt(0)) >>> 4) & 15);
        try {
            byte[] a = C2540id3.m19559a(C3311sx.m27171a(str));
            int i = 1;
            if (charAt > 0) {
                bArr = new byte[(a.length + 1)];
                bArr[0] = 0;
            } else {
                bArr = new byte[a.length];
                i = 0;
            }
            System.arraycopy(a, 0, bArr, i, a.length);
            return new BigInteger(bArr);
        } catch (Exception e) {
            System.out.println("cotstr(1): " + e.toString());
            return valueOf;
        }
    }

    /* renamed from: e */
    public String mo24211e(BigInteger bigInteger) {
        StringBuffer stringBuffer = new StringBuffer("");
        byte[] byteArray = bigInteger.toByteArray();
        int i = 0;
        if (byteArray[0] == 0) {
            i = 1;
        }
        this.f16193j = 0;
        while (i < byteArray.length) {
            try {
                stringBuffer.append((char) byteArray[i]);
                i++;
            } catch (Exception e) {
                this.f16193j = -2;
                stringBuffer.append("cotstr(1): " + e.toString());
            }
        }
        return stringBuffer.toString();
    }

    /* renamed from: f */
    public String mo24212f(BigInteger bigInteger) {
        StringBuffer stringBuffer = new StringBuffer();
        byte[] byteArray = bigInteger.toByteArray();
        int i = 0;
        if (byteArray[0] == 0) {
            i = 1;
        }
        this.f16193j = 0;
        while (i < byteArray.length) {
            try {
                stringBuffer.append((char) byteArray[i]);
                i++;
            } catch (Exception e) {
                this.f16193j = -2;
                stringBuffer.append("cotstr(1): " + e.toString());
                return stringBuffer.toString();
            }
        }
        return C3311sx.m27174d(stringBuffer.toString());
    }

    /* renamed from: g */
    public String mo24213g(String str) {
        return this.f16189f.mo25188b(str);
    }

    /* renamed from: h */
    public String mo24214h() {
        return mo24211e(this.f16197n);
    }

    /* renamed from: i */
    public final String mo24215i() {
        if (this.f16187d == 0) {
            this.f16192i = C2540id3.m19561c(32);
        } else {
            this.f16192i = new byte[32];
            for (int i = 0; i < 32; i++) {
                this.f16192i[i] = (byte) "abcdefghijklmnopqrstuvwxyz123456".charAt(i);
            }
            PrintStream printStream = System.out;
            printStream.println("getpingData: using test key=" + "abcdefghijklmnopqrstuvwxyz123456");
        }
        if (this.f16194k.compareTo(f16175o) == 0) {
            return " error 4: ";
        }
        try {
            BigInteger bigInteger = new BigInteger(this.f16192i);
            this.f16197n = bigInteger;
            return mo24212f(bigInteger.modPow(this.f16195l, this.f16194k));
        } catch (Exception e) {
            return " error 3: " + e.toString();
        }
    }

    /* renamed from: j */
    public String mo24216j(String str) {
        return mo24212f(mo24210d(str).modPow(this.f16196m, this.f16194k));
    }

    /* renamed from: k */
    public String mo24217k() {
        try {
            String i = mo24215i();
            if (i.compareTo("error") != 0) {
                this.f16188e.mo18375g(this.f16192i);
            }
            return i;
        } catch (Exception e) {
            return "Error State " + e.toString();
        }
    }

    /* renamed from: l */
    public String mo24218l(String str) {
        return this.f16188e.mo18372d(str);
    }
}
