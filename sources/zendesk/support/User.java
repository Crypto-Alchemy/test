package zendesk.support;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class User implements Serializable {
    private boolean agent;

    /* renamed from: id */
    private Long f46841id;
    private String name;
    private Long organizationId;
    private Attachment photo;
    private List<String> tags;
    private Map<String, String> userFields;

    public User(Long l, String str, Attachment attachment, boolean z, Long l2, List<String> list, Map<String, String> map) {
        this.f46841id = l;
        this.name = str;
        this.photo = attachment;
        this.agent = z;
        this.organizationId = l2;
        this.tags = list;
        this.userFields = map;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        User user = (User) obj;
        if (this.agent != user.agent) {
            return false;
        }
        Long l = this.f46841id;
        if (l == null ? user.f46841id != null : !l.equals(user.f46841id)) {
            return false;
        }
        Attachment attachment = this.photo;
        if (attachment == null ? user.photo != null : !attachment.equals(user.photo)) {
            return false;
        }
        Long l2 = this.organizationId;
        if (l2 == null ? user.organizationId != null : !l2.equals(user.organizationId)) {
            return false;
        }
        List<String> list = this.tags;
        if (list == null ? user.tags != null : !list.equals(user.tags)) {
            return false;
        }
        Map<String, String> map = this.userFields;
        Map<String, String> map2 = user.userFields;
        if (map != null) {
            return map.equals(map2);
        }
        if (map2 == null) {
            return true;
        }
        return false;
    }

    public Long getId() {
        return this.f46841id;
    }

    public String getName() {
        return this.name;
    }

    public Long getOrganizationId() {
        return this.organizationId;
    }

    public Attachment getPhoto() {
        return this.photo;
    }

    public List<String> getTags() {
        return kj0.m47112c(this.tags);
    }

    public Map<String, String> getUserFields() {
        return kj0.m47113d(this.userFields);
    }

    public int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        Long l = this.f46841id;
        int i5 = 0;
        if (l != null) {
            i = l.hashCode();
        } else {
            i = 0;
        }
        int i6 = i * 31;
        Attachment attachment = this.photo;
        if (attachment != null) {
            i2 = attachment.hashCode();
        } else {
            i2 = 0;
        }
        int i7 = (((i6 + i2) * 31) + (this.agent ? 1 : 0)) * 31;
        Long l2 = this.organizationId;
        if (l2 != null) {
            i3 = l2.hashCode();
        } else {
            i3 = 0;
        }
        int i8 = (i7 + i3) * 31;
        List<String> list = this.tags;
        if (list != null) {
            i4 = list.hashCode();
        } else {
            i4 = 0;
        }
        int i9 = (i8 + i4) * 31;
        Map<String, String> map = this.userFields;
        if (map != null) {
            i5 = map.hashCode();
        }
        return i9 + i5;
    }

    public boolean isAgent() {
        return this.agent;
    }

    public User() {
        this.f46841id = -1L;
        this.name = "";
        this.photo = null;
        this.agent = false;
        this.organizationId = -1L;
        this.tags = new ArrayList();
        this.userFields = new HashMap();
    }
}
