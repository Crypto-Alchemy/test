package p000;

import com.google.protobuf.ByteString;

/* renamed from: on6 */
/* compiled from: TextFormatEscaper */
public final class on6 {

    /* renamed from: on6$a */
    /* compiled from: TextFormatEscaper */
    public static class C6319a implements C6320b {

        /* renamed from: a */
        public final /* synthetic */ ByteString f32415a;

        public C6319a(ByteString byteString) {
            this.f32415a = byteString;
        }

        /* renamed from: a */
        public byte mo46441a(int i) {
            return this.f32415a.byteAt(i);
        }

        public int size() {
            return this.f32415a.size();
        }
    }

    /* renamed from: on6$b */
    /* compiled from: TextFormatEscaper */
    public interface C6320b {
        /* renamed from: a */
        byte mo46441a(int i);

        int size();
    }

    /* renamed from: a */
    public static String m49364a(C6320b bVar) {
        StringBuilder sb = new StringBuilder(bVar.size());
        for (int i = 0; i < bVar.size(); i++) {
            byte a = bVar.mo46441a(i);
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
    public static String m49365b(ByteString byteString) {
        return m49364a(new C6319a(byteString));
    }

    /* renamed from: c */
    public static String m49366c(String str) {
        return m49365b(ByteString.copyFromUtf8(str));
    }
}
