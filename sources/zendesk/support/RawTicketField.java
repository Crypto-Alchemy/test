package zendesk.support;

import com.google.gson.annotations.SerializedName;
import java.util.Date;
import java.util.List;

class RawTicketField {
    private long accountId;
    @SerializedName("isActive")
    private boolean active;
    @SerializedName("isCollapsedForAgents")
    private boolean collapsedForAgents;
    private Date createdAt;
    private List<RawTicketFieldOption> customFieldOptions;
    private String defaultContentKey;
    private String description;
    @SerializedName("isEditableInPortal")
    private boolean editableInPortal;
    @SerializedName("isExportable")
    private boolean exportable;

    /* renamed from: id */
    private long f46830id;
    private int position;
    private String regexpForValidation;
    @SerializedName("isRequired")
    private boolean required;
    @SerializedName("isRequiredInPortal")
    private boolean requiredInPortal;
    private long subTypeId;
    private List<RawTicketFieldSystemOption> systemFieldOptions;
    private String tag;
    private String title;
    private String titleInPortal;
    private TicketFieldType type;
    private Date updatedAt;
    @SerializedName("isVisibleInPortal")
    private boolean visibleInPortal;

    public List<RawTicketFieldOption> getCustomFieldOptions() {
        return kj0.m47112c(this.customFieldOptions);
    }

    public String getDescription() {
        return this.description;
    }

    public long getId() {
        return this.f46830id;
    }

    public String getRegexpForValidation() {
        return this.regexpForValidation;
    }

    public List<RawTicketFieldSystemOption> getSystemFieldOptions() {
        return kj0.m47112c(this.systemFieldOptions);
    }

    public String getTitle() {
        return this.title;
    }

    public String getTitleInPortal() {
        return this.titleInPortal;
    }

    public TicketFieldType getType() {
        return this.type;
    }
}
