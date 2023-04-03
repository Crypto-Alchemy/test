package kotlin.reflect.jvm.internal.impl.renderer;

import kotlin.jvm.internal.DefaultConstructorMarker;
import org.web3j.abi.datatypes.Utf8String;

/* compiled from: DescriptorRenderer.kt */
public enum RenderingFormat {
    ;

    /* compiled from: DescriptorRenderer.kt */
    public static final class HTML extends RenderingFormat {
        public HTML(String str, int i) {
            super(str, i, (DefaultConstructorMarker) null);
        }

        public String escape(String str) {
            vx2.m53591g(str, Utf8String.TYPE_NAME);
            return yb6.m74332I(yb6.m74332I(str, "<", "&lt;", false, 4, (Object) null), ">", "&gt;", false, 4, (Object) null);
        }
    }

    /* compiled from: DescriptorRenderer.kt */
    public static final class PLAIN extends RenderingFormat {
        public PLAIN(String str, int i) {
            super(str, i, (DefaultConstructorMarker) null);
        }

        public String escape(String str) {
            vx2.m53591g(str, Utf8String.TYPE_NAME);
            return str;
        }
    }

    public abstract String escape(String str);
}
