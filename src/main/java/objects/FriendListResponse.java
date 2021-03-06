package objects;

import java.util.LinkedList;

public class FriendListResponse {
    private String email;
    private LinkedList<Friend> friends;
    private boolean friendsListSuccess;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LinkedList<Friend> getFriends() {
        return friends;
    }

    public void setFriends(LinkedList<Friend> friends) {
        this.friends = friends;
    }

    public boolean isFriendsListSuccess() {
        return friendsListSuccess;
    }

    public void setFriendsListSuccess(boolean friendsListSuccess) {
        this.friendsListSuccess = friendsListSuccess;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        FriendListResponse that = (FriendListResponse) obj;

        if (friendsListSuccess != that.friendsListSuccess) {
            return false;
        }
        if (email != null ? !email.equals(that.email) : that.email != null) {
            return false;
        }
        return friends != null ? friends.equals(that.friends) : that.friends == null;
    }
}
