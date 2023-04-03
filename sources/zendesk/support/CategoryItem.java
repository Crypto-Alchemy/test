package zendesk.support;

import com.google.gson.annotations.SerializedName;
import java.util.List;

public class CategoryItem implements HelpItem {
    private boolean expanded = true;
    @SerializedName("id")

    /* renamed from: id */
    private Long f46822id;
    @SerializedName("name")
    private String name;
    @SerializedName("section_count")
    private int sectionCount;
    private List<SectionItem> sections;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Long l = this.f46822id;
        Long l2 = ((CategoryItem) obj).f46822id;
        if (l != null) {
            return l.equals(l2);
        }
        if (l2 == null) {
            return true;
        }
        return false;
    }

    public Long getId() {
        return this.f46822id;
    }

    public String getName() {
        String str = this.name;
        if (str == null) {
            return "";
        }
        return str;
    }

    public Long getParentId() {
        return null;
    }

    public List<SectionItem> getSections() {
        return kj0.m47112c(this.sections);
    }

    public int getViewType() {
        return 1;
    }

    public int hashCode() {
        Long l = this.f46822id;
        if (l != null) {
            return l.hashCode();
        }
        return 0;
    }

    public boolean isExpanded() {
        return this.expanded;
    }

    public boolean setExpanded(boolean z) {
        this.expanded = z;
        return z;
    }

    public void setSections(List<SectionItem> list) {
        this.sections = kj0.m47112c(list);
    }
}
