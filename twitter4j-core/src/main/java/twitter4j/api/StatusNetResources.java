package twitter4j.api;

import java.util.List;

import twitter4j.Paging;
import twitter4j.ResponseList;
import twitter4j.SNGroup;
import twitter4j.Status;
import twitter4j.TwitterException;
import twitter4j.User;

/**
 * Methods to receive StatusNet groups
 * @author Heiko W. Rupp
 */
public interface StatusNetResources {

    // Group related methods
    /*
    statusnet/groups/timeline	 Shows a group's timeline. Similar to other timeline resources.
statusnet/groups/show	 Show a groups profile.
statusnet/groups/create	 Create a new group.
statusnet/groups/join	 Join a group.
statusnet/groups/leave	 leave a group.
statusnet/groups/list	 Show the groups a given user is a member of.
statusnet/groups/list_all	 List all local groups.
statusnet/groups/membership	 List the members of a given group.
statusnet/groups/is_member	 Determine whether a given user is a member of a given group.
     */

/*
    List<Status> getTimeline(long groupId);

    public void show(long groupId);

    public void join(long groupId);

    public void leave(long groupId);

    public List<SNGroup> list(long userId);

    public List<SNGroup> listAll();

    public List<User> members(long groupId);

    public boolean isMember(long groupId, long userId);

*/
    // Mentions timeline, as the one from twitter uses a different endpoint sub-url
    public ResponseList<Status> getSNMentions(Paging paging) throws TwitterException;


}
