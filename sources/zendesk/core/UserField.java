package zendesk.core;

import com.google.gson.annotations.SerializedName;
import java.util.Date;
import java.util.List;

public class UserField {
    private Boolean active;
    private Date createdAt;
    private List<UserFieldOption> customFieldOptions;
    private String description;

    /* renamed from: id */
    private Long f46790id;
    private String key;
    private Long position;
    private String rawDescription;
    private String rawTitle;
    private String regexpForValidation;
    private Boolean system;
    private String title;
    private Date updatedAt;
    private String url;
    @SerializedName("type")
    private UserFieldType userFieldType;

    public enum UserFieldType {
        Integer,
        Decimal,
        Checkbox,
        Date,
        Text,
        Textarea,
        Dropdown,
        Regexp
    }

    public Date getCreatedAt() {
        if (this.createdAt == null) {
            return null;
        }
        return new Date(this.createdAt.getTime());
    }

    public String getDescription() {
        return this.description;
    }

    public Long getId() {
        return this.f46790id;
    }

    public String getKey() {
        return this.key;
    }

    public Long getPosition() {
        return this.position;
    }

    public String getRawDescription() {
        return this.rawDescription;
    }

    public String getRawTitle() {
        return this.rawTitle;
    }

    public String getRegexpForValidation() {
        return this.regexpForValidation;
    }

    public String getTitle() {
        return this.title;
    }

    public Date getUpdatedAt() {
        if (this.updatedAt == null) {
            return null;
        }
        return new Date(this.updatedAt.getTime());
    }

    public String getUrl() {
        return this.url;
    }

    public List<UserFieldOption> getUserFieldOptions() {
        return kj0.m47112c(this.customFieldOptions);
    }

    public UserFieldType getUserFieldType() {
        return this.userFieldType;
    }

    public boolean isActive() {
        Boolean bool = this.active;
        if (bool == null || !bool.booleanValue()) {
            return false;
        }
        return true;
    }

    public boolean isSystem() {
        Boolean bool = this.system;
        if (bool == null || !bool.booleanValue()) {
            return false;
        }
        return true;
    }
}
