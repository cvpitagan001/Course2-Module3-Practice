import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Party {
    private int maxNumOfGuest;
    private int count = 0;
    private String hostName;
    private String[] guestName;
    
    public Party(int num, String host) {
        guestName = new String[num];
        maxNumOfGuest = num;
        hostName = host;
    }

    public void addGuest(String name) {
        List<String> list = new ArrayList<>(Arrays.asList(guestName));
        if(guestName.length == count) {
            System.out.println(name + " cannot come to the party. The guest list is full.");
        } else if (list.contains(name)) {
            System.out.println(name + " is already on the guest list.");
        } else {
            guestName[count] = name;
            count++;
        }
      
    }


    public void printParty() {
        System.out.println("Guest list for " + hostName + "'s party:");
        for(int x = 0; x < guestName.length; x++) {
            System.out.println(guestName[x]);
        }
    }
}