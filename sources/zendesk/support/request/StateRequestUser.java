package zendesk.support.request;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import zendesk.support.Attachment;
import zendesk.support.User;

class StateRequestUser implements Serializable {
    private final String avatar;

    /* renamed from: id */
    private final long f46883id;
    private final boolean isAgent;
    private final String name;

    public StateRequestUser(String str, String str2, boolean z, long j) {
        this.name = str;
        this.avatar = str2;
        this.isAgent = z;
        this.f46883id = j;
    }

    public static boolean containsAgent(List<StateRequestUser> list) {
        for (StateRequestUser isAgent2 : list) {
            if (isAgent2.isAgent()) {
                return true;
            }
        }
        return false;
    }

    public static List<StateRequestUser> convert(List<User> list) {
        String str;
        ArrayList arrayList = new ArrayList(list.size());
        for (User next : list) {
            if (next.getId() != null) {
                Attachment photo = next.getPhoto();
                if (photo == null || !kb6.m46949b(photo.getContentUrl())) {
                    str = "";
                } else {
                    str = photo.getContentUrl();
                }
                arrayList.add(new StateRequestUser(next.getName(), str, next.isAgent(), next.getId().longValue()));
            }
        }
        return arrayList;
    }

    public String getAvatar() {
        return this.avatar;
    }

    public long getId() {
        return this.f46883id;
    }

    public String getName() {
        return this.name;
    }

    public boolean isAgent() {
        return this.isAgent;
    }
}
