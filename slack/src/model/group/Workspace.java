package model.group;

import model.HasId;
import model.user.Profile;

import java.util.ArrayList;

public class Workspace implements HasId {

    /* attributes */
    private String name; // name of the workspace
    private ArrayList<WorkspaceChannel> workspaceChannels = new ArrayList<>(); // list of the channels of the workspace
    private ArrayList<Profile> members = new ArrayList<>(); // list of the users of the workspace
    private ArrayList<Profile> admins = new ArrayList<>(); // list of the administrators of the workspace
    private ArrayList<Profile> bannedUsers = new ArrayList<>(); // list of the banned users of the workspace

    /* constructors */
    public Workspace(String name){
        this.name = name;
    }

    /* accessors */
    @Override
    public String getId() {
        return name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<WorkspaceChannel> getWorkspaceChannels() {
        return workspaceChannels;
    }

    public void setWorkspaceChannels(ArrayList<WorkspaceChannel> workspaceChannels) {
        this.workspaceChannels = workspaceChannels;
    }

    public ArrayList<Profile> getMembers() {
        return members;
    }

    public void setMembers(ArrayList<Profile> members) {
        this.members = members;
    }

    public ArrayList<Profile> getAdmins() {
        return admins;
    }

    public void setAdmins(ArrayList<Profile> admins) {
        this.admins = admins;
    }

    public ArrayList<Profile> getBannedUsers() {
        return bannedUsers;
    }

    public void setBannedUsers(ArrayList<Profile> bannedUsers) {
        this.bannedUsers = bannedUsers;
    }
}
