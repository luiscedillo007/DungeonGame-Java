
public class User {
    
    public Key[] availableKeys;
    public Key[] userKeys;
    public String[] availableItems = {"Lucky Charm", "Sword", "Book of spells"};
    public String[] userItems;
    
    public User(){

    }

    public void setAvalableKeys(Key gameKeys, int nkeys){
        availableKeys = gameKeys.allKeys;
        userKeys = new Key[nkeys];
        for(int i = 0; i < nkeys; i++){
            userKeys[i] = new Key(0);
        }
    }

    public void setAvalableItems(){
        userItems = new String[3];
        for(int i = 0; i < availableItems.length; i++){
            userItems[i] = "";
        }
    }

    public void setUserKey(Key value){
        boolean isThere = false;

        for(int i = 0; i < userKeys.length; i++){
            if(userKeys[i].keyId == value.keyId) isThere = true;
        }
        
        if(isThere == false){
        for(int i = 0; i < userKeys.length; i++){
            if(userKeys[i].keyId == 0){
                userKeys[i] = value;
                i = userKeys.length;
            }

        }
    }
    }

    public Key getKeyFromInventory(Key value){
        for(int i = 0; i < userKeys.length; i++){
            if(userKeys[i].keyId == value.keyId) return userKeys[i];
        }
        Key blank = new Key(0);
        return blank;
    }

    public void setUserItem(String value){
        boolean isThere = false;

        for(int i = 0; i < userItems.length; i++){
            if(userItems[i].equals(value)) isThere = true;
        }
        
        if(isThere == false){
        for(int i = 0; i < userItems.length; i++){
            if(userItems[i].equals("")){
                userItems[i] = value;
                i = userItems.length;
            }

        }
    }
    } 

    public String getItemFromInventory(String value){
        for(int i = 0; i < userItems.length; i++){
            if(userItems[i].equals(value)) return userItems[i];
        }
        String blank = "";
        return blank;
    }

    public void addRoomKeysToUser(Room cur){
        
        for(int i = 0; i < cur.keysInside.length; i++){
            this.setUserKey(cur.keysInside[i]);
        }
    
    }

    public Key[] getAllUserKeys(){
        return userKeys;
    }

    public Key[] getAllGameKeys(){
        return availableKeys;
    }

}
