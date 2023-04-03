package p000;

import java.util.List;

/* renamed from: pb6 */
/* compiled from: Strings */
public class pb6 {
    private pb6() {
    }

    public static String capitaliseFirstLetter(String str) {
        if (str == null || str.length() == 0) {
            return str;
        }
        return str.substring(0, 1).toUpperCase() + str.substring(1);
    }

    public static boolean isBlank(String str) {
        if (str == null || str.trim().isEmpty()) {
            return true;
        }
        return false;
    }

    public static boolean isEmpty(String str) {
        if (str == null || str.isEmpty()) {
            return true;
        }
        return false;
    }

    public static String join(List<String> list, String str) {
        if (list == null) {
            return null;
        }
        return mb6.m64291a(str, (CharSequence[]) list.toArray(new String[0]));
    }

    public static String lowercaseFirstLetter(String str) {
        if (str == null || str.length() == 0) {
            return str;
        }
        return str.substring(0, 1).toLowerCase() + str.substring(1);
    }

    public static String repeat(char c, int i) {
        return new String(new char[i]).replace("\u0000", String.valueOf(c));
    }

    public static String toCsv(List<String> list) {
        return join(list, ", ");
    }

    public static String zeros(int i) {
        return repeat('0', i);
    }
}
