package p000;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: m53 */
/* compiled from: JsonParserSequence */
public class m53 extends l53 {

    /* renamed from: k */
    public final JsonParser[] f14833k;

    /* renamed from: r */
    public final boolean f14834r;

    /* renamed from: s */
    public int f14835s;

    /* renamed from: x */
    public boolean f14836x;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public m53(boolean z, JsonParser[] jsonParserArr) {
        super(jsonParserArr[0]);
        boolean z2 = false;
        this.f14834r = z;
        if (z && this.f14419g.mo13979o0()) {
            z2 = true;
        }
        this.f14836x = z2;
        this.f14833k = jsonParserArr;
        this.f14835s = 1;
    }

    /* renamed from: f1 */
    public static m53 m22020f1(boolean z, JsonParser jsonParser, JsonParser jsonParser2) {
        boolean z2 = jsonParser instanceof m53;
        if (z2 || (jsonParser2 instanceof m53)) {
            ArrayList arrayList = new ArrayList();
            if (z2) {
                ((m53) jsonParser).mo23046d1(arrayList);
            } else {
                arrayList.add(jsonParser);
            }
            if (jsonParser2 instanceof m53) {
                ((m53) jsonParser2).mo23046d1(arrayList);
            } else {
                arrayList.add(jsonParser2);
            }
            return new m53(z, (JsonParser[]) arrayList.toArray(new JsonParser[arrayList.size()]));
        }
        return new m53(z, new JsonParser[]{jsonParser, jsonParser2});
    }

    /* renamed from: N0 */
    public JsonToken mo13938N0() throws IOException {
        JsonParser jsonParser = this.f14419g;
        if (jsonParser == null) {
            return null;
        }
        if (this.f14836x) {
            this.f14836x = false;
            return jsonParser.mo13965g();
        }
        JsonToken N0 = jsonParser.mo13938N0();
        if (N0 == null) {
            return mo23047g1();
        }
        return N0;
    }

    /* renamed from: c1 */
    public JsonParser mo13959c1() throws IOException {
        if (this.f14419g.mo13965g() != JsonToken.START_OBJECT && this.f14419g.mo13965g() != JsonToken.START_ARRAY) {
            return this;
        }
        int i = 1;
        while (true) {
            JsonToken N0 = mo13938N0();
            if (N0 == null) {
                return this;
            }
            if (N0.isStructStart()) {
                i++;
            } else if (N0.isStructEnd() && i - 1 == 0) {
                return this;
            }
        }
    }

    public void close() throws IOException {
        do {
            this.f14419g.close();
        } while (mo23048h1());
    }

    /* renamed from: d1 */
    public void mo23046d1(List<JsonParser> list) {
        int length = this.f14833k.length;
        for (int i = this.f14835s - 1; i < length; i++) {
            JsonParser jsonParser = this.f14833k[i];
            if (jsonParser instanceof m53) {
                ((m53) jsonParser).mo23046d1(list);
            } else {
                list.add(jsonParser);
            }
        }
    }

    /* renamed from: g1 */
    public JsonToken mo23047g1() throws IOException {
        JsonToken N0;
        do {
            int i = this.f14835s;
            JsonParser[] jsonParserArr = this.f14833k;
            if (i >= jsonParserArr.length) {
                return null;
            }
            this.f14835s = i + 1;
            JsonParser jsonParser = jsonParserArr[i];
            this.f14419g = jsonParser;
            if (this.f14834r && jsonParser.mo13979o0()) {
                return this.f14419g.mo13985v();
            }
            N0 = this.f14419g.mo13938N0();
        } while (N0 == null);
        return N0;
    }

    /* renamed from: h1 */
    public boolean mo23048h1() {
        int i = this.f14835s;
        JsonParser[] jsonParserArr = this.f14833k;
        if (i >= jsonParserArr.length) {
            return false;
        }
        this.f14835s = i + 1;
        this.f14419g = jsonParserArr[i];
        return true;
    }
}
