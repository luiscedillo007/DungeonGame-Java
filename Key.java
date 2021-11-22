import java.util.Random;
public class Key {

    public Key[] allKeys;
    
    public Key emptyKey;
    public Key[] emptyInside;

    public int keyId;
    
    public Key(){
        emptyKey = new Key(0);
        emptyInside = new Key[1];
        emptyInside[0] = emptyKey;
    }
  
    public Key(int keyIdIn){
        keyId = keyIdIn;
    }
  
    public void generateKeys(int total){
        Key[] tempKeys = new Key[total];
        for(int i = 0; i < total; i++){
            Key newKey = new Key(1000 + i);
            tempKeys[i] = newKey;
        }
        allKeys = tempKeys;
    }

    public Key getRandomKey(int curDepth){
        
        if(curDepth != 1 && allKeys.length != 0){
            Random rand = new Random();

            int locked = rand.nextInt(4);
            int randKey = rand.nextInt(allKeys.length);

            if(locked == 2) return allKeys[randKey];
        }
        return emptyKey;
    }

    public Key[] getRandomKeysInsideRoom(){
        Random rand = new Random();

        if(allKeys.length > 0){
            
            int howManyKeys = rand.nextInt(allKeys.length);
            Key[] keysInside = new Key[howManyKeys];

            for(int i = 0; i < howManyKeys; i++){
                int randKey = rand.nextInt(allKeys.length);
                keysInside[i] = allKeys[randKey];
            }

            if(howManyKeys == 0){
                keysInside = emptyInside;
            }

            keysInside = removeDuplicates(keysInside);
            return keysInside;
        }
        
        return emptyInside;

    }

    public Key[] removeDuplicates(Key[] oldKeys){
        Node head = null;
        Node aux = null;

        boolean there = false;
        int counter = 0;

        for(int i = 0; i < oldKeys.length; i++){
            there = false;
            if(head == null){
                Key tempKey = oldKeys[i];
                Node tempNode = new Node(tempKey);
                aux = tempNode;
                head = aux;    
                counter++;
            }else{
                Node tempHead = head;
                while(tempHead != null){
                    if(oldKeys[i].keyId == tempHead.dataKey.keyId) there = true;
                    tempHead = tempHead.next;
                }
                if(!there){
                    Key tempKey = oldKeys[i];
                    Node tempNode = new Node(tempKey);
                    aux.next = tempNode;
                    aux = aux.next;
                    counter++;
                }
            }
        }

        Key[] newKeys = new Key[counter];
        for(int i = 0; i < counter; i++){
            newKeys[i] = head.dataKey;
            head = head.next;
        }

        return newKeys;
    }

  
}
  