package p000;

import android.util.Base64;
import android.util.JsonReader;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import org.web3j.abi.datatypes.Address;
import org.web3j.ens.contracts.generated.PublicResolver;
import p000.av0;

/* renamed from: iv0 */
/* compiled from: CrashlyticsReportJsonTransform */
public class iv0 {

    /* renamed from: a */
    public static final p11 f30136a = new m43().mo45617j(C6606vt.f35003a).mo45618k(true).mo45616i();

    /* renamed from: iv0$a */
    /* compiled from: CrashlyticsReportJsonTransform */
    public interface C6009a<T> {
        /* renamed from: a */
        T mo41735a(JsonReader jsonReader) throws IOException;
    }

    /* renamed from: A */
    public static av0 m45995A(JsonReader jsonReader) throws IOException {
        av0.C3827b b = av0.m32020b();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            char c = 65535;
            switch (nextName.hashCode()) {
                case -2118372775:
                    if (nextName.equals("ndkPayload")) {
                        c = 0;
                        break;
                    }
                    break;
                case -1962630338:
                    if (nextName.equals("sdkVersion")) {
                        c = 1;
                        break;
                    }
                    break;
                case -911706486:
                    if (nextName.equals("buildVersion")) {
                        c = 2;
                        break;
                    }
                    break;
                case 344431858:
                    if (nextName.equals("gmpAppId")) {
                        c = 3;
                        break;
                    }
                    break;
                case 719853845:
                    if (nextName.equals("installationUuid")) {
                        c = 4;
                        break;
                    }
                    break;
                case 1874684019:
                    if (nextName.equals("platform")) {
                        c = 5;
                        break;
                    }
                    break;
                case 1975623094:
                    if (nextName.equals("displayVersion")) {
                        c = 6;
                        break;
                    }
                    break;
                case 1984987798:
                    if (nextName.equals("session")) {
                        c = 7;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    b.mo29175f(m46020y(jsonReader));
                    break;
                case 1:
                    b.mo29177h(jsonReader.nextString());
                    break;
                case 2:
                    b.mo29171b(jsonReader.nextString());
                    break;
                case 3:
                    b.mo29173d(jsonReader.nextString());
                    break;
                case 4:
                    b.mo29174e(jsonReader.nextString());
                    break;
                case 5:
                    b.mo29176g(jsonReader.nextInt());
                    break;
                case 6:
                    b.mo29172c(jsonReader.nextString());
                    break;
                case 7:
                    b.mo29178i(m45996B(jsonReader));
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return b.mo29170a();
    }

    /* renamed from: B */
    public static av0.C3834e m45996B(JsonReader jsonReader) throws IOException {
        av0.C3834e.C3838b a = av0.C3834e.m32078a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            char c = 65535;
            switch (nextName.hashCode()) {
                case -2128794476:
                    if (nextName.equals("startedAt")) {
                        c = 0;
                        break;
                    }
                    break;
                case -1618432855:
                    if (nextName.equals("identifier")) {
                        c = 1;
                        break;
                    }
                    break;
                case -1606742899:
                    if (nextName.equals("endedAt")) {
                        c = 2;
                        break;
                    }
                    break;
                case -1335157162:
                    if (nextName.equals("device")) {
                        c = 3;
                        break;
                    }
                    break;
                case -1291329255:
                    if (nextName.equals("events")) {
                        c = 4;
                        break;
                    }
                    break;
                case 3556:
                    if (nextName.equals("os")) {
                        c = 5;
                        break;
                    }
                    break;
                case 96801:
                    if (nextName.equals("app")) {
                        c = 6;
                        break;
                    }
                    break;
                case 3599307:
                    if (nextName.equals("user")) {
                        c = 7;
                        break;
                    }
                    break;
                case 286956243:
                    if (nextName.equals("generator")) {
                        c = 8;
                        break;
                    }
                    break;
                case 1025385094:
                    if (nextName.equals("crashed")) {
                        c = 9;
                        break;
                    }
                    break;
                case 2047016109:
                    if (nextName.equals("generatorType")) {
                        c = 10;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    a.mo29235l(jsonReader.nextLong());
                    break;
                case 1:
                    a.mo29233j(Base64.decode(jsonReader.nextString(), 2));
                    break;
                case 2:
                    a.mo29228e(Long.valueOf(jsonReader.nextLong()));
                    break;
                case 3:
                    a.mo29227d(m46008m(jsonReader));
                    break;
                case 4:
                    a.mo29229f(m46006k(jsonReader, new cv0()));
                    break;
                case 5:
                    a.mo29234k(m46021z(jsonReader));
                    break;
                case 6:
                    a.mo29225b(m46004i(jsonReader));
                    break;
                case 7:
                    a.mo29236m(m45997C(jsonReader));
                    break;
                case 8:
                    a.mo29230g(jsonReader.nextString());
                    break;
                case 9:
                    a.mo29226c(jsonReader.nextBoolean());
                    break;
                case 10:
                    a.mo29231h(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return a.mo29224a();
    }

    /* renamed from: C */
    public static av0.C3834e.C3863f m45997C(JsonReader jsonReader) throws IOException {
        av0.C3834e.C3863f.C3864a a = av0.C3834e.C3863f.m32261a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            if (!nextName.equals("identifier")) {
                jsonReader.skipValue();
            } else {
                a.mo29365b(jsonReader.nextString());
            }
        }
        jsonReader.endObject();
        return a.mo29364a();
    }

    /* renamed from: i */
    public static av0.C3834e.C3835a m46004i(JsonReader jsonReader) throws IOException {
        av0.C3834e.C3835a.C3836a a = av0.C3834e.C3835a.m32094a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            char c = 65535;
            switch (nextName.hashCode()) {
                case -1618432855:
                    if (nextName.equals("identifier")) {
                        c = 0;
                        break;
                    }
                    break;
                case -519438642:
                    if (nextName.equals("developmentPlatform")) {
                        c = 1;
                        break;
                    }
                    break;
                case 213652010:
                    if (nextName.equals("developmentPlatformVersion")) {
                        c = 2;
                        break;
                    }
                    break;
                case 351608024:
                    if (nextName.equals("version")) {
                        c = 3;
                        break;
                    }
                    break;
                case 719853845:
                    if (nextName.equals("installationUuid")) {
                        c = 4;
                        break;
                    }
                    break;
                case 1975623094:
                    if (nextName.equals("displayVersion")) {
                        c = 5;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    a.mo29220e(jsonReader.nextString());
                    break;
                case 1:
                    a.mo29217b(jsonReader.nextString());
                    break;
                case 2:
                    a.mo29218c(jsonReader.nextString());
                    break;
                case 3:
                    a.mo29222g(jsonReader.nextString());
                    break;
                case 4:
                    a.mo29221f(jsonReader.nextString());
                    break;
                case 5:
                    a.mo29219d(jsonReader.nextString());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return a.mo29216a();
    }

    /* renamed from: j */
    public static av0.C3825a m46005j(JsonReader jsonReader) throws IOException {
        av0.C3825a.C3826a a = av0.C3825a.m32033a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            char c = 65535;
            switch (nextName.hashCode()) {
                case 110987:
                    if (nextName.equals("pid")) {
                        c = 0;
                        break;
                    }
                    break;
                case 111312:
                    if (nextName.equals("pss")) {
                        c = 1;
                        break;
                    }
                    break;
                case 113234:
                    if (nextName.equals("rss")) {
                        c = 2;
                        break;
                    }
                    break;
                case 55126294:
                    if (nextName.equals("timestamp")) {
                        c = 3;
                        break;
                    }
                    break;
                case 202325402:
                    if (nextName.equals("processName")) {
                        c = 4;
                        break;
                    }
                    break;
                case 722137681:
                    if (nextName.equals("reasonCode")) {
                        c = 5;
                        break;
                    }
                    break;
                case 723857505:
                    if (nextName.equals("traceFile")) {
                        c = 6;
                        break;
                    }
                    break;
                case 2125650548:
                    if (nextName.equals("importance")) {
                        c = 7;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    a.mo29163c(jsonReader.nextInt());
                    break;
                case 1:
                    a.mo29165e(jsonReader.nextLong());
                    break;
                case 2:
                    a.mo29167g(jsonReader.nextLong());
                    break;
                case 3:
                    a.mo29168h(jsonReader.nextLong());
                    break;
                case 4:
                    a.mo29164d(jsonReader.nextString());
                    break;
                case 5:
                    a.mo29166f(jsonReader.nextInt());
                    break;
                case 6:
                    a.mo29169i(jsonReader.nextString());
                    break;
                case 7:
                    a.mo29162b(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return a.mo29161a();
    }

    /* renamed from: k */
    public static <T> ms2<T> m46006k(JsonReader jsonReader, C6009a<T> aVar) throws IOException {
        ArrayList arrayList = new ArrayList();
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            arrayList.add(aVar.mo41735a(jsonReader));
        }
        jsonReader.endArray();
        return ms2.m48439e(arrayList);
    }

    /* renamed from: l */
    public static av0.C3828c m46007l(JsonReader jsonReader) throws IOException {
        av0.C3828c.C3829a a = av0.C3828c.m32060a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            if (nextName.equals("key")) {
                a.mo29182b(jsonReader.nextString());
            } else if (!nextName.equals("value")) {
                jsonReader.skipValue();
            } else {
                a.mo29183c(jsonReader.nextString());
            }
        }
        jsonReader.endObject();
        return a.mo29181a();
    }

    /* renamed from: m */
    public static av0.C3834e.C3839c m46008m(JsonReader jsonReader) throws IOException {
        av0.C3834e.C3839c.C3840a a = av0.C3834e.C3839c.m32123a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            char c = 65535;
            switch (nextName.hashCode()) {
                case -1981332476:
                    if (nextName.equals("simulator")) {
                        c = 0;
                        break;
                    }
                    break;
                case -1969347631:
                    if (nextName.equals("manufacturer")) {
                        c = 1;
                        break;
                    }
                    break;
                case 112670:
                    if (nextName.equals("ram")) {
                        c = 2;
                        break;
                    }
                    break;
                case 3002454:
                    if (nextName.equals("arch")) {
                        c = 3;
                        break;
                    }
                    break;
                case 81784169:
                    if (nextName.equals("diskSpace")) {
                        c = 4;
                        break;
                    }
                    break;
                case 94848180:
                    if (nextName.equals("cores")) {
                        c = 5;
                        break;
                    }
                    break;
                case 104069929:
                    if (nextName.equals("model")) {
                        c = 6;
                        break;
                    }
                    break;
                case 109757585:
                    if (nextName.equals("state")) {
                        c = 7;
                        break;
                    }
                    break;
                case 2078953423:
                    if (nextName.equals("modelClass")) {
                        c = 8;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    a.mo29254i(jsonReader.nextBoolean());
                    break;
                case 1:
                    a.mo29250e(jsonReader.nextString());
                    break;
                case 2:
                    a.mo29253h(jsonReader.nextLong());
                    break;
                case 3:
                    a.mo29247b(jsonReader.nextInt());
                    break;
                case 4:
                    a.mo29249d(jsonReader.nextLong());
                    break;
                case 5:
                    a.mo29248c(jsonReader.nextInt());
                    break;
                case 6:
                    a.mo29251f(jsonReader.nextString());
                    break;
                case 7:
                    a.mo29255j(jsonReader.nextInt());
                    break;
                case 8:
                    a.mo29252g(jsonReader.nextString());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return a.mo29246a();
    }

    /* renamed from: n */
    public static av0.C3834e.C3841d m46009n(JsonReader jsonReader) throws IOException {
        av0.C3834e.C3841d.C3856b a = av0.C3834e.C3841d.m32143a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            char c = 65535;
            switch (nextName.hashCode()) {
                case -1335157162:
                    if (nextName.equals("device")) {
                        c = 0;
                        break;
                    }
                    break;
                case 96801:
                    if (nextName.equals("app")) {
                        c = 1;
                        break;
                    }
                    break;
                case 107332:
                    if (nextName.equals("log")) {
                        c = 2;
                        break;
                    }
                    break;
                case 3575610:
                    if (nextName.equals("type")) {
                        c = 3;
                        break;
                    }
                    break;
                case 55126294:
                    if (nextName.equals("timestamp")) {
                        c = 4;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    a.mo29334c(m46012q(jsonReader));
                    break;
                case 1:
                    a.mo29333b(m46010o(jsonReader));
                    break;
                case 2:
                    a.mo29335d(m46016u(jsonReader));
                    break;
                case 3:
                    a.mo29337f(jsonReader.nextString());
                    break;
                case 4:
                    a.mo29336e(jsonReader.nextLong());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return a.mo29332a();
    }

    /* renamed from: o */
    public static av0.C3834e.C3841d.C3842a m46010o(JsonReader jsonReader) throws IOException {
        av0.C3834e.C3841d.C3842a.C3843a a = av0.C3834e.C3841d.C3842a.m32150a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            char c = 65535;
            switch (nextName.hashCode()) {
                case -1332194002:
                    if (nextName.equals("background")) {
                        c = 0;
                        break;
                    }
                    break;
                case -1090974952:
                    if (nextName.equals("execution")) {
                        c = 1;
                        break;
                    }
                    break;
                case -80231855:
                    if (nextName.equals("internalKeys")) {
                        c = 2;
                        break;
                    }
                    break;
                case 555169704:
                    if (nextName.equals("customAttributes")) {
                        c = 3;
                        break;
                    }
                    break;
                case 928737948:
                    if (nextName.equals("uiOrientation")) {
                        c = 4;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    a.mo29269b(Boolean.valueOf(jsonReader.nextBoolean()));
                    break;
                case 1:
                    a.mo29271d(m46013r(jsonReader));
                    break;
                case 2:
                    a.mo29272e(m46006k(jsonReader, new ev0()));
                    break;
                case 3:
                    a.mo29270c(m46006k(jsonReader, new ev0()));
                    break;
                case 4:
                    a.mo29273f(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return a.mo29268a();
    }

    /* renamed from: p */
    public static av0.C3834e.C3841d.C3842a.C3844b.C3845a m46011p(JsonReader jsonReader) throws IOException {
        av0.C3834e.C3841d.C3842a.C3844b.C3845a.C3846a a = av0.C3834e.C3841d.C3842a.C3844b.C3845a.m32169a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            char c = 65535;
            switch (nextName.hashCode()) {
                case 3373707:
                    if (nextName.equals(PublicResolver.FUNC_NAME)) {
                        c = 0;
                        break;
                    }
                    break;
                case 3530753:
                    if (nextName.equals("size")) {
                        c = 1;
                        break;
                    }
                    break;
                case 3601339:
                    if (nextName.equals(ZendeskIdentityStorage.UUID_KEY)) {
                        c = 2;
                        break;
                    }
                    break;
                case 1153765347:
                    if (nextName.equals("baseAddress")) {
                        c = 3;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    a.mo29286c(jsonReader.nextString());
                    break;
                case 1:
                    a.mo29287d(jsonReader.nextLong());
                    break;
                case 2:
                    a.mo29289f(Base64.decode(jsonReader.nextString(), 2));
                    break;
                case 3:
                    a.mo29285b(jsonReader.nextLong());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return a.mo29284a();
    }

    /* renamed from: q */
    public static av0.C3834e.C3841d.C3857c m46012q(JsonReader jsonReader) throws IOException {
        av0.C3834e.C3841d.C3857c.C3858a a = av0.C3834e.C3841d.C3857c.m32233a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            char c = 65535;
            switch (nextName.hashCode()) {
                case -1708606089:
                    if (nextName.equals("batteryLevel")) {
                        c = 0;
                        break;
                    }
                    break;
                case -1455558134:
                    if (nextName.equals("batteryVelocity")) {
                        c = 1;
                        break;
                    }
                    break;
                case -1439500848:
                    if (nextName.equals("orientation")) {
                        c = 2;
                        break;
                    }
                    break;
                case 279795450:
                    if (nextName.equals("diskUsed")) {
                        c = 3;
                        break;
                    }
                    break;
                case 976541947:
                    if (nextName.equals("ramUsed")) {
                        c = 4;
                        break;
                    }
                    break;
                case 1516795582:
                    if (nextName.equals("proximityOn")) {
                        c = 5;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    a.mo29345b(Double.valueOf(jsonReader.nextDouble()));
                    break;
                case 1:
                    a.mo29346c(jsonReader.nextInt());
                    break;
                case 2:
                    a.mo29348e(jsonReader.nextInt());
                    break;
                case 3:
                    a.mo29347d(jsonReader.nextLong());
                    break;
                case 4:
                    a.mo29350g(jsonReader.nextLong());
                    break;
                case 5:
                    a.mo29349f(jsonReader.nextBoolean());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return a.mo29344a();
    }

    /* renamed from: r */
    public static av0.C3834e.C3841d.C3842a.C3844b m46013r(JsonReader jsonReader) throws IOException {
        av0.C3834e.C3841d.C3842a.C3844b.C3847b a = av0.C3834e.C3841d.C3842a.C3844b.m32163a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            char c = 65535;
            switch (nextName.hashCode()) {
                case -1375141843:
                    if (nextName.equals("appExitInfo")) {
                        c = 0;
                        break;
                    }
                    break;
                case -1337936983:
                    if (nextName.equals("threads")) {
                        c = 1;
                        break;
                    }
                    break;
                case -902467928:
                    if (nextName.equals("signal")) {
                        c = 2;
                        break;
                    }
                    break;
                case 937615455:
                    if (nextName.equals("binaries")) {
                        c = 3;
                        break;
                    }
                    break;
                case 1481625679:
                    if (nextName.equals("exception")) {
                        c = 4;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    a.mo29291b(m46005j(jsonReader));
                    break;
                case 1:
                    a.mo29295f(m46006k(jsonReader, new fv0()));
                    break;
                case 2:
                    a.mo29294e(m46017v(jsonReader));
                    break;
                case 3:
                    a.mo29292c(m46006k(jsonReader, new gv0()));
                    break;
                case 4:
                    a.mo29293d(m46014s(jsonReader));
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return a.mo29290a();
    }

    /* renamed from: s */
    public static av0.C3834e.C3841d.C3842a.C3844b.C3848c m46014s(JsonReader jsonReader) throws IOException {
        av0.C3834e.C3841d.C3842a.C3844b.C3848c.C3849a a = av0.C3834e.C3841d.C3842a.C3844b.C3848c.m32187a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            char c = 65535;
            switch (nextName.hashCode()) {
                case -1266514778:
                    if (nextName.equals("frames")) {
                        c = 0;
                        break;
                    }
                    break;
                case -934964668:
                    if (nextName.equals("reason")) {
                        c = 1;
                        break;
                    }
                    break;
                case 3575610:
                    if (nextName.equals("type")) {
                        c = 2;
                        break;
                    }
                    break;
                case 91997906:
                    if (nextName.equals("causedBy")) {
                        c = 3;
                        break;
                    }
                    break;
                case 581754413:
                    if (nextName.equals("overflowCount")) {
                        c = 4;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    a.mo29303c(m46006k(jsonReader, new hv0()));
                    break;
                case 1:
                    a.mo29305e(jsonReader.nextString());
                    break;
                case 2:
                    a.mo29306f(jsonReader.nextString());
                    break;
                case 3:
                    a.mo29302b(m46014s(jsonReader));
                    break;
                case 4:
                    a.mo29304d(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return a.mo29301a();
    }

    /* renamed from: t */
    public static av0.C3834e.C3841d.C3842a.C3844b.C3852e.C3854b m46015t(JsonReader jsonReader) throws IOException {
        av0.C3834e.C3841d.C3842a.C3844b.C3852e.C3854b.C3855a a = av0.C3834e.C3841d.C3842a.C3844b.C3852e.C3854b.m32215a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            char c = 65535;
            switch (nextName.hashCode()) {
                case -1019779949:
                    if (nextName.equals("offset")) {
                        c = 0;
                        break;
                    }
                    break;
                case -887523944:
                    if (nextName.equals("symbol")) {
                        c = 1;
                        break;
                    }
                    break;
                case 3571:
                    if (nextName.equals("pc")) {
                        c = 2;
                        break;
                    }
                    break;
                case 3143036:
                    if (nextName.equals("file")) {
                        c = 3;
                        break;
                    }
                    break;
                case 2125650548:
                    if (nextName.equals("importance")) {
                        c = 4;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    a.mo29329d(jsonReader.nextLong());
                    break;
                case 1:
                    a.mo29331f(jsonReader.nextString());
                    break;
                case 2:
                    a.mo29330e(jsonReader.nextLong());
                    break;
                case 3:
                    a.mo29327b(jsonReader.nextString());
                    break;
                case 4:
                    a.mo29328c(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return a.mo29326a();
    }

    /* renamed from: u */
    public static av0.C3834e.C3841d.C3859d m46016u(JsonReader jsonReader) throws IOException {
        av0.C3834e.C3841d.C3859d.C3860a a = av0.C3834e.C3841d.C3859d.m32247a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            if (!nextName.equals(PublicResolver.FUNC_CONTENT)) {
                jsonReader.skipValue();
            } else {
                a.mo29353b(jsonReader.nextString());
            }
        }
        jsonReader.endObject();
        return a.mo29352a();
    }

    /* renamed from: v */
    public static av0.C3834e.C3841d.C3842a.C3844b.C3850d m46017v(JsonReader jsonReader) throws IOException {
        av0.C3834e.C3841d.C3842a.C3844b.C3850d.C3851a a = av0.C3834e.C3841d.C3842a.C3844b.C3850d.m32199a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            char c = 65535;
            switch (nextName.hashCode()) {
                case -1147692044:
                    if (nextName.equals(Address.TYPE_NAME)) {
                        c = 0;
                        break;
                    }
                    break;
                case 3059181:
                    if (nextName.equals("code")) {
                        c = 1;
                        break;
                    }
                    break;
                case 3373707:
                    if (nextName.equals(PublicResolver.FUNC_NAME)) {
                        c = 2;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    a.mo29311b(jsonReader.nextLong());
                    break;
                case 1:
                    a.mo29312c(jsonReader.nextString());
                    break;
                case 2:
                    a.mo29313d(jsonReader.nextString());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return a.mo29310a();
    }

    /* renamed from: w */
    public static av0.C3834e.C3841d.C3842a.C3844b.C3852e m46018w(JsonReader jsonReader) throws IOException {
        av0.C3834e.C3841d.C3842a.C3844b.C3852e.C3853a a = av0.C3834e.C3841d.C3842a.C3844b.C3852e.m32207a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            char c = 65535;
            switch (nextName.hashCode()) {
                case -1266514778:
                    if (nextName.equals("frames")) {
                        c = 0;
                        break;
                    }
                    break;
                case 3373707:
                    if (nextName.equals(PublicResolver.FUNC_NAME)) {
                        c = 1;
                        break;
                    }
                    break;
                case 2125650548:
                    if (nextName.equals("importance")) {
                        c = 2;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    a.mo29318b(m46006k(jsonReader, new hv0()));
                    break;
                case 1:
                    a.mo29320d(jsonReader.nextString());
                    break;
                case 2:
                    a.mo29319c(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return a.mo29317a();
    }

    /* renamed from: x */
    public static av0.C3830d.C3832b m46019x(JsonReader jsonReader) throws IOException {
        av0.C3830d.C3832b.C3833a a = av0.C3830d.C3832b.m32072a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            if (nextName.equals("filename")) {
                a.mo29193c(jsonReader.nextString());
            } else if (!nextName.equals("contents")) {
                jsonReader.skipValue();
            } else {
                a.mo29192b(Base64.decode(jsonReader.nextString(), 2));
            }
        }
        jsonReader.endObject();
        return a.mo29191a();
    }

    /* renamed from: y */
    public static av0.C3830d m46020y(JsonReader jsonReader) throws IOException {
        av0.C3830d.C3831a a = av0.C3830d.m32066a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            if (nextName.equals("files")) {
                a.mo29187b(m46006k(jsonReader, new dv0()));
            } else if (!nextName.equals("orgId")) {
                jsonReader.skipValue();
            } else {
                a.mo29188c(jsonReader.nextString());
            }
        }
        jsonReader.endObject();
        return a.mo29186a();
    }

    /* renamed from: z */
    public static av0.C3834e.C3861e m46021z(JsonReader jsonReader) throws IOException {
        av0.C3834e.C3861e.C3862a a = av0.C3834e.C3861e.m32251a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            char c = 65535;
            switch (nextName.hashCode()) {
                case -911706486:
                    if (nextName.equals("buildVersion")) {
                        c = 0;
                        break;
                    }
                    break;
                case -293026577:
                    if (nextName.equals("jailbroken")) {
                        c = 1;
                        break;
                    }
                    break;
                case 351608024:
                    if (nextName.equals("version")) {
                        c = 2;
                        break;
                    }
                    break;
                case 1874684019:
                    if (nextName.equals("platform")) {
                        c = 3;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    a.mo29359b(jsonReader.nextString());
                    break;
                case 1:
                    a.mo29360c(jsonReader.nextBoolean());
                    break;
                case 2:
                    a.mo29362e(jsonReader.nextString());
                    break;
                case 3:
                    a.mo29361d(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return a.mo29358a();
    }

    /* renamed from: D */
    public av0 mo43949D(String str) throws IOException {
        JsonReader jsonReader;
        try {
            jsonReader = new JsonReader(new StringReader(str));
            av0 A = m45995A(jsonReader);
            jsonReader.close();
            return A;
        } catch (IllegalStateException e) {
            throw new IOException(e);
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }

    /* renamed from: E */
    public String mo43950E(av0 av0) {
        return f30136a.mo45621a(av0);
    }

    /* renamed from: g */
    public av0.C3834e.C3841d mo43951g(String str) throws IOException {
        JsonReader jsonReader;
        try {
            jsonReader = new JsonReader(new StringReader(str));
            av0.C3834e.C3841d n = m46009n(jsonReader);
            jsonReader.close();
            return n;
        } catch (IllegalStateException e) {
            throw new IOException(e);
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }

    /* renamed from: h */
    public String mo43952h(av0.C3834e.C3841d dVar) {
        return f30136a.mo45621a(dVar);
    }
}
