package FaisalMemon.CollectionsFramework.Poject;

import java.util.Set;

public class Users {
    private String names;
    private boolean isActive;
    private Set<String> roles;

    Users(String names, boolean isActive, Set<String> roles) {
        this.names = names;
        this.isActive = isActive;
        this.roles = roles;
    }

    public String getNames() {
        return names;
    }

    public boolean isActive() {
        return isActive;
    }

    public Set<String> getRoles() {
        return roles;
    }
}
