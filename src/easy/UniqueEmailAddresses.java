package easy;

import java.util.HashSet;
import java.util.Set;

public class UniqueEmailAddresses {
    public int numUniqueEmails(String[] emails) {
       Set<String> set = new HashSet<>();
       for(String email:emails){
           int atIdx = email.indexOf("@");
           int plusIdx = email.indexOf("+");
           String localName = "";
           if(plusIdx>=0) localName = email.substring(0,plusIdx);
           else localName = email.substring(0,atIdx);
           localName = localName.replace(".","")+email.substring(atIdx);
           set.add(localName);
       }
       return set.size();
    }
}
