
public class User {
    
    public Key[] availableKeys;
    public Key[] userKeys;
    
    public User(){

    }

    public void setAvalableKeys(int nkeys){
        availableKeys = new Key[nkeys];
        userKeys = new Key[nkeys];
        for(int i = 0; i < nkeys; i++){
            availableKeys[i] = new Key(1111 + i);
            userKeys[i] = new Key(0);
        }
    }

    public void setUserKey(Key value){
        boolean isThere = false;

        for(int i = 0; i < userKeys.length; i++){
            if(userKeys[i].getKeyId() == value.getKeyId()) isThere = true;
        }
        
        if(isThere == false){
        for(int i = 0; i < userKeys.length; i++){
            if(userKeys[i].getKeyId() == 0){
                userKeys[i] = value;
                i = userKeys.length;
            }

        }
    }
    }

    public Key getKeyFromInventory(Key value){
        for(int i = 0; i < userKeys.length; i++){
            if(userKeys[i] == value) return userKeys[i];
        }
        Key blank = new Key(0);
        return blank;
    }

    public Key[] getAllUserKeys(){
        return userKeys;
    }

    public Key[] getAllGameKeys(){
        return availableKeys;
    }

}
