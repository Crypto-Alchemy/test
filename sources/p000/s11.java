package p000;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.format.MatchStrength;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ObjectReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import p000.su2;

/* renamed from: s11 */
/* compiled from: DataFormatReaders */
public class s11 {

    /* renamed from: a */
    public final ObjectReader[] f17426a;

    /* renamed from: b */
    public final MatchStrength f17427b;

    /* renamed from: c */
    public final MatchStrength f17428c;

    /* renamed from: d */
    public final int f17429d;

    /* renamed from: s11$a */
    /* compiled from: DataFormatReaders */
    public static class C3240a extends su2.C3305a {
        public C3240a(InputStream inputStream, byte[] bArr) {
            super(inputStream, bArr);
        }

        /* renamed from: c */
        public C3241b mo25609c(ObjectReader objectReader, MatchStrength matchStrength) {
            InputStream inputStream = this.f17803a;
            byte[] bArr = this.f17804b;
            int i = this.f17805c;
            return new C3241b(inputStream, bArr, i, this.f17806d - i, objectReader, matchStrength);
        }

        public C3240a(byte[] bArr, int i, int i2) {
            super(bArr, i, i2);
        }
    }

    /* renamed from: s11$b */
    /* compiled from: DataFormatReaders */
    public static class C3241b {

        /* renamed from: a */
        public final InputStream f17430a;

        /* renamed from: b */
        public final byte[] f17431b;

        /* renamed from: c */
        public final int f17432c;

        /* renamed from: d */
        public final int f17433d;

        /* renamed from: e */
        public final ObjectReader f17434e;

        /* renamed from: f */
        public final MatchStrength f17435f;

        public C3241b(InputStream inputStream, byte[] bArr, int i, int i2, ObjectReader objectReader, MatchStrength matchStrength) {
            this.f17430a = inputStream;
            this.f17431b = bArr;
            this.f17432c = i;
            this.f17433d = i2;
            this.f17434e = objectReader;
            this.f17435f = matchStrength;
        }

        /* renamed from: a */
        public JsonParser mo25610a() throws IOException {
            ObjectReader objectReader = this.f17434e;
            if (objectReader == null) {
                return null;
            }
            JsonFactory factory = objectReader.getFactory();
            if (this.f17430a == null) {
                return factory.createParser(this.f17431b, this.f17432c, this.f17433d);
            }
            return factory.createParser(mo25611b());
        }

        /* renamed from: b */
        public InputStream mo25611b() {
            if (this.f17430a == null) {
                return new ByteArrayInputStream(this.f17431b, this.f17432c, this.f17433d);
            }
            return new hu3((po2) null, this.f17430a, this.f17431b, this.f17432c, this.f17433d);
        }

        /* renamed from: c */
        public ObjectReader mo25612c() {
            return this.f17434e;
        }

        /* renamed from: d */
        public boolean mo25613d() {
            if (this.f17434e != null) {
                return true;
            }
            return false;
        }
    }

    public s11(ObjectReader... objectReaderArr) {
        this(objectReaderArr, MatchStrength.SOLID_MATCH, MatchStrength.WEAK_MATCH, 64);
    }

    /* renamed from: a */
    public final C3241b mo25603a(C3240a aVar) throws IOException {
        ObjectReader[] objectReaderArr = this.f17426a;
        int length = objectReaderArr.length;
        ObjectReader objectReader = null;
        int i = 0;
        MatchStrength matchStrength = null;
        while (true) {
            if (i >= length) {
                break;
            }
            ObjectReader objectReader2 = objectReaderArr[i];
            aVar.mo25966b();
            MatchStrength hasFormat = objectReader2.getFactory().hasFormat(aVar);
            if (hasFormat != null && hasFormat.ordinal() >= this.f17428c.ordinal() && (objectReader == null || matchStrength.ordinal() < hasFormat.ordinal())) {
                if (hasFormat.ordinal() >= this.f17427b.ordinal()) {
                    objectReader = objectReader2;
                    matchStrength = hasFormat;
                    break;
                }
                objectReader = objectReader2;
                matchStrength = hasFormat;
            }
            i++;
        }
        return aVar.mo25609c(objectReader, matchStrength);
    }

    /* renamed from: b */
    public C3241b mo25604b(InputStream inputStream) throws IOException {
        return mo25603a(new C3240a(inputStream, new byte[this.f17429d]));
    }

    /* renamed from: c */
    public C3241b mo25605c(byte[] bArr, int i, int i2) throws IOException {
        return mo25603a(new C3240a(bArr, i, i2));
    }

    /* renamed from: d */
    public s11 mo25606d(DeserializationConfig deserializationConfig) {
        int length = this.f17426a.length;
        ObjectReader[] objectReaderArr = new ObjectReader[length];
        for (int i = 0; i < length; i++) {
            objectReaderArr[i] = this.f17426a[i].with(deserializationConfig);
        }
        return new s11(objectReaderArr, this.f17427b, this.f17428c, this.f17429d);
    }

    /* renamed from: e */
    public s11 mo25607e(JavaType javaType) {
        int length = this.f17426a.length;
        ObjectReader[] objectReaderArr = new ObjectReader[length];
        for (int i = 0; i < length; i++) {
            objectReaderArr[i] = this.f17426a[i].forType(javaType);
        }
        return new s11(objectReaderArr, this.f17427b, this.f17428c, this.f17429d);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append('[');
        ObjectReader[] objectReaderArr = this.f17426a;
        int length = objectReaderArr.length;
        if (length > 0) {
            sb.append(objectReaderArr[0].getFactory().getFormatName());
            for (int i = 1; i < length; i++) {
                sb.append(", ");
                sb.append(this.f17426a[i].getFactory().getFormatName());
            }
        }
        sb.append(']');
        return sb.toString();
    }

    public s11(ObjectReader[] objectReaderArr, MatchStrength matchStrength, MatchStrength matchStrength2, int i) {
        this.f17426a = objectReaderArr;
        this.f17427b = matchStrength;
        this.f17428c = matchStrength2;
        this.f17429d = i;
    }
}
