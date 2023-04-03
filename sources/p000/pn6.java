package p000;

import com.google.crypto.tink.shaded.protobuf.ByteString;

/* renamed from: pn6 */
/* compiled from: TextFormatEscaper */
public final class pn6 {

    /* renamed from: pn6$a */
    /* compiled from: TextFormatEscaper */
    public class C6366a implements C6367b {

        /* renamed from: a */
        public final /* synthetic */ ByteString f32749a;

        public C6366a(ByteString byteString) {
            this.f32749a = byteString;
        }

        /* renamed from: a */
        public byte mo46792a(int i) {
            return this.f32749a.byteAt(i);
        }

        public int size() {
            return this.f32749a.size();
        }
    }

    /* renamed from: pn6$b */
    /* compiled from: TextFormatEscaper */
    public interface C6367b {
        /* renamed from: a */
        byte mo46792a(int i);

        int size();
    }

    /* renamed from: a */
    public static String m50021a(C6367b bVar) {
        StringBuilder sb = new StringBuilder(bVar.size());
        for (int i = 0; i < bVar.size(); i++) {
            byte a = bVar.mo46792a(i);
            if (a == 34) {
                sb.append("\\\"");
            } else if (a == 39) {
                sb.append("\\'");
            } else if (a != 92) {
                switch (a) {
                    case 7:
                        sb.append("\\a");
                        break;
                    case 8:
                        sb.append("\\b");
                        break;
                    case 9:
                        sb.append("\\t");
                        break;
                    case 10:
                        sb.append("\\n");
                        break;
                    case 11:
                        sb.append("\\v");
                        break;
                    case 12:
                        sb.append("\\f");
                        break;
                    case 13:
                        sb.append("\\r");
                        break;
                    default:
                        if (a >= 32 && a <= 126) {
                            sb.append((char) a);
                            break;
                        } else {
                            sb.append('\\');
                            sb.append((char) (((a >>> 6) & 3) + 48));
                            sb.append((char) (((a >>> 3) & 7) + 48));
                            sb.append((char) ((a & 7) + 48));
                            break;
                        }
                        break;
                }
            } else {
                sb.append("\\\\");
            }
        }
        return sb.toString();
    }

    /* renamed from: b */
    public static String m50022b(ByteString byteString) {
        return m50021a(new C6366a(byteString));
    }

    /* renamed from: c */
    public static String m50023c(String str) {
        return m50022b(ByteString.copyFromUtf8(str));
    }
}
