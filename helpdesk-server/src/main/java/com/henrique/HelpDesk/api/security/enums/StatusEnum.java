package com.henrique.HelpDesk.api.security.enums;

public enum StatusEnum {

    New,
    Assiged,
    Resolved,
    Approved,
    Disapproved,
    Close;

    public static StatusEnum getStatus(String status) {
        switch (status) {
            case "New": return New;
            case "Assiged": return Assiged;
            case "Resolved": return Resolved;
            case "Approved": return Approved;
            case "Disapproved": return Disapproved;
            case "Close": return Close;
            default: return New;
        }
    }

}
